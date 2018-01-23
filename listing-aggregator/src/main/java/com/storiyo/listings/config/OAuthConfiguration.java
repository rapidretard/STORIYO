package com.storiyo.listings.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;

import static java.util.Arrays.asList;

@Configuration
@EnableOAuth2Client
@PropertySource("classpath:domain.properties")
public class OAuthConfiguration {

    @Value("${clientId}")
    private String clientId;

    @Value("${clientSecret}")
    private String clientSecret;

    @Value("${accessTokenUri}")
    private String accessTokenUri;

    @Value("${authScheme}")
    private String authenticationScheme;

//    @Value("${scope}")
//    private String scope;

    @Value("${grantType}")
    private String grantType;

    @Bean
    public RestTemplate oAuthRestTemplate() {
        ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
        resourceDetails.setId("domain");
        resourceDetails.setClientId(clientId);
        resourceDetails.setClientSecret(clientSecret);
        resourceDetails.setAccessTokenUri(accessTokenUri);
        resourceDetails.setScope(asList("api_listings_read", "api_agencies_read"));
        resourceDetails.setGrantType(grantType);

        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(resourceDetails, new DefaultOAuth2ClientContext());
        oAuth2RestTemplate.setMessageConverters(asList(new MappingJackson2HttpMessageConverter()));
        return oAuth2RestTemplate;
    }
}
