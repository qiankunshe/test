/**
 * ��չligerUI accordion��
 */
(function ($){
	
	var accordionDom='<div title="#title#" class="l-scroll"><ul id="#treeID#" style="margin-top:3px;"></div>';
	$.fn.accordionTree = function (options,datas)
    {
		method.init(this[0],options,datas);
    };
    var method = {
    	init:function($this,options,datas){
    		method.createDom($this, datas);
    	},
    	createDom:function($this,datas){
    		for ( var i = 0; i < datas.length; i++) {
    			var data = datas[i];
    			var accordionDomTest = accordionDom;
    			accordionDomTest.replace("#title#", data.title);
    			accordionDomTest.replace("#treeID#", data.id);
    			$($this).append(accordionDomTest);
    			method.createAccrdionTree(data);
    		}
    	},
    	createAccrdionTree:function(data){
    		$("#"+data.id).ligerTree({
                data : data.data,
                checkbox: false,
                slide: false,
                nodeWidth: 120,
                attribute: ['nodename', 'url'],
                onSelect: function (node)
                {
                    if (!node.data.url) return;
                    var tabid = $(node.target).attr("tabid");
                    if (!tabid)
                    {
                        tabid = new Date().getTime();
                        $(node.target).attr("tabid", tabid);
                    } 
                    f_addTab(tabid, node.data.text, node.data.url);
                }
            });
    	}
    };
	
})(jQuery);