jQuery(function($) {
	var cdsConfigSetupGrid = $("#projectConfigurationList");
	var selected = new Object();
	var idsToDelete;
	var configlAddToDelete;
	var lastSelected;
	cdsConfigSetupGrid
			.jqGrid({
				url : "/project/list",
				datatype : "json",
				jsonReader : {
					repeatitems : false,
					root : function(obj) {
						return obj;
					}
				},
				colNames:['Project Name','Created Date','Assignee','Location','Actions'],
				colModel : [
							{
							name : 'name',
							index : 'name',
							width : 250,
							search : true,
							editable : true,
							editrules : {
								edithidden : true
							},
							editoptions : {
								dataInit : function(element) {
									jQuery(element)
											.attr("readonly", "readonly");
								}
							}

						},
						{
							name : 'createdDate',
							index : 'createdDate',
							editable : true,
							width : 250,
							search : true,
							editrules : {
								required : true
							},

						},
						{
							name : 'assignee',
							index : 'assignee',
							width : 250,
							search : true,
							editable : true,
							editrules : {
								edithidden : true
							},
							editoptions : {
								dataInit : function(element) {
									jQuery(element)
											.attr("readonly", "readonly");
								}
							}

						},
						{
							name : 'location',
							index : 'location',
							editable : true,
							width : 250,
							search : true,
							editrules : {
								required : true
							},

						},

						{
							label : "Actions",
							name : "actions",
							width : 150,
							search : false,
							sortable : false,
							formatter : "actions",
							formatoptions : {
								keys : true,
								editOptions : {},
								afterSave : function(rowid, response, postdata,
										options) {
									

								},
								onError : function(rowid, response, postdata,
										options) {
									
								},
								delbutton : true

							}
						},

				],
				width : "1000px",
				search : true,
				//autowidth : true,
				shrinkToFit : false,
				forceFit : false,
				pager : $('#projectConfigurationListPager'),
				gridview : true,
				rownumbers : true,
				autoencode : true,
				ignoreCase : true,
				loadonce : true,
				rowNum : 15,
				rowList : [ 15, 25, 50, 100, 200, 500, 1000 ],
				editurl : "/project/editProject",
				multiselect : true,
				sortname : 'systemConfigurationId',
				sortorder : 'asc',
				viewrecords : true,
				height : 'auto',
				caption : "Project Data",
				scrollOffset : 0,
				loadComplete : function(data) {
					if (cdsConfigSetupGrid.jqGrid('getGridParam', 'datatype') === 'json') {
						setTimeout(function() {
							cdsConfigSetupGrid.jqGrid('setGridParam', {
								page : 1
							}).trigger("reloadGrid");
						}, 10);
					}

					var ids = cdsConfigSetupGrid.jqGrid('getDataIDs');
					for (var i = 0; i < ids.length; i++) {
						if (selected[ids[i]] === true) {
							if ($("#" + ids[i]).attr('aria-selected') === undefined)
								cdsConfigSetupGrid.setSelection(ids[i], true);
						}
					}
				},
				onSelectRow : function(rowid, status) {
					selected[rowid] = status;
				},

				onSelectAll : function(rowids, status) {
					for (var i = 0; i < rowids.length; i++) {
						selected[rowids[i]] = status;
					}
				},
				ajaxRowOptions : {
					contentType : "application/json",
					dataType : "json"
				},
				serializeRowData : function(data) {
					return JSON.stringify(data);
				},

			});
	cdsConfigSetupGrid.jqGrid('filterToolbar', {
		defaultSearch : 'cn',
		searchOnEnter : false
	});

	cdsConfigSetupGrid.jqGrid('navGrid', '#projectConfigurationListPager', {
		edit : false,
		add : false,
		del : false,
		search : false,
		refresh : true,
		beforeRefresh : function() {
			$(this).jqGrid('setGridParam', {
				datatype : 'json'
			}).trigger('reloadGrid');
			cdsConfigSetupGrid.jqGrid('sortGrid', 'id', true, '');
			cdsConfigSetupGrid.jqGrid('resetSelection');
			idsToDelete = [];
			configlAddToDelete = [];
			selected = new Object();
		}
	}, {
		multipleSearch : true,
		multipleGroup : true,
		showQuery : true
	});
});
