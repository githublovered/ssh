<#--
/*
 * 分页标签模板
 */
-->
					<div>
						<#if (parameters.pageBean.totalPage>1)>
							<ul class="pagination">
								<#if !parameters.pageBean.first>
									<li class="${parameters.pageBean.first?string('disabled','')}">
										<a href="${parameters.actionMapping.namespace+'/'+parameters.actionMapping.name+'.'+parameters.actionMapping.extension+'?'+parameters.pageBean.prePageParameter}">
										  <i class="icon-double-angle-left"></i>
										</a>
									</li>
								</#if>
								<#list 1..parameters.pageBean.totalPage as i>
									<li class="${(parameters.pageBean.index==i)?string("active","")}">
										<a href="${parameters.actionMapping.namespace+'/'+parameters.actionMapping.name+'.'+parameters.actionMapping.extension+'?'+parameters.pageBean.getPageParameter(i)}">
										  ${i}
										</a>
									</li>
								</#list>
								<#if !parameters.pageBean.last>
									<li class="${parameters.pageBean.last?string('disabled','')}">
										<a href="${parameters.actionMapping.namespace+'/'+parameters.actionMapping.name+'.'+parameters.actionMapping.extension+'?'+parameters.pageBean.nextPageParameter}">
										  <i class="icon-double-angle-right"></i>
										</a>
									</li>
								</#if>
								
							</ul>
						</#if>
						<span class="summary">共有<span class="badge badge-info">${parameters.pageBean.total}</span>条结果</span>
						<div class="clearfix"></div>
					</div>