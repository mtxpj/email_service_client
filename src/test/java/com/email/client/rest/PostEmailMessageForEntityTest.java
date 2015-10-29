package com.email.client.rest;

import org.junit.Assert;
import org.junit.Test;

import com.email.client.model.EmailMessage;

public class PostEmailMessageForEntityTest {

	@Test
	public void testPost() {
		// given
		EmailMessage expected = ExampleData.getExampleEmailMessage();
		// when
		EmailMessage actual = new PostEmailMessageForEntity().post(expected);
		// than
		Assert.assertEquals(expected.getSubject(), actual.getSubject());
		Assert.assertEquals(expected.getMessage(), actual.getMessage());
		Assert.assertEquals(expected.getResponseName(),
				actual.getResponseName());
		Assert.assertEquals(expected.getResponseEmail(),
				actual.getResponseEmail());
		Assert.assertEquals(expected.getSendingDate().getTime() / 1000, actual
				.getSendingDate().getTime() / 1000);
		Assert.assertEquals(expected.getSendingFailureNotificationURL(),
				actual.getSendingFailureNotificationURL());
		Assert.assertEquals(expected.getAttachmentDownloadURLs().iterator()
				.next(), actual.getAttachmentDownloadURLs().iterator().next());
	}
}
