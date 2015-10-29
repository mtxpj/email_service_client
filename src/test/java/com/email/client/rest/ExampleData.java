package com.email.client.rest;

import static com.email.client.tools.StringAndListTools.convertStringToList;

import java.util.Date;

import com.email.client.model.EmailMessage;
import com.email.client.model.EmailMessageBuilder;

public class ExampleData {

	private final static EmailMessage EXAMPLE_EMAIL_MESSAGE = new EmailMessageBuilder()
			.withAddresseeList(
					convertStringToList("addresseeList,gwdrs,sgdfv,kool"))
			.withSubject("subject\n" + new Date().toString())
			.withMessage("message")
			.withResponseName("responseName")
			.withResponseEmail("responseEmail")
			.withSendingDate(new Date())
			.withAttachmentDownloadURLs(
					convertStringToList("attachmentDownloadURL1,url2"))
			.withSendingFailureNotificationURL("sendingFailureNotificationURL")
			.build();

	public static EmailMessage getExampleEmailMessage() {
		return EXAMPLE_EMAIL_MESSAGE;
	}
}
