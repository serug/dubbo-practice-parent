package top.serug.dubbopractice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/14  17:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntity implements Serializable {

    private Integer demoId;
    private String demoName;
}
