package com.training.transportcomany2.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.DelegatingServletInputStream;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;

class MySimpleUrlAuthenticationSuccessHandlerTest {
    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#onAuthenticationSuccess(HttpServletRequest, HttpServletResponse, Authentication)}
     */
    @Test
    void testOnAuthenticationSuccess() throws IOException {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        Response response = new Response();
        assertThrows(IllegalStateException.class, () -> mySimpleUrlAuthenticationSuccessHandler
                .onAuthenticationSuccess(request, response, new TestingAuthenticationToken("Principal", "Credentials")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#onAuthenticationSuccess(HttpServletRequest, HttpServletResponse, Authentication)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnAuthenticationSuccess2() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.determineTargetUrl(MySimpleUrlAuthenticationSuccessHandler.java:66)
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.handle(MySimpleUrlAuthenticationSuccessHandler.java:47)
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.onAuthenticationSuccess(MySimpleUrlAuthenticationSuccessHandler.java:37)
        //   In order to prevent onAuthenticationSuccess(HttpServletRequest, HttpServletResponse, Authentication)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   onAuthenticationSuccess(HttpServletRequest, HttpServletResponse, Authentication).
        //   See https://diff.blue/R013 to resolve this issue.

        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        mySimpleUrlAuthenticationSuccessHandler.onAuthenticationSuccess(request, new Response(), null);
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#onAuthenticationSuccess(HttpServletRequest, HttpServletResponse, Authentication)}
     */
    @Test
    void testOnAuthenticationSuccess3() throws IOException {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        Response response = new Response();
        assertThrows(IllegalStateException.class,
                () -> mySimpleUrlAuthenticationSuccessHandler.onAuthenticationSuccess(request, response,
                        new TestingAuthenticationToken("Principal", "Credentials", "JaneDoe")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#handle(HttpServletRequest, HttpServletResponse, Authentication)}
     */
    @Test
    void testHandle() throws IOException {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        Response response = new Response();
        assertThrows(IllegalStateException.class, () -> mySimpleUrlAuthenticationSuccessHandler.handle(request, response,
                new TestingAuthenticationToken("Principal", "Credentials")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#handle(HttpServletRequest, HttpServletResponse, Authentication)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandle2() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.determineTargetUrl(MySimpleUrlAuthenticationSuccessHandler.java:66)
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.handle(MySimpleUrlAuthenticationSuccessHandler.java:47)
        //   In order to prevent handle(HttpServletRequest, HttpServletResponse, Authentication)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   handle(HttpServletRequest, HttpServletResponse, Authentication).
        //   See https://diff.blue/R013 to resolve this issue.

        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        mySimpleUrlAuthenticationSuccessHandler.handle(request, new Response(), null);
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#handle(HttpServletRequest, HttpServletResponse, Authentication)}
     */
    @Test
    void testHandle3() throws IOException {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        Response response = new Response();
        assertThrows(IllegalStateException.class, () -> mySimpleUrlAuthenticationSuccessHandler.handle(request, response,
                new TestingAuthenticationToken("Principal", "Credentials", "JaneDoe")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#determineTargetUrl(Authentication)}
     */
    @Test
    void testDetermineTargetUrl() {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        assertThrows(IllegalStateException.class, () -> mySimpleUrlAuthenticationSuccessHandler
                .determineTargetUrl(new TestingAuthenticationToken("Principal", "Credentials")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#determineTargetUrl(Authentication)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDetermineTargetUrl2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.determineTargetUrl(MySimpleUrlAuthenticationSuccessHandler.java:66)
        //   In order to prevent determineTargetUrl(Authentication)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   determineTargetUrl(Authentication).
        //   See https://diff.blue/R013 to resolve this issue.

        (new MySimpleUrlAuthenticationSuccessHandler()).determineTargetUrl(null);
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#determineTargetUrl(Authentication)}
     */
    @Test
    void testDetermineTargetUrl3() {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        assertThrows(IllegalStateException.class, () -> mySimpleUrlAuthenticationSuccessHandler
                .determineTargetUrl(new TestingAuthenticationToken("Principal", "Credentials", "JaneDoe")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#determineTargetUrl(Authentication)}
     */
    @Test
    void testDetermineTargetUrl4() {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        assertEquals("/user", mySimpleUrlAuthenticationSuccessHandler
                .determineTargetUrl(new TestingAuthenticationToken("Principal", "Credentials", "ROLE_USER")));
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#clearAuthenticationAttributes(HttpServletRequest)}
     */
    @Test
    void testClearAuthenticationAttributes() {
        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();
        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
        mySimpleUrlAuthenticationSuccessHandler.clearAuthenticationAttributes(mockHttpServletRequest);
        assertFalse(mockHttpServletRequest.isRequestedSessionIdFromURL());
        assertTrue(mockHttpServletRequest.isRequestedSessionIdFromCookie());
        assertFalse(mockHttpServletRequest.isAsyncSupported());
        assertFalse(mockHttpServletRequest.isAsyncStarted());
        assertTrue(mockHttpServletRequest.isActive());
        assertTrue(mockHttpServletRequest.getSession() instanceof MockHttpSession);
        assertEquals("", mockHttpServletRequest.getServletPath());
        assertEquals(80, mockHttpServletRequest.getServerPort());
        assertEquals("localhost", mockHttpServletRequest.getServerName());
        assertEquals("http", mockHttpServletRequest.getScheme());
        assertEquals("", mockHttpServletRequest.getRequestURI());
        assertEquals(80, mockHttpServletRequest.getRemotePort());
        assertEquals("localhost", mockHttpServletRequest.getRemoteHost());
        assertEquals("HTTP/1.1", mockHttpServletRequest.getProtocol());
        assertEquals("", mockHttpServletRequest.getMethod());
        assertEquals(80, mockHttpServletRequest.getLocalPort());
        assertEquals("localhost", mockHttpServletRequest.getLocalName());
        assertTrue(mockHttpServletRequest.getInputStream() instanceof DelegatingServletInputStream);
        assertEquals(DispatcherType.REQUEST, mockHttpServletRequest.getDispatcherType());
        assertEquals("", mockHttpServletRequest.getContextPath());
        assertEquals(-1L, mockHttpServletRequest.getContentLengthLong());
        assertTrue(mySimpleUrlAuthenticationSuccessHandler.logger instanceof ch.qos.logback.classic.Logger);
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#clearAuthenticationAttributes(HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testClearAuthenticationAttributes2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.security.MySimpleUrlAuthenticationSuccessHandler.clearAuthenticationAttributes(MySimpleUrlAuthenticationSuccessHandler.java:77)
        //   In order to prevent clearAuthenticationAttributes(HttpServletRequest)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   clearAuthenticationAttributes(HttpServletRequest).
        //   See https://diff.blue/R013 to resolve this issue.

        (new MySimpleUrlAuthenticationSuccessHandler()).clearAuthenticationAttributes(null);
    }

    /**
     * Method under test: {@link MySimpleUrlAuthenticationSuccessHandler#clearAuthenticationAttributes(HttpServletRequest)}
     */
    @Test
    void testClearAuthenticationAttributes3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by clearAuthenticationAttributes(HttpServletRequest)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        MySimpleUrlAuthenticationSuccessHandler mySimpleUrlAuthenticationSuccessHandler = new MySimpleUrlAuthenticationSuccessHandler();

        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
        mockHttpServletRequest.setSession(new MockHttpSession());
        mySimpleUrlAuthenticationSuccessHandler.clearAuthenticationAttributes(mockHttpServletRequest);
    }
}

