<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jslib/jquery-easyui-1.3.1/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="jslib/jquery-easyui-1.3.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jslib/jquery-easyui-1.3.1/locale/easyui-lang-zh_TW.js"></script>
<link rel="stylesheet" href="jslib/jquery-easyui-1.3.1/themes/default/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="jslib/jquery-easyui-1.3.1/themes/icon.css" type="text/css"></link>

<script type="text/javascript">
	$(function(){
		$('#index_tree').tree({
			url:'${pageContext.request.contextPath}/deptAction!getTreeNode.action'
		});
		
		
	});
</script>

</head>

<body class="easyui-layout">

	<div data-options="region:'west',title:'功能選單'" style="width:200px;">

		<div id="aa" class="easyui-accordion" data-options="fit:true,border:false">
			<div title="部門" data-options="iconCls:'icon-save'">
				<ul id="index_tree"></ul>
			</div>
			<div title="人員" data-options="iconCls:'icon-reload'">人員</div>
		</div>

	</div>
	<div data-options="region:'center',title:'Agentflow系統'"></div>


</body>
</html>
