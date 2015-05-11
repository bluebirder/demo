<#macro footer type="">
<#if type == "login">
  <footer class="footer-login">
    <p>© 2013 guomi.com. All rights reserved. 备案号: 浙ICP备12005632号</p>
  </footer>
<#else>
  <footer class="footer clearfix<#if type="register"> footers</#if>">
    <br>
    <p>© 2013 guomi.com. All rights reserved.</p>
    <p>备案号: 浙ICP备12005632号</p>
  </footer>
</#if>
</#macro>
