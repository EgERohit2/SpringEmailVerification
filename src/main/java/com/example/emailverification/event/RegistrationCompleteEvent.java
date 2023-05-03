package com.example.emailverification.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import com.example.emailverification.user.User;


@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
	private User user;
    private String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}
