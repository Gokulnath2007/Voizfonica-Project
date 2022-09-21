package com.springbootjpa.datajpa.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springbootjpa.datajpa.repository.UserLoginSessionRepository;

 
/**
 * Servlet Filter implementation class CORSFilter
 */
@Component
public class CORSFilter implements Filter {
 
	@Value("${service.path}")
	public String servicePath;
		
	@Value("${hostOrginEnable}")
	public boolean hostOrginEnable;

	@Value("${userlogin.session}")
	private Long sessionTime;
	
	@Autowired
	UserLoginSessionRepository userLoginSessionRepository;
	public CORSFilter() {
    }
 
    /**
     * @see Filter#destroy()
     */
    public void destroy() {
    }
 
    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
    	
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
    	   
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, DELETE");
		response.addHeader("Access-Control-Allow-Credentials", "true");
		
		response.setHeader("Access-Control-Allow-Headers", "Autorization, content-type, xsrf-token, X-Requested-With, userId");
		response.setHeader("Access-Control-Expose-Headers", "Autorization, userId");
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));
		
		if (hostOrginEnable) {
			if (servicePath != null && !servicePath.equals(((HttpServletRequest) servletRequest).getHeader("host"))) {
				throw new ServletException("Unauthorized Access");
			}
		}
		
		/*String[] uris = request.getRequestURI().split("/");
		if(!uris[2].trim().equals("login")) {
			String userId = request.getHeader("userId");	
			if(Util.isNullOrBlank(userId)) {
				throw new ServletException("User ID not avilable in the header");
			}
			UserLoginSession userLoginSession = userLoginSessionRepository.findByUserId(Long.valueOf(userId));
			if(null==userLoginSession) {
				throw new ServletException("Invalid request");
			} 
			
			long timeDifferenceInSec = ChronoUnit.SECONDS.between(userLoginSession.getLastApiCall(), LocalDateTime.now());
			if(sessionTime>=timeDifferenceInSec && userLoginSession.getIpAddress().equals(request.getRemoteHost())) {
				userLoginSession.setLastApiCall(LocalDateTime.now());
				userLoginSessionRepository.save(userLoginSession);
			} else {
				throw new ServletException("Session Expired");
			}
		}*/
		chain.doFilter(request, response);
	}
 
    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
    	
    }
 
}