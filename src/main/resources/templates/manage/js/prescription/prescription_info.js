/*页面加载调用参数*/
function all_info(){
    sportsEffect();
    sportsLike();
    equipment();
    fatigueList();
    diseaseList();

}
 /*运动数据信息展示*/
function sportsEffect() {
/*运动效果数据展示*/
    $.ajax({
        type: "get",
        url: "standardRecipe/goalList.do",

        success: function (e) {

                var str = '';
                str ="<a href='#' id=‘effect_a’ onclick='select_effect_all()' data-toggle='check-all' class='选择运动效果'>全选</a>"
       			$.each(e,function(index,value){
       					str += "<label class='dropdown-option'> <input type='checkbox' onclick='check_effect()'  name='dropdown-group03' value='"+value.id+"' /> "+value.sportsEffect+" </label>";
       				});

                $('#sportsEffect').empty();
    			$('#sportsEffect').append(str);
        }
    });

}
function sportsLike() {
/*运动兴趣数据展示*/
    $.ajax({
           type: "get",
           url: "standardRecipe/interestList.do",

           success: function (e) {
           console.log(e);

           var str = '';

               			$.each(e,function(index,value){
               					str += "<option value='"+value.id+"'>"+value.sportTypesName+"</option>";
               				});
               			$('#sportsLike').empty();
               			$('#sportsLike').append(str);

           }
       });

}


function equipment() {
/*运动器材数据展示*/
    $.ajax({
           type: "get",
           url: "standardRecipe/equipmentList.do",
           success: function (e) {
           console.log(e);
                   var str = '';
                   str ="<a href='#' id=‘equip_a’ onclick='select_equip_all()' data-toggle='check-all' class='选择运动器材'>全选</a>"
       			$.each(e,function(index,value){
       					str += "<label class='dropdown-option'> <input type='checkbox' onclick='check_effect()' id='equipment"+value.id+"' name='dropdown-group02' value='"+value.id+"' /> "+value.equipmentName+" </label>";
       				});
                  $('#equipment').empty();
       			$('#equipment').append(str);
           }
       });

}
function fatigueList() {
/*运动疲劳度等级展示*/
    $.ajax({
           type: "get",
           url: "standardRecipe/fatigueList.do",

           success: function (e) {
           console.log(e);
                   var str = '';

       			$.each(e,function(index,value){
       			    str += "<option value='"+value.id+"'>"+value.name+"</option>";
       			});
                $('#fatigueList').empty();
       			$('#fatigueList').append(str);
           }
       });

}

function diseaseList() {
/*运动禁忌疾病展示*/
    $.ajax({
           type: "get",
           url: "standardRecipe/diseaseList.do",

           success: function (e) {
           console.log(e);
                   var str = '';
                   str ="<a href='#' id=‘dis_a’ onclick='select_dis_all()' data-toggle='check-all' class='选择禁忌疾病'>全选</a>"
       			$.each(e,function(index,value){
       					str += "<label class='dropdown-option'> <input type='checkbox' onclick='check_effect()' id='disease"+value.id+"' name='dropdown-group05' value='"+value.id+"' /> "+value.diseaseName+" </label>";
       				});
                 $('#diseaseList').empty();
       			$('#diseaseList').append(str);
           }
       });

}

function check_effect(){
        var CheckboxDropdown = function(el) {
                var _this = this;
                this.isOpen = false;
                this.areAllChecked = false;
                this.$el = $(el);
                this.$label = this.$el.find('.dropdown-label');
                this.$checkAll = this.$el.find('[data-toggle="check-all"]').first();
                this.$inputs = this.$el.find('[type="checkbox"]');

                this.onCheckBox();

                this.$label.on('click', function(e) {
                    e.preventDefault();
                    _this.toggleOpen();
                });

                this.$checkAll.on('click', function(e) {
                    e.preventDefault();
                    _this.onCheckAll();
                });

                this.$inputs.on('change', function(e) {
                    _this.onCheckBox();
                });
            };

            CheckboxDropdown.prototype.onCheckBox = function() {
                this.updateStatus();
            };

            CheckboxDropdown.prototype.updateStatus = function() {
                var checked = this.$el.find(':checked');

                this.areAllChecked = false;
                this.$checkAll.html('全选');

                if (checked.length <= 0) {

                } else if (checked.length === 1) {
                    this.$label.html(checked.parent('label').text());
                } else if (checked.length === this.$inputs.length) {
                    this.$label.html('全选');
                    this.areAllChecked = true;
                    this.$checkAll.html('取消全选');
                } else {
                    this.$label.html(checked.length + ' Selected');
                }
            };

            CheckboxDropdown.prototype.onCheckAll = function(checkAll) {
                if (!this.areAllChecked || checkAll) {
                    this.areAllChecked = true;
                    this.$checkAll.html('取消全选');
                    this.$inputs.prop('checked', true);
                } else {
                    this.areAllChecked = false;
                    this.$checkAll.html('全选');
                    this.$inputs.prop('checked', false);
                }

                this.updateStatus();
            };

            CheckboxDropdown.prototype.toggleOpen = function(forceOpen) {
                var _this = this;

                if (!this.isOpen || forceOpen) {
                    this.isOpen = true;
                    this.$el.addClass('on');
                    $(document).on('click', function(e) {
                        if (!$(e.target).closest('[data-control]').length) {
                            _this.toggleOpen();
                        }
                    });
                } else {
                    this.isOpen = false;
                    this.$el.removeClass('on');
                    $(document).off('click');
                }
            };

            var checkboxesDropdowns = document.querySelectorAll('[data-control="checkbox-dropdown"]');
            for (var i = 0, length = checkboxesDropdowns.length; i < length; i++) {
                new CheckboxDropdown(checkboxesDropdowns[i]);
            }


}


/*禁忌疾病的全选切换*/
function select_dis_all(){
        if(document.getElementById("dis_a") != null){
            var lbl7=document.getElementById("dis_a").innerHTML;
        }
      //  var lbl7=document.getElementById("dis_a").innerText; //获取label里的值
      if(lbl7=="全选")
      {
             document.getElementById("dis_a").innerText="取消全选";
             var boxes = document.getElementById('diseaseList').getElementsByTagName("input");
             for(var i=0; i<boxes.length; i++){
             boxes[i].checked = true;
             }
      }
      if(lbl7=="取消全选")
      {
        document.getElementById("dis_a").innerText="全选";
        var boxes = document.getElementById('diseaseList').getElementsByTagName("input");
                     for(var i=0; i<boxes.length; i++){
                     boxes[i].checked = false;
                     }
      }



}

/*器材的全选切换*/
function select_equip_all(){
    var lbl7=document.getElementById("equip_a").innerText; //获取label里的值
          if(lbl7=="全选")
          {
                 document.getElementById("equip_a").innerText="取消全选";
                 var boxes = document.getElementById('equipment').getElementsByTagName("input");
                              for(var i=0; i<boxes.length; i++){
                              boxes[i].checked = true;
                              }
          }
          if(lbl7=="取消全选")
          {
            document.getElementById("equip_a").innerText="全选";
            var boxes = document.getElementById('equipment').getElementsByTagName("input");
             for(var i=0; i<boxes.length; i++){
             boxes[i].checked = false;
              }
          }
}

/*运动效果的全选切换*/

 function select_effect_all(){
 var lbl7=document.getElementById("effect_a").innerText; //获取label里的值
           if(lbl7=="全选")
           {
                  document.getElementById("effect_a").innerText="取消全选";
                  var boxes = document.getElementById('sportsEffect').getElementsByTagName("input");
                               for(var i=0; i<boxes.length; i++){
                               boxes[i].checked = true;
                                }
           }
           if(lbl7=="取消全选")
           {
             document.getElementById("effect_a").innerText="全选";
             var boxes = document.getElementById('sportsEffect').getElementsByTagName("input");
                          for(var i=0; i<boxes.length; i++){
                          boxes[i].checked = false;
                           }
           }
 }