import{H as e,z as t,a8 as i,ar as a,aa as r,aX as o,an as s,L as l,bU as n,cH as c,dy as d,ak as b,h,i as p,av as m,J as v,a9 as u,b0 as g,au as y,bd as f,ab as S,ap as $,as as x,at as _,aJ as k,a as C,bx as T,V as M,aw as E,b6 as A,S as L,ag as w,af as I,ac as R,dp as P,aY as O,aK as V,ad as B,F as D,g as F,b1 as N,cO as z,cS as q,m as H,f as W,o as j,cG as U,ct as G,bF as X,aN as K,ah as Y,du as Z,cs as Q,aH as J,cu as ee,p as te,bo as ie,bp as ae,bq as re,aG as oe,bg as se,dI as le,aT as ne,bb as ce,dZ as de,ex as be,ai as he,aM as pe,ey as me,ep as ve,aI as ue,be as ge,dw as ye,aD as fe,cD as Se,aL as $e,aV as xe,dK as _e,bf as ke,b3 as Ce,bD as Te,dB as Me,dA as Ee,A as Ae,E as Le,b5 as we,y as Ie,di as Re,cT as Pe,fF as Oe}from"./952f98a9.js";import{at as Ve,a7 as Be,cQ as De,cR as Fe,cS as Ne,cT as ze,cU as qe,cV as He,cW as We,aX as je,cX as Ue,f as Ge,a$ as Xe,cY as Ke}from"./7f3d7ca9.js";import"./7ab2eabf.js";import{g as Ye,j as Ze,C as Qe,eH as Je,ex as et}from"./216055dc.js";import"./e5f89cd9.js";import{B as tt}from"./69d7eba8.js";import{b as it}from"./80b427be.js";import{B as at}from"./a845c78d.js";import{B as rt}from"./5e7550b1.js";import"./5b1cfb65.js";import"./bb2482ab.js";import"./a2b15c7c.js";import"./62eefc6e.js";import"./25ca3c7f.js";import"./51384888.js";import{B as ot}from"./a83e7741.js";import"./55752bf7.js";import"./9b29e435.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./0f94a5c2.js";import"./5ccfb5b0.js";import"./5aa1c2be.js";import"./dae2322c.js";import"./e4099866.js";import"./ca1bc295.js";import"./98f361c8.js";class st extends Ve{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class lt extends st{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`payments/v${this.version}/social-contributions/{social-contribution-id}`)}toString(){return super.toString("BGADPMxPaymentsSocialContributionsSocialContributionGetV0")}}class nt extends at{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`payments/v${this.version}/social-contributions/{social-contribution-id}/payment-orders`)}toString(){return super.toString("BGADPMxPaymentsSocialContributionsSocialContributionPaymentOrdersPostV1")}}const ct=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),dt=new a;var bt=t`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
${dt.mediaRules()}`,ht=t`[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
`;class pt extends(o(ct(Be(s(l))))){static get is(){return"onboarding-full-screen-carousel"}static get scopedElements(){const e=[n,Ye,c,d,Ze,...pt.configurationScopedElements()];return pt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},modalTitle:{type:String,attribute:"modal-title"},contentFragmentHost:{type:String,attribute:"content-fragment-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},serviceCacheEnabled:{type:Boolean,attribute:"service-cache-enabled"},headers:{type:Object},items:Array,buttonText:{type:String,attribute:"button-text"},headerIconRightPrimary:{type:String,attribute:"header-icon-right-primary"},headerIconRightSecondary:{type:String,attribute:"header-icon-right-secondary"},maxErrorRetries:{type:Number,attribute:"max-error-retries"},attachModalsToBody:{type:Boolean,attribute:"attach-modals-to-body"},_data:Array,_selectedPage:Number,_scopedItems:Array}}get _headers(){return this.headers||{Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"text/plain"}}static get styles(){return[bt,b("onboarding-full-screen-carousel-shared-styles")]}constructor(){super(),this.config={header:!1,loader:!0,notify:!1},this.attachModalsToBody=!1,this.visible=!1,this.modalTitle="",this.items=[],this.buttonText="",this.maxErrorRetries=2,this.serviceCacheEnabled=!1,this._selectedPage=0,this._errorRetries=0,this._scopedItems=[{tagName:"bbva-panel-offer",class:d}]}render(){var e,t;const i=`onboardingAemData-${(null===(e=this.contentFragmentPath)||void 0===e||null===(t=e.match(/\/([^/.]+)\./))||void 0===t?void 0:t[1])||""}-${this.language||""}`;return h`
      <bbva-global-aem-content-fragment-dm
        ?native="${this.native}"
        host="${this.contentFragmentHost}"
        path="${this.contentFragmentPath}"
        cachetype="${this.serviceCacheEnabled?"SESSION":"NONE"}"
        cachekey="${i}"
        @aem-content-fragment-dm-fetch="${e=>{this._generateCarouselContent(e),this.clearLoader()}}"
        @aem-content-fragment-dm-fetch-error="${this._manageFetchError}"
        cross-domain
        .headers="${this._headers}"
      ></bbva-global-aem-content-fragment-dm>
      <bbva-help-modal
        data-id="modalOnboardingFullScreenCarousel"
        .contentStyles="${this.attachModalsToBody?ht:""}"
        full-height
        fixed-footer
        ?attach-to-body="${this.attachModalsToBody}"
        header-type="modal"
        header-text="${this.modalTitle}"
        aria-label="${this.modalTitle}"
        ?visible=${this.visible}
        @modal-state-change=${e=>{this.visible=e.detail.visible}}
        hide-content-padding-top
        icon-right-primary="${p(this.headerIconRightPrimary)}"
        icon-right-secondary="${p(this.headerIconRightSecondary)}"
        accessibility-text-icon-right-primary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-primary")}"
        accessibility-text-icon-right-secondary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-secondary")}"
      >
        <div class="carousel-wrapper" slot="slot-content">
          ${super.render()}
          <bbva-carousel-swipe
            .items=${this.items}
            .scopedComponents=${this._scopedItems}
            variant="full-screen"
            @carousel-swipe-item-select=${this._changedPage}
          ></bbva-carousel-swipe>
        </div>
        <div class="footer ${m({hidden:!this.buttonText})}" slot="slot-footer">
          <bbva-button-default
            @click=${this._buttonClick}
            text="${this.buttonText}"
          ></bbva-button-default>
        </div>
      </bbva-help-modal>
    `}firstUpdated(){this._dm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]')}updated(e){(e.has("contentFragmentHost")||e.has("contentFragmentPath"))&&(this._errorRetries=0,this.showLoader(),this._dm.getAemData())}_manageFetchError(){this._errorRetries<this.maxErrorRetries?(this._errorRetries+=1,this._dm.getAemData()):(this.clearLoader(),this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-loading-error",{detail:!0,bubbles:!0,composed:!0})))}_generateCarouselContent(e){var t,i,a;this._data=((null==e||null===(t=e.detail)||void 0===t||null===(i=t.items)||void 0===i||null===(a=i.contentfragmentlist)||void 0===a?void 0:a.items)||[]).map((({elements:e})=>e)),this.items=(this._data||[]).map((({image:e,title:t,description:i})=>({content:h`
        <bbva-panel-offer content-title="${t.value}">
          <img
            slot="microillustration"
            src="${`${this.contentFragmentHost}${e.value}`}"
            alt="${e.title}"
          />
          <p>${i.value}</p>
        </bbva-panel-offer>
      `}))),this._changedPage()}_changedPage({detail:e}={}){var t,i;this._selectedPage=e||0,this.buttonText=this._data?((null===(t=this._data[this._selectedPage])||void 0===t||null===(i=t.buttonText)||void 0===i?void 0:i.value)||"").trim():this.buttonText,this._selectedPage===this.items.length-1&&this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-last-item",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){const e=this._data?this._data[this._selectedPage].buttonAction.value:"onboarding-full-screen-carousel-item-select";this.dispatchEvent(new CustomEvent(e,{detail:this._selectedPage,bubbles:!0,composed:!0})),this.visible=!1}}class mt extends(v(l)){static get is(){return"bill-payments-api-dm"}static get scopedElements(){return{BGADPPaymentsServicesGetV0:De,BGADPPaymentsStoredServicesGetV0:Fe,BGADPPaymentsServicesServiceGetV0:Ne,BGADPPaymentsServicesServiceAdditionalPaymentFieldsGetV0:ze,BGADPPaymentsServicesServiceBillsGetV0:qe,BGADPPaymentsServicesServiceBillsSearchPostV0:He,BGADPPaymentsStoredServicesPostV0:We,BGADPMxPaymentsSocialContributionsSocialContributionGetV0:lt,BGADPMxPaymentsSocialContributionsSocialContributionPaymentOrdersPostV1:nt}}static get properties(){return{host:{type:String},version:{type:String},requiredToken:{type:String},headers:{type:Object},native:{type:Boolean},timeOut:{type:Number},tsec:{type:String},deviceId:{type:String}}}constructor(){super(),this.host="",this.version="",this.requiredToken="",this.headers={},this.native=!1,this.timeout=0,this.tsec="",this.deviceId=""}static _getBgadpService(e){return new De(e)}static _getBgadpServiceStored(e){return new Fe(e)}static _getBgadpServiceIndicators(e){return new Ne(e)}static _getBgadpServiceAdditionalPayment(e){return new ze(e)}static _getBgadpServiceSearchBill(e){return new qe(e)}static _postServiceStorange(e){return new We(e)}static _getBgadpServiceSearchTaxes(e){return new He(e)}static _getBgadpServiceSocialContributions(e){return new lt(e)}static _postBgadpMxPaymentOrders(e){return new nt(e)}get getHeaders(){return{tsec:this.tsec,"Content-Type":"application/json",authenticationtype:"58",authenticationdata:`deviceid=${this.deviceId}`}}getListAgileServicePayment(){const e={host:this.host,headers:{...this.getHeaders},version:this.version,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout},t=mt._getBgadpServiceStored(e);this._generateGetService(t,{customEvent:"success-response-agile-service-payments",errorFireEventHandler:"error-response-agile-service-payments"})}getServiceIndicators(e,t={}){const i={"service-id":e,expand:"indicators"},a={host:this.host,headers:{...this.getHeaders},params:{...i,...t},version:this.version,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout},r=mt._getBgadpServiceIndicators(a);this._generateGetService(r,{customEvent:"success-response-service-indicators",errorFireEventHandler:"error-response-service-indicators"})}getListService(){const e={host:this.host,headers:{...this.getHeaders},version:this.version,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout},t=mt._getBgadpService(e);this._generateGetService(t,{customEvent:"success-response-list-service",errorFireEventHandler:"error-response-list-service"})}getAdditionalPaymentFields(e,t={}){const i={"service-id":e},a={host:this.host,headers:{...this.getHeaders},native:this.native,requiredToken:this.requiredToken,version:this.version,timeout:this.timeout,params:{...i,...t}},r=mt._getBgadpServiceAdditionalPayment(a);this._generateGetService(r,{customEvent:"success-response-additional-payment",errorFireEventHandler:"error-response-additional-payment"})}getSearchBill(e){const t={host:this.host,headers:{...this.getHeaders},native:this.native,requiredToken:this.requiredToken,version:this.version,timeout:this.timeout,params:{"service-id":e.serviceId,"billReference.referenceType.id":e.billReferenceType,"billReference.value":e.billNumber}},i=mt._getBgadpServiceSearchBill(t);i.generateRequest().then((()=>{const e=this._parseResponse(i.getLastResponse());this.dispatchEvent(new CustomEvent(e?"success-response-get-bills":"error-response-get-bills",{bubbles:!0,composed:!0,detail:e}))}),this._generateErrorFireEventHandler("error-response-get-bills"))}_generateErrorFireEventHandler(e){return t=>{this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:{error:t}}))}}getSearchTaxes(e){const t=e.additionalFields,i={host:this.host,headers:{...this.getHeaders},native:this.native,body:t,requiredToken:this.requiredToken,version:this.version,timeout:this.timeout,params:{"service-id":e.serviceId}},a=mt._getBgadpServiceSearchTaxes(i);this._generateGetService(a,{customEvent:"success-response-get-taxes",errorFireEventHandler:"error-response-get-taxes"})}postStorangeService(e){const t={host:this.host,headers:{...this.getHeaders},native:this.native,body:e.detail,requiredToken:this.requiredToken,version:this.version,timeout:this.timeout},i=mt._postServiceStorange(t);this._generateGetService(i,{customEvent:"success-response-post-save-service",errorFireEventHandler:"error-response-post-save-service"})}getSocialContributions(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},params:{"social-contribution-id":e.socialContributionId},native:this.native,requiredToken:this.requiredToken,version:this.version,timeout:this.timeout,forceBoundary:!1,htmlContext:this};this.requiredOTP=!0;const i=mt._getBgadpServiceSocialContributions(t);this._generateGetService(i,{customEvent:"success-response-get-social-contributions",errorFireEventHandler:"error-response-get-social-contributions"})}postMxPaymentOrders(e,t){const i={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},params:{"social-contribution-id":e.socialContributionId},native:this.native,body:t,requiredToken:this.requiredToken,version:this.version,timeout:this.timeout,forceBoundary:!1,htmlContext:this};this.requiredOTP=!0;const a=mt._postBgadpMxPaymentOrders(i);this._generateGetService(a,{customEvent:"success-response-post-save-payment-order-service",errorFireEventHandler:"error-response-post-save-payment-order-service"})}setDeviceId(e){this.deviceId=e}}const vt=new a;var ut=t`[ambient^=light] {
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
${vt.mediaRules()}`;const gt=new a;var yt=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${i(u.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${i(u.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${gt.mediaRules()}`;const ft={dark:t`
    ${g.dark}
    ${y.dark}
    ${f.dark}
    ${yt}
  `,light:t`
    ${g.light}
    ${y.light}
    ${f.light}
    ${ut}
  `},St=new a;var $t=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${i(u.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${i(u.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
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
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}
:host(:not([variant=stacked])) .wrapper-mask {
  align-self: center;
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
:host([description-medium]) [data-tag-name=bbva-amount],
:host([description-medium]) .wrapper-mask {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(S.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(S.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${i(S.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(S.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${i(S.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${i(S.mediumItalic.fontStyle)});
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
:host([variant=stacked-center]) .wrapper [data-tag-name=bbva-link], :host([variant=stacked-center]) [data-tag-name=bbva-text],
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
${St.mediaRules()}`;class xt extends($(x(_(k(C(s(l))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[E,A,L,w,I];return xt.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,$t,ft.light,ft.dark,T("button:focus"),b("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return h`
      <bbva-amount
        disabled-tabindex
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
        ?show-currency-code="${this.showCurrencyCode}"
      >
      </bbva-amount>
    `}get _icon(){return h`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return h`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return h`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const e="nochange"===this.status?"no-change":this.status;return h`
      <bbva-badge-variability
        disabled-tabindex
        .status=${e}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const e=M(this.mask,this.maskChars,!0,this.visibleChars);return h`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),h`
      <dd class=${m({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return h`
      <bbva-link
        class=${m({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${p(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${p(this.roleLink)} aria-live=${p(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,i=`${e}TagText`,a=`${e}RoleText`,r=`${e}AriaLiveText`;return h`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${p(this[a])}"
        aria-live="${p(this[r])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${p(this[i])}"
      >
      </bbva-text>
    `}_tplText(e){return h` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return h`
      <dl>
        <dt class=${m({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return h`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?h`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):h` <div class="wrapper-description">${this._tplText("description")}</div> `,h`
      ${e}
      <div class="skeleton"></div>
    `}}customElements.define(xt.is,xt);const _t=new a;var kt=t`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${i(u.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
${_t.mediaRules()}`;const Ct=new a;var Tt=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${i(u.secondary300)});
}
${Ct.mediaRules()}`;const Mt=new a;var Et=t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${i(u.secondary300)});
}
${Mt.mediaRules()}`;const At={dark:t`
    ${Et}
  `,light:t`
    ${Tt}
  `};class Lt extends(C(l)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[kt,At.light,At.dark,b("bbva-divider-shared-styles")]}render(){return h` <hr divider="${this.size}" /> `}}customElements.define(Lt.is,Lt);var wt=t`
:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}

.content-flex {
  display: flex;
}

.btn-new-service {
  align-items: center;
}

.bbva-icon-btn-primary {
  color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  margin-right: 0.5rem;
}

.content-link {
  align-items: center;
  justify-content: space-between;
  margin-top: 2rem;
  margin-bottom: 0.5rem;
}

.text-num-agreement {
  color: var(--colorsSecondary600, ${i(u.secondary600)});
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.number-of-agreement {
  color: var(--colorsSecondary600, ${i(u.secondary600)});
  text-align: right;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.main-content {
  display: flex;
  flex-flow: column;
  align-self: center;
}

.bbva-text-stored-title {
  --bbva-text-font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  line-height: 1.5rem;
}

[data-tag-name=bbva-button-default]#linkAllCards,
[data-tag-name=bbva-button-default]#linkAllAccount {
  margin-top: 1rem;
}

.slot-modal-content {
  margin-bottom: 2rem;
}

.panel-info {
  margin-top: 1rem;
}

.title-empty-result {
  margin-top: 1rem;
  margin-bottom: 0.5rem;
  text-align: center;
  font-size: 1.125rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  line-height: 1.5rem;
}

.content-empty-result {
  text-align: center;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.heading {
  color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  line-height: 1.5rem;
}

.bbva-text-description {
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.content-link-account {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.image {
  margin-right: calc(1 * var(--gridSpacerVariant, var(--gridSpacer, 8)) / 16 * 1rem);
}

.content-reference {
  padding-top: 1rem;
  padding-bottom: 0.5rem;
  align-items: center;
  justify-content: space-between;
}

.content-button-edit {
  display: grid;
  justify-items: center;
  margin-top: 2rem;
}

.content-clip-list,
.content-reference-edit {
  padding-top: 1rem;
}

.panel-content-image {
  text-align: center;
}

.panel-content,
.notification-margin,
.button-edit {
  margin-top: 1rem;
}

.help-modal {
  --bbva-help-modal-padding: 0rem 1rem;
  --bbva-help-modal-footer-padding: none;
}

bbva-form-predictive,
.concept-input,
.camera-input {
  text-align: left;
}

.button-continue {
  display: flex;
  justify-content: center;
  margin-top: 1.5rem;
}

.button-continue-amount {
  display: flex;
  justify-content: center;
  margin-top: 2rem;
}

.row {
  justify-content: space-between;
}

.text-choose-medium {
  margin-bottom: 0.5rem;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
}

.text-credit-card,
.text-account {
  margin-top: 1rem;
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-size: 0.875rem;
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  text-transform: uppercase;
}

.search-form {
  padding-bottom: 0.5rem;
}

.title-modal-search {
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  line-height: 1.5rem;
  text-transform: uppercase;
  padding-bottom: 0.5rem;
}

.button-continue-modal-detail {
  padding-top: 2rem;
}

.list-wrapper {
  position: relative;
}
.list-wrapper [data-tag-name=bbva-text] {
  text-indent: 2rem;
}
.list-wrapper [data-tag-name=bbva-icon] {
  flex-shrink: 0;
  margin-right: 0.5rem;
  --bbva-icon-color:	var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  position: absolute;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0;
  --typographyTypeSmall: var(--typographyTypeMedium, ${i(R.typeMedium)});
}

.capture-line {
  word-wrap: break-word;
}

[data-tag-name=bbva-notification-message] {
  --fontFacePrimaryMediumFontWeight: #token("foundations.fontFacePrimary.book.fontWeight");
}

.capture-line-help [data-tag-name=bbva-list-bullet] {
  padding-bottom: 0.5rem;
}

.text-description {
  margin: 0;
  padding-top: 2rem;
}

.import-title {
  text-align: left;
}
`;const It=(e,t,i)=>{e.dispatchEvent(new CustomEvent(t,{detail:i,bubbles:!0,composed:!0}))},Rt=[{id:"000844985",name:"SAT"},{id:"001137840",name:"CDMX"},{id:"000000028",name:"SIPARE"}];function Pt(e){return Rt.find((t=>t.id===e))?"":e}const Ot="feature-bill-payments-close-error-modal-multistep",Vt="feature-bill-payments-close-error-modal-select-service",Bt="feature-bill-payments-exit-payment",Dt="feature-bill-payments-new-service-click",Ft="feature-bill-payments-select-service-modal-search",Nt="feature-bill-payments-select-service-modal-search-close",zt="feature-bill-payments-select-service-modal-all-service-close",qt="feature-bill-payments-select-service-modal-all-service-open",Ht="feature-bill-payments-select-reference-of-service",Wt="feature-bill-payments-select-service-modal-search-service-by-id",jt="feature-bill-payments-select-service-choose-another-service",Ut="feature-bill-payments-modal-service-detail-close",Gt="feature-bill-payments-select-service-from-saved",Xt="feature-bill-payments-select-amount-value-change",Kt="feature-bill-payments-select-amount-btn-confirm",Yt="feature-bill-payments-continue-sumarry",Zt="feature-bill-payments-select-origin",Qt="feature-bill-payments-select-concept",Jt="complete",ei="feature-bill-confirm-step-concept",ti="feature-bill-payments-open-error-modal-select-service",ii="analytics-billPayments-app-page-view",ai="analytics-billPayments-app-started",ri="feature-bill-payments-completed-select-service",oi="feature-bill-payments-completed-origin",si="feature-bill-payments-completed-concept",li="feature-bill-payments-completed-summary",ni="analytics-billPayments-app-step-completed",ci="analytics-billPayments-app-internal-link-reference",di="analytics-billPayments-app-internal-link-edit-service",bi="analytics-billPayments-app-internal-scanner-code",hi="analytics-billPayments-app-page-view-without-result",pi="analytics-billPayments-app-page-view-select-origin",mi="analytics-billPayments-app-page-view-error-search",vi="analytics-billPayments-app-site-error",ui="get-billPayments-detail-from-local-storage",gi="set-data-storage-billPayments-onboarding",yi="analytics-billPayments-site-error-capture-line-sipare",fi="analytics-billPayments-site-error-out-of-time",Si="analytics-billPayments-site-error-no-email",$i="analytics-billPayments-site-scanner-code";class xi extends(Qe(l)){static get is(){return"bbva-modal-show-all-services-stored"}static get scopedElements(){return{"bbva-text":w,"bbva-divider":Lt,"bbva-clip-box":V,"bbva-help-modal":c}}static get properties(){return{savedList:{type:Array},visibleModalAllServices:{type:Boolean},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"}}}constructor(){super(),this.savedList=[],this.visibleModalAllServices=!1,this.iOSFixedHeader=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}render(){return h`
      <bbva-help-modal
        id="modalShowAllServicesStored"
        class="help-modal"
        hide-content-padding-top
        ?visible="${this.visibleModalAllServices}"
        open="${this.visibleModalAllServices}"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t("bill-payments-title-all-saved-modal")}"
      >
        <div class="main" slot="slot-content">
          ${this.savedList.map(((e,t)=>h`
              <div
                id="item${t}"
                class="content-clip-list"
                @click="${()=>It(this,Gt,e)}"
              >
                <div class="content-flex">
                  <div class="image">
                    <bbva-clip-box
                      data-tag-name="bbva-clip-box"
                      text="${p(e.service.name)}"
                      bg-color="#1973B8"
                      size="large"
                    >
                    </bbva-clip-box>
                  </div>
                  <div class="main-content">
                    <bbva-text
                      tag="span"
                      class="heading"
                      text="${p(e.service.name)}"
                    ></bbva-text>
                    <bbva-text
                      tag="span"
                      class="bbva-text-description"
                      text="${p(e.alias)}"
                    ></bbva-text>
                  </div>
                </div>
                <div class="content-reference content-flex">
                  <bbva-text
                    tag="span"
                    class="text-num-agreement"
                    text="${Pt(e&&e.service&&e.service.id)?this.t("bill-payments-title-num-agreement"):""}"
                  ></bbva-text>
                  <bbva-text
                    tag="span"
                    class="number-of-agreement"
                    text="${Pt(e&&e.service&&e.service.id)}"
                  ></bbva-text>
                </div>
                <bbva-divider
                  .hidden=${t===this.savedList.length-1}
                  size="full"
                ></bbva-divider>
              </div>
            `))}
        </div>
      </bbva-help-modal>
    `}}customElements.define(xi.is,xi);const _i=new a;var ki=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(u.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(u.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(u.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(R.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(B.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${_i.mediaRules()}`;const Ci=new a;var Ti=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${Ci.mediaRules()}`;const Mi=new a;var Ei=t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(u.primaryCoreLight)});
}
${Mi.mediaRules()}`;const Ai={dark:t`
    ${Ei}
  `,light:t`
    ${Ti}
  `};class Li extends(C(s(k(l)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":w}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,ki,Ai.dark,Ai.light,b("bbva-notification-help-shared-styles")]}render(){return h`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}F("colors.primarySubduedLight"),F("colors.cool20"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),F("colors.tertiaryType6Light"),F("colors.cool20"),F("colors.cool50");const wi=new a;var Ii=t`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${wi.mediaRules()}`;const Ri=new a;var Pi=t`[ambient^=dark] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)});
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${i(u.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${i(u.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${i(u.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${i(u.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${i(u.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${i(u.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${i(u.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${Ri.mediaRules()}`;const Oi={dark:t`
    ${Pi}
    ${g.dark}
    ${N.dark}
    ${Ai.dark}
    ${z.dark}
    ${q.dark}
  `,light:t`
    ${Ii}
    ${g.light}
    ${N.light}
    ${Ai.light}
    ${z.light}
    ${q.light}
  `};var Vi=t`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${i(u.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${i(u.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${i(u.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --bbva-button-default-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --bbva-button-default-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${i(u.primaryCore)})));
  --bbva-button-default-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --bbva-button-default-icon-color-variant: var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${i(u.primaryMedium)}));
  display: block;
  box-sizing: border-box;
  position: relative;
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

.field {
  position: relative;
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${i(R.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${i(R.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${i(B.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${i(S.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}
.clear :host([invalid]) [data-tag-name=bbva-button-default] {
  fill: var(--_button-default-color-icon-focus-variant);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  --bbva-button-default-icon-color-variant: var(--_invalid-field-label-color);
  --_button-default-color-icon-variant: var(--_invalid-action-icon-color);
}
:host([invalid]) .clear:active, :host([invalid]):host([action-into-form][action-variant]) .action {
  --_button-default-color-icon-focus-variant: var(--_invalid-action-icon-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-icon][disabled] {
  color: unset;
}
:host([action-into-form]):host([readonly]) .wrapper-action [data-tag-name=bbva-icon] {
  fill: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-icon] {
  fill: var(--_invalid-action-icon-color);
  --bbva-button-default-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: none;
}

.message {
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${i(R.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${i(B.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}

.message-error[data-tag-name=bbva-notification-help] {
  --_notification-help-icon-color: var(--_message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;F("colors.cool70"),F("colors.primaryCoreLightened"),F("colors.cool20"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.cool20"),F("colors.cool20"),F("colors.cool20"),F("colors.cool20"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.cool20"),F("colors.cool20"),F("colors.cool70"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.tertiaryType1Light"),F("colors.tertiaryType1Light"),F("colors.primarySubdued"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened");let Bi=class extends(C(s(G))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-text":w,"bbva-link":A,"bbva-notification-help":Li,"bbva-icon":D,"bbva-button-default":n}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},iconVariant:{type:String,attribute:"icon-variant"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-input-field-submit",this.actionIntoForm=!1,this.clearIcon=X(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-field-clear",this.optionalLabel="bbva-form-input-field-optional-label",this.errorIcon=K(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=Y(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1,this.hideBottomPaddingInfoMessage=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=this.required?this._isEmpty:this.invalid),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?h`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${p(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?h`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            tag="legend"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,Vi,Oi.light,Oi.dark,b("bbva-form-input-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return h`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return h`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field}
        ${this.iconVariant||this.readonly||!this.actionType?this.rightIcon:this.actionButton}
      </div>
    `}get clearButton(){return h`
      <bbva-button-default
        tabindex="0"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="icon no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return h` <bbva-button-default
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      variant="icon ${this.actionVariant}"
    >
    </bbva-button-default>`}get rightIcon(){return this.actionIcon?h`
          <div class="wrapper-action">
            <bbva-icon .icon="${this.actionIcon}" .size="${this.actionIconSize}"></bbva-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?h`
          <div class="message error" role="alert">
            <bbva-notification-help
              class="message-error"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get messageInfo(){return this.infoMessage?h`
          <bbva-notification-help
            ?hide-bottom-padding=${this.hideBottomPaddingInfoMessage}
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            disabled-tabindex
          ></bbva-notification-help>
        `:""}get labelBlock(){return h`
      <bbva-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this.inputLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-text>
    `}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return h`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}};const Di=new a;var Fi=t`@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
  --_form-amount-currency-color: var(--bbva-form-amount-currency-dark-mode-color, var(--bbva-form-amount-currency-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_form-amount-readonly-currency-color: var(--bbva-form-amount-readonly-currency-dark-mode-color, var(--bbva-form-amount-readonly-currency-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-amount-currency-invalid-color: var(--bbva-form-amount-currency-dark-mode-invalid-color, var(--bbva-form-amount-currency-invalid-color, var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_form-amount-currency-invalid-auto-validate-color: var(--bbva-form-amount-currency-dark-mode-invalid-auto-validate-color, var(--bbva-form-amount-currency-invalid-auto-validate-color, var(--colorsSecondary600, ${i(u.secondary600)})));
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

.slot-input ::slotted(input) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${i(R.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
}
.back-amount {
  flex: auto;
  opacity: 0;
}
:host([focused]) .back-amount, :host([filled]) .back-amount {
  flex: none;
  max-width: calc(100% - rem(48px));
}
.back-currency {
  order: 1;
  color: var(--_form-amount-currency-color);
}
:host([readonly]) .back-currency {
  color: var(--_form-amount-readonly-currency-color);
}
.back-currency::before {
  content: " ";
}
:host([focused]) .back-currency, :host([filled]) .back-currency {
  order: -1;
}
:host([focused]) .back-currency::before, :host([filled]) .back-currency::before {
  content: "";
}
:host([focused]) .back-currency.right, :host([filled]) .back-currency.right {
  order: 1;
}
:host([focused]) .back-currency.hide-currency, :host([filled]) .back-currency.hide-currency {
  opacity: 0;
}
:host([focused]) .back-currency:not(.right)::after, :host([focused]) .back-currency.right::before, :host([filled]) .back-currency:not(.right)::after, :host([filled]) .back-currency.right::before {
  content: " ";
}

:host([flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

:host([show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

:host([focused][flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

:host([focused][show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

:host([invalid]) .back-currency,
:host([focused][invalid]) .back-currency {
  color: var(--_form-amount-currency-invalid-color);
}

:host([invalid][auto-validate]) .back-currency {
  color: var(--_form-amount-currency-invalid-auto-validate-color);
}

.with-clip .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}
.with-clip .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

.clip {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
${Di.mediaRules()}`,Ni=t`[ambient^=dark] {
  --bbva-form-amount-currency-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-amount-readonly-currency-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-amount-currency-invalid-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-amount-currency-invalid-auto-validate-color: initial;
}
`,zi=t`[ambient^=light] {
  --bbva-form-amount-currency-color: initial;
  --bbva-form-amount-readonly-currency-color: initial;
  --bbva-form-amount-currency-invalid-color: initial;
  --bbva-form-amount-currency-invalid-auto-validate-color: initial;
}
`;const qi={dark:t`
    ${Ni}
    ${Z.dark}
    ${Oi.dark}
  `,light:t`
    ${zi}
    ${Z.light}
    ${Oi.light}
  `},Hi=new a;var Wi=t`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${Hi.mediaRules()}`;const ji=new a;var Ui=t`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${i(u.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${i(u.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${i(u.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${i(u.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${i(u.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${i(u.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${i(u.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${i(u.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${ji.mediaRules()}`;t`
    ${Ui}
    ${Q.dark}
    ${g.dark}
  `,t`
    ${Wi}
    ${Q.light}
    ${g.light}
  `;t`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${i(u.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${i(u.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${i(u.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${i(u.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${i(u.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${i(u.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  display: block;
  box-sizing: border-box;
  position: relative;
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

.field {
  position: relative;
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${i(R.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${i(R.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${i(B.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${i(S.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${i(R.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${i(B.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  color: var(--_invalid-field-clear-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]):host([readonly]).wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_invalid-action-icon-color);
  --bbva-button-icon-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${i(R.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${i(B.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}
.info .message-icon {
  color: var(--_info-message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-core-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;C(s(G));F("colors.cool70"),F("colors.primaryCoreLightened"),F("colors.cool20"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.cool20"),F("colors.cool20"),F("colors.cool20"),F("colors.cool20"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.cool20"),F("colors.cool20"),F("colors.cool70"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.tertiaryType1Light"),F("colors.tertiaryType1Light"),F("colors.primarySubdued"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened");F("colors.primaryCoreLightened"),F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),ie(),ae(),re();const Gi={apple:{logo:"applepay",text:"bbva-clip-card-pay-compatibility-apple"},google:{logo:"googlepay",text:"bbva-clip-card-pay-compatibility-google"}};class Xi extends(x(_(C(s(Bi))))){static get is(){return"bbva-form-amount"}static get scopedElements(){return{"bbva-text":w,"bbva-link":A,"bbva-notification-help":Li,"bbva-icon":D,"bbva-button-default":n,"bbva-clip-flag":oe,"bbva-clip-card":se}}static get properties(){return{flag:{type:String,reflect:!0},showCard:{type:Boolean,attribute:"show-card"},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},cardVariant:{type:String,attribute:"card-variant"},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},accessibilityText:{type:String,attribute:"accessibility-text"},partnerLogo:{type:String,attribute:"partner-logo"},partnerLogoVariant:{type:String,attribute:"partner-logo-variant"},partner:{type:Boolean}}}constructor(){super(),this.cardType="",this.cardVariant="",this.showCard=!1,this.cardStatus="",this.partner=!1,this.cardImage="",this.payCompatibility="",this.payCompatibilityInfo=Gi,this.accessibilityText="bbva-form-input-amount-clip-card-image"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("focusout",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("focusout",this._checkTrailingDecimal)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(e){super.updated&&super.updated(e),e.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),e.has("value")&&this.formatValue(this.value),e.has("amount")&&Number.isFinite(this.amount)&&(this.value=String(this.amount).replace(/\./g,this._separator)),(e.has("localCurrency")||e.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,Fi,qi.dark,qi.light,b("bbva-form-amount-shared-styles")]}get flagBlock(){return h`
      ${this.flag?h`
            <span class="clip">
              <bbva-clip-flag
                icon="${p(this._getFlag())}"
                size="small"
                iconset="${p(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get cardBlock(){return h`
      ${this.showCard?h`
            <span class="clip">
              <bbva-clip-card
                size="small"
                status="${this.cardStatus}"
                card-type="${this.cardType}"
                variant="${this.cardVariant}"
                pay-compatibility="${this.payCompatibility}"
                card-image="${this.cardImage}"
                accessibilityText="${this.t(this.accessibilityText)}"
                ?partner="${this.partner}"
                partner-logo="${p(this.partnerLogo)}"
                partner-logo-variant="${p(this.partnerLogoVariant)}"
                disabled-tabindex
              ></bbva-clip-card>
            </span>
          `:""}
    `}get _isRightAligned(){return this._alignRight}get labelBlock(){return h` <bbva-text
      unset
      size="2XS"
      tag="label"
      for="${this._formElementId}"
      text="${this.label}"
      class="label"
      @click="${this.focus}"
    ></bbva-text>`}get inputLabel(){return`${this.label} (${this._currency})`}get field(){return h`
      <div
        class="field ${this.flag||this.showCard?"with-clip":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.cardBlock}${this.backAmount} ${this.labelledInput}
        ${this.clearButton}
      </div>
    `}get backAmount(){return h`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${this._isRightAligned?"right":""} ${this.placeholder&&!this.value?"hide-currency":""}"
          >${this._currency}</span
        >
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const e=this._isRightAligned?0:this._currencyBlock.offsetWidth,i=t`
      ${e/16}rem
    `;this._formElement.style.setProperty("margin-left",i)}_getFlag(){var e;let t=this.flag.toLowerCase();return t=t[0].toUpperCase()+t.slice(1),null===(e=Je[`flags${t}`])||void 0===e?void 0:e.call(Je)}_formatNumber(e,t){return t?e.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):e.replace(/\D/g,"")}_formatCurrency(e,t){let i;if(e.indexOf(t)>=0){const a=e.indexOf(t);let r=e.substring(0,a),o=e.substring(a);r=this._formatNumber(r,!0),o=this._formatNumber(o,!1),o=o.substring(0,this.decimalDigits),i=this.decimalDigits?r+t+o:r}else i=this._formatNumber(e,!0);return i}formatValue(e){if(""===e||null==e)return void this._fireChange(e,this.amount);this.amount=e?Number(e.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0;const t=String(e),i=this._formElement,a=t.length;let r=i.selectionStart;const o=this._formatCurrency(t,this._separator);i.value=o,t===o&&this._fireChange(o,this.amount),this.value=i.value;r=o.length-a+r,i.setSelectionRange(r,r)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(e,t){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:e,amount:t},bubbles:!0,composed:!0}))}}var Ki=t`:host {
  display: block;
  box-sizing: border-box;
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
`;const Yi={light:t`
    ${Oi.light}
  `,dark:t`
    ${Oi.dark}
  `};class Zi extends(C(Bi)){static get is(){return"bbva-form-attach"}static get properties(){return{inputType:{type:String,attribute:"input-type"}}}constructor(){super(),this.actionIcon="",this.actionIntoForm=!0,this.actionType="submit",this.actionVariant="no-background",this.inputType=""}static get styles(){return[super.styles,Ki,b("bbva-form-attach-shared-styles"),Yi.light,Yi.dark]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}get _icons(){const e={camera:le(),contact:ne()};return this.inputType in e&&e[this.inputType]}}const Qi=new a;var Ji=t`:host {
  display: block;
  box-sizing: border-box;
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

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
${Qi.mediaRules()}`;const ea={dark:t`
    ${Oi.dark}
  `,light:t`
    ${Oi.light}
  `};class ta extends(C(Bi)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":oe,"bbva-icon":D,"bbva-text":w,"bbva-link":A,"bbva-notification-help":Li,"bbva-button-default":n}}static get properties(){return{flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text"}_getFlag(){var e;let t=this.flag.toLowerCase();return t=t[0].toUpperCase()+t.slice(1),null===(e=Je[`flags${t}`])||void 0===e?void 0:e.call(Je)}static get styles(){return[super.styles,Ji,ea.light,ea.dark,b("bbva-form-text-shared-styles")]}get field(){return h`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return h`
      ${this.flag?h`
            <span class="flag">
              <bbva-clip-flag
                icon="${p(this._getFlag())}"
                size="small"
                iconset="${p(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const ia=new a;var aa=t`:host {
  display: block;
  box-sizing: border-box;
  --_form-date-clear-icon-color: var(--bbva-form-date-dark-mode-clear-icon-color, var(--bbva-form-date-clear-icon-color, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_form-date-invalid-clear-icon-color: var(--bbva-form-date-dark-mode-invalid-clear-icon-color, var(--bbva-form-date-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_form-date-readonly-clear-color: var(--bbva-form-date-dark-mode-readonly-clear-icon-color, var(--bbva-form-date-readonly-clear-icon-color, var(--colorsSecondary500, ${i(u.secondary500)})));
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

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.clear [data-tag-name=bbva-icon] {
  color: var(--_form-date-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-icon] {
  fill: var(--_form-date-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-icon] {
  color: var(--_form-date-readonly-clear-color);
}
${ia.mediaRules()}`;const ra=new a;var oa=t`[ambient^=light] {
  --bbva-form-date-clear-icon-color: initial;
  --bbva-form-date-invalid-clear-icon-color: initial;
  --bbva-form-date-readonly-clear-icon-color: initial;
}
${ra.mediaRules()}`;const sa=new a;var la=t`[ambient^=dark] {
  --bbva-form-date-clear-icon-color: var(--colorsPrimaryVariantLightened, ${i(u.primaryVariantLightened)});
  --bbva-form-date-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-date-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${sa.mediaRules()}`;const na={dark:t`
    ${la}
    ${z.dark}
    ${Oi.dark}
  `,light:t`
    ${oa}
    ${z.light}
    ${Oi.light}
  `};F("colors.primaryCoreLightened"),F("colors.tertiaryType1Light"),F("colors.secondary500");class ca extends(C(Bi)){static get is(){return"bbva-form-date"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":w,"bbva-link":A,"bbva-notification-help":Li,"bbva-button-default":n}}constructor(){super(),this.type="date",this.clearIcon=ce()}static get styles(){return[super.styles,aa,na.light,na.dark,b("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return h`
      <div
        class="field"
        @keydown="${this._onFocusin}"
        @click="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}get clearIconBlock(){return h`
      <span class="clear">
        <bbva-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
        ></bbva-icon>
      </span>
    `}}const da=new a;var ba=t`:host {
  display: block;
  box-sizing: border-box;
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

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
${da.mediaRules()}`;const ha=t`
    ${Oi.dark}
  `,pa=t`
    ${Oi.light}
  `;class ma extends(C(Bi)){static get is(){return"bbva-form-number"}static get scopedElements(){return{"bbva-clip-flag":oe,"bbva-text":w,"bbva-icon":D,"bbva-link":A,"bbva-notification-help":Li,"bbva-button-default":n}}static get properties(){return{flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="number"}_getFlag(){var e;let t=this.flag.toLowerCase();return t=t[0].toUpperCase()+t.slice(1),null===(e=Je[`flags${t}`])||void 0===e?void 0:e.call(Je)}static get styles(){return[super.styles,ba,b("bbva-form-number-shared-styles")]}get field(){return h`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return h`
      ${this.flag?h`
            <span class="flag">
              <bbva-clip-flag
                icon="${p(this._getFlag())}"
                size="small"
                iconset="${p(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const va=new a;var ua=t`:host {
  display: block;
  box-sizing: border-box;
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

.wrapper {
  display: flex;
}

.field {
  flex: auto;
}

.action {
  flex: none;
}
${va.mediaRules()}`;const ga={light:t`
    ${Oi.light}
  `,dark:t`
    ${Oi.dark}
  `};class ya extends(C(s(Bi))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":w,"bbva-link":A,"bbva-notification-help":Li,"bbva-button-default":n}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},iconVariant:{type:String,attribute:"icon-variant"}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=de(),this.actionAccessibleText="bbva-form-input-search-submit",this.actionIntoForm=!0}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}firstUpdated(e){super.firstUpdated(e),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(e){super.updated&&super.updated(e),e.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick)}static get styles(){return[super.styles,ua,b("bbva-form-search-shared-styles"),ga.light,ga.dark]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}get _icons(){const e={access:be(),search:de()};return this.iconVariant in e?e[this.iconVariant]:e.search}}const fa=new a;var Sa=t`:host {
  display: block;
  box-sizing: border-box;
  --_form-time-clear-icon-color: var(--bbva-form-time-clear-icon-color, var(--colorsPrimaryMedium, ${i(u.primaryMedium)}));
  --_form-time-invalid-clear-icon-color: var(--bbva-form-time-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)}));
  --_form-time-readonly-clear-color: var(--bbva-form-time-readonly-clear-icon-color, var(--colorsSecondary500, ${i(u.secondary500)}));
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.clear [data-tag-name=bbva-icon] {
  color: var(--_form-time-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-icon] {
  fill: var(--_form-time-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-icon] {
  color: var(--_form-time-readonly-clear-color);
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

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}
${fa.mediaRules()}`;const $a=new a;var xa=t`[ambient^=dark100] {
  --bbva-form-time-clear-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-time-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-time-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

[ambient^=dark300] {
  --bbva-form-time-clear-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-time-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-time-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${$a.mediaRules()}`;const _a=new a;var ka=t`[ambient^=light] {
  --bbva-form-time-clear-icon-color: initial;
  --bbva-form-time-invalid-clear-icon-color: initial;
  --bbva-form-time-readonly-clear-icon-color: initial;
}
${_a.mediaRules()}`;const Ca={dark:t`
    ${xa}
    ${Oi.dark}
  `,light:t`
    ${ka}
    ${Oi.light}
  `};class Ta extends(C(Bi)){static get is(){return"bbva-form-time"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":w,"bbva-link":A,"bbva-notification-help":Li,"bbva-button-default":n}}constructor(){super(),this.type="time",this.clearIcon=re()}static get styles(){return[super.styles,Ca.light,Ca.dark,Sa,b("bbva-form-time-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return h`
      <div
        class="field"
        @click="${this._onFocusin}"
        @keydown="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get clearIconBlock(){return h`
      <span class="clear">
        <bbva-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
        ></bbva-icon>
      </span>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}}var Ma=t`:host {
  --_icon-color: var(--bbva-form-password-hint-dark-mode-icon-color, var(--bbva-form-password-hint-icon-color, var(--colorsTertiaryType6Dark, ${i(u.tertiaryType6Dark)})));
  --_text-color: var(--bbva-form-password-hint-dark-mode-text-color, var(--bbva-form-password-hint-text-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  display: flex;
  align-items: flex-start;
  box-sizing: border-box;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 1rem 0;
  font-size: var(--typographyType3XSmall, ${i(R.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${i(B.type3XSmall)});
  color: var(--_text-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
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
  font-size: 1px;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.mark {
  width: 1rem;
  height: 1rem;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.icon {
  fill: var(--_icon-color);
}

.unmarked {
  display: block;
  border: 1px solid var(--_icon-color);
  border-radius: 50%;
}
`,Ea=t`[ambient^=light] {
  --bbva-form-password-hint-text-color: initial;
  --bbva-form-password-hint-icon-color: initial;
}
`,Aa=t`[ambient^=dark] {
  --bbva-form-password-hint-text-color: var(--colorsPrimaryVariantLightened, ${i(u.primaryVariantLightened)});
  --bbva-form-password-hint-icon-color: var(--colorsPrimaryVariantLightened, ${i(u.primaryVariantLightened)});
}
`;const La={dark:t`
    ${Aa}
    ${Oi.dark}
    ${z.dark}
  `,light:t`
    ${Ea}
    ${Oi.light}
    ${z.light}
  `};F("colors.primaryCoreLightened"),F("colors.tertiaryType6");const wa=he(),Ia="bbva-form-input-form-password-hint-checked",Ra="bbva-form-input-form-password-hint-unchecked";class Pa extends(s(C(l))){static get is(){return"bbva-form-password-hint"}static get scopedElements(){return{"bbva-icon":D}}static get properties(){return{checked:{type:Boolean,reflect:!0}}}constructor(){super(),this.checked=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","listitem")}static get styles(){return[Ma,La.dark,La.light,b("bbva-form-password-hint-shared-styles")]}render(){return h`
      ${this.checked?this._markedTpl:this._unmarkedTpl}
      <div class="text">
        <slot></slot>
        <span class="sr-only">${this._srCheckedMessage}</span>
      </div>
    `}get _markedTpl(){return h` <bbva-icon class="mark icon" icon="${wa}"></bbva-icon> `}get _unmarkedTpl(){return h` <span class="mark unmarked" aria-hidden="true"></span> `}get _srCheckedMessage(){return this.checked?this.t(Ia):this.t(Ra)}}const Oa=new a;var Va=t`:host {
  display: block;
  box-sizing: border-box;
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
${Oa.mediaRules()}`;const Ba={dark:t`
    ${Oi.dark}
    ${La.dark}
  `,light:t`
    ${Oi.light}
    ${La.light}
  `};class Da extends(C(pe(s(Bi)))){static get is(){return"bbva-form-password"}static get scopedElements(){return{"bbva-text":w,"bbva-icon":D,"bbva-link":A,"bbva-notification-help":Li,"bbva-button-default":n,"bbva-form-password-hint":Pa}}static get properties(){return{toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},hintsListLabel:{type:String,reflect:!0,attribute:"hints-list-label"}}}constructor(){super(),this.actionType="button",this.actionVariant="no-background",this.actionIntoForm=!0,this.type="password",this.toggleVisibleIcon=me(),this.toggleIconSize=24,this.toggleAccessibleText="bbva-form-input-password-toggle",this.toggleVisibleAccessibleText="bbva-form-input-password-toggle-visible",this.visible=!1,this.toggleIcon=ve(),this.actionIcon=this.toggleIcon,this.actionIconSecondary=this.toggleVisibleIcon,this.actionAccessibleText=this.toggleAccessibleText,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.hintsListLabel="",this._onSlotsChange=this._onSlotsChange.bind(this),this.addEventListener("slotschanges",this._onSlotsChange)}updated(e){super.updated(e),e.has("visible")&&(this.type=this.visible?"text":"password")}static get styles(){return[super.styles,Va,Ba.dark,Ba.light,b("bbva-form-password-shared-styles")]}switchIcon(){this._secondary=!this._secondary,this.visible=!this.visible,this.focus(),this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this.visible,bubbles:!0,composed:!0}))}get _hintsTpl(){return h`
      <div
        class="hints"
        role="list"
        aria-label="${this.t(this._hintsListLabel)}"
        ?hidden="${this.readonly||!this._hasHints}"
      >
        <slot name="hints"></slot>
      </div>
    `}get _hintsListLabel(){return this.hintsListLabel}_onSlotsChange(e){const{slotName:t,contentSlots:i}=e.detail;"hints"===t&&(this._hasHints=Boolean(i.length))}render(){return h`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo} ${this._hintsTpl}
    `}}const Fa=new a;var Na=t`:host {
  display: block;
  box-sizing: border-box;
  --_form-textarea-field-bg-color: var(--bbva-form-textarea-dark-mode-field-bg-color, var(--bbva-form-textarea-field-bg-color, var(--ambientsLight100, ${i(ue.light100)})));
  --_form-textarea-field-border-color: var(--bbva-form-textarea-dark-mode-field-border-color, var(--bbva-form-textarea-field-border-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-textarea-focused-field-border-color: var(--bbva-form-textarea-dark-mode-focused-field-border-color, var(--bbva-form-textarea-focused-field-border-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_form-textarea-invalid-field-bg-color: var(--bbva-form-textarea-dark-mode-invalid-field-bg-color, var(--bbva-form-textarea-invalid-field-bg-color, var(--colorsTertiaryType5Lightened, ${i(u.tertiaryType5Lightened)})));
  --_form-textarea-invalid-field-border-color: var(--bbva-form-textarea-dark-mode-invalid-field-border-color, var(--bbva-form-textarea-invalid-field-border-color, var(--colorsTertiaryType5Medium, ${i(u.tertiaryType5Medium)})));
  --_form-textarea-textarea-color: var(--bbva-form-textarea-dark-mode-textarea-color, var(--bbva-form-textarea-textarea-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_form-textarea-readonly-textarea-color: var(--bbva-form-textarea-dark-mode-readonly-textarea-color, var(--bbva-form-textarea-readonly-textarea-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-textarea-invalid-textarea-color: var(--bbva-form-textarea-dark-mode-invalid-textarea-color, var(--bbva-form-textarea-invalid-textarea-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_form-textarea-label-color: var(--bbva-form-textarea-dark-mode-label-color, var(--bbva-form-textarea-label-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-textarea-label-out-color: var(--bbva-form-textarea-dark-mode-label-out-color, var(--bbva-form-textarea-label-out-color, var(--colorsSecondary600, ${i(u.secondary600)})));
  --_form-textarea-focused-label-color: var(--bbva-form-textarea-dark-mode-focused-label-color, var(--bbva-form-textarea-focused-label-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-textarea-readonly-label-color: var(--bbva-form-textarea-dark-mode-readonly-label-color, var(--bbva-form-textarea-readonly-label-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-textarea-invalid-label-color: var(--bbva-form-textarea-dark-mode-invalid-label-color, var(--bbva-form-textarea-invalid-label-color, var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_form-textarea-message-color: var(--bbva-form-textarea-dark-mode-message-color, var(--bbva-form-textarea-message-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --_form-textarea-message-info-icon-color: var(--bbva-form-textarea-dark-mode-message-info-icon-color, var(--bbva-form-textarea-message-info-icon-color, var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
  --_form-textarea-message-error-icon-color: var(--bbva-form-textarea-dark-mode-message-error-icon-color, var(--bbva-form-textarea-message-error-icon-color, var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)})));
  --_form-textarea-message-info-counter-color: var(--bbva-form-textarea-dark-mode-message-info-counter-color, var(--bbva-form-textarea-message-info-counter-color, var(--colorsSecondary500, ${i(u.secondary500)})));
  --bbva-button-default-icon-color-variant: var(--bbva-form-textarea-dark-mode-icon-color-variant, var(--bbva-form-textarea-icon-color-variant, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
}

:host([disabled]) {
  opacity: 0.4;
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

.field {
  position: relative;
  max-height: calc(((17.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
  background-color: var(--_form-textarea-field-bg-color);
  border-bottom: 1px solid var(--_form-textarea-field-border-color);
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${i(ge.small)}));
}
:host([focused]) .field {
  border-bottom-color: var(--_form-textarea-focused-field-border-color);
}
:host([invalid]) .field {
  background-color: var(--_form-textarea-invalid-field-bg-color);
  border-bottom-color: var(--_form-textarea-invalid-field-border-color);
}

.label,
.message,
.slot-textarea ::slotted(textarea) {
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(S.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(S.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${i(R.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(B.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  will-change: transform;
  width: 100%;
  height: var(--area-height, calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  min-height: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  max-height: calc(((12.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  font-family: inherit;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
  outline: none;
  resize: none;
  overflow-x: hidden;
  border: none;
  background: transparent;
  color: var(--_form-textarea-textarea-color);
}
:host([readonly]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host([invalid]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-invalid-textarea-color);
}
:host([focused]) .slot-textarea ::slotted(textarea) {
  width: calc(100% - calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em);
  color: var(--_form-textarea-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 15) * 1em)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_form-textarea-readonly-label-color);
}
:host([invalid]) .label {
  color: var(--_form-textarea-invalid-label-color);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host(:not([invalid])[focused]) .clear {
  display: flex;
}
:host([invalid][focused]) .clear {
  display: flex;
  --_button-default-color-icon-variant: var(--_form-textarea-invalid-label-color);
}

:host([invalid][focused]) .clear:active {
  --_button-default-color-icon-focus-variant: var(--_form-textarea-invalid-label-color);
}

.message {
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  color: var(--_form-textarea-message-color);
}
.message.counter {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 12) * 1em);
  display: flex;
  align-items: center;
  justify-content: flex-end;
}
.message.counter [data-tag-name=bbva-text] {
  color: var(--_form-textarea-message-info-counter-color);
}

:host([maxlength][info-message]) .message {
  margin-top: 0;
}

.message-error[data-tag-name=bbva-notification-help] {
  --_notification-help-icon-color: var(--_form-textarea-message-error-icon-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
${Fa.mediaRules()}`;const za=new a;var qa=t`[ambient^=light] {
  --bbva-form-textarea-field-bg-color: initial;
  --bbva-form-textarea-field-border-color: initial;
  --bbva-form-textarea-field-border-radius: initial;
  --bbva-form-textarea-invalid-field-bg-color: initial;
  --bbva-form-textarea-invalid-field-border-color: initial;
  --bbva-form-textarea-label-color: initial;
  --bbva-form-textarea-focused-label-color: initial;
  --bbva-form-textarea-readonly-label-color: initial;
  --bbva-form-textarea-invalid-label-color: initial;
  --bbva-form-textarea-label-out-color: initial;
  --bbva-form-textarea-textarea-color: initial;
  --bbva-form-textarea-invalid-textarea-color: initial;
  --bbva-form-textarea-readonly-textarea-color: initial;
  --bbva-form-textarea-message-info-color: initial;
  --bbva-form-textarea-message-error-color: initial;
  --bbva-form-textarea-message-info-icon-color: initial;
  --bbva-form-textarea-message-error-icon-color: initial;
  --bbva-form-textarea-icon-color-variant: initial;
}

[ambient=light100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${za.mediaRules()}`;const Ha=new a;var Wa=t`[ambient^=dark] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCore, ${i(u.primaryCore)});
  --bbva-form-textarea-field-border-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-focused-field-border-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-field-border-radius: var(--borderRadiusSmall, ${i(ge.small)});
  --bbva-form-textarea-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${i(u.tertiaryType5Lightened)});
  --bbva-form-textarea-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${i(u.tertiaryType5Medium)});
  --bbva-form-textarea-label-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-textarea-focused-label-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-textarea-readonly-label-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-textarea-invalid-label-color: var(--colorsTertiaryType1Dark, ${i(u.tertiaryType1Dark)});
  --bbva-form-textarea-label-out-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-textarea-textarea-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-invalid-textarea-color: var(--colorsSecondary600, ${i(u.secondary600)});
  --bbva-form-textarea-readonly-textarea-color: var(--colorsSecondary100, ${i(u.secondary100)});
  --bbva-form-textarea-message-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-message-error-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-message-info-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-message-error-icon-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-form-textarea-message-info-counter-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

[ambient=dark100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLight, ${i(u.primaryCoreLight)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
${Ha.mediaRules()}`;const ja={dark:t`
    ${Wa}
    ${N.dark}
  `,light:t`
    ${qa}
    ${N.light}
  `};F("colors.cool70"),F("colors.cool20"),F("colors.primaryCoreLightened"),F("colors.cool60"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),F("colors.cool20"),F("colors.primaryCoreLightened"),F("colors.cool20"),F("colors.cool20"),F("colors.cool20"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),F("colors.primarySubduedLight"),F("colors.tertiaryType1Light"),F("colors.cool20"),F("colors.primaryCoreLightened");class Ua extends(C(s(et))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":w,"bbva-link":A,"bbva-button-default":n,"bbva-notification-help":Li}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},characterCounterLabel:{type:String,attribute:"character-counter-label"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoMessage:{type:String,attribute:"info-message"},label:{type:String},labelOut:{type:String,attribute:"label-out"}}}constructor(){super(),this.label="",this.labelOut="",this.optionalLabel="bbva-form-input-textarea-optional-label",this.characterCounterLabel="bbva-form-input-textarea-counter-label",this.clearIcon=X(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-textarea-clear",this.errorIcon=ye(),this.errorMessage="",this.infoIcon=Y(),this.infoMessage="",this._onInputRaf=this._onInput}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}static get styles(){return[Na,ja.dark,ja.light,b("bbva-form-textarea-shared-styles")]}render(){return h`${this._labelOut} ${this.field} ${this.messageError} ${this._characterCounter}
    ${this.messageInfo}`}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),`${this.label} ${this.labelOut||this.required?this.t(this.optionalLabel):""}`}get _helpIcon(){return this.helpIcon?h`
          <bbva-link
            @click="${this._helpClicked}"
            icon="${fe}"
            iconSize="24"
            href="${p(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-textarea-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?h`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(){this.value=this._formElement.value,this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem"),this._calculateCharacters()}get field(){return h`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return h`
      <bbva-button-default
        class="clear"
        variant="icon no-background"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearTextarea}"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get messageError(){return this._errorVisible?h`
          <div class="message error" role="alert">
            <bbva-notification-help
              class="message-error"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get _characters(){return"number"==typeof this._remainingCharacters?this._remainingCharacters:this.maxlength}get _characterCounter(){return this.maxlength?h`
          <div class="message info counter">
            <bbva-text
              unset
              text="${this._characters} ${this.t(this.characterCounterLabel)}"
              size="2XS"
            >
            </bbva-text>
          </div>
        `:""}get messageInfo(){return this.infoMessage?h`
          <bbva-notification-help
            disabled-tabindex
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
          ></bbva-notification-help>
        `:""}get _labelBlock(){return h`
      <bbva-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this._textareaLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-text>
    `}_calculateCharacters(){var e;this._remainingCharacters=this.maxlength-(null===(e=this._formElement)||void 0===e?void 0:e.value.length)}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:e}=this._rootNode,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-textarea-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-textarea-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}}var Ga=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const Xa={light:t`
    ${Oi.light}
    ${na.light}
    ${pa}
    ${qi.light}
    ${Ba.light}
    ${ga.light}
    ${ea.light}
    ${Ca.light}
    ${ja.light}
    ${Yi.light}
  `,dark:t`
    ${Oi.dark}
    ${na.dark}
    ${ha}
    ${qi.dark}
    ${Ba.dark}
    ${ga.dark}
    ${ea.dark}
    ${Ca.dark}
    ${ja.dark}
    ${Yi.dark}
  `};class Ka extends(C(pe(l))){static get is(){return"bbva-form-input"}static get scopedElements(){return{"bbva-form-attach":Zi,"bbva-form-text":ta,"bbva-form-amount":Xi,"bbva-form-date":ca,"bbva-form-number":ma,"bbva-form-search":ya,"bbva-form-password":Da,"bbva-form-time":Ta,"bbva-form-textarea":Ua}}static get properties(){return{type:{type:String,reflect:!0},disabled:{type:Boolean,reflect:!0},value:{type:String},name:{type:String},required:{type:Boolean},readonly:{type:Boolean},autocomplete:{type:String},label:{type:String},pattern:{type:String},allowedPattern:{type:String,attribute:"allowed-pattern"},modeInput:{type:String,attribute:"mode-input"},max:{type:String},maxlength:{type:Number},min:{type:String},minlength:{type:Number},placeholder:{type:String},step:{type:Number},accessibleDescription:{type:String,attribute:"accessible-description"},autoValidate:{type:Boolean,attribute:"auto-validate"},form:{type:String},actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},symbol:{type:String},symbolLeft:{type:Boolean,attribute:"symbol-left"},symbolRight:{type:Boolean,attribute:"symbol-right"},amount:{type:Number},language:{type:String},abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},separatorChar:{type:String,attribute:"separator-char"},groupChar:{type:String,attribute:"group-char"},_intlLanguage:{attribute:!1},_intlAmountLanguage:{attribute:!1},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"},items:{type:Array},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},keepOnSelect:{type:Boolean,attribute:"keep-on-select"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},search:{type:Boolean},toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},characterCounterLabel:{type:String,attribute:"character-counter-label"},iconVariant:{type:String,attribute:"icon-variant"},showCard:{type:Boolean,attribute:"show-card"},invalid:{type:Boolean},autoFocus:{type:Boolean,attribute:"autofocus"},logo:{type:String},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},partner:{type:Boolean},partnerLogo:{type:String,attribute:"partner-logo"},cardVariant:{type:String,attribute:"card-variant"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.logo="",this.cardStatus="",this.cardType="",this.cardImage="",this.partner=!1,this.cardVariant="",this.payCompatibility="",this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"},this.autoFocus=!1,this.actionAccessibleText="",this.actionIconSize=24,this.actionIconSecondary=this.toggleVisibleIcon,this.actionIconSecondarySize=24,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.allowedPattern="",this.autoselect=!1,this.autoValidate=!1,this.clearIcon="",this.clearIconSize=24,this.clearAccessibleText="",this.currencyCode="EUR",this.decimalDigits=2,this.decimalsHidden=!1,this.errorIcon="",this.errorMessage="",this.filterValueKey=null,this.hasError=!1,this.helpIconSize=24,this.invalid=!1,this.infoMessage="",this.inlineAutocomplete=!1,this.items=[],this.keepOnBlur=!1,this.keepOnSelect=!1,this.label="",this.labelOut="",this.localCurrency="EUR",this.maxResults=5,this.minChars=1,this.name="",this.modeInput="text",this.optionalLabel="",this.overlay=!1,this.preventValueUpdateOnSelect=!1,this.required=!1,this.search=!1,this.selectOnBlur=!1,this.toggleAccessibleText="",this.toggleIcon="",this.toggleIconSize=24,this.toggleVisibleIcon="",this.toggleVisibleAccessibleText="",this.trailingZeroDecimalsHidden=!1,this.type="",this.value="",this.visible=!1,this.zeroDecimalsHidden=!1,this.hideBottomPaddingInfoMessage=!1,this.addEventListener("slotschanges",this._onSlotsChange)}static get styles(){return[Ga,b("bbva-form-input-shared-styles"),Xa.light,Xa.dark]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("input",this._updateValue)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("input",this._updateValue)}_updateValue(){const{firstElementChild:e}=this.shadowRoot,{firstElementChild:t}=e;this.value=t.value||e.value,this.dispatchEvent(new CustomEvent("form-input-value-change",{detail:{value:this.value},bubbles:!0,composed:!0}))}get _formAttachTpl(){return h` <bbva-form-attach
      ?autofocus=${this.autoFocus}
      input-type=${this.type}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      label=${p(this.label)}
      label-out=${p(this.labelOut)}
      ?required=${this.required}
      help-icon=${p(this.helpIcon)}
      placeholder=${p(this.placeholder)}
      value=${p(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      allowed-pattern=${p(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${p(this.pattern)}
      error-message=${p(this.errorMessage)}
      ?action-into-form=${this.actionIntoForm}
      action-variant=${p(this.actionVariant)}
      action-type=${p(this.actionType)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      ?validate-on-blur=${this.validateOnBlur}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-attach>`}get _formDateTpl(){return h` <bbva-form-date
      ?autofocus=${this.autoFocus}
      label=${p(this.label)}
      label-out=${p(this.labelOut)}
      ?required=${this.required}
      value=${p(this.value)}
      ?disabled=${this.disabled}
      help-icon=${p(this.helpIcon)}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      allowed-pattern=${p(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${p(this.pattern)}
      error-message=${p(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      action-variant=${p(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-date>`}get _formTextTpl(){return h` <bbva-form-text
      ?autofocus=${this.autoFocus}
      label=${p(this.label)}
      label-out=${p(this.labelOut)}
      ?required=${this.required}
      help-icon=${p(this.helpIcon)}
      .flag-label=${this.flagLabel}
      .flag=${this.flag}
      flag-iconset=${p(this.flagIconset)}
      placeholder=${p(this.placeholder)}
      value=${p(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      error-message=${p(this.errorMessage)}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      action-variant=${p(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      ?invalid=${this.invalid}
      pattern=${p(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${p(this.allowedPattern)}
      inputmode=${p(this.modeInput)}
      maxlength=${p(this.maxlength)}
    ></bbva-form-text>`}get _formAmountTpl(){return h`<bbva-form-amount
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      placeholder=${p(this.placeholder)}
      help-icon=${p(this.helpIcon)}
      amount=${p(this.amount)}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      ?disabled=${this.disabled}
      currency-code=${p(this.currencyCode)}
      local-currency=${p(this.localCurrency)}
      language=${p(this.language)}
      ?symbol-right=${this.symbolRight}
      error-message=${p(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      flag-iconset=${p(this.flagIconset)}
      ?show-card=${this.showCard}
      card-status=${this.cardStatus}
      card-variant=${this.cardVariant}
      card-type=${p(this.cardType)}
      pay-compatibility=${this.payCompatibility}
      ?partner=${this.partner}
      partner-logo=${p(this.partnerLogo)}
      card-image=${p(this.cardImage)}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      action-variant=${p(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
      ?invalid=${this.invalid}
      pattern=${p(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${p(this.allowedPattern)}
      decimal-digits=${p(this.decimalDigits)}
      ?decimals-hidden=${this.decimalsHidden}
      ?trailing-zero-decimals-hidden=${this.trailingZeroDecimalsHidden}
      ?zero-decimals-hidden=${this.zeroDecimalsHidden}
      group-char=${p(this.groupChar)}
      separator-char=${p(this.separatorChar)}
      inputmode=${p(this.modeInput)}
      maxlength=${p(this.maxlength)}
    ></bbva-form-amount> `}get _formNumberTpl(){return h`<bbva-form-number
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${p(this.value)}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      flag-iconset=${p(this.flagIconset)}
      placeholder=${p(this.placeholder)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      help-icon=${p(this.helpIcon)}
      info-message=${p(this.infoMessage)}
      error-message=${p(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      ?invalid=${this.invalid}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      action-variant=${p(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      pattern=${p(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${p(this.allowedPattern)}
      inputmode=${p(this.modeInput)}
      maxlength=${p(this.maxlength)}
    ></bbva-form-number> `}get _formSearchTpl(){return h`<bbva-form-search
      ?autofocus=${this.autoFocus}
      label=${p(this.label)}
      label-out=${p(this.labelOut)}
      ?required=${this.required}
      value=${p(this.value)}
      .placeholder=${this.placeholder}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      error-message=${p(this.errorMessage)}
      ?disabled-button=${this.disabledButton}
      help-icon=${p(this.helpIcon)}
      ?disabled=${this.disabled}
      allowed-pattern=${p(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${p(this.pattern)}
      variant=${p(this.variant)}
      icon-variant=${p(this.iconVariant)}
      ?invalid=${this.invalid}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      action-variant=${p(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      ?validate-on-blur=${this.validateOnBlur}
    ></bbva-form-search> `}get _formPasswordTpl(){return h`<bbva-form-password
      ?autofocus=${this.autoFocus}
      label=${p(this.label)}
      label-out=${p(this.labelOut)}
      ?required=${this.required}
      value=${p(this.value)}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      pattern=${p(this.pattern)}
      help-icon=${p(this.helpIcon)}
      allowed-pattern=${p(this.allowedPattern)}
      error-message=${p(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      ?auto-validate=${this.autoValidate}
      name=${p(this.name)}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      .min=${this.min}
      .max=${this.max}
      action-variant=${p(this.actionVariant)}
      toggle-icon=${p(this.toggleIcon)}
      toggle-visible-icon=${p(this.toggleVisibleIcon)}
      toggle-icon-size=${p(this.toggleIconSize)}
      toggle-accessible-text=${p(this.toggleAccessibleText)}
      toggle-visible-accessible-text=${p(this.toggleVisibleAccessibleText)}
      ?visible=${this.visible}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
      ?hide-bottom-padding-info-message=${this.hideBottomPaddingInfoMessage}
      ><div slot="hints"><slot name="hint"></slot></div
    ></bbva-form-password> `}get _formTimeTpl(){return h` <bbva-form-time
      ?autofocus=${this.autoFocus}
      label=${p(this.label)}
      label-out=${p(this.labelOut)}
      ?required=${this.required}
      value=${p(this.value)}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      error-message=${p(this.errorMessage)}
      help-icon=${p(this.helpIcon)}
      pattern=${p(this.pattern)}
      ?auto-validate=${this.autoValidate}
      ?validate-on-blur=${this.validateOnBlur}
      .min=${this.min}
      .max=${this.max}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      action-type=${p(this.actionType)}
      action-icon=${p(this.actionIcon)}
      action-icon-secondary=${p(this.actionIconSecondary)}
      action-accessible-text=${p(this.actionAccessibleText)}
      action-secondary-accessible-text=${p(this.actionSecondaryAccessibleText)}
      action-variant=${p(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${p(this.linkHref)}
      optional-label=${p(this.optionalLabel)}
      icon-variant=${p(this.iconVariant)}
    ></bbva-form-time>`}get _formTextareaTpl(){return h` <bbva-form-textarea
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${p(this.value)}
      ?readonly=${this.readonly}
      info-message=${p(this.infoMessage)}
      ?disabled=${this.disabled}
      maxlength=${p(this.maxlength)}
      minlength=${p(this.minlength)}
      ?auto-validate=${this.autoValidate}
      error-message=${p(this.errorMessage)}
      ?autofocus=${this.autoFocus}
      ?invalid=${this.invalid}
      help-icon=${p(this.helpIcon)}
      ?validate-on-blur=${this.validateOnBlur}
      character-counter-label=${p(this.characterCounterLabel)}
      pattern=${p(this.pattern)}
      allowed-pattern=${p(this.allowedPattern)}
    ></bbva-form-textarea>`}_inputTpl(e){return{text:this._formTextTpl,camera:this._formAttachTpl,contact:this._formAttachTpl,amount:this._formAmountTpl,date:this._formDateTpl,number:this._formNumberTpl,search:this._formSearchTpl,time:this._formTimeTpl,password:this._formPasswordTpl,textarea:this._formTextareaTpl}[e]}_onSlotsChange(e){const{slotName:t,contentSlots:i}=e.detail;"hint"===t&&(this._hasHints=Boolean(i.length),this.hideBottomPaddingInfoMessage=this._hasHints)}render(){return h` ${this._inputTpl(this.type)} `}}customElements.define(Xi.is,Xi),customElements.define(Zi.is,Zi),customElements.define(ca.is,ca),customElements.define(Bi.is,Bi),customElements.define(ta.is,ta),customElements.define(Da.is,Da),customElements.define(Ta.is,Ta),customElements.define(ma.is,ma),customElements.define(ya.is,ya),customElements.define(Ua.is,Ua),customElements.define(Pa.is,Pa),customElements.define(Ka.is,Ka);class Ya extends(Qe(l)){static get is(){return"bbva-modal-error-bill-payments"}static get scopedElements(){return{"bbva-text":w,"bbva-help-modal":c,"bbva-banner-image":je}}static get properties(){return{errorModalId:{type:String},errorModalParams:{type:Object},visibleModal:{type:Boolean},warningIcon:{type:String,attribute:"warning-icon"},infoIcon:{type:String,attribute:"info-icon"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},isCaution:{type:Boolean,attribute:"is-caution"}}}constructor(){super(),this.errorModalId="",this.visibleModal=!1,this.errorModalParams={},this.infoIcon=Y(),this.warningIcon=K(),this.isCaution=!1,this.iOSFixedHeader=!1}_renderModal(e,t){return h`
      <bbva-help-modal
        id="${e}"
        ?visible="${this.visibleModal}"
        open="${this.visibleModal}"
        modal-type="${"dashboardError"===e?"warning":"info"}"
        title-icon="${"dashboardError"===e?this.warningIcon:this.infoIcon}"
        body-text="${null==t?void 0:t.bodyText}"
        button-text="${null==t?void 0:t.buttonText}"
        link-text="${null==t?void 0:t.linkText}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-header-right-primary-click="${()=>this._handleErrorClick("header-right")}"
        @help-modal-footer-button-click="${()=>this._handleErrorClick("footer-button")}"
        @help-modal-footer-link-click="${()=>this._handleErrorClick("footer-link")}"
        @help-modal-veil-click="${()=>this._handleErrorClick("veil")}"
      >
      </bbva-help-modal>
    `}_renderSecondModal(e,t){return h`
      <bbva-help-modal
        id="${e}"
        hide-content-padding-top
        ?visible="${this.visibleModal}"
        open="${this.visibleModal}"
        full-height
        header-type="${"otpError"===e||"incorrectAmountError"===e?"modal":"modal-three-level"}"
        fixed-footer
        header-text="${null==t?void 0:t.headerText}"
        body-text="${null==t?void 0:t.bodyText}"
        button-text="${null==t?void 0:t.buttonText}"
        link-text="${null==t?void 0:t.linkText}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-header-right-primary-click="${()=>this._handleErrorClick("header-right")}"
        @help-modal-footer-button-click="${()=>this._handleErrorClick("footer-button")}"
        @help-modal-footer-link-click="${()=>this._handleErrorClick("footer-link")}"
        @help-modal-veil-click="${()=>this._handleErrorClick("veil")}"
      >
        <div class="custom-header" slot="slot-title">
          <bbva-banner-image
            id="header-image"
            image-src="./images/errors/${this.isCaution?"caution":"error"}.svg"
          >
          </bbva-banner-image>
          <bbva-text
            id="title-text"
            .text="${null==t?void 0:t.titleText}"
            ?hidden="${!(null!=t&&t.titleText)}"
            alignment="center"
            ellipsis
            unset
            font-weight="500"
            tag="h2"
            lines="2"
          >
          </bbva-text>
        </div>
      </bbva-help-modal>
    `}_handleErrorClick(e){this.dispatchEvent(new CustomEvent(`error-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_chooseErrorModal(e){return"dashboardError"===e||"exitProcess"===e?this._renderModal(e,this.errorModalParams):this._renderSecondModal(e,this.errorModalParams)}render(){return h` ${this._chooseErrorModal(this.errorModalId)} `}}customElements.define(Ya.is,Ya);class Za extends(o(Qe(l))){static get is(){return"bbva-modal-service-detail"}static get scopedElements(){return{"bbva-text":w,"bbva-clip-box":V,"bbva-form-input":Ka,"bbva-help-modal":c,"bbva-button-default":n,"bbva-notification-message":Se,"bbva-clip-microillustration":$e,"bbva-nativeconnector-bbva-qr":Ue,"bbva-modal-error-bill-payments":Ya,"bbva-icon":D}}static get properties(){return{isSaved:{type:Boolean},selectedService:{type:Array},businessDay:{type:Boolean},barCode:{type:Boolean},referenceMaximumLength:{type:Number},referenceMinimumLength:{type:Number},referenceType:{type:String},aliasService:{type:Boolean},referenceServiceSaved:{type:String},visibleModalServiceDetail:{type:Boolean},visibleModalBarCode:{type:Boolean},errorScannerCodes:{type:Array},visibleModalOutOfTime:{type:Boolean},errorModalCatalog:{type:Object},flagWeekend:{type:Boolean},visibleModalMoreInformation:{type:Boolean},responseCodeBar:{type:String},isTaxes:{type:Boolean},visibleModalShowPermissions:{type:Boolean},isSipare:{type:Boolean,attribute:"is-sipare"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},_sipareId:{type:String,state:!0},_codeTypeCamera:{type:Object,state:!0},_aspectRatio:{type:Object,state:!0}}}constructor(){super(),this.isSaved=!1,this.barCode=!1,this.isTaxes=!1,this.aliasService="",this.referenceType="",this.businessDay=!1,this.flagWeekend=!1,this.selectedService=[],this.responseCodeBar="",this.errorModalCatalog={},this.errorScannerCodes=[],this.referenceServiceSaved="",this.referenceMaximumLength=0,this.referenceMinimumLength=0,this.visibleModalBarCode=!1,this.visibleModalOutOfTime=!1,this.visibleModalServiceDetail=!1,this.visibleModalMoreInformation=!1,this.visibleModalShowPermissions=!1,this.isSipare=!1,this._sipareId="000000028",this._codeTypeCamera={qr:"QR",barcode:"BARCODE"},this._aspectRatio={square:"SQUARE",rectangle:"RECTANGLE"},this.iOSFixedHeader=!1}reset(){this.isSaved=!1,this.barCode=!1,this.isTaxes=!1,this.aliasService="",this.referenceType="",this.businessDay=!1,this.flagWeekend=!1,this.selectedService=[],this.responseCodeBar="",this.errorModalCatalog={},this.errorScannerCodes=[],this.referenceServiceSaved="",this.referenceMaximumLength=0,this.referenceMinimumLength=0,this.visibleModalBarCode=!1,this.visibleModalOutOfTime=!1,this.visibleModalServiceDetail=!1,this.visibleModalMoreInformation=!1,this.visibleModalShowPermissions=!1,this.isSipare=!1,this._sipareId="000000028",this._codeTypeCamera={qr:"QR",barcode:"BARCODE"},this._aspectRatio={square:"SQUARE",rectangle:"RECTANGLE"},this.iOSFixedHeader=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}firstUpdated(){this._validateReference(this.referenceServiceSaved)}_scanCodeService(){It(this,bi,{textLinkName:"referencia de camara"}),this.callPlugin()}callPlugin(){this.shadowRoot.getElementById("scanCodeDetail").openCameraCodeReader({cameraConfig:{autoFocus:!0,flash:!1},codeType:this.isSipare?this._codeTypeCamera.qr:this._codeTypeCamera.barcode,customViewConfig:{name:"qr_custom_toolbar_overlay",options:{title:" ",closeImageName:"ic_close",arrowBackImageName:" "}},overlayConfig:{navBarBackgroundColor:"#D8072146",backgroundColor:"#D8072146",borderWidth:60,captureFrameColor:"#5BBEFF",onlyCorners:!0,aspectRatio:this.isSipare?this._aspectRatio.square:this._aspectRatio.rectangle,isFrameVisible:!0,isImageVisible:!0},requestCode:1e3})}_inputReferenceInfoMessage(e,t){return e===t?this.isSipare?this.t("bill-payments-info-message-reference-same-chars-sipare","bill-payments-info-message-reference-common",{minimumLength:e}):this.t("bill-payments-info-message-reference-same-chars","__Ingresa número de referencia__",{minimumLength:e}):this.t("bill-payments-info-message-reference","__Ingresa número de referencia__",{minimumLength:e,maximumLength:t})}_validateReference(e){return this.referenceServiceSaved=e,e.length>=this.referenceMinimumLength&&e.length<=this.referenceMaximumLength}_completeStep(e){if(this._checkScheduled()&&this.isTaxes)this.visibleModalOutOfTime=!0;else{if(!this.isSipare){var t;It(e.target,Jt);const i=null===(t=this.selectedService.find((e=>e.name)))||void 0===t?void 0:t.name.toLowerCase(),a=this.isSaved?"servicio guardado":"servicio nuevo";It(this,ri,{nameService:i,processSaved:a})}It(this,Ht,this.referenceServiceSaved)}}_responseScannerCode(e){var t;this.responseCodeBar=null==e||null===(t=e.detail)||void 0===t?void 0:t.content,this.isTaxes?this._checkReferenceScannerCodeTAXES(this.responseCodeBar):"000578869"===this.selectedService[0].id?this._checkReferenceScannerCodeCFE(this.responseCodeBar):"000035241"===this.selectedService[0].id?this._checkReferenceScannerCodeTELMEX(this.responseCodeBar):"000182251"===this.selectedService[0].id?this._checkReferenceScannerCodeTELCEL(this.responseCodeBar):this._checkReferenceScannerCodeGENERIC(this.responseCodeBar)}_checkReferenceScannerCodeTAXES(e){var t;if(/\W/.test(e.replace(/ /g,""))||e.length<this.referenceMaximumLength)this.visibleModalBarCode=!0,this.isSipare&&It(this,$i);else if("000844985"===(null===(t=this.selectedService[0])||void 0===t?void 0:t.id)){if(!e.startsWith("02")&&!e.startsWith("04"))return void(this.visibleModalBarCode=!0);const t=e.substring(20,e.length),i=e.substring(0,20);this._validateReference(i),It(this,Xt,{value:Number(t),amount:Number(t)})}else if(this.selectedService.find((e=>e.id)).id===this._sipareId)this._validateReference(e);else{const t=e.substring(20,29),i=e.substring(0,20);this._validateReference(i),It(this,Xt,{value:Number(t),amount:Number(t)})}}_checkReferenceScannerCodeCFE(e){if(/\W/.test(e)||e.length<this.referenceMaximumLength)this.visibleModalBarCode=!0;else{const t=e.substring(0,20),i=e.substring(20,29);this._validateReference(t),It(this,Xt,{value:Number(i),amount:Number(i)})}}_checkReferenceScannerCodeTELMEX(e){if(/\W/.test(e)||e.length<this.referenceMaximumLength)this.visibleModalBarCode=!0;else{const t="1371371371",i=e.substring(0,10);let a=0;for(let e=0;e<i.length;e+=1){a+=i[e]*t[e]}const r=i+((a+49)%9+1),o=e.substring(10,17);this._validateReference(r),It(this,Xt,{value:Number(o),amount:Number(o)})}}_checkReferenceScannerCodeTELCEL(e){const t=[11,23,19,17,13,11,23,19,17,13];if(/\W/.test(e)||e.length<9)this.visibleModalBarCode=!0;else{const i=e.substring(2,13),a=i.split(""),r=[a.length];let o=0;for(let e=0;e<10;e+=1)r[e]=a[e],o+=r[e]*t[e];const s=(o+330)%97+1,l=i+(2===s.length?s:0+s),n=e.substring(16,22);this._validateReference(l),It(this,Xt,{value:Number(n),amount:Number(n)})}}_checkReferenceScannerCodeGENERIC(e){if(/\W/.test(e))this.visibleModalBarCode=!0;else{const t=e.substring(0,this.referenceMaximumLength);this._validateReference(t)}}_errorResponseScannerCode(e){var t,i;5===(null==e||null===(t=e.detail)||void 0===t?void 0:t.code)&&"Permission Permanently Denied"===(null==e||null===(i=e.detail)||void 0===i?void 0:i.message)&&(this.visibleModalShowPermissions=!0)}dispatchEventToSettings(){It(this,"feature-bill-payments-open-settings-click",{setting:"settings"}),this.visibleModalShowPermissions=!1}closeModalPermissions(e){this.visibleModalShowPermissions=!1,e&&e.stopPropagation()}get _showModalShowPermissions(){return h`
      <bbva-help-modal
        id="modalBillPaymentsPermissions"
        header-text="${this.isSipare?this.t("bill-payments-service-modal-permissions-header-text-sipare"):this.t("bill-payments-service-modal-permissions-header-text")}"
        hide-content-padding-top
        fixed-footer
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this.visibleModalShowPermissions}"
        button-text=${this.t("bill-payments-service-modal-permissions-button-text")}
        link-text=${this.t("bill-payments-service-modal-permissions-link-text")}
        @help-modal-header-right-primary-click="${this.closeModalPermissions}"
        @help-modal-footer-button-click="${this.dispatchEventToSettings}"
        @help-modal-footer-link-click="${this.closeModalPermissions}"
      >
        <div class="main" slot="slot-content">
          <bbva-clip-microillustration
            microillustration="${this.isSipare?"error":"cameraerror"}"
            size="L"
          >
          </bbva-clip-microillustration>
          <bbva-text
            size="M"
            alignment="center"
            text=${this.t("bill-payments-service-modal-permissions-content-operation")}
          >
          </bbva-text>
          <bbva-text
            size="M"
            alignment="center"
            text=${this.t("bill-payments-service-modal-permissions-content-settings")}
          >
          </bbva-text>
        </div>
      </bbva-help-modal>`}_showModalBarcodeError(e){const t={headerText:this.isSipare?this.t("bill-payments-error-header-sipare"):this.t("bill-payments-error-header-barcode"),titleText:this.isSipare?this.t("bill-payments-error-title-qr"):this.t("bill-payments-error-title-barcode"),bodyText:this.isSipare?this.t("bill-payments-error-body-qr"):this.t("bill-payments-error-body-barcode"),buttonText:this.t("bill-payments-error-button-barcode"),linkText:this.t("bill-payments-error-button-exit")};return h`
      <bbva-modal-error-bill-payments
        id="errorModalBillPayments"
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalBarCode}
        @error-modal-header-right-click="${()=>{this.visibleModalBarCode=!1}}"
        @error-modal-footer-button-click="${this._tryScan}"
        @error-modal-footer-link-click="${()=>{this.visibleModalBarCode=!1}}"
      >
      </bbva-modal-error-bill-payments>
    `}_tryScan(){this.visibleModalBarCode=!1,this._scanCodeService()}_checkScheduled(){const e=new Date,t=e.getDay(),i=e.getHours();return!(t>=1&&t<=5&&i>=8&&i<24)}_showModalOutOfTimeError(e){const t={headerText:this.t("bill-payments-error-header-out-of-time"),titleText:this.t("bill-payments-error-title-out-of-time"),bodyText:this.t("bill-payments-error-body-out-of-time"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="modalErrorBillPayments"
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalOutOfTime}
        @error-modal-header-right-click="${()=>{this.visibleModalOutOfTime=!1}}"
        @error-modal-footer-button-click="${()=>{this.visibleModalOutOfTime=!1}}"
      >
      </bbva-modal-error-bill-payments>
    `}get _showModalMoreInformation(){var e,t,i,a,r,o;return h`
      <bbva-help-modal
        id="modalServiceMoreInformation"
        class="help-modal"
        hide-content-padding-top
        title-icon="${fe()}"
        @help-modal-close="${()=>{this.visibleModalMoreInformation=!1}}"
        @help-modal-footer-button-click="${()=>{this.visibleModalMoreInformation=!1}}"
        ?visible="${this.visibleModalMoreInformation}"
        open="${this.visibleModalMoreInformation}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text=${"000844985"===(null===(e=this.selectedService[0])||void 0===e?void 0:e.id)||"001137840"===(null===(t=this.selectedService[0])||void 0===t?void 0:t.id)?this.t("bill-payments-title-capture-line"):this.t("bill-payments-title-reference")}
        button-text="${this.t("bill-payments-error-button-understood")}"
        fixed-footer
        full-height
      >
        <div class="main" slot="slot-content">
          <bbva-text
            size="M"
            alignment="center"
            text=${"000844985"===(null===(i=this.selectedService[0])||void 0===i?void 0:i.id)||"001137840"===(null===(a=this.selectedService[0])||void 0===a?void 0:a.id)?this.t("bill-payments-first-part-reference-taxes"):this.t("bill-payments-first-part-reference")}
          >
          </bbva-text>
          <bbva-text
            size="M"
            alignment="center"
            text=${"000844985"===(null===(r=this.selectedService[0])||void 0===r?void 0:r.id)||"001137840"===(null===(o=this.selectedService[0])||void 0===o?void 0:o.id)?this.t("bill-payments-second-part-reference-taxes"):this.t("bill-payments-second-part-reference")}
          >
          </bbva-text>
        </div>
      </bbva-help-modal>
    `}get _showCaptureLineHelp(){return h`
      <div slot="slot-content">
        ${this.referenceServiceSaved?this._tplListBullet(this.t("bill-payments-text-confirm-line-capture"),!0):xe}
        <bbva-text
          class="capture-line"
          tag="span"
          text="${this.referenceServiceSaved}"
        ></bbva-text>
        <div class="capture-line-help">
          <bbva-text
            font-weight="500"
            text=${this.t("bill-payments-title-considerations")}
            alignment="left">
          ></bbva-text>
          ${this._tplListBullet(this.t("bill-payments-text-considerations-one"))}
          ${this._tplListBullet(this.t("bill-payments-text-considerations-two"))}
          ${this._tplListBullet(this.t("bill-payments-text-considerations-three"))}
        </div>
      </div>
    `}_inputClear(){this.referenceServiceSaved=""}_tplListBullet(e,t){return h`
      <div class="list-wrapper">
        <bbva-icon
          icon="${_e()}"
          size="24"
        ></bbva-icon>
        <bbva-text
          font-weight="${t?"500":"300"}"
          text="${e}"
        ></bbva-text>
      </div>
    `}get _tplInputReference(){return h`
      <bbva-form-input
        id="referenceService"
        class="camera-input"
        type="${this.barCode?"camera":"text"}"
        @form-field-input-clear="${this._inputClear}"
        @form-field-button-submit="${this._scanCodeService}"
        @form-input-value-change="${e=>this._validateReference(e.detail.value)}"
        @form-field-help-click="${()=>{this.visibleModalMoreInformation=!0,It(this,ci,{textLinkName:"referencia de pago"})}}"
        label="${this.t("bill-payments-service-detail-modal-reference")}"
        value="${p(this.referenceServiceSaved)}"
        label-out="${this.t("bill-payments-service-detail-modal-label-out")}"
        info-message="${this._inputReferenceInfoMessage(this.referenceMinimumLength,this.referenceMaximumLength)}"
        allowed-pattern='[a-zA-Z0-9]'
        help-icon="${fe()}"
      >
      </bbva-form-input>
    `}get _tplInputReferenceSipare(){return h`
      <bbva-form-input
        id="referenceService"
        class="camera-input"
        type="${this.barCode?"camera":"text"}"
        @form-field-input-clear="${this._inputClear}"
        @form-field-button-submit="${this._scanCodeService}"
        @form-input-value-change="${e=>this._validateReference(e.detail.value)}"
        label="${this.t("bill-payments-service-detail-modal-capture-line")}"
        value="${p(this.referenceServiceSaved)}"
        label-out="${this.t("bill-payments-service-detail-modal-label-out-qr")}"
        info-message="${this._inputReferenceInfoMessage(this.referenceMinimumLength,this.referenceMaximumLength)}"
        allowed-pattern='[a-zA-Z0-9]'
      ></bbva-form-input>
    `}_getHeaderText(){return this.isSipare?this.t("bill-payments-text-header-service-detail-modal-service-sipare"):this.isSaved?this.t("bill-payments-text-header-service-detail-modal-stored-service"):this.t("bill-payments-text-header-service-detail-modal-new-service")}get _validateNumberAgreement(){const[e]=this.selectedService;return Rt.some((t=>t.id===e.id))||this.isSipare?xe:h`
        <div class="content-reference content-flex">
          <bbva-text
            tag="span"
            text="${this.t("bill-payments-title-num-agreement-shortened")}"
          ></bbva-text>
          <bbva-text
            tag="span"
            text="${p(e&&e.id)}"
          ></bbva-text>
        </div>
    `}render(){var e,t,i,a;return h`
      <bbva-nativeconnector-bbva-qr
        id="scanCodeDetail"
        @bbva-qr-plugin-camera-code-success="${this._responseScannerCode}"
        @bbva-qr-plugin-camera-code-error="${this._errorResponseScannerCode}"
      >
      </bbva-nativeconnector-bbva-qr>
      <bbva-help-modal
        id="modalServiceDetail"
        class="help-modal"
        hide-content-padding-top
        open="${this.visibleModalServiceDetail}"
        ?visible="${this.visibleModalServiceDetail}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-close="${()=>It(this,Ut)}"
        full-height
        sticky-footer
        link-text="${this.t("bill-payments-text-link-choose-another-service-detail-modal")}"
        header-text="${this._getHeaderText()}"
      >
        <div class="main" slot="slot-content">
          <div class="content-clip-list">
            <div class="content-flex">
              <div class="image">
                <bbva-clip-box
                  data-tag-name="bbva-clip-box"
                  bg-color="#1973B8"
                  image="${p(null===(e=this.selectedService[0])||void 0===e||null===(t=e.logo)||void 0===t?void 0:t.url)}"
                  text="${p(null===(i=this.selectedService[0])||void 0===i?void 0:i.name)}"
                  size="large"
                >
                </bbva-clip-box>
              </div>
              <div class="main-content">
                <bbva-text
                  tag="span"
                  class="heading link"
                  text="${p(null===(a=this.selectedService[0])||void 0===a?void 0:a.name)}"
                ></bbva-text>
                <bbva-text
                  tag="span"
                  class="bbva-text-description"
                  text="${this.t("bill-payments-ticket-text-pay-reference-sipare")}"
                  ?hidden="${!this.isSipare}"
                ></bbva-text>
                <bbva-text
                  tag="span"
                  class="bbva-text-description"
                  text="${p(this.aliasService)}"
                ></bbva-text>
              </div>
            </div>
            ${this._validateNumberAgreement}
          </div>
          ${this.isSipare?this._tplInputReferenceSipare:this._tplInputReference}
          ${this.isSipare?this._showCaptureLineHelp:""}
          <bbva-notification-message
            variant="${this.isSipare?"information":"default"}"
            class="notification-margin"
          >
            <span>
              ${this.isSipare?this.t("bill-payments-service-detail-modal-notification-message-sipare-one"):this.t("bill-payments-service-detail-modal-notification-message")}
            </span>
            <p class="text-description">${this.isSipare?this.t("bill-payments-service-detail-modal-notification-message-sipare-two"):""}</p>
          </bbva-notification-message>
          <bbva-notification-message
            ?hidden="${!this.businessDay}"
            message=${this.t("bill-payments-service-detail-modal-notification-message-business-day")}
          >
          </bbva-notification-message>
          <div class="button-continue-modal-detail">
            <bbva-button-default
              id="buttonDetail"
              variant="primary"
              ?disabled="${!this._validateReference(this.referenceServiceSaved)}"
              @click="${e=>this._completeStep(e)}"
              text="${this.t("bill-payments-text-button-continue-service-detail-modal")}"
            >
            </bbva-button-default>
          </div>
        </div>
      </bbva-help-modal>
      ${this._showModalMoreInformation}
      ${this._showModalBarcodeError(this.errorModalCatalog.BARCODE_ERROR)}
      ${this._showModalOutOfTimeError(this.errorModalCatalog.OUT_OF_TIME_ERROR)}
      ${this._showModalShowPermissions}
    `}}customElements.define(Za.is,Za);const Qa=new a;var Ja=t`:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  --_form-predictive-list-bg-color: var(--bbva-form-predictive-dark-mode-list-bg-color, var(--bbva-form-predictive-list-bg-color, var(--colorsSecondary100, ${i(u.secondary100)})));
  --_form-predictive-option-color: var(--bbva-form-predictive-dark-mode-composition-predictive-option-color, var(--bbva-composition-predictive-option-color, var(--colorsPrimaryMedium, ${i(u.primaryMedium)})));
  --_form-predictive-option-selected-color: var(--bbva-form-predictive-dark-mode-composition-predictive-option-selected-color, var(--bbva-composition-predictive-option-selected-color, var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)})));
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

.list {
  width: 100%;
  background-color: var(--_form-predictive-list-bg-color);
  border-radius: var(--borderRadiusSmall, ${i(ge.small)});
  box-shadow: var(--boxShadowType1, ${i(ke.type1)});
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0;
  list-style: none;
}
:host([overlay]) .list {
  top: 0;
  position: absolute;
  z-index: 1;
}

.predictive-content {
  position: relative;
}

.list-item {
  margin: 0;
  outline: none;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${i(R.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(B.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(S.medium.fontWeight)});
  color: var(--_form-predictive-option-color);
  cursor: pointer;
}
.list-item[aria-selected=true] {
  color: var(--_form-predictive-option-selected-color);
}

.item {
  display: block;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
${Qa.mediaRules()}`;const er=new a;var tr=t`[ambient^=light] {
  --bbva-form-predictive-list-bg-color: initial;
  --bbva-composition-predictive-option-color: initial;
  --bbva-composition-predictive-option-selected-color: initial;
}

[ambient^=light100] {
  --bbva-form-predictive-list-bg-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-composition-predictive-option-color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  --bbva-composition-predictive-option-selected-color: var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)});
}
${er.mediaRules()}`;const ir=new a;var ar=t`[ambient^=dark100] {
  --bbva-form-predictive-list-bg-color: var(--colorsPrimaryCoreLight, ${i(u.primaryCoreLight)});
  --bbva-composition-predictive-option-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-composition-predictive-option-selected-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-predictive-list-bg-color: var(--colorsPrimaryCoreDark, ${i(u.primaryCoreDark)});
  --bbva-composition-predictive-option-color: var(--colorsPrimarySubdued, ${i(u.primarySubdued)});
  --bbva-composition-predictive-option-selected-color: var(--colorsPrimarySubdued, ${i(u.primarySubdued)});
}
${ir.mediaRules()}`;const rr={dark:t`
    ${ar}
    ${ga.dark}
    ${ea.dark}
  `,light:t`
    ${tr}
    ${ga.light}
    ${ea.light}
  `};class or extends(C(s(l))){static get is(){return"bbva-form-predictive"}static get scopedElements(){return{"bbva-form-search":ya,"bbva-text":w,"bbva-notification-help":Li,"bbva-form-text":ta}}static get properties(){return{items:{type:Array},historicalItems:{type:Array,attribute:"historical-items"},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},keepOnSelect:{type:Boolean,attribute:"keep-on-select"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},search:{type:Boolean},invalid:{type:Boolean},label:{type:String},value:{type:String},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},infoIconAccessibleText:{type:String,attribute:"info-icon-accessible-text"},errorIconAccessibleText:{type:String,attribute:"error-icon-accessible-text"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},infoMessage:{type:String,attribute:"info-message"},errorMessage:{type:String,attribute:"error-message"},allowedPattern:{type:String,attribute:"allowed-pattern"},labelOut:{type:String,attribute:"label-out"},required:{type:Boolean,attribute:"required"},_optionsFiltered:{type:Array,state:!0},_activeOption:{type:Object,state:!0},_isFocusedInput:{type:Boolean,state:!0}}}constructor(){super(),this.items=[],this.historicalItems=[],this.invalid=!1,this.minChars=1,this.maxResults=5,this.filterValueKey=null,this.autoselect=!1,this.selectOnBlur=!1,this.inlineAutocomplete=!1,this.keepOnBlur=!1,this.keepOnSelect=!1,this.preventValueUpdateOnSelect=!1,this.overlay=!1,this.search=!1,this.label="",this.value="",this.allowedPattern="",this.errorIcon=K(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=Y(),this.infoIconSize=16,this.infoMessage="",this._optionsFiltered=[],this._activeOption={},this._isFocusedInput=!1,this._uniqueId=`${Math.random().toString(36).substr(2,10)}`}get items(){return this._items}set items(e=[]){const t=this._items;this._items=e.map(((e,t)=>({detail:e,_uniqueId:`option-${this._uniqueId}-${t}`}))),this.requestUpdate("items",t)}get historicalItems(){return this._historicalItems}set historicalItems(e=[]){const t=this._historicalItems;this._historicalItems=e.map(((e,t)=>({detail:e,_uniqueId:`option-${this._uniqueId}-${t}`}))),this.requestUpdate("historicalItems",t)}firstUpdated(){this._rootNode=this.getRootNode?this.getRootNode():document}updated(e){const t=t=>e.has(t)&&void 0!==e.get(t);t("value")&&(t("items")||t("minChars")||t("maxResults"))&&this._updateValue(this.value),e.has("search")&&(this._input=this.shadowRoot.querySelector(".input"))}static get styles(){return[Ja,rr.dark,rr.light,b("bbva-form-predictive-shared-styles")]}render(){return h`
      ${this._labelOut} ${this._renderSearch}
      ${this._optionsFiltered.length?xe:this.renderEmpty} ${this._renderContent}
    `}get _optional(){return this.t("bbva-form-predictive-optional-label")}get _formattedLabel(){return this.labelOut||this.required?`${this.label}`:`${this.label} ${this._optional}`}get _labelOut(){return this.labelOut?h`
        <bbva-text
          text="${this.required?`${this.labelOut}`:`${this.labelOut} ${this._optional}`}"
          size="S"
        >
        </bbva-text>
      `:""}get _renderSearch(){return h`
      <div
        class="search"
        role="combobox"
        aria-haspopup="true"
        aria-owns="listbox-${this._uniqueId}"
        aria-expanded="${0!==this._optionsFiltered.length}"
        aria-controls="listbox-${this._uniqueId}"
      >
        ${this.search?this._inputSearch:this._inputText}
      </div>
    `}get _inputText(){return h`
      <bbva-form-text
        class="input"
        aria-autocomplete="${this.inlineAutocomplete?"both":"list"}"
        aria-controls="listbox-${this._uniqueId}"
        aria-activedescendant="${p(this._activeOption._uniqueId)}"
        optional-label=""
        value="${p(this.value)}"
        .label="${this._formattedLabel}"
        clear-icon="${p(this.clearIcon)}"
        clear-icon-size="${p(this.clearIconSize)}"
        clear-accessible-text="${p(this.clearAccessibleText)}"
        ?invalid="${this.invalid}"
        @input="${this._onInput}"
        @keydown="${this._onKeydown}"
        @focusout="${this._onFocusout}"
        @focusin="${this._onFocusIn}"
        tabindex="0"
      >
        >
      </bbva-form-text>
    `}get _inputSearch(){return h`
      <bbva-form-search
        class="input"
        type="text"
        aria-autocomplete="${this.inlineAutocomplete?"both":"list"}"
        aria-controls="listbox-${this._uniqueId}"
        aria-activedescendant="${p(this._activeOption._uniqueId)}"
        optional-label=""
        value="${p(this.value)}"
        .label="${this._formattedLabel}"
        clear-icon="${p(this.clearIcon)}"
        clear-icon-size="${p(this.clearIconSize)}"
        clear-accessible-text="${p(this.clearAccessibleText)}"
        ?invalid="${this.invalid}"
        ?disabled-button="${!this.value}"
        allowed-pattern="${this.allowedPattern}"
        @input="${this._onInput}"
        @keydown="${this._onKeydown}"
        @focusout="${this._onFocusout}"
        @focusin="${this._onFocusIn}"
        tabindex="0"
      >
        >
      </bbva-form-search>
    `}get _renderErrorMessage(){return this.invalid&&this.errorMessage?h`
          <bbva-notification-help
            class="alert"
            accessibility-label-icon="${p(this.errorIconAccessibleText)}"
            icon="${this.errorIcon}"
            .size="${this.errorIconSize}"
            text=${this.errorMessage}
            disabled-tabindex
          ></bbva-notification-help>
        `:xe}get _renderInfoMessage(){return this.infoMessage?h`
          <bbva-notification-help
            accessibility-label-icon="${p(this.infoIconAccessibleText)}"
            .icon="${this.infoIcon}"
            text=${this.infoMessage}
            disabled-tabindex
          ></bbva-notification-help>
        `:xe}get _renderContent(){return h`
      <div class="predictive-content">
        ${this._renderMessages}
        <ul
          class="list"
          aria-label="${this.label}"
          role="listbox"
          id="listbox-${this._uniqueId}"
          ?hidden="${!this._optionsFiltered.length}"
        >
          ${this._optionsFiltered.map((e=>h`
              <li
                class="list-item"
                role="option"
                aria-selected="${this._activeOption._uniqueId===e._uniqueId}"
                id="${e._uniqueId}"
                tabindex="-1"
                @keydown=${()=>this._selectOption(e)}
                @click=${()=>this._selectOption(e)}
              >
                ${this.itemTemplate(e.detail)}
              </li>
            `))}
        </ul>
      </div>
    `}itemTemplate(e){return h` <span class="item"> ${e} </span> `}cleanString(e=""){return e.toLowerCase().normalize("NFD").replace(/[\u0300-\u036f]/g,"")}get _renderMessages(){return h` ${this._renderErrorMessage} ${this._renderInfoMessage} `}get renderEmpty(){return h``}filterCriteria(e,t){const i=this.cleanString(e);return 0===this.cleanString(t).indexOf(i)}get value(){return this._value}set value(e){e!==this._value&&this._updateValue(e)}async _updateValue(e){this._value=e,this._preserveOptionsList||this._updateOptionsList(e),this._optionSelected=!1;const t=this._optionKey(this._activeOption),i=this.cleanString(t),a=this.cleanString(e);if(this.inlineAutocomplete&&!this._preventInlineAutocomplete&&e&&i!==a&&0===i.indexOf(a))return this._preserveOptionsList=!0,this._autocompletedPreviousValue=e,void(this.value=t);if(this._preserveOptionsList=!1,this._preventInlineAutocomplete=!1,this.requestUpdate("value"),this._fireValueEvent(),this._autocompletedPreviousValue){const e=this._autocompletedPreviousValue.length,t=this._value.length;await this.updateComplete,this._input.setSelectionRange(e,t)}this._autocompletedPreviousValue=null}_updateOptionsList(e){var t;if(""===e&&this._isFocusedInput&&null!==(t=this._historicalItems)&&void 0!==t&&t.length)this._optionsFiltered=this._historicalItems,this._activeOption={};else if(!this._optionSelected&&e.length>=this.minChars){let t=this.items.filter((t=>this.filterCriteria(e,t.detail))).sort();this.maxResults&&(t=t.slice(0,this.maxResults)),this._optionsFiltered=t;const[i]=this._optionsFiltered;i&&(this.autoselect||this.inlineAutocomplete)?this._activeOption=i:this._activeOption={}}else this._clearOptionsList()}_selectOption(e){const{_uniqueId:t,...i}=e;this.preventValueUpdateOnSelect||(this.value=this._optionKey(e)),this.keepOnSelect||(this._clearOptionsList(),this.updateComplete.then((()=>{this._optionSelected=!0}))),this.dispatchEvent(new CustomEvent("form-predictive-item-select",{detail:i.detail,bubbles:!0,composed:!0}))}_optionKey(e){return this.filterValueKey&&e.detail?e.detail[this.filterValueKey]:e.detail}_onInput(e){this.value=e&&e.target&&e.target.value||""}_onKeydown(e){const{code:t}=e;if(this._optionSelected=!1,this._preventInlineAutocomplete=!1,"Backspace"===t&&this.inlineAutocomplete)return void(this._preventInlineAutocomplete=!0);if(!this._optionsFiltered.length)return;if("Escape"===t)return void this._clearOptionsList();const i=this._optionsFiltered.indexOf(this._activeOption);if("Enter"===t&&i>-1)return e.preventDefault(),this._selectOption(this._activeOption),void this.focus();const a="ArrowDown"===t;if(a||"ArrowUp"===t){e.preventDefault();const t=a?this._optionsFiltered[i+1]||this._optionsFiltered[0]:this._optionsFiltered[i-1]||this._optionsFiltered[this._optionsFiltered.length-1];this._activeOption=t,this.inlineAutocomplete&&(this._value=this._optionKey(this._activeOption),this._fireValueEvent())}}focus(){this._input.focus()}_onFocusout(){this._isFocusedInput=!1,setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;(e!==this||t===this._input&&!this._input.hasAttribute("focused"))&&this._blurField()}),1)}_onFocusIn(){this._isFocusedInput=!0,this._updateOptionsList(this.value)}_blurField(){this.selectOnBlur&&this._optionsFiltered.length&&this._activeOption._uniqueId&&this._selectOption(this._activeOption),this.keepOnBlur||this._clearOptionsList()}_fireValueEvent(){this.dispatchEvent(new CustomEvent("form-predictive-value-change",{detail:this.value,bubbles:!0,composed:!0}))}_clearOptionsList(){this._optionsFiltered=[],this._activeOption={}}}customElements.define(or.is,or);class sr extends(Be(Ce(s(l)))){static get is(){return"bbva-modal-service-search"}static get scopedElements(){return{"bbva-text":w,"bbva-divider":Lt,"bbva-clip-box":V,"bbva-help-modal":c,"bbva-form-predictive":or,"bbva-modal-error-bill-payments":Ya}}static get properties(){return{serviceList:{type:Array},filterList:{type:Array},visibleModalServiceSearch:{type:Boolean},invalid:{type:Boolean},secondChance:{type:Boolean},visibleModalErrorService:{type:Boolean},errorModalCatalog:{type:Object},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"}}}constructor(){super(),this.filterList=[],this.invalid=!1,this.serviceList=[],this.secondChance=!1,this.errorModalCatalog={},this.visibleModalErrorService=!1,this.visibleModalServiceSearch=!1,this.iOSFixedHeader=!1}_showWithoutResult(){return this.invalid&&It(this,hi),h`
      <div class="panel-info">
        <div class="panel-content-image">
          <img
            id="panel-image"
            src="./images/empty_state_day.svg"
            alt="${this.imageAltText}"
          />
        </div>
        <div lass="panel-content">
          <bbva-text
            alignment="center"
            text="${this.t("bill-payments-search-service-title-no-service-result")}"
            font-weight="500"
          ></bbva-text>
          <bbva-text
            alignment="center"
            text="${this.t("bill-payments-search-service-text-no-service-result")}"
          ></bbva-text>
        </div>
      </div>
    `}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}firstUpdated(){this.filterList=this.serviceList}_itemSearched(e){const t=/\W/.test(e.detail);this.invalid=t,""===e.detail?this.filterList=this.serviceList:this._filterService(e.detail)}_filterService(e){if(isNaN(e)){const t=new RegExp(e,"i");this.filterList=this.serviceList.filter((e=>t.test(JSON.stringify(e.name))))}else if(e.length>2&&e.length<10){let t=e;for(let e=t.length;e<9;e+=1)t=`0${t}`;It(this,Wt,t)}}_showModalServiceSearch(e){const t={headerText:this.t("bill-payments-title-add-new-service"),titleText:this.t("bill-payments-error-title-service-search"),bodyText:this.secondChance?this.t("bill-payments-error-body-service-search-two"):this.t("bill-payments-error-body-service-search"),buttonText:this.secondChance?this.t("bill-payments-error-button-close"):this.t("bill-payments-error-button-retry"),linkText:this.secondChance?"":this.t("bill-payments-text-link-choose-another-service-detail-modal")};return this.secondChance?h`
        <bbva-modal-error-bill-payments
          id="modalErrorBill"
          .errorModalId=${e}
          .errorModalParams=${t}
          .visibleModal=${this.visibleModalErrorService}
          @error-modal-header-right-click="${()=>It(this,Vt,e)}"
          @error-modal-footer-button-click="${()=>It(this,Vt,e)}"
        >
        </bbva-modal-error-bill-payments>
      `:h`
      <bbva-modal-error-bill-payments
        id="modalBillError"
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalErrorService}
        @error-modal-header-right-click="${()=>It(this,Vt,e)}"
        @error-modal-footer-button-click="${()=>this._tryAgain(e)}"
        @error-modal-footer-link-click="${()=>It(this,Vt,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_tryAgain(e){It(this,Vt,e),this.secondChance=!0,It(this,ti,e)}_getTextTax({id:e}){const t=Rt.find((t=>t.id===e)),i=t?t.name:void 0;return i?`${this.t("bill-payments-ticket-text-pay-reference")} ${i}`:""}resetValue(){this.shadowRoot.querySelector('[data-tag-name="bbva-form-predictive"]').value=""}render(){return h`
      <bbva-help-modal
        id="modalServiceSearch"
        class="help-modal"
        hide-content-padding-top
        ?visible="${this.visibleModalServiceSearch}"
        open="${this.visibleModalServiceSearch}"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t("bill-payments-search-service-title-header")}"
      >
        <div class="main" slot="slot-content">
          <bbva-form-predictive
            id="searchForm"
            ?invalid="${this.invalid}"
            error-message="${this.t("bill-payments-search-error-message")}"
            required
            class="search-form"
            label="${this.t("bill-payments-search-service-label-input")}"
            label-out="${this.t("bill-payments-search-service-label-out")}"
            info-message="${this.t("bill-payments-search-service-info-message")}"
            @form-predictive-value-change="${e=>this._itemSearched(e)}"
          >
          </bbva-form-predictive>
          <bbva-text
            ?hidden="${0===this.filterList.length}"
            class="title-modal-search"
            tag="span"
            text=${this.t("bill-payments-search-service-fast-access")}
          >
          </bbva-text>
          <div class="content-result-search">
            ${this.filterList.slice(0,25).map(((e,t)=>{var i;return h`
                <div
                  class="content-clip-list"
                  ?hidden="${this.invalid}"
                  @click="${()=>It(this,Ft,e)}"
                >
                  <div class="content-flex">
                    <div class="image">
                      <bbva-clip-box
                        data-tag-name="bbva-clip-box"
                        image="${p(null==e||null===(i=e.logo)||void 0===i?void 0:i.url)}"
                        text="${p(null==e?void 0:e.name)}"
                        bg-color="#1973B8"
                        size="large"
                      >
                      </bbva-clip-box>
                    </div>
                    <div class="main-content">
                      <bbva-text
                        font-weight="500"
                        text-color="1973B8"
                        data-tag-name="bbva-text"
                        unset
                        size="M"
                        class="heading link"
                        text="${p(null==e?void 0:e.name)}"
                      ></bbva-text>
                      <bbva-text
                        tag="span"
                        class="bbva-text-description"
                        text="${this._getTextTax(e)}"
                      ></bbva-text>
                    </div>
                  </div>
                  <div class="content-reference content-flex">
                    <bbva-text
                      tag="span"
                      text="${Pt(e&&e.id)?this.t("bill-payments-title-num-agreement"):""}"
                    ></bbva-text>
                    <bbva-text
                      tag="span"
                      text="${Pt(e&&e.id)}"
                    ></bbva-text>
                  </div>
                  <bbva-divider
                    .hidden=${t===this.filterList.length-1}
                    size="full"
                  ></bbva-divider>
                </div>
              `}))}
            ${!this.filterList.length>0||this.invalid?this._showWithoutResult():""}
          </div>
        </div>
      </bbva-help-modal>
      ${this._showModalServiceSearch(this.errorModalCatalog.SERVICE_SEARCH_ERROR)}
    `}}customElements.define(sr.is,sr);class lr extends(Be(Ce(s(l)))){static get is(){return"bbva-feature-bill-payments-select-service"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":w,"bbva-divider":Lt,"bbva-clip-box":V,"bbva-list-simple":xt,"bbva-button-default":n,"bbva-modal-service-detail":Za,"bbva-modal-service-search":sr,"bbva-modal-show-all-services-stored":xi}}static get properties(){return{savedList:{type:Object},filterList:{type:Object},visibleModalAllServices:{type:Boolean},visibleModalServiceDetail:{type:Boolean},visibleModalServiceSearch:{type:Boolean},errorModalCatalog:{type:Object},visibleModalErrorService:{type:Boolean},serviceList:{type:Object},selectedService:{type:Object},serviceAlias:{type:String},isSaved:{type:Boolean},barCode:{type:Boolean},referenceMaximumLength:{type:Number},referenceMinimumLength:{type:Number},referenceType:{type:String},aliasService:{type:String},referenceServiceSaved:{type:String},editSelectService:{type:Boolean},isTaxes:{type:Boolean},isSipare:{type:Boolean,attribute:"is-sipare"}}}constructor(){super(),this.savedList=[],this.filterList=[],this.isSaved=!1,this.barCode=!1,this.isTaxes=!1,this.serviceList=[],this.aliasService="",this.serviceAlias="",this.referenceType="",this.selectedService=[],this.errorModalCatalog={},this.editSelectService=!1,this.referenceMaximumLength=0,this.referenceMinimumLength=0,this.referenceServiceSaved="",this.visibleModalAllServices=!1,this.visibleModalErrorService=!1,this.visibleModalServiceDetail=!1,this.visibleModalServiceSearch=!1,this.isSipare=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}_showModalAllServiceStored(){return h`
      <bbva-modal-show-all-services-stored
        id="modalStored"
        .savedList="${this.savedList}"
        .visibleModalAllServices="${this.visibleModalAllServices}"
        @help-modal-header-right-primary-click="${()=>It(this,zt)}"
      >
      </bbva-modal-show-all-services-stored>
    `}get _showModalServiceDetail(){return h`
      <bbva-modal-service-detail
        .selectedService="${this.selectedService}"
        .isSaved="${this.isSaved}"
        .barCode="${this.barCode}"
        .referenceMaximumLength="${this.referenceMaximumLength}"
        .referenceMinimumLength="${this.referenceMinimumLength}"
        .referenceServiceSaved="${this.referenceServiceSaved}"
        .aliasService="${this.aliasService}"
        .referenceType="${this.referenceType}"
        .visibleModalServiceDetail="${this.visibleModalServiceDetail}"
        .errorModalCatalog=${this.errorModalCatalog}
        .isTaxes="${this.isTaxes}"
        .errorScannerCodes=${[-1,0,1,3]}
        .isSipare="${this.isSipare}"
      >
      </bbva-modal-service-detail>
    `}_showModalServiceSearch(){return h`
      <bbva-modal-service-search
        id="modalSearch"
        .serviceList=${this.serviceList}
        .filterList=${this.filterList}
        .visibleModalServiceSearch=${this.visibleModalServiceSearch}
        .errorModalCatalog=${this.errorModalCatalog}
        .visibleModalErrorService=${this.visibleModalErrorService}
        @help-modal-header-right-primary-click="${()=>It(this,Nt)}"
      >
      </bbva-modal-service-search>
    `}_showWithoutResult(){return h`
      <div class="panel-info">
        <div class="panel-content-image">
          <img
            id="panel-image"
            src="./images/empty_state_day.svg"
            alt="${this.imageAltText}"
          />
        </div>
        <div lass="panel-content">
          <bbva-text
            alignment="center"
            tag="span"
            class="title-empty-result"
            text="${this.t("bill-payments-title-no-saved-services")}"
          ></bbva-text>
          <bbva-text
            alignment="center"
            tag="span"
            class="content-empty-result"
            text="${this.t("bill-payments-title-no-saved-services-content-text")}"
          ></bbva-text>
        </div>
      </div>
    `}_getSelectedService(){const[e]=this.selectedService;return e}_chooseNewService(){It(this,Dt),this.shadowRoot.querySelector('[data-tag-name="bbva-modal-service-search"]').resetValue()}render(){return this.editSelectService?h`
      <div class="content-clip-list">
        <div class="content-flex">
          <div class="image">
            <bbva-clip-box
              data-tag-name="bbva-clip-box"
              bg-color="#1973B8"
              image="${p(this._getSelectedService().logo.url)}"
              text="${p(this._getSelectedService().name)}"
              size="large"
            >
            </bbva-clip-box>
          </div>
          <div class="main-content">
            <bbva-text
              tag="span"
              class="heading link"
              text="${p(this._getSelectedService().name)}"
            ></bbva-text>
            <bbva-text
              tag="span"
              class="bbva-text-description"
              text="${p(this.aliasService)}"
            ></bbva-text>
          </div>
        </div>
        <div class="content-reference content-flex">
          <bbva-text
            tag="span"
            text="${Pt(this._getSelectedService().id)?this.t("bill-payments-title-num-agreement"):""}"
          >
          </bbva-text>
          <bbva-text tag="span" text="${Pt(this._getSelectedService().id)}">
          </bbva-text>
        </div>
      </div>
      <div class="content-reference-edit">
        <bbva-text
          tag="span"
          class="bbva-text-description"
          text="${this.t("bill-payments-title-reference")}"
        >
        </bbva-text>
        <bbva-text tag="span" text="${p(this.referenceServiceSaved)}">
        </bbva-text>
      </div>
      <div class="content-button-edit">
        <bbva-button-default
          id="btnChooseAnotherService"
          variant="primary"
          text="${this.t("bill-payments-choose-another-service-title")}"
          @click="${()=>{It(this,jt),It(this,di,{textLinkName:"editar servicio"})}}"
        >
        </bbva-button-default>
        <bbva-button-default
          id="btnContinuePayment"
          class="button-edit"
          variant="link"
          text="${this.t("bill-payments-continue-with-payment-title")}"
          @click="${({target:e})=>It(e,Jt)}"
        >
        </bbva-button-default>
      </div>
    `:h`
        <bbva-text
          class="bbva-text-title"
          text="${this.t("bill-payments-bbva-text-title-dashboard")}"
        ></bbva-text>
        <div class="btn-new-service content-flex">
          <bbva-icon
            size="24"
            class="bbva-icon-btn-primary"
            icon="${Te()}"
          ></bbva-icon>
          <bbva-button-default
            id="btnPayNew"
            variant="link"
            @click="${this._chooseNewService}"
            text="${this.t("bill-payments-title-add-new-service")}"
          >
          </bbva-button-default>
        </div>
        <div class="content-link content-flex">
          <bbva-text
            class="bbva-text-stored-title"
            tag="span"
            text=${this.t("bill-payments-title-all-saved")}
          ></bbva-text>
          <bbva-button-default
            id="linkAllSaved"
            variant="link"
            ?hidden="${this.savedList.length<=5}"
            @click="${()=>It(this,qt)}"
            text="${this.t("bill-payments-title-see-all")}"
          >
          </bbva-button-default>
        </div>
        <div class="content-result">
          ${this.savedList.map(((e,t)=>t>=5?h``:h`
        <div
          id="item${t}"
          class="content-clip-list"
          @click="${()=>It(this,Gt,e)}"
        >
          <div class="content-flex">
            <div class="image">
              <bbva-clip-box
                data-tag-name="bbva-clip-box"
                bg-color="#1973B8"
                text="${p(e.service.name)}"
                size="large"
              >
              </bbva-clip-box>
            </div>
            <div class="main-content">
              <bbva-text
                tag="span"
                class="heading"
                text="${p(e.service.name)}"
              ></bbva-text>
              <bbva-text
                tag="span"
                class="bbva-text-description"
                text="${p(e.alias)}"
              ></bbva-text>
            </div>
          </div>
          <div class="content-reference content-flex">
            <bbva-text
              tag="span"
              class="text-num-agreement"
              text="${Pt(e&&e.service&&e.service.id)?this.t("bill-payments-title-num-agreement"):""}"
            ></bbva-text>
            <bbva-text
              tag="span"
              class="number-of-agreement"
              text="${Pt(e&&e.service&&e.service.id)}"
            ></bbva-text>
          </div>
          <bbva-divider
            .hidden=${4===t}
            size="full"
          ></bbva-divider>
        </div>
      `))}
          ${this.savedList.length?"":this._showWithoutResult()}
        </div>
        ${this._showModalAllServiceStored()}
        ${this.visibleModalServiceDetail?this._showModalServiceDetail:""}
        ${this._showModalServiceSearch()}
      `}}customElements.define(lr.is,lr),customElements.define(Li.is,Li);var nr=t`:host {
  display: block;
  box-sizing: border-box;
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

.content-account,
.description-account {
  display: flex;
  justify-content: space-between;
}

.content-account-title {
  margin-top: 1rem;
  color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
}

.content-amount {
  margin-top: 1rem;
}

.num-account {
  margin-bottom: 1rem;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle20, ${i(P.fontStyle20)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
}

.description {
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
}

:host([varian=summary]) .description {
  color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
}
:host([varian=summary]) .content-account-title {
  margin-top: 1rem;
  color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
}
:host([varian=summary]) .content-amount {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
`;class cr extends(Qe(l)){static get is(){return"bill-payments-origin-accounts"}static get scopedElements(){return{"bbva-text":w,"bbva-amount":E,"bbva-divider":Lt,"bbva-notification-help":Li}}static get properties(){return{listAccount:{type:Array},setMaxResult:{type:Number},warningIcon:{type:String,attribute:"warning-icon"},selectAmount:{type:Number},currencyCode:{type:String},localCurrency:{type:String}}}constructor(){super(),this.listAccount=[],this.setMaxResult=0,this.selectAmount=0,this.currencyCode="",this.localCurrency="",this.warningIcon=K()}static get styles(){return[nr]}selectOrigin(e){e.primaryAmount.amount<this.selectAmount||(It(this,Zt,e),It(this,Jt))}get validateBalance(){return h`
      <div class="alert-amount">
        <bbva-notification-help
          hide-top-padding
          hide-left-padding
          accessibility-label-icon="Alert"
          class="alert"
          icon="${this.warningIcon}"
          text="${this.t("bill-payments-insufficient-balance")}"
        >
        </bbva-notification-help>
      </div>
    `}render(){return h` ${this.listAccount.map(((e,t)=>{var i,a,r;return t<this.setMaxResult?h`
            <div
              id="listAccount${t}"
              class="payment-account"
              @click="${()=>this.selectOrigin(this.listAccount[t])}"
            >
              <div class="content-account">
                <bbva-text
                  class="content-account-title"
                  tag="span"
                  text="${null==e?void 0:e.titleName}"
                ></bbva-text>
                <bbva-amount
                  class="content-amount"
                  variant="l"
                  amount="${null==e||null===(i=e.primaryAmount)||void 0===i?void 0:i.amount}"
                  currency-code="${this.currencyCode}"
                  local-currency="${this.localCurrency}"
                ></bbva-amount>
              </div>
              <div class="description-account">
                <div class="num-account">
                  <span>${this.t("bill-payments-account-point")}</span>
                  <span>${null==e||null===(a=e.originalProduct)||void 0===a?void 0:a.number.substr(-4)}</span>
                </div>
                <div class="description">
                  <span>${this.t("bill-payments-available-balance")}</span>
                </div>
              </div>
              ${this.selectAmount>(null==e||null===(r=e.primaryAmount)||void 0===r?void 0:r.amount)?this.validateBalance:""}
              <bbva-divider
                .hidden=${t===this.setMaxResult-1}
                size="full"
              ></bbva-divider>
            </div>
          `:xe}))}
    `}}customElements.define(cr.is,cr);var dr=t`:host {
  display: block;
  box-sizing: border-box;
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

.header-card-title {
  margin-top: 1rem;
  margin-bottom: 0.5rem;
  color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
}

.card-main {
  display: flex;
  text-align: center;
  justify-content: space-between;
}

.bbva-amount-card {
  font-size: 1.25rem;
}

.card-details {
  text-align: right;
}

.card-footer {
  display: flex;
  margin-bottom: 1rem;
  font-size: 0.9375rem;
  font-style: italic;
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
}

.description {
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-style: normal;
}

:host([varian=summary]) .description {
  color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  font-style: normal;
}
:host([varian=summary]) .header-card-title {
  margin-top: 1rem;
  color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
}
:host([varian=summary]) .bbva-amount-card {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
`;class br extends(Qe(l)){static get is(){return"bill-payments-origin-cards"}static get scopedElements(){return{"bbva-text":w,"bbva-amount":E,"bbva-divider":Lt,"bbva-clip-card":se,"bbva-notification-help":Li}}static get properties(){return{listCard:{type:Array},setMaxResult:{type:Number},warningIcon:{type:String,attribute:"warning-icon"},selectAmount:{type:Number},currencyCode:{type:String},localCurrency:{type:String}}}constructor(){super(),this.listCard=[],this.setMaxResult=0,this.selectAmount=0,this.currencyCode="",this.localCurrency="",this.warningIcon=K()}static get styles(){return[dr]}selectOrigin(e){e.primaryAmount.amount<this.selectAmount||(It(this,Zt,e),It(this,Jt))}get validateBalance(){return h`
      <div class="alert-amount">
        <bbva-notification-help
          hide-top-padding
          hide-left-padding
          accessibility-label-icon="Alert"
          class="alert"
          icon="${this.warningIcon}"
          text="${this.t("bill-payments-insufficient-balance")}"
        >
        </bbva-notification-help>
      </div>
    `}render(){return h`
      ${this.listCard.map(((e,t)=>{var i,a,r;return t<this.setMaxResult?h`
            <div
              id="listCards${t}"
              class="payments-card"
              @click="${()=>this.selectOrigin(this.listCard[t])}"
            >
              <div class="header-card">
                <bbva-text
                  class="header-card-title"
                  tag="span"
                  text="${null==e?void 0:e.name}"
                ></bbva-text>
              </div>
              <div class="card-main">
                <bbva-clip-card
                  variant="credit"
                  size="medium"
                  .accessibilityText="${this.t("bill-payments-card-title")}"
                >
                </bbva-clip-card>
                <div class="card-details">
                  <bbva-amount
                    class="bbva-amount-card"
                    variant="l"
                    amount="${null==e||null===(i=e.primaryAmount)||void 0===i?void 0:i.amount}"
                    currency-code="${this.currencyCode}"
                    local-currency="${this.localCurrency}"
                  ></bbva-amount>
                  <div class="description">
                    <span>${this.t("bill-payments-available-balance")}</span>
                  </div>
                </div>
              </div>
              <div class="card-footer">
                <span class="mask">
                  ${this.t("bill-payments-account-point")}
                </span>
                <span class="number">
                  ${null==e||null===(a=e.originalProduct)||void 0===a?void 0:a.number.substr(-4)}
                </span>
              </div>
              ${this.selectAmount>(null==e||null===(r=e.primaryAmount)||void 0===r?void 0:r.amount)?this.validateBalance:""}
              <bbva-divider
                .hidden=${t===this.setMaxResult-1}
                size="full"
              ></bbva-divider>
            </div>
          `:""}))}
    `}}customElements.define(br.is,br);class hr extends(Qe(l)){static get is(){return"bbva-feature-bill-payments-amount"}static get scopedElements(){return{"bbva-form-input":Ka,"bbva-button-default":n,"bbva-text":w,"bbva-amount":E}}static get properties(){return{selectAmount:{type:Number},firstChange:{type:Boolean},currencyCode:{type:String},localCurrency:{type:String},isSipare:{type:Boolean,attribute:"is-sipare"}}}constructor(){super(),this.selectAmount=0,this.currencyCode="",this.localCurrency="",this.firstChange=!1,this.isSipare=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}focus(){this.shadowRoot.querySelector("#amount").shadowRoot.querySelector("bbva-form-amount").querySelector("input").style.paddingLeft="0.5rem"}blur(){this.shadowRoot.querySelector("#amount").shadowRoot.querySelector("bbva-form-amount").querySelector("input").style.paddingLeft="2rem"}onChange(e){if(!this.firstChange){this.firstChange=!0;this.shadowRoot.querySelector("#amount").shadowRoot.querySelector("bbva-form-amount").querySelector("input").style.paddingLeft="2rem"}It(this,Xt,e.detail)}completedStep(){setTimeout((()=>{It(this,Kt)}),100)}resetAmount(){this.isSipare||(this.shadowRoot.querySelector("#amount").shadowRoot.querySelector('[data-tag-name="bbva-form-amount"]').value="")}get getInputAmount(){return h`
      <bbva-form-input
        id="amount"
        type="amount"
        class="amount-input"
        label="${this.t("bill-payments-import-label")}"
        .symbol-left="${!0}"
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="en"
        mode-input="decimal"
        amount="${p(0!==this.selectAmount?this.selectAmount:void 0)}"
        @form-amount-input-change="${e=>this.onChange(e)}"
        @form-field-input-focus="${e=>this.focus(e)}"
        @form-field-input-blur="${e=>this.blur(e)}"
      ></bbva-form-input>
    `}get getAmount(){return h`
      <div slot='slot-content' class="import-title">
        <bbva-text
          tag="span"
          text="${this.t("bill-payments-text-import")}"
          ambient-color="secondary500"
        ></bbva-text>
        <bbva-amount
          variant="xl"
          amount="${this.selectAmount}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
        ></bbva-amount>
      </div>
    `}render(){return h`
      <div class="content">
        ${this.isSipare?this.getAmount:this.getInputAmount}
      </div>
      <div class="button-continue-amount">
        <bbva-button-default
          id="bntDefault"
          variant="primary"
          ?disabled="${!this.selectAmount>0}"
          @click="${()=>this.completedStep()}"
          text="${this.t("bill-payments-label-continue")}"
        >
        </bbva-button-default>
      </div>
    `}}customElements.define(hr.is,hr);class pr extends(Be(Ce(s(l)))){static get is(){return"bbva-feature-bill-payments-origin"}static get scopedElements(){return{"bbva-text":w,"bbva-help-modal":c,"bbva-tab-default":Ge,"bbva-button-default":n,"bill-payments-origin-cards":br,"bill-payments-origin-accounts":cr}}static get properties(){return{listAccount:{type:Array},listCard:{type:Array},selectedService:{type:Object},visibleModalAllAccount:{type:Boolean},visibleModalAllCard:{type:Boolean},selectAmount:{type:Number},isTaxes:{type:Boolean},currencyCode:{type:String},localCurrency:{type:String},isSipare:{type:Boolean,attribute:"is-sipare"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"}}}constructor(){super(),this.listCard=[],this.isTaxes=!1,this.listAccount=[],this.selectAmount=0,this.currencyCode="",this.localCurrency="",this.selectedService=[],this.visibleModalAllCard=!1,this.visibleModalAllAccount=!1,this.isSipare=!1,this.iOSFixedHeader=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}_continueButton(e){var t,i;const a=null===(t=e[0])||void 0===t||null===(i=t.primaryAmount)||void 0===i?void 0:i.amount;return 1===e.length?h`
        <div class="button-continue">
          <bbva-button-default
            id="buttonOneAccount"
            variant="primary"
            ?disabled=${this.selectAmount>a}
            @click="${()=>this.selectOrigin(e[0])}"
            text="${this.t("bill-payments-label-continue")}"
          >
          </bbva-button-default>
        </div>
      `:h``}selectOrigin(e){It(this,Zt,e),It(this,Jt)}get _showAllAccountModal(){return h`
      <bbva-help-modal
        id="modalAllAccount"
        class="help-modal"
        hide-content-padding-top
        ?visible="${this.visibleModalAllAccount}"
        open="${this.visibleModalAllAccount}"
        full-height
        sticky-footer
        button-text="cerrar"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-header-right-primary-click="${()=>{this.visibleModalAllAccount=!1}}"
        @help-modal-footer-button-click="${()=>{this.visibleModalAllAccount=!1}}"
        header-text="${this.t("bill-payments-account-bbva-title")}"
      >
        <div class="main slot-modal-content" slot="slot-content">
          <bill-payments-origin-accounts
            .selectAmount=${this.selectAmount}
            .setMaxResult=${this.listAccount.length}
            .listAccount=${this.listAccount}
            .currencyCode="${this.currencyCode}"
            .localCurrency="${this.localCurrency}"
          ></bill-payments-origin-accounts>
        </div>
      </bbva-help-modal>
    `}get _showAllCardsModal(){return h`
      <bbva-help-modal
        id="modalAllCards"
        class="help-modal"
        hide-content-padding-top
        ?visible="${this.visibleModalAllCard}"
        open="${this.visibleModalAllCard}"
        full-height
        sticky-footer
        button-text="cerrar"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-header-right-primary-click="${()=>{this.visibleModalAllCard=!1}}"
        @help-modal-footer-button-click="${()=>{this.visibleModalAllCard=!1}}"
        header-text="${this.t("bill-payments-card-bbva-title")}"
      >
        <div class="main slot-modal-content" slot="slot-content">
          <bill-payments-origin-cards
            .selectAmount=${this.selectAmount}
            .setMaxResult="${this.listCard.length}"
            .listCard=${this.listCard}
            .currencyCode="${this.currencyCode}"
            .localCurrency="${this.localCurrency}"
          ></bill-payments-origin-cards>
        </div>
      </bbva-help-modal>
    `}get _showAccountAndCards(){return this.listAccount.length>=1&&this.listCard.length>=1?h`
        <div class="content">
          <bbva-text
            tag="span"
            class="text-choose-medium"
            text="${this.t("bill-payments-choose-payment")}"
          ></bbva-text>
          <bbva-tab-default
            .options="${[{title:this.t("bill-payments-accounts-title")},{title:this.t("bill-payments-cards-title")}]}"
            id="bbva-tab-default-account-cards"
          >
            <div
              class="panel"
              tabindex="0"
              role="tabpanel"
              id="content-0"
              aria-labelledby="tab-0"
            >
              <div class="content-link-account content-flex">
                <bbva-text
                  class="text-account"
                  tag="span"
                  text=${this.t("bill-payments-account-bbva-title")}
                ></bbva-text>
                <bbva-button-default
                  id="listAccount"
                  variant="link"
                  ?hidden="${this.listAccount.length<=3}"
                  @click="${()=>{this.visibleModalAllAccount=!0}}"
                  text="${this.t("bill-payments-title-see-add-account")}"
                >
                </bbva-button-default>
              </div>
              <bill-payments-origin-accounts
                id="listAccountTab"
                .selectAmount=${this.selectAmount}
                .setMaxResult=${3}
                .listAccount=${this.listAccount}
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
              ></bill-payments-origin-accounts>
              ${this._continueButton(this.listAccount)}
              ${this._showAllAccountModal}
            </div>
            <div
              class="panel"
              tabindex="0"
              role="tabpanel"
              id="content-1"
              aria-labelledby="tab-1"
            >
              <div class="content-link-account content-flex">
                <bbva-text
                  class="text-credit-card"
                  tag="span"
                  text=${this.t("bill-payments-card-bbva-title")}
                ></bbva-text>
                <bbva-button-default
                  id="linkAllCards"
                  variant="link"
                  ?hidden="${this.listCard.length<=3}"
                  @click="${()=>{this.visibleModalAllCard=!0}}"
                  text="${this.t("bill-payments-title-see-add-account")}"
                >
                </bbva-button-default>
              </div>
              <bill-payments-origin-cards
                id="listCardsTab"
                .selectAmount=${this.selectAmount}
                .setMaxResult=${3}
                .listCard=${this.listCard}
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
              ></bill-payments-origin-cards>
              ${this._continueButton(this.listCard)} ${this._showAllCardsModal}
            </div>
          </bbva-tab-default>
        </div>
      `:h` ${this._maxAccountAndCards} `}get _maxAccountAndCards(){return this.listAccount.length>=1?h`
        <div class="content-link-account content-flex">
          <bbva-text
            class="text-account"
            tag="span"
            text=${this.t("bill-payments-account-bbva-title")}
          ></bbva-text>
          <bbva-button-default
            id="allListAccount"
            variant="link"
            ?hidden="${this.listAccount.length<=3}"
            @click="${()=>{this.visibleModalAllAccount=!0}}"
            text="${this.t("bill-payments-title-see-add-account")}"
          >
          </bbva-button-default>
        </div>
        <bill-payments-origin-accounts
          id="listAccountsAll"
          .selectAmount=${this.selectAmount}
          .setMaxResult=${3}
          .listAccount=${this.listAccount}
          .currencyCode="${this.currencyCode}"
          .localCurrency="${this.localCurrency}"
        ></bill-payments-origin-accounts>
        ${this._continueButton(this.listAccount)} ${this._showAllAccountModal}
      `:h`
      <div class="content-link-account content-flex">
        <bbva-text
          class="text-credit-card"
          tag="span"
          text=${this.t("bill-payments-card-bbva-title")}
        ></bbva-text>
        <bbva-button-default
          id="allListCards"
          variant="link"
          ?hidden="${this.listCard.length<=3}"
          @click="${()=>{this.visibleModalAllCard=!0}}"
          text="${this.t("bill-payments-title-see-add-account")}"
        >
        </bbva-button-default>
      </div>
      <bill-payments-origin-cards
        id="listCardsAll"
        .selectAmount=${this.selectAmount}
        .setMaxResult=${3}
        .listCard=${this.listCard}
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
      ></bill-payments-origin-cards>
      ${this._continueButton(this.listCard)} ${this._showAllCardsModal}
    `}render(){return this.isTaxes&&!this.isSipare?h` ${this._showAccountAndCards}`:h`
      <bbva-text
        tag="span"
        text=${this.isSipare?this.t("bill-payments-choose-account-payment-sipare"):this.t("bill-payments-choose-account-payment")}
      ></bbva-text>
      <div class="content-link-account content-flex">
        <bbva-text
          ?hidden="${this.isSipare}"
          class="text-account"
          tag="span"
          text=${this.t("bill-payments-account-bbva-title")}
        ></bbva-text>
        <bbva-button-default
          id="finalAccounts"
          variant="link"
          ?hidden="${this.listAccount.length<=3}"
          @click="${()=>{this.visibleModalAllAccount=!0}}"
          text="${this.t("bill-payments-title-see-add-account")}">
        </bbva-button-default>
      </div>
      <bill-payments-origin-accounts
        id="listAccountsPrimary"
        .selectAmount=${this.selectAmount}
        .setMaxResult=${3}
        .listAccount=${this.listAccount}
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
      ></bill-payments-origin-accounts>
      ${this._continueButton(this.listAccount)} ${this._showAllAccountModal}
    `}}customElements.define(pr.is,pr);class mr extends(Qe(l)){static get is(){return"bbva-feature-bill-payments-concept"}static get scopedElements(){return{"bbva-form-input":Ka}}static get properties(){return{selectConcept:{type:String},conceptMaximumLength:{type:Number},conceptMinimumLength:{type:Number},conceptType:{type:String},isTaxes:{type:Boolean},isSipare:{type:Boolean,attribute:"is-sipare"}}}constructor(){super(),this.conceptType="",this.selectConcept="",this.conceptMaximumLength=0,this.conceptMinimumLength=0,this.pageSuccesspVisible=!1,this.isTaxes=!1,this.isSipare=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}firstUpdated(){this._validateConcept(this.selectConcept)}_validateConcept(e){return It(this,Qt,e),!!(e.length>=this.conceptMinimumLength&&e.length<=this.conceptMaximumLength||this.isTaxes&&!this.isSipare)}_inputConceptInfoMessage(e,t){return e===t?this.t("bill-payments-info-message-reference-same-chars","__Ingresa número de referencia__",{minimumLength:e}):this.t("bill-payments-info-message-reference","__Ingresa número de referencia__",{minimumLength:e,maximumLength:t})}completedStep(e){setTimeout((()=>{It(this,ei),It(e,Jt)}),100)}render(){return h`
      <div class="content">
        <bbva-form-input
          class="concept-input"
          type="${"INTEGER"===this.conceptType?"number":"text"}"
          label="${this.t("bill-payments-service-ticket-title-concept")}"
          value="${this.selectConcept}"
          allowed-pattern="^[a-zA-Z0-9\\s]+$"
          ?disabled="${this.isTaxes&&!this.isSipare||0===this.conceptMinimumLength&&0===this.conceptMaximumLength}"
          @form-input-value-change="${e=>this._validateConcept(e.detail.value)}"
          info-message="${this._inputConceptInfoMessage(this.conceptMinimumLength,this.conceptMaximumLength)}"
        >
        </bbva-form-input>
      </div>
      <div class="button-continue">
        <bbva-button-default
          variant="primary"
          ?disabled="${!this._validateConcept(this.selectConcept)}"
          @click="${({target:e})=>this.completedStep(e)}"
          text="${this.t("bill-payments-label-continue")}"
        >
        </bbva-button-default>
      </div>
    `}}customElements.define(mr.is,mr);var vr=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content-clip-list {
  padding-top: 1rem;
}

.content-flex {
  display: flex;
}

.content-clip-list-summary {
  width: 100%;
}

.image {
  margin-right: calc(1 * var(--gridSpacerVariant, var(--gridSpacer, 8)) / 16 * 1rem);
}

.content-agreement,
.content-reference {
  padding-top: 1rem;
}

.row {
  justify-content: space-between;
}

.confirm-step {
  width: auto;
  background-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

.button-continue {
  padding-bottom: 0.5rem;
}

.text-commission {
  margin-top: 0.5rem;
  margin-bottom: 1rem;
  font-size: 1rem;
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.summary-amount-text {
  margin-bottom: 0.25rem;
  padding-top: 1.5rem;
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.amount-title-summary {
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.summary-concept-title {
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
}

.line-capture {
  word-wrap: break-word;
}

.content-summary {
  padding-top: 1rem;
}

.content-summary-title {
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  color: var(--colorsPrimarySubdued, ${i(u.primarySubdued)});
}

.main-content {
  align-content: center;
}

.summary-amount {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
`;class ur extends(Be(Ce(s(l)))){static get is(){return"bbva-bill-payments-multi-step"}static get scopedElements(){return{"bbva-text":w,"bbva-amount":E,"bbva-clip-box":V,"bbva-header-main":Xe,"bbva-button-default":n,"bbva-panel-container":rt,"bbva-expandable-step":Me,"bbva-expandable-multistep":Ee,"bill-payments-origin-cards":br,"bill-payments-origin-accounts":cr,"bbva-modal-error-bill-payments":Ya,"bbva-feature-bill-payments-amount":hr,"bbva-feature-bill-payments-origin":pr,"bbva-feature-bill-payments-concept":mr,"bbva-feature-bill-payments-select-service":lr}}static get properties(){return{savedList:{type:Array},selectedService:{type:Array},serviceList:{type:Array},filterList:{type:Array},selectAmount:{type:Number},listAccount:{type:Array},listCard:{type:Array},selectedOrigin:{type:Array},selectConcept:{type:String},_allStepsCollapsed:{type:Boolean},visibleModalServiceSearch:{type:Boolean},visibleModalAllServices:{type:Boolean},isSaved:{type:Boolean},visibleModalServiceDetail:{type:Boolean},errorModalCatalog:{type:Object},visibleModalErrorService:{type:Boolean},visibleModalCaptureLine:{type:Boolean},visibleModalIncorrectAmount:{type:Boolean},visibleModalReference:{type:Boolean},visibleModalOtpError:{type:Boolean},secondChance:{type:Boolean},visibleModalExitProcess:{type:Boolean},barCode:{type:Boolean},referenceMaximumLength:{type:Number},referenceMinimumLength:{type:Number},referenceType:{type:String},aliasService:{type:String},referenceServiceSaved:{type:String},completedStepAmount:{type:Boolean},isTaxes:{type:Boolean},editSelectService:{type:Boolean},conceptMaximumLength:{type:Number},conceptMinimumLength:{type:Number},conceptType:{type:String},currencyCode:{type:String},localCurrency:{type:String},isSipare:{type:Boolean,attribute:"is-sipare"},billSipare:{type:Object,attribute:"bill-sipare"},visibleModalExpiredDate:{type:Boolean,attribute:"visible-modal-expired-date"},visibleModalCaptureLineSipare:{type:Boolean,attribute:"visible-modal-capture-line-sipare"},visibleModalOutOfTimePay:{type:Boolean,attribute:"visible-modal-out-of-time-pay"},paramsOtpError:{type:Object},billPaymentHeaderMultiStepVisible:{type:Boolean,attribute:"bill-payment-header-multi-step-visible"},isNativeIos:{type:Boolean,attribute:"is-native-ios"}}}constructor(){super(),this.listCard=[],this.savedList=[],this.filterList=[],this.barCode=!1,this.isSaved=!1,this.isTaxes=!1,this.listAccount=[],this.serviceList=[],this.selectAmount=0,this.conceptType="",this.aliasService="",this.selectConcept="",this.referenceType="",this.selectedOrigin=[],this.selectedService=[],this.secondChance=!1,this.errorModalCatalog={},this.conceptMaximumLength=0,this.conceptMinimumLength=0,this.editSelectService=!1,this.referenceServiceSaved="",this.referenceMaximumLength=0,this.referenceMinimumLength=0,this._allStepsCollapsed=!1,this.completedStepAmount=!1,this.visibleModalOtpError=!1,this.visibleModalReference=!1,this.visibleModalAllServices=!1,this.visibleModalCaptureLine=!1,this.visibleModalExitProcess=!1,this.visibleModalErrorService=!1,this.visibleModalServiceSearch=!1,this.visibleModalServiceDetail=!1,this.visibleModalIncorrectAmount=!1,this.isSipare=!1,this.billSipare={},this.visibleModalExpiredDate=!1,this.visibleModalCaptureLineSipare=!1,this.visibleModalOutOfTimePay=!1,this.paramsOtpError={},this.billPaymentHeaderMultiStepVisible=!1,this.isNativeIos=!1}reset(){this.listCard=[],this.savedList=[],this.filterList=[],this.barCode=!1,this.isSaved=!1,this.isTaxes=!1,this.listAccount=[],this.serviceList=[],this.selectAmount=0,this.conceptType="",this.aliasService="",this.selectConcept="",this.referenceType="",this.selectedOrigin=[],this.selectedService=[],this.secondChance=!1,this.errorModalCatalog={},this.conceptMaximumLength=0,this.conceptMinimumLength=0,this.editSelectService=!1,this.referenceServiceSaved="",this.referenceMaximumLength=0,this.referenceMinimumLength=0,this._allStepsCollapsed=!1,this.completedStepAmount=!1,this.visibleModalOtpError=!1,this.visibleModalReference=!1,this.visibleModalAllServices=!1,this.visibleModalCaptureLine=!1,this.visibleModalExitProcess=!1,this.visibleModalErrorService=!1,this.visibleModalServiceSearch=!1,this.visibleModalServiceDetail=!1,this.visibleModalIncorrectAmount=!1,this.isSipare=!1,this.billSipare={},this.visibleModalExpiredDate=!1,this.visibleModalCaptureLineSipare=!1,this.visibleModalOutOfTimePay=!1,this.paramsOtpError={}}static get styles(){return[vr,y.dark,N.dark,b("bbva-bill-payments-multi-step-shared-styles")]}_getSelectedService(){if(Array.isArray(this.selectedService)&&this.selectedService.length>0){const[e]=this.selectedService;return{...e,logo:{url:e.logo&&e.logo.url||""},name:e.name||""}}return{logo:{url:""},name:""}}get _summaryButton(){return h`
      <div class="panel-summary">
        <bbva-text
          class="summary-amount-text"
          alignment="center"
          tag="span"
          text="${this.t("bill-payments-import-to-pay-title")}"
        ></bbva-text>
        <div class="amount-sumarry">
          <bbva-amount
            variant="4xl"
            amount=${this.selectAmount}
            currency-code="${this.currencyCode}"
            local-currency="${this.localCurrency}"
          >
          </bbva-amount>
        </div>
        <bbva-text
          class="text-commission"
          tag="span"
          alignment="center"
          font-style="italic"
          text="${this.t("bill-payments-title-of-the-commission")}"
        ></bbva-text>
        <div class="button-continue">
          <bbva-button-default
            variant="primary"
            @click="${this.dataInfo}"
            text="${this.t("bill-payments-label-continue")}"
          >
          </bbva-button-default>
        </div>
      </div>
    `}get contentAgreement(){var e;return h`
      <div class="content-agreement" ?hidden="${this.isTaxes}">
        <bbva-text
          tag="span"
          text="${this.t("bill-payments-title-num-agreement")}"
        ></bbva-text>
        <bbva-text
          tag="span"
          text="${p(null===(e=this.selectedService.find((e=>e.id)))||void 0===e?void 0:e.id)}"
        ></bbva-text>
      </div>
      <div class="content-reference">
          <bbva-text
            tag="span"
            text="${this.isTaxes?this.t("bill-payments-title-capture-line"):this.t("bill-payments-title-reference")}"
          ></bbva-text>
          <bbva-text
            tag="span"
            text="${p(this.referenceServiceSaved)}"
          ></bbva-text>
        </div>
    `}get contentSummary(){return h`
      <div class="content-summary">
        <bbva-text
          tag="span"
          text="${this.t(this.billSipare.patronalRegisterText)}"
        ></bbva-text>
        <bbva-text
          tag="span"
          text="${p(this.billSipare.patronalRegisterValue)}"
        ></bbva-text>
      </div>
      <div class="content-summary">
        <bbva-text
          tag="span"
          text="${this.t(this.billSipare.suaCodeText)}"
        ></bbva-text>
        <bbva-text
          tag="span"
          text="${p(this.billSipare.suaCodeValue)}"
        ></bbva-text>
      </div>
      <div class="content-summary">
        <bbva-text
          tag="span"
          text="${this.t(this.billSipare.periodText)}"
        ></bbva-text>
        <bbva-text
          tag="span"
          text="${p(this.billSipare.periodValue)}"
        ></bbva-text>
      </div>
      <div class="content-summary">
        <bbva-text
          tag="span"
          text="${this.t("bill-payments-title-capture-line")}"
        ></bbva-text>
        <bbva-text
          class="line-capture"
          tag="span"
          text="${p(this.referenceServiceSaved)}"
        ></bbva-text>
      </div>
    `}get summarySelectService(){var e;return h`
      <div class="content-clip-list-summary">
        <div class="content-flex">
          <div class="image">
            <bbva-clip-box
              data-tag-name="bbva-clip-box"
              image="${p(this._getSelectedService().logo.url)}"
              text="${p(this._getSelectedService().name)}"
              bg-color="#1973B8"
              size="large"
            >
            </bbva-clip-box>
          </div>
          <div class="main-content">
            <bbva-text
              class="${this.isSipare?"content-summary-title":""} heading"
              tag="span"
              text="${p(null===(e=this.selectedService.find((e=>e.name)))||void 0===e?void 0:e.name)}"
            ></bbva-text>
            <bbva-text
              tag="span"
              class="bbva-text-description"
              text="${p(this.aliasService)}"
            ></bbva-text>
          </div>
        </div>
        ${this.isSipare?h`
           ${this.contentSummary}
        `:h`
          ${this.contentAgreement}
        `}
      </div>
    `}get summarySelectAmount(){return h`
      <bbva-text
        class="amount-title-summary"
        tag="span"
        text="${this.t("bill-payments-import-label")}"
      ></bbva-text>
      <bbva-amount
        class="content-flex summary-amount"
        type="amount"
        variant="l"
        amount="${this.selectAmount}"
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
      >
      </bbva-amount>
    `}get summarySelectOrigin(){var e;return"CREDIT_CARD"===(null===(e=this.selectedOrigin[0])||void 0===e?void 0:e.subProductType)?h`
        <bill-payments-origin-cards
          varian="summary"
          .setMaxResult=${this.selectedOrigin.length}
          .listCard=${this.selectedOrigin}
          .currencyCode="${this.currencyCode}"
          .localCurrency="${this.localCurrency}"
        ></bill-payments-origin-cards>
      `:h`
      <bill-payments-origin-accounts
        varian="summary"
        .setMaxResult=${this.selectedOrigin.length}
        .listAccount=${this.selectedOrigin}
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
      ></bill-payments-origin-accounts>
    `}render(){return h`
      <bbva-header-main
        id="headerMultistep"
        variant="modal"
        text="${this.t("bill-payments-title-header")}"
        icon-right-primary="${X()}"
        ?hidden="${!this.billPaymentHeaderMultiStepVisible&&this.isNativeIos}"
        @header-main-icon-right-primary-click="${()=>{this.visibleModalExitProcess=!0}}"
        accessibility-text-icon-right-primary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-primary")}"
      >
      </bbva-header-main>
      <bbva-expandable-multistep
        id="billPaymentsMultistep"
        has-animation
        class="scrollable"
        hide-disabled-steps="true"
        has-confirm-animation=""
        step-selector="[data-tag-name=bbva-expandable-step]"
        @expandable-multistep-all-complete=${e=>{this._allStepsCollapsed=e.detail}}
      >
        <div slot="content">
          <bbva-expandable-step
            id="selectServiceStep"
            class="stepMultiStep"
            step="1"
            total-steps="4"
            hide-padding-top
            edit-label="${this.isSipare?this.t("bill-payments-label-modify"):this.t("bill-payments-label-edit")}"
            header="${this.t("bill-payments-title-step-one-pay")}"
          >
            <div class="content">
              <bbva-feature-bill-payments-select-service
                .serviceList="${this.serviceList}"
                .savedList="${this.savedList}"
                .filterList="${this.filterList}"
                .isSaved="${this.isSaved}"
                .barCode="${this.barCode}"
                .referenceMaximumLength="${this.referenceMaximumLength}"
                .referenceMinimumLength="${this.referenceMinimumLength}"
                .referenceServiceSaved="${this.referenceServiceSaved}"
                .aliasService="${this.aliasService}"
                .referenceType="${this.referenceType}"
                .visibleModalServiceDetail="${this.visibleModalServiceDetail}"
                .visibleModalServiceSearch="${this.visibleModalServiceSearch}"
                .visibleModalAllServices="${this.visibleModalAllServices}"
                .selectedService="${this.selectedService}"
                .errorModalCatalog="${this.errorModalCatalog}"
                .visibleModalErrorService="${this.visibleModalErrorService}"
                .visibleModalBarCode="${this.visibleModalBarCode}"
                .visibleModalOutOfTime="${this.visibleModalOutOfTime}"
                .editSelectService="${this.editSelectService}"
                .isTaxes="${this.isTaxes}"
                .isSipare="${this.isSipare}"
                @feature-bill-payments-select-service-choose-another-service=${this.reset}
              >
              </bbva-feature-bill-payments-select-service>
            </div>
            <div class="summary" slot="summary" ambient="dark">
              ${this.summarySelectService}
            </div>
          </bbva-expandable-step>
          <bbva-expandable-step
            id="selectAmountStep"
            class="stepMultiStep"
            step="2"
            ?completed="${this.completedStepAmount}"
            hide-padding-top
            total-steps="4"
            header="${this.t("bill-payments-import-label")}"
            edit-label="${this.isSipare?this.t("bill-payments-label-consult"):this.t("bill-payments-label-edit")}"
          >
            <div class="content">
              <bbva-feature-bill-payments-amount
                .selectAmount="${this.selectAmount}"
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .isSipare="${this.isSipare}"
              >
              </bbva-feature-bill-payments-amount>
            </div>
            <div class="summary" slot="summary" ambient="dark">
              ${this.summarySelectAmount}
            </div>
          </bbva-expandable-step>
          <bbva-expandable-step
            id="selectOriginStep"
            class="stepMultiStep"
            step="3"
            total-steps="4"
            hide-padding-top
            header="${this.isSipare?this.t("bill-payments-title-step-three-origin-sipare"):this.t("bill-payments-title-step-three-origin")}"
            edit-label="${this.isSipare?this.t("bill-payments-label-modify"):this.t("bill-payments-label-edit")}"
          >
            <div class="content">
              <bbva-feature-bill-payments-origin
                .selectAmount=${this.selectAmount}
                .listAccount=${this.listAccount}
                .selectedService=${this.selectedService}
                .listCard=${this.listCard}
                .isTaxes=${this.isTaxes}
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .isSipare="${this.isSipare}"
              ></bbva-feature-bill-payments-origin>
            </div>
            <div class="summary" slot="summary" ambient="dark">
              ${this.summarySelectOrigin}
            </div>
          </bbva-expandable-step>
          <bbva-expandable-step
            id="selectConcepStep"
            class="stepMultiStep"
            step="4"
            total-steps="4"
            hide-padding-top
            header="${this.t("bill-payments-title-step-four-concept")}"
            edit-label="${this.isSipare?this.t("bill-payments-label-modify"):this.t("bill-payments-label-edit")}"
          >
            <div class="content">
              <bbva-feature-bill-payments-concept
                .selectConcept=${this.selectConcept}
                .conceptMaximumLength="${this.conceptMaximumLength}"
                .conceptMinimumLength="${this.conceptMinimumLength}"
                .conceptType="${this.conceptType}"
                .isTaxes="${this.isTaxes}"
                .isSipare="${this.isSipare}"
              ></bbva-feature-bill-payments-concept>
            </div>
            <div class="summary" slot="summary" ambient="dark">
              <bbva-text
                class="summary-concept-title"
                tag="span"
                text="${this.selectConcept?this.selectConcept:this.t("bill-payments-text-without-concept")}">
              </bbva-text>
            </div>
          </bbva-expandable-step>
        </div>
        <div class="confirm-step" slot="confirmation">
          ${this._summaryButton}
        </div>
      </bbva-expandable-multistep>
      ${this._showModalCaptureLineError(this.errorModalCatalog.CAPTURE_LINE_ERROR)}
      ${this._showModalIncorrectAmountError(this.errorModalCatalog.INCORRECT_AMOUNT)}
      ${this._showModalServiceAndTaxError(this.errorModalCatalog.SERVICE_AND_TAX_REFERENCE_ERROR)}
      ${this._showModalOtpError(this.errorModalCatalog.OTP_ERROR)}
      ${this._showModalExitProcess(this.errorModalCatalog.EXIT_PROCESS)}
      ${this._showModalCaptureExpiredDate(this.errorModalCatalog.CAPTURE_EXPIRED_DATE)}
      ${this._showModalCaptureLineErrorSipare(this.errorModalCatalog.CAPTURE_LINE_SIPARE)}
      ${this._showModalOutOfTimeError(this.errorModalCatalog.OUT_OF_TIME)}
    `}_showModalCaptureLineError(e){const t={headerText:this.isSipare?this.t("bill-payments-error-header-sipare"):this.t("bill-payments-error-header"),titleText:this.t("bill-payments-error-title-capture-line"),bodyText:this.isSipare?this.t("bill-payments-error-body-capture-line-sipare"):this.t("bill-payments-error-body-capture-line"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="captureLineError"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleModalCaptureLine}"
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalCaptureLineErrorSipare(e){const t={headerText:this.t("bill-payments-error-header-sipare"),titleText:this.t("bill-payments-error-title-capture-line"),bodyText:this.t("bill-payments-error-body-invalid-capture-sipare"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="captureLineSipareError"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleModalCaptureLineSipare}"
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalOutOfTimeError(e){const t={headerText:this.t("bill-payments-error-header-sipare"),titleText:this.t("bill-payments-error-title-out-of-time"),bodyText:this.t("bill-payments-error-body-out-of-time-sipare"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="outOfTimeSipareError"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleModalOutOfTimePay}"
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalCaptureExpiredDate(e){const t={headerText:this.t("bill-payments-error-header"),titleText:this.t("bill-payments-error-title-capture-line"),bodyText:"dateExpiredSipareError"===e?this.t("bill-payments-error-body-capture-line-sipare-date"):this.t("bill-payments-error-body-capture-line-sipare-date-second"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="dateExpiredSipareError"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleModalExpiredDate}"
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalIncorrectAmountError(e){const t={headerText:this.t("bill-payments-error-header"),titleText:this.t("bill-payments-error-title-incorrect-amount"),bodyText:this.t("bill-payments-error-body-incorrect-amount"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="incorrectAmountError"
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalIncorrectAmount}
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalServiceAndTaxError(e){const t={headerText:this.t("bill-payments-error-header"),titleText:this.t("bill-payments-error-title-invalid-reference"),bodyText:this.isTaxes?this.t("bill-payments-error-body-invalid-capture"):this.t("bill-payments-error-body-invalid-reference"),buttonText:this.t("bill-payments-error-button-return-summary"),linkText:this.t("bill-payments-error-button-exit")};return h`
      <bbva-modal-error-bill-payments
        id="serviceAndTaxError"
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalReference}
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-link-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalOtpError(e){return h`
      <bbva-modal-error-bill-payments
        id="modalOtpError"
        .errorModalId=${e}
        .errorModalParams=${this.paramsOtpError}
        .visibleModal=${this.visibleModalOtpError}
        @error-modal-header-right-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-button-click="${()=>It(this,Ot,e)}"
        @error-modal-footer-link-click="${()=>It(this,Ot,e)}"
      >
      </bbva-modal-error-bill-payments>
    `}_tryOtp(e){It(this,Ot,e),this.secondChance=!0,this.dataInfo()}_showModalExitProcess(e){const t={bodyText:this.t("bill-payments-modal-body"),buttonText:this.t("bill-payments-error-button-exit"),linkText:this.t("bill-payments-modal-button")};return h`
      <bbva-modal-error-bill-payments
        id="exitProccess"
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalExitProcess}
        @error-modal-footer-button-click="${()=>{this.visibleModalExitProcess=!1,It(this,Bt)}}"
        @error-modal-footer-link-click="${()=>{this.visibleModalExitProcess=!1}}"
        @error-modal-veil-click="${()=>{this.visibleModalExitProcess=!1}}"
      >
      </bbva-modal-error-bill-payments>
    `}dataInfo(){const e={agreementNumber:this.selectedService[0].id,references:this.referenceServiceSaved,operationType:"",origin:this.selectedOrigin,concept:this.selectConcept,guideCie:"",folio:"",operationNumber:"",nameService:this.selectedService[0].name};this.dispatchEvent(new CustomEvent(Yt,{bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("feature-bill-payments-set-information",{detail:e,bubbles:!0,composed:!0}))}}customElements.define(ur.is,ur);var gr=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-panel-process-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}
:host .distanceIcon {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
:host [data-tag-name=bbva-panel-process] {
  background-color: var(--colorsTertiaryType6Dark, ${i(u.tertiaryType6Dark)});
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}

.verdeLista {
  background-color: var(--colorsTertiaryType6Dark, ${i(u.tertiaryType6Dark)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${i(u.primaryCoreLightened)});
}

.distanceOperation {
  padding-bottom: calc(((4.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.distanceMask {
  padding: 0rem;
}

.paddingList {
  display: contents;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: rem(0px);
}

[data-tag-name=bbva-list-simple] {
  --bbva-list-simple-dark-mode-label-color: "";
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

.content-flex {
  display: flex;
}

.btn-new-service {
  align-items: center;
}

.bbva-icon-btn-primary {
  color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  margin-right: 0.5rem;
}

.content-link {
  align-items: center;
  justify-content: space-between;
  margin-top: 2rem;
  margin-bottom: 0.5rem;
}

.text-num-agreement {
  color: var(--colorsSecondary600, ${i(u.secondary600)});
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.number-of-agreement {
  color: var(--colorsSecondary600, ${i(u.secondary600)});
  text-align: right;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.main-content {
  display: flex;
  flex-flow: column;
  align-self: center;
}

.bbva-text-stored-title {
  --bbva-text-font-weight: 500;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  line-height: 1.5rem;
  text-transform: uppercase;
}

.panel-info {
  margin-top: 1rem;
}

.title-empty-result {
  margin-top: 1rem;
  margin-bottom: 0.5rem;
  text-align: center;
  font-size: 1.125rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  line-height: 1.5rem;
}

.content-empty-result {
  text-align: center;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.heading {
  color: var(--colorsPrimaryMedium, ${i(u.primaryMedium)});
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  line-height: 1.5rem;
}

.bbva-text-description {
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
  line-height: 1.5rem;
}

.image {
  margin-right: calc(1 * var(--gridSpacerVariant, var(--gridSpacer, 8)) / 16 * 1rem);
}

.content-reference {
  padding-top: 1rem;
  padding-bottom: 0.5rem;
  align-items: center;
  justify-content: space-between;
}

.content-clip-list {
  padding-top: 1rem;
}

.panel-content-image {
  text-align: center;
}

.panel-content {
  margin-top: 1rem;
}

.help-modal {
  --bbva-help-modal-padding: 0rem 1rem;
}

.notification-margin {
  margin-top: 1rem;
}

bbva-form-input, bbva-form-predictive {
  text-align: left;
}

.button-continue {
  display: flex;
  justify-content: center;
  margin-top: 1.5rem;
}

.button-exit {
  display: flex;
  justify-content: center;
  margin-top: 1.5rem;
  margin-bottom: 1.5rem;
}

.button-continue-amount {
  display: flex;
  justify-content: center;
  margin-top: 2rem;
}

.row {
  justify-content: space-between;
}

.text-choose-medium {
  margin-bottom: 0.5rem;
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight20, ${i(O.fontWeight20)});
}

.text-credit-card,
.text-account {
  margin-top: 1rem;
  color: var(--colorsSecondary500, ${i(u.secondary500)});
  font-size: 0.875rem;
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
}

.search-form {
  padding-bottom: 0.5rem;
}

.title-modal-search {
  font-size: 1rem;
  font-style: var(--fontStyleOptionsFontStyle10, ${i(P.fontStyle10)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${i(O.fontWeight40)});
  line-height: 1.5rem;
  text-transform: uppercase;
  padding-bottom: 0.5rem;
}

#aliasService {
  margin-top: 1.5rem;
}

.button-save-favourite {
  padding-top: 1.5rem;
}

.capture-line-content {
  display: flex;
  justify-content: space-between;
  padding: 0 1rem;
}

.capture-line {
  word-wrap: break-word;
  width: 70%;
}

.text-description {
  margin: 0;
  padding-top: 1rem;
  font-weight: bold;
}
`;class yr extends(Qe(l)){static get is(){return"bbva-modal-show-save-service"}static get scopedElements(){return{"bbva-text":w,"bbva-divider":Lt,"bbva-clip-box":V,"bbva-help-modal":c}}static get properties(){return{savedList:{type:Array},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"}}}constructor(){super(),this.savedList=[],this.iOSFixedHeader=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-shared-styles")]}render(){return h`
      <bbva-help-modal
        id="modalServiceSave"
        class="help-modal"
        hide-content-padding-top
        visible="true"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t("bill-payments-search-service-title-header")}"
      >
        <div class="main" slot="slot-content">
          <bbva-text
            font-weight="500"
            tag="span"
            text=${this.t("bill-payments-search-service-fast-access")}
          >
          </bbva-text>
          <div class="content-result-search"></div>
        </div>
      </bbva-help-modal>
    `}}customElements.define(yr.is,yr);class fr extends(Be(Ce(s(l)))){static get is(){return"bbva-feature-bill-payments-generate-receipt"}static get scopedElements(){return{}}static get properties(){return{templateReceipt:{type:Object},receipt:{type:String},sharedReceiptStyles:{type:Object},customHeight:{type:Object},headerImage:{type:String},infoImage:{type:String}}}constructor(){super(),this.reset()}reset(){this.receipt="",this.templateReceipt={},this.sharedReceiptStyles={},this.customHeight={},this.headerImage="./images/core-blue.svg",this.infoImage="./images/Info.svg"}generateReceipt(){this.setSharedReceiptStyles();const e=this._getCapturableContent(this.templateReceipt);document.body.appendChild(e),this.captureHTML(e)}captureHTML(e){Ke(e,{logging:!1,ignoreElements:this._ignoreElement,...this.customHeight}).then((e=>{const t=e.toDataURL("image/jpeg");this.receipt=t.split("base64,").pop(),this._dispatchReceipt()})).catch((e=>{console.log("ERROR CATCH"),console.log(e)}))}_ignoreElement(e){const t=e&&e.tagName||"";return!["BODY","DIV","IMG","H1","H2","DD","DL","DT","P"].includes(t)}_getCapturableContent(e){const t=this.getShareReceiptContainer(e.title);if(e.sections.forEach(((i,a)=>{const r=this.getReceiptSection(i),o=a===e.sections.length-1;0===r.lastChild.childElementCount?t.lastElementChild.style.borderBottom=o?"":t.lastElementChild.style.borderBottom:(t.appendChild(r),r.style.borderBottom=o?"":r.style.borderBottom,o&&r.appendChild(this.getStyledTextTag("br")))})),e.messagesInfo){const i=this._getContainerInfo(e.messagesInfo);t.appendChild(i),t.appendChild(this.getStyledTextTag("p",this.sharedReceiptStyles.space))}return t}setSharedReceiptStyles(){const e="line-height",t="font-size",i="1.6",a="var(--cells-text-size-15, 15px)",r={headerImage:{padding:"8px 0 24px"},receipt:{width:"320px",position:"absolute",top:"-1000px",padding:"16px","font-family":"Helvetica"},receiptHeader:{width:"100%"},fieldTitleCenter:{height:this.fieldLineHeight,[t]:a,[e]:i,color:"var(--bbva-500, #666666)","text-align":"center","margin-top":"8px"},receiptTitle:{[t]:a,"font-weight":"var(--cells-fontDefaultMedium, 500)",[e]:i,color:"var(--bbva-600, #121212)"},section:{"border-bottom":"1px solid #d3d3d3"},sectionTitle:{height:this.fieldLineHeight,[t]:"var(--cells-text-size-14, 14px)","font-weight":"var(--cells-fontDefaultMedium, 500)",[e]:"1.71",color:"var(--bbva-500, #666666)"},field:{},fieldTitle:{height:this.fieldLineHeight,[t]:a,[e]:i,color:"var(--bbva-500, #666666)","margin-top":"16px"},fieldValue:{height:this.fieldLineHeight,"font-size":a,color:"var(--bbva-600, #121212)",[e]:i,margin:"0"},fieldValueAccount:{height:this.fieldLineHeight,"font-size":a,"font-style":"italic",color:"var(--bbva-600, #121212)",[e]:i,margin:"0"},subFieldValue:{"border-bottom":"1px solid #d3d3d3","margin-left":"0px","margin-top":"2px",width:"40px"},info:{padding:"20px","margin-top":"8px","margin-right":"8px","background-color":"var(--bbva-white-light-blue, #d4edfc)"},infoIcon:{display:"block","margin-left":"auto","margin-right":"auto"},infoMessage:{"padding-bottom":"8px","font-size":"var(--cells-text-size-15, 15px)",color:"var(--bbva-600, #121212)","text-align":"center",[e]:i},space:{"padding-bottom":"10px"}};Object.keys(this.sharedReceiptStyles||{}).forEach((e=>{r.hasOwnProperty(e)&&Object.assign(r[e],this.sharedReceiptStyles[e])})),this.sharedReceiptStyles=r}_getContainerInfo(e){const t=this.getStyledTag("div",this.sharedReceiptStyles.info),i=this.getStyledTag("img",this.sharedReceiptStyles.infoIcon);return i.src=this.infoImage,t.appendChild(i),e.forEach((e=>{this._addInfoField(e,t)})),t}_addInfoField(e,t){const i=this._getFieldValue(e);"bold"===e.style?t.appendChild(this.getStyledTextTag("h1",this.sharedReceiptStyles.infoMessage,i)):t.appendChild(this.getStyledTextTag("p",this.sharedReceiptStyles.infoMessage,i))}getresult(e){return e&&e.replace(/]/g,"").split(/[.[]/g).reduce(((e,t)=>Array.isArray(e)&&isNaN(t)?this._findArraySubPath(e,t):e&&e[t]),this.result)}addSectionFields(e,t){const i=this.getStyledTag("dl",this.sharedReceiptStyles.field);e.forEach((e=>{if(this.addReceiptField(e,i),e.messagesInfo){const t=this._getContainerInfo(e.messagesInfo);i.appendChild(t)}})),t.appendChild(i)}addReceiptField(e,t){const i=e.title||this.getresult(e.titlePath),a=this._getFieldValue(e),r=this._hideEmptyHour(a,e);this.getTitleCenter(i,a,e,t),a&&i&&"MultiLine"===e.formatAs?this._appendMultipleLines(i,a,e,t):a&&i&&!r?(t.appendChild(this.getStyledTextTag("dt",this.sharedReceiptStyles.fieldTitle,i)),this._selectTheFontStyle(e,a,i,t)):a&&"Array"===e.formatAs&&e.fields&&this._formatAsArray(a,e,t)}_formatAsArray(e,t,i){if(i){const a=e.length-1;let r;e.map(((e,o)=>{t.fields.map((e=>{r=this.getresult(`${t.result}.${o}${e.result}`),r&&(i.appendChild(this.getStyledTextTag("dt",this.sharedReceiptStyles.fieldTitle,e.title)),i.appendChild(this.getStyledTextTag("dd",this.sharedReceiptStyles.fieldValue,r)))})),o<a&&!t.hideDivider&&i.appendChild(this.getStyledTextTag("dd",this.sharedReceiptStyles.subFieldValue,""))}))}return e}_selectTheFontStyle(e,t,i,a){const r={...this.sharedReceiptStyles.fieldValue};return void 0===e.style?a.appendChild(this.getStyledTextTag("dd",this.sharedReceiptStyles.fieldValue,t)):(e.style.toLowerCase().includes("italic")&&(r["font-style"]="italic"),e.style.toLowerCase().includes("bold")&&(r["font-weight"]="bold"),e.style.toLowerCase().includes("center")&&(r["text-align"]="center"),a.appendChild(this.getStyledTextTag("dd",r,t)))}_appendMultipleLines(e,t,i,a){a&&(a.appendChild(this.getStyledTextTag("dt",this.sharedReceiptStyles.fieldTitle,e)),t.forEach((e=>{a.appendChild(this.getStyledTextTag("dd",this.sharedReceiptStyles.fieldValue,e))})))}getTitleCenter(e,t,i,a){void 0!==i.titleCenter&&(a.appendChild(this.getStyledTextTag("dt",this.sharedReceiptStyles.fieldTitleCenter,i.titleCenter)),this._selectTheFontStyle(i,t,e,a))}_hideEmptyHour(e,t){return"Hour"===t.formatAs&&this.hideEmptyHour&&e===this.emptyHourValue}_getFieldValue(e){return e.result||{}}getShareReceiptContainer(e){const t=this.getStyledTag("div",this.sharedReceiptStyles.receipt),i=this.getStyledTag("img",this.sharedReceiptStyles.headerImage);return i.src=this.headerImage,t.appendChild(i),t.appendChild(this.getStyledTextTag("h1",this.sharedReceiptStyles.receiptTitle,e)),t}getStyledTextTag(e,t,i){const a=i?this.t(String(i),"").trim():"",r=this.getStyledTag(e,t,Math.ceil(a.length/this.maxLineWidth));return this.appendTextNode(a,r),r}appendTextNode(e,t){t.appendChild(document.createTextNode(e))}getStyledTag(e,t,i=1){const a=document.createElement(e);return t&&this.applyStyles(t,a,i),a}applyStyles(e,t,i=1){Object.keys(e).forEach((a=>{t.style[a]="height"===a?i*e[a]+"px":e[a]}))}getReceiptSection(e){const t=this.getStyledTag("div",e&&e.styles&&Object.keys(e.styles).length?e.styles:this.sharedReceiptStyles.section);return t.appendChild(this.getStyledTextTag("h2",this.sharedReceiptStyles.sectionTitle,e.title)),this.addSectionFields(e.fields,t),t}_dispatchReceipt(){this._dispatchCustomEvent("receipt-captured",{receipt:this.receipt,id:"shareReceipt",payload:{}})}}customElements.define(fr.is,fr);class Sr extends(Be(Ce(s(l)))){static get is(){return"bbva-feature-bill-payments-ticket"}static get scopedElements(){return{"bbva-text":w,"bbva-divider":Lt,"bbva-clip-box":V,"bbva-button-row":Ae,"bbva-help-modal":c,"bbva-form-input":Ka,"bbva-list-simple":xt,"bbva-header-main":Xe,"bbva-panel-process":Le,"bbva-button-default":n,"bbva-panel-operation":ot,"bbva-header-category":we,"bbva-notification-toast":Ie,"bbva-notification-message":Se,"bbva-transition-container":Re,"bbva-modal-show-save-service":yr,"bbva-nativeconnector-bbva-qr":Ue,"bbva-modal-error-bill-payments":Ya,"bbva-feature-bill-payments-generate-receipt":fr}}static get properties(){return{itemValues:{type:Object,attribute:"item-values"},optionAction:{type:Array},_serviceModalSave:{type:Boolean},infoIcon:{type:Array},reference:{type:Boolean},activeButtonModal:{type:Boolean},dataResponse:{type:Object},activeEditAlias:{type:Boolean},customerContact:{type:String},avatarText:{type:Array},options:{type:Object},localLanguage:{type:String},savedList:{type:Object},invalidAlias:{type:Boolean},invalidReference:{type:Boolean},aliasValue:{type:String},visibleErrorDuplicateAlias:{type:Boolean},visibleErrorModalBarCode:{type:Boolean},errorScannerCodes:{type:Array},visibleErrorModalSaveFavourite:{type:Boolean},errorModalCatalog:{type:Object},isTaxes:{type:Boolean},secondChance:{type:Boolean},saveServiceParams:{type:Object},statusSuccesSave:{type:Boolean},isWeekend:{type:Boolean},isScheduled:{type:Boolean},scheduledServiceSelected:{type:Object},isSipare:{type:Boolean,attribute:"is-sipare"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},visibleErrorModalDuplicateReference:{type:Boolean,attribute:"visible-error-modal-duplicate-reference"}}}constructor(){super(),this.utc=!1,this.options={},this.infoIcon=[],this.savedList=[],this.itemValues={},this.avatarText=[],this.aliasValue="",this.isTaxes=!1,this.isWeekend=!1,this.dataResponse={},this.reference=!1,this.localLanguage="",this.isScheduled=!1,this.customerContact="",this.secondChance=!1,this.invalidAlias=!1,this.errorScannerCodes=[],this.saveServiceParams={},this.errorModalCatalog={},this.activeEditAlias=!1,this.invalidReference=!1,this.statusSuccesSave=!1,this._serviceModalSave=!1,this.activeButtonModal=!1,this.scheduledServiceSelected={},this.visibleErrorModalBarCode=!1,this.visibleErrorDuplicateAlias=!1,this.visibleErrorModalSaveFavourite=!1,this.isSipare=!1,this.iOSFixedHeader=!1,this.visibleErrorModalDuplicateReference=!1}reset(){this.utc=!1,this.options={},this.infoIcon=[],this.savedList=[],this.itemValues={},this.avatarText=[],this.aliasValue="",this.isTaxes=!1,this.isWeekend=!1,this.dataResponse={},this.reference=!1,this.localLanguage="",this.secondChance=!1,this.invalidAlias=!1,this.errorScannerCodes=[],this.saveServiceParams={},this.errorModalCatalog={},this.activeEditAlias=!1,this.invalidReference=!1,this.statusSuccesSave=!1,this._serviceModalSave=!1,this.activeButtonModal=!1,this.isScheduled=!1,this.visibleErrorModalBarCode=!1,this.scheduledServiceSelected={},this.visibleErrorDuplicateAlias=!1,this.visibleErrorModalSaveFavourite=!1,this.isSipare=!1,this.iOSFixedHeader=!1,this.visibleErrorModalDuplicateReference=!1}static get styles(){return[gr,b("loan-payment-ticket-shared-styles")]}render(){var e,t,i,a;return h`
      <bbva-feature-bill-payments-generate-receipt
        id="receiptGenerate"
        .sharedReceiptStyles="${{receiptTitle:{color:"#121212)"},sectionTitle:{color:"#666;)"},info:{padding:"0px","margin-top":"2px","background-color":"none"},infoIcon:{display:"none"},infoMessage:{"font-weight":"100",margin:"0px","font-size":"var(--cells-text-size-12, 12px)","text-align":"left","background-color":"none",color:"var(--bbva-500, #666666)"}}}"
      >
      </bbva-feature-bill-payments-generate-receipt>
      <bbva-nativeconnector-bbva-qr
        id="scanCode"
        @bbva-qr-plugin-camera-code-success="${this._responseScannerCode}"
        @bbva-qr-plugin-camera-code-error="${this._errorResponseScannerCode}"
      >
      </bbva-nativeconnector-bbva-qr>
      <bbva-header-main
        id="headerTicket"
        text="${this.t("bill-payments-title-header")}"
        variant="process"
        icon-right-primary="${X()}"
        @header-main-icon-right-primary-click="${this.goBack}"
      >
      </bbva-header-main>
      ${this.panelProcess} ${this.panelOperation} ${this._showSecondInfoMessage}
      ${this.isSipare?this.bulletSipare:this.bulletDetail}
      <bbva-notification-message
        ?hidden="${!this.isWeekend}"
        variant="default"
        message="${this.t("bill-payments-service-ticket-title-label-next-day")}"
      >
      </bbva-notification-message>
      <bbva-notification-message variant="default">
        <span>
          ${this.isSipare?this.t("bill-payments-service-ticket-title-email-sipare"):this.t("bill-payments-service-ticket-title-email")}
        </span>
        <p class="text-description">${this._contactShort(this.customerContact)}</p>
      </bbva-notification-message>
      <bbva-button-row
        .options="${this.optionAction}"
        @button-row-item-click="${this.actionClick}"
      >
      </bbva-button-row>
      <div class="button-exit">
        <bbva-button-default
          id="btnExit"
          variant="primary"
          @click="${this.goBack}"
          text="${this.t("bill-payments-exit-title")}"
        >
        </bbva-button-default>
      </div>
      <bbva-notification-toast
        type="success"
        show="${this.statusSuccesSave}"
        auto-hide=""
        fixed-bottom=""
        duration="3000">
        <p>
          ${this.t("bill-payments-service-ticket-title-notification-toast")}
        </p>
      </bbva-notification-toast>
      <bbva-help-modal
        id="modalSaveServiceOnSuccessfull"
        ?visible="${this._serviceModalSave}"
        open="${this._serviceModalSave}"
        class="help-modal"
        hide-content-padding-top
        visible="true"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-close="${this.closeModalSave}"
        header-text="${this.t("bill-payments-service-ticket-header-save-favorite")}"
        link-text="${this.activeEditAlias?"":this.t("bill-payments-title-cancel")}"
      >
        <div class="main" slot="slot-content">
          <div class="content-result">
            <div class="content-clip-list">
              <div class="content-flex">
                <div class="image">
                  <bbva-clip-box
                    data-tag-name="bbva-clip-box"
                    image="${this.itemValues.nameServicePayments}"
                    size="medium"
                  >
                  </bbva-clip-box>
                </div>
                <div class="main-content">
                  <bbva-text
                    tag="span"
                    class="heading"
                    text="${this.itemValues.nameServicePayments}"
                  ></bbva-text>
                </div>
              </div>
            </div>
          </div>
          <div class="content-reference content-flex">
            <bbva-text
              tag="span"
              class="text-num-agreement"
              text="${this.t("bill-payments-ticket-title-num-agreement")}"
            ></bbva-text>
            <bbva-text
              tag="span"
              class="number-of-agreement"
              text="${null===(e=this.itemValues)||void 0===e||null===(t=e.agreementNumberValue)||void 0===t?void 0:t.toString()}"
            ></bbva-text>
          </div>
          <div ?hidden="${!this.activeEditAlias}">
            <bbva-form-input
              id="referencesService"
              type="camera"
              label="${this.t("bill-payments-service-detail-modal-reference")}"
              ?invalid="${!!this.invalidReference}"
              label-out="${this.t("bill-payments-ticket-content-text-information-camera")}"
              info-message="${this.t("bill-payments-service-detail-modal-info-message")}"
              @form-field-input-blur="${this._onRefereneService}"
              @form-field-button-submit="${this._scanCodeService}"
              value="${null===(i=this.itemValues)||void 0===i||null===(a=i.referenceValue)||void 0===a?void 0:a.toString()}"
              @form-input-value-change="${e=>this._onReferenceService(e.detail)}"
              help-icon="${fe()}"
            >
            </bbva-form-input>
          </div>
          <div id="aliasService" ?hidden="${!this.activeEditAlias}">
            <bbva-form-input
              id="aliasServices"
              type="text"
              label="${this.t("bill-payments-ticket-form-label-title")}"
              ?invalid="${!!this.invalidAlias}"
              error-message="${this.t("bill-payments-search-error-message")}"
              info-message="${this.t("bill-payments-ticket-form-info-message")}"
              @form-field-input-clear="${this._clearAlias}"
              @form-input-value-change="${e=>this._onAliasService(e.detail)}"
            >
            </bbva-form-input>
          </div>
          <div ?hidden="${this.activeEditAlias}">
            <bbva-text
              text-color="#666666"
              class="subtitle-alias content-account-title"
              tag="span"
              text="${this.t("bill-payments-ticket-text-aliases-text")}"
            >
            </bbva-text>
            <bbva-text
              class="content-account-title"
              tag="span"
              text="${this.t("bill-payments-ticket-text-pay-reference-SAT")}"
            >
            </bbva-text>
          </div>
          <div class="button-save-favourite">
            <bbva-button-default
              id="modalHelp"
              variant="primary"
              ?disabled="${!!this.activeEditAlias&&!this.activeButtonModal}"
              @click="${this.requestSaveService}"
              text="${this.activeEditAlias?this.t("bill-payments-label-continue"):this.t("bill-payments-ticket-label-save")}"
            >
            </bbva-button-default>
          </div>
        </div>
      </bbva-help-modal>
      ${this._showModalDuplicateAlias(this.errorModalCatalog.DUPLICATE_ALIAS_ERROR)}
      ${this._showModalBarcode(this.errorModalCatalog.BARCODE_ERROR)}
      ${this._showModalSaveFavourite(this.errorModalCatalog.SAVE_FAVOURITE_ERROR)}
      ${this._showModalDuplicateReference(this.errorModalCatalog.SAVE_FAVORITE_ERROR_REFERENCE_DUPLICATE)}
    `}get panelProcess(){var e,t,i,a,r,o,s,l,n,c;return h`
      <bbva-panel-process
        class="distanceOperation"
        bbva-panel-process-bg-color="--colorsTertiaryType6Dark"
        ambient="dark"
        .currencyCode="${null===(e=this.dataResponse)||void 0===e||null===(t=e.bill)||void 0===t||null===(i=t.billAmount)||void 0===i?void 0:i.currency}"
        .localCurrency="${null===(a=this.dataResponse)||void 0===a||null===(r=a.bill)||void 0===r||null===(o=r.billAmount)||void 0===o?void 0:o.currency}"
        language="es-MX"
        .dateFormat="${this.options}"
        heading="${this.t("bill-payments-ticket-title-successful-operation")}"
        .date="${null===(s=this.dataResponse)||void 0===s?void 0:s.creationDate}"
        text="${this.t("bill-payments-ticket-title-amount-paid")}"
        .amount="${null===(l=this.dataResponse)||void 0===l||null===(n=l.bill)||void 0===n||null===(c=n.billAmount)||void 0===c?void 0:c.amount}"
        points-decimals-hidden="${!0}"
        description="${this.t("bill-payments-ticket-title-commission")}"
      >
      </bbva-panel-process>
    `}get bulletDetail(){return h`
      <bbva-list-simple
        id="agreementTicket"
        label="${this.itemValues.agreementNumberText}"
        description-medium
        description="${this.itemValues.agreementNumberValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="referenceTicket"
        label="${this.itemValues.referenceText}"
        description-medium
        description="${this.itemValues.referenceValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="operationTypeTicket"
        label="${this.itemValues.operationTypeText}"
        description-medium
        description="${this.itemValues.operationTypeValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="originTicket"
        label="${this.itemValues.originText}"
        description-medium
        description="${this.itemValues.originValue+this.shortAccount(this.itemValues.accountNumberValue)}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="conceptTicket"
        label="${this.itemValues.descriptionText}"
        description-medium
        description="${this.itemValues.descriptionValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="aliastTicket"
        ?hidden="${!this.itemValues.saveService}"
        label="${this.itemValues.aliasText}"
        description-medium
        description="${this.itemValues.aliasValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="cieTicket"
        label="${this.itemValues.guideText}"
        description-medium
        description="${this.itemValues.guideValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="numFolioTicket"
        label="${this.itemValues.idOperationText}"
        description-medium
        description="${this.itemValues.idOperationValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="operationNumberTicket"
        label="${this.itemValues.operationNumberText}"
        description-medium
        description="${this.itemValues.operationNumberValue}"
      >
      </bbva-list-simple>
    `}get bulletSipare(){return h`
      <bbva-list-simple
        id="operationTypeTicket"
        label="${this.itemValues.operationTypeText}"
        description-medium
        description="${this.itemValues.operationTypeValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="patronalRegister"
        label="${this.itemValues.patronalRegisterText}"
        description-medium
        description="${this.itemValues.patronalRegisterValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="suaCode"
        label="${this.itemValues.suaCodeText}"
        description-medium
        description="${this.itemValues.suaCodeValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="payPeriod"
        label="${this.itemValues.periodText}"
        description-medium
        description="${this.itemValues.periodValue}"
      >
      </bbva-list-simple>
      <div class="capture-line-content">
        <bbva-text
          text="${this.t("bill-payments-agreement-capture-line-title")}"
          size="S"
        ></bbva-text>
        <bbva-text
          class="capture-line"
          font-weight="500"
          alignment="right"
          text="${this.itemValues.referenceValue}"
          size="S"
        ></bbva-text>
      </div>
      <bbva-list-simple
        id="originTicket"
        label="${this.itemValues.originText}"
        description-medium
        description="${this.itemValues.originValue+this.shortAccount(this.itemValues.accountNumberValue)}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="conceptTicket"
        label="${this.itemValues.descriptionText}"
        description-medium
        description="${this.itemValues.descriptionValue}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="operationNumberTicket"
        label="${this.t("bill-payments-agreement-bbva-code-title")}"
        description-medium
        description="${this.dataResponse.id}"
      >
      </bbva-list-simple>
    `}closeModalSave(){this._serviceModalSave=!1}successSaved(){this._serviceModalSave=!1,this.statusSuccesSave=!0;this.shadowRoot.querySelector("#aliasServices").shadowRoot.querySelector("input").value=""}_contactShort(e){const t=null==e?void 0:e.indexOf("@");return`${e}`?`•${null==e?void 0:e.substring(t-3,e.length)}`:""}shortAccount(e){return` •${e?e.substring(e.length-4,e.length):""}`}goBack(){this.reset(),this._fireEvent("exit-dashboard-bill-payments-process"),this._fireEvent("back-step-header-success")}_checkDuplicateAlias(){return this.savedList.some((e=>e.alias===this.aliasValue))}requestSaveService(){this.isTaxes&&(this.aliasValue=`${this.t("bill-payments-alias-prefix")} ${this.itemValues.descriptionValue.split(" ").pop()}`);this._checkDuplicateAlias()?(this._fireEvent("open-control-veil"),setTimeout((()=>{this._fireEvent("close-control-veil"),this.visibleErrorDuplicateAlias=!0}),1e3)):(this.saveServiceParams={alias:this.aliasValue,service:{id:this.itemValues.agreementNumberValue},billNumber:this.itemValues.referenceValue},this._fireEvent("post-service-request",this.saveServiceParams))}_showModalDuplicateAlias(e){const t={headerText:this.t("bill-payments-error-title-duplicate-alias"),titleText:this.t("bill-payments-error-title-duplicate-alias"),bodyText:this.t("bill-payments-error-body-duplicate-alias"),buttonText:this.t("bill-payments-error-button-duplicate-alias"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="successModalError"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleErrorDuplicateAlias}"
        @error-modal-header-right-click="${()=>{this.visibleErrorDuplicateAlias=!1}}"
        @error-modal-footer-button-click="${()=>{this.visibleErrorDuplicateAlias=!1}}"
      >
      </bbva-modal-error-bill-payments>
    `}_showModalBarcode(e){const t={headerText:this.t("bill-payments-error-header-barcode"),titleText:this.t("bill-payments-error-title-barcode"),bodyText:this.t("bill-payments-error-body-barcode"),buttonText:this.t("bill-payments-error-button-barcode"),linkText:this.t("bill-payments-error-button-exit")};return h`
      <bbva-modal-error-bill-payments
        id="errorSuccessModal"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleErrorModalBarCode}"
        @error-modal-header-right-click="${()=>{this.visibleErrorModalBarCode=!1}}"
        @error-modal-footer-button-click="${()=>this._tryAgain(e)}"
        @error-modal-footer-link-click="${()=>{this.visibleErrorModalBarCode=!1}}"
      >
      </bbva-modal-error-bill-payments>
    `}_tryAgain(e){"barcodeError"===e?(this.visibleErrorModalBarCode=!1,this._scanCodeService()):(this.visibleErrorModalSaveFavourite=!1,this.secondChance=!0,this._fireEvent("post-service-request",this.saveServiceParams))}_showModalSaveFavourite(e){const t={headerText:this.t("bill-payments-error-header-save-favorite"),titleText:this.secondChance?this._configParams("title"):this.t("bill-payments-error-title-save-favorite"),bodyText:this.secondChance?this.t("bill-payments-error-body-save-favorite-two"):this._configParams("body"),buttonText:this.secondChance?this.t("bill-payments-error-button-exit"):this.t("bill-payments-error-button-retry"),linkText:this.secondChance?"":this.t("bill-payments-error-button-exit")};return!0===this.secondChance?h`
        <bbva-modal-error-bill-payments
          id="favoriteModal"
          .errorModalId="${e}"
          .errorModalParams="${t}"
          .visibleModal="${this.visibleErrorModalSaveFavourite}"
          @error-modal-header-right-click="${()=>{this.visibleErrorModalSaveFavourite=!1}}"
          @error-modal-footer-button-click="${()=>{this.visibleErrorModalSaveFavourite=!1}}"
        >
        </bbva-modal-error-bill-payments>
      `:h`
      <bbva-modal-error-bill-payments
        id="modalFavorite"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleErrorModalSaveFavourite}"
        @error-modal-header-right-click="${()=>{this.visibleErrorModalSaveFavourite=!1}}"
        @error-modal-footer-button-click="${()=>this._tryAgain(e)}"
        @error-modal-footer-link-click="${()=>{this.visibleErrorModalSaveFavourite=!1}}"
      >
      </bbva-modal-error-bill-payments>
    `}_configParams(e){if(this.isTaxes){return this.t("bill-payments-error-body-save-favorite-tax")}return"title"===e?this.t("bill-payments-error-title-save-favorite-two"):this.t("bill-payments-error-body-save-favorite")}_showModalDuplicateReference(e){const t={headerText:this.t("bill-payments-error-header-save-favorite"),titleText:this.t("bill-payments-error-title-reference-duplicate"),bodyText:this.t("bill-payments-error-body-reference-duplicate"),buttonText:this.t("bill-payments-error-button-close"),linkText:""};return h`
      <bbva-modal-error-bill-payments
        id="modalFavoriteDuplicateReference"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleErrorModalDuplicateReference}"
        @error-modal-header-right-click="${()=>{this._fireEvent("header-right-click-duplicate-reference")}}"
        @error-modal-footer-button-click="${()=>{this._fireEvent("footer-button-click-duplicate-reference")}}"
      >
      </bbva-modal-error-bill-payments>
    `}setInformation(e,t){var i;this.itemValues=e,this.avatarText[0].text=e.nameServicePayments,this.dataResponse=t,this.isSipare?this.optionAction=[{icon:Pe(),label:"Comprobante de operación",id:"Share"}]:this.itemValues.saveService?this.optionAction=[{icon:Pe(),label:"Compartir",id:"Share"}]:this.optionAction=[{icon:Pe(),label:"Compartir",id:"Share"},{icon:Oe(),label:"Guardar",id:"Save"}],this.isScheduled&&this.optionAction.push({icon:ce(),label:"Programar pagos",id:"Automatic"}),this.isTaxes||(this.activeEditAlias=!0),this.requestUpdate(),this.determineWeekend(null===(i=this.dataResponse)||void 0===i?void 0:i.creationDate)}determineWeekend(e){const t=new Date(e).getDay();this.isWeekend=!(6!==t&&0!==t)}get panelOperation(){return h`
      <bbva-panel-operation
        class-name=""
        clip-user-text="${this.itemValues.nameServicePayments}"
        variant-clip-product=""
        clip-item="card"
        label-left="${this.itemValues.nameServicePayments}"
        .text=""
      >
      </bbva-panel-operation>
    `}_onRefereneService(){this.selectorReferenceService()}_scanCodeService(){this.shadowRoot.getElementById("scanCode").openCameraCodeReader({codeType:"BARCODE"})}_onAliasService(e){this.invalidAlias=/\W/.test(e.value),this.invalidAlias?this.invalidAlias=!0:(this.aliasValue=e.value,this.invalidAlias=!1),this.invalidAlias||0===this.aliasValue.length||this.invalidReference||0===this.itemValues.referenceValue.length?this.activeButtonModal=!1:this.activeButtonModal=!0}_clearAlias(){this.invalidAlias=!1,this.aliasValue="",this.activeButtonModal=!1}_onReferenceService(e){this.invalidReference=/\W/.test(e.value),this.invalidReference?this.invalidReference=!0:(this.itemValues.referenceValue=e.value,this.invalidReference=!1),this.invalidReference||0===this.aliasValue.length||this.invalidAlias||0===this.itemValues.referenceValue.length?this.activeButtonModal=!1:this.activeButtonModal=!0}actionClick(e){"Save"===this.optionAction[e.detail].id?this._showSave():"Share"===this.optionAction[e.detail].id?this.isSipare?this._shareReceiptSipare():this._shareReceipt():"Automatic"===this.optionAction[e.detail].id&&(this._fireEvent("go-to-schedule-payment",this.scheduledServiceSelected),this._fireEvent("feature-bill-payments-reference-value",this.itemValues.referenceValue),this.reset(),this._fireEvent("back-step-header-success"))}_showSave(){this._serviceModalSave=!0}selectorReferenceService(){const{value:e}=this.shadowRoot.querySelector("#referencesService");this.reference=!!e}_shareReceipt(){this.shadowRoot.querySelector("#receiptGenerate").templateReceipt={title:this.t("bill-payments-service-ticket-title-share-receipt"),sections:[{title:this.t("bill-payments-service-ticket-title-operation"),fields:[{title:this.t("bill-payments-service-ticket-title-service"),result:this.itemValues.nameServicePayments,formatAs:"Account",style:"italic"},{title:this.t("bill-payments-title-num-agreement"),result:this.itemValues.agreementNumberValue.toString(),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-detail-modal-reference"),result:this.itemValues.referenceValue.toString(),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-import-label"),result:this.dataResponse.bill.billAmount.amount.toString(),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-ticket-title-commission"),result:this.t("bill-payments-service-ticket-title-commission-result"),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-ticket-title-concept"),result:this.itemValues.descriptionValue.toString(),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-ticket-title-operation-date"),result:this._formatDate(this.dataResponse.creationDate),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-ticket-title-cie-guide"),result:this.itemValues.guideValue.toString(),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-ticket-title-folio"),result:this.itemValues.idOperationValue.toString(),formatAs:"Account",style:"italic"},{title:this.t("bill-payments-service-ticket-operation-number"),result:this.itemValues.operationNumberValue.toString(),formatAs:"Account",style:"italic"},{title:" ",result:"BBVA",formatAs:"Account",style:"italic"}]},{title:this.t("bill-payments-service-ticket-payment-method"),fields:[{title:this.t("bill-payments-service-ticket-origin"),result:this.itemValues.originValue},{title:this.t("bill-payments-service-account-number"),result:this.shortAccount(this.itemValues.accountNumberValue)}]}]},this.shadowRoot.querySelector("#receiptGenerate").generateReceipt()}_shareReceiptSipare(){this.shadowRoot.querySelector("#receiptGenerate").templateReceipt={title:this.t("bill-payments-service-ticket-title-share-receipt-sipare"),sections:[{title:this.t("bill-payments-service-ticket-title-operation-sipare"),fields:[{title:this.t("bill-payments-service-ticket-title-operation-date-sipare"),result:this._formatDate(this.dataResponse.creationDate)},{title:this.t("bill-payments-service-ticket-operation-type-sipare"),result:this.itemValues.operationTypeValue},{title:this.t("bill-payments-import-label"),result:this.dataResponse.bill.billAmount.amount.toLocaleString(this.localLanguage,{style:"currency",currency:this.dataResponse.bill.billAmount.currency})}]},{fields:[{title:this.t("bill-payments-agreement-patronal-register-title"),result:this.itemValues.patronalRegisterValue},{title:this.t("bill-payments-agreement-sua-code-title"),result:this.itemValues.suaCodeValue},{title:this.t("bill-payments-agreement-period-title"),result:this.itemValues.periodValue},{title:this.t("bill-payments-agreement-capture-line-title"),result:[this.itemValues.referenceValue.slice(0,27),this.itemValues.referenceValue.slice(27)],formatAs:"MultiLine"}]},{fields:[{title:this.t("bill-payments-agreement-origin-account-text-title"),result:this.itemValues.originValue+this.shortAccount(this.itemValues.accountNumberValue)},{title:this.t("bill-payments-service-ticket-title-commission"),result:this.t("bill-payments-service-ticket-title-commission-result-sipare")},{title:this.t("bill-payments-service-ticket-title-concept"),result:this.itemValues.descriptionValue},{title:this.t("bill-payments-agreement-bbva-code-title"),result:this.dataResponse.id}]},{fields:[{title:" ",result:this.t("bill-payments-service-ticket-message-sipare")}]}]},this.shadowRoot.querySelector("#receiptGenerate").generateReceipt()}_formatDate(e){return new Date(e).toLocaleTimeString(this.localLanguage,this.options).concat(" h")}_responseScannerCode(e){const t=e.detail.contenScanner.friendlycontent||{};let i=[];[{id:"30",serviceName:"CFE",reference:20},{id:"20",serviceName:"TELMEX",reference:10},{id:"24",serviceName:"TELCEL",reference:16},{id:"04",serviceName:"SAT",reference:20}].map((e=>{e.id!==t.length.toString()||t.startsWith("02")||t.startsWith("04")?(t.startsWith("02")||t.startsWith("04"))&&(i={id:e.id,service:e.serviceName,reference:t.substring(0,20),amount:t.substring(20,t.length)}):i={id:e.id,service:e.serviceName,reference:t.substring(0,e.reference),amount:this.amountAdd(t.substring(e.reference,t.length))}}));this.shadowRoot.querySelector("#referencesService").shadowRoot.querySelector("bbva-form-attach").value=i.reference}_errorResponseScannerCode(e){e.detail.map((e=>{this.errorScannerCodes.includes(e.code)&&(this.visibleErrorModalBarCode=!0)}))}amountAdd(e){let t=0;const i=e.split("");let a="",r=!1;return i.map((()=>{i[t]>0&&!r&&(a=e.substring(t,e.length),r=!0),t+=1})),a}_fireEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(Sr.is,Sr);class $r extends(Be(Ce(s(l)))){static get is(){return"bbva-feature-bill-payments-mx"}static get scopedElements(){return{"bill-payments-api-dm":mt,"bbva-transition-container":Re,"bbva-clip-microillustration":$e,"bbva-bill-payments-multi-step":ur,"bbva-modal-error-bill-payments":Ya,"onboarding-full-screen-carousel":pt,"bbva-feature-bill-payments-ticket":Sr,"bbva-global-service-payments-api-dm":tt,"bbva-global-services-api-dm":it}}static get properties(){return{billPaymentsServicesV1:{type:Object},scheduledServiceSelected:{type:Object},pageSuccessVisible:{type:Boolean,attribute:"page-success-visible"},billPaymentMultiStepVisible:{type:Boolean,attribute:"bill-payment-multi-step-visible"},savedList:{type:Array},selectedService:{type:Array},serviceList:{type:Object},filterList:{type:Array},listAccount:{type:Array},selectedOrigin:{type:Array},listCard:{type:Array},selectAmount:{type:Number,attribute:"select-amount"},selectConcept:{type:String,attribute:"select-concept"},visibleModalServiceSearch:{type:Boolean,attribute:"visible-modal-service-search"},visibleModalAllServices:{type:Boolean,attribute:"visible-modal-all-services"},errorModalCatalog:{type:Object},availableProcess:{type:Boolean,attribute:"available-process"},visibleModalDashboardError:{type:Boolean,attribute:"visible-modal-dashboard-error"},secondChance:{type:Boolean,attribute:"second-chance"},visibleModalErrorService:{type:Boolean,attribute:"visible-modal-error-service"},visibleModalCaptureLine:{type:Boolean,attribute:"visible-modal-capture-line"},flagWrongCaptureLine:{type:Boolean,attribute:"flag-wrong-capture-line"},visibleModalIncorrectAmount:{type:Boolean,attribute:"visible-modal-incorrect-amount"},visibleModalReference:{type:Boolean,attribute:"visible-modal-reference"},visibleModalOtpError:{type:Boolean,attribute:"visible-modal-otp-error"},visibleErrorModalSaveFavourite:{type:Boolean,attribute:"visible-error-modal-save-favourite"},barCode:{type:Boolean,attribute:"bar-code"},visibleModalServiceDetail:{type:Boolean,attribute:"visible-modal-service-detail"},isSaved:{type:Boolean,attribute:"is-saved"},referenceMaximumLength:{type:Number,attribute:"reference-maximum-length"},referenceMinimumLength:{type:Number,attribute:"reference-minimum-length"},referenceType:{type:String,attribute:"reference-type"},aliasService:{type:String,attribute:"alias-service"},referenceServiceSaved:{type:String,attribute:"reference-service-saved"},completedStepAmount:{type:Boolean,attribute:"completed-step-amount"},headers:{type:Object},tsec:{type:String},deviceId:{Type:String,attribute:"device-id"},itemsValues:{type:Object},customerContact:{type:String,attribute:"customer-contact"},isTaxes:{type:Boolean,attribute:"is-taxes"},editSelectService:{type:Boolean,attribute:"edit-select-service"},onboardingCompleted:{type:Boolean,attribute:"onboarding-completed"},itemsOnboarding:{type:Array},conceptMaximumLength:{type:Number,attribute:"concept-maximum-length"},conceptMinimumLength:{type:Number,attribute:"concept-minimum-length"},conceptType:{type:String,attribute:"concept-type"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},localLanguage:{type:String,attribute:"local-language"},optionAction:{type:Array},customerId:{type:String,attribute:"customer-id"},fullNameCustomer:{type:String,attribute:"full-name-customer"},paymentsApiVersion:{type:String,attribute:"payments-api-version"},optionsDate:{type:Object},globalServicesApiVersion:{type:String,attribute:"global-services-api-version"},isScheduled:{type:Boolean},queryScheduledFlag:{type:Boolean,attribute:"query-scheduled-flag"},isBillTaxes:{type:Boolean,attribute:"is-bill-taxes"},isBillPaymentsHome:{type:Array},visibleModalExpiredDate:{type:Boolean,attribute:"visible-modal-expired-date"},visibleModalCaptureLineSipare:{type:Boolean,attribute:"visible-modal-capture-line-sipare"},visibleModalOutOfTimePay:{type:Boolean,attribute:"visible-modal-out-of-time-pay"},isError:{type:Boolean,attribute:"is-error"},visibleModalNoEmailError:{type:Boolean,attribute:"visible-modal-no-email-error"},featureFlagSipare:{type:Boolean,attribute:"feature-flag-sipare"},visibleModalDashboardErrorSipare:{type:Boolean,state:!0},paramsOtpError:{type:Object},txtPaidService:{type:String},txtSuccessfulPayment:{type:String},_isSipare:{type:Boolean,state:!0},_billSipare:{type:Object,state:!0},_taxes:{type:Array,state:!0},_versions:{type:Object,state:!0},_paramsModalSipare:{type:Object,state:!0},phoneAssistanceNumber:{type:String,attribute:"phone-assistance-number"},aricFraudHttpStatus:{type:Number,attribute:"aric-fraud-http-status"},aricFraudErrorCode:{type:String,attribute:"aric-fraud-error-code"},mtuFlag:{type:Object,attribute:"mtu-flag"},visibleErrorModalDuplicateReference:{type:Boolean,attribute:"visible-error-modal-duplicate-reference"},billPaymentHeaderMultiStepVisible:{type:Boolean,attribute:"bill-payment-header-multi-step-visible"},isNativeIos:{type:Boolean,attribute:"is-native-ios"}}}constructor(){super(),this.customerId="",this.fullNameCustomer="",this.paymentsApiVersion="0",this.billPaymentMultiStepVisible=!1,this.savedList=[],this.filterList=[],this.listAccount=[],this.listCard=[],this.visibleModalServiceDetail=!1,this.visibleModalServiceSearch=!1,this.globalServicesApiVersion="1",this.isScheduled=!1,this.isBillPaymentsHome={},this.visibleModalAllServices=!1,this.billPaymentHeaderMultiStepVisible=!1,this.editSelectService=!1,this.onboardingCompleted=!1,this.queryScheduledFlag=!1,this.isBillTaxes=!1,this.itemsOnboarding=[],this.errorModalCatalog={DASHBOARD_ERROR_MODAL:"dashboardError",SERVICE_SEARCH_ERROR:"serviceSearchError",BARCODE_ERROR:"barcodeError",SERVICE_AND_TAX_REFERENCE_ERROR:"serviceAndTaxReferenceError",CAPTURE_LINE_ERROR:"captureLineError",INCORRECT_AMOUNT:"incorrectAmountError",OUT_OF_TIME_ERROR:"outOfTimeError",OTP_ERROR:"otpError",EXIT_PROCESS:"exitProcess",DUPLICATE_ALIAS_ERROR:"duplicateAliasError",SAVE_FAVOURITE_ERROR:"saveFavouriteError",CAPTURE_EXPIRED_DATE:"dateExpiredSipareError",CAPTURE_LINE_SIPARE:"captureLineSipareError",OUT_OF_TIME:"outOfTimeSipareError",NO_EMAIL_ERROR_MODAL:"noEmailSipareError",DASHBOARD_ERROR_MODAL_SIPARE:"dashboardErrorSipare",SAVE_FAVORITE_ERROR_REFERENCE_DUPLICATE:"saveFavoriteErrorReferenceDuplicate"},this.secondChance=!1,this.availableProcess=!1,this.visibleModalDashboardError=!1,this.visibleModalErrorService=!1,this.visibleModalCaptureLine=!1,this.flagWrongCaptureLine=!1,this.visibleModalIncorrectAmount=!1,this.visibleModalReference=!1,this.visibleModalOtpError=!1,this.visibleErrorModalSaveFavourite=!1,this.billPaymentsServicesV1={},this.scheduledServiceSelected={},this.selectedService=[],this.barCode=!1,this.serviceList={},this.isSaved=!1,this.completedStepAmount=!1,this.referenceMaximumLength=0,this.referenceMinimumLength=0,this.referenceType="",this.selectedOrigin=[],this.headers={},this.referenceInfoMessage="",this.selectConcept="",this.selectAmount=0,this.tsec="",this.aliasService="",this.referenceServiceSaved="",this.deviceId="",this.registerDevice={},this.itemsValues={},this.customerContact="",this.isTaxes=!1,this.pageSuccessVisible=!1,this.conceptMaximumLength=0,this.conceptMinimumLength=0,this.conceptType="",this.optionsDate={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"numeric"},this.currencyCode="",this.localCurrency="",this.localLanguage="",this.optionAction=[],this._taxes=[{id:"000844985",name:"SAT",highRanked:!0,logo:{url:"http://archivingbbva.axtel.mx:8082/v2/documents/logo?key=convenio_000035241-PS"},concept:"Pago referenciado SAT",referenceMaximumLength:20,referenceMinimumLength:20},{id:"001137840",name:"CDMX",highRanked:!0,logo:{url:"http://archivingbbva.axtel.mx:8082/v2/documents/logo?key=convenio_000035241-PS"},concept:"Pago referenciado CDMX",referenceMaximumLength:20,referenceMinimumLength:20},{id:"000000028",name:"SIPARE IMSS INFONAVIT",concept:"",referenceMaximumLength:53,referenceMinimumLength:53}],this._isSipare=!1,this._billSipare={},this.visibleModalExpiredDate=!1,this.visibleModalCaptureLineSipare=!1,this.visibleModalOutOfTimePay=!1,this.isError=!1,this.visibleModalNoEmailError=!1,this.featureFlagSipare=!1,this._versions={v0:"0",v1:"1"},this._paramsModalSipare={},this.visibleModalDashboardErrorSipare=!1,this.paramsOtpError={},this.txtPaidService="PAID",this.txtSuccessfulPayment="Se realizo el pago exitoso",this.phoneAssistanceNumber="5552262663",this.aricFraudHttpStatus=403,this.aricFraudErrorCode="604",this.mtuFlag={},this.visibleErrorModalDuplicateReference=!1,this.isNativeIos=!1}static get styles(){return[wt,b("bbva-feature-bill-payments-mx-shared-styles")]}firstUpdated(){this._paymentsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-service-payments-api-dm"]'),this._servicesApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-services-api-dm"]'),this.itemsOnboarding=[{content:this.contentPayForOnboarding},{content:this.contentControlForOnboarding},{content:this.contentChargesForOnboarding}]}get contentPayForOnboarding(){return`\n      <bbva-clip-microillustration\n        style="text-align: center"\n        microillustration="sendmoneyappdollar"\n        size="L">\n      </bbva-clip-microillustration>\n      <bbva-text\n        text="${this.t("bill-payments-onboarding-page-one-title")}"\n        font-weight="500"\n        alignment="center">\n      </bbva-text>\n      <bbva-text\n        tag="span"\n        alignment="center"\n        style="padding: 0rem 1rem"\n        text="${this.t("bill-payments-onboarding-page-one-content")}">\n      </bbva-text>\n    `}get contentControlForOnboarding(){return`\n      <bbva-clip-microillustration\n        style="text-align: center"\n        microillustration="scheduledtransfers"\n        size="L">\n      </bbva-clip-microillustration>\n      <bbva-text\n        text="${this.t("bill-payments-onboarding-page-two-title")}"\n        font-weight="500"\n        alignment="center">\n      </bbva-text>\n      <bbva-text\n        tag="span"\n        alignment="center"\n        style="padding: 0rem 1rem"\n        text="${this.t("bill-payments-onboarding-page-two-content-one")}">\n      </bbva-text><br>\n      <bbva-text\n        tag="span"\n        alignment="center"\n        style="padding: 0rem 1rem"\n        text="${this.t("bill-payments-onboarding-page-two-content-two")}">\n      </bbva-text>\n    `}get contentChargesForOnboarding(){return`\n      <bbva-clip-microillustration\n        style="text-align: center"\n        microillustration="cardhealth"\n        size="L">\n      </bbva-clip-microillustration>\n      <bbva-text\n        text="${this.t("bill-payments-onboarding-page-three-title")}"\n        font-weight="500"\n        alignment="center">\n      </bbva-text>\n      <bbva-text\n        tag="span"\n        alignment="center"\n        style="padding: 0rem 1rem"\n        text="${this.t("bill-payments-onboarding-page-three-content")}">\n      </bbva-text>\n    `}reset(){const{makePayment:e=!1,cancelPayment:t=!1}=this.mtuFlag||{};this._resetApiVesionPayment(e),e||t||(this._resetMultiStep(),this._resetProperties(),this._resetModals())}_resetApiVesionPayment(e){const t=this.shadowRoot.querySelector("#apiService");this._isSipare&&e?t.version=this._versions.v1:t.version=this._versions.v0}_resetMultiStep(){const e=this.shadowRoot.querySelector("#multistepBillPayments").shadowRoot.querySelector("#billPaymentsMultistep").querySelectorAll(".stepMultiStep");e.forEach(((t,i)=>{e[i].completed=!1,e[i].disabled=!0,e[i].active=!1}));const t=e[0];t.disabled=!1,t.active=!0,this.resetAmountStep()}_resetProperties(){this.filterList=[],this.isTaxes=!1,this.barCode=!1,this.isSaved=!1,this.selectAmount=0,this.serviceList={},this.aliasService="",this.selectConcept="",this.selectedOrigin=[],this.selectedOrigin=[],this.secondChance=!1,this.selectedService=[],this.referenceInfoMessage="",this.referenceMaximumLength=0,this.referenceMinimumLength=0,this.referenceServiceSaved="",this.globalServicesApiVersion="1",this.isScheduled=!1,this.flagWrongCaptureLine=!1,this.scheduledServiceSelected={},this.completedStepAmount=!1,this.editSelectService=!1,this.conceptMaximumLength=0,this.conceptMinimumLength=0,this.conceptType="",this.paymentsApiVersion="0",this.optionsDate={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"numeric"},this._taxes=[{id:"000844985",name:"SAT",concept:"Pago referenciado SAT",referenceMaximumLength:20,referenceMinimumLength:20},{id:"001137840",name:"CDMX",concept:"Pago referenciado CDMX",referenceMaximumLength:20,referenceMinimumLength:20},{id:"000000028",name:"SIPARE IMSS INFONAVIT",concept:"",referenceMaximumLength:53,referenceMinimumLength:53}],this._isSipare=!1,this.isError=!1,this.visibleModalNoEmailError=!1,this._versions={v0:"0",v1:"1"},this._paramsModalSipare={},this.visibleModalDashboardErrorSipare=!1,this.paramsOtpError={},this.mtuFlag={}}_resetModals(){this.visibleModalIncorrectAmount=!1,this.visibleModalDashboardError=!1,this.visibleModalServiceDetail=!1,this.visibleModalServiceSearch=!1,this.visibleModalErrorService=!1,this.visibleModalCaptureLine=!1,this.visibleModalAllServices=!1,this.visibleModalReference=!1,this.visibleModalOtpError=!1,this.visibleModalExpiredDate=!1,this.visibleModalCaptureLineSipare=!1,this.visibleModalOutOfTimePay=!1,this.visibleModalNoEmailError=!1,this.visibleErrorModalDuplicateReference=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.onboardingCompleted=!0}customerResponse(e){this.fullNameCustomer=`${null==e?void 0:e.firstName} ${null==e?void 0:e.lastName}`}operationRequestSuccess(){this.isError=!0,this.billPaymentMultiStepVisible=!0}operationRequestError(){this.isError||(this.isError=!0,this.setOperationRegister()),this.billPaymentMultiStepVisible=!0}operationRequestErrorOtp(){this.setOperationRegister()}setOperationRegister(){var e,t,i,a;this.billPaymentMultiStepVisible=!1;const r=new Date,o=`${r.getHours()}${r.getMinutes()}${r.getSeconds()}`,s=moment().format("YYYY-MM-DD"),l=$r.reduceLimitSpace(this.fullNameCustomer,62),n=$r.reduceLimitSpace(null===(e=this.selectedService[0])||void 0===e?void 0:e.name,35),c=$r.reduceLimitSpace(null===(t=this.selectedOrigin[0])||void 0===t||null===(i=t.description)||void 0===i?void 0:i.value,35),d=$r.reduceLimitSpace(null===(a=this.selectedService[0])||void 0===a?void 0:a.id,20),b={customExternalReference:this.customerId,destinationMail:this.customerContact,destinationType:{id:"REGISTERED",name:"REGISTERED"},eventCode:"0000000140",messageBody:`MBANKS10Registro de operación                             #$CUSTOMER$#${l}${n}LMEX                                                              ${c}****MXP 00000000000000000${d}115                 #$FOLIOR$#${s}0${o} BANMOVIL`,templateCode:"KZCA0101"};It(this,"send-response-recover-registry",b)}static reduceLimitSpace(e="",t=0){return e.length>t?e.slice(0,t):e+" ".repeat(t-e.length)}responseStorangeServiceSuccess(){this.shadowRoot.querySelector("#successTicket").successSaved()}_responseSocialContributions({detail:e}){var t;this.billPaymentMultiStepVisible=!0,this._billSipare.patronalRegisterText=this.t("bill-payments-agreement-patronal-register-title"),this._billSipare.patronalRegisterValue=e.employer.registrationNumber,this._billSipare.suaCodeText=this.t("bill-payments-agreement-sua-code-title"),this._billSipare.suaCodeValue=e.operationCode,this._billSipare.periodText=this.t("bill-payments-agreement-period-title"),this._billSipare.periodValue=this._getPeriod(e.paymentPeriods[0].period),this.selectAmount=e.paymentAmounts.totalAmount.amount;const i=this.shadowRoot.querySelector("#multistepBillPayments").shadowRoot.querySelector("bbva-expandable-multistep").querySelector("bbva-expandable-step");i.disabled=!0,i.active=!1,i.completed=!0;const a=null===(t=this.selectedService.find((e=>e.name)))||void 0===t?void 0:t.name.toLowerCase();It(this,ri,{nameService:a,processSaved:"servicio nuevo"})}_responseOrdersServiceSuccess({detail:e}){const t={data:{id:e.id,bill:{billAmount:{amount:this.selectAmount,currency:this.localCurrency}},creationDate:moment().format("YYYY-MM-DDTHH:mm:ss.SSSZ"),service:[this.selectedService[0]],origin:{contractId:this.selectedOrigin[0].id,product:{id:"ACCOUNTS",name:"Accounts"}},description:this.selectConcept}};this.saveResponseData(t)}selectOrigin(e){var t,i;this.selectedOrigin=[e.detail],this.queryScheduledFlag&&this.searchScheduledService();const a=null===(t=this.selectedService[0])||void 0===t||null===(i=t.name)||void 0===i?void 0:i.toLowerCase(),r=this.isSaved?this.t("bill-payments-saved-service-title"):this.t("bill-payments-new-service-title"),o=this.localCurrency,s=this.selectAmount;It(this,oi,{nameService:a,processSaved:r,currency:o,amount:s})}confirmConcept(){var e,t;this.selectConcept=""===this.selectConcept?"Sin concepto":this.selectConcept,this.setOperationRegister();const i={nameService:null===(e=this.selectedService[0])||void 0===e||null===(t=e.name)||void 0===t?void 0:t.toLowerCase(),processSaved:this.isSaved?this.t("bill-payments-saved-service-title"):this.t("bill-payments-new-service-title"),currency:this.localCurrency,amount:this.selectAmount};this._resetModals(),It(this,si,i)}responseStorangeServiceError(){this.visibleErrorModalSaveFavourite=!0}postApiSaveService(e){this.callToApi(e)}callToApi(e){this.shadowRoot.getElementById("apiService").postStorangeService(e)}saveResponseData(e){var t,i;const a=this.shadowRoot.querySelector("#successTicket");this.itemsValues.guideValue=e.data?e.data.trackingReference:e.detail.trackingReference,this.itemsValues.idOperationValue=e.data?e.data.id:e.detail.id,this.itemsValues.operationNumberValue=e.data?e.data.id:e.detail.id,a.setInformation(this.itemsValues,e.data?e.data:e.detail),this.optionAction=a.optionAction,this.pageSuccessVisible=!0;const r={nameService:null===(t=this.selectedService[0])||void 0===t||null===(i=t.name)||void 0===i?void 0:i.toLowerCase(),processSaved:this.isSaved?this.t("bill-payments-saved-service-title"):this.t("bill-payments-new-service-title"),currency:this.localCurrency,amount:this.selectAmount,operationNumber:this.itemsValues.operationNumberValue};It(this,ni,r)}setInformationData(e){this.itemsValues={agreementNumberText:this.t("bill-payments-agreement-number-text-title"),agreementNumberValue:e.detail.agreementNumber,referenceText:this.t("bill-payments-agreement-reference-text-title"),referenceValue:e.detail.references,operationTypeText:this.t("bill-payments-agreement-operation-type-text-title"),operationTypeValue:this.t("bill-payments-agreement-operation-type-value"),originText:this._isSipare?this.t("bill-payments-agreement-origin-account-text-title"):this.t("bill-payments-agreement-origin-text-title"),originValue:e.detail.origin[0].titleName,accountNumber:this.t("bill-payments-agreement-account-number-title"),accountNumberValue:e.detail.origin[0].description.value,descriptionText:this.t("bill-payments-agreement-description-text-title"),descriptionValue:e.detail.concept,aliasText:this.t("bill-payments-agreement-alias-text-title"),aliasValue:this.aliasService,guideText:this.t("bill-payments-agreement-guide-text-title"),guideValue:"",idOperationText:this.t("bill-payments-agreement-id-operation-text-title"),idOperationValue:"",operationNumberText:this.t("bill-payments-agreement-operation-Number-title"),operationNumberValue:"",nameServicePayments:e.detail.nameService,saveService:this.isSaved,billNumber:this.referenceServiceSaved},this._isSipare&&(this.itemsValues.patronalRegisterText=this._billSipare.patronalRegisterText,this.itemsValues.patronalRegisterValue=this._billSipare.patronalRegisterValue,this.itemsValues.suaCodeText=this._billSipare.suaCodeText,this.itemsValues.suaCodeValue=this._billSipare.suaCodeValue,this.itemsValues.periodText=this._billSipare.periodText,this.itemsValues.periodValue=this._billSipare.periodValue)}goBackSuccess(){this.pageSuccessVisible=!1,this.reset(),this._exitProcess()}getFeatureFlags(e){this.featureFlagSipare=null==e?void 0:e["glomo.billPaymentsHome.sipare"].value}_setReference(e){this.billPaymentHeaderMultiStepVisible=!0,this.referenceServiceSaved=e,this._isSipare&&this._getBillSipare(),this.isTaxes||this._getListBill()}_confirmAmount(){this.isTaxes?this._isSipare?this._responseSuccessGetTaxes():this._getSearchTaxes():(this.completedStepAmount=!0,It(this,pi))}_stepEditStep(e){1===e.detail?this.completedStepAmount=!1:0===e.detail&&(this.editSelectService=!0)}_responseSuccesListService(e){const t=null==e?void 0:e.detail;if(!this.featureFlagSipare){const e=t.findIndex((e=>"SIPARE IMSS INFONAVIT"===e.name));t.splice(e,1)}this._taxes.forEach(((e,i)=>{const a=t.findIndex((t=>t.name===e.name));if(-1!==a){const e=t.splice(a,1)[0];t.splice(i,0,e)}}));const i=t.filter((e=>this.isBillTaxes?t:"SAT"!==e.name&&"CDMX"!==e.name&&"SIPARE IMSS INFONAVIT"!==e.name));this.serviceList=i,this.filterList=i,this.visibleModalServiceSearch=!0,this.billPaymentHeaderMultiStepVisible=!1,this.resetAmountStep(),It(this,"close-control-veil")}resetAmountStep(){this.shadowRoot.querySelector("#multistepBillPayments").shadowRoot.querySelector('[data-tag-name="bbva-feature-bill-payments-amount"]').resetAmount()}_responseErrorListService(){It(this,"close-control-veil")}_responseSuccesAgileService(e){this.savedList=0===Object.keys(e.detail).length?[]:e.detail,It(this,"close-control-veil"),It(this,ii)}_responseErrorAgileService(){It(this,"close-control-veil"),It(this,vi,{textErrorType:"operativa pagar servicio no disponible"})}_responseSuccesIndicatorsService(e){null!==e.detail?(this.filterList=[e.detail],this.selectedService=[e.detail],this.barCode="BARCODE"===e.detail.billInformation.allowedDigitalCodes[0].id):this.filterList=[],It(this,"close-control-veil")}_responseErrorIndicatorsService(){this._handleOpenErrorModalSelectService({detail:this.errorModalCatalog.SERVICE_SEARCH_ERROR}),It(this,mi),It(this,"close-control-veil")}_responseSuccesAddtionalPayment(e){e.detail&&(this.visibleModalServiceDetail=!0,this.visibleModalServiceSearch=!1,this.visibleModalAllServices=!1,this.referenceMaximumLength=e.detail[0].maximumLength,this.referenceMinimumLength=e.detail[0].minimumLength,this.referenceType=e.detail[0].fieldType.id,this.conceptMaximumLength=e.detail[1].maximumLength,this.conceptMinimumLength=e.detail[1].minimumLength,this.conceptType=e.detail[1].fieldType.id),It(this,"close-control-veil")}_responseErrorAddtionalPayment(){It(this,"close-control-veil")}_responseSuccessSearchBill(e){const t=(Array.isArray((e||{}).detail)?e.detail:[]).flatMap((e=>Array.isArray((e||{}).billAmounts)?e.billAmounts:[])).find((e=>e&&(e.amountType||{}).id&&"number"==typeof(e.amountValue||{}).amount)),i=((t||{}).amountType||{}).id||"",a=((t||{}).amountValue||{}).amount??0;"MIN_AMOUNT"===i&&(this.selectAmount=a>0?a:this.selectAmount),this.visibleModalServiceDetail=!1,It(this,"close-control-veil")}_responseErrorSearchBill(e){It(this,"close-control-veil");const t=e&&e.detail&&e.detail.error&&e.detail.error.response?JSON.parse(e.detail.error.response):null;if(!t||409!==t["http-status"]||"EIE0085"!==t["error-code"]||"CONS SIN COBRA LINEA"!==t["error-message"])return this.setErrorCase({detail:t}),this.billPaymentHeaderMultiStepVisible=!1,this.visibleModalServiceDetail=!0,void this._resetMultiStep();this.visibleModalServiceDetail=!1}_responseErrorApiDm(e){this.visibleModalServiceDetail=!0;const t=e.detail["error-code"],i={isOutOftime:["ERE0548"],isWrongCaptureLine:["ERE0024"],isExpiredDate:["ERE0020"],isExpiredDateSecond:["ERE0203"],isMtuException:["KNE6666"],isRegistrationAlreadyExists:["CNE0241"]};[{condition:()=>i.isOutOftime.includes(t),action:()=>{this.billPaymentMultiStepVisible=!0,this.visibleModalOutOfTimePay=!0,It(this,fi)}},{condition:()=>i.isWrongCaptureLine.includes(t),action:()=>{this.visibleModalCaptureLineSipare=!0,It(this,yi)}},{condition:()=>i.isExpiredDate.includes(t),action:()=>{this.errorModalCatalog.CAPTURE_EXPIRED_DATE="dateExpiredSipareError",this.visibleModalExpiredDate=!0}},{condition:()=>i.isExpiredDateSecond.includes(t),action:()=>{this.errorModalCatalog.CAPTURE_EXPIRED_DATE="dateExpiredSipareSecondError",this.visibleModalExpiredDate=!0}},{condition:()=>i.isRegistrationAlreadyExists.includes(t),action:()=>{this.visibleErrorModalDuplicateReference=!0}},{condition:()=>t&&t.includes("ERE"),action:()=>{this.secondChance=!0,this.visibleModalDashboardError=!0}}].some((e=>!!e.condition()&&(e.action(),!0))),this._mtuErrorHandler(i.isMtuException,t)}_mtuErrorHandler(e,t){const[i]=e;t===i&&(this.mtuFlag={makePayment:!0,cancelPayment:!1},this._resetModals(),It(this,"mtu-exception-handler-navigation",!0))}_responseOrdersServiceError(e){const t=e.detail.messages.find((e=>e.message.includes("#"))).message.split("#")[0],i={isOutOftime:["ERE5100"],isPay:["ERE5060","ERE5080","ERE5045","ERE5050","ERE5070","ERE5040"]};let a={};a=i.isOutOftime.includes(t)?{headerText:this.t("bill-payments-error-header-sipare"),titleText:this.t("bill-payments-error-title-out-of-time"),bodyText:this.t("bill-payments-error-body-out-of-time-sipare"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""}:i.isPay.includes(t)?{headerText:this.t("bill-payments-error-header-sipare"),titleText:this.t("bill-payments-error-title-capture-line"),bodyText:this.t("bill-payments-error-body-capture-line-sipare"),buttonText:this.t("bill-payments-error-button-understood"),linkText:""}:{bodyText:this.t("bill-payments-error-body-dashboard-access-two"),buttonText:this.t("bill-payments-error-button-exit"),linkText:""},this._paramsModalSipare={...a},this.visibleModalDashboardErrorSipare=!0}_responseSuccessGetTaxes(){this.completedStepAmount=!0,It(this,"close-control-veil")}_responseErrorGetTaxes({detail:e}){const[t]=e.messages,[i]=t.message.split("#"),a=i;"EIE7024"===a?(this.completedStepAmount=!1,this.visibleModalIncorrectAmount=!0):"BGEPR15"===a||"EIE8067"===a||"EIE7023"===a||"EIE7009"===a||"EIE7021"===a?(this.completedStepAmount=!1,this.visibleModalCaptureLine=!0):(this.flagWrongCaptureLine=!0,this.completedStepAmount=!0,It(this,pi)),It(this,"close-control-veil")}get _globalBillPaymentsApiDMS(){return h`
      <bbva-global-service-payments-api-dm
        .host=${this.headers.host}
        .version=${this.paymentsApiVersion}
        .requiredToken=${this.headers.requiredToken}
        ?native="${this.native}"
        requiredOtp
        .customerId="${this.customerId}"
        @service-payments-api-dm-create="${this.saveResponseData}"
        @service-payments-api-dm-create-error="${this.paymentsErrorCreate}"
        @api-dm-error="${this.paymentsErrorGlobalApi}">
      </bbva-global-service-payments-api-dm>
      <bbva-global-services-api-dm
        host=${this.headers.host}
        version="${this.globalServicesApiVersion}"
        ?native=${this.headers.native}
        .requiredToken=${this.headers.requiredToken}
        @services-api-dm-fetch="${this._getListServices}"
        @services-api-dm-fetch-error="${this._getErrorServices}"
      ></bbva-global-services-api-dm>
      <bill-payments-api-dm
        id="apiService"
        host="${this.headers.host}"
        version="${this.paymentsApiVersion}"
        ?native="${this.headers.native}"
        tsec="${this.tsec}"
        requiredToken="${this.headers.requiredToken}"
        .deviceId="${this.deviceId}"
        .timeout="${this.headers.timeout}"
        @success-response-list-service="${this._responseSuccesListService}"
        @error-response-list-service="${this._responseErrorListService}"
        @success-response-agile-service-payments="${this._responseSuccesAgileService}"
        @error-response-agile-service-payments="${this._responseErrorAgileService}"
        @success-response-service-indicators="${this._responseSuccesIndicatorsService}"
        @error-response-service-indicators="${this._responseErrorIndicatorsService}"
        @success-response-additional-payment="${this._responseSuccesAddtionalPayment}"
        @error-response-additional-payment="${this._responseErrorAddtionalPayment}"
        @success-response-get-bills="${this._responseSuccessSearchBill}"
        @error-response-get-bills="${this._responseErrorSearchBill}"
        @success-response-get-taxes="${this._responseSuccessGetTaxes}"
        @error-response-get-taxes="${this._responseErrorGetTaxes}"
        @success-response-post-save-service="${this.responseStorangeServiceSuccess}"
        @error-response-post-save-service="${this.responseStorangeServiceError}"
        @api-dm-error="${this._responseErrorApiDm}"
        @success-response-get-social-contributions="${this._responseSocialContributions}"
        @success-response-post-save-payment-order-service="${this._responseOrdersServiceSuccess}"
        @error-response-post-save-payment-order-service="${this._responseOrdersServiceError}"
      ></bill-payments-api-dm>
    `}get containerMultiStep(){return h`
      <bbva-transition-container
        class="container multi-step"
        ?hidden="${!this.billPaymentMultiStepVisible}"
        ?visible="${this.billPaymentMultiStepVisible}">
        <div slot="slot-content">
          <bbva-bill-payments-multi-step
            id="multistepBillPayments"
            .completedStepAmount="${this.completedStepAmount}"
            .savedList="${this.savedList}"
            .serviceList="${this.serviceList}"
            .listAccount="${this.listAccount}"
            .listCard="${this.listCard}"
            .selectConcept="${this.selectConcept}"
            .selectAmount="${this.selectAmount}"
            .selectedService="${this.selectedService}"
            .filterList="${this.filterList}"
            .isSaved="${this.isSaved}"
            .barCode="${this.barCode}"
            .aliasService="${this.aliasService}"
            .referenceServiceSaved="${this.referenceServiceSaved}"
            .referenceMaximumLength="${this.referenceMaximumLength}"
            .referenceMinimumLength="${this.referenceMinimumLength}"
            .referenceType="${this.referenceType}"
            .conceptMaximumLength="${this.conceptMaximumLength}"
            .conceptMinimumLength="${this.conceptMinimumLength}"
            .conceptType="${this.conceptType}"
            .visibleModalServiceSearch="${this.visibleModalServiceSearch}"
            .visibleModalAllServices="${this.visibleModalAllServices}"
            .visibleModalServiceDetail="${this.visibleModalServiceDetail}"
            .errorModalCatalog="${this.errorModalCatalog}"
            .visibleModalErrorService="${this.visibleModalErrorService}"
            .visibleModalCaptureLine="${this.visibleModalCaptureLine}"
            .visibleModalIncorrectAmount="${this.visibleModalIncorrectAmount}"
            .visibleModalReference="${this.visibleModalReference}"
            .visibleModalOtpError="${this.visibleModalOtpError}"
            .selectedOrigin="${this.selectedOrigin}"
            .isTaxes="${this.isTaxes}"
            .editSelectService="${this.editSelectService}"
            .currencyCode="${this.currencyCode}"
            .localCurrency="${this.localCurrency}"
            .isSipare="${this._isSipare}"
            .billSipare="${this._billSipare}"
            .visibleModalExpiredDate="${this.visibleModalExpiredDate}"
            .visibleModalCaptureLineSipare="${this.visibleModalCaptureLineSipare}"
            .visibleModalOutOfTimePay="${this.visibleModalOutOfTimePay}"
            .paramsOtpError="${this.paramsOtpError}"
            ?bill-payment-header-multi-step-visible="${this.billPaymentHeaderMultiStepVisible}"
            ?is-native-ios="${this.isNativeIos}"
            @feature-bill-payments-select-origin=${e=>this.selectOrigin(e)}
            @feature-bill-payments-select-service-modal-search-close="${this.closeModalSearchService}"
            @feature-bill-payments-modal-service-detail-close=${this.closeModalServiceDetail}
            @feature-bill-payments-select-service-modal-all-service-close="${this.closeModalAllService}"
            @feature-bill-payments-select-amount-value-change=${this.setAmount}
            @feature-bill-payments-select-service-modal-all-service-open="${this.openModalAllService}"
            @feature-bill-payments-select-service-choose-another-service=${this.reset}
            @feature-bill-payments-select-reference-of-service=${e=>this._setReference(e.detail)}
            @feature-bill-payments-select-amount-btn-confirm=${this._confirmAmount}
            @feature-bill-payments-select-service-modal-search-service-by-id=${e=>this.getServiceSearchByNumber(e.detail)}
            @feature-bill-payments-select-service-modal-search=${e=>this.getServiceDetail(e)}
            @feature-bill-payments-select-service-from-saved=${e=>this.getServiceDetail(e)}
            @feature-bill-payments-select-concept=${e=>{this.selectConcept=e.detail}}
            @feature-bill-payments-continue-sumarry="${this._makePayment}"
            @feature-bill-confirm-step-concept=${this.confirmConcept}
            @feature-bill-payments-set-information="${this.setInformationData}"
            @feature-bill-payments-new-service-click=${()=>this.getListServiceTop()}
            @feature-bill-payments-open-error-modal-select-service=${e=>this._handleOpenErrorModalSelectService(e)}
            @feature-bill-payments-close-error-modal-select-service=${()=>{this.visibleModalErrorService=!1}}
            @feature-bill-payments-close-error-modal-multistep=${e=>this._handleCloseErrorModalMultistep(e)}
            @feature-bill-payments-exit-payment=${()=>this._exitProcess()}
            @help-modal-footer-link-click=${this.closeModalServiceDetail}
            @expandable-step-edit-step=${this._stepEditStep}
          ></bbva-bill-payments-multi-step>
        </div>
      </bbva-transition-container>
    `}setAmount(e){const{value:t}=(null==e?void 0:e.detail)||{};this.selectAmount="string"==typeof t?""!==t?Number(t.replace(/,/g,"")):0:"number"==typeof t?t:0}closeModalServiceDetail(){this.visibleModalServiceDetail=!1,this.billPaymentHeaderMultiStepVisible=!0}closeModalSearchService(){this.visibleModalServiceSearch=!1,this.billPaymentHeaderMultiStepVisible=!0}closeModalAllService(){this.visibleModalAllServices=!1,this.billPaymentHeaderMultiStepVisible=!0}openModalAllService(){this.visibleModalAllServices=!0,It(this,ai,{appStartedStep:"ver todos"}),this.billPaymentHeaderMultiStepVisible=!1}get containerSuccessPage(){return h`
      <bbva-transition-container
        id="succcess-billayment-multistep-transition"
        ?visible="${this.pageSuccessVisible}">
        <div slot="slot-content">
          <bbva-feature-bill-payments-ticket
            id="successTicket"
            customerContact="${this.customerContact}"
            .errorModalCatalog="${this.errorModalCatalog}"
            .isScheduled="${this.isScheduled}"
            .savedList="${this.savedList}"
            .isTaxes="${this.isTaxes}"
            .scheduledServiceSelected="${this.scheduledServiceSelected}"
            .visibleErrorModalSaveFavourite="${this.visibleErrorModalSaveFavourite}"
            .localLanguage="${this.localLanguage}"
            .optionAction=${this.optionAction}
            .infoIcon=${[{icon:fe()}]}
            .avatarText=${[{text:""}]}
            .options=${this.optionsDate}
            .errorScannerCodes=${[-1,0,1,3]}
            .isSipare="${this._isSipare}"
            ?visible-error-modal-duplicate-reference="${this.visibleErrorModalDuplicateReference}"
            @header-right-click-duplicate-reference="${()=>{this.visibleErrorModalDuplicateReference=!1}}"
            @footer-button-click-duplicate-reference="${()=>{this.visibleErrorModalDuplicateReference=!1}}"
            @back-step-header-success="${this.goBackSuccess}"
            @post-service-request="${this.postApiSaveService}"
          ></bbva-feature-bill-payments-ticket>
        </div>
      </bbva-transition-container>
    `}signCancelled(){this.billPaymentMultiStepVisible=!0}paymentsErrorCreate(){this.visibleModalReference=!0}paymentsErrorGlobalApi(e){((((e||{}).detail||{}).data||{}).status||{}).id===this.txtPaidService&&((((e||{}).detail||{}).data||{}).status||{}).name===this.txtSuccessfulPayment?this.saveResponseData((e||{}).detail):this.setErrorCase(e),It(this,"close-control-veil")}setErrorCase(e){let t="";const i=e||{};if("error-code"in i.detail)t=i.detail["error-code"];else if("messages"in i.detail){const[e]=i.detail.messages,[a]=e.message.split("#");t=a}else t="responseText"in i.detail?JSON.parse(i.detail.responseText)["error-code"]:i.status;let a={headerText:this.t("bill-payments-error-title-invalid-reference"),titleText:this.t("bill-payments-error-title-otp"),bodyText:this.t("bill-payments-error-body-otp"),buttonText:this.t("bill-payments-understood-title"),linkText:this.t("bill-payments-service-modal-permissions-link-text")};const r={EIE7003:{titleText:this.t("bill-payments-expired-catch-line"),bodyText:this.t("bill-payments-generate-a-new-capture-line"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE7011:{titleText:this.t("bill-payments-incorrect-capture-line"),bodyText:"",buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE7012:{titleText:this.t("bill-payments-incorrect-capture-line"),bodyText:"",buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE7022:{titleText:this.t("bill-payments-incorrect-capture-line"),bodyText:"",buttonText:this.t("bill-payments-understood-title"),linkText:""},BGE0426:{titleText:this.t("bill-payments-incorrect-capture-line"),bodyText:this.t("bill-payments-the-capture-line-is-expired"),buttonText:this.t("bill-payments-understood-title"),linkText:""},404:{titleText:this.t("bill-payments-error-title-otp"),bodyText:this.t("bill-payments-error-body-otp"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE7009:{titleText:this.t("bill-payments-invalid-capture-line"),bodyText:this.t("bill-payments-capture-line-must-start-with-two-or-four"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE8067:{titleText:this.t("bill-payments-special-characters-in-the-capture-line"),bodyText:this.t("bill-payments-the-capture-line-contains-special-characters"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE7004:{titleText:this.t("bill-payments-this-amount-does-not-match-the-amount-in-the-capture-line"),bodyText:"",buttonText:this.t("bill-payments-understood-title"),linkText:""},BGEIF32:{titleText:this.t("bill-payments-operation-not-available-at-this-time"),bodyText:"",buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE8002:{titleText:this.t("bill-payments-operation-not-available-at-this-time"),bodyText:this.t("bill-payments-the-timetable-forp-ayment-of-this-service-or-tax-is-as-follows"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE8054:{titleText:this.t("bill-payments-operation-not-available-at-this-time"),bodyText:this.t("bill-payments-the-timetable-forp-ayment-of-this-service-or-tax-is-as-follows"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE8303:{titleText:this.t("bill-payments-do-you-want-to-make-another-payment"),bodyText:this.t("bill-payments-wait-a-few-minutes-before-making-this-payment-again"),buttonText:this.t("bill-payments-understood-title"),linkText:""},EIE0322:{titleText:this.t("bill-payments-error-rejected-by-company"),bodyText:this.t("bill-payments-error-verify-data"),buttonText:this.t("bill-payments-understood-title"),linkText:""},default:{titleText:this.t("bill-payments-error-title-otp"),bodyText:this.t("bill-payments-error-body-otp"),buttonText:this.t("bill-payments-understood-title"),linkText:""}};i.detail["http-status"]===this.aricFraudHttpStatus&&t===this.aricFraudErrorCode?It(this,"aric-fraud-help-modal-high-risk",!0):(a={...a,...r[t]||r.default},this.paramsOtpError=a,this.visibleModalOtpError=!0,this._mtuErrorHandler(["KNE6666"],t))}searchScheduledService(){It(this,"open-control-veil"),this._servicesApiDm.getServices()}_getListServices(e){const t=e.detail,i={"00001":"TELMEX","00002":"CFE","00005":"SKY","00011":"TELCEL"};t.forEach((e=>{var t;i[e.id]&&(e.name=i[e.id]),e.name===(null===(t=this.selectedService[0])||void 0===t?void 0:t.name)&&(this.isScheduled=!0,this.scheduledServiceSelected=e)})),It(this,"close-control-veil")}_getErrorServices(){It(this,"close-control-veil"),this.isScheduled=!1}mtuMakePayment(){this._makePayment(),this.mtuFlag={}}_makePayment(){var e,t;if(this.flagWrongCaptureLine)return void(this.visibleModalReference=!0);if(this.billPaymentMultiStepVisible=!1,this.isTaxes)this._isSipare?this._makePaymentsSipare():this._paymentsDm.postServicePayments(this._getPaylodPayTaxes());else{const e={description:this.selectConcept,service:{id:this.selectedService[0].id},bill:{id:this.referenceServiceSaved,billAmount:{amount:this.selectAmount,currency:this.localCurrency}},origin:{contractId:this.selectedOrigin[0].id,product:{id:"ACCOUNTS"}}};if(this.referenceServiceSaved.length>20){const t=this.referenceServiceSaved;e.description=t.substring(20,t.length),e.bill.id=t.substring(0,20)}this._paymentsDm.postServicePayments(e)}const i=null===(e=this.selectedService[0])||void 0===e||null===(t=e.name)||void 0===t?void 0:t.toLowerCase(),a=this.isSaved?this.t("bill-payments-saved-service-title"):this.t("bill-payments-new-service-title"),r=this.localCurrency,o=this.selectAmount;It(this,li,{nameService:i,processSaved:a,currency:r,amount:o})}_makePaymentsSipare(){const e=this.shadowRoot.getElementById("apiService"),t=this.selectedOrigin.find((e=>e.originalProduct)).originalProduct.number.slice(10),i={socialContributionId:this.referenceServiceSaved},a={contract:{number:t,productType:{id:"ACCOUNTS"}}};e.version=this._versions.v1,e.postMxPaymentOrders(i,a)}_getPaylodPayTaxes(){const e={service:{id:"000844985"===this.selectedService[0].id?"0844985":"1137840"},bill:{id:this.referenceServiceSaved,billAmount:{amount:this.selectAmount,currency:this.localCurrency}},origin:{contractId:this.selectedOrigin[0].id,product:{id:"CREDIT_CARD"===this.selectedOrigin[0].subProductType?"CARDS":"ACCOUNTS"}},additionalFields:[],paymentOriginType:{id:"CATCH_LINE"}};return"000844985"===this.selectedService[0].id&&(e.additionalFields=[{additionalPaymentField:{id:"CR"},value:"0998"}]),"CREDIT_CARD"===this.selectedOrigin[0].subProductType&&(e.additionalFields=e.additionalFields.concat([{additionalPaymentField:{id:"OPERATION_TYPE"},value:"R"}])),e}getAgileService(){It(this,"open-control-veil"),this.shadowRoot.getElementById("apiService").setDeviceId(this.deviceId),this.shadowRoot.getElementById("apiService").getListAgileServicePayment()}getListServiceTop(){It(this,ai,{appStartedStep:"nuevo servicio o impuesto"}),It(this,"open-control-veil"),this.shadowRoot.getElementById("apiService").setDeviceId(this.deviceId),this.shadowRoot.getElementById("apiService").getListService()}getServiceSearchByNumber(e){this.shadowRoot.getElementById("apiService").setDeviceId(this.deviceId),It(this,"open-control-veil"),this.shadowRoot.getElementById("apiService").getServiceIndicators(e)}getAdditionalService(e){this.shadowRoot.getElementById("apiService").setDeviceId(this.deviceId),It(this,"open-control-veil"),this.shadowRoot.getElementById("apiService").getAdditionalPaymentFields(e)}setServiceDetails(e){var t;const i=null===(t=e.name)||void 0===t?void 0:t.toLowerCase();It(this,ai,{appStartedStep:i}),this.isSaved=!0,this.aliasService=e.alias||"",this.optionAction=[{icon:Pe(),label:"Compartir",id:"Share"}]}handleTaxes(e){this.selectedService=[this._taxes.find((t=>t.id===e.id))],"000000028"===e.id&&(this.conceptMinimumLength=0,this.conceptMaximumLength=19,this._isSipare=!0,this.customerContact||(this.visibleModalNoEmailError=!0,It(this,Si))),this.selectConcept=this.selectedService[0].concept,this.visibleModalServiceDetail=!0,this.visibleModalServiceSearch=!1,this.visibleModalAllServices=!1,this.referenceMaximumLength=this.selectedService[0].referenceMaximumLength,this.referenceMinimumLength=this.selectedService[0].referenceMinimumLength,this.referenceType="alphanumeric",this.barCode=!0}handleNonTaxes(e){this.referenceServiceSaved=e.billNumber||"",this.getServiceSearchByNumber(e.service.id),this.getAdditionalService(e.service.id)}resetServiceDetails(){this.isTaxes=!1,this.isSaved=!1,this.aliasService="",this.referenceServiceSaved="",this.optionAction=[{icon:Pe(),label:"Compartir",id:"Share"},{icon:Oe(),label:"Guardar",id:"Save"}],this._isSipare=!1}getServiceDetail(e){const t=e.detail?e.detail:e;"feature-bill-payments-select-service-from-saved"!==e.type&&e.detail?(this.resetServiceDetails(),this.isTaxes=this._taxes.some((t=>t.id===e.detail.id)),this.isTaxes?this.handleTaxes(t):(this.getServiceSearchByNumber(t.id),this.getAdditionalService(t.id))):(this.isTaxes=this._taxes.some((e=>e.id===t.id)),this.setServiceDetails(t),this.isTaxes?this.handleTaxes(t):this.handleNonTaxes(t))}payServiceWithArcus(e){this.isSaved=!0,this.aliasService=e.alias,this.referenceServiceSaved=e.reference,this.optionAction=[{icon:Pe(),label:"Compartir",id:"Share"}],this.selectAmount=e.amount,this.getServiceSearchByNumber(e.idService),this.getAdditionalService(e.idService)}getRegisterDevice(e){const t=e.secondaryUserId||e;"object"!=typeof t&&(this.deviceId=t)}getGlobalAccounts(e){this.listAccount=e[0].products.filter((e=>"ACTIVE"===e.status))}getGlobalCards(e){this.listCard=e[0].products.filter((e=>"CREDIT_CARD"===e.subProductType))}_getListBill(){let e=this.referenceServiceSaved;e.length>20&&(e=this.referenceServiceSaved.substring(0,20)),It(this,"open-control-veil");const t={serviceId:this.selectedService[0].id,billReferenceType:"BILL_NUMBER",billNumber:e};this.shadowRoot.getElementById("apiService").getSearchBill(t)}_getBillSipare(){this.visibleModalServiceDetail=!1,this.billPaymentMultiStepVisible=!1;const e={socialContributionId:this.referenceServiceSaved};this.shadowRoot.getElementById("apiService").getSocialContributions(e)}_getPeriod(e){let t=moment().month(e.month-1).format("MMM");return t=t.charAt(0).toUpperCase()+t.slice(1),`${t} ${e.year}`}_getSearchTaxes(){It(this,"open-control-veil");const e={serviceId:"0844985",additionalFields:{additionalFields:[{additionalPaymentField:{id:"CR"},value:"0998"},{additionalPaymentField:{id:"BILL_ID"},value:this.referenceServiceSaved},{additionalPaymentField:{id:"AMOUNT"},value:this.selectAmount}]}},t={serviceId:"1137840",additionalFields:{serviceType:{id:"LOCAL_TAX"},additionalFields:[{additionalPaymentField:{id:"BILL_ID"},value:this.referenceServiceSaved},{additionalPaymentField:{id:"AMOUNT"},value:this.selectAmount}]}},i="000844985"===this.selectedService[0].id?e:t;this.shadowRoot.getElementById("apiService").getSearchTaxes(i)}checkAvailability(){const{makePayment:e=!1}=this.mtuFlag||{};e?this.mtuMakePayment():this.availableProcess?It(this,ui,{key:"billPaymens_onboarding"}):(this.visibleModalDashboardError=!0,It(this,vi,{textErrorType:"operativa pagar servicio no disponible"}))}get performOnboarding(){return h`
      <onboarding-full-screen-carousel
        id="onboarding"
        ?visible=${!this.onboardingCompleted}
        modal-title="${this.t("bill-payments-title-header")}"
        header-icon-right-primary="${X()}"
        button-text="${this.t("bill-payments-understood-title")}"
        .items=${this.itemsOnboarding}
        @help-modal-header-right-primary-click=${()=>this._exitProcess()}
        @onboarding-full-screen-carousel-item-select=${()=>this._aceptOnboarding()}
      ></onboarding-full-screen-carousel>
    `}_aceptOnboarding(){this._setLocalStorageData(!0),It(this,ui,{key:"billPaymens_onboarding"})}getOnbordingDetailLocalStorage(e){e.status?(this.visibleModalDashboardError=!1,this.billPaymentMultiStepVisible=!0,this.billPaymentHeaderMultiStepVisible=!0,this.onboardingCompleted=e.status,this.getAgileService()):this._setLocalStorageData(e.status)}getOnbordingDetailLocalStorageError(){this._setLocalStorageData(!1)}_setLocalStorageData(e){this.onboardingCompleted=e;const t={key:"billPaymens_onboarding",value:{status:this.onboardingCompleted}};It(this,gi,t)}_showModalDashboardError(e){const t={bodyText:this.secondChance?this.t("bill-payments-error-body-dashboard-access-two"):this.t("bill-payments-error-body-dashboard-access"),buttonText:this.secondChance?this.t("bill-payments-error-button-exit"):this.t("bill-payments-error-button-retry"),linkText:this.secondChance?"":this.t("bill-payments-error-button-exit")};return!0===this.secondChance?h`
        <bbva-modal-error-bill-payments
          .errorModalId=${e}
          .errorModalParams=${t}
          .visibleModal=${this.visibleModalDashboardError}
          @error-modal-footer-button-click=${()=>this._exitProcess()}
        >
        </bbva-modal-error-bill-payments>
      `:h`
      <bbva-modal-error-bill-payments
        .errorModalId=${e}
        .errorModalParams=${t}
        .visibleModal=${this.visibleModalDashboardError}
        @error-modal-footer-button-click="${()=>this._tryAgain()}"
        @error-modal-footer-link-click=${()=>this._exitProcess()}
      >
      </bbva-modal-error-bill-payments>
    `}_showModalDashboardErrorSipare(e){return h`
      <bbva-modal-error-bill-payments
        errorModalId="${e}"
        .errorModalParams="${this._paramsModalSipare}"
        .visibleModal="${this.visibleModalDashboardErrorSipare}"
        @error-modal-footer-button-click="${()=>this._exitProcess()}"
        @error-modal-header-right-click="${()=>this._exitProcess()}"
      ></bbva-modal-error-bill-payments>
    `}_showModalNoEmail(e){const t={headerText:this.t("bill-payments-error-header-sipare-no-email"),titleText:this.t("bill-payments-error-title-sipare-no-email"),bodyText:this.t("bill-payments-error-body-sipare-no-email"),buttonText:this.t("bill-payments-error-button-sipare-go-to-profile"),linkText:this.t("bill-payments-error-button-exit")};return h`
      <bbva-modal-error-bill-payments
        id="noEmailSipareError"
        .errorModalId="${e}"
        .errorModalParams="${t}"
        .visibleModal="${this.visibleModalNoEmailError}"
        ?is-caution="${!0}"
        @error-modal-header-right-click="${()=>this._exitProcess()}"
        @error-modal-footer-button-click="${()=>this._gotoProfile()}"
        @error-modal-footer-link-click="${()=>this._exitProcess()}"
      >
      </bbva-modal-error-bill-payments>
    `}_tryAgain(){this.visibleModalDashboardError=!1,this.secondChance=!0,this.visibleModalDashboardError=!0}_exitProcess(){var e;this.visibleModalDashboardError&&(this.visibleModalDashboardError=!1),this.onboardingCompleted=!0,"billPaymentsHome"===(null===(e=this.isBillPaymentsHome)||void 0===e?void 0:e.servicePayment)?It(this,"exit-dashboard-bill-payments-process-to-command-center"):It(this,"exit-dashboard-bill-payments-process-to-dashboard"),this.mtuFlag={},this.reset()}_gotoProfile(){this.visibleModalNoEmailError=!1,this.reset(),It(this,"goto-profile")}_handleOpenErrorModalSelectService({detail:e}){this.errorModalCatalog.SERVICE_SEARCH_ERROR===e&&(It(this,"open-control-veil"),setTimeout((()=>{It(this,"close-control-veil"),this.visibleModalErrorService=!0}),500))}_handleCloseErrorModalMultistep({detail:e}){this.errorModalCatalog.CAPTURE_LINE_ERROR===e?this.visibleModalCaptureLine=!1:this.errorModalCatalog.INCORRECT_AMOUNT===e?this.visibleModalIncorrectAmount=!1:this.errorModalCatalog.SERVICE_AND_TAX_REFERENCE_ERROR===e?this.visibleModalReference=!1:this.errorModalCatalog.OTP_ERROR===e?this.visibleModalOtpError=!1:this.errorModalCatalog.CAPTURE_EXPIRED_DATE===e||"dateExpiredSecond"===this.errorModalCatalog.CAPTURE_EXPIRED_DATE?this.visibleModalExpiredDate=!1:this.errorModalCatalog.CAPTURE_LINE_SIPARE===e?this.visibleModalCaptureLineSipare=!1:this.errorModalCatalog.OUT_OF_TIME===e&&(this.visibleModalOutOfTimePay=!1)}callBBVALine(){this.phoneAssistanceNumber&&It(this,"call-bbva-line",{value:this.phoneAssistanceNumber})}render(){return h`
      ${this._globalBillPaymentsApiDMS}
      ${this.containerMultiStep}
      ${this.containerSuccessPage}
      ${this.onboardingCompleted?"":this.performOnboarding}
      ${this._showModalDashboardError(this.errorModalCatalog.DASHBOARD_ERROR_MODAL)}
      ${this._showModalNoEmail(this.errorModalCatalog.NO_EMAIL_ERROR_MODAL)}
      ${this._showModalDashboardErrorSipare(this.errorModalCatalog.DASHBOARD_ERROR_MODAL_SIPARE)}
    `}}customElements.define($r.is,$r);
