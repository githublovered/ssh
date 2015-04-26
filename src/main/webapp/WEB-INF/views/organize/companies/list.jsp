<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="ssh" uri="/ssh-boot-tags" %>
<title>组织机构</title>

<head>
<script type="text/javascript" src="${ctx}/assets/app/js/company.js"></script>
</head>

<content tag="location">
<ul class="breadcrumb">
	<li><i class="icon-home home-icon"></i> <a href="#">组织机构</a></li>
	<li class="active">分公司</li>
</ul>
<!-- .breadcrumb --> </content>

<div class="row">
	<div class="col-sm-12">
		<div class="widget-box">
			<div class="widget-header">
				<h4>查询</h4>
			</div>
			
			<div class="widget-body">
				<div class="widget-main">
					<s:form cssClass="form-horizontal search" >
						<ul class="form-search">
							<li>
								<s:textfield
		                        label="公司名称"
		                        name="q.name"
		                        />
	                        </li>
	                        <li>
		                        <s:textfield
		                        label="负责人电话"
		                        name="q.principalTel"
		                        />
	                        </li>
	                        <li>
	                        	<span class="input-group-btn">
									<button type="button" class="btn btn-info btn-sm">
										查询
										<i class="icon-search icon-on-right bigger-110"></i>
									</button>
								</span>
	                        </li>
                        </ul>
					</s:form>
					
					
				</div>
			</div>
		</div>
	</div>
<div class="row">
	<div class="col-xs-12">
		<div class="widget-box">
			<div class="widget-header widget-header-flat">
				<h4>分公司管理</h4>
			</div>

			<div class="widget-body">
				<div class="widget-main">
					<table class="table table-striped table-bordered table-hover"
						id="sample-table-1">
						<tr>
							<th class="center"><label> <input type="checkbox"
									class="ace"> <span class="lbl"></span>
							</label></th>
							<th>公司名称</th>
							<th>负责人</th>
							<th>负责人电话</th>
							<th>上级公司</th>
							<th>创建时间</th>
							<th>操作</th>
						</tr>
						<s:iterator value="page.data">
							<tr>
								<td class="center"><label> <input type="checkbox"
										class="ace"> <span class="lbl"></span>
								</label></td>

								<td><s:property value="name" /></td>
								<td><s:property value="principal" /></td>
								<td><span class="badge badge-danger"><i
										class="icon-phone"></i> <s:property value="principalTel" /></span></td>
								<td><s:property value="parentCompany.name" /></td>
								<td><s:date name="createdAt" format="yyyy-MM-dd HH:mm:ss" />
								</td>

								<td>
									<div
										class="visible-md visible-lg hidden-sm hidden-xs btn-group">
										<button class="btn btn-xs btn-success">
											<i class="icon-ok bigger-120"></i>
										</button>

										<button class="btn btn-xs btn-info">
											<i class="icon-edit bigger-120"></i>
										</button>

										<button class="btn btn-xs btn-danger">
											<i class="icon-trash bigger-120"></i>
										</button>

										<button class="btn btn-xs btn-warning">
											<i class="icon-flag bigger-120"></i>
										</button>
									</div>

								</td>
							</tr>
						</s:iterator>

					</table>

					<!-- ---------pagination----------- -->
					<ssh:pagination pageBean="page" />
				</div>
			</div>
		</div>
	</div>
</div>	
<!-- /.row -->








