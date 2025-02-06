package com.ypkim.modulith.member.service;

import com.ypkim.modulith.member.DeviceEvent;
import com.ypkim.modulith.member.domain.Member;
import com.ypkim.modulith.member.domain.MemberRepository;
import com.ypkim.modulith.member.service.dto.MemberRegistrationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberRegistrationService {

    private final MemberRepository repository;
    private final ApplicationEventPublisher publisher;

    @Transactional
    public void register(MemberRegistrationDto dto) {
        Member member = Member.builder()
                              .email(dto.email())
                              .password(dto.password())
                              .name(dto.name())
                              .phone(dto.phone())
                              .build();

        repository.save(member);

        publisher.publishEvent(new DeviceEvent("test"));
    }
}
