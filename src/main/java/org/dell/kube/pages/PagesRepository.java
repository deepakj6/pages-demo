package org.dell.kube.pages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PagesRepository extends JpaRepository<Page,Long> {
}
