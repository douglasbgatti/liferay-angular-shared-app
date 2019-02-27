package com.liferay.shared.app.portlet.action;

import com.liferay.shared.app.constants.SharedApplicationMvcPortletKeys;

import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.Serializable;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Travis Cory
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + SharedApplicationMvcPortletKeys.SharedApplicationMvc,
		"mvc.command.name=/", "mvc.command.name=/react/route/view"
	},
	service = MVCRenderCommand.class
)
public class MVCViewCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		return "/view.jsp";
	}

}