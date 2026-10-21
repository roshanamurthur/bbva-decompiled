import{H as t,L as e,z as i,a8 as a,dJ as s,aY as o,aa as r,a9 as n,ac as l,ab as d,ad as c,ar as h,a as b,an as p,cR as m,bU as u,F as v,ag as g,b6 as f,bF as y,ak as _,cS as S,b0 as E,h as x,av as T,o as k,m as $,cG as C,f as A,g as O,cQ as R,aW as D,dA as P,dB as M,bG as I,cD as L,b5 as w,u as N,dK as F,ah as B}from"./952f98a9.js";import{C as q}from"./216055dc.js";import{a$ as H,bt as U,a7 as j,aL as z}from"./7f3d7ca9.js";import"./111ad2c6.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";const V=t((t=>class extends(q(t)){static get properties(){return{account:{type:Object},card:{type:Object},globalCacheStorage:{type:Object},globalUser:{type:Object},financialData:{type:Object},bbvaLine:{type:String},maskedAccount:{type:String}}}constructor(){super(),this.account={},this.card={},this.globalCacheStorage={},this.globalUser={},this.financialData={},this.bbvaLine="",this.maskedAccount=""}_payloadSuccesPage(t,e,i,a){return{mainTitle:{key:"bbva-manager-rdc-successful-request",value:e,class:"spacing-bottom bold"},mainIcon:{src:"./images/check_successful.svg"},additionalInfo:[{key:"",class:"spacing",value:""},{key:"bbva-manager-rdc-root-account",class:"spacing",value:this.t("bbva-manager-rdc-payroll-account")},{key:"bbva-manager-rdc-delivery-address",class:"spacing",value:t},{key:"bbva-manager-rdc-operation-number",value:"",class:"inline secondary"},{key:"",value:i,class:"inline secondary"},{key:"",value:"BBVA",class:"inline secondary spacing"}],message:{type:"info",text:a,icon:"coronita:info"},buttons:{class:"noshadow",primary:{text:"bbva-manager-rdc-exit-button-label",action:"cells-successful-response-click-primary"},secondary:{hidden:!0}}}}capitalize(t){return(t=t.toLowerCase()).charAt(0).toUpperCase()+t.slice(1)}validateProperties(t,e){return t.every(Object.prototype.hasOwnProperty.bind(e))}_isPayrollAccount(t){const{isActive:e=!1}=t.find((t=>"IS_PAYROLL_ACCOUNT"===(null==t?void 0:t.id)))||{};return e}fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}})),G={OPEN:"bbva-manager-rdc-open-veil",CLOSE:"bbva-manager-rdc-close-veil"},W={BACK_STEP:"bbva-manager-rdc-back-navigation"},Y={CALL_BBVA:"bbva-manager-rdc-call-bbva-modal",EXIT:"bbva-manager-rdc-exit-modal",FAILED_OPERATION:"bbva-manager-rdc-failed-operation-modal",RETRY:"bbva-manager-rdc-retry-modal"},X={SEND_ACCOUNT:"bbva-manager-rdc-ui-send-account",SEND_DATA_TO_SUCCES_PAGE:"bbva-manager-rdc-ui-send-data-to-success-page",SEND_ADDRESS_TO_MULTISTEP:"bbva-manager-rdc-ui-send-address-to-multistep",SEND_BULLETS_TO_MULTISTEP:"bbva-manager-rdc-ui-send-bullets-to-multistep",SEND_LABEL_TO_MULTISTEP_BUTTON_ADDRESS:"bbva-manager-rdc-ui-send-label-button-address",RESET_DATA:"bbva-manager-rdc-reset"},K={CALL_ASSISTANCE:"bbva-manager-rdc-call-assistance",SEND_CUSTOMER_ID:"bbva-manager-rdc-set-customer-id",GET_CARD_OFFER:"bbva-manager-rdc-get-card-offer",GET_CUSTOMER_MASKED_ADDRESSES:"bbva-manager-rdc-get-customer-masked-addresses",GET_CUSTOMER_UNMASKED_ADDRESSES:"bbva-manager-rdc-get-customer-unmasked-addresses",GET_CUSTOMER_DETAIL:"bbva-manager-rdc-get-customer-detail",POST_CREATE_CARD:"bbva-manager-rdc-post-create-card",LAST_REQUEST:"bbva-manager-rdc-last-request"},Q={PAGE_VISIT:"bbva-analyticmanager-rdc-page-visit",APP_STARTED:"bbva-analyticmanager-rdc-app-started",APP_STEP_2:"bbva-analyticmanager-rdc-app-step-2",APP_STEP_3:"bbva-analyticmanager-rdc-app-step-3",APP_STEP_4:"bbva-analyticmanager-rdc-app-step-4",APP_COMPLETED:"bbva-analyticmanager-rdc-app-completed",FOOTPRINT:{DYNAMIC_ERROR:"bbva-analyticmanager-rdc-dynamic-footprint",FAILED_OPERATION:"bbva-analyticmanager-rdc-failed-operation-footprint",SHOW_ADDRESS:"bbva-analyticmanager-rdc-show-address-footprint"}},J={SHOW_ADDRESS:"bbva-multistep-rdc-show-address-label",HIDE_ADDRESS:"bbva-multistep-rdc-hide-address-label"},Z={ADDRESES:"CUSTOMER_ADDRESSES",DETAILS:"CUSTOMER_DETAIL"},tt={GET_CARD_OFFER:"GET_CARD_OFFER",CREATE_CARD:"CREATE_CARD"};class et extends(V(e)){static get is(){return"bbva-manager-request-debit-card"}static get properties(){return{_addressMaskedSnapshoot:{type:Object},campaignId:{type:String},_operationNumber:{type:String},_operationDate:{type:String},_email:{type:String},_lastRequest:{type:String},_errorCounter:{type:Number},_unmasked:{type:Boolean},_blockBackNavigation:{type:Boolean}}}constructor(){super(),this._addressMaskedSnapshoot={id:"",address:"",unmasked:!1,buttonLabel:"",addressMasked:""},this.campaignId="",this._lastRequest="",this._email="",this._operationNumber="",this._operationDate="",this._errorCounter=0,this._unmasked=!1,this._blockBackNavigation=!1,this.bbvaLine=""}setInitialData(){const t=((this.globalCacheStorage||{}).customer||this.globalUser||{}).customerId||"";this.campaignId&&0!==Object.keys(this.financialData).length?(this.fireEvent(K.SEND_CUSTOMER_ID,t),this._requestGetCardOffer(this.campaignId)):0!==Object.keys(this.account).length&&0!==Object.keys(this.card).length?(this.fireEvent(K.SEND_CUSTOMER_ID,t),this.maskedAccount=(this.account.number||"").slice(-4),this.fireEvent(X.SEND_ACCOUNT,(this.account.number||"").slice(-4)),this._requestCustomerDetails()):(this._blockBackNavigation=!0,this.fireEvent(Y.FAILED_OPERATION))}reset(t){t&&!t.value&&(this.account={},this.card={},this._addressMaskedSnapshoot={id:"",address:"",unmasked:!1,buttonLabel:"",addressMasked:""},this.campaignId="",this._lastRequest="",this._email="",this.maskedAccount="",this._operationNumber="",this._operationDate="",this._errorCounter=0,this._unmasked=!1,this._blockBackNavigation=!1)}backNavigation(){this._blockBackNavigation||this.fireEvent(Y.EXIT)}backStep(){this.reset({value:!1}),this.fireEvent(X.RESET_DATA,{value:!1}),this.fireEvent(W.BACK_STEP)}_requestCustomerAddresses(t){this.fireEvent(t?G.CLOSE:G.OPEN),this._lastRequest=Z.ADDRESES,this.fireEvent(t?K.GET_CUSTOMER_UNMASKED_ADDRESSES:K.GET_CUSTOMER_MASKED_ADDRESSES,{unmasked:t})}_requestCustomerDetails(){this.fireEvent(G.OPEN),this._lastRequest=Z.DETAILS,this.fireEvent(K.GET_CUSTOMER_DETAIL,{})}_requestGetCardOffer(t){this.fireEvent(G.OPEN),this._lastRequest=tt.GET_CARD_OFFER,this.fireEvent(K.GET_CARD_OFFER,t)}requestCreateCard(){this._blockBackNavigation=!0;const t={offerId:this.campaignId,cardType:{id:"DEBIT_CARD"},physicalSupport:{id:"NORMAL_PLASTIC"},relatedContracts:[{contractId:this.account.id||""},{contractId:this.card.id||""}],deliveries:[{serviceType:{id:"00001"},address:{addressType:"STORED",id:this._addressMaskedSnapshoot.id},destination:{id:"HOME"}}]};this._lastRequest=tt.CREATE_CARD,this.fireEvent(K.POST_CREATE_CARD,t)}retryRequest(){const t={CUSTOMER_ADDRESSES:()=>this._requestCustomerAddresses(this._unmasked),CUSTOMER_DETAIL:()=>this._requestCustomerDetails(),CREATE_CARD:()=>this.requestCreateCard(),GET_CARD_OFFER:()=>this._requestGetCardOffer(this.campaignId)};t[this._lastRequest]&&setTimeout(t[this._lastRequest](),1600)}onResponseErrorGetCardOffer(t){this.fireEvent(G.CLOSE),0!==Object.keys(t).length&&(this._blockBackNavigation=!0,this._errorCounter+=1,this._errorCounter>=3?this.fireEvent(Y.FAILED_OPERATION):this.fireEvent(Y.RETRY,this._lastRequest))}onResponseErrorCustomerDetail(t){this.fireEvent(G.CLOSE),0!==Object.keys(t).length&&(this._blockBackNavigation=!0,this._errorCounter+=1,this._errorCounter>=3?this.fireEvent(Y.FAILED_OPERATION):this.fireEvent(Y.RETRY,this._lastRequest))}onResponseErrorCustomerAddresses(t){this.fireEvent(G.CLOSE),0!==Object.keys(t).length&&(this._blockBackNavigation=!0,this._errorCounter+=1,this._errorCounter>=3?this._unmasked?(this._blockBackNavigation=!1,this.fireEvent(Y.CALL_BBVA)):this.fireEvent(Y.FAILED_OPERATION):this.fireEvent(Y.RETRY,this._lastRequest))}onResponseErrorCreateCard(t){this.fireEvent(G.CLOSE),0!==Object.keys(t).length&&(this._errorCounter+=1,this._errorCounter>=3?(this._blockBackNavigation=!1,this.fireEvent(Y.CALL_BBVA)):(this._blockBackNavigation=!0,this.fireEvent(Y.RETRY,this._lastRequest)))}onResponseGetCardOffer(t){if(this.fireEvent(G.CLOSE),0!==Object.keys(t).length){var e,i;const{number:a}=(null==t||null===(e=t.details)||void 0===e||null===(i=e.relatedContracts)||void 0===i?void 0:i[0])||{};this._getContracts(a),this.account.id&&this.account.number&&this.card.id&&this.card.number?(this.fireEvent(X.SEND_ACCOUNT,this.account.number.slice(-4)),this._requestCustomerDetails()):(this._blockBackNavigation=!0,this.fireEvent(Y.FAILED_OPERATION))}}onResponseCustomerAddresses(t){if(this.fireEvent(G.CLOSE),this._blockBackNavigation=!1,this._errorCounter=0,0!==Object.keys(t).length){const{addressId:e,title:i,unmasked:a}=t;this._addressMaskedSnapshoot=a?{...this._addressMaskedSnapshoot,address:i,unmasked:a,buttonLabel:J.HIDE_ADDRESS}:{id:e,address:i,unmasked:a,buttonLabel:J.SHOW_ADDRESS,addressMasked:i},this.fireEvent(X.SEND_ADDRESS_TO_MULTISTEP,this._addressMaskedSnapshoot)}}onResponseCustomerDetail(t=[]){if(this.fireEvent(G.CLOSE),this._blockBackNavigation=!1,this._errorCounter=0,0!==t.length){const e=t.detail||t;for(const t of e)"EMAIL"===t.contactType.id&&t.isPreferential&&(this._email=`•${t.contact.replace(/\*/g,"")}`)}this._requestCustomerAddresses(!1)}onResponseCreateCard(t){if(this.fireEvent(G.CLOSE),this._blockBackNavigation=!1,this._errorCounter=0,0!==Object.keys(t).length&&this.validateProperties(["operationNumber","operationDate"],t)){const{operationNumber:e,operationDate:i}=t;this._operationNumber=e,this._operationDate=i,this._navigateToSuccesPage()}}handleButtonAddress(t){if(0!==Object.keys(t).length&&this.validateProperties(["unmasked"],t)){const{unmasked:e}=t;this._unmasked=!e,e?(this._addressMaskedSnapshoot={...this._addressMaskedSnapshoot,address:this._addressMaskedSnapshoot.addressMasked,unmasked:!1,buttonLabel:J.SHOW_ADDRESS},this.fireEvent(X.SEND_ADDRESS_TO_MULTISTEP,this._addressMaskedSnapshoot)):this._requestCustomerAddresses(!0)}}callAssistance(){this._errorCounter=0,this._blockBackNavigation=!1,this.fireEvent(K.CALL_ASSISTANCE,{value:this.bbvaLine})}_navigateToSuccesPage(){this.fireEvent(X.SEND_DATA_TO_SUCCES_PAGE,this._payloadSuccesPage(this._addressMaskedSnapshoot.addressMasked,this._operationDate,this._operationNumber,this.t("bbva-manager-rdc-icon-message"))),this.reset({value:!1}),this.fireEvent(X.RESET_DATA,{value:!1})}_getContracts(t){var e,i,a;const s=(null===(e=this.financialData)||void 0===e||null===(i=e.data)||void 0===i?void 0:i.contracts)||[],o={id:"",number:""};this.account=s.find((e=>{var i;return(null==e?void 0:e.number)===t&&this._isPayrollAccount((null==e||null===(i=e.detail)||void 0===i?void 0:i.indicators)||[])}))||o,this.card=s.find((e=>{var i,a;return"DEBIT_CARD"===(null==e||null===(i=e.subProductType)||void 0===i?void 0:i.id)&&(null==e||null===(a=e.detail)||void 0===a?void 0:a.agreementContract)===t}))||o,this.maskedAccount=((null===(a=this.account)||void 0===a?void 0:a.number)||"").slice(-4)}onSignOperationModalIsCanceled(){this._blockBackNavigation=!1}}customElements.define(et.is,et);const it=t((t=>class extends t{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(t){return t.reduce(((t,e)=>(t[e.is]=e,t)),{})}_handleModalState(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),at=t((t=>class extends(q(t)){static get properties(){return{_openModal:{type:Boolean}}}constructor(){super(),this._openModal=!1}fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}openModal(){this._openModal=!0}stopPropagationEvent(t){t.stopPropagation()}}));var st=i`:host {
  display: block;
  box-sizing: border-box;
  padding-top: calc(((5.625 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-main] {
  --bbva-header-main-dark-mode-bg-color: var(--colorsPrimaryCore, ${a(n.primaryCore)});
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-content-max-height: auto;
}

[data-tag-name=bbva-expandable-step][disabled] {
  background-color: var(--colorsSecondary100, ${a(n.secondary100)});
}

[data-tag-name=bbva-expandable-step]:last-of-type {
  padding-bottom: 10vh;
  height: auto !important;
}

[data-tag-name=bbva-expandable-step][completed]:last-of-type {
  padding-bottom: 50vh;
}

[data-tag-name=bbva-expandable-step][completed] .content {
  visibility: hidden;
}

.content {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.step-address-header {
  padding: 0;
  margin: 1rem 0;
  --bbva-header-category-color: var(--colorsSecondary600, ${a(n.secondary600)});
}

.banner {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background-color: var(--colorsPrimaryCore, ${a(n.primaryCore)});
  padding-bottom: 1rem;
}
.banner__title {
  color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  font-size: var(--fontSizeOptionsFontSize50, ${a(s.fontSize50)});
  font-weight: var(--fontWeightOptionsFontWeight10, ${a(o.fontWeight10)});
  text-align: center;
}

.info {
  margin: 0 0 1rem;
  width: 100%;
}
.info__title {
  font-weight: var(--fontWeightOptionsFontWeight40, ${a(o.fontWeight40)});
  --bbva-header-category-color: var(--colorsSecondary600, ${a(n.secondary600)});
  padding-left: 0;
}

.question-icon {
  color: var(--colorsPrimaryMedium, ${a(n.primaryMedium)});
}

.address {
  display: flex;
  flex-direction: column;
  width: 100%;
  padding: 0 0 7.25rem;
}
.address__title {
  margin-bottom: 1rem;
  padding: 0;
}
.address__content {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  width: 100%;
}
.address__content-text {
  width: 60%;
}
.address__content-button {
  width: 40%;
  display: flex;
  justify-content: flex-end;
}
.address__content bbva-text {
  height: fit-content;
  text-transform: capitalize;
}
.address__content bbva-link {
  width: max-content;
  height: fit-content;
}
.address__content bbva-button-default {
  margin: 0;
}

[data-tag-name=bbva-notification-message] {
  margin: 0 0 1.5rem;
  padding: 2rem 1rem;
  width: 100%;
  --_notification-icon-color: var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)});
}

[data-tag-name=bbva-panel-button-fixed] {
  box-shadow: none;
  position: sticky;
  z-index: 1;
}

[data-tag-name=bbva-notification-status] {
  z-index: 2;
}

[data-tag-name=bbva-list-bullet] {
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em) calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-list-bullet]:first-child {
  padding-top: 0 !important;
}

.microillustration {
  margin-top: 1rem;
  width: 5rem;
  height: 5rem;
}
`;const ot=new h;var rt=i`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${a(n.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${a(n.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${a(n.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${a(n.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
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
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
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
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${a(l.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(d.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${a(c.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em) 0 0);
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
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${a(l.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${a(c.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem));
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
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em);
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
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${ot.mediaRules()}`;class nt extends(b(p(m))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":u,"bbva-icon":v,"bbva-text":g,"bbva-header-main":H,"bbva-link":f}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=y(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),t.has("visible")){let t="close";this.visible&&(t="open"),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,rt,_("bbva-help-modal-shared-styles"),S.light,E.light]}get _fixedIOSHeader(){return x`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?x`
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
        `:""}get helpModalContent(){return x`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?x`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:x`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":x`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return x`
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
            ${this.linkText?x`<bbva-link
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
    `}get helpModalTitle(){return x`
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
          ${this.titleText?x` <bbva-text
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
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t){this.dispatchEvent(new CustomEvent(`help-modal-${t}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(t)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return x`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${T({"half-height":!this.fullHeight})}"
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
    `}}O("colors.cool100"),O("colors.cool60"),O("colors.primarySubduedLight"),O("colors.tertiaryType1Light"),O("colors.tertiaryType3Light"),O("colors.primaryCoreLightened"),O("colors.cool20"),O("colors.cool60"),O("colors.cool60"),O("colors.cool100");var lt=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.call-bbva-header {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  margin: calc(((-7.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem) 1rem 1rem;
  padding: 1rem 1rem 1.5rem;
}
.call-bbva-header__title {
  margin-bottom: calc(((-3.125 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
}

.microillustration {
  margin-top: 1rem;
  width: 5rem;
  height: 5rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-footer-padding: 1.5rem 0 1.05rem;
}
`;const dt={EDIT_STEP:"bbva-multistep-rdc-edit-step",CONTINUE_STEP:"bbva-multistep-rdc-continue-btn",CONTINUE_BUTTON:"bbva-multistep-rdc-continue",SHOW_HIDE_ADDRESS:"bbva-multistep-rdc-show-hide-address"},ct={COMPLETED:"bbva-multistep-rdc-step-completed",ALL_STEPS_COMPLETED:"bbva-multistep-rdc-all-steps-completed"},ht={EXIT:"bbva-multistep-rdc-modal-exit",RETRY:"bbva-multistep-rdc-modal-retry",CALL_BBVA:"bbva-multistep-rdc-modal-call-bbva"};class bt extends(it(j(at(e)))){static get is(){return"request-debit-card-exit-modal"}static get scopedElements(){const t=[nt,bt.configurationScopedElements()];return bt.scopedElementsFromClasses(t)}static get properties(){return{icon:{type:String},type:{type:String},title:{type:String},bodyText:{type:String},buttonText:{type:String},linkText:{type:String}}}constructor(){super(),this.icon="bbvaWarning",this.type="warning",this.title="",this.bodyText="bbva-multistep-rdc-modal-exit-text",this.buttonText="bbva-multistep-rdc-exit-button-label",this.linkText="bbva-multistep-rdc-return-button-label"}static get styles(){return[lt,_("request-debit-card-modals-shared-styles")]}render(){return x`
        <bbva-help-modal
          .iOSFixedHeader="${this.iOSFixedHeader}"
          ?visible="${this._openModal}"
          modal-type="${this.type}"
          title-icon="${R[this.icon]()}"
          title-text="${this.t(this.title)}"
          body-text="${this.t(this.bodyText)}"
          button-text="${this.t(this.buttonText)}"
          link-text="${this.t(this.linkText)}"
          @help-modal-veil-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1}}
          @help-modal-footer-button-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.EXIT)}}
          @help-modal-footer-link-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1}}
        >
        </bbva-help-modal>`}}class pt extends(it(j(at(e)))){static get is(){return"request-debit-card-retry-modal"}static get scopedElements(){const t=[nt,pt.configurationScopedElements()];return pt.scopedElementsFromClasses(t)}static get properties(){return{icon:{type:String},type:{type:String},title:{type:String},bodyText:{type:String},buttonText:{type:String},linkText:{type:String}}}constructor(){super(),this.icon="bbvaWarning",this.type="warning",this.title="bbva-multistep-rdc-failed-operation",this.bodyText="bbva-multistep-rdc-unavailable-info-retry",this.buttonText="bbva-multistep-rdc-retry-button-label",this.linkText="bbva-multistep-rdc-exit-button-label"}static get styles(){return[lt,_("request-debit-card-modals-shared-styles")]}render(){return x`
        <bbva-help-modal
          .iOSFixedHeader="${this.iOSFixedHeader}"
          ?visible="${this._openModal}"
          modal-type="${this.type}"
          title-icon="${R[this.icon]()}"
          title-text="${this.t(this.title)}"
          body-text="${this.t(this.bodyText)}"
          button-text="${this.t(this.buttonText)}"
          link-text="${this.t(this.linkText)}"
          @help-modal-veil-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.EXIT)}}
          @help-modal-footer-button-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.RETRY)}}
          @help-modal-footer-link-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.EXIT)}}
        >
        </bbva-help-modal>`}}class mt extends(it(j(at(e)))){static get is(){return"request-debit-card-failed-operation-modal"}static get scopedElements(){const t=[nt,mt.configurationScopedElements()];return mt.scopedElementsFromClasses(t)}static get properties(){return{icon:{type:String},titleText:{type:String},bodyText:{type:String},buttonText:{type:String}}}constructor(){super(),this.titleText="bbva-multistep-rdc-failed-operation",this.bodyText="bbva-multistep-rdc-try-later",this.buttonText="bbva-multistep-rdc-exit-button-label",this.icon="bbvaWarning"}static get styles(){return[lt,_("request-debit-card-modals-shared-styles")]}render(){return x`
        <bbva-help-modal
          .iOSFixedHeader="${this.iOSFixedHeader}"
          ?visible="${this._openModal}"
          modal-type="warning"
          title-icon="${R[this.icon]()}"
          title-text="${this.t(this.titleText)}"
          body-text="${this.t(this.bodyText)}"
          button-text="${this.t(this.buttonText)}"
          @help-modal-footer-button-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.EXIT)}}
          @help-modal-veil-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.EXIT)}}
        >
        </bbva-help-modal>`}}class ut extends(it(j(at(e)))){static get is(){return"request-debit-card-call-bbva-modal"}static get scopedElements(){const t=[nt,g,ut.configurationScopedElements()];return ut.scopedElementsFromClasses(t)}static get properties(){return{illustration:{type:String},headerText:{type:String},buttonText:{type:String},linkText:{type:String},bodyTitle:{type:String},bodyDescription:{type:String}}}constructor(){super(),this.illustration="error",this.headerText="bbva-multistep-rdc-service-error",this.buttonText="bbva-multistep-rdc-call-to-bbva-button-label",this.linkText="bbva-multistep-rdc-exit-button-label",this.bodyTitle="bbva-multistep-rdc-failed-operation",this.bodyDescription="bbva-multistep-rdc-unavailable-info-call-to-bbva"}static get styles(){return[lt,_("request-debit-card-modals-shared-styles")]}render(){return x`
    <bbva-help-modal
    .iOSFixedHeader="${this.iOSFixedHeader}"
    ?visible="${this._openModal}"
    header-text="${this.t(this.headerText)}"
    button-text="${this.t(this.buttonText)}"
    link-text="${this.t(this.linkText)}"
    header-type="modal"
    fixed-footer
    full-height
    @help-modal-header-right-primary-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1}}
    @help-modal-footer-button-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1,this.fireEvent(ht.CALL_BBVA)}}
    @help-modal-footer-link-click=${t=>{this.stopPropagationEvent(t),this._openModal=!1}}>
        <div class="custom-header" slot="slot-content-header">
            <div id="banner" class="call-bbva-header">     
                <div id="banner-call-bbva" slot='illustration' class="microillustration">${D[this.illustration]}
                </div>
                <bbva-text class="call-bbva-header__title" font-weight="500" text="${this.t(this.bodyTitle)}" size="M" alignment="center"></bbva-text>
                <bbva-text text="${this.t(this.bodyDescription)}" size="S" alignment="center"></bbva-text>
                </div>
        </div>
    </bbva-help-modal>
    `}}class vt extends(it(j(at(e)))){static get is(){return"bbva-multistep-request-debit-card"}static get scopedElements(){const t=[P,M,u,I,L,w,g,f,z,bt,pt,mt,ut,N,...vt.configurationScopedElements()];return vt.scopedElementsFromClasses(t)}static get properties(){return{banner:{type:Object},account:{type:String},address:{type:Object},infoList:{type:Array},hideButtonFixed:{type:Boolean},_hideNotificationStatus:{type:Boolean},_hideBanner:{type:Boolean}}}constructor(){super(),this.config={header:{id:"multistep-header",accessibilityTextIconRightPrimary:"header",variant:"modal",position:"fixed",text:"Solicitud de tarjeta física",iconRightPrimary:y()},loader:!0,notify:!1},this.account="",this.banner={image:"",text:""},this.infoList=[],this.address={address:"",unmasked:!1,buttonLabel:"",addressMasked:""},this.hideButtonFixed=!0,this._hideNotificationStatus=!0,this._hideBanner=!1}reset(t){t&&!t.value&&(this.multistep.stepsToReset=[0,1],this.steps.forEach(((t,e)=>{t.completed=!1,0===e?(t.active=!0,t.removeAttribute("disabled"),this.shadowRoot.querySelector("#btn-step-0").removeAttribute("disabled")):t.setAttribute("disabled","")})),this.address={address:"",unmasked:!1,buttonLabel:"",addressMasked:""},this.hideButtonFixed=!0,this._hideBanner=!1)}static get styles(){return[st,_("bbva-multistep-request-debit-card-shared-styles")]}setAddress(t){this.address={...t}}get multistep(){return this.shadowRoot.querySelector("[data-tag-name=bbva-expandable-multistep]")}get steps(){return Array.from(this.multistep.querySelectorAll("[data-tag-name=bbva-expandable-step]"))}openExitModal(){this.shadowRoot.querySelector("[data-tag-name=request-debit-card-exit-modal]").openModal()}openRetryModal(){this.shadowRoot.querySelector("[data-tag-name=request-debit-card-retry-modal]").openModal()}openFailedOperationModal(){this.shadowRoot.querySelector("[data-tag-name=request-debit-card-failed-operation-modal]").openModal()}openCallBbvaModal(){this.shadowRoot.querySelector("[data-tag-name=request-debit-card-call-bbva-modal]").openModal()}openNotificationStatus(){this._hideNotificationStatus=!1}closeNotificationStatus(){this._hideNotificationStatus=!0}_onEditStep(t){const{detail:e}=t;this._hideBanner=!!e,this.fireEvent(dt.EDIT_STEP,e)}_stepCompleted(t){const{target:e,detail:i}=t;this.fireEvent(ct.COMPLETED,{stepId:e.id,completed:i})}_allStepsCompleted(t){const{detail:e}=t;this.hideButtonFixed=!e,this.fireEvent(ct.ALL_STEPS_COMPLETED,e)}get renderItems(){return x`${this.infoList.map(((t,e)=>x`<div id=${`${t.id}-container`} class="info">
            ${e?this._renderHeaderCategory(`${t.id}-header`,"info__title",t.title):""}
            ${this._renderBullets(t.id,t.list)}
            </div>`))}`}_renderBullets(t,e){return x`${e.map(((e,i)=>x`<bbva-list-bullet
      id=${`${t}-bullet-${i}`}
      icon="${F()}">
      ${this.t(e)}
      </bbva-list-bullet>`))}`}_renderContinueButton(t,e,i){return x`
    <bbva-button-default
      id="${t}"
      variant="${e}"
      class="action"
      aria-label="${this.t(i)}"
      text="${this.t(i)}"
      @click="${this._nextStep}">
    </bbva-button-default>
    `}_renderNotificationMessage(t,e,i){return x`
    <bbva-notification-message
      id="${t}"
      icon="${B()}"
      message-title="${this.t(e)}"
      ink-title="Link">
      ${this.t(i)}
    </bbva-notification-message>
    `}_renderExpandableStep(t,e,i,a,s,o,r,n,l){return x`
    ${i}
    <bbva-expandable-step
      id="${t}"
      header="${this.t(e)}"
      step="${r}"
      edit-label="${this.t(a)}"
      disabled-target=".action"
      hide-padding-top
      @expandable-step-complete-change="${this._stepCompleted}"> 
      <div class="content">
      ${s}
      ${this._renderContinueButton(`btn-${t}`,n,l)}
      </div>
      <div class="summary" slot="summary">
        ${o}
      </div>
    </bbva-expandable-step>
    `}_renderHeaderCategory(t,e,i){return x`
      <bbva-header-category
        id="${t}"
        aria-label="${this.t(i)}"
        class="${e}"
        text="${this.t(i)}">
      </bbva-header-category>
    `}_nextStep({target:t}){this._hideBanner=!0,t.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0})),this.fireEvent(dt.CONTINUE_STEP,t.id),this.fireEvent(`${dt.CONTINUE_BUTTON}-${t.id}`)}get stepInformation(){const t=x`
    <div id="banner" class="banner" .hidden="${this._hideBanner}">
        <div id="banner-image" slot='illustration' class="microillustration">${D[this.banner.image]}</div>
        <p slot="description" id='banner-title' class="banner__title" aria-label="${this.t(this.banner.text)}">${this.t(this.banner.text)}</p>
    </div>
    `,e=x`
        ${this.renderItems}
        ${this._renderNotificationMessage("message-step-0","","bbva-multistep-rdc-message-info")}
    `,i=x`
    ${this._renderBbvaText("summary-text-step-0","info__summary-text","label",this.t("bbva-multistep-rdc-summary-step-0-text"),"#ffffff","400","M")}
    `;return this._renderExpandableStep("step-0","bbva-multistep-rdc-feature-title",t,"bbva-multistep-rdc-consult-step-button",e,i,0,"positive","bbva-multistep-rdc-continue-step-first-button")}_renderBbvaText(t,e,i,a,s,o,r){return x`
    <bbva-text
      id="${t}"
      class="${e}"
      font-weight="${o}"
      text-color="${s}"
      tag="${i}"
      aria-label="${this.t(a)}"
      text="${this.t(a)}"
      size="${r}"></bbva-text>
    `}get addressInfo(){return x`
    <div class="address">
      ${this._renderBbvaText("address-title","address__title","label","bbva-multistep-rdc-address-info-subtitle","#121212","400","M")}
      ${this._renderBbvaText("address-subtitle","address__subtitle","label","bbva-multistep-rdc-address-info","#666666","400","M")}
      <div class="address__content">
        <div class="address__content-text">
        ${this._renderBbvaText("address-content","address__info","label",this.address.address,"#121212","400","M")}
        </div>
        <div class="address__content-button">
          <bbva-link
            id="btn-show-hide-address"
            aria-label="${this.t(this.address.buttonLabel)}"
            @click="${()=>this.fireEvent(dt.SHOW_HIDE_ADDRESS,this.address)}">
            ${this.t(this.address.buttonLabel)}
          </bbva-link>
        </div>
      </div>
    </div>
    `}get stepAddressInformation(){const t=x`
    ${this.addressInfo}
    `,e=x`
    ${this._renderBbvaText("summmary-text1-step-1","info__summary-text","label","bbva-multistep-rdc-address-info","#ffffff","400","M")}
    ${this._renderBbvaText("summmary-text2-step-1","info__summary-text","label",this.address.addressMasked,"#ffffff","400","M")}
    `;return this._renderExpandableStep("step-1","bbva-multistep-rdc-address-info-title","","bbva-multistep-rdc-consult-step-button",t,e,1,"primary","bbva-multistep-rdc-continue-button")}get modals(){return x`
    <request-debit-card-exit-modal .iOSFixedHeader="${this.iOSFixedHeader}">
    </request-debit-card-exit-modal>
    <request-debit-card-retry-modal .iOSFixedHeader="${this.iOSFixedHeader}">
    </request-debit-card-retry-modal>
    <request-debit-card-failed-operation-modal .iOSFixedHeader="${this.iOSFixedHeader}">
    </request-debit-card-failed-operation-modal>
    <request-debit-card-call-bbva-modal .iOSFixedHeader="${this.iOSFixedHeader}">
    </request-debit-card-call-bbva-modal>
    `}get panelButtonFixed(){return x`
    <bbva-panel-button-fixed
        button-text="${this.t("bbva-multistep-rdc-request-button")}"
        button-class="positive"
        show
        sticky
        .hidden="${this.hideButtonFixed}"
        >
      </bbva-panel-button-fixed>
    `}get notification(){return x`
    <bbva-notification-status
    variant="no-icon"
    status="error"
    ?hide=${this._hideNotificationStatus}
    fixed-bottom=""
    transition-translate-y="">
    ${this.t("bbva-multistep-rdc-notification-status")}
    </bbva-notification-status>
    `}render(){return x`
    <div @header-main-icon-right-primary-click=${t=>{this.stopPropagationEvent(t),this.openExitModal()}}>
    ${super.render()}
    </div>
      <bbva-expandable-multistep hide-step-numbers="" class="scrollable"
        step-selector='[data-tag-name="bbva-expandable-step"]'
        @expandable-multistep-all-complete="${this._allStepsCompleted}"
        @expandable-step-edit-step="${this._onEditStep}">
        ${this.stepInformation}
        ${this.stepAddressInformation}
      </bbva-expandable-multistep>
      ${this.panelButtonFixed}
      ${this.modals}
      ${this.notification}
    `}}customElements.define(vt.is,vt),customElements.define(bt.is,bt),customElements.define(pt.is,pt),customElements.define(mt.is,mt),customElements.define(ut.is,ut);class gt extends e{static get is(){return"bbva-analyticmanager-request-debit-card"}static get properties(){return{data:{type:Object},footprint:{type:Object}}}constructor(){super(),this.data={},this.footprint={GET_CARD_OFFER:"error detalle de oferta",CUSTOMER_DETAIL:"error contact details",CUSTOMER_ADDRESSES:"error direccion",CREATE_CARD:"error solicitud tarjeta"}}setPersistData(t={}){this.data={...this.data,...t}}firePageVisit(){this.fireEvent(Q.PAGE_VISIT)}fireSteps(t=""){const e={"btn-step-0":Q.APP_STARTED,"btn-step-1":Q.APP_STEP_2};e[t]&&this.fireEvent(e[t])}fireRequest(){this.fireEvent(Q.APP_STEP_3)}fireStepOTP(){this.fireEvent(Q.APP_STEP_4)}fireAppCompleted(t={}){if(0!==Object.keys(t).length){const{operationNumber:e,operationDate:i}=t;this.setPersistData({operationNumber:e,operationDate:i}),this.fireEvent(Q.APP_COMPLETED,this.data)}}showAddressFootprint(){this.fireEvent(Q.FOOTPRINT.SHOW_ADDRESS)}otpFootprint(){this.fireEvent(Q.FOOTPRINT.DYNAMIC_ERROR,{errorPage:"error otp"})}dynamicErrorFootprint(t=""){this.footprint[t]&&this.fireEvent(Q.FOOTPRINT.DYNAMIC_ERROR,{errorPage:this.footprint[t]})}failedOperationFootprint(){this.fireEvent(Q.FOOTPRINT.FAILED_OPERATION)}fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}}customElements.define(gt.is,gt);
