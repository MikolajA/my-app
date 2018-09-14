package com.mikolaj.web;

import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.io.IOException;

@ApplicationScoped
public class TemplateProvider {

    private final String TEMPLATE_DIRECTORY_PATH = "WEB-INF";

    private Configuration configuration;

    @Inject
    private ConfigProvider configProvider;

    public Template getTemplate(ServletContext servletContext, String templateName) throws IOException {

        configuration = configProvider.getConfiguration();
        configuration.setServletContextForTemplateLoading(servletContext, TEMPLATE_DIRECTORY_PATH);
        return configuration.getTemplate(templateName);
    }
}
