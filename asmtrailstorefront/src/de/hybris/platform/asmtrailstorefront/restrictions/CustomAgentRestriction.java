package de.hybris.platform.asmtrailstorefront.restrictions;

import de.hybris.platform.assistedservicestorefront.restrictions.AssistedServicePathRestriction;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CustomAgentRestriction extends AssistedServicePathRestriction
{
	private static final String RESTRICTED_GROUP = "customagentgroup";
	private static final String CUSTOM_MESSAGE = "Custom agents are not able to see order history page.";

	@Override
	public boolean evaluate(final HttpServletRequest httpservletrequest, final HttpServletResponse httpservletresponse)
	{
		if (pathMatches(httpservletrequest))
		{
			if (getAssistedServiceFacade().isAssistedServiceAgentLoggedIn())
			{
				final UserGroupModel customGroup = getUserService().getUserGroupForUID(RESTRICTED_GROUP);
				final UserModel agent = getAssistedServiceFacade().getAsmSession().getAgent();
				if (getUserService().isMemberOfGroup(agent, customGroup))
				{
					sendRedirectToPreviousPage(httpservletrequest, httpservletresponse);
					// in case you will not provide custom message - standart one will be shown "You do not have access rights to perform this action."
					getAssistedServiceFacade().getAsmSession().setFlashErrorMessage(CUSTOM_MESSAGE);
					return false;
				}
			}
		}
		return true;
	}
}
