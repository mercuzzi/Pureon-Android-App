package com.pureon.pur_wallet.event

import com.pureon.pur_wallet.item.Token

/**
 * Created by BaojunCZ on 2018/11/20.
 */
class TokenBalanceEvent(var item: Token, var address: String)