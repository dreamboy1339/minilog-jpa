package com.asdf.minilog.repository;

import com.asdf.minilog.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FollowerRepository extends JpaRepository<Follow, Long> {
    List<Follow> findByFolloweeId(Long followeeId);

    Optional<Follow> findByFollowerIdAndFolloweeId(Long followerId, Long followeeId);
}
