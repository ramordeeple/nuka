create table scenarios
(
    id           uuid primary key,
    request_date date        not null unique,
    response_xml text        not null,
    expires_at   timestamptz not null,
    created_at   timestamptz not null default now()
);

create index idx_scenarios_expires_at
    on scenarios (expires_at);