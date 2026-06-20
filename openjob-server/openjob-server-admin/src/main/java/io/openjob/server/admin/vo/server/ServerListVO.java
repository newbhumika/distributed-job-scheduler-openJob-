package io.openjob.server.admin.vo.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author riki
 * @since 1.0.0
 */
@Data
@ApiModel(value = "ServerListVO", description = "server list VO")
public class ServerListVO {
    @ApiModelProperty(value = "pk")
    private Long id;

    @ApiModelProperty(value = "Server IP")
    private String ip;

    @ApiModelProperty(value = "Server address")
    private String akkaAddress;

    @ApiModelProperty(value = "Server status")
    private Integer status;

    @ApiModelProperty(value = "Server create time")
    private Long createTime;
}
