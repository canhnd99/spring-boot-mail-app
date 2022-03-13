package com.laptrinhb2a.springboot.mailsender.controller;

import com.laptrinhb2a.springboot.mailsender.service.sdi.ClientSdi;
import com.laptrinhb2a.springboot.mailsender.service.ClientService;
import com.laptrinhb2a.springboot.mailsender.service.sdi.UpdateSdi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client-mailsender")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping(value = "create")
    public ResponseEntity<Boolean> create(
            @RequestBody ClientSdi clientSdi
    ) {
        return ResponseEntity.ok(clientService.create(clientSdi));
    }

    @PostMapping(value = "update")
    public ResponseEntity<Boolean> update(
            @RequestBody UpdateSdi updateSdi
    ) {
        return ResponseEntity.ok(clientService.update(updateSdi));
    }
	
	@PostMapping(value = "delete")
    public ResponseEntity<Boolean> delete(
            @RequestBody UpdateSdi updateSdi
    ) {
        return ResponseEntity.ok(clientService.update(updateSdi));
    }
}
