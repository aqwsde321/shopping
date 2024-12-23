package org.art.gallery.backend.repository;

import org.art.gallery.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findByEmailAndPassword(String email, String password);
}
