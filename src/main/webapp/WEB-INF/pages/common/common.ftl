<#-- GM Freemarker 公共模版 -->

<#-- 定义 assets 路径前缀 -->
<#assign assetsPath = (appSettings.assetsPath)!>
<#if assetsPath = "">
  <#assign assetsPath = request.contextPath>
</#if>

<#-- 公共 css 数组定义 -->
<#assign globalCss = ["jquery-ui.min.css"]>

<#-- 公共 script 数组定义 -->
<#assign globalScripts = ["jquery.min.js", "jquery-ui.min.js", "jquery-ujs.min.js"]>

<#-- 定义 css 的宏 -->
<#macro css src="" prefix="" isLocal=false>
<#if isLocal>
  <#local prefix = "${request.contextPath}/css">
</#if>
<#if prefix == "">
  <#local prefix = "${assetsPath}/css">
</#if>
<#if src?is_string && src != "">
<link rel="stylesheet" href="${prefix}/${src}">
</#if>
<#if src?is_sequence>
  <#list src as s>
<link rel="stylesheet" href="${prefix}/${s}">
  </#list>
</#if>
</#macro>

<#-- 定义 script 的宏 -->
<#macro script src="" prefix="" isLocal=false>
<#if isLocal>
  <#local prefix = "${request.contextPath}/js">
</#if>
<#if prefix == "">
  <#local prefix = "${assetsPath}/js">
</#if>
<#if src?is_string && src != "">
<script src="${prefix}/${src}"></script>
</#if>
<#if src?is_sequence>
  <#list src as s>
<script src="${prefix}/${s}"></script>
  </#list>
</#if>
</#macro>

<#-- html5 框架宏定义 -->
<#macro html>
<!DOCTYPE html>
<html lang="zh-CN">
<#nested>
</html>
</#macro>

<#-- html head 宏定义，默认设置了公共的 css、js -->
<#macro head metaMacro="" title="" styles="" scripts="" styleMacro="" scriptMacro="">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<#-- 添加 meta 宏 -->
<#if metaMacro?is_macro>
  <@metaMacro />
</#if>

<#-- 设置防止 CSRF 攻击的 token -->
<#if csrfToken! != "">
<meta name="csrf-param" content="authenticity_token">
<meta name="csrf-token" content="${csrfToken}">
</#if>

<title>${title!}</title>

<#-- 显示公共样式 -->
<@globalCssMacro />
<@css src=styles />

<#-- 处理 style 宏 -->
<#if styleMacro?is_macro>
  <@styleMacro />
</#if>

<#-- 显示公共脚本 -->
<@globalScriptMacro />
<@script src=scripts />

<#-- 处理 script 宏 -->
<#if scriptMacro?is_macro>
  <@scriptMacro />
</#if>

<#nested>

<#-- 添加网页访问分析 js -->
<@pageTracker />
</head>
</#macro>

<#-- 简单的 html head，默认不设置 css、js -->
<#macro plainHead title="">
<head>
<meta charset="utf-8">
<title>${title!}</title>
<#nested>
</head>
</#macro>

<#-- 公共 css 宏定义 -->
<#macro globalCssMacro>
<#if (appSettings.assetsGlobalCss)! == "" || (appSettings.dev)!false>
<!-- Global css begin -->
  <@css src=globalCss />
<!-- Global css end -->
<#else>
  <@css src="${(appSettings.assetsGlobalCss)!}" />
</#if>

<#-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
<@script src="html5.js" prefix="http://html5shim.googlecode.com/svn/trunk" />
<![endif]-->
</#macro>

<#-- 公共 script 宏定义 -->
<#macro globalScriptMacro>
<script>function getContextPath(){return "${request.contextPath}"}</script>
<#if (appSettings.assetsGlobalJs)! == "" || (appSettings.dev)!false>
<!-- Global scripts begin -->
<@script src=globalScripts />
<!-- Global scripts end -->
<#else>
<@script src="${(appSettings.assetsGlobalJs)!}" />
</#if>
</#macro>

<#-- 网页访问分析 js 宏定义 -->
<#macro pageTracker>
<#if (appSettings.pageTrackerEnable)!false>
<script>
(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

ga('create', '${appSettings.pageTrackerId}', '${appSettings.pageTrackerDomain}');
ga('send', 'pageview');
</script>
</#if>
</#macro>

<#-- 包含公共 css、js 的 html 宏定义 -->
<#macro gmPage metaMacro="" title="未命名" styles="" scripts="" styleMacro="" scriptMacro="">
<@html>
<@head metaMacro=metaMacro title=title styles=styles scripts=scripts styleMacro=styleMacro scriptMacro=scriptMacro />
<body>
  <!--[if lt IE 9]>
  <div class="notice-bar">您的浏览器颇为古老，网站无法很好的支持！其实，您可以有更好的选择：
    <button type="button" class="close" data-dismiss="alert">&times;</button>
    <a href="http://se.360.cn/" target="_blank">360 安全浏览器</a>、
    <a href="http://www.google.com/intl/zh-CN/chrome/browser/" target="_blank">谷歌浏览器</a>、
    <a href="http://firefox.com.cn/" target="_blank">火狐浏览器</a>
  </div>
  <![endif]-->
  <#nested>
</body>
</@html>
</#macro>

<#-- 显示 Action 提示信息（actionError、actionMessage）的宏定义 -->
<#macro messages>
  <div id="messageBox">
  <@showMessage messages=actionWarnings />
  <@showMessage messages=actionErrors cssClass="alert-error" />
  <@showMessage messages=actionInfos cssClass="alert-info" />
  <@showMessage messages=actionMessages cssClass="alert-success" />
  </div>
</#macro>

<#macro showMessage messages=[] cssClass="">
  <#if messages?size != 0>
    <div class="alert alert-block ${cssClass}">
      <button type="button" class="close" data-dismiss="alert">&times;</button>
    <#list messages! as message>
      <#if message_index == 0>
      <ul>
      </#if>
        <li>${message}</li>
      <#if !message_has_next>
      </ul>
      </#if>
    </#list>
    </div>
  </#if>
</#macro>

<#-- 将两个 css/js（单个或者数组） 合并为一个数组的函数 -->
<#function mergeAssets a b>
  <#local retVal=[]>
  <#if a?is_string && a != "">
    <#local retVal=retVal + [a]>
  </#if>
  <#if a?is_sequence>
    <#local retVal=retVal + a>
  </#if>
  <#if b?is_string && b != "">
    <#local retVal=retVal + [b]>
  </#if>
  <#if b?is_sequence>
    <#local retVal=retVal + b>
  </#if>
  <#return retVal>
</#function>
