package com.laptrinhb2a.springboot.mailsender.service;

import com.laptrinhb2a.springboot.mailsender.service.sdi.ClientSdi;
import com.laptrinhb2a.springboot.mailsender.service.sdi.UpdateSdi;

public interface ClientService {
    Boolean create(ClientSdi sdi);

    Boolean update(UpdateSdi sdi);
}
