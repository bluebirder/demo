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
<script src="${request.contextPath}/dwr/interface/DwrController.js"></script>
<script>
$(document).ready(function() {
  $(document).on("click", "#find", function() {
    DwrController.find("test", findCallback);
  });

  $(document).on("click", "#save", function() {
    DwrController.save({
    id: "testId", 
    realName: "testName"}, saveCallback);
  });
});

function findCallback(user) {
  if (user) {
    alert("find user 【" + user.id + "】");
  }
}

function saveCallback(success) {
  if (success) {
    alert("保存成功！");
  }
}
</script>
</#macro>
<@gm.simplePage title="dwr测试" styleMacro=styleMacro scriptMacro=scriptMacro>
  <div class="head" style="text-align: center;">
    <h3>dwr - ajax框架</h3>
    <h4>Robin</h4>
    <h4>2013-08-12</h4>
  </div>

  <div class="body">
    <div class="item">
      <div style="text-align: center;">
        <a id="find" href="javascript: void(0);">点击获取</a>
      </div>
      <div style="text-align: center;">
        <a class="foot" id="save" href="javascript: void(0);">点击保存</a>
      </div>
    </div>
  </div>

  <div class="foot" style="margin-top: 50px;">
  </div>
 </@gm.simplePage>