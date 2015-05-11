<#macro styleMacro>
<style>
div {
  font-size: 15px;
}
.item {
  margin-top: 20px;
}
.pointer {
  cursor: pointer;
}
.bigFont {
  font-size: 20px;
}
</style>
</#macro>

<#macro scriptMacro>
<script src="${request.contextPath}/dwr/engine.js"></script>
<script src="${request.contextPath}/dwr/util.js"></script>
<script src="${request.contextPath}/dwr/interface/SeleniumController.js"></script>
<script>
$(document).ready(function() {
  $(document).on("click", "#firefox", function() {
    SeleniumController.firefoxTest(testCallback);
  });

  $(document).on("click", "#chrome", function() {
    SeleniumController.chromeTest(testCallback);
  });

  $(document).on("click", "#ie", function() {
    SeleniumController.ieTest(testCallback);
  });
});

function testCallback(reply) {
}
</script>
</#macro>
<@gm.simplePage title="selenium测试" styleMacro=styleMacro scriptMacro=scriptMacro>
  <div class="head" style="text-align: center;">
    <h3>selenium自动化测试</h3>
    <h4>Robin</h4>
    <h4>2013-08-12</h4>
  </div>

  <div class="body">
    <div class="item">
      <div style="text-align: center;">
        <a id="firefox" href="javascript: void(0);">firefox测试</a>
      </div>
      <div style="text-align: center;">
        <a id="chrome" href="javascript: void(0);">chrome测试</a>
      </div>
      <div style="text-align: center;">
        <a id="ie" href="javascript: void(0);">IE测试</a>
      </div>
    </div>
  </div>

  <div class="foot" style="margin-top: 50px;">
  </div>
 </@gm.simplePage>