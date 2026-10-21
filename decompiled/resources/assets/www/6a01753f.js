import{H as t,an as e,z as i,a8 as a,ac as r,ad as s,ab as o,ar as n,a9 as l,aa as c,b_ as d,a as p,aJ as h,cE as m,F as b,cF as u,b$ as g,ak as v,bx as y,h as f,bt as _,c0 as k,cG as $,g as x,ap as S,L as w,aq as A,bw as T,av as q,bl as F,i as C,aw as L,b4 as I,_ as E,b5 as P,cD as M,b0 as D,au as R,bd as O,as as B,at as N,V as W,b6 as z,S as j,ag as H,af as V,bk as U,A as G,E as X}from"./952f98a9.js";import{bF as Y,bG as J}from"./7f3d7ca9.js";import"./9cadd5ad.js";import{ay as K}from"./216055dc.js";import"./12c02091.js";import"./67b05b69.js";import{B as Z}from"./a7c05d27.js";import"./25ca3c7f.js";import"./a2b15c7c.js";const Q=["bbva","educa","c.v","s.a"],tt=["+"],et=Intl.NumberFormat,it=(t,e,i={})=>{t.dispatchEvent(new CustomEvent(e,{detail:i,bubbles:!0,composed:!0}))},at=t=>Array.isArray(t)?t&&t.length:t&&Object.entries(t).length>0,rt=(t,e,i)=>t&&e?(e=Array.isArray(e)?e:e.split(".")).reduce(((t,a,r)=>{const s=t[a],o=r+1===e.length;return s===Object(s)||o?s||0===s||!1===s?s:void 0!==i?i:s:i||{}}),t):i,st=t=>"string"==typeof t?t.toLowerCase().charAt(0).toUpperCase()+t.toLowerCase().slice(1):t,ot=(t,e=0)=>{const i=((t,e=0,i=" ",a=!0,r=!1,s=!1)=>{if("string"==typeof t)return t.toLowerCase().split(i).map(((t,i)=>(!e||t.length>e)&&(i>0||a)||0===i&&a&&s?st(t):t)).join(r?"":" ")})(t,e);return(t=>{if("string"==typeof t){const e=(t=>"string"==typeof t?t.replace(/\*/g,""):t)(t);return e.split(" ").map((t=>{try{const e=new RegExp(`\\b${t}\\b`,"g"),i=(t.match(e)?t.match(e)[0].toLowerCase():t).toLowerCase(),a=Q.find((t=>i.includes(t)));return a&&!i.split(a).some((t=>t.match(/[a-z\d]/gi)))?t.toUpperCase():t}catch(e){return t}})).join(" ")}})(i)};function nt(t,e,i,a){const r=Object.create(nt.prototype);return r.code=t,r.selectedConfig={className:e,openMaximized:!1,iconOnlyFullHeight:!0,acceptBtLabel:i,template:{type:"paragraphs",values:a}},r}const lt=(t,e="MXN",i="es-MX")=>et(i,{style:"currency",currency:e,useGrouping:!0,maximumSignificantDigits:21}).format(t),ct=(t,e="es-MX")=>et(e,{maximumSignificantDigits:21}).format(t);function dt(t){const e=new Date(`December 14, 91 ${t}`);return`${e.getHours()}:${e.getMinutes()<10?`0${e.getMinutes()}`:e.getMinutes()}`}function pt(t){let e=rt(t,"data.ownedShares","0"),i=rt(t,"data.warrantShares","0");return"string"==typeof e&&(e=e.replaceAll(",","")),"string"==typeof i&&(i=i.replaceAll(",","")),ct(Number(e)+Number(i))}function ht(t,e="MONTHLY"){const i=rt(t,"data.profitabilityRatios",[]);let a="0.00%";return i.forEach((t=>{var i;t.period===e&&"number"==typeof t.value&&(a=0===t.value?"0.00%":`${parseFloat((i=t.value,i.toString().match(/^-?\d+(?:\.\d{0,2})?/)[0])).toFixed(2)}%`)})),a}const mt="",bt=t((t=>class extends(e(t)){static get properties(){return{mode:{type:String},host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},headers:{type:Object},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},language:{type:String,attribute:"language"},investmentFundsApiVersion:{type:String},formatDate:{type:String},heroImage:{type:String},fundDetailRetries:{type:Object},showFundOperatives:{type:Boolean},showFundDetail:{type:Boolean},enableStorageAndForward:{type:Boolean},showFundsList:{type:Boolean},featureFlags:{type:Array}}}constructor(){super(),this.mode="detail",this.investmentFundsApiVersion="0",this.localCurrency="MXN",this.currencyCode="MXN",this.language="es-MX",this.native=!1,this.formatDate="DD MMM YYYY",this.heroImage="./images/errors/caution.svg",this.fundDetailRetries={intents:0,maxAttempts:3},this.showFundDetail=!1,this.showFundOperatives=!1,this.enableStorageAndForward=!1,this.showFundsList=!1,this.featureFlags=[{module:"patrimonial",feature:"equityContractsShowFundDetail"},{module:"patrimonial",feature:"equityContractsShowFundOperatives"},{module:"patrimonial",feature:"equityContractsEnableStorageAndForward"},{module:"patrimonial",feature:"equityContractsShowFundsList"}]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.setAttribute("id",`equity-contracts-${this.mode}`)}_getEquityContractsSupplies(t={},e={},i={},a="",r){return{fundId:rt(t,"data.fundId",mt),number:rt(e,"number",mt),investmentFundId:rt(e,"contractId",mt),fundKey:rt(t,"data.title.name",mt),fundName:ot(rt(t,"data.alias",mt),0),accountNumber:rt(e,"relatedContracts.0.id",mt),contractAlias:ot(rt(e,"alias",mt),0),contractNumber:rt(e,"id",mt),serie:rt(t,"data.serie",mt),totalCash:i,fundBalance:this._getFundAmount(t,!0),titlePrice:rt(t,"data.netAssetValue","0"),operationsSchedule:rt(t,"data.operationsSchedule",mt),investmentHorizon:rt(t,"data.investmentHorizon.id",mt).toLowerCase(),enableStorageAndForward:r,operationType:a}}_getSummary(t={}){return{titleHeading:ot(rt(t,"data.alias",mt),0),amount:this._getFundAmount(t),currency:rt(t,"data.fundPosition.currency","MXN"),descriptionProcess:this.t("bbva-manager-equity-contracts-detail-summary-valuation"),items:[{label:this.t("bbva-manager-equity-contracts-detail-summary-station"),description:rt(t,"data.title.name",mt),hideSummaryTop:!0,hidePaddingBottom:!0},{label:this.t("bbva-manager-equity-contracts-detail-summary-titles"),description:pt(t),hideSummaryTop:!0,hidePaddingBottom:!0},{id:"title-price",icon:"coronita:help",label:this.t("bbva-manager-equity-contracts-detail-summary-price-per-title"),description:lt(rt(t,"data.netAssetValue.amount",0)),hideSummaryTop:!0,hidePaddingBottom:!0},{icon:mt,label:this.t("bbva-manager-equity-contracts-detail-summary-valuation-date"),descriptionDate:!0,description:(e=rt(t,"data.netAssetValueDate",mt),i=this.formatDate,window.moment.parseZone(e).format(i)),hideSummaryTop:!0,hidePaddingBottom:!0}]};var e,i}_getMoreInfo(t={},e={}){const i=rt(t,"data.operationsSchedule.specificRedeemHours.startHour","00:00:00"),a=rt(t,"data.operationsSchedule.specificRedeemHours.finalHour","00:00:00"),r={schedule:`${dt(i)} a ${dt(a)}`},s=this.t("bbva-manager-equity-contracts-detail-operation-hours",r);return[{header:this.t("bbva-manager-equity-contracts-detail-more-info-general"),items:[{label:this.t("bbva-manager-equity-contracts-detail-more-info-fund-classification"),description:st(rt(t,"data.fundType",mt)),variant:"stacked"},{label:this.t("bbva-manager-equity-contracts-detail-more-info-fund-series"),description:rt(t,"data.serie",mt),variant:"stacked"},{label:this.t("bbva-manager-equity-contracts-detail-more-info-inversion-horizon"),description:st(rt(t,"data.investmentHorizon.id",mt)),variant:"stacked"},{label:this.t("bbva-manager-equity-contracts-detail-more-info-risk-level"),description:st(rt(t,"data.profitabilityRiskScale.description",mt)),variant:"stacked"},{id:"copy-contract",label:this.t("bbva-manager-equity-contracts-detail-more-info-contract-number"),icon:mt,description:rt(e,"number",mt),variant:"stacked",actionLink:this.t("bbva-manager-equity-contracts-detail-more-info-copy")}]},{header:this.t("bbva-manager-equity-contracts-detail-more-info-conditions"),items:[{id:"hours-of-operation",class:"more-info--key",icon:"coronita:help",label:this.t("bbva-manager-equity-contracts-detail-more-info-hours-of-operation"),description:" "},{class:"more-info--value",label:s},{id:"liquidity-to-buy",class:"more-info--key",icon:"coronita:help",label:this.t("bbva-manager-equity-contracts-detail-more-info-liquidity-to-buy"),description:" "},{class:"more-info--value",label:st(rt(t,"data.operationsSchedule.subscriptionName",mt))},{id:"liquidity-to-sell",class:"more-info--key",icon:"coronita:help",label:this.t("bbva-manager-equity-contracts-detail-more-info-liquidity-to-sell"),description:" "},{class:"more-info--value",label:st(rt(t,"data.operationsSchedule.redeemName",mt))}]},{header:this.t("bbva-manager-equity-contracts-detail-more-info-historical-yields"),items:[{label:this.t("bbva-manager-equity-contracts-detail-more-info-historical-yields-last-month"),description:ht(t),descriptionAlignment:"left",descriptionMedium:!0,variant:"stacked"},{icon:mt,label:this.t("bbva-manager-equity-contracts-detail-more-info-historical-yields-last-twelve-months"),description:ht(t,"ANNUAL"),descriptionAlignment:"left",descriptionMedium:!0,variant:"stacked"}]}]}_getFundAmount(t,e=!1){const i=rt(t,"data.fundPosition.amount",0)+rt(t,"data.availableFundPosition.amount",0);return e?{amount:i,currency:this.currencyCode}:i}_fullScreenModal(t,e){const i={code:"equity-contracts-ppg-code",selectedConfig:{className:"full-height-error custom-hero-image",hideCloseIcon:!1,openMaximized:!0,closeOnPrimaryButton:!0,title:"equity-contracts-withdrawal-header-title",heroImage:this.heroImage,cancelEventsLinked:!0,acceptBtLabel:"equity-contracts-ppg-accept-button",cancelBtLabel:"equity-contracts-ppg-cancel-button",onCancelEvent:()=>it(this,"bbva-manager-equity-contracts-exit-page-event"),onAcceptEvent:()=>it(this,t,e),template:{type:"paragraphs",values:[{title:"equity-contracts-operation-warning-ppg-title"},{text:"equity-contracts-operation-warning-ppg-text"}]}}};it(this,"bbva-manager-equity-contracts-full-error-event",i)}_halfScreenModal(t){const e={code:"equity-contracts-common-error",selectedConfig:{className:"custom error",openMaximized:!1,iconOnlyFullHeight:!0,cancelEventsLinked:!0,acceptBtLabel:this._getAcceptBtLabel(),cancelBtLabel:this._getCancelBtLabel(),onAcceptEvent:()=>this._handleOnAcceptEvent(t),onCancelEvent:()=>it(this,"bbva-manager-equity-contracts-exit-page-event"),template:{type:"paragraphs",values:[{icon:"coronita:alert",iconClass:"icon-size-24",class:"warning-dark"},{text:this._getTextError()}]}}};it(this,"bbva-manager-equity-contracts-common-error-event",e)}_getAcceptBtLabel(){return this.fundDetailRetries.intents>this.fundDetailRetries.maxAttempts?"equity-contracts-operation-common-error-close-button":"equity-contracts-operation-common-error-retry-button"}_getCancelBtLabel(){return this.fundDetailRetries.intents>this.fundDetailRetries.maxAttempts?mt:"equity-contracts-operation-common-error-close-button"}_handleOnAcceptEvent(t){this.fundDetailRetries.intents>this.fundDetailRetries.maxAttempts?it(this,"bbva-manager-equity-contracts-exit-page-event"):this.getFundDetail(t)}_getTextError(){return this.fundDetailRetries.intents>this.fundDetailRetries.maxAttempts?"equity-contracts-operation-retry-latter-text":"equity-contracts-operation-retry-again-text"}})),ut=new n;var gt=i`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${a(r.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${a(s.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(o.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(o.medium.fontStyle)});
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${a(l.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${a(l.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

label {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  label {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${ut.mediaRules()}`;var vt=i`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new n).mediaRules()}`;const yt=new n;const ft={dark:i`
    ${i`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${a(l.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${yt.mediaRules()}`}
    ${d.dark}
  `,light:i`
    ${vt}
    ${d.light}
  `};class _t extends(p(h(m))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":b,"bbva-core-image":u,"bbva-badge-notification":g}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,gt,v("bbva-button-action-shared-styles"),y(),ft.light,ft.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?f`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?f`<div class="app-pay-icon">${_[this.appPayIcon]}</div>`:f`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return f`
      ${this.notifications?f`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:f` ${this.getIcon} `}
      <label onclick="void(0)"> ${this.label} </label>
      <slot></slot>
      ${this._action}
    `}}x("colors.primarySubdued"),x("colors.primaryCoreLight");const kt=new n;var $t=i`:host {
  --_invoker-bg-color: var(--bbva-list-swipe-invoker-bg-color,var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)}));
  --_operative-bg-color: var(--bbva-list-swipe-operative-bg-color,var(--colorsPrimaryCore, ${a(l.primaryCore)}));
  --_informative-bg-color: var(--bbva-list-swipe-informative-bg-color,var(--colorsPrimaryMedium, ${a(l.primaryMedium)}));
  --_actions-item-operative-error-bg-color: var(--bbva-list-swipe-actions-item-operative-error,var(--colorsTertiaryType1Medium, ${a(l.tertiaryType1Medium)}));
  display: block;
  box-sizing: border-box;
  width: 100%;
  position: relative;
  overflow: hidden;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([dragging]) {
  user-select: none;
}

.invoker {
  position: relative;
  background-color: var(--_invoker-bg-color);
  transform: translate3d(var(--_translate), 0, 0);
  z-index: 1;
}
.invoker.transition {
  transition: transform 0.2s;
}
.invoker.right {
  transform: translate3d(var(--_informative-width), 0, 0);
}
.invoker.left {
  transform: translate3d(var(--_operative-width), 0, 0);
}

:host([focus-visible]) .invoker:focus {
  outline-offset: -1px;
}

.actions-wrapper {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
}

.actions {
  position: absolute;
  top: 0;
  height: 100%;
  display: flex;
  align-items: center;
}
.actions-informative {
  left: 0;
  background-color: var(--_informative-bg-color);
}
.actions-operative {
  right: 0;
  background-color: var(--_operative-bg-color);
}
.actions-operative [warning] {
  background-color: var(--_actions-item-operative-error-bg-color);
}
.right-dir .actions-operative, :not(.right-dir) .actions-informative, :not(.opened) .actions {
  visibility: hidden;
}
.actions-list {
  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
  height: 100%;
}
.actions-item {
  margin: 0;
  padding: 0;
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-button-action] {
  width: 5.5rem;
  max-width: none;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
${kt.mediaRules()}`;class xt extends(S(p(w))){static get is(){return"bbva-list-swipe"}static get scopedElements(){const t=[_t];return xt.scopedElementsFromClasses(t)}static get properties(){return{informativeActions:{type:Array,attribute:"informative-actions"},operativeActions:{type:Array,attribute:"operative-actions"},threshold:{type:Number},iconSize:{type:Number,attribute:"icon-size"},opening:{type:String},_transition:{type:Boolean},_translate:{type:Number},_operativeWidth:{type:Number},_informativeWidth:{type:Number},_swipeDirectionRight:{type:Boolean},_opened:{type:Boolean}}}constructor(){super(),this.operativeActions=[],this.informativeActions=[],this.threshold=.4,this.iconSize=24,this._transition=!0,this._translate=0,this.opening="",this._operativeWidth=0,this._informativeWidth=0,this._swipeDirectionRight=!1,this._opened=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._informative=this.shadowRoot.querySelector(".actions-informative"),this._operative=this.shadowRoot.querySelector(".actions-operative"),requestAnimationFrame((()=>{this._informativeWidth=this._informative.offsetWidth,this._operativeWidth=this._operative.offsetWidth})),this._invoker=this.shadowRoot.querySelector(".invoker"),A(this._invoker,"track",(t=>this._onTrack(t))),T(this._invoker,"pan-y")}updated(t){super.updated&&super.updated(t),t.has("opening")&&this.opening&&(this._opened=!0,this._swipeDirectionRight="right"===this.opening)}static get styles(){return[y(".invoker:focus"),$t,v("bbva-list-swipe-shared-styles"),ft.dark]}render(){const t={"--_translate":`${this._translate}px`,"--_operative-width":-1*this._operativeWidth+"px","--_informative-width":`${this._informativeWidth}px`},e={transition:this._transition,right:"right"===this.opening,left:"left"===this.opening},i={"right-dir":this._swipeDirectionRight,opened:this._opened};return f`
      <div
        class="invoker ${q(e)}"
        style="${F(t)}"
        @transitionend="${this._onInvokerTransitionEnd}"
        tabindex="0"
        @keydown="${this._onInvokerKeydown}"
      >
        <slot name="invoker"></slot>
      </div>

      <div class="actions-wrapper ${q(i)}">
        <div class="actions actions-informative">
          ${this.informativeActions.length?f`
                <ul class="actions-list">
                  ${this.informativeActions.map(((t,e)=>this._actionItem(t,e,"informative")))}
                </ul>
              `:""}
        </div>
        <div class="actions actions-operative">
          ${this.operativeActions.length?f`
                <ul class="actions-list">
                  ${this.operativeActions.map(((t,e)=>this._actionItem(t,e,"operative")))}
                </ul>
              `:""}
        </div>
      </div>
    `}_actionItem(t,e,i){return f`
      <li class="actions-item" ?warning="${t.warning}">
        <bbva-button-action
          ambient="dark"
          .icon="${t.icon}"
          .iconSize="${this.iconSize}"
          .label="${t.label}"
          @click="${()=>this._onActionClick(t,e,i)}"
        ></bbva-button-action>
      </li>
    `}_onTrack(t){if(t&&t.detail&&t.detail.state)switch(t.detail.state){case"start":return void this._trackStart();case"end":return void this._trackEnd(t.detail.dx);default:this._trackX(t.detail.dx)}}_trackStart(){this.setAttribute("dragging",""),this._invokerWidth=this._invoker.offsetWidth,this._opened=!0,this._operativeWidth=this._operative.offsetWidth,this._informativeWidth=this._informative.offsetWidth,this._setTrackReferences(this.opening),this.opening="",this._translate=this._startingPoint,this._transition=!1}_setTrackReferences(t){return"right"===t?(this._rightLimit=0,this._leftLimit=0-this._operativeWidth-this._informativeWidth,this._leftThreshold=0-this._informativeWidth-this._operativeWidth*this.threshold,this._rightThreshold=0-this._informativeWidth*this.threshold,this._startingPoint=this._informativeWidth,void(this._midThreshold=-1*this._informativeWidth)):"left"===t?(this._rightLimit=this._informativeWidth+this._operativeWidth,this._leftLimit=0,this._leftThreshold=this._operativeWidth*this.threshold,this._rightThreshold=this._operativeWidth+this._informativeWidth*this.threshold,this._startingPoint=-1*this._operativeWidth,void(this._midThreshold=this._operativeWidth)):(this._rightLimit=this._informativeWidth,this._leftLimit=0-this._operativeWidth,this._leftThreshold=0-this._operativeWidth*this.threshold,this._rightThreshold=this._informativeWidth*this.threshold,this._startingPoint=0,void(this._midThreshold=0))}_trackX(t){this._translate=this._startingPoint+Math.max(this._leftLimit,Math.min(t,this._rightLimit)),this._swipeDirectionRight=t>=this._midThreshold}_trackEnd(t){return this.removeAttribute("dragging",""),this._swipeDirectionRight=t>=this._midThreshold,this._transition=!0,this._translate=0,t<this._leftThreshold?(this.opening="left",void this._invokerTrackOpening()):t>this._rightThreshold?(this.opening="right",void this._invokerTrackOpening()):void(this.opening="")}_invokerTrackOpening(){this.dispatchEvent(new CustomEvent(`bbva-list-swipe-track-${this.opening}`,{detail:this,bubbles:!0,composed:!0}))}_onInvokerTransitionEnd(){this.opening||(this._opened=!1)}_onActionClick(t,e,i){this.dispatchEvent(new CustomEvent("list-swipe-action-click",{detail:{item:t,index:e,type:i},bubbles:!0,composed:!0}))}_onInvokerKeydown(t){t.composedPath()[0]===this._invoker&&("arrowright"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("right")),"arrowleft"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("left")))}_moveInvoker(t){const e=this.opening;if(t===e)return;let i;this._trackStart(),"right"===t&&(i="left"===e?this._operativeWidth-1:this._rightLimit),"left"===t&&(i="right"===e?0-this._informativeWidth+1:this._leftLimit),this._trackEnd(i)}}customElements.define(xt.is,xt);var St=i`:host {
  --skeleton-quote-color: var(--bbva-manager-equity-contracts-list-skeleton-color, var(--colorsSecondary200, ${a(l.secondary200)}));
  --skeleton-quote-bg: var(--bbva-manager-equity-contracts-list-skeleton-bg, #fff);
  position: relative;
  display: var(--bbva-manager-equity-contracts-list-display, block);
  flex-direction: column;
  font-family: "Benton Sans", sans-serif !important;
  box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.15);
  background-color: var(--bbva-manager-equity-contracts-list-card-background-color, var(--bbva-white, #fff));
  margin: 1rem;
  box-sizing: border-box;
  border-radius: var(--bbva-manager-equity-contracts-list-border-radius, 2px);
  @apply --bbva-manager-equity-contracts-list;
}
:host::after {
  content: "";
  position: fixed;
  width: 100%;
  height: 100%;
  background-color: var(--bbva-manager-equity-contracts-list-background-color, var(--bbva-100, #f4f4f4));
  z-index: -1;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  @apply --bbva-manager-equity-contracts-list-after;
}

:host([clean-layout]) {
  box-shadow: none !important;
  background: none !important;
  @apply --bbva-manager-equity-contracts-list-clean-layout;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.skeleton {
  position: relative;
  height: 37.5rem;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  z-index: 1;
  overflow: hidden;
  transform: opacity;
  animation: pulse 1600ms 300ms ease-out infinite both;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((40% * 2) + (18px/ 2)) 18px, calc((20% * 2) + (18px/ 2)) 18px, calc((35% * 2) + (18px/ 2)) 18px, calc((30% * 2) + (18px/ 2)) 18px, calc((45% * 2) + (18px/ 2)) 18px, calc((45% * 2) + (18px/ 2)) 18px, calc((45% * 2) + (18px/ 2)) 18px, calc((25% * 2) + (18px/ 2)) 18px, calc((40% * 2) + (18px/ 2)) 18px, calc((25% * 2) + (18px/ 2)) 18px, calc((40% * 2) + (18px/ 2)) 18px, calc((25% * 2) + (18px/ 2)) 18px, calc((40% * 2) + (18px/ 2)) 18px, calc((25% * 2) + (18px/ 2)) 18px, calc((40% * 2) + (18px/ 2)) 18px, calc((25% * 2) + (18px/ 2)) 18px, calc((40% * 2) + (18px/ 2)) 18px;
  background-position: 40% 3%, 80% 3%, 190% 10%, 20% 10%, 100% 20%, 100% 30%, 100% 40%, 15% 50%, 270% 50%, 15% 60%, 270% 60%, 15% 70%, 270% 70%, 15% 80%, 270% 80%, 15% 90%, 270% 90%;
}
.skeleton > :nth-child(n) {
  opacity: 0;
}

[data-tag-name=bbva-list-swipe] {
  --bbva-list-swipe-operative-bg-color: var(--colorsPrimaryMedium, ${a(l.primaryMedium)});
}

[data-tag-name=bbva-expandable-accordion] {
  --_expandable-accordion-header-bg-color-pressed: none;
}

[data-tag-name=bbva-notification-message] {
  padding-bottom: 1.5rem;
}

#header-category {
  padding-top: 1rem;
}

.header-list {
  min-height: 3.5rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  background: none;
  border: none;
  cursor: pointer;
  font-family: inherit;
  font-size: var(--typographyTypeSmall, ${a(r.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(s.typeSmall)});
}
.header-list .row-title {
  text-align: left;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(o.medium.fontWeight)});
  align-items: center;
  font-size: var(--typographyTypeSmall, ${a(r.typeSmall)});
  color: var(--colorsSecondary600, ${a(l.secondary600)});
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  30% {
    filter: opacity(70%);
  }
  50% {
    filter: opacity(50%);
  }
  90% {
    filter: opacity(70%);
  }
  100% {
    filter: opacity(100%);
  }
}
`;class wt extends(p(bt(w))){static get is(){return"bbva-manager-equity-contracts-list"}static get scopedElements(){const t=[L,I,E,P,xt,K,Z,M];return wt.scopedElementsFromClasses(t)}static get properties(){return{listTitle:{type:String,attribute:"list-title"},emptyListText:{type:String,attribute:"empty-list-text"},errorIcon:{type:String},_error:{type:Boolean},list:{type:Object},_list:{type:Array},empty:{type:Boolean},failedAttempts:{type:Number},maxFailedAttempts:{type:Number},titleMedium:{type:Boolean,attribute:"title-medium"},errorAttemptsMessage:{type:String},errorAttemptsMessageRetry:{type:String},loading:{type:Boolean,reflect:!0},class:{type:String},cleanLayout:{type:Boolean,reflect:!0,attribute:"clean-layout"},showFirstTimeOperatives:{type:Boolean},swipeOperationsAreHidden:{type:Boolean}}}constructor(){super(),this.listTitle="",this.emptyListText="",this.errorIcon="coronita:alert",this._error=!1,this.failedAttempts=0,this.maxFailedAttempts=3,this.titleMedium=!0,this.loading=!0,this.class="list-container",this.list=null,this._list=null,this.cleanLayout=!1,this.empty=!1,this.showFirstTimeOperatives=!0,this.swipeOperationsAreHidden=!1}updated(t){t.has("list")&&(this._list=this._itemsChanged(this.list),this.empty=this._hasEmptyResults(this._list)),this._attemptsCompleteMessage()}_itemsChanged(t){return t&&at(rt(t,"list",[]))?(this.loading=!1,this.cleanLayout=!1,this._error=!1,rt(t,"list")):t&&rt(t,"error",!1)?(this.loading=!1,this.cleanLayout=!0,this._error=!0,null):t&&rt(t,"reset",!1)?this._reset():[]}_reset(){return this.loading=!0,this.cleanLayout=!1,this._error=!1,null}_hasEmptyResults(t){if(t&&0===t.length)return this.loading=!1,this.cleanLayout=!0,this._error=!1,!0}_handleSwipeActionTabEvent(t,e={}){rt(t,"detail.item.eventName",!1)&&(this._closeAccordions(!t),it(this,"swipe-operation-event",{fundId:e,event:t.detail.item.eventName}))}_onItemTab(t,e){this.shadowRoot.querySelectorAll(".list-swipe").forEach((i=>{this.swipeOperationsAreHidden?i.firstElementChild===t.currentTarget&&e&&(this._closeAccordions(!t),it(this,"bbva-manager-equity-contracts-list-tab-element-event",{fundId:e,event:"bbva-manager-equity-contracts-go-to-detail-event"})):""!==i.opening&&"right"!==i.opening||i.firstElementChild!==t.currentTarget||e&&(this._closeAccordions(!t),it(this,"bbva-manager-equity-contracts-list-tab-element-event",{fundId:e,event:"bbva-manager-equity-contracts-go-to-detail-event"}))}))}_onRetryTab(t){this.failedAttempts+=1,this._attemptsCompleteMessage(),this._reset(),it(this,"bbva-manager-equity-contracts-list-retry-tab-event",t)}_closeAccordions(t){this.shadowRoot.querySelectorAll(".expandable-accordion").forEach((e=>{t?e.opened&&e!==t.currentTarget&&t.detail.value?e.opened=!1:e.opened||this._closeSwipe(t):e.opened=!1}))}_handleCloseAccordions(t){if(this.showFirstTimeOperatives){this.shadowRoot.querySelectorAll(".expandable-accordion").forEach((t=>{if(t.opened){const e=t.querySelector(".list-swipe");e.opening="left",e.firstUpdated(),setTimeout((()=>{e.opening="",this.showFirstTimeOperatives=!1}),800)}}))}else this._closeAccordions(t)}_closeSwipe(t){this.shadowRoot.querySelectorAll(".list-swipe").forEach((e=>{t?"left"===e.opening&&e!==t.currentTarget&&(e.opening=""):e.opening=""}))}_attemptsCompleteMessage(){this.failedAttempts>=this.maxFailedAttempts?(this.errorAttemptsMessage="bbva-manager-equity-contracts-error-list-full-attempts",this.errorAttemptsMessageRetry=""):(this.errorAttemptsMessage="bbva-manager-equity-contracts-error-list",this.errorAttemptsMessageRetry="bbva-manager-equity-contracts-list-retry")}get _headerTemplate(){return this.listTitle?f`
      <bbva-header-category id="header-category" text="${this.listTitle}"></bbva-header-category>`:f``}get _emptyListTemplate(){return f`
      <bbva-panel-info
          text="${this.emptyListText}">
      </bbva-panel-info>
    `}get _errorListTemplate(){return f`
      <bbva-notification-message
          variant="error"
          icon="${this.errorIcon}"
          link-title="${this.t(this.errorAttemptsMessageRetry)}"
          @notification-message-link-click="${t=>this._onRetryTab(t)}">
        ${this.t(this.errorAttemptsMessage)}
      </bbva-notification-message>
    `}get _renderList(){return f`${this.empty?this._emptyListTemplate:f`${this._headerTemplate}
        ${this._list.map((t=>this._setExpandableItem(t)))}`}`}_setSwipeItem(t){return f`
      <bbva-divider size="full"></bbva-divider>
      ${t.map((t=>f`
        <bbva-list-swipe
            id="${function(t){let e=t;return tt.forEach((i=>{e=t.replace(i,"")})),e}(t.title.name)}"
            class="list-swipe"
            .operativeActions="${C(t.params.operativeActions)}"
            @bbva-list-swipe-track-left="${t=>this._closeSwipe(t)}"
            @list-swipe-action-click="${e=>this._handleSwipeActionTabEvent(e,t.fundId)}">
          <bbva-list-badge
              badge=""
              slot="invoker"
              badge-type="neutral"
              link="${t.title.name}"
              type="two-columns"
              local-currency="${this.localCurrency}"
              currency-code="${this.currencyCode}"
              amount="${t.fundPosition.amount}"
              language="${this.language}"
              link="#"
              @list-badge-link-click="${e=>this._onItemTab(e,t.fundId)}">
            <span slot="subtitle">${C(t.params.title)}</span>
            <span slot="subtitle">${ct(t.ownedShares)}</span>
            <span slot="subtitle">${C(t.params.subTitle)}</span>
            <span slot="subtitle">${lt(t.netAssetValue.amount)}</span>
          </bbva-list-badge>
        </bbva-list-swipe>
        <bbva-divider size="fit" ?hidden="${t.params.isLastItem}"/>
      `))}`}_setExpandableItem(t){const e=t.params||{},i=t.funds&&t.funds.length>0||!1;return f`
      <bbva-expandable-accordion
          class="expandable-accordion"
          variant="${i?"oneColumn":null}"
          state-icon-size="${C(e.stateIconSize)}"
          open-icon="${i?C(e.openIcon):null}"
          close-icon="${i?C(e.closeIcon):null}"
          has-header-slot
          @opened-changed="${this._handleCloseAccordions}">
        ${this._getExpandableListHeader(t)}
        ${i?this._setSwipeItem(t.funds):""}
      </bbva-expandable-accordion>
      <bbva-divider .hidden="${C(e.isLastItem)}"/>`}_getExpandableListHeader(t){return f`
      <span class="header-list" slot="header">
          <span class="row-title">${t.name}</span>
          <span class="row-amount">
            <bbva-amount
                data-tag-name="bbva-amount"
                .amount="${t.primaryAmount.amount}"
                .currencyCode="${t.primaryAmount.currency}"
                .localCurrency="${t.localCurrency}"
                .language="${this.language}"
                variant="m"/>
          </span>
        </span>
    `}static get styles(){return[St,v("bbva-manager-equity-contracts-list-shared-styles")]}render(){return f`
      ${this.loading?f`
        <div class="skeleton"></div>`:f`
        <div class="${this.class}">
          ${this._error?this._errorListTemplate:this._renderList}
        </div>
      `}
    `}}var At=i`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${(new n).mediaRules()}`;const Tt=new n;var qt=i`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${a(l.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${a(l.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${a(l.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
}
${Tt.mediaRules()}`;const Ft={dark:i`
    ${D.dark}
    ${R.dark}
    ${O.dark}
    ${qt}
  `,light:i`
    ${D.light}
    ${R.light}
    ${O.light}
    ${At}
  `},Ct=new n;var Lt=i`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${a(l.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${a(l.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${a(l.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${a(l.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${a(l.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${a(l.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${a(l.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
  overflow: hidden;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(o.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(o.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${a(o.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${a(o.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${a(o.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${a(o.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name="bbva-link,"] [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
${Ct.mediaRules()}`;class It extends(S(B(N(h(p(e(w))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[L,z,j,H,V];return It.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},statusAccessibilityText:{type:String,attribute:"status-accessibility-text"},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.statusAccessibilityText="bbva-list-simple-status-accessibility-text",this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0}static get styles(){return[super.styles,Lt,Ft.light,Ft.dark,y("button:focus"),v("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return f`
      <bbva-amount
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
      >
      </bbva-amount>
    `}get _icon(){return f`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return f`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return f`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return f`
      <span class="sr-only">${this.t(this.statusAccessibilityText)}</span>
      <bbva-badge-variability .status=${t} .color=${this.color}></bbva-badge-variability>
    `}get _mask(){const t=W(this.mask,this.maskChars,!0,this.visibleChars);return f`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),f`
      <dd class="wrapper-${e}">
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){return f`
      <bbva-link
        class=${q({ellipsis:this[`${t}Ellipsis`]})}
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${C(this.roleLink)} aria-live=${C(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,a=`${t}RoleText`,r=`${t}AriaLiveText`;return f`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role=${C(this[a])}
        aria-live=${C(this[r])}
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag=${C(this[i])}
      >
      </bbva-text>
    `}_tplText(t){return f` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return f`
      <dl>
        <dt>${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}</dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return f`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?f`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):f` <div class="wrapper-description">${this._tplText("description")}</div> `,f`
      ${t}
      <div class="skeleton"></div>
    `}}customElements.define(It.is,It);const Et={DEBT_INVESTMENT_FUNDS:"DEBIT_FUND",EQUITY_INVESTMENT_FUNDS:"VARIABLE_INCOME",STRATEGY_INVESTMENTS:"MULTI_STRATEGY"},Pt={title:"bbva-manager-equity-contracts-list-swipe-title",subTitle:"bbva-manager-equity-contracts-list-swipe-subtitle",isLastItem:!1},Mt=[{icon:"coronita:buy-stock",label:"bbva-manager-equity-contracts-list-contribution",eventName:"bbva-manager-equity-contracts-contribution-event"},{icon:"coronita:sales",label:"bbva-manager-equity-contracts-list-withdrawal",eventName:"bbva-manager-equity-contracts-withdrawal-event"}],Dt={openIcon:"coronita:expand",closeIcon:"coronita:collapse",stateIconSize:24,isLastItem:!1},Rt={"bbva-manager-equity-contracts-contribution-event":"CONTRIBUTION","bbva-manager-equity-contracts-withdrawal-event":"WITHDRAWAL"};var Ot=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.product-summary {
  background-color: var(--colorsSecondary100, ${a(l.secondary100)});
  padding: 1.5rem 0rem 1.5rem 0rem;
}
.product-summary [data-tag-name=bbva-panel-process] {
  padding: 0rem 3rem;
  margin: 0rem 0rem 1.25rem 0rem;
  --_panel-process-color: var(--colorsSecondary600, ${a(l.secondary600)});
  --fontFacePrimaryMediumFontWeight: var(--fontFacePrimaryFontFamilyFontWeight, ${a(o.fontFamily.fontWeight)});
  --typographyTypeXLarge: var(--typographyTypeSmall, ${a(r.typeSmall)});
}

.title-detail {
  font-size: var(--typographyTypeSmall, ${a(r.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(o.medium.fontWeight)});
  padding: 0rem;
  margin: 1rem 1rem 0rem 1rem;
}

.more-info {
  padding: 0.5rem 1rem 0.5rem 1rem;
}
.more-info--key {
  --_list-simple-label-color: var(--statusColorsOff, ${a(U.off)});
  padding: 0.5rem 1rem 0rem 1rem;
}
.more-info--value {
  padding: 0rem 1rem 0.5rem 1rem;
}

.info-box {
  margin: 1rem 1rem 1.5rem 1rem;
}

.operations-list {
  display: flex;
  align-items: center;
  justify-content: center;
  margin: 1.375rem 0rem 1.375rem 0rem;
}
.operations-list [data-tag-name=bbva-button-row] {
  padding-left: 2rem;
  padding-right: 2rem;
}
`;class Bt extends(p(bt(w))){static get is(){return"bbva-manager-equity-contracts-detail"}static get scopedElements(){const t=[H,G,It,X,P,M];return Bt.scopedElementsFromClasses(t)}static get properties(){return{detail:{type:Object},buttonsOptionsRow:{type:Array},_summary:{type:Object},_moreInfo:{type:Array},_operativeSupplies:{type:Object},message:{type:String},isLoanGuarantee:{type:Boolean}}}constructor(){super(),this.detail={},this.buttonsOptionsRow=[],this._summary={},this._moreInfo=[],this._operativeSupplies={},this.isLoanGuarantee=!1,this.message="bbva-manager-equity-contracts-detail-info-box-message"}updated(t){t.has("detail")&&at(this.detail)&&(this._summary=rt(this.detail,"summary",{}),this._moreInfo=rt(this.detail,"moreInfo",[]),this.isLoanGuarantee=rt(this.detail,"isLoanGuarantee",!1),this._operativeSupplies=rt(this.detail,"operativeSupplies",{}))}static get styles(){return[Ot,v("bbva-manager-equity-contracts-detail-shared-styles")]}_handlerModalEvent(t,e){const i=e.id||"";if("copy-contract"===i){const t=e.description||"";it(this,"bbva-manager-equity-contracts-detail-copy-contract-event",t)}else{const t=nt(`equity-contracts-${i}`,"info loan-help-info","cells-modal-alert-understood",[{icon:"coronita:help",iconClass:"icon-size-24 info dark-core-blue",class:"info"},{title:`bbva-manager-equity-contracts-detail-${i}-title-tooltip`,class:"title-fees-info"},{text:`bbva-manager-equity-contracts-detail-${i}-tooltip`,class:"text-gray-ml"}]);it(this,"bbva-manager-equity-contracts-detail-show-tooltip-event",t)}}_handlerOperationProduct(t,e){if(at(this._operativeSupplies)){const t=Rt[e.eventName];Object.assign(this._operativeSupplies,{operationType:t});const i=rt(this._operativeSupplies,"titlePrice.amount",0),a=rt(this._operativeSupplies,"totalCash.amount",0);"WITHDRAWAL"===t?this.isLoanGuarantee?this._fullScreenModal(e.eventName,this._operativeSupplies):it(this,e.eventName,this._operativeSupplies):a>=i?it(this,e.eventName,this._operativeSupplies):it(this,"bbva-manager-equity-contracts-no-cash-enough",i)}}get _operationsTemplate(){const t=this.buttonsOptionsRow||[];return f`
      <div class="operations-list">
        ${t.map((t=>f`
        <bbva-button-row
             class="one-button"
            .options="${[t]}"
            @button-row-item-click=${e=>this._handlerOperationProduct(e,t)}>
        </bbva-button-row>
      `))}
      </div>
    `}_itemsTemplate(t,e=void 0){return at(t)?f`
      ${e?f`
        <bbva-header-category
            class="title-detail"
            text="${e}">
        </bbva-header-category>
      `:""}
      ${t.map((t=>f`
        <bbva-list-simple
            class="list-simple"
            id="${C(t.id)}"
            action-icon="${t.icon}"
            action-link="${C(t.actionLink)}"
            label="${C(t.label)}"
            description="${C(t.description)}"
            data-id="${C(t.id)}"
            class="${C(t.class)}"
            description-date="${C(t.descriptionDate)}"
            amount="${C(t.amount)}"
            variant=${C(t.variant)}
            language="${this.language}"
            currency-code="${this.currencyCode}"
            local-currency="${this.localCurrency}"
            ?description-medium="${C(t.descriptionMedium)}"
            description-alignment="${C(t.descriptionAlignment)}"
            hide-padding-top="${C(t.hidePaddingTop)}"
            hide-padding-bottom="${C(t.hidePaddingBottom)}"
            @list-simple-icon-click="${e=>this._handlerModalEvent(e,t)}"
            @list-simple-link-action-link-click="${e=>this._handlerModalEvent(e,t)}">
      `))}`:""}get _summaryTemplate(){const t=this._summary||{};return at(t)?f`
      <bbva-panel-process
          heading="${C(t.titleHeading)}"
          amount="${C(t.amount)}"
          language="${this.language}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          description="${C(t.descriptionProcess)}">
      </bbva-panel-process>
      ${this._itemsTemplate(t.items)}`:""}get _moreInfoTemplate(){const t=this._moreInfo||[];return at(t)?f`
        ${t.map((t=>this._itemsTemplate(t.items,t.header)))}
      `:f``}get _infoBoxTemplate(){return f`
      <bbva-notification-message
          class="info-box"
          icon-size="24"
          icon="coronita:info"
          variant="default">
        ${this.t(this.message)}
      </bbva-notification-message>
    `}render(){return f`
      <div class="product-summary">
        ${this._summaryTemplate}
      </div>
      ${this._operationsTemplate}
      ${this._moreInfoTemplate}
      ${this._infoBoxTemplate}
    `}}var Nt=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Wt extends(p(bt(w))){static get is(){return"bbva-manager-equity-contracts"}static get scopedElements(){const t=[wt,Bt];return Wt.scopedElementsFromClasses(t)}static get properties(){return{listForUi:{type:Object},detail:{type:Object},detailForUi:{type:Object},equity:{type:Object},balances:{type:Array},listFunds:{type:Array},listTitle:{type:String},maxFailedAttempts:{type:Number},_failedAttempts:{type:Number},expandableAccordionProperties:{type:Object},listSwipeProperties:{type:Object},investmentFundId:{type:String},totalCash:{type:Object},managementRestrictedService:{type:String},operativeActions:{type:Array},managementService:{type:String}}}constructor(){super(),this.detail={},this.detailForUi={},this.equity={},this.listTitle="bbva-manager-equity-contracts-list-header",this.maxFailedAttempts=3,this._failedAttempts=0,this.listForUi={reset:!0},this.balances=void 0,this.listFunds=void 0,this.expandableAccordionProperties=Dt,this.listSwipeProperties=Pt,this.operativeActions=Mt,this.managementRestrictedService="MANAGEMENT",this.investmentFundId="",this.totalCash={},this.managementService=""}reset(){this.listForUi={reset:!0},this.detail={},this.detailForUi={},this.equity={},this.totalCash={},this._failedAttempts=0,this.investmentFundId=""}error(){this.listForUi={error:!0}}getFeatureFlags(){at(this.featureFlags)&&this.featureFlags.forEach((t=>{it(this,"bbva-manager-equity-contracts-get-feature-flags-event",t)}))}handleEquityContractsFlags(t){at(t)&&"patrimonial"===rt(t,"module","")&&("equityContractsShowFundDetail"===rt(t,"feature","")&&(this.showFundDetail=rt(t,"isFlagEnable",!1)),"equityContractsShowFundOperatives"===rt(t,"feature","")&&(this.showFundOperatives=rt(t,"isFlagEnable",!1)),"equityContractsEnableStorageAndForward"===rt(t,"feature","")&&(this.enableStorageAndForward=rt(t,"isFlagEnable",!1)),"equityContractsShowFundsList"===rt(t,"feature","")&&(this.showFundsList=rt(t,"isFlagEnable",!1)))}updated(t){t.has("equity")&&at(this.equity)&&(this.managementService=rt(this.equity,"managementServices.id"),this.investmentFundId=rt(this.equity,"contractId"),this._isList&&this.showFundsList?this.getFunds():this.listFunds=[]),t.has("listFunds")&&(this.listForUi=this._handleFundsAndBalances(this.balances,this.listFunds)),t.has("detail")&&this._parseDetailForUI(this.detail)}handleGetFundDetail(t){this.showFundDetail&&this.getFundDetail(t)}getFundDetail(t){this._showSpinner(),t.stopPropagation();const{fundId:e,event:i}=t.detail,a={host:this.host,native:this.native,version:this.investmentFundsApiVersion,params:{"investment-fund-id":this.investmentFundId,"fund-id":e}};new Y(a).generateRequest().then((t=>{this._hideSpinner(),this._handleFundDetailServiceResponse(JSON.parse(t.response),i)}),(()=>{this._hideSpinner(),this.fundDetailRetries.intents+=1,this._halfScreenModal(t)}))}getFunds(){const t={host:this.host,native:this.native,version:this.investmentFundsApiVersion,params:{"investment-fund-id":this.investmentFundId}};new J(t).generateRequest().then((t=>{204===t.status?this.listForUi={}:this.listFunds=rt(JSON.parse(t.response),"data",[])}),(()=>{this.error()}))}_handleFundDetailServiceResponse(t,e){const i=Rt[e],a=this._getEquityContractsSupplies(t,this.equity,this.totalCash,i,this.enableStorageAndForward),r=rt(a,"titlePrice.amount",0),s=rt(a,"totalCash.amount",0);"CONTRIBUTION"===i?s>=r?it(this,e,a):it(this,"bbva-manager-equity-contracts-no-cash-enough",r):"WITHDRAWAL"===i?rt(t,"data.isLoanGuarantee",!1)?this._fullScreenModal(e,a):it(this,e,a):it(this,e,{detail:t,operativeSupplies:a})}_parseDetailForUI(t){if(at(t)){const{detail:e,operativeSupplies:i}=t;this.detailForUi={summary:this._getSummary(e),moreInfo:this._getMoreInfo(e,i),isLoanGuarantee:rt(e,"data.isLoanGuarantee",!1),operativeSupplies:i}}}_handleFundsAndBalances(t,e){return at(t)&&at(e)?(this._getTotalCash(t),t.forEach((i=>{const a=t[t.length-1]===i;Object.defineProperty(i,"funds",{value:[],writable:!0,configurable:!0,enumerable:!0}),Object.defineProperty(i,"params",this._expandableListParams(a)),e.forEach((t=>{Et[i.id]===rt(t,"categories.0.id","NOT")&&i.funds.push(t)}))})),t.forEach((t=>{t.funds.forEach((e=>{const i=t.funds[t.funds.length-1]===e;Object.defineProperty(e,"params",this._swipeListParams(i))}))})),{list:t}):at(t)?{list:t}:{}}_showSpinner(){it(this,"open-control-veil-event")}_hideSpinner(){it(this,"close-control-veil-event")}get _isList(){return"list"===this.mode}static get styles(){return[Nt,v("bbva-manager-equity-contracts-shared-styles")]}_expandableListParams(t){return{value:{openIcon:this.expandableAccordionProperties.openIcon,closeIcon:this.expandableAccordionProperties.closeIcon,stateIconSize:this.expandableAccordionProperties.stateIconSize,isLastItem:t},writable:!0,configurable:!0,enumerable:!0}}_swipeListParams(t){return{value:{title:this.t(this.listSwipeProperties.title),subTitle:this.t(this.listSwipeProperties.subTitle),operativeActions:this._parseOperativeActions,isLastItem:t},writable:!0,configurable:!0,enumerable:!0}}get _parseOperativeActions(){const t=[];return at(this.operativeActions)&&!this._hideOperatives&&this.operativeActions.forEach((e=>{t.push({icon:e.icon,label:this.t(e.label),eventName:e.eventName})})),t}_getTotalCash(t){t.forEach((t=>{"CASH"===t.id&&(this.totalCash=rt(t,"primaryAmount"))}))}get _hideOperatives(){return this.managementRestrictedService===this.managementService||!this.showFundOperatives}get _detailTemplate(){return f`
      <bbva-manager-equity-contracts-detail
          class="detail"
          .detail=${this.detailForUi}
          .buttonsOptionsRow="${this._parseOperativeActions}"
          language="${this.language}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}">
      </bbva-manager-equity-contracts-detail>`}get _listTemplate(){return f`
      <bbva-manager-equity-contracts-list
          class="list"
          .list="${this.listForUi}"
          .maxFailedAttempts="${this.maxFailedAttempts}"
          .failedAttempts="${this._failedAttempts}"
          .swipeOperationsAreHidden="${this._hideOperatives}"
          language="${this.language}"
          list-title="${this.t(this.listTitle)}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          empty-list-text="${this.t("bbva-manager-equity-contracts-empty-list")}"
          @bbva-manager-equity-contracts-list-retry-tab-event="${()=>this.getFunds()}"
          @bbva-manager-equity-contracts-list-tab-element-event="${t=>this.handleGetFundDetail(t)}}"
          @swipe-operation-event="${t=>this.getFundDetail(t)}"
      >
      </bbva-manager-equity-contracts-list>`}render(){return f`
      ${this._isList?this._listTemplate:this._detailTemplate}
    `}}customElements.define(Wt.is,Wt);
