import{z as e,a8 as t,ac as i,ar as a,a9 as r,aa as o,a as s,ap as n,an as d,L as l,ag as c,F as h,b$ as p,ak as m,bx as b,b1 as v,h as g,i as u,aW as y,J as f,K as x,M as _,N as S,O as T,c0 as C,f as $,g as k,ab as w,ad as M,cR as I,bU as P,b6 as H,bF as q,cS as E,b0 as V,av as R,b3 as D,b5 as B,cD as L,di as A,ah as O,aN as F}from"./952f98a9.js";import{a as j}from"./30ef6f1f.js";import{i as z,j as N,k as G,l as K,bm as U,bn as W,a7 as X}from"./7f3d7ca9.js";import{B as Y}from"./4d740237.js";import{B as J}from"./c5297feb.js";import{B as Z}from"./ee7b135d.js";import{B as Q,a as ee,b as te}from"./19ae9b6c.js";import"./3e14f6f9.js";import"./216055dc.js";import"./854beed0.js";import"./84dff06e.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./9ab4f92c.js";customElements.define(Y.is,Y);const ie=new a;var ae=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(r.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(r.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(r.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(r.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
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

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 10) * 1em);
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(i.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

[data-tag-name=bbva-badge-notification] {
  --bbva-badge-notification-position-right: -0.5625rem;
  --bbva-badge-notification-position-top: -0.1875rem;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${ie.mediaRules()}`;class re extends(s(n(d(l)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":c,"bbva-icon":h,"bbva-badge-notification":p}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[ae,m("bbva-header-main-shared-styles"),b("button:focus"),v.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return g`<bbva-icon icon="${u(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return g`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=re.toCamelCase(e),o=`icon${r}`,s=`accessibilityTextIcon${r}`;return g`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${u(this.t(this[s]))}"
      aria-expanded=${u(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return g` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${u(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return g`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r,microillustration:o}=this;return g`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(o||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${u(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${r}" ?hidden="${!o}" aria-hidden="true">
            ${this.microillustration&&y[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(re.is,re);class oe extends(f(l)){static get is(){return"bbva-dataprovider-cards"}static get properties(){return{host:{type:String},apiVersion:{type:String,attribute:"api-version"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},headers:{type:Object,attribute:"headers"},timeout:{type:Number,attribute:"timeout"},offerId:{type:String,attribute:"offer-id"},cardId:{type:String,attribute:"card-id"},proposalId:{type:String,attribute:"proposal-id"},services:{type:Object}}}constructor(){super(),this.apiVersion="1",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120,this.cardId="",this.proposalId="",this.requiredOTP=!0,this.services={BGADPCardsCardTransactionsGetV0:x,BGADPCardsProposalsProposalGetV1:Q,BGADPCardsProposalsPostV1:z,BGADPCardsPostV1:_}}getCardDeliveries(e,t={}){const i={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:t.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"card-id":e,...t},htmlContext:this},a=oe._serviceCardDeliveriesGetV1(i);this._generateGetService(a,{customEvent:"card-deliveries-api-dm-fetch",errorFireEventHandler:"card-deliveries-api-dm-fetch-error"})}static _serviceCardDeliveriesGetV1(e){return new N(e)}postCards(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:null==e?void 0:e.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1},i=oe._serviceCardPostV1(t);this._generateGetService(i,{customEvent:"post-cards-success",errorFireEventHandler:"post-cards-error"})}static _serviceCardPostV1(e){return new _(e)}postOfferCard(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:e.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"offer-id":e.offerId}},i=oe._serviceCardOffersOfferSimulationsPostV1(t);this._generateGetService(i,{customEvent:"post-offer-card-v1-success",errorFireEventHandler:"post-offer-card-v1-error"})}static _serviceCardOffersOfferSimulationsPostV1(e){return new S(e)}simulationsPostOfferCard(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:null==e?void 0:e.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"offer-id":(null==e?void 0:e.offerId)||this.offerId,"card-id":(null==e?void 0:e.cardId)||this.cardId}},i=oe._serviceCardsCardOffersOfferSimulationsPostV1(t);this._generateGetService(i,{customEvent:"post-offer-simulations-card-v1-success",errorFireEventHandler:"post-offer-simulations-card-v1-error"})}static _serviceCardsCardOffersOfferSimulationsPostV1(e){return new ee(e)}getOfferDetail(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"offer-id":(null==e?void 0:e.offerId)||this.offerId,"card-id":(null==e?void 0:e.cardId)||this.cardId}},i=oe._serviceCardsCardOffersOfferGetV1(t);this._generateGetService(i,{customEvent:"get-offer-card-v1-success",errorFireEventHandler:"get-offer-card-v1-error"})}static _serviceCardsCardOffersOfferGetV1(e){return new G(e)}installmentsPlansPost(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"card-id":(null==e?void 0:e.cardId)||this.cardId},body:null==e?void 0:e.body,htmlContext:this};this.requiredOTP=!0;const i=oe._serviceCardsCardInstallmentsPlansPostV1(t);this._generateGetService(i,{customEvent:"post-installments-card-v1-success",errorFireEventHandler:"post-installments-card-v1-error"})}static _serviceCardsCardInstallmentsPlansPostV1(e){return new T(e)}getTransactions(e){const t=this._getServiceParams({...e,"card-id":this.cardId}),i=this._getService("BGADPCardsCardTransactionsGet",t);this._generateGetService(i,{customEvent:"set-card-transactions",errorFireEventHandler:"error-on-get-card-transactions"})}postCardsProposal(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:null==e?void 0:e.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1},i=oe._serviceCardProposalPostV1(t);this._generateGetService(i,{customEvent:"post-cards-proposal-v1-success",errorFireEventHandler:"post-cards-proposal-v1-error"})}static _serviceCardProposalPostV1(e){return new z(e)}getCardsProposals(e){const t=this._getServiceParams({...e,"proposal-id":this.proposalId}),i=this._getService("BGADPCardsProposalsProposalGet",t);this._generateGetService(i,{customEvent:"success-on-get-cards-proposals",errorFireEventHandler:"error-on-get-cards-proposals"})}postCardActivate(e,t){const i={host:this.host,headers:{"Content-Type":"application/json",...this.headers},body:t,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"card-id":e},htmlContext:this},a=oe._serviceCardsCardActivatePostV1(i);this._generateGetService(a,{customEvent:"post-cards-card-activate-v1-success",errorFireEventHandler:"post-cards-card-activate-v1-error"})}static _serviceCardsCardActivatePostV1(e){return new K(e)}_getService(e,t){return new this.services[`${e}V${this.version}`](t)}postUpgradesCard(e){const t={host:this.host,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"card-id":(null==e?void 0:e.cardId)||this.cardId},body:null==e?void 0:e.body,htmlContext:this},i=oe._serviceCardUpgradesPostV1(t);this._generateGetService(i,{customEvent:"post-upgrades-card-success",errorFireEventHandler:"post-upgrades-card-error"})}static _serviceCardUpgradesPostV1(e){return new te(e)}patchOperationalActivationV0(e){const t=e||{},i={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},params:null==t?void 0:t.queryParams,body:null==t?void 0:t.body,version:this.version,native:this.native,requiredToken:this.requiredToken,htmlContext:this},a=oe._serviceCardsCardActivationsActivationPatchV0(i);this._generateGetService(a,{customEvent:"patch-activation-card-success",errorFireEventHandler:"patch-activation-card-error"})}static _serviceCardsCardActivationsActivationPatchV0(e){return new U(e)}getCardPin(e,t={}){const i={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:t.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"card-id":e,...t},htmlContext:this},a=oe._serviceCardsCardPinGetV1(i);this._generateGetService(a,{customEvent:"card-pin-api-dm-fetch",errorFireEventHandler:"card-pin-api-dm-fetch-error"})}static _serviceCardsCardPinGetV1(e){return new W(e)}}k("colors.primaryCoreLightened"),k("colors.cool80"),k("colors.cool70"),k("colors.primaryCoreLightened"),k("colors.cool100"),k("colors.tertiaryType6Darkened"),k("colors.tertiaryType4Darkened");const se=new a;var ne=e`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${t(r.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${t(r.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${t(r.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${t(r.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${t(r.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  visibility: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.veil {
  opacity: 0;
  position: fixed;
  transition: visibility 0.2s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing);
  visibility: hidden;
  pointer-events: none;
}

.modal-main {
  display: flex;
  flex-direction: column;
  overflow-y: auto;
  width: 100%;
  height: 100%;
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  max-width: 45rem;
}

.transition-container {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  position: fixed;
  transform: translateY(100%);
  transition: visibility var(--_help-modal-transition-duration), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  width: 100%;
  will-change: transform;
  z-index: 1;
}
.transition-container.half-height {
  max-height: 50%;
  top: auto;
}
.transition-container.half-height .modal-main {
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  width: 100%;
  box-sizing: border-box;
  height: 100%;
  align-items: center;
  margin: auto;
  display: flex;
  justify-content: center;
}

.modal-container {
  width: 100%;
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${t(i.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(w.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${t(M.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em) 0 0);
  transform: translateZ(0.01px);
}

:host(:not([full-height])) .slot-footer {
  background-color: var(--_help-modal-footer-bg-color);
}

:host([full-height]) .help-modal {
  background-color: var(--_help-modal-full-height-bg-color);
  display: block;
}
:host([full-height]) .modal-header {
  width: 100%;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  z-index: 1;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=info]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-info);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${t(i.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${t(M.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-link].footer-button {
  text-align: center;
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
}
:host([fixed-footer]) .modal-content-wrapper, :host([fixed-footer]) .modal-content, :host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .slot-footer {
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([visible]) {
  visibility: visible;
}
:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
  pointer-events: all;
}
:host([visible]) .transition-container {
  transform: translateY(0%);
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}

:host(:not([visible])) {
  position: relative;
  height: auto;
  width: auto;
  --bbva-help-modal-transition-duration: 0.15s;
  --bbva-help-modal-veil-transition-duration: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8,0,1,1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8,0,1,1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  visibility: hidden;
  opacity: 0;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.15s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.2s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: fixed;
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  background-color: var(--_help-modal-ios-header-bg-color);
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
:host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${se.mediaRules()}`;class de extends(s(d(I))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":P,"bbva-icon":h,"bbva-text":c,"bbva-header-main":re,"bbva-link":H}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=q(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(e){if(super.updated&&super.updated(e),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-modal-${e}`,{detail:{status:e,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,ne,m("bbva-help-modal-shared-styles"),E.light,V.light]}get _fixedIOSHeader(){return g`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?g`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              data-tag-name="bbva-header-main"
              id="helpModalHeader"
              ?show-text-icon="${this.showTextIcon}"
              variant="${this.headerType}"
              text="${this.headerText}"
              icon-right-primary="${this.iconRightPrimary}"
              icon-right-secondary="${this.iconRightSecondary}"
              icon-left-primary="${this.iconLeftPrimary}"
              icon-left-secondary="${this.iconLeftSecondary}"
              accessibility-text-icon-left-primary="${this.accessibilityTextIconLeftPrimary}"
              accessibility-text-icon-left-secondary="${this.accessibilityTextIconLeftSecondary}"
              accessibility-text-icon-right-primary="${this.accessibilityTextIconRightPrimary}"
              accessibility-text-icon-right-secondary="${this.accessibilityTextIconRightSecondary}"
              @header-main-icon-right-primary-click="${()=>this._handleClick("header-right-primary")}"
              @header-main-icon-right-secondary-click="${()=>this._handleClick("header-right-secondary",!1)}"
              @header-main-icon-left-primary-click="${()=>this._handleClick("header-left-primary",!1)}"
              @header-main-icon-left-secondary-click="${()=>this._handleClick("header-left-secondary",!1)}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return g`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?g`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:g`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":g`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return g`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="light"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?g`<bbva-link
                  ambient="light"
                  class="footer-button"
                  data-tag-name="bbva-link"
                  @click="${()=>this._handleClick("footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return g`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-icon
            class="title-icon"
            data-tag-name="bbva-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
            aria-hidden="true"
          ></bbva-icon>
          ${this.titleText?g` <bbva-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                alignment="center"
                ellipsis
                .lines="${this.titleLines}"
                unset
                font-weight="500"
                tag="h2"
              >
              </bbva-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const e=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==e||e.scrollTo(0,0)}))}))}_setFooterShadow(e){e.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(e){this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(e)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _modalContent(){return g`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${R({"half-height":!this.fullHeight})}"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this.helpModalFooter}
          </div>
        </div>
      </section>
    `}}customElements.define(de.is,de);var le=e`:host {
  display: block;
  box-sizing: border-box;
}
:host .smaller-spaces {
  --gridSpacerVariant: 5;
}
:host bbva-list-bullet {
  text-align: initial;
  margin-top: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.golden-icon {
  --_help-modal-title-icon-color: var(--colorsTertiaryType3Dark, ${t(r.tertiaryType3Dark)});
}

.modal-content-wrapper {
  --_help-modal-content-color: color: black;
  --_help-modal-title-icon-color: var(--colorsPrimaryCoreDark, ${t(r.primaryCoreDark)});
  --bbva-help-modal-padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, 8))) / 16) * rem(16px)) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, 8))) / 16) * rem(16px)) 0;
  --bbva-help-modal-title-icon-margin-bottom: rem(20px);
}
`;class ce extends(s(l)){static get is(){return"pin-view-modal-manager"}static get scopedElements(){const e=[de];return ce.scopedElementsFromClasses(e)}static get styles(){return[le,m("pin-view-modal-manager-shared-styles")]}static get properties(){return{_modalId:{type:String},_fullHeightModal:{type:Boolean},_hideContentPaddingTopModal:{type:Boolean},_fixedFooterModal:{type:Boolean},_headerTypeModal:{type:String},_modalType:{type:String},_iconRightPrimaryHeaderModal:{type:String},_iconRightSecondaryHeaderModal:{type:String},_iconLeftPrimaryHeaderModal:{type:String},_iconLeftSecondaryHeaderModal:{type:String},_headerTextModal:{type:String},_titleIconModal:{type:String},_titleTextModal:{type:String},_listTextModal:{type:Array},_bodyTextModal:{type:String},_buttonTextModal:{type:String},_linkTextModal:{type:String},_modalHelp:{type:Object},_isNativeIos:{type:Boolean}}}constructor(){super(),this._modalId="",this._fullHeightModal=!1,this._hideContentPaddingTopModal=!1,this._fixedFooterModal=!1,this._headerTypeModal="",this._modalType="",this._iconRightPrimaryHeaderModal="",this._iconRightSecondaryHeaderModal="",this._iconLeftPrimaryHeaderModal="",this._iconLeftSecondaryHeaderModal="",this._headerTextModal="",this._titleIconModal="",this._titleTextModal="",this._listTextModal=[],this._bodyTextModal="",this._buttonTextModal="",this._linkTextModal="",this._isNativeIos=!1}get _bbvaHelpModal(){return this._modalHelp||(this._modalHelp=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')),this._modalHelp}openWithSettings(e){this._modalId=e.modalId,this._fullHeightModal=e.fullHeightModal,this._hideContentPaddingTopModal=e.hideContentPaddingTopModal,this._fixedFooterModal=e.fixedFooterModal,this._headerTypeModal=e.headerTypeModal,this._modalType=e.modalType,this._iconRightPrimaryHeaderModal=e.iconRightPrimaryHeaderModal,this._iconRightSecondaryHeaderModal=e.iconRightSecondaryHeaderModal,this._iconLeftPrimaryHeaderModal=e.iconLeftPrimaryHeaderModal,this._iconLeftSecondaryHeaderModal=e.iconLeftSecondaryHeaderModal,this._headerTextModal=e.headerTextModal,this._titleIconModal=e.titleIconModal,this._titleTextModal=e.titleTextModal,this._listTextModal=e.listTextModal,this._bodyTextModal=e.bodyTextModal,this._buttonTextModal=e.buttonTextModal,this._linkTextModal=e.linkTextModal,this._bbvaHelpModalClass=e.bbvaHelpModalClass,this.requestUpdate(),this.open()}open(){this._bbvaHelpModal.open()}close(){this._bbvaHelpModal.close()}_fireModalEvents(e){this.dispatchEvent(new CustomEvent(`${ce.is}-${e}-${this._modalId}`,{bubbles:!0,composed:!0,detail:!0}))}render(){return g`
      <bbva-help-modal
        ?full-height=${this._fullHeightModal}
        ?hide-content-padding-top=${this._hideContentPaddingTopModal}
        ?fixed-footer=${this._fixedFooterModal}
        header-type=${u(this._headerTypeModal)}
        modal-type=${u(this._modalType)}
        icon-right-primary=${u(this._iconRightPrimaryHeaderModal)}
        icon-right-secondary=${u(this._iconRightSecondaryHeaderModal)}
        icon-left-primary=${u(this._iconLeftPrimaryHeaderModal)}
        icon-left-secondary=${u(this._iconLeftSecondaryHeaderModal)}
        header-text=${u(this._headerTextModal)}
        title-icon=${u(this._titleIconModal)}
        title-text=${u(this._titleTextModal)}
        body-text=${u(this._bodyTextModal)}
        button-text=${u(this._buttonTextModal)}
        link-text=${u(this._linkTextModal)}
        @help-modal-footer-button-click=${()=>this._fireModalEvents("accept-button")}>
      </bbva-help-modal>
    `}}customElements.define(ce.is,ce);var he=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-footer-bg-color: transparent;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.margin-button-1rem {
  margin-bottom: 1rem;
}

.margin-1rem {
  margin: 1rem;
}

.margin-center {
  display: flex;
  justify-content: center;
}

.items-center {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.margin-top-1rem {
  margin-top: 1rem;
}

.text-align-left {
  text-align: left;
}
`;class pe extends(X(D(d(l)))){static get is(){return"bbva-feature-pin-view"}static get scopedElements(){const e=[B,j,c,L,P,Y,J,Z,re,oe,A,ce,...pe.configurationScopedElements()];return pe.scopedElementsFromClasses(e)}static get properties(){return{response:{type:Boolean},getCvvInputValue:{type:String},masked:{type:Boolean},timer:{type:Boolean},disabledButton:{type:Boolean},kindPayment:{type:String,attribute:"kind-payment"},cardText:{type:String,attribute:"card-text"},cardVariant:{type:String,attribute:"card-variant"},cardKind:{type:String,attribute:"card-kind"},cardKindPayment:{type:String,attribute:"card-kind-payment"},cardNumber:{type:String,attribute:"card-number"},cardExpirationDate:{type:String,attribute:"card-expiration-date"},cardHolderName:{type:String,attribute:"card-holder-name"},cardImageSrc:{type:String,attribute:"card-image-src"},cardProductId:{type:String},ulrCardImg:{type:String},extensionCardImg:{type:String},cardNip:{type:String,attribute:"card-nip"},cardId:{type:String},progressTimer:{type:Object},pubKeyResult:{type:String},encryptResult:{type:String},responseCvv:{type:String},iconClose:{type:String},iconHelp:{type:String},iconInfo:{type:String},host:{type:String},versioncards:{type:String},native:{type:Boolean},requiredToken:{type:String},cvvConst:{type:String},environment:{type:String},isNativeIos:{type:Boolean},cardHolderType:{type:String},_cardsDm:{type:Object},_enviromentDictionary:{type:Object},_pinViewModalManagerElement:{type:Object}}}constructor(){super(),this.getCvvInputValue="",this.response=!1,this.masked=!1,this.timer=!1,this.disabledButton=!1,this.cardText="",this.cardVariant="debit",this.cardKind="",this.cardKindPayment="",this.cardNumber="",this.cardExpirationDate="",this.cardHolderName="",this.cardImageSrc="",this.cardProductId="",this.cardNip="",this.cardId="",this.pubKeyResult="",this.encryptResult="",this.responseCvv="",this.iconClose="bbva:close",this.iconHelp="bbva:help",this.iconInfo="bbva:info",this.host="",this.versioncards="1",this.native=!1,this.requiredToken="",this.ulrCardImg="https://cardcovers.caasbbva.com/mexico/",this.extensionCardImg=".png.imgcaas.w320.png",this.cvvConst="cvv",this.environment="",this.isNativeIos=!1,this.cardHolderType="",this._enviromentDictionary={de:{iOS:"Dev",android:"desa"},pro:{iOS:"Prod",android:"prod"}}}get getHeaderMain(){return g`
      <bbva-header-main
        id= 'header-main'
        slot="slot-header"
        accessibility-text-icon-right-primary=${this.t("bbva-pin-request-accessibility-close-text")}
        icon-right-primary= '${this.iconClose}'
        text= 'bbva-pin-request-show-ccv'
        @header-main-icon-right-primary-click= ${this.openModalWarning}
      ></bbva-header-main>
    `}get _isAdditionalCard(){return"ADDITIONAL"===this.cardHolderType}get setCard(){return g`
      <bbva-clip-card-data
        variant= '${this.cardVariant}'
        kind= '${this.cardKind}'
        kind-payment= '${this.cardKindPayment}'
        card-number= '${this.cardNumber}'
        expiration-date= '${this._formatCardExpirationDate}'
        holder-name= '${this.cardHolderName}'
        image-src= '${this.getCardImageSrc}'
        size= 'XXL'
      ></bbva-clip-card-data>
    `}get getCardImageSrc(){return this.cardImageSrc&&""!==this.cardImageSrc||(this.cardImageSrc=`${this.ulrCardImg+this.cardNumber.slice(0,6)}-${this.cardProductId}${this.extensionCardImg}`),this.cardImageSrc}get getCvv(){return g`
      <form ?hidden= '${this.response}'>
        <bbva-header-category
          id= 'header-category'
          class= 'margin-top-1rem'
          has-help
          icon-help= '${this.iconHelp}'
          text= ${this._isAdditionalCard?"bbva-pin-request-card-data-additional":"bbva-pin-request-card-data"}
          @header-category-help-click= ${this.openModalHelp}
        ></bbva-header-category>
        <bbva-form-password
          class= 'margin-1rem text-align-left'
          type= 'password'
          clear-icon=${q()}
          label-out= ${this.t(this._isAdditionalCard?"bbva-pin-request-label-out-additional":"bbva-pin-request-label-out")}
          label= ${this.t("bbva-pin-request-label")}
          info-message= ${this.t(this._isAdditionalCard?"bbva-pin-request-info-message-additional":"bbva-pin-request-info-message")}
          error-message= ${this.t(this._isAdditionalCard?"bbva-pin-request-error-message-additional":"bbva-pin-request-error-message")}
          pattern= '[0-9]{3}'
          allowed-pattern= '[0-9]'
          auto-validate
          inputMode= 'decimal'
          maxlength=3
          optional-label=''
          .value= ${this.getCvvInputValue}
          @input= ${e=>{this.getCvvInputValue=e.target.value,0===this.getCvvInputValue.length||3===this.getCvvInputValue.length?this.shadowRoot.querySelector('[data-tag-name="bbva-form-password"]').setAttribute("info-message",this.t(this._isAdditionalCard?"bbva-pin-request-info-message-additional":"bbva-pin-request-info-message")):this.shadowRoot.querySelector('[data-tag-name="bbva-form-password"]').removeAttribute("info-message")}}
        ></bbva-form-password>
        <bbva-notification-message
          class= 'margin-1rem'
          message= ${this.t(this._isAdditionalCard?"bbva-pin-request-notification-message-additional":"bbva-pin-request-notification-message")}
          icon= '${this.iconInfo}'
        ></bbva-notification-message>
        <div class= 'margin-center'>
          <bbva-button-default
            text= ${this.t("bbva-pin-request-button-text")}
            ?disabled= '${3!==this.getCvvInputValue.length}'
            @click= ${this.submit}
          ></bbva-button-default>
        </div>
      </form>
    `}get showNip(){return g`
      <div class= 'items-center'>
        <bbva-text
          class= 'margin-button-1rem'
          text= '${this.cardText}'
          alignment= 'center'
          font-weight= '500'
        ></bbva-text>
        ${this.setCard}
        <bbva-text
          class= 'margin-button-1rem'
          text= ${this.t(this._isAdditionalCard?"bbva-pin-request-text-nip-additional":"bbva-pin-request-text-nip")}
          alignment= 'center'
        ></bbva-text>
        <bbva-panel-code-number
          code= '${this.cardNip}'
          group-by= '4'
          ?masked= '${this.masked}'
        ></bbva-panel-code-number>
        <bbva-progress-timer
          id= 'progress-timer'
          ?hidden=${this.masked}
          timeout= '10000'
          @progress-timer-counter-finish= ${this.toggleHide}
        ></bbva-progress-timer>
        <bbva-text
          text= ${this.t("bbva-pin-request-view-second-text")}
          alignment= 'center'
          ?hidden=${this.masked}
        ></bbva-text>
        <bbva-button-default
          class= 'margin-top-1rem'
          text= ${this.t("bbva-pin-request-view-again-text")}
          @click= ${this.showAgain}
          ?disabled= '${!this.disabledButton}'
        ></bbva-button-default>
      </div>
    `}get getProgressTimer(){return this.progressTimer||(this.progressTimer=this.renderRoot.querySelector('[data-tag-name="bbva-progress-timer"]')),this.progressTimer}get getCardDm(){return this._cardsDm||(this._cardsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-cards"]')),this._cardsDm}openModalWarning(){this._pinViewModalManager.openWithSettings({modalId:"warning-modal",modalType:"info",titleIconModal:O(),titleTextModal:this.t("bbva-pin-request-info-modal-title"),bodyTextModal:this.t("bbva-pin-request-info-modal-body"),buttonTextModal:this.t("bbva-pin-request-info-modal-button"),linkTextModal:this.t("bbva-pin-request-info-modal-link")})}closeModalWarning(){this._dispatchCustomEvent("goto-dashboard"),this.reset()}openModalHelp(){this._pinViewModalManager.openWithSettings({modalId:"help-modal",fullHeightModal:!0,fixedFooterModal:!0,headerTypeModal:"modal-three-level",iconRightPrimaryHeaderModal:this.iconClose,headerTextModal:this.t("bbva-pin-request-modal-header-text"),titleIconModal:this.iconHelp,titleTextModal:this.t("bbva-pin-request-modal-title-text"),bodyTextModal:this.t("bbva-pin-request-modal-body-text"),buttonTextModal:this.t("bbva-pin-request-modal-button-text")})}toggleHide(){this.disabledButton?(this.masked=!1,this.disabledButton=!1):(this.masked=!0,this.disabledButton=!0)}showAgain(){this.submit(),this._fireEvent("analytics-fire-pin-request","pin-request-show-again")}getCardPin(e,t){const i={cvv:t,publicKey:e,publicKeyExponent:"010001"};this.getCardDm.getCardPin(this.cardId,i),this._fireEvent("analytics-fire-pin-request","pin-request-otp")}submit(){this.generatedPubKeys()}generatedPubKeys(){const e={key_tag:this._getKeyTag()};this._fireEvent("generate-pub-keys",e)}generateCvvEncrypt(){const e={isHexEncoded:!0,data:this.getCvvInputValue.padEnd(16,"F"),key_tag:this._getKeyTag()};this._fireEvent("generate-cvv-encrypt",e)}generateCvvDecrypt(){this._fireEvent("generate-cvv-decrypt",{data:this.responseCvv,asHexEncoded:!0,format:"ff####ffffffffff"})}errorGetPubKey(){this._fireEvent("analytics-fire-pin-request","pin-request-error_service")}errorEncryptedCvv(){this._fireEvent("analytics-fire-pin-request","pin-request-error_service")}generatedPubKeysSuccess(e){this.pubKeyResult=e.toUpperCase(),this.generateCvvEncrypt()}generateCvvEncryptSuccess(e){this.encryptResult=e,this.getCardPin(this.pubKeyResult,this.encryptResult)}generateCvvDecryptSuccess(e){this.cardNip=e.slice(2,6),this.response?(this.progressTimer=this.getProgressTimer,this.progressTimer.reset(),this.progressTimer.start(),this.toggleHide()):this.response=!0,this._fireEvent("analytics-fire-pin-request","pin-request-success-page")}generateCvvDecryptError(){this._fireEvent("analytics-fire-pin-request","pin-request-error_service")}reset(){this.getCvvInputValue="",this.response=!1,this.masked=!1,this.timer=!1,this.disabledButton=!1,this.cardText="",this.cardKind="",this.cardKindPayment="",this.cardNumber="",this.cardExpirationDate="",this.cardHolderName="",this.cardImageSrc="",this.cardNip="",this._cardsDm=null,this.progressTimer=null,this.cardId="",this.pubKeyResult="",this.encryptResult=""}get _pinViewModalManager(){return this._pinViewModalManagerElement||(this._pinViewModalManagerElement=this.shadowRoot.querySelector('[data-tag-name="pin-view-modal-manager"]')),this._pinViewModalManagerElement}get _formatCardExpirationDate(){const[e,t]=this.cardExpirationDate.split("-");return`${e.slice(2)}/${t}`}_getDataProviderCardsDM(){return g`
      <bbva-dataprovider-cards
        id='bbvaDataProviderCards'
        .host='${this.host}'
        .version='${this.versioncards}'
        ?native='${this.native}'
        .requiredToken='${this.requiredToken}'
        ?requiredOTP='${!0}'
        @card-pin-api-dm-fetch=${this._handleSuccesCvv}
        @card-pin-api-dm-fetch-error=${this._handleErrorCvv}>
      </bbva-dataprovider-cards>
    `}_handleSuccesCvv(e){this.responseCvv=e.detail.pin,this.generateCvvDecrypt()}_handleErrorCvv(){this._pinViewModalManager.openWithSettings({modalId:"error-modal",modalType:"warning",titleIconModal:F(),bodyTextModal:this.t(this._isAdditionalCard?"bbva-pin-request-error-modal-body-additional":"bbva-pin-request-error-modal-body"),buttonTextModal:this.t(this._isAdditionalCard?"bbva-pin-request-error-modal-button-additional":"bbva-pin-request-error-modal-button")})}_getKeyTag(){const e=this.isNativeIos?"iOS":"android";return this._enviromentDictionary[this.environment][e]}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{composed:!0,bubbles:!0,detail:t}))}static get styles(){return[he,m("bbva-feature-pin-view-shared-styles")]}render(){return g`
      ${this._getDataProviderCardsDM()}
      <bbva-transition-container id="transition-container"
        ?visible=${!0}>
        ${this.getHeaderMain}
        <div slot="slot-content">
          ${this.response?this.showNip:this.getCvv}
        </div>
      </bbva-transition-container>

      <pin-view-modal-manager
        @pin-view-modal-manager-accept-button-warning-modal=${this.closeModalWarning}>
      </pin-view-modal-manager>
    `}}class me extends pe{static get is(){return"bbva-feature-pin-view-mx"}static get properties(){return{}}}customElements.define(me.is,me);
