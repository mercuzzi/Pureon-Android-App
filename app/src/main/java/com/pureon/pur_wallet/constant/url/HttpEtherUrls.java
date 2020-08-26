package com.pureon.pur_wallet.constant.url;

/**
 * Created by duanyytop on 2018/11/18
 */
public class HttpEtherUrls {

    // Ether node host
    public static final String ETH_NODE_MAIN_URL = "https://mainnet.infura.io/v3/9094bf7e58664495bcf6d7cf075c0937";
    public static final String ETH_NODE_URL_RINKEBY = "https://rinkeby.infura.io/v3/9094bf7e58664495bcf6d7cf075c0937";
    public static final String ETH_NODE_URL_KOVAN = "https://kovan.infura.io/llyrtzQ3YhkdESt2Fzrk";
    public static final String ETH_NODE_URL_ROPSTEN = "https://ropsten.infura.io/v3/9094bf7e58664495bcf6d7cf075c0937";

    // Ether transaction list url
    public static final String ETHER_SCAN_API_KEY = "AEDX9X9ZGGB74K6ZDHTUQCV4CXHD8JV1SM";
    public static final String ETH_MAIN_BASE_URL = "https://api.etherscan.io/api";
    public static final String ETH_RINKEBY_BASE_URL = "https://api-rinkeby.etherscan.io/api";
    public static final String ETH_KOVAN_BASE_URL = "https://api-kovan.etherscan.io/api";
    public static final String ETH_ROPSTEN_BASE_URL = "https://api-ropsten.etherscan.io/api";

    public static final String END_URL = "?apikey=" + ETHER_SCAN_API_KEY
            + "&module=account&action=txlist&sort=desc&address=%s&page=%s&offset=%s";
    public static final String ERC20_END_URL = "?apikey=" + ETHER_SCAN_API_KEY
            + "&module=account&action=tokentx&sort=desc&contractaddress=%s&address=%s&page=%s&offset=%s";
    public static final String ETH_TRANSACTION_STATUS_URL = "?apikey=" + ETHER_SCAN_API_KEY
            + "&module=transaction&action=gettxreceiptstatus&txhash=%s";

}
