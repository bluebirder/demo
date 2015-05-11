<@gm.userPage title="服务器出错了" styles="user/personal.css">
<div class="container">
  <div class="row">
    <div class="span9 syserror-content" style="float: none; margin: 60px auto 0;">
      <h2>出现了一些技术性错误。</h2>
      <p>感谢您的注意——我们将尽快修复并恢复正常</p>
<#if debug?? && debug>
      <h4><a id="stackTraceText" href="javascript:$.gmc.stackTraceSwitch()">显示错误详情</a></h4>
</#if>
    </div>
    <pre id="stackTrace" style="display:none">${(exception.stackTrace?html)!}</pre>
  </div>
  <div style="height: 100px;"></div>
</div>
</@gm.userPage>
