<#include "common.ftl">
<#include "header.ftl">
<#include "footer.ftl">

<#-- 定义公共 css -->
<#assign globalCss = globalCss + ["base.css"]>

<#-- 定义公共 script -->
<#assign globalScripts = globalScripts + []>

<#-- 包含公共 css、js 资源的页面宏 -->
<#macro simplePage title="未命名" styles="" scripts="" styleMacro="" scriptMacro="" needContainer=true>
<@gmPage metaMacro=metaMacro title=title styles=styles scripts=scripts styleMacro=styleMacro scriptMacro=scriptMacro>
<#if needContainer><div class="container"></#if>
  <#nested>
<#if needContainer></div></#if>
</@gmPage>
</#macro>

<#-- 包含慧学网页页头页尾框架的面宏 -->
<#macro hxPage title="测试" styles="" scripts="" styleMacro="" scriptMacro=""
               useSubNav=false activeNav="index" activeSub="">
<@gmPage metaMacro=metaMacro  title=title styles=styles scripts=scripts
         styleMacro=styleMacro scriptMacro=scriptMacro>
  <@navbar />

<div class="hx-container">
  <@header useSubNav=useSubNav activeNav="${activeNav}" activeSub=activeSub />

  <#nested>

  <@footer />
</div>
</@gmPage>
</#macro>
