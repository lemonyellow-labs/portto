package ru.vyukov.portto.porttoserver;


import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.List;

/**
 * @author Oleg Vyukov
 */
@Data
public class PortToClientConfig {

    /**
     * PortTo servers in host:port format
     */
    @NotNull
    @Size(min = 1)
    private List<InetSocketAddress> serversList = Arrays.asList(
            new InetSocketAddress("portto-server", 32222), //local network default host
            new InetSocketAddress("portto.vyukov.ru", 32222) // public sandbox
    );


    @NotNull
    @Size(min = 1)
    private String userName = "portto";

    private String password = "qwerty";


    /**
     * If privateKeyPath != null using key based authorization. Password protected keys not support
     */
    private String privateKeyPath;

    private int socketTimeout = 10_0000;


}
