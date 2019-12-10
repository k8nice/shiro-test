package com.nice.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is shiro-test.
 * The current package name is com.nice.filter.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/12/10 14:21
 */
public class RolesOrFilter extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, Object mappedValue) throws Exception {
        Subject subject = getSubject(request, response);
        String[] roles = (String[]) mappedValue;

        if (roles == null || roles.length == 0) {
            return true;
        }

        for (String role : roles) {
            if (subject.hasRole(role)) {
                return true;
            }
        }

        return false;
    }
}
