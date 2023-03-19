package cn.butterfly.flinkcdc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.debezium.data.Envelope;
import lombok.Data;

/**
 * 不包含 scheme 消息
 *
 * @author zjw
 * @date 2023-03-16
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithoutSchemeMessage<T> {

    /**
     * source
     */
    private Source source;

    /**
     * 修改前
     */
    private T before;

    /**
     * 修改后
     */
    private T after;

    /**
     * 操作
     */
    private Envelope.Operation op;

}
