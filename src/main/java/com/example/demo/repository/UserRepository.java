package com.example.demo.repository;

import com.example.demo.entity.user.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


//@RepositoryDefinition()
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

    Page<UserEntity> findByUserName(String userName, Pageable pageable);

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    UserEntity findByUserName(String userName);

    /*
    * WHERE userName LIKE %?
    */
    List<UserEntity> findByUserNameStartingWith(String userName);

    /*
     * WHERE userName LIKE ?%
     */
    List<UserEntity> findByUserNameEndingWith(String userName);

    /*
     * WHERE userName LIKE %?%
     */
    Page<UserEntity> findByUserNameContaining(String userName, Pageable pageable);

    List<UserEntity> findByIdLessThan(Long id);

    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(p.id) FROM UserEntity p)")
    UserEntity findMaxId();

    @Query("SELECT u FROM UserEntity u WHERE u.userName = ?1 AND u.userEmail = ?2")
    List<UserEntity> getUserEntityBy(String userName, String userEmail);

    @Query("SELECT u FROM UserEntity u WHERE u.userName = :userNamer AND u.userEmail = :userEmail")
    List<UserEntity> getUserEntityByTwo(@Param("userName") String userName, @Param("userEmail") String userEmail);

    @Modifying
    @Query("UPDATE UserEntity u SET u.userName = :userName")
    @Transactional
    int updateUserName(@Param("userName") String userName);

    // native query
    /*
    * get count user use native query
    */

    @Query(value = "SELECT COUNT(id) FROM java_user_001", nativeQuery = true)
    long getTotalUser();

}
