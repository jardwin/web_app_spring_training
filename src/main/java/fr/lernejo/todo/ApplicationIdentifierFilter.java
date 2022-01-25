package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements Filter {

    private final String InstanceId = UUID.randomUUID().toString();

    public String GetInstanceId(){
        return InstanceId;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    ((HttpServletResponse)servletResponse).setHeader("Instance-Id", InstanceId);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
