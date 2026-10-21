import{H as t,an as e,h as i,z as a,L as s,ak as r,aY as o,a9 as n,d0 as d,ch as l,d1 as c}from"./952f98a9.js";import{M as u,L as v,I as b,a4 as p,h,ap as f,H as m,G as g,A as y,aq as _,F as $,Q as x,aa as D,a2 as w,P as C,an as I,K as S,v as L,e as A,ah as k}from"./216055dc.js";import{B as T,a as F}from"./722094db.js";import"./7f3d7ca9.js";import{B as E}from"./41ed0536.js";import{B as P}from"./77df3611.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./be12d7a2.js";import"./72e6e777.js";const z=t((t=>class extends(e(t)){_fireEvent(t,e={}){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}}));function B(t,e,a=null,s="",r="",o="simple-list"){return i`
      <div class="${o}">
        <div class="list-pairs">
          <div class="columns">
            <bbva-type-text 
              text="${t}" 
              font-weight="350" 
              size="S" 
              tag="span"
            ></bbva-type-text>
            <bbva-type-text 
              text="${e}" 
              font-weight="350" 
              size="S" 
              tag="span"
            ></bbva-type-text>
          </div>
          ${a?i`
            <div class="columns">
              <bbva-type-link 
                id="${r}" 
                @click="${a}"
              >${s}</bbva-type-link>
            </div>
          `:""}
        </div>
      </div>
    `}function N(t){let e="";for(let i=0;i<t.length;i+=4)i>0&&(e+=" "),e+=t.substring(i,i+4);return e}var H=a`[data-tag-name=bbva-header-category] {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}

.list-pairs {
  display: flex;
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
  align-items: center;
  justify-content: space-between;
}

.data {
  display: block;
  padding: 1rem 1rem 0 1rem;
  flex-direction: column;
  align-items: flex-start;
}

.simple-list {
  display: block;
}
`;class j extends(u(v(z(e(s))))){static get is(){return"bbva-feature-product-detail-invest-contract-detail"}static get properties(){return{contractData:{type:Object},_showToast:{type:Boolean},_toastText:{type:String}}}static get scopedElements(){const t=[b,p,h,f,m,g];return j.scopedElementsFromClasses(t)}constructor(){super(),this.contractData={},this._showToast=!1,this._toastText=""}static get styles(){return[H,r("contract-detail-shared-styles")]}_openToast(t){var e,i,a,s;"contract"===t.currentTarget.id?(this._toastText=this.t("bbva-feature-product-detail-invest-toast-contract"),this._fireEvent("set-text-on-clipboard",null===(e=this.contractData)||void 0===e||null===(i=e.contract)||void 0===i?void 0:i.number.slice(-10))):(this._toastText=this.t("bbva-feature-product-detail-invest-toast-account"),this._fireEvent("set-text-on-clipboard",null===(a=this.contractData)||void 0===a||null===(s=a.contract)||void 0===s?void 0:s.associatedAccount.slice(-16)));this._showToast=!0}_editAliasNavigation(){this._fireEvent("on-edit-alias-invest-advisory-product-detail",{productId:this.contractData.contract.id,product:this.contractData.financialContractAlias,productType:"fund"})}_renderToast(){return i`
      <bbva-notification-toast 
        type="success" 
        ?show="${this._showToast}" 
        auto-hide
        fixed-bottom
        @notification-toast-close="${()=>{this._showToast=!1}}">
          <bbva-type-text 
            text="${this._toastText}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
      </bbva-notification-toast>
    `}_renderHeader(){return i`
      <bbva-header-main
        variant="first-level-sequential"
        text="${this.t("bbva-feature-product-detail-invest-contract-detail-header")}"
        show-left-icon
      ></bbva-header-main>
    `}_transformTitleProduct(t){return t.split(" ").map((t=>t===this.t("bbva-feature-product-detail-invest-bbva-contract-detail")?t:t.charAt(0).toUpperCase()+t.slice(1).toLowerCase())).join(" ")}_generalSection(){var t,e,a,s,r,o;return i`
      <div class="data">
        <bbva-header-category 
          text="${this.t("bbva-feature-product-detail-invest-contract-detail-general-title")}"
        ></bbva-header-category>
        ${B(this.t("bbva-feature-product-detail-invest-contract-detail-digital-service-title"),this._transformTitleProduct(null===(t=this.contractData)||void 0===t||null===(e=t.contract)||void 0===e?void 0:e.subProductTypeName))}
        ${B(this.t("bbva-feature-product-detail-invest-contract-detail-alias-title"),null===(a=this.contractData)||void 0===a||null===(s=a.contract)||void 0===s?void 0:s.alias,this._editAliasNavigation,this.t("bbva-feature-product-detail-invest-button-label-edit"),"edit-alias")}
        ${B(this.t("bbva-feature-product-detail-invest-contract-detail-contract-number-title"),N(null===(r=this.contractData)||void 0===r||null===(o=r.contract)||void 0===o?void 0:o.number.slice(-10)),this._openToast,this.t("bbva-feature-product-detail-invest-button-label-copy"),"contract")}
        ${B(this.t("bbva-feature-product-detail-invest-contract-detail-investment-service-title"),this.t("bbva-feature-product-detail-invest-contract-detail-investment-service-desc"))}
      </div>
    `}_accountSection(){var t,e;return i`
      <div class="data">
        <bbva-header-category 
          text="${this.t("bbva-feature-product-detail-invest-contract-detail-associated-account-title")}"
        ></bbva-header-category>
        ${B(this.t("bbva-feature-product-detail-invest-contract-detail-savings-account-title"),N(null===(t=this.contractData)||void 0===t||null===(e=t.contract)||void 0===e?void 0:e.associatedAccount.slice(-16)),this._openToast,this.t("bbva-feature-product-detail-invest-button-label-copy"),"account")}
      </div>
    `}render(){return i`
      ${super.render()}
      ${this._renderHeader()}
      ${this._generalSection()}
      <bbva-divider-default size="full"></bbva-divider-default>
      ${this._accountSection()}
      ${this._renderToast()}
    `}}var V=a`.detail-fund-card {
  padding: 1rem 1rem 0 1rem;
}

.simple-list-fund {
  display: flex;
  justify-content: space-between;
  padding: 1rem 1rem 0 1rem;
}

.simple-list {
  justify-content: space-between;
  padding: 0 1rem 0 1rem;
}

.header-product-detail-strategies {
  padding: 1rem 1rem 0 1rem;
}

.vertical-list {
  padding: 1rem 1rem 0 1rem;
}

.notification-help {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
  padding: 0 1rem 0 1rem;
}

.notification-message {
  margin: 1rem 1rem 0 1rem;
}

.performance-item {
  display: flex;
  flex-direction: row;
}

.data {
  display: block;
  padding: 1rem 1rem 0 1rem;
  flex-direction: column;
  align-items: flex-start;
}

.simple-list-link {
  display: block;
}

.list-pairs {
  display: flex;
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
  align-items: center;
  justify-content: space-between;
}
`;class O extends(u(v(z(e(s))))){static get is(){return"bbva-feature-product-detail-invest-fund-detail"}static get properties(){return{fundData:{type:Object},isLoaded:{type:Boolean},_showToast:{type:Boolean}}}static get scopedElements(){const t=[_,b,p,h,$,x,f,D,w,C,m,g];return O.scopedElementsFromClasses(t)}constructor(){super(),this.fundData={},this.isLoaded=!1,this._showToast=!1}static get styles(){return[V,y.primary,r("fund-detail-shared-styles")]}_backToProductDetail(){this._fireEvent("back-to-product-detail",-1)}_sendClipboardManager(){this._showToast=!0,this._fireEvent("set-text-on-clipboard",this.fundData.associatedAccount)}_getFundPerformance(t){let e="success",a="";return e=0===t?"pending":e,a=0===t?"no-change":a,e=t<0?"error":e,a=t<0?"decrease":a,i`
      <div class="performance-item">
          <bbva-type-text 
            text="${this.t("bbva-feature-product-detail-invest-fund-detail-percentage",{value:t.toFixed(2)})}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
          <bbva-badge-variability
              status="${a}"
              color="${e}"
          ></bbva-badge-variability>
      </div>`}_getAmountPanel(t){return i`
      <div class="header-product-detail-strategies">
        <bbva-panel-container panel-color="primary">
          <div>
            <bbva-type-amount 
              variant="2xl"
              type="bold"     
              currency-code="USD"
              local-currency="USD"
              amount="${t}"
            ></bbva-type-amount>
            <bbva-type-text 
              text="${this.t("bbva-feature-product-detail-invest-fund-detail-amount-invested-title")}"
              size="S"
            ></bbva-type-text>
          </div>
        </bbva-panel-container>
      </div>
    `}static _getSimpleList(t,e){return i`
      <div class="simple-list-fund">
        <bbva-type-text text="${t}" font-weight="350" size="S" tag="span"></bbva-type-text>
        <bbva-type-text text="${e}" font-weight="350" size="S" tag="span"></bbva-type-text>
      </div>
    `}_renderMainHeader(){var t;return i`
      <bbva-header-main
        variant="first-level-sequential"
        text="${null===(t=this.fundData)||void 0===t?void 0:t.headerTitle}"
        show-left-icon
        @header-main-icon-click="${this._backToProductDetail}"
      ></bbva-header-main>
    `}_renderFundDetail(){var t,e,a;return i`
      ${O._getSimpleList(this.t("bbva-feature-product-detail-invest-fund-detail-associated-fund-id"),null===(t=this.fundData)||void 0===t?void 0:t.associatedFundCode)}
      ${O._getSimpleList(this.t("bbva-feature-product-detail-invest-fund-detail-portfolio-percentage"),null===(e=this.fundData)||void 0===e?void 0:e.percentage)}
      <div class="simple-list-fund">
        <bbva-type-text 
          text="${this.t("bbva-feature-product-detail-invest-fund-detail-valuation-date")}" 
          font-weight="350" 
          size="S" 
          tag="span"
        ></bbva-type-text>
        <bbva-type-date
          date="${null===(a=this.fundData)||void 0===a?void 0:a.valuationDate}"
          font-weight="500"
          font-style="italic"
          .options = "${{day:"2-digit",month:"short",year:"numeric"}}"
        ></bbva-type-date>
      </div>
    `}_renderFundGeneralDescription(){var t,e,a;return i`
      <bbva-header-category 
        class="header-product-detail-strategies" 
        text="${this.t("bbva-feature-product-detail-invest-fund-detail-general-desc")}"
      ></bbva-header-category>
      ${B(this.t("bbva-feature-product-detail-invest-fund-detail-strategy-associated-fund"),null===(t=this.fundData)||void 0===t?void 0:t.generalDescription)}
      ${B(this.t("bbva-feature-product-detail-invest-fund-detail-serie"),null===(e=this.fundData)||void 0===e?void 0:e.serie)}
      ${B(this.t("bbva-feature-product-detail-invest-fund-detail-investment-term"),null===(a=this.fundData)||void 0===a?void 0:a.investmentTerm)}
    `}_renderAccountNumberArea(){var t;return i`
      <div class="data">
        <div class="simple-list-link">
          <bbva-header-category 
            text="${this.t("bbva-feature-product-detail-invest-fund-detail-associated-account-desc-header")}"
          ></bbva-header-category>
          ${B(this.t("bbva-feature-product-detail-invest-fund-detail-associated-account-desc"),N(null===(t=this.fundData)||void 0===t?void 0:t.associatedAccount.slice(-16)),this._sendClipboardManager,this.t("bbva-feature-product-detail-invest-fund-detail-link-text"),"fund-contract","")}
        </div>
      </div>
    `}_renderFundConditions(){var t,e,a;return i`
      <bbva-header-category 
        class="header-product-detail-strategies" 
        text="${this.t("bbva-feature-product-detail-invest-fund-detail-conditions-desc")}"
      ></bbva-header-category>
      ${B(this.t("bbva-feature-product-detail-invest-fund-detail-operation-date"),this.t("bbva-feature-product-detail-invest-fund-detail-operation-date-range",{start:moment(null===(t=this.fundData)||void 0===t?void 0:t.operationRangeStart,"HH:mm:ss").format("HH:mm"),end:moment(null===(e=this.fundData)||void 0===e?void 0:e.operationRangeEnd,"HH:mm:ss").format("HH:mm")}))}
      ${B(this.t("bbva-feature-product-detail-invest-fund-detail-liquidity"),null===(a=this.fundData)||void 0===a?void 0:a.liquidity)}
      <bbva-notification-help
        ambient="primary"
        class="notification-help"
        accessibility-label-icon="Info"
        text="${this.t("bbva-feature-product-detail-invest-fund-detail-info")}"> 
      </bbva-notification-help>
    `}_renderFundProfitability(){var t,e;return i`
      <bbva-header-category 
        class="header-product-detail-strategies" 
        text="${this.t("bbva-feature-product-detail-invest-fund-detail-profitability-historic")}"
      ></bbva-header-category>
        <div class="vertical-list">
          <bbva-type-text 
            text="${this.t("bbva-feature-product-detail-invest-fund-detail-profitability-historic-month")}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
          ${this._getFundPerformance(null===(t=this.fundData)||void 0===t?void 0:t.profitabilityRatiosMonthly)}
        </div>
        <div class="vertical-list">
          <bbva-type-text 
            text="${this.t("bbva-feature-product-detail-invest-fund-detail-profitability-historic-year")}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
          ${this._getFundPerformance(null===(e=this.fundData)||void 0===e?void 0:e.profitabilityRatiosAnnual)}
        </div>
        <bbva-notification-message 
          class="notification-message"
          book-title=""
          size="S"
          message-title="${this.t("bbva-feature-product-detail-invest-fund-detail-profitability-info")}"
        ></bbva-notification-message>
    `}_getNotificationToast(){return i`
      <bbva-notification-toast 
        type="success" 
        ?show="${this._showToast}" 
        auto-hide
        fixed-bottom
        @notification-toast-close="${()=>{this._showToast=!1}}">
          <bbva-type-text 
            text="${this.t("bbva-feature-product-detail-invest-fund-detail-toast-contract-text")}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
      </bbva-notification-toast>
    `}render(){var t;return this.isLoaded?i`
      ${super.render()}
      ${this._renderMainHeader()}
      ${this._getAmountPanel(null===(t=this.fundData)||void 0===t?void 0:t.amount)}
      ${this._renderFundDetail()}
      ${this._renderFundGeneralDescription()}
      <bbva-divider-default></bbva-divider-default>
      ${this._renderAccountNumberArea()}
      <bbva-divider-default></bbva-divider-default>
      ${this._renderFundConditions()}
      <bbva-divider-default></bbva-divider-default>
      ${this._renderFundProfitability()}
      ${this._getNotificationToast()}
      `:i``}}var M=a`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-carousel-default]::part(panelDataCarousel) {
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-carousel-default]::part(carouselTextAlias) {
  margin-top: 1.5rem;
}

[data-tag-name=bbva-carousel-default]::part(carouselTextAccount) {
  margin-top: 0.25rem;
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-carousel-default]::part(carouselTextAmount) {
  margin-top: 0.5rem;
}

[data-tag-name=bbva-carousel-default]::part(detailContractLink) {
  margin-top: 2rem;
  margin-bottom: 1.5rem;
}

.simple-list {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  padding: 1rem 1rem 0 1rem;
}

.portfolio-element {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: baseline;
  padding-top: 0.5rem;
}

.button-row-invest {
  padding: 1rem 0 0 0.375rem;
  margin: 0 4.5rem 0 0;
}

.header-product-detail-strategies {
  padding: 1rem 1rem 0 1rem;
}

.portfolio-list {
  padding: 1rem 1rem 0 1rem;
}

[data-tag-name=bbva-divider-default] {
  padding-top: 1rem;
}

.portfolio-item {
  padding-bottom: 1rem;
}

.portfolio-list:active {
  background-color: #fff;
}
`;class R extends(u(v(z(e(s))))){static get is(){return"bbva-feature-product-detail-invest-product-detail"}static get properties(){return{accountDetails:{type:Array},amount:{type:Number},errorLoadingStrategies:{type:Boolean},isLoaded:{type:Boolean},portfolioData:{type:Array},profile:{type:String},selectedContract:{type:String}}}static get scopedElements(){const t=[P,g,w,E,m,I,h,p,b,S];return R.scopedElementsFromClasses(t)}constructor(){super(),this.accountDetails=[],this.amount=0,this.errorLoadingStrategies=!1,this.isLoaded=!1,this.portfolioData=[],this.profile="",this.selectedContract=""}static get styles(){return[M,r("product-detail-shared-styles")]}_renderInvestments(){const t=[];return this.accountDetails&&this.accountDetails.length>0&&this.accountDetails.forEach((e=>{const a={content:i`
            <div class="panel-data" part="panelDataCarousel" id="panelDataCarousel">
              <bbva-type-text 
                part="carouselTextAlias" 
                id="carouselTextAlias" 
                text="${e.alias}" 
                font-weight="${o.fontWeight40}" 
                size="XL"
                tag="span"
              ></bbva-type-text>
              <bbva-badge-reference 
                part="carouselTextAccount" 
                id="carouselTextAccount" 
                number="${e.number}"
              ></bbva-badge-reference>
              <bbva-type-amount 
                part="carouselTextAmount" 
                id="carouselTextAmount" 
                variant="3xl"
                type="bold"     
                class="wrapper" 
                currency-code="$"
                local-currency="$"
                language="en"
                amount="${e.amount}"
              ></bbva-type-amount>
              <bbva-type-text
                part="carouselTextInvested" 
                id="carouselTextInvested"  
                text="${this.t("bbva-feature-product-detail-invest-product-detail-total-invested")}" 
                alignment="left" 
                size="M" 
                tag="span"
              ></bbva-type-text>
              <bbva-type-link 
                id="detailContractLink"
                part="detailContractLink" 
                @click="${()=>{this._fireEvent("panel-detail-link-click")}}" 
                size="S"
              >${this.t("bbva-feature-product-detail-invest-product-detail-contract-detail-button")}</bbva-type-link>
            </div>
        `};t.push(a)})),t}_onStrategyClick(t){this._fireEvent("portfolio-detail-strategy-click",{fund:t.currentTarget.id})}_onEnterPress(t){t.key===this.t("bbva-feature-product-detail-invest-key-product-detail")&&this._onStrategyClick(t)}_getStrategies(){this.errorLoadingStrategies=!1,this._fireEvent("funds-not-loaded-retry")}_getErrorPanel(){return i`
      <div class="panel-data" id="errorInFunds">
        <bbva-clip-microillustration size='M' microillustration="error"></bbva-clip-microillustration>
        <bbva-type-text text="${this.t("bbva-feature-product-detail-invest-product-detail-error-title")}" font-weight="${o.fontWeight50}" size="XL"></bbva-type-text>
        <bbva-type-text text="${this.t("bbva-feature-product-detail-invest-product-detail-error-subtitle")}" size="S"></bbva-type-text>
        <bbva-type-link id="retryButton" @click="${this._getStrategies}" size="S">${this.t("bbva-feature-product-detail-invest-product-detail-error-retry-button")}</bbva-type-link>
      </div>
    `}_getPortfolioList(t){return this.errorLoadingStrategies?this._getErrorPanel():t?t.map(((e,a)=>i`
        <div id="${a}" class="portfolio-list" @click="${this._onStrategyClick}" @keydown="${this._onEnterPress}">
          <bbva-type-text 
            text="${null==e?void 0:e.portfolioTitle}" 
            font-weight="${o.fontWeight40}" 
            size="L" 
            tag="span" 
            text-color="${n.primaryCoreLight}"
            ?loading="${!this.isLoaded}"
            ></bbva-type-text>
            <div class="portfolio-item">
              <div class="portfolio-element">
                <bbva-type-text ?loading="${!this.isLoaded}" text="${this.t("bbva-feature-product-detail-invest-product-detail-associated-fund")}" font-weight="350" size="S" tag="span"></bbva-type-text>
                <bbva-type-text ?loading="${!this.isLoaded}" text="${null==e?void 0:e.associatedFund}" font-weight="350" size="S" tag="span"></bbva-type-text>
              </div>
              <div class="portfolio-element">
                <bbva-type-text ?loading="${!this.isLoaded}" text="${this.t("bbva-feature-product-detail-invest-product-detail-invested-amount")}" font-weight="350" size="S" tag="span"></bbva-type-text>
                <bbva-type-amount ?loading="${!this.isLoaded}" variant="s" currency-code="USD" local-currency="USD" amount="${null!=e&&e.investedAmount?e.investedAmount:0}"></bbva-type-amount>
              </div>
              <div class="portfolio-element">
                <bbva-type-text ?loading="${!this.isLoaded}" text="${this.t("bbva-feature-product-detail-invest-product-detail-portfolio-percentage")}" font-weight="350" size="S" tag="span"></bbva-type-text>
                <bbva-type-text ?loading="${!this.isLoaded}" text="${null==e?void 0:e.percentage} %" font-weight="350" size="S" tag="span"></bbva-type-text>
              </div>
            </div>
            ${a===t.length-1?"":i`<bbva-divider-default></bbva-divider-default>`}
        </div>
      `)):""}_validateButtons(){return 0===this.amount?i`
        <bbva-button-row class="button-row-invest"
          id="twoButtons"
          ?loading="${!this.isLoaded}"
          .options="${[{icon:d(),label:this.t("bbva-feature-product-detail-invest-product-detail-button-contribution"),id:"button-1"},{icon:l(),label:this.t("bbva-feature-product-detail-invest-product-detail-button-edit-alias"),id:"button-3"}]}">
        </bbva-button-row>
      `:i`
      <bbva-button-row class="button-row-invest"
        ?loading="${!this.isLoaded}"
        id="threeButtons"
        .options="${[{icon:d(),label:this.t("bbva-feature-product-detail-invest-product-detail-button-contribution"),id:"button-1"},{icon:c(),label:this.t("bbva-feature-product-detail-invest-product-detail-button-withdrawal"),id:"button-2"},{icon:l(),label:this.t("bbva-feature-product-detail-invest-product-detail-button-edit-alias"),id:"button-3"}]}">
      </bbva-button-row>
    `}_renderHeader(){return i`
      <bbva-header-main
        variant="first-level-sequential"
        text="${this.t("bbva-feature-product-detail-invest-product-detail-header")}"
        show-left-icon
        @header-main-icon-click="${()=>this._fireEvent("exit-product-detail")}"
      ></bbva-header-main>
    `}_renderCarousel(){const t=[{tagName:"bbva-type-text",class:g},{tagName:"bbva-type-amount",class:w},{tagName:"bbva-badge-reference",class:E},{tagName:"bbva-type-link",class:m}];return i`
      <bbva-carousel-default
        id="swipeFullScreen"
        type="swipe"
        hide-gradient
        selected="${this.selectedContract}"
        .scopedComponents="${t}"
        .items="${this._renderInvestments()}" 
      ></bbva-carousel-default>
    `}_renderSimpleList(){return i`
      <div class="simple-list">
        <bbva-type-text ?loading="${!this.isLoaded}" text="${this.t("bbva-feature-product-detail-invest-product-detail-investment-profile")}" font-weight="350" size="S" tag="span"></bbva-type-text>
        <bbva-type-text ?loading="${!this.isLoaded}" text="${this.profile}" font-weight="350" size="S" tag="span"></bbva-type-text>
      </div>
    `}_renderHeaderCategory(){return 0!==this.portfolioData.length?i`
        <bbva-header-category ?loading="${!this.isLoaded}" class="header-product-detail-strategies" text="${this.t("bbva-feature-product-detail-invest-product-detail-strategy-header")}"></bbva-header-category>
      `:""}render(){return i`
      ${super.render()}
      ${this._renderHeader()}
      ${this._renderCarousel()}
      ${this._renderSimpleList()}
      ${this._validateButtons()}
      ${this._renderHeaderCategory()}
      ${this._getPortfolioList(this.portfolioData)}
    `}}const q={header:"bbva-feature-product-detail-invest-error-detail-header",title:"bbva-feature-product-detail-invest-error-detail-title",subtitle:"bbva-feature-product-detail-invest-error-detail-subtitle",event:"product-detail-error-unavailable-information"},G={header:"bbva-feature-product-contribution-invest-error-detail-header",title:"bbva-feature-product-contribution-invest-error-detail-title",subtitle:"bbva-feature-product-contribution-invest-error-detail-subtitle",event:"product-detail-error-unavailable-operation"},U={header:"bbva-feature-product-withdrawal-invest-error-detail-header",title:"bbva-feature-product-withdrawal-invest-error-detail-title",subtitle:"bbva-feature-product-withdrawal-invest-error-detail-subtitle",event:"product-detail-error-unavailable-operation"};var W=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-header-main-z-index: 1;
  --bbva-transition-container-text-align: left;
  --_transition-container-content-bg-color: #F4F4F4;
  z-index: 9;
}
`;class X extends(L(u(v(z(z(e(s))))))){static get is(){return"bbva-feature-product-detail-invest"}static get scopedElements(){const t=[S,T,F,A,k,g,j,O,R,...X.configurationScopedElements()];return X.scopedElementsFromClasses(t)}static get properties(){return{clientId:{type:String},contractDetailVisible:{type:Boolean},contracts:{type:Array},financialOverviewDetails:{type:Object},fundDetailLoaded:{type:Boolean},investContracts:{type:Object},investmentProfile:{type:String},portfolioStrategies:{type:Array},productDetailLoaded:{type:Boolean},productDetailVisible:{type:Boolean},productId:{type:String},selectedContractIndex:{type:Number},totalAmount:{type:Number},_contractDetailData:{type:Object},_errorData:{type:Object},_fundData:{type:Object},_fundDetailVisible:{type:Boolean},_fundNameMarketCatalog:{type:Object},_investmentFundsDataprovider:{type:Object},_investmentPortfolio:{type:Object},_openErrorModal:{type:Boolean},_portfolioInvestedConfiguration:{type:Object},_strategiesNotLoaded:{type:Boolean},_versionInvestmentFunds:{type:String}}}constructor(){super(),this.clientId="",this.config={loader:!0},this.contractDetailVisible=!1,this.contracts=[],this.financialOverviewDetails={},this.fundDetailLoaded=!1,this.investContracts={},this.investmentProfile="",this.portfolioStrategies=[],this.productDetailLoaded=!1,this.productDetailVisible=!1,this.productId="",this.selectedContractIndex=0,this.totalAmount=0,this._contractDetailData={},this._errorData={},this._fundData={},this._fundDetailVisible=!1,this._fundNameMarketCatalog={},this._investmentFundsDataprovider={},this._investmentPortfolio={},this._openErrorModal=!1,this._portfolioInvestedConfiguration={},this._strategiesNotLoaded=!1,this._versionInvestmentFunds="0"}static get styles(){return[W,r("bbva-feature-product-detail-invest-shared-styles")]}firstUpdated(){this._investmentFundsDataprovider=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-investment-funds"]'),this._investmentPortfolio=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-investment-portfolio"]')}init(){this.productDetailVisible=!0,this._openErrorModal=!1,this._strategiesNotLoaded=!1,this.productDetailLoaded=!1,this._versionInvestmentFunds="1",this.clearLoader(),this.getFinancialOverviewRelevantContracts()}returnToProductDetail(){this.productDetailVisible=!0}loginData(t){t&&t.grantingTicketUserId?this.clientId=t.grantingTicketUserId:this.clientId=""}getFinancialOverviewRelevantContracts(){var t,e,i,a,s;(this.investContracts=null===(t=this.financialOverviewDetails)||void 0===t||null===(e=t.data)||void 0===e||null===(i=e.contracts)||void 0===i?void 0:i.filter((({subProductType:t})=>"INVE"===(null==t?void 0:t.id))),(null===(a=this.investContracts)||void 0===a?void 0:a.length)>0)?(this.contracts=null===(s=this.investContracts)||void 0===s?void 0:s.map(((t,e)=>{var i,a,s,r,o,n;return(null==t?void 0:t.id)===this.productId&&(this.selectedContractIndex=e),{index:e,id:null==t?void 0:t.id,amount:X._serchById(X._serchById(null==t||null===(i=t.detail)||void 0===i?void 0:i.specificAmounts,"id","CURRENT_BALANCE","amounts"),"currency","MXN","amount"),associatedAccount:null==t||null===(a=t.relatedContracts[0])||void 0===a?void 0:a.contractId,alias:null==t?void 0:t.alias,subProductTypeName:null==t||null===(s=t.subProductType)||void 0===s?void 0:s.name,number:null==t||null===(r=t.detail)||void 0===r||null===(o=r.portfolio)||void 0===o?void 0:o.id,numberType:null==t||null===(n=t.numberType)||void 0===n?void 0:n.id}})),this._getInvestmentPortfolioAssessments(),this._contractDetailData={contract:this.contracts[this.selectedContractIndex],financialContractAlias:this.investContracts[this.selectedContractIndex]}):this._openError(q)}_getInvestmentPortfolioAssessments(){this._investmentPortfolio.getInvestmentPortfolioAssessments({participantId:this.clientId,contractId:this.contracts[this.selectedContractIndex].number})}getInvestmentPortfolioAssessmentsSuccess(t){if(t.detail&&t.detail.length>0){const[e]=t.detail,{names:i,riskProfile:a,version:s,currency:r}=e;this._portfolioInvestedConfiguration={riskProfile:a,version:s,currency:r};const o=i.find((t=>"ES"===t.id));this.investmentProfile=null!=o&&o.name.includes(" ")?o.name.split(" ")[0]:o.name,this._investmentPortfolio.getInvestmentPortfolio({"segment.id":"*",expand:"strategies",riskProfile:a,version:s})}else this.getInvestmentPortfolioAssessmentsError()}getInvestmentPortfolioAssessmentsError(){this._strategiesNotLoaded=!0,this.productDetailLoaded=!0,this.portfolioStrategies=[],this._portfolioInvestedConfiguration={},this._openError(q)}static createObject(t,e){const i={};return t.forEach(((t,a)=>{i[t]=e[a]})),i}getInvestmentPortfolioSuccess({detail:[t]}){var e,i,a;const s=null==t||null===(e=t.strategies)||void 0===e?void 0:e.map((t=>t.catalogStrategyId)),r=null==t||null===(i=t.strategies)||void 0===i?void 0:i.map((t=>{const[e]=t.investProducts;return null==e?void 0:e.product.name}));this._fundNameMarketCatalog=X.createObject(s,r),this.portfolioStrategies=null==t||null===(a=t.strategies)||void 0===a?void 0:a.map((t=>({associatedFund:this._fundNameMarketCatalog[t.catalogStrategyId],marketFund:t.catalogStrategyId,portfolioTitle:X._serchById(t.descriptions,"id","ES","name"),percentage:t.percentage}))),this._investmentFundsDataprovider.version="1",this._getListFunds()}getInvestmentPortfolioError(){this._strategiesNotLoaded=!0,this._openError(q)}_getListFunds(){var t;this._versionInvestmentFunds="1",null===(t=this._investmentFundsDataprovider)||void 0===t||t.getListFunds({"investment-fund-id":this.productId})}successListFunds(t){if(Array.isArray(t.detail)&&0!==t.detail.length){const e={BBVALIQ:0,"BBVAC+":0,BBVAGF:1,BBVACR:2},i=this.portfolioStrategies.map((e=>{const i=t.detail.find((t=>e.associatedFund===t.title.id));return{...e,investedAmount:i?i.fundPosition.amount:0,serie:i?i.serie:"",fundId:i?i.id:void 0,serializedNumber:i?i.serializedNumber:void 0,operationCodes:i?i.operationCodes:void 0}}));this.productDetailLoaded=!0,this.portfolioStrategies=i.sort(((t,i)=>e[t.associatedFund]-e[i.associatedFund]));const a=this.portfolioStrategies.reduce(((t,e)=>t+(e.investedAmount||0)),0);this.totalAmount=parseFloat(a),this.contracts[this.selectedContractIndex].amount=this.totalAmount,this._fireEvent("analytics-page-view-opportunities")}else this.productDetailLoaded=!0,this._openError(q)}errorListFunds(){this.portfolioStrategies=[],this.totalAmount=0,this._strategiesNotLoaded=!1,this.productDetailLoaded=!0}static _serchById(t,e,i,a){const s=t.find((t=>t[e]===i));return s?s[a]:null}reset(){this.fundDetailLoaded=!1,this.contractDetailVisible=!1,this.productDetailVisible=!0}navigationHandler(t){const{detail:e}=t,{fund:i}=e||{};-1===e?(this.reset(),this._fundDetailVisible=!1):i?(this.showLoader("full",!1,!1),this._investmentFundsDataprovider.version="0",this._investmentFundsDataprovider.getFund({"investment-fund-id":this.productId,"fund-id":this.portfolioStrategies[parseInt(i,10)].fundId})):(this._fireEvent("product-detail-contract-detail-click",t),this.productDetailVisible=!this.productDetailVisible,this.contractDetailVisible=!this.contractDetailVisible)}_openError(t){this._openErrorModal=!0,this._errorData=t,this._fireEvent(t.event)}_getStrategyGeneralDescription(t){const e={"BBVAC+":this.t("bbva-feature-product-detail-invest-product-detail-strategy-header-conservative-fund"),BBVAGF:this.t("bbva-feature-product-detail-invest-product-detail-strategy-header-flow-generation-fund"),BBVACR:this.t("bbva-feature-product-detail-invest-product-detail-strategy-header-growth-fund"),BBVALIQ:this.t("bbva-feature-product-detail-invest-product-detail-strategy-header-liquidity-fund")};return e[t]?e[t]:""}successGetFund(t){var e,i,a,s,r,o,n;const d=t.detail,l=this._getStrategyGeneralDescription(null==d?void 0:d.title.id),c=this.portfolioStrategies.find((t=>t.associatedFund===(null==d?void 0:d.title.id))),u={};u.headerTitle=null==c?void 0:c.portfolioTitle,u.amount=null==d||null===(e=d.fundPosition)||void 0===e?void 0:e.amount,u.associatedFundCode=null==d||null===(i=d.title)||void 0===i?void 0:i.id,u.percentage=this.t("bbva-feature-product-detail-invest-fund-detail-percentage",{value:null==c?void 0:c.percentage}),u.valuationDate=null==d?void 0:d.netAssetValueDate,u.generalDescription=l,u.serie=null==d?void 0:d.serie,u.investmentTerm=X._firstletterCapitalized(null==d||null===(a=d.investmentHorizon)||void 0===a?void 0:a.name),u.associatedAccount=X._serchById(this.contracts,"id",this.productId,"associatedAccount"),u.operationRangeStart=null==d||null===(s=d.operationsSchedule)||void 0===s||null===(r=s.tradingHours)||void 0===r?void 0:r.startHour,u.operationRangeEnd=null==d||null===(o=d.operationsSchedule)||void 0===o||null===(n=o.tradingHours)||void 0===n?void 0:n.finalHour,u.liquidity=X._firstletterCapitalized(null==d?void 0:d.operationsSchedule.redeemName),u.profitabilityRatiosMonthly=X._serchById(null==d?void 0:d.profitabilityRatios,"period","MONTHLY","value"),u.profitabilityRatiosAnnual=X._serchById(null==d?void 0:d.profitabilityRatios,"period","ANNUAL","value"),this._fundData={...u},this._fundDetailVisible=!0,this.fundDetailLoaded=!0,this.productDetailVisible=!1,this.contractDetailVisible=!1;const v=null==c?void 0:c.portfolioTitle.normalize("NFD").replace(/[\u0300-\u036f]/g,"").toLowerCase();this._fireEvent("product-detail-fund-detail-loaded",{level3:v}),this.clearLoader()}errorGetFund(){this._openError(q)}static _firstletterCapitalized(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_getCommonData(t){var e,i;let a="",s={};const r=X._serchById(this.contracts,"id",this.productId,"associatedAccount");if(r){var o,n;s=null===(o=this.financialOverviewDetails.data)||void 0===o||null===(n=o.contracts)||void 0===n?void 0:n.find((t=>(null==t?void 0:t.number)===r));const[t]=s.detail.specificAmounts,[e]=t.amounts;a=null==e?void 0:e.amount}else a=null;const d=X._serchById(this.contracts,"id",this.productId,"number");return{isContribution:t,numberType:null===(e=this.contracts[this.selectedContractIndex])||void 0===e?void 0:e.numberType,fundIndex:this.selectedContractIndex,contractNumberCiphered:this.productId,accountAlias:null===(i=s)||void 0===i?void 0:i.alias,contractNumber:d,investmentProfile:this.investmentProfile,associatedAccountNumber:r,associatedAccountAmount:a,portfolioConfiguration:this._portfolioInvestedConfiguration}}_contributionHandler(){const t=this._getCommonData(!0);Object.values(t).every((t=>null!=t&&!("object"==typeof t&&0===Object.keys(t).length)))?(t.strategies=this.portfolioStrategies,this.productDetailVisible=!1,this._fireEvent("contribution-invest-advisory-product-detail",t)):this._openError(G)}_withdrawalHandler(){const t=this._getCommonData(!1);t.fundAmount=this.contracts[this.selectedContractIndex].amount;Object.values(t).every((t=>null!=t&&!("object"==typeof t&&0===Object.keys(t).length)))?(t.strategies=this.portfolioStrategies,this.productDetailVisible=!1,this._fireEvent("withdrawal-invest-advisory-product-detail",t)):this._openError(U)}_editAliasHandler(){this.productDetailVisible=!1,this._fundDetailVisible=!1,this.contractDetailVisible=!1,this._fireEvent("edit-alias-invest-advisory-product-detail",{productId:this.productId,product:this.investContracts[this.selectedContractIndex],productType:"fund"})}_genericErrorModal(){return i`
      <bbva-help-modal
        header-text=${this.t(this._errorData.header)}
        full-height
        button-text="${this.t("bbva-feature-product-detail-invest-contract-detail-modal-button")}"
        link-text=""
        fixed-footer
        modal-type="warning"
        ?visible="${this._openErrorModal}"
        @visible-changed="${t=>{!1===t.detail&&(this._openErrorModal=!1)}}"
        @help-modal-footer-button-click="${this.getFinancialOverviewRelevantContracts}"
        @help-modal-header-click="${()=>{this._openErrorModal=!1}}"
      >
        <div class="custom-header" slot="slot-title">
          <bbva-clip-microillustration
            size= 'S'
            microillustration="error"
          ></bbva-clip-microillustration>
          <bbva-type-text 
            text="${this.t(this._errorData.title)}" 
            font-weight="${o.fontWeight40}" 
            size="3XL" 
            tag="span"
          ></bbva-type-text>
        </div>
        <div class="content" slot="slot-content">
          <bbva-type-text 
            text="${this.t(this._errorData.subtitle)}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
        </div>
      </bbva-help-modal>`}_carouselHandler(t){this.selectedContractIndex=t.detail,this.productId=this.contracts[this.selectedContractIndex].id,this.productDetailLoaded=!1,this._strategiesNotLoaded=!1,this._contractDetailData={contract:this.contracts[this.selectedContractIndex],financialContractAlias:this.investContracts[this.selectedContractIndex]},this._getInvestmentPortfolioAssessments()}_investmentPortfolioDataprovider(){return i`
     <bbva-dataprovider-investment-portfolio
        .headers="${this.headers}"
        .host="${this.host}"
        version="0"
        requiredToken="${this.requiredToken}"
        @get-investment-portfolio-assessments-events-success="${this.getInvestmentPortfolioAssessmentsSuccess}"
        @error-on-get-investment-portfolio-assessments-events="${this.getInvestmentPortfolioAssessmentsError}"
        @get-investment-portfolio-events-success="${this.getInvestmentPortfolioSuccess}"
        @error-on-get-investment-portfolio-events="${this.getInvestmentPortfolioError}"
     ></bbva-dataprovider-investment-portfolio>
    `}_investmentFunds(){return i`
      <bbva-dataprovider-investment-funds
        .headers="${this.headers}"
        .host="${this.host}"
        version="${this._versionInvestmentFunds}"
        requiredToken="${this.requiredToken}"
        @get-list-funds-events-success="${this.successListFunds}"
        @error-on-get-list-funds-events="${this.errorListFunds}"
        @get-fund-events-success="${this.successGetFund}"
        @error-on-get-fund-events="${this.errorGetFund}">
      </bbva-dataprovider-investment-funds>
    `}render(){return i`
    ${super.render()}
    ${this._investmentFunds()}
    ${this._investmentPortfolioDataprovider()}
    <bbva-transition-container id="productDetail"  ?visible="${this.productDetailVisible}">
      <div slot="slot-content">
        <bbva-feature-product-detail-invest-product-detail
          .portfolioData="${this.portfolioStrategies}"
          .accountDetails="${this.contracts}"
          .profile = "${this.investmentProfile}"
          .isLoaded="${this.productDetailLoaded}"
          .selectedContract="${this.selectedContractIndex}"
          .errorLoadingStrategies="${this._strategiesNotLoaded}"
          .amount="${this.totalAmount}"
          @carousel-default-item-select="${this._carouselHandler}"
          @panel-detail-link-click="${this.navigationHandler}"
          @portfolio-detail-strategy-click="${this.navigationHandler}"
          @button-row-item-button-1-click="${this._contributionHandler}"
          @button-row-item-button-2-click="${this._withdrawalHandler}"
          @button-row-item-button-3-click="${this._editAliasHandler}"
          @funds-not-loaded-retry="${this.getFinancialOverviewRelevantContracts}"
          @exit-product-detail="${()=>{this.productDetailLoaded=!1}}"
        ></bbva-feature-product-detail-invest-product-detail>
      </div>
    </bbva-transition-container>
    <bbva-transition-container id="contractDetail" ?visible="${this.contractDetailVisible}">
      <div slot="slot-content">
        <bbva-feature-product-detail-invest-contract-detail
          .contractData="${this._contractDetailData}"
          @header-main-icon-click="${this.navigationHandler}"
          @on-edit-alias-invest-advisory-product-detail="${this._editAliasHandler}"
        ></bbva-feature-product-detail-invest-contract-detail>
      </div>
    </bbva-transition-container>
    <bbva-transition-container id="fundDetail" ?visible="${this._fundDetailVisible}">
      <div slot="slot-content">
        <bbva-feature-product-detail-invest-fund-detail
          .fundData="${this._fundData}"
          .isLoaded="${this.fundDetailLoaded}"
          @back-to-product-detail="${this.navigationHandler}"
        ></bbva-feature-product-detail-invest-fund-detail>
      </div>
    </bbva-transition-container>
    ${this._genericErrorModal()}
    `}}var Q=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class K extends X{static get is(){return"bbva-feature-product-detail-invest-mx"}static get properties(){return{}}static get styles(){return[Q,X.styles,r("bbva-feature-product-detail-invest-mx-shared-styles")]}}customElements.define(K.is,K);
