package com.kadmiv.coshare_erp.web.screens.card;

import com.haulmont.cuba.gui.screen.*;
import com.kadmiv.coshare_erp.entity.card.Card;

@UiController("coshareerp_Card.browse")
@UiDescriptor("card-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CardBrowse extends MasterDetailScreen<Card> {
}