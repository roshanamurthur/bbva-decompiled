import{z as t,a_ as e,a$ as i,b0 as a,b1 as r,b2 as s,a8 as d,ab as n,ad as c,ar as l,a9 as o,an as h,b3 as u,aX as y,L as m,ak as b,h as g,b4 as p,b5 as C,b6 as v,b7 as $,ag as f,aL as S,b8 as T,b9 as x,o as _,f as k,ba as B,g as A}from"./952f98a9.js";import{ao as I,ap as L}from"./7f3d7ca9.js";const E={light:t`
    ${e.light}
    ${i.light}
    ${a.light}
    ${r.light}
    ${s.light}
  `},z=new l;var w=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--cards-list-cards-dark-mode-bg, var(--colorsPrimaryCoreLightened, ${d(o.primaryCoreLightened)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1rem;
}

[data-tag-name=bbva-link] {
  display: inline-block;
  padding: 0 1rem 0.5rem;
}

.empty-content {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
}
.empty-content .image {
  padding: 1rem 1rem auto;
  width: 9rem;
  margin: 1rem auto 1rem;
}
.empty-content .content {
  padding: 0 1rem 1.5rem;
}
.empty-content .title {
  margin: 0 0 0.5rem;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${d(n.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${d(c.typeLarge)});
}
.empty-content .description {
  margin: 0 auto;
}
${z.mediaRules()}`;const P={INOPERATIVE:"neutral",BLOCKED:"error"},R={INOPERATIVE:"off",BLOCKED:"blocked"},V={CREDIT_CARD:"credit",DEBIT_CARD:"debit",PREPAID_CARD:"prepay"},D={VISA:"visa",MASTER_CARD:"mastercard"};class M extends(h(u(y(m)))){static get is(){return"cards-list-cards"}static get scopedElements(){const t=[p,C,v,I,$,f,S];return M.scopedElementsFromClasses(t)}static get properties(){return{cards:Array,cardsApiVersion:{type:String,attribute:"cards-api-version"},cacheType:{type:String,attribute:"cache-type"},cacheKey:{type:String,attribute:"cache-key"},visibleChars:{type:Number,attribute:"visible-chars"},localCurrency:{type:String,attribute:"local-currency"},filterByStatus:{type:String,attribute:"filter-by-status"},filterByCardId:{type:Array,attribute:"filter-by-card-id"},filterByIndicator:{type:Object,attribute:"filter-by-indicator"},listTitle:{type:String,attribute:"list-title"},titleLevel:{type:Number,attribute:"title-level"},amountVariant:{type:String,attribute:"amount-variant",reflect:!0},contentAmountSize:{type:String,attribute:"content-amount-size"},showLink:{type:Boolean,attribute:"show-link"},dividerSize:{type:String,attribute:"divider-size"},hideDivider:{type:Boolean,attribute:"hide-divider"},linkText:{type:String,attribute:"link-text"},emptyStateHeading:{type:String,attribute:"empty-state-heading"},emptyStateText:{type:String,attribute:"empty-state-text"},payCompatibility:{type:String,attribute:"pay-compatibility"},variant:{type:String,attribute:"variant",reflect:!0},headerVariant:{type:String,attribute:"header-variant"},_loading:{type:Boolean}}}constructor(){super(),this.cards=[],this._loading=!1,this.cardsApiVersion="0",this.listTitle="cards-list-cards-list-title",this.titleLevel=3,this.visibleChars=5,this.amountVariant="default",this.showLink=!1,this.dividerSize="full",this.hideDivider=!1,this.payCompatibility="",this.variant="extended",this.headerVariant="",this.emptyStateHeading="",this.emptyStateText="",this.contentAmountSize="xl"}static get styles(){return[w,E.light,b("cards-list-cards-shared-styles")]}static getCardStatusBadgeType(t={},e=P){return(e||{})[(t.status||{}).id]||null}static getCardFrontImage(t={},e="FRONT_CARD"){const i=(t.images||[]).find((t=>t.id===e));return i&&i.url?i.url:null}static getCardPrimaryAmount(t={}){const e=M.getCardPrimaryCurrency(t);return((t.availableBalance||{}).currentBalances||[]).filter((t=>t.currency===e)).reduce(((t,e)=>t+e.amount),0)}static getCardPrimaryCurrency(t={},e="EUR"){const i=(t.currencies||[]).find((t=>t.isMajor));return i&&i.currency?i.currency:e}static getCardTitle(t={}){return t.alias||(t.product||{}).name}static getCardType(t={}){return t.cardType&&V[t.cardType.id]}static getCardBrand(t={}){return t.brandAssociation&&D[t.brandAssociation.id]}static getCardStatus(t={},e=R){return(e||{})[(t.status||{}).id]||null}get dmCards(){return this._dmCards||(this._dmCards=this.shadowRoot.querySelector("#dmCards")),this._dmCards}get filteredCards(){return this.filterByCardId&&this.filterByCardId.length>0?this.cards.filter((t=>!this.filterByCardId.some((e=>t.id===e)))):this.cards}get header(){return this.listTitle?g`
          <bbva-header-category
            part="header"
            tabindex="0"
            variant=${this.headerVariant}
            heading-level=${this.titleLevel}
            text="${this.t(this.listTitle)}"
          ></bbva-header-category>
        `:g``}get bodyList(){return this._loading?g`
        <bbva-list-card loading show-card></bbva-list-card>
      `:this.filteredCards.length>0?this.filteredCards.map(((t,e,i)=>g`
          ${this._renderCard(t)}
          ${!this.hideDivider&&e<i.length-1?g`
                <bbva-divider size="${this.dividerSize}"></bbva-divider>
              `:""}
        `)):g`
      <div class="empty-content">
        <bbva-clip-microillustration
          class="image"
          size="XL"
          microillustration="emptystateday"
        ></bbva-clip-microillustration>
        <div class="content">
          <bbva-text
            tabindex="0"
            class="title"
            text="${this.t(this.emptyStateHeading)}"
            size="L"
            alignment="center"
            inherit
          ></bbva-text>
          <bbva-text
            tabindex="0"
            class="description"
            text="${this.t(this.emptyStateText)}"
            size="S"
            alignment="center"
            inherit
          ></bbva-text>
        </div>
      </div>
    `}get isCompactMode(){return"compact"===this.variant}_onClickCard(t,e="item"){const i=!!this.linkText&&this.isCompactMode,a="link"===e;(!i&&!a||i&&a)&&(this._dispatch("cards-list-cards-select-card",null==t?void 0:t.id),this._dispatch("cards-list-cards-card",t))}_receivedCards(t){this.cards=[...t||[]],this._loading=!1}_renderCard(t){if(!t)return g``;const e=M.getCardStatus(t),i=e?`cards-list-cards-status-${e}`:null;return g`
      <bbva-list-card
        ?compact-mode=${this.isCompactMode}
        ?no-link=${!this.showLink||this.linkText}
        .language=${this.language}
        .localCurrency=${this.localCurrency}
        show-card
        .cardImage=${M.getCardFrontImage(t)}
        .cardTitle=${M.getCardTitle(t)}
        .cardType=${M.getCardBrand(t)}
        .cardVariant=${M.getCardType(t)}
        .cardStatus=${M.getCardStatus(t)}
        .numProduct=${t.number}
        .badgeText=${i}
        .badgeType=${M.getCardStatusBadgeType(t)}
        .amount=${this.localCurrency?M.getCardPrimaryAmount(t):""}
        .currencyCode=${this.localCurrency?M.getCardPrimaryCurrency(t,this.localCurrency):""}
        .contentText=${this.localCurrency?this.t("cards-list-cards-primary-content-text"):""}
        .amountVariant=${this.amountVariant}
        .contentAmountSize=${this.contentAmountSize}
        .payCompatibility=${this.payCompatibility}
        .visibleChars=${this.visibleChars}
        @click=${()=>this._onClickCard(t)}
      >
      </bbva-list-card>
      ${this._renderLink(t)}
    `}_renderLink(t){return g`
      ${this.linkText&&this.isCompactMode?g`
            <bbva-link
              text=${this.linkText}
              @click=${()=>this._onClickCard(t,"link")}
            ></bbva-link>
          `:""}
    `}_showError(t){this._loading=!1,this._dispatch("cards-list-cards-error",t)}_dispatch(t,e,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:i,composed:a}))}async requestCards(){this._loading=!0,await this.updateComplete,this.dmCards.getCards({...this.filterByStatus?{"status.id":this.filterByStatus}:{},...this.filterByIndicator?this._filterByIndicatorParams:{}})}get _filterByIndicatorParams(){var t,e;return{"indicators.id":null===(t=this.filterByIndicator)||void 0===t?void 0:t.id,"indicators.isActive":!(null===(e=this.filterByIndicator)||void 0===e||!e.isActive)}}reset(){this.cards=[],this._loading=!1,this.filterByCardId=null,this.filterByStatus=null,this.filterByIndicator=null}resetCache(){this.dmCards.resetCache()}render(){return g`
      <main>
        <bbva-global-cards-api-dm
          id="dmCards"
          .host="${this.host}"
          .version="${this.cardsApiVersion}"
          .requiredToken="${this.requiredToken}"
          ?native="${this.native}"
          .cards=${this.cards}
          .cacheKey="${this.cacheKey}"
          .cacheType="${this.cacheType}"
          @cards-api-dm-fetch="${t=>this._receivedCards(t.detail)}"
          @cards-api-dm-fetch-error="${t=>this._showError(t.detail)}"
          @api-dm-error="${t=>this._showError(t.detail)}"
        >
        </bbva-global-cards-api-dm>
        <div ambient="light">
          ${this.header} ${this.bodyList}
        </div>
      </main>
    `}}A("colors.cool90");export{M as C,E as a};
