import{L as t,z as e,a8 as a,ac as i,ab as s,ad as o,ar as n,a9 as l,aa as r,a as d,an as c,cR as p,bU as h,F as m,ag as u,b6 as b,bF as g,ak as v,cS as f,b0 as x,h as _,av as y,aD as S,ah as $,aN as C,ai as T}from"./952f98a9.js";import{a$ as E}from"./7f3d7ca9.js";import"./7ee23eb7.js";import{B as A}from"./bee1f904.js";import"./216055dc.js";import"./af658024.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";class P extends t{static get is(){return"bbva-analytics-manager-user-documentation-tax-data"}static get properties(){return{steps:{type:Object}}}constructor(){super(),this.steps={}}fireAppVisit(){this._dispatchEvent("analytics-app-page-visit")}fireAppStarted(t){const e=t?"constancia de situacion fiscal sat":"entendido";this._dispatchEvent("analytics-app-started",{detail:e})}fireAppStep2(){this._dispatchEvent("analytics-app-step-2")}fireAppStep3(){this._dispatchEvent("analytics-app-step-3")}fireAppStep4(){this._dispatchEvent("analytics-app-step-4")}fireAppStep5(t){t&&this._dispatchEvent("analytics-app-step-5")}fireAppCompleted(t){this._dispatchEvent("analytics-app-completed",t)}fireHuellaPageView(){this._dispatchEvent("analytics-huella-page-view",!0)}fireHuellaGenericError(){this._dispatchEvent("analytics-huella-generic-error")}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}}customElements.define(P.is,P);class D extends t{static get is(){return"bbva-manager-user-documentation-tax-data"}static get properties(){return{customerId:{type:String},customerContact:{type:String},customerTaxData:{type:Object},externalUrl:{type:String},updatedCustomerInfo:{type:Object},_fiscalRegimeRecords:{type:Array},_usesRecords:{type:Array},_listPlacesByPostalCode:{type:Object},_fiscalRegimeCatalogId:{type:String},_usesCatalogId:{type:String},featureFlagCollection:{type:Object},isGlobalApp:{type:Boolean}}}constructor(){super(),this.customerId="",this.customerTaxData={},this.externalUrl="",this.updatedCustomerInfo={},this.customerContact="",this.featureFlagCollection={},this._fiscalRegimeRecords=[],this._usesRecords=[],this._listPlacesByPostalCode={},this._fiscalRegimeCatalogId="07100074E",this._usesCatalogId="07110074E",this.isGlobalApp=!1}getCustomerDataFromPush(t){this._openVeil(),this.customerId=t;const e={"customer-id":t};this._dispatchEvent("glomo-user-documentation-request-tax-data",e)}handleGetCustomerTaxData(t){this.getUserDocumentationTaxData({customerId:this.customerId,customerTaxData:t}),this._closeVeil()}getUserDocumentationTaxData(t){this.customerId=t.customerId,this.customerTaxData=t.customerTaxData,this._setMainModalItems(),this._dispatchEvent("manager-tax-data-set-customer-id",this.customerId)}getPreloadData(){this._openVeil(),this._requestCustomerAddresses(),this._requestCatalogRecords([{id:this._fiscalRegimeCatalogId},{id:this._usesCatalogId}]),this._setAddressData()}_setMainModalItems(){this._dispatchEvent("manager-tax-data-set-main-modal-items",{benefits:[{id:"beneficios01",value:"user-documentation-tax-data-validate"},{id:"beneficios02",value:"user-documentation-tax-data-requirement-sat"},{id:"beneficios03",value:"user-documentation-tax-data-fiscal-dates"}],requirements:[{id:"necesidades01",value:"user-documentation-tax-data-cfdi"},{id:"necesidades02",value:"user-documentation-tax-data-regime-sat"}]}),this._dispatchEvent("main-open-modal",!0)}_setAddressData(){this._dispatchEvent("manager-tax-data-set-address-data",this._getCustomerTaxAddress(this.customerTaxData))}_requestCatalogRecords(t){this._openVeil(),this._dispatchEvent("manager-tax-data-request-catalog-records",t)}handleSuccessCatalogRecords(t){const{customer:e,identityDocument:a,taxRegimes:i}=this.customerTaxData,{firstName:s,lastName:o,secondLastName:n}=e,l=i[0].id,r=i[0].uses[0].id;this._fiscalRegimeRecords=t[this._fiscalRegimeCatalogId.toLowerCase()],this._usesRecords=t[this._usesCatalogId.toLowerCase()];const d=this._fiscalRegimeRecords.map((t=>({id:t.id,label:t.descriptions[0].value,selected:t.id===l}))),c=this._usesRecords.map((t=>({id:t.id,label:t.descriptions[0].value,selected:t.id===r}))),p={fullName:`${s} ${o} ${n}`,rfc:a.documentNumber,fiscalRegimenOptions:d,cfdiOptions:c,step:2};this._dispatchEvent("manager-tax-data-set-personal-data",p),this._closeVeil()}requestGeographicListPlaces(t){var e;(null===(e=this.featureFlagCollection["glomo.profile.taxDataGeographicPlacesV1"])||void 0===e?void 0:e.value)||!1?this._requestGeographicListPlacesV1({zipCode:t,"catalog.id":"SAT","geographicPlaceType.id":"COLONY"}):this._dispatchEvent("request-geographic-list-places",t),this._openVeil()}_requestGeographicListPlacesV1(t){this._dispatchEvent("request-geographic-list-places-zip-code",t)}handleSuccessListPlaces(t){let e=[];t&&(e=t.map((t=>{const{geographicPlaceTypes:e,state:a}=t,i=e.find((t=>"MUNICIPALITY"===t.id));return{id:t.id,name:t.name,municipality:i,state:a}})),this._listPlacesByPostalCode=e),this._dispatchEvent("manager-tax-data-set-list-places",e),this._closeVeil()}handleErrorGeoCloseListPlaces(){this._dispatchEvent("manager-tax-data-set-list-places",[]),this._closeVeil()}_openVeil(){this._dispatchEvent("open-control-veil")}_closeVeil(){this._dispatchEvent("close-control-veil")}_getCustomerTaxAddress(t){const{addressComponents:e}=t.address&&t.address.location||[];if(e){const t=this._getAddressTaxDataComponentName(e,"STREET"),a=this._getAddressTaxDataComponentName(e,"EXTERIOR_NUMBER"),i=this._getAddressTaxDataComponentName(e,"INTERIOR_NUMBER"),s=this._getAddressTaxDataComponentName(e,"COLONY"),o=this._getAddressTaxDataComponentName(e,"MUNICIPALITY"),n=this._getAddressTaxDataComponentName(e,"ESTATE");return{street:t,extNum:a,intNum:i,postalCode:this._getAddressTaxDataComponentName(e,"ZIP_CODE"),neighborhood:s,municipality:o,state:n}}return[]}_getAddressTaxDataComponentName(t,e){return t.find((t=>t&&t.componentTypes&&t.componentTypes[0]===e)).name||""}openExternalLink(){this.isGlobalApp?this._launchSATWeb():this._dispatchEvent("navigate-to-external-link",{link:this.externalUrl})}_launchSATWeb(){this._dispatchEvent("logout-global-app"),this._dispatchEvent("navigate-to-external-sat-link",{scheme:this.externalUrl,packageId:null})}onConfirmUpdateTaxData(){this._openVeil();const{identityDocument:t}=this.customerTaxData,{personalData:e}=this.updatedCustomerInfo,a=e.fiscalRegimenOptions.find((t=>!0===t.selected)),i=e.cfdiOptions.find((t=>!0===t.selected)),s={customer:this._getUpdatedCustomerName(),identityDocument:t,address:this._formatUpdatedAddress(),taxRegimes:[{id:a.id,uses:[{id:i.id}]}]};this._dispatchEvent("manager-tax-data-request-update-data",s)}_getUpdatedCustomerName(){let{firstName:t,lastName:e,secondLastName:a}=this.customerTaxData.customer;const{personType:i}=this.customerTaxData.customer,{fullName:s}=this.updatedCustomerInfo.personalData,o=s.trim().split(" "),n=e.split(" ").length,l=a.split(" ").length;let r=[];for(let i=o.length;i>=0;i-=1)r.push(o[i]),i===o.length-l?(a=r.reverse().join(" "),r=[]):i===o.length-l-n?(e=r.reverse().join(" "),r=[]):0===i&&(t=r.reverse().join(" "));return{personType:i,firstName:t,lastName:e,secondLastName:a}}successPatchCustomerData(t){const{customer:e,taxRegimes:a,identityDocument:i}=t,{firstName:s,lastName:o,secondLastName:n}=e,l=a[0].id,r=a[0].uses[0].id,d=this._fiscalRegimeRecords.find((t=>t.id===l)),c=this._usesRecords.find((t=>t.id===r)),p=this.customerContact.substring(this.customerContact.indexOf("@")-3),{street:h,extNum:m,intNum:u,postalCode:b,neighborhood:g,municipality:v,state:f}=this._getCustomerTaxAddress(t),x={mainIcon:{src:"./images/Illustration.svg",info:"Operation Success"},mainTitle:{key:"user-documentation-tax-data-successful-response-operation-save-title",value:new Date,class:"bold"},additionalInfo:[{key:"user-documentation-tax-data-successful-response-operation-info",class:"spacing-top spacing"},{key:i.documentType.id,value:i.documentNumber,class:"spacing"},{key:"user-documentation-tax-data-successful-response-operation-full-name",value:`${s} ${o} ${n}`,class:"spacing"},{key:"user-documentation-tax-data-successful-response-operation-fiscal-regime",value:d&&d.descriptions[0].value||"",class:"spacing"},{key:"user-documentation-tax-data-successful-response-operation-cfdi",value:c&&c.descriptions[0].value||"",class:"spacing"},{key:"user-documentation-tax-data-successful-response-operation-fiscal-address",value:`${h} N.${m} ${u}, ${g}, ${b}, ${v}, ${f}`,class:"spacing"}],bottomMessage:{type:"info",text:"user-documentation-tax-data-successful-response-message-info",value:"correo",icon:"coronita:info",maskedMessage:{class:"bold",visibleChars:12,text:p.toLowerCase(),maskChars:"&bull;"}},buttons:{primary:{text:"user-documentation-tax-data-successful-response-button-next",action:"go-to-next"},secondary:{hidden:!0}}};this._dispatchEvent("manager-tax-data-update-customer-data-success",x),this._dispatchEvent("manager-tax-data-operation-number",{operationNumber:i.documentNumber.toLowerCase()}),this._dispatchEvent("manager-tax-data-reset-multistep"),this._closeVeil()}_formatUpdatedAddress(){const{addressData:t}=this.updatedCustomerInfo,{street:e,extNum:a,intNum:i,neighborhood:s,municipality:o,postalCode:n,state:l}=t,r=this._listPlacesByPostalCode.find((t=>t.state.name===l)).state.id,d={location:{addressComponents:[{componentTypes:["ESTATE"],code:r,name:r},{componentTypes:["COLONY"],code:s,name:s},{componentTypes:["STREET"],code:e,name:e},{componentTypes:["EXTERIOR_NUMBER"],code:a,name:a},{componentTypes:["INTERIOR_NUMBER"]},{componentTypes:["MUNICIPALITY"],code:o,name:o},{componentTypes:["ZIP_CODE"],code:n,name:n}]}};return i&&(d.location.addressComponents[4].code=i,d.location.addressComponents[4].name=i),d}handlePatchCustomerDataError(t){const e={code:"tax-data-modal-error",selectedConfig:{className:"error",openMaximized:!1,iconOnlyFullHeight:!0,acceptBtLabel:"Reintentar",cancelBtLabel:"Salir",template:{type:"paragraphs",values:[{icon:"coronita:alert",type:"error",text:"invalidParameters"===(t&&t.messages?t.messages[0].code:"default")?"user-documentation-tax-data-error-message-service":"user-documentation-tax-data-error-message"}]}}};this._dispatchEvent("manager-tax-data-update-customer-data-error",e),this._closeVeil()}_requestCustomerAddresses(){this.customerContact||this._dispatchEvent("manager-tax-data-set-customer-email",{customerId:this.customerId})}setCustomerMainEmail(t){this.customerContact=t[1].contact||""}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}}customElements.define(D.is,D),customElements.define(A.is,A);const N=new n;var R=e`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${a(l.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${a(l.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${a(l.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${a(l.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${a(l.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${a(l.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)})));
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
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${a(i.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(s.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${a(o.typeMedium)}));
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
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${a(i.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${a(o.typeSmall)}));
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
${N.mediaRules()}`;class I extends(d(c(p))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":h,"bbva-icon":m,"bbva-text":u,"bbva-header-main":E,"bbva-link":b}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=g(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),t.has("visible")){let t="close";this.visible&&(t="open"),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,R,v("bbva-help-modal-shared-styles"),f.light,x.light]}get _fixedIOSHeader(){return _`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?_`
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
        `:""}get helpModalContent(){return _`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?_`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:_`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":_`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return _`
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
            ${this.linkText?_`<bbva-link
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
    `}get helpModalTitle(){return _`
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
          ${this.titleText?_` <bbva-text
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
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t){this.dispatchEvent(new CustomEvent(`help-modal-${t}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(t)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return _`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${y({"half-height":!this.fullHeight})}"
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
    `}}customElements.define(I.is,I);var k=e`.main {
  height: 220px;
  color: #666666;
  margin-bottom: 2rem;
}

bbva-panel-info {
  width: 20rem;
  margin-bottom: 1rem;
}

bbva-header-category {
  padding-left: inherit;
  margin-top: 0.625rem;
  margin-bottom: 0.625rem;
}

bbva-link {
  cursor: pointer;
  color: #1973B8;
  font-weight: 500;
}

.content bbva-list-bullet {
  text-align: left;
}

[data-tag-name=bbva-panel-info] {
  --_panel-info-text-color: var(--colorsSecondary500, ${a(l.secondary500)});
}

.linkSat {
  margin: 25px;
  cursor: pointer;
}
`;const O=(t,e,a,i=!0,s=!0)=>{t.dispatchEvent(new CustomEvent(e,{detail:a,bubbles:i,composed:s}))};var M={SEND_FIRST_STEP_INFO:"personal-info-send-to-page",SEND_POSTAL_CODE_FOR_LIST_PLACES:"customer-fiscal-address-list-places",SEND_SECOND_STEP_INFO:"address-info-send-to-page",SEND_UPDATED_CUSTOMER_INFO:"send-updated-customer-info",SEND_UPDATE_PERSONAL_DATA:"send-update-personal-data",SEND_UPDATE_ADDRESS_DATA:"send-update-address-data",SEND_UPDATE_ADDRESS_LIST_PLACES:"send-update-address-list-places",OPEN_SPINNER:"open-spinner",CLOSE_SPINNER:"close-spinner"},w={FIRST_STEP_CONTINUE_BUTTON_PRESSED:"send-first-step-personal-data",FIRST_STEP_FISCAL_REGIMEN_INFO_MODAL_PRESSED:"open-fiscal-regimen-info-modal",FIRST_STEP_FISCAL_BUTTON_MODAL:"open-fiscal-regimen-tooltip-modal",SECOND_STEP_COMPLETED:"second-step-completed",SECOND_STEP_CONTINUE_BUTTON_PRESSED:"step-finished",THIRD_STEP_COMPLETED:"third-step-completed",RESET_MULTISTEP_EVENT:"reset-multistep-event"},F={OPEN_TAX_REGIMEN_MODAL:"open-tax-regimen-modal",OPEN_WARNING_INFO_MODAL:"open-warning-info-modal",OPEN_CONTINUE_STEP:"open-continue-step",OPEN_EXTERNAL_LINK:"tax-data-open-external-link",CLOSE_WARNING_INFO_MODAL:"close-warning-info-modal",CLOSE_MAIN_MODAL:"close-main-modal-event",APP_PAGE_VISIT:"launch-page-visit-event",EMPTY:"empty-event"};class L extends(c(t)){static get is(){return"bbva-multistep-request-fiscal-tax-modal-info"}static get properties(){return{image:{type:String},benefits:{type:Array},requirements:{type:Array},infoModalVisible:{type:Boolean}}}constructor(){super(),this.image="",this.benefits=[],this.requirements=[],this.infoModalVisible=!1}static get styles(){return[k,v("bbva-multistep-request-fiscal-tax-modal-info-shared-styles")]}_toogleMainModal(t=!0){this.infoModalVisible=!this.infoModalVisible;const e=t?F.OPEN_CONTINUE_STEP:F.CLOSE_MAIN_MODAL;O(this,e,!1)}_handleMainModalState({detail:t}){O(this,t?F.APP_PAGE_VISIT:F.EMPTY,!1)}_openExternalModal(){O(this,F.OPEN_WARNING_INFO_MODAL,!0)}render(){return _`
    <bbva-help-modal id="firstModal"
      ?visible= "${this.infoModalVisible}"
      full-height
      header-type="modal"
      header-text="${this.t("bbva-multistep-user-documentation-tax-data-modal-info-title")}"
      i-o-s-fixed-header
      hide-content-padding-top
      @help-modal-header-right-primary-click="${()=>this._toogleMainModal(!1)}"
      @visible-changed=${this._handleMainModalState}
    >
      <div class="main" slot="slot-title">
        <bbva-panel-info
          microillustration="verifieddocument"
          heading-level-title="h3"
          heading="${this.t("bbva-multistep-user-documentation-tax-data-modal-info-feature-title")}"
          text="${this.t("bbva-multistep-user-documentation-tax-data-modal-info-description")}">
        </bbva-panel-info>
      </div>
      <div class="content" slot="slot-content">
        <div>
          <bbva-header-category text="${this.t("bbva-multistep-user-documentation-tax-data-modal-info-benefits-title")}"></bbva-header-category>
          ${this.benefits.map((t=>_`<bbva-list-bullet class="${t.id}">${this.t(t.value)}</bbva-list-bullet>`))}
        </div>
        <div>
          <bbva-header-category text="${this.t("bbva-multistep-user-documentation-tax-data-modal-info-requirements-title")}"></bbva-header-category>
          ${this.requirements.map((t=>_`<bbva-list-bullet class="${t.id}">${this.t(t.value)}</bbva-list-bullet>`))}
        </div>
        <div class="linkSat">
          <bbva-link
            class="footer-button"
            @click="${()=>this._openExternalModal()}">
              ${this.t("bbva-multistep-user-documentation-tax-data-modal-info-link-text")}
          </bbva-link>
        </div>
        <div class="button">
          <bbva-button-default @click="${this._toogleMainModal}">${this.t("bbva-multistep-user-documentation-tax-data-modal-info-button-text")}</bbva-button-default>
        </div>
      </div>
    </bbva-help-modal>
    `}}customElements.define(L.is,L);var B=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.non-collapsed-container {
  display: flex;
}
.non-collapsed-container p {
  margin: 0.5rem 0;
}

bbva-notification-help {
  margin-bottom: 1.5rem;
}

.paragraph {
  display: block;
  margin: 0.5rem 0;
}
.paragraph span {
  display: block;
  margin: 0.5rem 0;
}

.form-container {
  margin: 1rem 0;
  display: block;
}
.form-container bbva-form-text {
  margin: 0.5rem 0;
}
.form-container bbva-form-select {
  margin: 1rem 0;
}

.center-button {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-top: 16px;
}

.three-step-content {
  display: block;
}
.three-step-content .default-content {
  padding: 0 16px;
}

.checkbox-data {
  margin-top: 1rem;
  margin-bottom: 32;
}

.three-text {
  padding-top: 8px;
}

.personal-data-continue-button {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.step-two-form-container {
  margin: 1rem 0;
  display: block;
}
.step-two-form-container bbva-form-text {
  margin: 0.5rem 0;
}
.step-two-form-container bbva-form-select {
  margin: 1rem 0;
}

.expandable-step-three {
  padding-bottom: 16px;
}

.three-step-checkbox {
  padding-bottom: 16px;
}

[data-tag-name=bbva-text].step-three-text {
  display: inline-flex;
  color: var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)});
}

[data-tag-name=bbva-core-icon] {
  margin-right: 0.3125rem;
}

#step-2 .summary p {
  margin-top: 0;
}
`;class U extends(c(t)){static get is(){return"bbva-multistep-request-fiscal-tax-modal-warning"}static get properties(){return{descriptionWarning:{type:String},threeModalVisible:{type:Boolean}}}constructor(){super(),this.descriptionWarning="",this.threeModalVisible=!1}static get styles(){return[B,v("bbva-multistep-user-documentation-tax-data-shared-styles")]}_handleWarningModalButttonClick(){O(this,F.OPEN_EXTERNAL_LINK)}_handleWarningModalLinkClick(){O(this,F.CLOSE_WARNING_INFO_MODAL)}render(){return _`
    <bbva-help-modal id="threeModal"
        ?visible= "${this.threeModalVisible}"
        full-height
        title-icon="${S()}"
        header-text="${this.t("bbva-multistep-user-documentation-tax-data-modal-warning-title")}"
        button-text="${this.t("bbva-multistep-user-documentation-tax-data-modal-warning-button")}"
        link-text="${this.t("bbva-multistep-user-documentation-tax-data-modal-warning-link")}"
        @help-modal-footer-button-click="${this._handleWarningModalButttonClick}"
        @help-modal-footer-link-click="${this._handleWarningModalLinkClick}">
        <div class="content" slot="slot-content">
          <div class= "descriptionText">
            <span class="text-content"> ${this.t("bbva-multistep-user-documentation-tax-data-modal-warning-description")} </span>
          </div>
        </div>
    </bbva-help-modal>
    `}}customElements.define(U.is,U);var q=e`:host {
  display: block;
  box-sizing: border-box;
}

bbva-help-modal {
  --bbva-help-modal-title-icon-color: var(--colorsPrimaryCore, #004481);
}

bbva-text {
  color: #121212;
  font-size: 16px;
  font-weight: 500;
  letter-spacing: 0;
  line-height: 24px;
  text-align: center;
}

.text-content {
  margin-bottom: 0;
}

[data-tag-name=bbva-help-modal] {
  transform: translateZ(0.01px);
}
`;class V extends(c(t)){static get is(){return"bbva-multistep-request-fiscal-tax-modal-catalogs"}static get properties(){return{titleTaxData:{type:String},descriptionTaxRegime:{type:String},titleTaxCfdi:{type:String},descriptionCfdi:{type:String},secondModalVisible:{type:Boolean}}}constructor(){super(),this.titleTaxData="",this.descriptionTaxRegime="",this.titleTaxCfdi="",this.descriptionCfdi="",this.secondModalVisible=!1}static get styles(){return[q,v("bbva-multistep-user-documentation-tax-data-shared-styles")]}open(){this.secondModalVisible=!0}render(){return _`
    <bbva-help-modal id="secondModal"
        ?visible="${this.secondModalVisible}"
        full-height
        fixed-footer
        title-icon="${S()}"
        header-text="${this.t("bbva-multistep-user-documentation-tax-data-modal-catalogs-header-regimen")}"
        title-text="${this.titleTaxData}"
        button-text="${this.t("bbva-multistep-user-documentation-tax-data-modal-catalogs-button")}">
        <div class="content" slot="slot-content">
          <div class= "descriptionText">
            <span class="text-content"> ${this.descriptionTaxRegime} </span>
          </div>
          <bbva-text text="${this.titleTaxCfdi}" size="M"></bbva-text>
          <div class= "descriptionText">
            <span class="text-content"> ${this.descriptionCfdi} </span>
          </div>
        </div>  
      </bbva-help-modal>
    `}}customElements.define(V.is,V);var H=e`.non-collapsed-container {
  padding-right: 1.7rem;
  display: -webkit-box;
}

.paragraph {
  display: block;
  margin: 0.5rem 0;
}

.textRfc {
  color: #666666;
  display: block;
}

.summary__item-title {
  margin-top: 1rem;
}

bbva-notification-help {
  padding-left: 0;
  margin-bottom: 1rem;
}

.form-container {
  margin: 0;
  display: block;
}
.form-container bbva-form-text {
  margin: 0.5rem 0;
}
.form-container bbva-form-select {
  margin: 1rem 0;
}

.center-button {
  display: flex;
  padding-top: 0.5rem;
  flex-direction: column;
  align-items: center;
}
`;const z=`${S()}`,j=`${$()}`;class G extends(c(t)){static get is(){return"bbva-multistep-user-documentation-tax-data-personal-data"}static get properties(){return{collapsed:{type:Boolean},fullName:{type:String},rfc:{type:String},fiscalRegimenOptions:{type:Array},cfdiOptions:{type:Array},_visibleHelpModal:{type:Boolean}}}constructor(){super(),this.collapsed=!1,this.fullName="",this.rfc="",this.fiscalRegimenOptions=[],this.cfdiOptions=[],this._visibleHelpModal=!1}static get styles(){return[H,v("bbva-multistep-user-documentation-tax-data-shared-styles")]}_updateSelectedItem(t,e){return[...t].map((t=>({...t,selected:t.id===e})))}_changedTaxRegimen(t){const e=t.currentTarget,a=this._updateSelectedItem(this.fiscalRegimenOptions,e.value);this.fiscalRegimenOptions=a,O(this,M.SEND_UPDATE_PERSONAL_DATA,{property:"fiscalRegimenOptions",value:a})}_changedCfdiSelect(t){const e=t.currentTarget,a=this._updateSelectedItem(this.cfdiOptions,e.value);this.cfdiOptions=a,O(this,M.SEND_UPDATE_PERSONAL_DATA,{property:"cfdiOptions",value:a})}_updatedInput(t,e){const a=String(e.target.value).toUpperCase(),i={property:t,value:a};this[t]=a,O(this,M.SEND_UPDATE_PERSONAL_DATA,i)}get _selectedFiscalRegimenLabel(){return this.fiscalRegimenOptions.length&&this.fiscalRegimenOptions.find((t=>t.selected)).label}get _selectedCfdiLabel(){return this.cfdiOptions.length&&this.cfdiOptions&&this.cfdiOptions.find((t=>t.selected)).label}_onContinueFirstStep(){O(this,w.FIRST_STEP_CONTINUE_BUTTON_PRESSED)}_bbvaText(t){return _`
      <bbva-text
        text="${t?t.toUpperCase():""}"
        text-color="#FFFFFF"
        size="S"
        class="summary__item"
        unset>
      </bbva-text>
    `}_bbvaTextAsTitle(t,e="summary__item summary__item-title"){return _`
      <bbva-text
        text="${t}"
        font-weight="500"
        text-color="#FFFFFF"
        size="S"
        class="${e}"
        unset>
      </bbva-text>
    `}_openHelpModal(){this._visibleHelpModal=!0,O(this,w.FIRST_STEP_FISCAL_REGIMEN_INFO_MODAL_PRESSED,!0)}_closeHelpModal(){this._visibleHelpModal=!1,O(this,w.FIRST_STEP_FISCAL_BUTTON_MODAL)}_renderCollapsed(){const{_bbvaText:t,_bbvaTextAsTitle:e}=this;return _`
      ${e(this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-rfc-title"),"")}
      ${t(this.rfc)}

      ${e(this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-name-title"))}
      ${t(this.fullName)}

      ${e(this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-fiscal-regimen-first-title"))}
      ${t(this._selectedFiscalRegimenLabel)}

      ${e(this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-cfdi-second-text-title"))}
      ${t(this._selectedCfdiLabel)}
    `}get _modalTaxCatalogs(){return _`
       <bbva-multistep-request-fiscal-tax-modal-catalogs
       ?secondModalVisible="${this._visibleHelpModal}"
       .titleTaxData="${this.t("bbva-multistep-user-documentation-tax-data-modal-catalogs-title-regimen")}"
       .descriptionTaxRegime="${this.t("bbva-multistep-user-documentation-tax-data-modal-catalogs-description-regimen")}"
       .titleTaxCfdi="${this.t("bbva-multistep-user-documentation-tax-data-modal-catalogs-title-cfdi")}"
       .descriptionCfdi="${this.t("bbva-multistep-user-documentation-tax-data-modal-catalogs-description-cfdi")}"
       @help-modal-close="${this._closeHelpModal}"
       >
       </bbva-multistep-request-fiscal-tax-modal-catalogs>
     `}get _disabledButton(){const t=this.fiscalRegimenOptions.find((t=>t&&t.selected)),e=this.cfdiOptions.find((t=>t&&t.selected));return!(this.fullName&&t&&e)}_renderNonCollapsed(){return _`
    ${this._modalTaxCatalogs}
    <div class="non-collapsed-container">
      <p class="infoText">${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-description")}</p>
      <bbva-button-icon id="buttonInfo" variant="no-background" icon="${z}" @click="${()=>this._openHelpModal()}">
        Help
      </bbva-button-icon>
    </div>
    <div class="paragraph">
      <span class="textRfc">${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-rfc-title")}</span>
      <span>${this.rfc}</span>
    </div>
    <bbva-notification-help
      accessibility-label-icon="Info"
      icon="${j}"
      text="${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-verify-rfc")}" ></bbva-notification-help>
    <div class="form-container">
      <bbva-form-field
        id="formTextName"
        label="${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-name-title")}"
        required
        .value="${String(this.fullName).toUpperCase()}"
        allowed-pattern="${"[\\\\\\-_a-zA-ZñÑ .#&'$%\"()*+,/:;?@[\\\\\\]^`{|}~¡!¿<=>©áÁâÂäÄàÀéÉêÊëËèÈíÍîÎïÏìÌóÓôÔöÖòÒúÚûÛüÜùÙ]"}"
        validate-on-blur
        @input="${t=>this._updatedInput("fullName",t)}"
        pattern="${"[a-zA-ZñÑáÁâÂäÄàÀéÉêÊëËèÈíÍîÎïÏìÌóÓôÔöÖòÒúÚûÛüÜùÙ .\\-_#&'$%\"\\(\\)*+,\\/:;?@\\[\\]^`\\{\\|\\}~¡!¿<=>©\\\\]{1,284}"}">
      </bbva-form-field>
      <bbva-form-select
        label="${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-fiscal-regimen-first-title")}"
        id="taxRegimenSelect"
        required
        @change="${this._changedTaxRegimen}">
          ${this.fiscalRegimenOptions.map((t=>_`
              <bbva-form-option
                ?selected="${t.selected}"
                .value="${t.id}">
                ${this.t(t.label.toUpperCase())}
              </bbva-form-option>`))}
      </bbva-form-select>
      <bbva-form-select
        label="${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-cfdi-second-text-title")}"
        id="cfdiSelect"
        required
        @change="${this._changedCfdiSelect}">
          ${this.cfdiOptions.map((t=>_`
               <bbva-form-option
                 ?selected="${t.selected}"
                 .value="${t.id}">
                 ${this.t(t.label.toUpperCase())}
               </bbva-form-option>`))}
      </bbva-form-select>
    </div>
    <div class="center-button">
      <bbva-button-default
        id="firstStepButton"
        class="action u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
        text="${this.t("bbva-multistep-user-documentation-tax-data-first-step-continue-step-one-button")}"
        ?disabled="${this._disabledButton}"
        @click="${this._onContinueFirstStep}">
      </bbva-button-default>
    </div>
    `}render(){return this.collapsed?this._renderCollapsed():this._renderNonCollapsed()}}customElements.define(G.is,G);var W=e`.expandable-step-three {
  padding-top: 1.4375rem;
  padding-bottom: 1rem;
}

.three-step-content {
  display: block;
}

.three-step-content .default-content {
  padding: 0 1rem;
}

.three-step-checkbox {
  padding-bottom: 0.625rem;
  padding-top: 0.625rem;
}

.checkbox-data {
  margin-top: 1rem;
  margin-bottom: 2rem;
}

.three-text {
  padding-top: 0.5rem;
}

.buttonDissable {
  display: flex;
  margin: 4.375rem;
  margin-top: 1.75rem;
  padding: 1.625rem;
}
`;class Y extends(c(t)){static get is(){return"bbva-multistep-request-fiscal-confirm-checkbox"}static get properties(){return{accepted:{type:Boolean}}}constructor(){super(),this.accepted=!1}static get styles(){return[W,v("bbva-multistep-user-documentation-tax-data-shared-styles")]}_onContinue(){O(this,w.THIRD_STEP_COMPLETED)}_onCheckboxChanged(t){this.accepted=t.currentTarget.checked}render(){return _`
      <div class="three-step-content"> 
        <p class="three-text">${this.t("bbva-multistep-user-documentation-tax-data-terms-description")}</p>
        <bbva-form-checkbox
          class= "three-step-checkbox"
          name="check"
          @input="${this._onCheckboxChanged}"
          optional-label="${this.t("bbva-multistep-user-documentation-tax-data-terms-box")}">
        </bbva-form-checkbox>
        <bbva-notification-message
          class= "three-step-checkbox"
          message="${this.t("bbva-multistep-user-documentation-tax-data-terms-info")}">
        </bbva-notification-message>
        <div class="center-button">
          <bbva-button-default
            class="buttonDissable"
            text="${this.t("bbva-multistep-user-documentation-tax-data-terms-continue")}"
            .disabled="${!this.accepted}"
            @click="${this._onContinue}">
          </bbva-button-default>
        </div>
      </div>
    `}}customElements.define(Y.is,Y);var Z=e`.personal-data-continue-button {
  display: flex;
  flex-direction: column;
  align-items: inherit;
}

.step-two-form-container {
  margin: 1rem 0;
  display: block;
}
.step-two-form-container bbva-form-field {
  margin: 0.5rem 0;
}
.step-two-form-container bbva-form-select {
  margin: 1rem 0;
}

bbva-button-default {
  display: flex;
  margin: 4.375rem;
  margin-top: 1.75rem;
  padding: 1.625rem;
}
`;class X extends(c(t)){static get is(){return"bbva-multistep-user-documentation-tax-data-address-data"}static get properties(){return{completed:{type:Boolean},disabled:{type:Boolean},customerFiscalAddress:{type:Object},listPlacesPostalCode:{type:Array}}}constructor(){super(),this.customerFiscalAddress={street:"",extNum:"",intNum:"",postalCode:"",neighborhood:"",municipality:"",state:""},this.listPlacesPostalCode=[]}static get styles(){return[Z,v("bbva-multistep-user-documentation-tax-data-shared-styles")]}_onInputChanged(t,e){this.customerFiscalAddress={...this.customerFiscalAddress,[t]:e.currentTarget.value.toUpperCase()},O(this,M.SEND_UPDATE_ADDRESS_DATA,this.customerFiscalAddress)}_postalCodeChanged(t){const e=t.currentTarget.value;if(e&&5===e.length)this.listPlacesByPostalCode=[],O(this,M.SEND_UPDATE_ADDRESS_LIST_PLACES,this.listPlacesPostalCode),O(this,M.OPEN_SPINNER),O(this,M.SEND_POSTAL_CODE_FOR_LIST_PLACES,e);else{const t={...this.customerFiscalAddress,postalCode:e,neighborhood:"",municipality:"",state:""};this.customerFiscalAddress=t,this.listPlacesPostalCode=[],O(this,M.SEND_UPDATE_ADDRESS_DATA,this.customerFiscalAddress),O(this,M.SEND_UPDATE_ADDRESS_LIST_PLACES,this.listPlacesPostalCode)}}_onClearedPostalCode(){this.customerFiscalAddress={...this.customerFiscalAddress,postalCode:"",neighborhood:"",municipality:"",state:""}}_onNeighborhoodSelected(t){const e=t.currentTarget.value,a=this.listPlacesPostalCode.find((t=>t.name===e));this.customerFiscalAddress={...this.customerFiscalAddress,neighborhood:a.name,municipality:a.municipality.value,state:a.state.name},O(this,M.SEND_UPDATE_ADDRESS_DATA,this.customerFiscalAddress)}_onContinue(){O(this,w.SECOND_STEP_COMPLETED)}get wasListPlacesFetched(){return this.listPlacesPostalCode.length}get invalidPostalCode(){return 5===this.customerFiscalAddress.postalCode.length&&0===this.listPlacesPostalCode.length}get disabledButton(){const t=["intNum"],e=Object.keys(this.customerFiscalAddress).filter((e=>!t.includes(e))).reduce(((t,e)=>(t[e]=this.customerFiscalAddress[e],t)),{});return!Object.values(e).every((t=>!!t))}_fiscalAddressStreetField(){return _`
      <bbva-form-field
        id="fiscal-address-street"
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-street")}"
        .value="${this.customerFiscalAddress.street}"
        @input="${t=>this._onInputChanged("street",t)}"
        allowed-pattern="^[a-zA-ZÑñ &#\.\-\_]+$"
        pattern="[A-ZÑñ &#\.\-\_]*$"
        required>
      </bbva-form-field>`}_fiscalAddressExtNumField(){return _`
      <bbva-form-field
        id="fiscal-address-ext-num"
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-ext-num")}"
        .value="${this.customerFiscalAddress.extNum}"
        @input="${t=>this._onInputChanged("extNum",t)}"
        allowed-pattern="[-_a-zA-ZÑñ .#0-9]"
        required>
      </bbva-form-field>`}_fiscalAddressIntNumField(){return _`
      <bbva-form-field
        id="fiscal-address-int-num"
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-int-num")}"
        value="${this.customerFiscalAddress.intNum}"
        allowed-pattern="[-_a-zA-ZÑñ .#0-9]"
        @input="${t=>this._onInputChanged("intNum",t)}"
        optional-label="${this.t("bbva-multistep-user-documentation-tax-data-form-field-optional-label")}">
      </bbva-form-field>`}_fiscalAddressPostalCodeField(){return _`
      <bbva-form-field
        id="fiscal-address-postal-code"
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-postal-code")}"
        .value="${this.customerFiscalAddress.postalCode}"
        @input="${this._postalCodeChanged}"
        @form-field-input-clear="${this._onClearedPostalCode}"
        allowed-pattern="${"^[0-9]+$"}"
        maxlength="${5}"
        ?invalid="${this.invalidPostalCode}"
        error-icon=${C()}
        error-message="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-postal-code-notfound")}"
        required>
      </bbva-form-field>`}_fiscalAddressSelectNeighborhood(){return _`${this.listPlacesPostalCode.length?_`
      <bbva-form-select
        id="fiscal-address-neighborhood"
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-neighborhood")}"
        .value="${this.customerFiscalAddress.neighborhood}"
        @change="${this._onNeighborhoodSelected}"
        ?disabled="${!this.wasListPlacesFetched}"
        required>
          ${this.listPlacesPostalCode.map((t=>_`
          <bbva-form-option 
            ?selected="${t.name===this.customerFiscalAddress.neighborhood}" 
            .value="${t.name}">
              ${t.name}
          </bbva-form-option>
          `))}
      </bbva-form-select>
    `:_`
      <bbva-form-select
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-neighborhood")}"
        disabled
        required>
      </bbva-form-select>
      `}`}_fiscalAddressMunicipalityField(){return _`
      <bbva-form-field
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-municipality")}"
        .value="${this.customerFiscalAddress.municipality}"
        readonly
        ?disabled="${!this.wasListPlacesFetched}">
      </bbva-form-field>`}_fiscalAddressStateField(){return _`
      <bbva-form-field
        label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-state")}"
        .value="${this.customerFiscalAddress.state}"
        readonly
        ?disabled="${!this.wasListPlacesFetched}">
      </bbva-form-field>`}render(){return _`
      <p>${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-instructions")}</p>
      <div class="step-two-form-container">
        ${this._fiscalAddressStreetField()}
        ${this._fiscalAddressExtNumField()}
        ${this._fiscalAddressIntNumField()}
        ${this._fiscalAddressPostalCodeField()}
        ${this._fiscalAddressSelectNeighborhood()}
        ${this._fiscalAddressMunicipalityField()}
        ${this._fiscalAddressStateField()}
      </div>
      <div class="center-button">
        <bbva-button-default
          variant="primary"
          text="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-button-continue")}"
          @click="${this._onContinue}"
          ?disabled="${this.disabledButton}">
        </bbva-button-default>
      </div>
    </div>
    `}}customElements.define(X.is,X);class K extends(c(t)){static get is(){return"bbva-multistep-user-documentation-tax-data"}static get properties(){return{mainModalItems:{type:Object},personalData:{type:Object},firstStepCompleted:{type:Boolean},addressData:{type:Object},secondStepCompleted:{type:Boolean},listPlacesByPostalCode:{type:Array},thirdStepCompleted:{type:Boolean},message:{type:String},_openModalWarning:{type:Boolean},openMainModalInfo:{type:Boolean},_onResetStep:{type:Array},stepActive:{type:Number},isResetComponent:{type:Boolean}}}constructor(){super(),this.mainModalItems={benefits:[],requirements:[]},this.personalData={fullName:"",rfc:"",fiscalRegimenOptions:[],cfdiOptions:[]},this.firstStepCompleted=!1,this.addressData={street:"",extNum:"",intNum:"",postalCode:"",neighborhood:"",municipality:"",state:""},this.listPlacesByPostalCode=[],this.secondStepCompleted=!1,this.thirdStepCompleted=!1,this._openModalWarning=!1,this.openMainModalInfo=!1,this._onResetStep=[],this.stepActive=void 0,this.isResetComponent=!1}static get styles(){return[B,v("bbva-multistep-user-documentation-tax-data-shared-styles")]}updated(t){super.updated(t);(t.has("stepActive")||t.has("isResetComponent"))&&[0,1,2].includes(this.stepActive)&&!this.isResetComponent&&O(this,`launch-fire-app-step-${this.stepActive}`,!1)}get _steps(){return Array.from(this.shadowRoot.querySelectorAll("bbva-expandable-step"))}_handleEvents(){this.isResetComponent=!1,this._handleSteps(),["expandable-step-edit-step","expandable-step-disable-change"].forEach((t=>{this.addEventListener(t,this._handleSteps)}))}_handleSteps(){let t=0;this._steps.forEach((t=>{t.active&&(this.stepActive=t.step)})),this._steps.forEach((e=>{e.completed&&(t+=1)})),3===t&&(this.stepActive=void 0)}setFirstStepData(t){t&&Object.keys(t).length>0&&(this.personalData={...t})}setSecondStepData(t){t&&Object.keys(t).length>0&&(this.addressData=t,t.postalCode&&(O(this,M.OPEN_SPINNER),O(this,M.SEND_POSTAL_CODE_FOR_LIST_PLACES,t.postalCode)))}_onPersonalDataStepContinue(){this._tooglePersonaldataStep(),this.disabledTaxAddressStep=!1}_onSecondStepContinue(){this._toogleAddressdataStep()}_tooglePersonaldataStep(){this.firstStepCompleted=!this.firstStepCompleted}_toogleAddressdataStep(){this.secondStepCompleted=!this.secondStepCompleted}_toogleTermsStep(){this.thirdStepCompleted=!this.thirdStepCompleted}_toggleFiscalSituationModal(){this._openModalWarning=!this._openModalWarning}_setPostalCode(t){this.addressData.postalCode=t.detail}_onInputPersonalData(t){const{property:e,value:a}=t.detail;this.personalData[e]=a}_onInputAddressData(t){this.addressData=t.detail}_onListPlacesChange(t){this.listPlacesByPostalCode=t.detail}_checkAllStepsCollapsed(){return this.firstStepCompleted&&this.secondStepCompleted&&this.thirdStepCompleted}_onAllStepsCompleted(){if(this._checkAllStepsCollapsed()){const{personalData:t,addressData:e}=this;O(this,M.SEND_UPDATED_CUSTOMER_INFO,{personalData:t,addressData:e})}}get fullAddress(){const{street:t,extNum:e,intNum:a,postalCode:i,neighborhood:s,municipality:o,state:n}=this.addressData,l=this.listPlacesByPostalCode.find((t=>t.name===s));return`${t} ${e} ${a}, ${i}, ${l&&l.name||""}, ${o}, ${n}`}_renderStepOne(){return _`
      <bbva-expandable-step
        id="step-1"
        step="1" total-steps="3"
        class="animation"
        disabled-target=".action"
        header="${this.t("bbva-multistep-user-documentation-tax-data-regimen-first-step-header")}"
        edit-label="${this.t("bbva-multistep-user-documentation-tax-data-first-step-personal-data-edit")}"
        .completed="${this.firstStepCompleted}"
        @expandable-step-edit-step="${this._tooglePersonaldataStep}">
          <div class="content">
            <bbva-multistep-user-documentation-tax-data-personal-data
              @send-first-step-personal-data="${this._onPersonalDataStepContinue}"
              @send-update-personal-data=${this._onInputPersonalData}
              fullName="${this.personalData.fullName}"
              rfc="${this.personalData.rfc}"
              .fiscalRegimenOptions="${this.personalData.fiscalRegimenOptions}"
              .cfdiOptions="${this.personalData.cfdiOptions}">
            </bbva-multistep-user-documentation-tax-data-personal-data>
          </div>
        <div class="summary" slot="summary">
          <bbva-multistep-user-documentation-tax-data-personal-data
            collapsed
            fullName="${this.personalData.fullName}"
            rfc="${this.personalData.rfc}"
            .fiscalRegimenOptions="${this.personalData.fiscalRegimenOptions}"
            .cfdiOptions="${this.personalData.cfdiOptions}">
          </bbva-multistep-user-documentation-tax-data-personal-data>
        </div>
      </bbva-expandable-step>
    `}_renderStepTwo(){return _`
    <bbva-expandable-step
      id="step-2"
      header="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-title")}"
      class="animation"
      step="2" total-steps="3"
      disabled="${this.secondStepCompleted}"
      disabled-target=".action"
      edit-label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-edit")}"
      @expandable-step-edit-step="${this._toogleAddressdataStep}"
      .completed="${this.secondStepCompleted}">
      <div class="content">
        <bbva-multistep-user-documentation-tax-data-address-data
          .listPlacesPostalCode="${this.listPlacesByPostalCode}"
          .customerFiscalAddress="${this.addressData}"
          @send-update-address-list-places="${this._onListPlacesChange}"
          @send-update-address-data="${this._onInputAddressData}"
          @second-step-completed="${this._onSecondStepContinue}"
          @customer-fiscal-address-list-places="${this._setPostalCode}">
        </bbva-multistep-user-documentation-tax-data-address-data>
      </div>
      <div class="summary" slot="summary">
        <p>${this.fullAddress}</p>
      </div>
    </bbva-expandable-step>
    `}_renderStepThree(){return _`
      <bbva-expandable-step
        id="step-3"
        step="3" total-steps="3"
        disabled="${this.thirdStepCompleted}"
        class="animation expandable-step-three"
        header="${this.t("bbva-multistep-user-documentation-tax-data-terms-title-label")}"
        .completed="${this.thirdStepCompleted}"
        edit-label="${this.t("bbva-multistep-user-documentation-tax-data-step-fiscal-address-edit")}"
        @third-step-completed="${this._toogleTermsStep}"
        @expandable-step-edit-step="${this._toogleTermsStep}">
          <div class="content three-content">
            <bbva-multistep-request-fiscal-confirm-checkbox
            id="multistepData">
            </bbva-multistep-request-fiscal-confirm-checkbox>
          </div>
          <div class="summary" slot="summary">
            <bbva-core-icon size="16" icon="${T()}" alt="Right"></bbva-core-icon>
            <bbva-text
              class="step-three-text"
              tag="span"
              font-weight="700"
              font-style="italic"
              text="${this.t("bbva-multistep-user-documentation-tax-data-terms-accepted-label")}">
            </bbva-text>
          </div>
        </div>
      </bbva-expandable-step>
    `}get _modals(){return _`
      <bbva-multistep-request-fiscal-tax-modal-info
        ?infoModalVisible="${this.openMainModalInfo}"
        .benefits="${this.mainModalItems.benefits}"
        .requirements="${this.mainModalItems.requirements}"
        @open-warning-info-modal="${this._toggleFiscalSituationModal}"
        @open-continue-step="${this._handleEvents}">
      </bbva-multistep-request-fiscal-tax-modal-info>
      <bbva-multistep-request-fiscal-tax-modal-warning
        ?threeModalVisible="${this._openModalWarning}"
        @close-warning-info-modal="${this._toggleFiscalSituationModal}"
        @help-modal-header-right-primary-click="${this._toggleFiscalSituationModal}"
        @tax-data-open-external-link="${this._toggleFiscalSituationModal}">
      </bbva-multistep-request-fiscal-tax-modal-warning>
    `}reset(){this.isResetComponent=!0,this._resetMultistepInfo(),this.stepActive=void 0,this.personalData={fullName:"",rfc:"",fiscalRegimenOptions:[],cfdiOptions:[]},this.firstStepCompleted=!1,this.secondStepCompleted=!1,this.thirdStepCompleted=!1,this.addressData={street:"",extNum:"",intNum:"",postalCode:"",neighborhood:"",municipality:"",state:""},this.listPlacesByPostalCode=[],this.openMainModalInfo=!1,this._onResetStep=[0,1,2],this.shadowRoot.querySelector("#multistepData").shadowRoot.querySelector("bbva-form-checkbox").checked=!1,this.shadowRoot.querySelector("bbva-multistep-request-fiscal-confirm-checkbox").accepted=!1,O(this,w.RESET_MULTISTEP_EVENT)}_resetMultistepInfo(){for(let t=0;t<this._steps.length;t+=1)this._steps[t].completed=!1,0!==this._steps[t].step?(this._steps[t].disabled=!0,this._steps[t].active=!1):(this._steps[t].disabled=!1,this._steps[t].active=!0)}render(){return _`
      ${this._modals}
      <bbva-expandable-multistep
      class="scrollable"
      has-animation
      .stepsToReset="${this._onResetStep}"
      @expandable-multistep-all-complete="${this._onAllStepsCompleted}">
        ${this._renderStepOne()}
        ${this._renderStepTwo()}
        ${this._renderStepThree()}
      </bbva-expandable-multistep>
  `}}customElements.define(K.is,K);
