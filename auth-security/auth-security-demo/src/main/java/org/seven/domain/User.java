package org.seven.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

/**
 * @author Seven.Lin
 * @date 2019/12/30 22:48
 */
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Long uid;

    @NotBlank(message = "手机号不能为空")
    private String phone;
    private String nick;
    private String gender;
    private Integer age;
    private String avatar;
    private Integer score;

    @Column(name = "childrenIds")
    private String childrenIds;

    @Column(name = "wechatAccount")
    private String wechatAccount;

    @Column(name = "last_sign_in_at")
    private Date lastSignInAt;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_At")
    private Date updatedAt;
}
