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
<script>
var muchDoms = "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>"
             + "<div class='none'><span></span></div><div><span></span></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>";
var fewTest = 10000;
var amountTest = 100000;
var mostTest = 500000;
var extremeTest = 5000000;
var forFewTest = 10000000;
var forAmountTest = 100000000;
var forMostTest = 1000000000;
var forExtremeTest = 5000000000;
function f1(x) {
  console.log("f1:" + x);
  if(x == 0) {
    return;
  }
  f1(x - 1);
}
var f2 = function(x) {
  console.log("f2:" + x);
  if(x == 0) {
    return;
  }
  f2(x - 1);
}
var f3 = function f3(x) {
  console.log("f3:" + x);
  if(x == 0) {
    return;
  }
  f3(x - 1);
}
var f4 = function f4F(x) {
  console.log("f4:" + x);
  if(x == 0) {
    return;
  }
  f4(x - 1);
}
var f5 = new Function('x', 'console.log("f5:" + x);if(x == 0) {return;}f5(x - 1);');

function add(a, b) {
  return plus(a) + b;
  
  function plus(a) {
    return a + 1;
  }
}
  
$(document).ready(function() {
  
  //console.log(add(0, 1));
  
  $(document).on("click", "#functionTest", function() {
    f1(10);
    f2(10);
    f3(10);
    f4(10);
    f5(10);
  });
  
  myname = "global"; // global variable
  function func() {
    console.log(myname); // "undefined"
    var myname = "local";
    console.log(myname); // "local"
  }
  
  
  $(document).on("click", "#hoistingTest", function() {
    func();
  });
  
  $(document).on("click", "#for1Test", function() {
    forTimePrint(forFewTest);
    forTimePrint(forAmountTest);
    forTimePrint(forMostTest);
  });
  
  $(document).on("click", "#forInTest", function() {
    var man = {
      hands:2,
      legs:2,
      heads:1
    };

    // somewhere else in the code
    // a method was added to all objects
    if (typeof Object.prototype.clone === 'undefined') {
      Object.prototype.clone = function () {
      };
    }
    
    console.log("1:");
    for (var i in man) {
      console.log(i, ":", man[i]);
    }
    
    console.log("2:");
    for (var i in man) {
      if (man.hasOwnProperty(i)) { // filter
        console.log(i, ":", man[i]);
      }
    }
    
    console.log("3:");
    for (var i in man) {
      if (Object.prototype.hasOwnProperty.call(man, i)) { // filter
        console.log(i, ":", man[i]);
      }
    }
    
    console.log("4:");
    var i, hasOwn = Object.prototype.hasOwnProperty;
    for (i in man) {
      if (hasOwn.call(man, i)) { // filter
        console.log(i, ":", man[i]);
      }
    }
  });
  
  $(document).on("click", "#impliedTest", function() {
    var zero = 0;
    console.log("var zero = 0;");
    if(zero == false) {
      console.log("zero == false");
    } else {
      console.log("zero != false");
    }
    if(zero === false) {
      console.log("zero === false");
    } else {
      console.log("zero !== false");
    }
  });
  
  $(document).on("click", "#parseIntTest", function() {
    var x = +"09";
    console.log("parseInt('09') = " + parseInt('09'));
    console.log("parseInt('09', 10) = " + parseInt('09', 10));
    console.log("parseInt(+'09', 10) = " + parseInt(x, 10));
  });
  
  $(document).on("click", "#undefinedTest", function() {
    console.log(window.undefined==undefined); // true

    var a,b
    console.log(a); // undefined
    console.log(a==undefined); // true
    console.log(b==a); // true
    
    console.log('===============================');
    window.undefined = 'ha';
    console.log(window.undefined==undefined); // true 在脚底版本的IE下 false
    console.log(a==undefined); // true
    undefined=a; // true
    console.log(a==b); // true
    console.log(undefined==b); // true
  });

  $(document).on("click", "#allSelector", function() {
    timePrint("*", fewTest);
    timePrint("*", fewTest, true);
    timePrint("*", amountTest);
    timePrint("*", amountTest, true);
    timePrint("*", mostTest);
    timePrint("*", mostTest, true);
  });
  
  $(document).on("click", "#idSelector", function() {
    timePrint("#idSelector", fewTest);
    timePrint("#idSelector", fewTest, true);
    timePrint("#idSelector", amountTest);
    timePrint("#idSelector", amountTest, true);
    timePrint("#idSelector", mostTest);
    timePrint("#idSelector", mostTest, true);
  });
  
  $(document).on("click", "#targeNameASelector", function() {
    timePrint("a", fewTest);
    timePrint("a", fewTest, true);
    timePrint("a", amountTest);
    timePrint("a", amountTest, true);
    timePrint("a", mostTest);
    timePrint("a", mostTest, true);
  });
  
  $(document).on("click", "#targeNameDivSelector", function() {
    timePrint("div", fewTest);
    timePrint("div", fewTest, true);
    timePrint("div", amountTest);
    timePrint("div", amountTest, true);
    timePrint("div", mostTest);
    timePrint("div", mostTest, true);
  });
  
   $(document).on("click", "#targeNameAndClassSelector", function() {
    timePrint("a.class3", fewTest);
    timePrint("a.class3", fewTest, true);
    timePrint("a.class3", amountTest);
    timePrint("a.class3", amountTest, true);
    timePrint("a.class3", mostTest);
    timePrint("a.class3", mostTest, true);
  });
  
  $(document).on("click", "#classSelector", function() {
    timePrint(".class3", fewTest);
    timePrint(".class3", fewTest, true);
    timePrint(".class3", amountTest);
    timePrint(".class3", amountTest, true);
    timePrint(".class3", mostTest);
    timePrint(".class3", mostTest, true);
  });
  
  $(document).on("click", "#firstSelector", function() {
    timePrint("div:first", fewTest);
    timePrint("div:first", fewTest, true);
    timePrint("div:first", amountTest);
    timePrint("div:first", amountTest, true);
  });
  
  $(document).on("click", "#firstSelector", function() {
    timePrint("div:first", fewTest);
    timePrint("div:first", fewTest, true);
    timePrint("a:first", amountTest);
    timePrint("a:first", amountTest, true);
  });
  
  $(document).on("click", "#lastSelector", function() {
    timePrint("div:last", fewTest);
    timePrint("div:last", fewTest, true);
    timePrint("a:last", amountTest);
    timePrint("a:last", amountTest, true);
  });
  
  $(document).on("click", "#eqSelector", function() {
    timePrint("div:eq(2)", fewTest);
    timePrint("div:eq(2)", fewTest, true);
    timePrint("div:eq(2)", amountTest);
    timePrint("div:eq(2)", amountTest, true);
  });
  
  $(document).on("click", "#checkedSelector", function() {
    timePrint("input:checked", fewTest);
    timePrint("input:checked", fewTest, true);
    timePrint("input:checked", amountTest);
    timePrint("input:checked", amountTest, true);
  });
  
  $(document).on("click", "#hiddenSelector", function() {
    timePrint("a:hidden", fewTest);
    timePrint("a:hidden", fewTest, true);
    timePrint("a:hidden", amountTest);
    timePrint("a:hidden", amountTest, true);
  });
  
  $(document).on("click", "#attributeSelector", function() {
    timePrint("input[name=check]", fewTest);
    timePrint("input[name=check]", fewTest, true);
    timePrint("input[name=check]", amountTest);
    timePrint("input[name=check]", amountTest, true);
  });
  
  $(document).on("click", "#attributeCheckedSelector", function() {
    timePrint("input[name=check]:checked", fewTest);
    timePrint("input[name=check]:checked", fewTest, true);
    timePrint("input[name=check]:checked", amountTest);
    timePrint("input[name=check]:checked", amountTest, true);
  });
  
  $(document).on("click", "#notSelector", function() {
    timePrint("a:not(.abc)", fewTest);
    timePrint("a:not(.abc)", fewTest, true);
    timePrint("a:not(.abc)", amountTest);
    timePrint("a:not(.abc)", amountTest, true);
  });
  
  $("#id#b").click(function() {
    console.log("选择器为: #id#b");
  });
  
  $("#id\\#b").click(function() {
    console.log("选择器为: #id\\\\#b");
  });
  
  $("#id[1]").click(function() {
    console.log("选择器为: #id[1]");
  });
  
  $("#id\\[1\\]").click(function() {
    console.log("选择器为: #id\\\\[1\\\\]");
  });
  
  $(document).on("click", "#blankTest", function() {
    console.log("选择器【\".test :hidden\"】的元素个数：" + $(".test :hidden").length + " (aa, bb, cc, dd)");
    console.log("选择器【\".test:hidden\"】的元素个数：" + $(".test:hidden").length + " (dd, ee, ff)");
    console.log("选择器【\".test .test1\"】的元素个数：" + $(".test .test1").length + " (aa, bb, cc, dd)");
    console.log("选择器【\".test.test1\"】的元素个数：" + $(".test.test1").length + " (dd, ee, ff)");
  });
  
  $(document).on("click", "#sx,#yw,#yy", function() {
    $("#"+$("#subject").val()).removeClass("active");
    $(this).addClass("active");
    $("#subject").val($(this).attr("id"));
    //$("#subForm").submit();
  });
  
  $(document).on("click", "#ztree", function(ele) {
    console.log("用attr()方法获得的data-ztree属性值: " + $(this).attr("data-ztree"));
    console.log("用getAttribute()方法获得的data-ztree属性值: " + this.getAttribute("data-ztree"));
    console.log("用.属性方式获得的data-ztree属性值: " + ele.data-ztree);
  });
});

function forTimePrint(times) {
  var startTime = new Date().getTime();
  for(var i = 0; i < times; i++) {
    var x = 2 * 2 * 2 * 2;
    x++;
  }
  var endTime = new Date().getTime();
  console.log("正序循环 " + times + " 次所需时间为：" + (endTime - startTime) + " ms.");
  var startTime = new Date().getTime();
  for(var i = times; i--;) {
    var x = 2 * 2 * 2 * 2;
    x++;
  }
  var endTime = new Date().getTime();
  console.log("倒序循环 " + times + " 次所需时间为：" + (endTime - startTime) + " ms.");
}

function timePrint(appender, times, moreDom) {
  var xd = "";
  if(moreDom) {
    xd = "在较 多 的DOM下,";
    $("#moreDom").html(muchDoms);
  } else {
    xd = "在较 少 的DOM下,";
    $("#moreDom").empty();
  }
  var startTime = new Date().getTime();
  for(var i = 0; i < times; i++) {
    $(appender);
  }
  var endTime = new Date().getTime();
  console.log("【" + appender + "】选择器" + xd + "执行 " + times + " 次所需时间为：" + (endTime - startTime) + " ms.");
}
</script>
</#macro>
<@gm.simplePage title="jQuery测试" styleMacro=styleMacro scriptMacro=scriptMacro>
  <div class="head" style="text-align: center;">
    <h3>JS/jQuery总结及使用注意事项</h3>
    <h4>Robin</h4>
    <h4>2013-06-20</h4>
  </div>
  <div class="body">
    <div class="item">
      <h5>1、选择器的使用</h5>
      <p>各种选择器的比较:在获取的DOM对象数量一致的情况下比较各个选择器的性能优劣</p>
      <br>
      <a></a>
      <div id="allSelector" class="pointer">所有元素选择器</div>
      <div id="idSelector" class="pointer class1">ID选择器</div>
      <div id="targeNameASelector" class="pointer class2">tagName【a】选择器</div>
      <div id="targeNameDivSelector" class="pointer class2">tagName【div】选择器</div>
      <div id="targeNameAndClassSelector" class="pointer class2">tagName和class组合选择器</div>
      <div id="classSelector" class="pointer class3">class选择器</div>
      <div id="fisrstSelector" class="pointer">属性:first选择器</div>
      <div id="lastSelector" class="pointer">属性:last选择器</div>
      <div id="eqSelector" class="pointer">属性:eq选择器</div>
      <div id="checkedSelector" class="pointer"><input type="checkbox" name="check">属性:checked选择器</div>
      <div id="hiddenSelector" class="pointer">属性:hidden选择器</div>
      <div id="attributeSelector" class="pointer">属性[attribute=value]选择器</div>
      <div id="attributeCheckedSelector" class="pointer">属性[attribute=value]:checked选择器</div>
      <div id="notSelector" class="pointer">属性:not选择器</div>
      <h4>结论</h4>
      <p>  依赖于DOM元素的数量, 需要考虑每个单独的选择器方法的开销。
                      相比于通过ClassName来选择，应该优先考虑用 TagName 搭配 ClassName 来选择，或是在页面只有少量对象时用唯一性的ID来选择。
                      而且- 确保缓存了已解析获得的对象，以避免再次解析调用时的开始。
                      还有 – 最后也是应该予以重视的一点 – 避免不必要的调用。
      </p>
      <div>jQuery Selectors: <a href="http://codylindley.com/jqueryselectors/" target="_blank">http://codylindley.com/jqueryselectors/</a></div>
    </div>
    
    <div class="item">
      <h5>2、关于选择器中含有特殊符号</h5>
      <div id="id#b" class="pointer bigFont">&lt;div&nbsp;id="id#b"&gt;id#b&lt;div&gt;</div> 
      <div id="id[1]" class="pointer bigFont">&lt;div&nbsp;id="id[1]"&gt;id[1]&lt;div&gt;</div> 
    </div>
    
    <div class="item">
      <h5>3、关于选择器中的空格</h5>
      <div class="test pointer" id="blankTest">
        <div class="test1" style="display:none;">aa</div> 
        <div class="test1" style="display:none;">bb</div> 
        <div class="test1" style="display:none;">cc</div> 
        <div class="test test1" style="display:none;">dd</div>
        
        <div>&lt;div class="test"&gt; </div>
        <div style="margin-left:20px;">&lt;div class="test1" style="display:none;"&gt;aa&lt;/div&gt;</div>
        <div style="margin-left:20px;">&lt;div class="test1" style="display:none;"&gt;bb&lt;/div&gt;</div>
        <div style="margin-left:20px;">&lt;div class="test1" style="display:none;"&gt;cc&lt;/div&gt;</div>
        <div style="margin-left:20px;">&lt;div class="test test1" style="display:none;"&gt;dd&lt;/div&gt;</div>
        <div>&lt;/div&gt;</div>
        <div>&lt;div class="test test1" style="display:none;"&gt;ee&lt;/div&gt;</div> 
        <div>&lt;div class="test test1" style="display:none;"&gt;ff&lt;/div&gt;</div>
        
      </div> 
      <div class="test test1" style="display:none;">ee</div> 
      <div class="test test1" style="display:none;">ff</div>  
    </div>
    
    <div class="item">
      <h5>4、浏览器的兼容性问题(IE,Firefox,Chrome,Safri)</h5>
      <div>WIKI地址：<a href="http://wiki.gm.com/pages/viewpage.action?pageId=26673154&focusedCommentId=26673155#comment-26673155" target="_blank"> http://wiki.gm.com/pages/viewpage.action?pageId=26673154&focusedCommentId=26673155#comment-26673155</a></div>
      <div style="margin-top:10px;" id="ztree" data-ztree="testData">(11). <span class="bigFont pointer">&lt;div data-ztree&gt;ztree&lt;/div&gt;</span>
      </div>
      <div style="margin-top:10px;">(38).
        <button><a href="http://www.google.com.hk" target="_blank">谷歌</a></button></div>
      <div style="margin-top:10px;">(39).
        <form id="subForm" action="${request.contextPath}/_demo/jQueryTest">
          <input type="text" value="${subject}" name="subject" id="subject" autocomplete="on">
        </form>
        <div class="hx-form-item-content record-type-list link-blue link-blue-min">
          <a id="sx" class="radioBox<#if subject == "sx"> active</#if>" href="javascript:void(0);">数学</a>
          <a id="yw" class="radioBox<#if subject == "yw"> active</#if>" href="javascript:void(0);">语文</a>
          <a id="yy" class="radioBox<#if subject == "yy"> active</#if>" href="javascript:void(0);">英语</a>
        </div>
      </div>
    </div>
    
    <div class="item">
      <h5>5、关于jQuery插件开发</h5>
      <div class="pointer">(1). 插件开发注意事项：</div>
      <br>
      <div>
        <p>1、在编写对象级别的插件时,使用jQuery.fn.extend()方法进行功能扩展;而针对类级别的插件,则使用jQuery.extend方法进行扩展。</p>
            　　<p>2、插件的文件命名必须严格遵循jQuery.[插件名].js的规则,以便于与其他的js文件的区分,如新插件文件jquery.newplugin.js.</p>
            　　<p>3、如果是对象级别插件,所有的方法都应依附于jquery.fn主体对象;如果是类级别插件,所有的方法都应依附于jquery对象.</p>
            　　<p>4、无论是对象级别还是类级别插件,结尾都必须以分号结束,否则,在文件被压缩时,会出现错误提示信息.</p>
            　　<p>5、虽然"$"美元符,可以与"jQuery"字符相代替,但在编写插件的代码中,尽量不要使用"$"符号,以避免与别的代码冲突.</p>
            　　<p>6、在插件内部的代码中,如果要访问每个元素,可以使用this.each方法来遍历全部元素.</p>
            　　<p>7、需要说明的是在插件的内部,this所代表的是通过jQuery选择器所获取的对象,而非传统意义上的对象的引用.</p>
            　　<p>8、由于jQuery代码在调用方法时,可以采用链写的方法同时调用多个方法,因此,为了保证这个功能的实现,插件本身必须返回一个jQuery对象.</p>
      </div>
      <div class="pointer">(2). ztree开发</div>
      <br>
      <div>
        <p>1、使用命名空间，避免与别的代码冲突</p>
        
        <p>2、尽量在调用时减少参数的传递，能使用默认值或者不传入参数的就不传参数，方便使用者调用</p>
        
        <p>3、参数传递时使用jQuery.extend方法，不传入的参数继承默认值，以减少参数的传递</p>
        <div class="bigFont">var result = $.extend(true, {}, default, custom1, custom2, ...);</div>
        <p style="margin-top: 10px;">4、具有较好的扩展性</p>
        <p>5、适当的暴露一些函数，但是必须保持私有函数的私有性</p>
        <div>
        <div>function f(args) {</div>
        <div>&nbsp;&nbsp;... &nbsp;&nbsp; // 私有函数</div>
        <div>}</div>
        </div>
        <br>
        <div>
        <div>$.ztree.f = function(args) {</div>
        <div>&nbsp;&nbsp;...&nbsp;&nbsp; // 暴露的函数</div>
        <div>}</div>
        </div>
        <p>6、类级别插件和对象级别插件可以互相转换</p>
        <div>①
        <div class="bigFont">&lt;a href="#knowledge-set" data-ztree data-trigger="click" data-paramGetter="knowledgeTreeParam"</div>
        <div class="bigFont" style="margin-left: 40px;">data-fragment="knowledge-select-body" data-toggle="modal"&gt;选择知识点&lt;/a&gt;</div>
        <div>通过document.ready方法初始化</div>
        </div>
        <div style="margin-top: 10px;">②
        <div class="bigFont">
        <div>$.fn.ztree({</div>
        <div>subject: 201,</div>
        <div>...</div>
        <div>});</div>
        <div>通过DOM对象调用ztree方法初始化</div>
        </div>
        </div>
      </div>
    </div>
    <br><br><br>
    <div class="item">
      <h5>6、JS模式</h5>
      <p>WIKI: <a href="http://wiki.gm.com/pages/viewpage.action?pageId=26968066" target="_blank">http://wiki.gm.com/pages/viewpage.action?pageId=26968066</a></p>
      <p>1、函数声明</p>
      <div id="functionTest" class="pointer bigFont">点击测试</div>
      <br>
      <p>2、预解析</p>
      <div id="hoistingTest" class="pointer bigFont">点击测试</div>
      <br>
      <p>3、for循环</p>
      <div id="for1Test" class="pointer bigFont">正序倒序测试</div>
      <br>
      <p>3、for-in循环</p>
      <div id="forInTest" class="pointer bigFont">for-in测试</div>
      <br>
      <p>4、隐式类型转换</p>
      <div id="impliedTest" class="pointer bigFont">点击测试</div>
      <br>
      <p>5、parseInt</p>
      <div id="parseIntTest" class="pointer bigFont">点击测试</div>
      <br>
      <p>6、undefined</p>
      <div id="undefinedTest" class="pointer bigFont">点击测试</div>
      <br>
    </div>
  </div>
  <div class="foot" style="margin-top: 50px;">
    <div id="moreDom">
    </div>
  </div>
 </@gm.simplePage>