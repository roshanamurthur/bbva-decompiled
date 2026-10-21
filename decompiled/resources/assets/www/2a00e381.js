import{z as e,a8 as t,ab as i,ac as a,ad as s,ar as r,a9 as o,aa as n,L as A,ak as l,b0 as c,h as d,i as E,H as O,ci as h,ch as S,f2 as R,eS as p,f3 as u,bK as T,a as C,an as m,bT as I,ag as g,U as b,aI as v,be as f,cs as N,af as L,aH as P,bF as F,dw as M,ah as V,aN as D,b6 as _,aD as y,bI as B,aF as U,ap as $,cl as x,ax as k,al as Y,bS as w,bx as G,aV as H,av as Q,bW as X,cD as J,b5 as Z,b4 as q,bU as j,J as z,aT as K,f4 as W,dA as ee,dB as te,au as ie,aS as ae,dS as se,dT as re,dU as oe,V as ne,bn as Ae,bX as le}from"./952f98a9.js";import{b as ce,B as de}from"./bee1f904.js";import"./b24c6aae.js";import{a as Ee,bo as Oe,o as he,cn as Se,c6 as Re,c7 as pe,c8 as ue,c9 as Te,q as Ce,a6 as me,cb as Ie,co as ge,cp as be,B as ve,ca as fe,cq as Ne,cr as Le,cs as Pe}from"./7f3d7ca9.js";import"./80e77ff5.js";import"./af658024.js";import"./5c324d17.js";import{B as Fe,b as Me}from"./055a082b.js";import{B as Ve}from"./a7a3928b.js";import"./1dedd9b3.js";import{ex as De,C as _e}from"./216055dc.js";import{B as ye}from"./1709aeaa.js";import"./751fa7b4.js";import{a as Be,B as Ue}from"./2f04bf54.js";import"./dac0f9dd.js";import"./ff2cdeea.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";const $e=new r;var xe=e`:host {
  --_list-editable-label-color: var(--bbva-list-editable-label-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_list-editicon-color: var(--bbva-list-editable-icon-color, var(--colorsPrimaryMedium, ${t(o.primaryMedium)}));
  display: flex;
  justify-content: space-between;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(i.book.fontWeight)});
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(s.typeSmall)});
  background-color: var(--bbva-list-editable-detail-bg-color, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)}));
  color: var(--bbva-list-editable-detail-color, var(--colorsSecondary600, ${t(o.secondary600)}));
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

.text {
  display: flex;
  flex-direction: column;
}

.label {
  color: var(--_list-editable-label-color);
}

.edit {
  display: flex;
  align-self: center;
}

.icon {
  color: var(--_list-editable-icon-color);
}
${$e.mediaRules()}`;class ke extends A{static get is(){return"bbva-list-editable"}static get properties(){return{listLabel:{type:String,attribute:"list-label"},listIcon:{type:String,attribute:"list-icon"},iconSize:{type:Number,attribute:"icon-size"},linkLabel:{type:String,attribute:"link-label"},hrefLink:{type:String,attribute:"href-link"},linkDisabled:{type:Boolean}}}constructor(){super(),this.iconSize=24,this.linkDisabled=!1}static get styles(){return[xe,l("bbva-list-editable-shared-styles"),c.light]}render(){return d`
      <div class="text">
        <div class="label">
          ${this.listLabel}
        </div>
        <div class="detail">
          <slot></slot>
        </div>
      </div>
      <div class="edit">
        <bbva-link
          ambient="light"
          href="${E(this.hrefLink)}"
          @click="${this._actionClick}"
          .disabled="${this.linkDisabled}"
        >
          ${this.listIcon?d`
                <span class="sr-only">${this.linkLabel}</span>
                <bbva-core-icon
                  class="icon"
                  .icon="${this.listIcon}"
                  .size="${this.iconSize}"
                ></bbva-core-icon>
              `:d`
                ${this.linkLabel}
              `}
        </bbva-link>
      </div>
    `}_actionClick(){this.dispatchEvent(new CustomEvent("list-editable-action-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(ke.is,ke);const Ye=O((e=>class extends e{_fireEvent(e,t,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:i,composed:a}))}_completeStep(e){this._fireEvent("complete",{detail:e})}}));var we=e`:host {
  --bbva-expandable-step-completed-step-border-color: var(--colorsPrimaryCoreLightened, #ffffff);
  --bbva-form-field-info-message-icon-color: var(--primaryCoreDark, #043263);
  --bbva-form-select-info-message-icon-color: var(--primaryCoreDark, #043263);
  display: block;
  box-sizing: border-box;
  --skeleton-quote-color: var(--bbva-list-action-skeleton-color, var(--colorsSecondary200, ${t(o.secondary200)}));
  --skeleton-quote-bg: var(--bbva-list-action-skeleton-bg, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-expandable-step[disabled] {
  --bbva-expandable-step-background-color: var(--_bbva-expandable-step-disabled-background-color, var(--colorsSecondary200, #E9E9E9));
  --bbva-list-editable-detail-bg-color: transparent;
}

bbva-expandable-step {
  --bbva-expandable-step-default-content-max-height: 1950px;
}

bbva-list-simple[variant=stacked] {
  --bbva-list-simple-label-color: var(--colorsSecondary500, #666666);
}

[ambient^=dark] bbva-list-simple[variant=stacked] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, #ffffff);
}

[ambient^=dark] {
  --bbva-text-color: var(--colorsPrimaryCoreLightened, #ffffff);
}

.summary__item {
  padding: 0.5rem 0;
}

.summary__divider {
  display: block;
  margin-left: -1rem;
}

.skeleton {
  height: 0;
  position: absolute;
  top: 0;
  left: 0;
  overflow: hidden;
  width: 100%;
  opacity: 0;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 100% 1rem, 60% 1rem, calc(100% + 2rem) 1rem;
  background-position: 0px 0px, 0px 1.5rem, 0px 3rem;
}
.skeleton::after {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  animation: pulse 1s ease-in-out infinite;
  background: linear-gradient(-60deg, transparent, white, transparent);
}

.address-container {
  position: relative;
}

:host([loading]) .skeleton {
  opacity: 1;
  height: 100%;
}

@keyframes pulse {
  0% {
    transform: translate3d(-100%, 0, 0);
  }
  100% {
    transform: translate3d(100%, 0, 0);
  }
}
`;const Ge={trash:`${h()}`,edit:`${S()}`,attached:`${R()}`,id:`${p()}`,image:`${u()}`,retry:`${T()}`};class He extends(C(m(Ye(A)))){static get is(){return"bbva-address-step-upgrade-account"}static get scopedElements(){const e=[ke,Fe,I,Ve,Ee,g,b];return He.scopedElementsFromClasses(e)}static get styles(){return[we,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}static get properties(){return{addressesData:{type:Object},customerDocumentsType:{type:Array},showProofAddressSelect:{type:Boolean},modalTitle:{type:String},buttonText:{type:String},municipalityOrMayoralty:{type:String},stateParagraph:{type:String},countryParagraph:{type:String},street:{type:String},externalNumber:{type:String},interiorNumber:{type:String},postalCode:{type:String},neighborHoodList:{type:Array},state:{type:String},country:{type:String},_hideUnmaskAddressBt:{type:Boolean},_uploadConfig:{type:Object},_manageUploadConfig:{type:Object},receiptStatus:{type:String},mediaCapture:{type:Object},_date:{type:String},continueEnabled:{type:Boolean},inputDateValidation:{type:Object},_invalidDate:{type:Boolean},hideUnmaskedAddress:{type:Boolean},showAddressTitle:{type:String},reset:{type:Boolean},defaultIndexType:{type:Number},datePickerData:{type:Object},loading:{type:Boolean}}}set showProofAddressSelect(e){const t=this._showProofAddressSelect;this._showProofAddressSelect=e,this.requestUpdate("showProofAddressSelect",t)}get showProofAddressSelect(){return this._showProofAddressSelect}constructor(){super(),this.loading=!1,this.mediaCapture={},this.customerDocumentsType=[],this.showProofAddressSelect=!1,this.addressesData={},this.inputDate="",this.dateValidate=!1,this.dateYearNow="",this.dateLimitMonthsArray="",this.dateLimitMax="",this.inputValidity="",this.country="Mexico",this._uploadConfig={},this._manageUploadConfig={pending:{mainTitle:"upgrade-account-media-capture-default-title",spinnerLoading:!1,descriptionBadgeText:"",badgeType:"default",actionIconRight:"",icon:Ge.attached,noLink:!1,description:""},success:{mainTitle:"",spinnerLoading:!1,descriptionBadgeText:"upgrade-account-media-capture-success-bagde",badgeType:"success",actionIconRight:Ge.trash,icon:Ge.image,noLink:!1},error:{mainTitle:"upgrade-account-media-capture-default-title",spinnerLoading:!1,descriptionBadgeText:"upgrade-account-media-capture-retry",badgeType:"error",actionIconRight:Ge.retry,icon:Ge.image,noLink:!1,description:""},loading:{mainTitle:"upgrade-account-media-capture-default-title",descriptionBadgeText:"upgrade-account-media-capture-proccess",spinnerLoading:!0,noLink:!0,badgeType:"default",actionIconRight:"",icon:Ge.image,description:""}},this._invalidDate=!1,this.hideUnmaskedAddress=!1,this._errorInputDateMessage="Error",this.receiptStatus="pending",this._date="",this.continueEnabled=!1,this.inputDateValidation={},this.showAddressTitle="upgrade-account-multistep-address-data-text-action-link",this.reset=!1,this.defaultIndexType="",this.datePickerData={}}updated(e){if(e.has("receiptStatus")&&(this._uploadConfig={},this._uploadConfig=this._manageUploadConfig[this.receiptStatus||"pending"]),e.has("mediaCapture")&&this.onMediaCaptureSuccess(),e.has("inputDateValidation")&&this.onInputDateValidation(this.inputDateValidation),e.has("customerDocumentsType")&&this.customerDocumentsType.length>0){const e=this.customerDocumentsType;this.defaultIndexType=e.indexOf(e.find((e=>"026"===e.id)))}e.has("reset")&&this.reset&&(this.resetProcess(),this.reset=!1),e.has("showProofAddressSelect")&&this.receiveEvent(),e.has("datePickerData")&&this.onDatePicker()}resetProcess(){this.shadowRoot.querySelector("#proofAddress").selectedIndex=this.defaultIndexType,this.showProofAddressSelect=!1,this.hideUnmaskedAddress=!1,this._date=""}_renderAddressInfo(){const e=this.addressesData?d`
        ${this.addressesData.address},<br>
        C.P. ${this.addressesData.postalCode}, ${((this.addressesData||{}).colonies||{}).label}<br>
        ${this.addressesData.state} ${this.addressesData.country}`:"";return d`
      <bbva-text class="u-margin-bottom--0-5" text="${this.t("upgrade-account-multistep-address-data-text")}" size="S" unset></bbva-text>
      <bbva-list-simple
        id="maskButton"
        ?hidden="${this.hideUnmaskedAddress}"
        class="u-padding-left--0 u-padding-right--0"
        description-medium
        label-medium=""
        status=""
        status-accessibility-text="status decrease"
        .description="${this.t(this.showAddressTitle)}"
        label="${this.t("upgrade-account-multistep-address-info-title")}"
        description-link=""
        @list-simple-link-description-click="${this._showUnmaskedAddress}"></bbva-list-simple>
      <div class="address-container">
        <bbva-list-editable class="u-padding-left--0 u-padding-right--0" list-icon="${S()}" link-label="edit" @list-editable-action-click="${this._showModalAddress}">
          ${e}
        </bbva-list-editable>
        <div class="skeleton"></div>
      </div>
  `}_showUnmaskedAddress(){this._fireEvent("toggle-address-mask")}_renderProofAddressSelect(){return d`
      <bbva-text class="u-margin-bottom--0-5 u-margin-top--1" text="${this.t("upgrade-account-multistep-address-data-subtitle")}" size="S" font-weight="500" unset></bbva-text>
      <bbva-text class="u-margin-bottom--1" text="${this.t("upgrade-account-multistep-address-data-subtext")}" size="S" unset></bbva-text>
      <bbva-form-select
        class="u-margin-bottom--1-5"
        id="proofAddress"
        required
        label="${this.t("upgrade-account-multistep-address-data-selected")}"
        @change="${this._onProofAddressChanged}">
        ${(this.customerDocumentsType||[]).map((e=>d`
          <bbva-form-option ?selected="${"026"===e.id}" .value="${e.id}">
            ${this.t(e.name)}
          </bbva-form-option>
        `))}
      </bbva-form-select>
  `}_showModalAddress(){this._fireEvent("show-modal-address")}_onProofAddressChanged(e){const{value:t}=e.currentTarget;this.showProofAddressSelect="026"!==t,this.proofAddress=t,this._fireEvent("select-proof-option",t)}_onBlurDateValue(e){this._date=e.currentTarget.value,this._fireEvent("date-changed",e.currentTarget.value)}onInputDateValidation(e){this._invalidDate=e.invalid,this._errorInputDateMessage=e.message}_onProofAddressHidden(){const e=moment().format("YYYY-MM-DD");return this.showProofAddressSelect?d`
        <bbva-text class="u-margin-bottom--1" size="S" text="${this.t("upgrade-account-multistep-proof-address-text")}" unset></bbva-text>
        <bbva-form-date
          id="date"
          class="u-margin-bottom--1-5"
          label="${this.t("upgrade-account-multistep-proof-address-form-date-label")}"
          @form-field-input-blur="${this._onBlurDateValue}"
          max="${e}"
          .value="${this._date}"
          .invalid="${this._invalidDate}"
          validate-on-blur
          required
          error-message="${this._errorInputDateMessage}">
        </bbva-form-date>
        <bbva-text  class="u-margin-bottom--0-5" size="S" text="${this.t("upgrade-account-multistep-proof-address-bbva-text")}" unset></bbva-text>

        <bbva-list-action
          class="u-padding-right--0 u-padding-left--0"
          id="receipt"
          icon="${this._uploadConfig.icon}"
          main-title="${this.t(this._uploadConfig.mainTitle)}"
          ?spinner-loading="${this._uploadConfig.spinnerLoading}"
          description="${this._uploadConfig.description}"
          description-badge-text="${this._uploadConfig.descriptionBadgeText}"
          badge-type="${this._uploadConfig.badgeType}"
          action-icon-right="${this._uploadConfig.actionIconRight}"
          @list-action-title-click="${this._showOptionMediaCapture}"
          @list-action-right-icon-click="${this._onClickListActionRightIcon}">
        </bbva-list-action>
      </div>
    `:""}_onClickListActionRightIcon(){"retry"===("success"===this.receiptStatus?"delete":"retry")?(this._showOptionMediaCapture(),this.receiptStatus="pending"):this._fireEvent("media-capture-right-click-delete")}_showOptionMediaCapture(){this._fireEvent("open-option-media-capture-modal"),this.receiptStatus="loading"}onMediaCaptureError(){this.receiptStatus="error"}onMediaCaptureSuccess(){this.mediaCapture.name&&(this._fireEvent("close-upgrade-account-option-media-capture-modal"),this._manageUploadConfig.loading={...this._manageUploadConfig.loading,mainTitle:this.mediaCapture.name},this._manageUploadConfig.success={...this._manageUploadConfig.success,mainTitle:this.mediaCapture.name,description:`${this.mediaCapture.size} Kb`},this.receiptStatus="success")}onDatePicker(){this.datePickerData.selectedDate&&(this._date=this.datePickerData.selectedDate)}render(){return d`
      ${this._renderAddressInfo()}
      ${this._renderProofAddressSelect()}
      ${this._onProofAddressHidden()}
    `}receiveEvent(){this.shadowRoot.getElementById("date")&&this.shadowRoot.getElementById("date").addEventListener("click",this.preventDef,!1)}preventDef(e){e.preventDefault(),e.stopPropagation(),this.dispatchEvent(new CustomEvent("open-date-picker",{bubbles:!0,composed:!0,detail:!0}))}}const Qe=new r;var Xe=e`:host {
  display: block;
  box-sizing: border-box;
  --_form-textarea-field-bg-color: var(--bbva-form-textarea-field-bg-color, var(--ambientsLight100, ${t(v.light100)}));
  --_form-textarea-field-border-color: var(--bbva-form-textarea-field-border-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-focused-field-border-color: var(--bbva-form-textarea-focused-field-border-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_form-textarea-invalid-field-bg-color: var(--bbva-form-textarea-invalid-field-bg-color, var(--colorsTertiaryType5Lightened, ${t(o.tertiaryType5Lightened)}));
  --_form-textarea-invalid-field-border-color: var(--bbva-form-textarea-invalid-field-border-color, var(--colorsTertiaryType5Medium, ${t(o.tertiaryType5Medium)}));
  --_form-textarea-textarea-color: var(--bbva-form-textarea-textarea-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_form-textarea-readonly-textarea-color: var(--bbva-form-textarea-readonly-textarea-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-invalid-textarea-color: var(--bbva-form-textarea-invalid-textarea-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_form-textarea-label-color: var(--bbva-form-textarea-label-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-focused-label-color: var(--bbva-form-textarea-focused-label-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-readonly-label-color: var(--bbva-form-textarea-readonly-label-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-invalid-label-color: var(--bbva-form-textarea-invalid-label-color, var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)}));
  --_form-textarea-message-info-color: var(--bbva-form-textarea-message-info-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-message-error-color: var(--bbva-form-textarea-message-error-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-textarea-message-info-icon-color: var(--bbva-form-textarea-message-info-icon-color, var(--colorsPrimarySubdued, ${t(o.primarySubdued)}));
  --_form-textarea-message-error-icon-color: var(--bbva-form-textarea-message-error-icon-color, var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)}));
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
  max-height: calc(((17.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  background-color: var(--_form-textarea-field-bg-color);
  border-bottom: 1px solid var(--_form-textarea-field-border-color);
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${t(f.small)}));
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
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(i.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(i.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(s.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  will-change: transform;
  width: 100%;
  height: var(--area-height, calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  min-height: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  max-height: calc(((12.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  font-family: inherit;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em);
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
  width: calc(100% - calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em);
  color: var(--_form-textarea-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em)) scale(0.8);
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

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 12) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 12) * 1em) 0;
  display: flex;
  align-items: center;
  font-size: var(--typographyType3XSmall, ${t(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${t(s.type3XSmall)});
}
.message.info {
  color: var(--_form-textarea-message-info-color);
}
.message.error {
  color: var(--_form-textarea-message-error-color);
}

.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.info .message-icon {
  color: var(--_form-textarea-message-info-icon-color);
}
.error .message-icon {
  color: var(--_form-textarea-message-error-icon-color);
}
${Qe.mediaRules()}`;const Je=new r;var Ze=e`[ambient^=light] {
  --bbva-form-textarea-field-bg-color: initial;
  --bbva-form-textarea-field-border-color: initial;
  --bbva-form-textarea-field-border-radius: initial;
  --bbva-form-textarea-invalid-field-bg-color: initial;
  --bbva-form-textarea-invalid-field-border-color: initial;
  --bbva-form-textarea-label-color: initial;
  --bbva-form-textarea-focused-label-color: initial;
  --bbva-form-textarea-readonly-label-color: initial;
  --bbva-form-textarea-invalid-label-color: initial;
  --bbva-form-textarea-textarea-color: initial;
  --bbva-form-textarea-invalid-textarea-color: initial;
  --bbva-form-textarea-readonly-textarea-color: initial;
  --bbva-form-textarea-message-info-color: initial;
  --bbva-form-textarea-message-error-color: initial;
  --bbva-form-textarea-message-info-icon-color: initial;
  --bbva-form-textarea-message-error-icon-color: initial;
}

[ambient=light100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}
${Je.mediaRules()}`;const qe=new r;const je={dark:e`
    ${e`[ambient^=dark] {
  --bbva-form-textarea-field-bg-color: #0a5393;
  --bbva-form-textarea-field-border-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-textarea-focused-field-border-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-textarea-field-border-radius: var(--borderRadiusSmall, ${t(f.small)});
  --bbva-form-textarea-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${t(o.tertiaryType5Lightened)});
  --bbva-form-textarea-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${t(o.tertiaryType5Medium)});
  --bbva-form-textarea-label-color: var(--colorsSecondary100, ${t(o.secondary100)});
  --bbva-form-textarea-focused-label-color: var(--colorsSecondary100, ${t(o.secondary100)});
  --bbva-form-textarea-readonly-label-color: var(--colorsSecondary100, ${t(o.secondary100)});
  --bbva-form-textarea-invalid-label-color: var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)});
  --bbva-form-textarea-textarea-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-textarea-invalid-textarea-color: var(--colorsSecondary600, ${t(o.secondary600)});
  --bbva-form-textarea-readonly-textarea-color: var(--colorsSecondary100, ${t(o.secondary100)});
  --bbva-form-textarea-message-info-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-textarea-message-error-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-textarea-message-info-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-textarea-message-error-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}

[ambient=dark100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLight, ${t(o.primaryCoreLight)});
}

[ambient=dark400] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)});
}
${qe.mediaRules()}`}
    ${N.dark}
  `,light:e`
    ${Ze}
    ${N.light}
  `};class ze extends(C(m(De))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-core-icon":L,"bbva-button-icon":P}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"}}}constructor(){super(),this.clearIcon=F(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-textarea-clear",this.errorIcon=M(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=V(),this.infoIconSize=16,this.infoMessage=""}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}static get styles(){return[Xe,je.dark,je.light,l("bbva-form-textarea-shared-styles")]}render(){return d` ${this.field} ${this.messageError} ${this.messageInfo} `}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(e){super._onInput&&super._onInput(e),this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem")}get field(){return d`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return d`
      <bbva-button-icon
        tabindex="-1"
        class="clear"
        variant="no-background"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearTextarea}"
        aria-hidden="true"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get messageError(){return this._errorVisible?d`
          <div class="message error">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get messageInfo(){return this.infoMessage?d`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:e}=this._rootNode,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("blur"))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}}customElements.define(ze.is,ze);class Ke extends(C(m(Ye(A)))){static get is(){return"bbva-financial-operations-step-upgrade-account"}static get scopedElements(){const e=[I,g,b,ye,ze,_];return Ke.scopedElementsFromClasses(e)}static get properties(){return{depositsAmountFormOptions:{type:Array},depositsOperationsFormOptions:{type:Array},transfersAmountFormOptions:{type:Array},transfersOperationsFormOptions:{type:Array},dollarAmountFormOptions:{type:Array},dollarOperationsFormOptions:{type:Array},showOperationDepositsSelect:{type:Boolean},showOperationTransferSelect:{type:Boolean},showOperationDollarSelect:{type:Boolean},showDepositsExtraInfo:{type:Boolean},showTransferExtraInfo:{type:Boolean},showDollarExtraInfo:{type:Boolean},countriesCatalog:{type:Array},dollarFormNumberInvalid:{type:Boolean},transfersFormNumberInvalid:{type:Boolean},depositsFormNumberInvalid:{type:Boolean},reset:{type:Boolean}}}set showOperationDepositsSelect(e){const t=this._showOperationDepositsSelect;this._showOperationDepositsSelect=e,this.requestUpdate("showOperationDepositsSelect",t)}set showOperationTransferSelect(e){const t=this._showOperationTransferSelect;this._showOperationTransferSelect=e,this.requestUpdate("showOperationTransferSelect",t)}set showOperationDollarSelect(e){const t=this._showOperationDollarSelect;this._showOperationDollarSelect=e,this.requestUpdate("showOperationDollarSelect",t)}set showDepositsExtraInfo(e){const t=this._showDepositsExtraInfo;this._showDepositsExtraInfo=e,this.requestUpdate("showDepositsExtraInfo",t)}set showTransferExtraInfo(e){const t=this._showTransferExtraInfo;this._showTransferExtraInfo=e,this.requestUpdate("showTransferExtraInfo",t)}set showDollarExtraInfo(e){const t=this._showDollarExtraInfo;this._showDollarExtraInfo=e,this.requestUpdate("showDollarExtraInfo",t)}get showOperationDepositsSelect(){return this._showOperationDepositsSelect}get showOperationTransferSelect(){return this._showOperationTransferSelect}get showOperationDollarSelect(){return this._showOperationDollarSelect}get showDepositsExtraInfo(){return this._showDepositsExtraInfo}get showTransferExtraInfo(){return this._showTransferExtraInfo}get showDollarExtraInfo(){return this._showDollarExtraInfo}constructor(){super(),this.depositsAmountFormOptions=[],this.depositsOperationsFormOptions=[],this.transfersAmountFormOptions=[],this.transfersOperationsFormOptions=[],this.dollarAmountFormOptions=[],this.dollarOperationsFormOptions=[],this._showOperationDepositsSelect=!1,this._showOperationTransferSelect=!1,this._showOperationDollarSelect=!1,this._showDepositsExtraInfo=!1,this._showTransferExtraInfo=!1,this._showDollarExtraInfo=!1,this.countriesCatalog=[],this.dollarFormNumberInvalid=!1,this.transfersFormNumberInvalid=!1,this.depositsFormNumberInvalid=!1,this.reset=!1}static get styles(){return[we,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}render(){return d`
      ${this._renderCountriesSelect("operationsCountry",this.t("upgrade-account-financial-operations-step-country-desription"),this.t("upgrade-account-financial-operations-step-country-input-state"))}
      ${this._renderStepDescription()}
      ${this._renderDeposits()}
      ${this._renderTransfers()}
      ${this._renderDollarPurchaseSale()}
    `}updated(e){e.has("reset")&&this.reset&&(this.resetProcess(),this.reset=!1)}resetProcess(){[{options:this.transfersAmountFormOptions,element:"transfersSelect"},{options:this.dollarAmountFormOptions,element:"dollarSelect"},{options:this.depositsAmountFormOptions,element:"depositsSelect"}].forEach((e=>{this.shadowRoot.getElementById(e.element).selectedIndex=this._getDefaultIndex(e.options)})),["depositsOperation","transfersOperation","dollarOperation"].forEach((e=>{this.shadowRoot.getElementById(e).selectedIndex=void 0})),(this.showDollarExtraInfo||this.showOperationDollarSelect)&&(this.shadowRoot.getElementById("dollarFormNumber").clearInput(),this.shadowRoot.getElementById("dollarTextArea").clearTextarea(),this.showOperationDollarSelect=!1,this.showDollarExtraInfo=!1),(this.showTransferExtraInfo||this.showOperationTransferSelect)&&(this.shadowRoot.getElementById("transfersFormNumber").clearInput(),this.shadowRoot.getElementById("transfersTextArea").clearTextarea(),this.showTransferExtraInfo=!1,this.showOperationTransferSelect=!1),(this.showDepositsExtraInfo||this.showOperationDepositsSelect)&&(this.shadowRoot.getElementById("depositsFormNumber").clearInput(),this.shadowRoot.getElementById("depositsTextArea").clearTextarea(),this.showDepositsExtraInfo=!1,this.showOperationDepositsSelect=!1),["transferCountry","operationsCountry"].forEach((e=>{const t=this.shadowRoot.getElementById(e);t.selectedIndex?t.selectedIndex=void 0:t.value=""}))}_getDefaultIndex(e){return e.indexOf(e.find((e=>e.selected)))}_renderCountriesSelect(e,t,i,a=""){return d`
      <bbva-text class="u-margin-bottom--1 ${a}" size="S" text="${t}" unset></bbva-text>
      <bbva-form-select id="${e}" class="u-margin-bottom--1" required="" label="${i}"
        @change="${this._onStatusChanged}">
        ${this._renderFormOptions(this.countriesCatalog)}
      </bbva-form-select>
    `}_renderFormOptions(e){return(e||[]).map((e=>d`
      <bbva-form-option ?selected="${e.selected}" value="${e.value}">${this.t(e.label)}</bbva-form-option>
      `))}_renderStepDescription(){return d`
    <bbva-text class="u-margin-top--1-5 u-margin-bottom--1-5" size="S"
      text="${this.t("upgrade-account-financial-operations-step-description")}">
    </bbva-text>
    `}_renderDeposits(){return d`
      <bbva-form-select
        id="depositsSelect"
        class="u-margin-bottom--1"
        required=""
        info-title="${this.t("upgrade-account-deposits-title")}"
        optional-label=""
        label="${this.t("upgrade-account-deposits-monthly-amount")}"
        @change="${this._onDepositsChanged}">
          ${this._renderFormOptions(this.depositsAmountFormOptions)}
      </bbva-form-select>

      <bbva-form-select
        id="depositsOperation"
        class="u-margin-bottom--1"
        ?hidden="${this.showOperationDepositsSelect}"
        @change="${this._onStatusChanged}"
        optional-label=""
        label="${this.t("upgrade-account-deposits-operations-number-label")}">
          ${this._renderFormOptions(this.depositsOperationsFormOptions)}
      </bbva-form-select>

      ${this._renderExtraInputs(!this.showDepositsExtraInfo,"depositsFormNumber","depositsTextArea",this._onStatusChanged)}
    `}_renderTransfers(){return d`
      <bbva-text size="S" font-weight="500" class="u-padding-left--0 u-padding-right--0 u-margin-top--2 u-margin-bottom--1"
        text="${this.t("upgrade-account-transfers-title")}" unset>
      </bbva-text>

      <bbva-link class="u-margin-bottom--1" icon="${V()}" id="operation-link" @click="${this._handleClick}">
        ${this.t("upgrade-account-transfers-examples-operations")}
      </bbva-link>

      <bbva-form-select id="transfersSelect" class="u-margin-bottom--1" required=""
        label="${this.t("upgrade-account-transfers-monthly-amount")}" @change="${this._onTransfersChanged}">
        ${this._renderFormOptions(this.transfersAmountFormOptions)}
      </bbva-form-select>

      <bbva-form-select id="transfersOperation" class="u-margin-bottom--1" required=""
        ?hidden="${this.showOperationTransferSelect}" @change="${this._onStatusChanged}"
        label="${this.t("upgrade-account-transfers-operations-number-label")}">
        ${this._renderFormOptions(this.transfersOperationsFormOptions)}
      </bbva-form-select>

      ${this._renderExtraInputs(!this.showTransferExtraInfo,"transfersFormNumber","transfersTextArea",this._onStatusChanged)}

      ${this._renderCountriesSelect("transferCountry",this.t("upgrade-account-financial-operations-step-country-transfer"),this.t("upgrade-account-financial-operations-step-country-input-state"),"u-margin-top--1-5")}

    `}_renderDollarPurchaseSale(){return d`
      <bbva-form-select id="dollarSelect" class="u-margin-bottom--1 u-margin-top--2" required=""
        info-title="${this.t("upgrade-account-dollar-purchase-sale-title")}"
        label="${this.t("upgrade-account-dollar-purchase-sale-monthly-amount")}" @change="${this._onDollarChanged}">
        ${this._renderFormOptions(this.dollarAmountFormOptions)}
      </bbva-form-select>

      <bbva-form-select id="dollarOperation" class="u-margin-bottom--1" required=""
        ?hidden="${this.showOperationDollarSelect}" @change="${this._onStatusChanged}"
        label="${this.t("upgrade-account-transfers-operations-number-label")}">
        ${this._renderFormOptions(this.dollarOperationsFormOptions)}
      </bbva-form-select>

      ${this._renderExtraInputs(!this.showDollarExtraInfo,"dollarFormNumber","dollarTextArea",this._onStatusChanged)}
    `}_renderExtraInputs(e,t,i,a){const s=this[`${t}Invalid`];return d`
      <bbva-form-number
        id="${t}"
        class="u-margin-bottom--1"
        label="${this.t("upgrade-account-financial-operations-step-monthly-amount")}"
        error-message="${this.t("upgrade-account-multistep-error-extra-amount-message")}"
        error-message-icon="${D()}" currency-code="MXN" local-currency="MXN"
        ?invalid="${s}"
        language="es"
        @change="${a}"
        ?hidden="${e}"
        required>
      </bbva-form-number>

      <bbva-form-textarea id="${i}" label="${this.t("upgrade-account-financial-operations-step-specify-reason")}"
        maxlength="50" @change="${a}" ?hidden="${e}">
      </bbva-form-textarea>
    `}_resetOnChange(e,t,i){this.shadowRoot.querySelector(`#${e}Operation`).selectedIndex=void 0,t!==i&&(this.shadowRoot.getElementById(`${e}FormNumber`).clearInput(),this.shadowRoot.getElementById(`${e}TextArea`).clearTextarea())}_getValues(e){const t=e.map((e=>parseInt(e.value)));return{maxVal:Math.max.apply(Math,t).toString()}}_onDepositsChanged(){const{maxVal:e}=this._getValues(this.depositsAmountFormOptions),{value:t,selectedIndex:i}=this.shadowRoot.getElementById("depositsSelect");this.showOperationDepositsSelect=0===i,this.showDepositsExtraInfo=t===e,this._resetOnChange("deposits",t,e),this._dispatchEvent("deposits-select",i),this._onStatusChanged()}_onTransfersChanged(){const{maxVal:e}=this._getValues(this.transfersAmountFormOptions),{value:t,selectedIndex:i}=this.shadowRoot.getElementById("transfersSelect");this.showOperationTransferSelect=0===i,this.showTransferExtraInfo=t===e,this._resetOnChange("transfers",t,e),this._dispatchEvent("transfers-select",i),this._onStatusChanged()}_onDollarChanged(){const{maxVal:e}=this._getValues(this.dollarAmountFormOptions),{value:t,selectedIndex:i}=this.shadowRoot.getElementById("dollarSelect");this.showOperationDollarSelect=0===i,this.showDollarExtraInfo=t===e,this._resetOnChange("dollar",t,e),this._dispatchEvent("dollar-select",i),this._onStatusChanged()}_onStatusChanged(e){const t=(e||{}).currentTarget||{};if(t){const{id:e}=t,i=parseInt(t.value);this[`${e}Invalid`]=i?i<2e5:!!i}this._dispatchEvent("status-changed")}_handleClick(e){const t=`modal-${e.target.id}-click`;this._dispatchEvent(t,e.target)}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}const We={close:`${F()}`,alert:`${D()}`,help:`${y()}`,info:`${V()}`};class et extends(C(m(Ye(A)))){static get is(){return"bbva-personal-data-step-upgrade-account"}static get scopedElements(){const e=[Fe,Oe,I,b,B,he,U,g];return et.scopedElementsFromClasses(e)}static get properties(){return{personalData:{type:Object},fixedValues:{type:Number},activitiesDisabled:{type:Boolean},showIneInput:{type:Boolean},showCurpInput:{type:Boolean},ine:{type:String},electorKey:{type:String},registerYear:{type:String},emissionNumber:{type:String},emissionYear:{type:String},rfcPattern:{type:String},occupationsList:{type:Array},civilStatusList:{type:Array},showActivitySelect:{type:Boolean},activitiesFormOptions:{type:Array},configIneInfoModal:{type:Object},updatedRfc:{type:String},_showUniqueActivity:{type:Boolean},_showMore:{type:Boolean},_formData:{type:Object},invalidRfc:{type:Boolean},invalidIne:{type:Boolean},invalidElectorKey:{type:Boolean},invalidRegisterYear:{type:Boolean},invalidCurp:{type:Boolean},reset:{type:Boolean},curp:{type:String},rfc:{type:String},rfcConfig:{type:Object},homoclaveConfig:{type:Object},homoclave:{type:String},curpConfig:{type:Object},ineConfig:{type:Object},electorKeyConfig:{type:Object},registerYearConfig:{type:Object},signatureConfig:{type:Object},signature:{type:String}}}constructor(){super(),this.invalidRfc=!1,this.personalData={},this._showMore=!1,this.fixedValues=4,this.curp="",this.rfc="",this.ine="",this.electorKey="",this.registerYear="",this.emissionYear="",this._formData={curp:"",ine:"",electorKey:"",registerYear:"",rfc:"",civilStatus:{},job:"",activity:"",signature:""},this.rfcConfig={allowedPattern:"^[a-zA-Z0-9]$",pattern:"^(?:\\w{10}|\\w{13})$",errorMessage:"upgrade-account-multistep-personal-error-rfc-message",infoMessage:"upgrade-account-multistep-personal-info-rfc-message",label:"upgrade-account-multistep-personal-info-rfc",maxLength:13},this.homoclaveConfig={allowedPattern:"^[a-zA-Z0-9]$",pattern:"\\w{3}",errorMessage:"upgrade-account-multistep-personal-info-homo-error",infoMessage:"upgrade-account-multistep-personal-info-homo-info",label:"upgrade-account-multistep-personal-info-homo-label",maxLength:3,listLabel:"upgrade-account-multistep-personal-info-homo-list-label"},this.curpConfig={maxLength:18,pattern:"\\w{18}",allowedPattern:"[A-Za-z0-9d{18}]",clearIcon:We.close,errorMessageIcon:We.alert,errorMessage:"upgrade-account-multistep-curp-error",label:"upgrade-account-multistep-curp",infoMessage:"upgrade-account-multistep-curp-info",infoMessageIcon:We.info},this.ineConfig={maxLength:13,allowedPattern:"[0-9]",clearIcon:We.close,errorMessageIcon:We.alert,errorMessage:"upgrade-account-multistep-ine-error",label:"upgrade-account-multistep-ine",infoMessage:"upgrade-account-multistep-ine-info",infoMessageIcon:We.info},this.electorKeyConfig={maxLength:18,allowedPattern:"[A-Za-z0-9]",clearIcon:We.close,errorMessageIcon:We.alert,errorMessage:"upgrade-account-multistep-elector-key-error",label:"upgrade-account-multistep-elector-key",infoMessage:"upgrade-account-multistep-elector-key-info",infoMessageIcon:We.info},this.registerYearConfig={maxLength:7,allowedPattern:"[0-9]",clearIcon:We.close,errorMessageIcon:We.alert,errorMessage:"upgrade-account-multistep-register-year-error",label:"upgrade-account-multistep-register-year-number",infoMessage:"upgrade-account-multistep-register-year-info",infoMessageIcon:We.info},this.occupationsList=[],this.civilStatusList=[],this.showActivitySelect=!1,this._showUniqueActivity=!1,this.activitiesFormOptions=[],this.reset=!1,this.configIneInfoModal={type:"composition",values:[{imageSize:"100%",align:"center",paragraph:"upgrade-account-ine-help-front",image:"./images/upgradeAccountN2N4/ine-front.svg"},{imageSize:"100%",align:"center",paragraph:"upgrade-account-ine-help-back",image:"./images/upgradeAccountN2N4/ine-back.svg"}]},this.homoclave="",this.signatureConfig={label:"upgrade-account-multistep-personal-info-sign",pattern:"\\S{8,}$",allowedPattern:"[^ ]",errorMessage:"upgrade-account-multistep-signature-error-message",autoValidate:"",maxLength:30,infoMessage:"upgrade-account-multistep-personal-data-efirma-description"},this.signature=""}static get styles(){return[we,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}updated(e){e.has("activitiesFormOptions")&&this._manageActivitiesFormOptions(),e.has("_formData")&&this._sendFormData(this._formData),e.has("emissionYear")&&this._updateFormData({emissionYear:this.emissionYear}),e.has("emissionNumber")&&this._updateFormData({emissionNumber:this.emissionNumber}),e.has("ine")&&this._updateFormData({ine:this.ine}),e.has("electorKey")&&this._updateFormData({electorKey:this.electorKey}),e.has("registerYear")&&this._updateFormData({registerYear:this.registerYear}),e.has("curp")&&this._updateFormData({curp:this.curp}),e.has("reset")&&this.reset&&(this.reset=!1,this.resetProcess(),this._fireEvent("reset-success",this.reset)),e.has("updatedRfc")&&""!==this.updatedRfc&&(this.rfc=this.updatedRfc,this._updateFormData({rfc:this.rfc}),this._fireEvent("invalid-rfc",this.invalidRfc))}resetProcess(){this._updateFormData({curp:"",ine:"",electorKey:"",registerYear:"",rfc:"",civilStatus:{},job:"",activity:""}),["rfc","job","signature","civilStatus"].forEach((e=>{const t=this.shadowRoot.getElementById(e);t.selectedIndex?t.selectedIndex=void 0:t.value=""})),this.showCurpInput&&(this.shadowRoot.getElementById("curp").clearInput(),this.showCurpInput=!1),this.showIneInput&&["ine","electorKey","registerYear"].forEach((e=>{this.shadowRoot.getElementById(e).clearInput(),this.showIneInput=!1})),this.ine="",this.electorKey="",this.registerYear="",this.curp="",this.showActivitySelect&&(this._showUniqueActivity?this.shadowRoot.getElementById("singleActivity").description="":this.shadowRoot.getElementById("activity").selectedIndex=void 0)}_onFocusOccupation(){this._fireEvent("interaction-level-occupation")}_onFocusRfc(){this._fireEvent("interaction-level-rfc")}_onFocusEfirma(){this._fireEvent("interaction-level-efirm")}_onFocusCivilStatus(){this._fireEvent("interaction-level-civil-status")}onExpandablePanelChanges(e){this._showMore=e.detail}_onJobSelected(e){const t=e.detail;this._updateFormData({job:t}),this._fireEvent("occupation-selected",t)}_onJobChanged(e){this._fireEvent("occupation-selected",e.detail)}_onRFCBlur(e){this.rfc=e.target.value.toUpperCase(),this._updateFormData({rfc:this.rfc}),this._fireEvent("invalid-rfc",this.invalidRfc)}_onSignatureBlur(e){this.signature=e.target.value,this._updateFormData({signature:this.signature})}_onHomoclaveBlur(e){this.homoclave=e.target.value.toUpperCase(),this.rfc=this.personalData.rfcNoHomoclave+this.homoclave,this._updateFormData({rfc:this.rfc}),this._fireEvent("invalid-rfc",this.invalidRfc)}_onClickContinue(){this._fireEvent("personal-data-click-continue")}completeStep(){this._completeStep(this._getSummary())}_sendFormData(e){this._fireEvent("personal-data-form-changed",e)}_getSummary(){const e=this._getPersonalDataValues(),t=this._getPersonalInfoValues();return d`
      ${this._renderItemsList(e)}
      ${this._renderItemsList(t.slice(0,this.fixedValues))}
      ${this._renderItemsList(t.slice(this.fixedValues))}
    `}render(){return d`
    ${this._renderPersonalInfo()}
    <bbva-expandable-panel
      see-more="${this.t("upgrade-account-multistep-personal-info-see-more")}"
      see-less="${this.t("upgrade-account-multistep-personal-info-see-less")}"
      .expand ="${this.ready}"
      @expandable-panel-expand= "${this.onExpandablePanelChanges}">
    </bbva-expandable-panel>
      ${this._renderCivilStatusSelect()}
      ${this._renderPersonalData()}
      ${this._renderCurpInput()}
      ${this._renderPersonalDataRFC()}
      ${this._renderIneData()}
  `}_renderCurpInput(){return this.showCurpInput?d`
      <bbva-form-field
        id="curp"
        class="u-margin-bottom--1"
        name="curp"
        optional-label=""
        .value="${this.curp}"
        @form-field-input-blur="${this._onBlurCurp}"
        maxlength="${this.curpConfig.maxLength}"
        allowed-pattern="${this.curpConfig.allowedPattern}"
        label="${this.t(this.curpConfig.label)}"
        .invalid="${this.invalidCurp}"
        info-message="${this.t(this.curpConfig.infoMessage)}"
        info-message-icon="${this.curpConfig.infoMessageIcon}"
        error-message-icon="${this.curpConfig.errorMessageIcon}"
        error-message="${this.t(this.curpConfig.errorMessage)}"
        validate-on-blur=""
        pattern="${this.curpConfig.pattern}"
        clear-icon="${this.curpConfig.clearIcon}"></bbva-form-field>`:""}_renderCivilStatusSelect(){return d`
    <bbva-text class="u-margin-bottom--0-5 u-margin-top--2" text="${this.t("upgrade-account-multistep-personal-info-title")}" size="S" font-weight="500" unset></bbva-text>
    <bbva-text text="${this.t("upgrade-account-multistep-personal-data-desc")}" size="S" class="u-margin-bottom--1" unset></bbva-text>
      <bbva-form-select
        id="civilStatus"
        class="u-margin-bottom--1"
        required
        label="${this.t("upgrade-account-multistep-personal-data-civil-state-label")}"
        @focus="${this._onFocusCivilStatus}"
        @change="${this._onCivilStatusChanged}">
        ${this._renderFormOptions(this.civilStatusList)}
      </bbva-form-select>
    `}_renderIneData(){return this.showIneInput?d`
      <bbva-list-simple
        class="u-padding-right--0 u-padding-left--0 u-margin-top--1-5 u-margin-bottom--1"
        label-medium
        label="${this.t("upgrade-account-multistep-ine-info-title")}"
        action-icon="${We.help}"
        action-accessibility-text="help"
        @list-simple-icon-click="${this._onClickHelpIne}"
        description=" ">
      </bbva-list-simple>
      <bbva-form-field
        id="ine"
        class="u-margin-bottom--1"
        name="ineGroup"
        optional-label=""
        .value="${this.ine}"
        @form-field-input-blur="${this._onBlurIne}"
        @form-field-input-focus="${this._onFocusIne}"
        label="${this.t(this.ineConfig.label)}"
        .invalid="${this.invalidIne}"
        maxlength="${this.ineConfig.maxLength}"
        allowed-pattern="${this.ineConfig.allowedPattern}"
        info-message="${this.t(this.ineConfig.infoMessage)}"
        info-message-icon="${this.ineConfig.infoMessageIcon}"
        error-message-icon="${this.ineConfig.errorMessageIcon}"
        error-message="${this.t(this.ineConfig.errorMessage)}"
        clear-icon="${this.ineConfig.clearIcon}"></bbva-form-field>
      <bbva-form-field
        id="electorKey"
        class="u-margin-bottom--1"
        name="ineGroup"
        optional-label=""
        .value="${this.electorKey}"
        @form-field-input-blur="${this._onBlurElectorKey}"
        @form-field-input-focus="${this._onFocusElectorKey}"
        label="${this.t(this.electorKeyConfig.label)}"
        .invalid="${this.invalidElectorKey}"
        maxlength="${this.electorKeyConfig.maxLength}"
        allowed-pattern="${this.electorKeyConfig.allowedPattern}"
        info-message="${this.t(this.electorKeyConfig.infoMessage)}"
        info-message-icon="${this.electorKeyConfig.infoMessageIcon}"
        error-message-icon="${this.electorKeyConfig.errorMessageIcon}"
        error-message="${this.t(this.electorKeyConfig.errorMessage)}"
        clear-icon="${this.electorKeyConfig.clearIcon}"></bbva-form-field>
      <bbva-form-field
        id="registerYear"
        class="u-margin-bottom--1"
        name="ineGroup"
        optional-label=""
        .value="${this.registerYear}"
        @form-field-input-blur="${this._onBlurRegisterYear}"
        @form-field-input-focus="${this._onFocusRegisterYear}"
        .invalid="${this.invalidRegisterYear}"
        label="${this.t(this.registerYearConfig.label)}"
        maxlength="${this.registerYearConfig.maxLength}"
        allowed-pattern="${this.registerYearConfig.allowedPattern}"
        info-message="${this.t(this.registerYearConfig.infoMessage)}"
        info-message-icon="${this.registerYearConfig.infoMessageIcon}"
        error-message-icon="${this.registerYearConfig.errorMessageIcon}"
        error-message="${this.t(this.registerYearConfig.errorMessage)}"
        clear-icon="${this.registerYearConfig.clearIcon}"></bbva-form-field>`:""}_onClickHelpIne(){this._fireEvent("open-ine-help-modal",this.configIneInfoModal)}_onBlurIne(e){this.ine=e.target.value,this._updateFormData({ine:this.ine})}_onFocusIne(){this._fireEvent("ine-focus")}_onBlurElectorKey(e){this.electorKey=e.target.value.toUpperCase(),this._updateFormData({electorKey:this.electorKey})}_onFocusElectorKey(){this._fireEvent("elector-key-focus")}_onBlurRegisterYear(e){""!==e.target.value&&6===e.target.value.length?(this.registerYear=e.target.value.match(/.{1,4}/g).join("-"),this.emissionYear=this.registerYear.split("-")[0],this.emissionNumber=this.registerYear.split("-")[1]):this.invalidRegisterYear=!0,this._updateFormData({registerYear:this.registerYear})}_onFocusRegisterYear(e){this.invalidRegisterYear=!1,""!==e.target.value&&e.target.value.includes("-")&&(this.registerYear=e.target.value.replace(/\-/g,"")),this._fireEvent("register-year-focus")}_onBlurCurp(e){this.curp=e.target.value.toUpperCase(),this._updateFormData({curp:this.curp})}_renderPersonalDataRFC(){return d`
      <bbva-form-field
        id="rfc"
        class="u-margin-bottom--1"
        label="${this.t(this.rfcConfig.label)}"
        optional-label=""
        .value="${this.rfc}"
        maxlength="${this.rfcConfig.maxLength}"
        allowed-pattern="${this.rfcConfig.allowedPattern}"
        @form-field-input-blur="${this._onRFCBlur}"
        info-message="${this.t(this.rfcConfig.infoMessage)}"
        pattern="${this.rfcConfig.pattern}"
        validate-on-blur=""
        .invalid="${this.invalidRfc}"
        @form-field-input-focus="${this._onFocusRfc}"
        error-message="${this.t(this.rfcConfig.errorMessage)}">
      </bbva-form-field>
      <bbva-form-field
        id="signature"
        class="u-margin-bottom--1"
        .value="${this.signature}"
        pattern="${this.signatureConfig.pattern}"
        error-message="${this.signatureConfig.errorMessage}"
        auto-validate="${this.signatureConfig.autoValidate}"
        label="${this.t(this.signatureConfig.label)}"
        allowed-pattern="${this.signatureConfig.allowedPattern}"
        maxlength="${this.signatureConfig.maxLength}"
        info-message="${this.t(this.signatureConfig.infoMessage)}"
        @form-field-input-blur="${this._onSignatureBlur}"
        @form-field-input-focus="${this._onFocusEfirma}">
      </bbva-form-field>
    `}_renderPersonalData(){return d`
      <bbva-form-predictive
        id="job"
        class="u-margin-bottom--1"
        required
        .items="${this.occupationsList||[]}"
        @focus="${this._onFocusOccupation}"
        @form-predictive-item-select="${this._onJobSelected}"
        @form-predictive-value-change="${this._onJobChanged}"
        search=""
        label="${this.t("upgrade-account-multistep-personal-data-job")}"
        info-message="${this.t("upgrade-account-multistep-personal-data-job-description")}"></bbva-form-predictive>
      ${this.showActivitySelect?d`
          ${this._showUniqueActivity?d`
              <bbva-list-simple
                id="singleActivity"
                variant="stacked"
                class="u-padding-right--0 u-padding-left--0"
                label="${this.t("upgrade-account-multistep-personal-data-unique-activity-label")}"
                description="${this.t(this.activitiesFormOptions[0].label)}">
              </bbva-list-simple>
              <bbva-notification-help
                accessibility-label-icon="Info"
                icon="${V()}"
                text="${this.t("upgrade-account-multistep-personal-data-activity-sub")}">
              </bbva-notification-help>`:d`
              <bbva-form-select
                id="activity"
                class="u-margin-bottom--2"
                required
                label="${this.t("upgrade-account-multistep-personal-data-activity")}"
                @change="${this._onActivityChanged}"
                info-message="${this.t("upgrade-account-multistep-personal-data-activity-sub")}">
                ${this._renderFormOptions(this.activitiesFormOptions)}
              </bbva-form-select>`}`:d``}
    `}_renderPersonalInfo(){const e=this._getPersonalInfoValues().slice(0,this.fixedValues);return d`
      ${this._renderItemsList(e)}
      ${this._renderExtendedForm()}
    `}_renderExtendedForm(){if(this._showMore){const e=this._getPersonalInfoValues();return d`
        ${this._renderItemsList(e.slice(this.fixedValues))}
      `}return d``}_renderItemsList(e){return d`
      ${e.map((e=>d`
        <bbva-list-simple
          variant="stacked"
          class="u-padding-right--0 u-padding-left--0"
          label="${this.t(e.label)}"
          description="${this.t(e.value)}"></bbva-list-simple>
      `))}
    `}_getPersonalDataValues(){return[{label:"upgrade-account-multistep-personal-info-rfc",value:this._formData.rfc},{label:"upgrade-account-multistep-personal-data-civil-state-label",value:this._formData.civilStatus.label},{label:"upgrade-account-multistep-personal-data-job",value:this._formData.job},{label:"upgrade-account-multistep-personal-data-activity",value:this._formData.activity.label}]}_getPersonalInfoValues(){const e=[{label:"upgrade-account-multistep-personal-info-name",value:this.personalData.fullName},{label:"upgrade-account-multistep-personal-info-phone",value:this.personalData.phone},{label:"upgrade-account-multistep-personal-info-email",value:this.personalData.email},{label:"upgrade-account-multistep-personal-info-birthday",value:moment(this.personalData.birthDate).format("LL")},{label:"upgrade-account-multistep-personal-info-gender",value:this.personalData.gender},{label:"upgrade-account-multistep-personal-info-nationality",value:this.personalData.nationality}];return this.showCurpInput||(e.push({label:"upgrade-account-multistep-personal-info-state",value:this.personalData.state}),e.push({label:"upgrade-account-multistep-personal-info-curp",value:this.personalData.curp})),e}_onCivilStatusChanged(){const{value:e}=this.shadowRoot.getElementById("civilStatus"),t=this.civilStatusList.find((t=>t.value===e));this._updateFormData({civilStatus:t})}_onActivityChanged(){const{value:e}=this.shadowRoot.getElementById("activity"),t=this.activitiesFormOptions.find((t=>t.value===e));this._updateFormData({activity:t})}_renderFormOptions(e=[]){return d`
      ${e.map((e=>d`
        <bbva-form-option ?selected="${e.selected}" value="${e.value}">${this.t(e.label)}</bbva-form-option>
      `))}
    `}_manageActivitiesFormOptions(){const e=1===this.activitiesFormOptions.length;this._showUniqueActivity=e,e&&this._updateFormData({activity:this.activitiesFormOptions[0]})}_updateFormData(e){this._formData={...this._formData,...e}}}var tt=e`
:host {
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  cursor: default;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

:host([aria-disabled=true]) {
  opacity: .4;
  cursor: default;
  pointer-events: none;
}

.container {
  display: flex;
  align-items: center;
}

.box {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 1rem;
  height: 1rem;
  margin-right: .5em;
  border: 1px solid #666;
}

:host([active]) .box {
  background-color: #E9E9E9;
}

.check {
  display: block;
  width: .5rem;
  height: .5rem;
  background-color: #004481;
  opacity: 0;
}

:host([aria-checked=true]) .check {
  opacity: 1;
}

:host([aria-checked=mixed]) .check {
  opacity: 1;
  width: calc(100% - 2px);
  height: 2px;
}

.slot-control ::slotted(input[type=checkbox]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}
`;class it extends($(A)){static get properties(){return{disabled:{type:Boolean},value:{type:String},checked:{type:Boolean},indeterminate:{type:Boolean},required:{type:Boolean},name:{type:String},form:{type:String},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this.checked=!1,this.value="on",this.__active=!1,this._formElementId=x(),this._onClick=this.onClick.bind(this),this.addEventListener("click",this._onClick),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),k(this,"down",(()=>{!this.disabled&&(this.active=!0)})),k(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._setInitialAttribute("role","checkbox"),this.disabled||(this._setInitialAttribute("tabindex","0"),this._setInitialAttribute("aria-disabled","false")),this._formElement=this.shadowRoot.querySelector(`#${this._formElementId}`),this._formElement&&this.appendChild(this._formElement),this.hasAttribute("autofocus")&&this.focus()}updated(e){super.updated&&super.updated(e),(e.has("checked")||e.has("indeterminate"))&&(this.indeterminate?this.setAttribute("aria-checked","mixed"):this.setAttribute("aria-checked",this.checked.toString())),e.has("disabled")&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.setAttribute("tabindex",this.disabled?"-1":"0"))}get checked(){return this._checked}set checked(e){const t=this.checked;e!==t&&(this._checked=e,e&&this.indeterminate&&(this.indeterminate=!1),this.requestUpdate("checked",t))}get indeterminate(){return this._indeterminate}set indeterminate(e){const t=this.indeterminate;e!==t&&(this._indeterminate=e,e&&(this.checked=!1),this.requestUpdate("indeterminate",t))}get active(){return this.__active}set active(e){e!==this.__active&&(this.__active=e,e?this.setAttribute("active",""):this.removeAttribute("active"),this.dispatchEvent(new CustomEvent("active-change",{bubbles:!0,detail:{value:this.__active}})))}static get styles(){return[tt,l("bbva-core-checkbox-shared-styles")]}render(){return d` ${this._labelledInput} ${this._checkbox} `}get _labelledInput(){return d` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return d`
      <slot name="input-template">
        <span class="box">
          <span class="check"></span>
        </span>
      </slot>
    `}get _labelTemplate(){return d`
      <span class="label">
        <slot></slot>
      </span>
    `}get _checkbox(){return d`
      <span class="slot-control">
        <slot name="_checkbox"></slot>
      </span>

      <input
        aria-hidden="true"
        ?checked="${this.checked}"
        ?disabled="${this.disabled}"
        form="${E(this.form)}"
        id="${this._formElementId}"
        .indeterminate="${this.indeterminate}"
        name="${E(this.name)}"
        ?required="${this.required}"
        slot="_checkbox"
        tabindex="-1"
        type="checkbox"
        .value="${this.value}"
        @change="${this._onChange}"
        @input="${this._onInput}"
      />
    `}_setInitialAttribute(e,t){this.hasAttribute(e)||this.setAttribute(e,t)}_dispatchEvent(e){this.dispatchEvent(new CustomEvent(e,{bubbles:!0}))}_onInput(e){e.preventDefault(),e.stopPropagation()}_onChange(e){e.preventDefault(),e.stopPropagation(),this.onClick(e)}_toggle(){this.checked=!this.checked,this.dispatchEvent(new CustomEvent("change",{bubbles:!0})),this.dispatchEvent(new CustomEvent("input",{bubbles:!0}))}onClick(e){if(this.disabled)return e.preventDefault(),e.stopPropagation(),void e.stopImmediatePropagation();this._toggle()}onKeyUp(e){"Enter"!==e.key&&" "!==e.key||!this.active||(this.active=!1,this._toggle(),e.preventDefault(),e.stopPropagation())}onKeyDown(e){const{key:t}=e;"Enter"!==t&&" "!==t||(this.active=!0,e.preventDefault(),e.stopPropagation())}}const at=new r;var st=e`:host {
  --_form-checkbox-readonly-color: var(--bbva-form-checkbox-readonly-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-checkbox-border-color: var(--bbva-form-checkbox-checkbox-border-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-checkbox-bg-color: var(--bbva-form-checkbox-checkbox-bg-color, var(--colorsSecondary100, ${t(o.secondary100)}));
  --_form-checkbox-check-color: var(--bbva-form-checkbox-check-color, var(--colorsPrimaryCore, ${t(o.primaryCore)}));
  --_form-checkbox-error-color: var(--bbva-form-checkbox-error-color, var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)}));
  --_form-checkbox-error-bg-color: var(--bbva-form-checkbox-error-bg-color, var(--colorsTertiaryType5Lightened, ${t(o.tertiaryType5Lightened)}));
  --_form-checkbox-error-icon-color: var(--bbva-form-checkbox-error-icon-color, var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)}));
  --_form-checkbox-variant-amount-clip-color: var(--bbva-form-checkbox-variant-amount-clip-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_form-checkbox-variant-icon-clip-color: var(--bbva-form-checkbox-variant-icon-clip-color, var(--colorsSecondary400, ${t(o.secondary400)}));
  --_form-checkbox-variant-card-description-color: var(--bbva-form-checkbox-variant-card-description-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_form-checkbox-label-gap: var(--bbva-form-checkbox-label-gap, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  --_form-checkbox-help-icon-color: var(--bbva-form-checkbox-help-icon-color, var(--colorsPrimaryMedium, ${t(o.primaryMedium)}));
  --_form-checkbox-label-out-color: var(--bbva-form-checkbox-label-out-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  display: block;
  position: relative;
  box-sizing: border-box;
  cursor: default;
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(s.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(i.book.fontWeight)});
  color: var(--bbva-form-checkbox-color, var(--colorsSecondary600, ${t(o.secondary600)}));
}

:host([aria-readonly=true]) {
  color: var(--_form-checkbox-readonly-color);
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

:host([aria-disabled=true]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

.container {
  display: flex;
  align-items: var(--bbva-form-checkbox-container-align, flex-start);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0;
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

.checkbox {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: var(--bbva-form-checkbox-width, 2rem);
  height: var(--bbva-form-checkbox-height, 2rem);
  border-radius: var(--bbva-form-checkbox-border-radius, none);
  margin-right: var(--_form-checkbox-label-gap);
  border: var(--bbva-form-checkbox-border, 1px solid var(--_form-checkbox-border-color));
  background-color: var(--_form-checkbox-bg-color);
}
:host([aria-invalid=true]) .checkbox {
  background-color: var(--_form-checkbox-error-bg-color);
  border-color: var(--_form-checkbox-error-color);
}
.checkbox-check {
  display: block;
  color: var(--_form-checkbox-check-color);
  opacity: 0;
}
:host([aria-checked=true]) .checkbox-check {
  opacity: 1;
}
:host([aria-invalid=true]) .checkbox-check {
  color: var(--_form-checkbox-error-color);
}
:host([aria-readonly=true]) .checkbox-check {
  color: var(--_form-checkbox-readonly-color);
}

.content {
  flex: auto;
  display: flex;
  align-items: flex-start;
  min-width: 0;
}

.main {
  flex: auto;
  min-width: 0;
  display: block;
  padding-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--bbva-form-checkbox-label-out-weight, var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)}));
  color: var(--_form-checkbox-label-out-color);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.label {
  display: block;
}

.description {
  display: block;
  margin-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(s.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(i.book.fontWeight)});
}
.description bbva-clip-entities {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.error {
  display: flex;
  align-items: center;
}
.error-icon {
  width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  height: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  color: var(--_form-checkbox-error-icon-color);
}
.error-message {
  font-size: var(--typographyType3XSmall, ${t(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${t(s.type3XSmall)});
}

.help-icon {
  color: var(--_form-checkbox-help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.clip {
  flex: none;
  display: flex;
  align-items: center;
  height: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([variant=amount]) .clip {
  color: var(--_form-checkbox-variant-amount-clip-color);
}

:host([variant=icon]) .clip,
:host([variant=icon-bold]) .clip {
  color: var(--_form-checkbox-variant-icon-clip-color);
}

:host([variant=icon-bold]) {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)});
}

:host([variant=card]) .description {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${t(i.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${t(i.bookItalic.fontStyle)});
  color: var(--_form-checkbox-variant-card-description-color);
  display: flex;
}
:host([variant=card]) .description ::slotted(bbva-badge-default) {
  margin-left: 0.5rem;
}

.slot-control ::slotted(input[type=checkbox]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}

.medium {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(i.medium.fontStyle)});
}
${at.mediaRules()}`;const rt=new r;var ot=e`[ambient^=light] {
  --bbva-form-checkbox-color: initial;
  --bbva-form-checkbox-readonly-color: initial;
  --bbva-form-checkbox-checkbox-border-color: initial;
  --bbva-form-checkbox-checkbox-bg-color: initial;
  --bbva-form-checkbox-check-color: initial;
  --bbva-form-checkbox-error-color: initial;
  --bbva-form-checkbox-error-bg-color: initial;
  --bbva-form-checkbox-error-icon-color: initial;
  --bbva-form-checkbox-variant-amount-clip-color: initial;
  --bbva-form-checkbox-variant-icon-clip-color: initial;
  --bbva-form-checkbox-variant-card-description-color: initial;
  --bbva-form-checkbox-label-out-color: initial;
  --bbva-form-checkbox-help-icon-color: initial;
}

[ambient^=light100] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}
${rt.mediaRules()}`;const nt=new r;var At=e`[ambient^=dark] {
  --bbva-form-checkbox-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-readonly-color: var(--colorsSecondary300, ${t(o.secondary300)});
  --bbva-form-checkbox-checkbox-border-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-checkbox-bg-color: #0a5393;
  --bbva-form-checkbox-check-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-error-color: var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)});
  --bbva-form-checkbox-error-bg-color: var(--colorsTertiaryType5Lightened, ${t(o.tertiaryType5Lightened)});
  --bbva-form-checkbox-error-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-variant-amount-clip-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-variant-icon-clip-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-variant-card-description-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-label-out-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-checkbox-help-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}

[ambient^=dark100] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLight, ${t(o.primaryCoreLight)});
}

[ambient^=dark400] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLight, ${t(o.primaryCoreLight)});
}
${nt.mediaRules()}`;const lt={dark:e`
    ${Y.dark}
    ${At}
  `,light:e`
    ${Y.light}
    ${ot}
  `};class ct extends(m(it)){static get is(){return"bbva-form-checkbox"}static get properties(){return{checkIcon:{type:String,attribute:"check-icon"},checkIconSize:{type:String,attribute:"check-icon-size"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},invalid:{type:Boolean},readonly:{type:Boolean},checked:{type:Boolean,reflect:!0},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},notForm:{type:Boolean,attribute:"not-form"},help:{type:Boolean},label:{type:String},hideLabel:{type:Boolean,attribute:"hide-label"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},entity:{type:String},entityText:{type:String,attribute:"entity-text"},entitySize:{type:String,attribute:"entity-size"}}}constructor(){super(),this.checkIcon=w(),this.checkIconSize=24,this.errorIcon=D(),this.errorIconSize=16,this.optionalLabel="",this.notForm=!1,this.labelMedium=!1}updated(e){super.updated&&super.updated(e),e.has("readonly")&&this.setAttribute("aria-readonly",this.readonly.toString()),e.has("required")&&this.setAttribute("aria-required",this.required.toString()),e.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString()),e.has("checked")&&!e.has("invalid")&&(this.invalid=!1),e.has("checked")&&void 0!==e.get("checked")&&this._dispatchEvent("change")}static get styles(){return[G(),st,l("bbva-form-checkbox-shared-styles"),lt.dark,lt.light]}static renderIf(e,t){return e?d`
          ${t}
        `:H}get _inputTemplate(){return d`
      <span class="checkbox">
        <bbva-core-icon
          class="checkbox-check"
          .icon="${this.checkIcon}"
          .size="${this.checkIconSize}"
        ></bbva-core-icon>
      </span>
    `}get _labelOut(){return ct.renderIf(this.labelOut,d`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?`${this.labelOut}`:`${this.labelOut} ${this._optional}`}"
            size="S"
          >
          </bbva-text>
          ${ct.renderIf(this.help,d`
              <bbva-core-icon
                id="help"
                @click="${this._helpClicked}"
                class="help-icon"
                icon="${y()}"
              >
              </bbva-core-icon>
            `)}
        </div>
      `)}get _checkOptional(){return this.labelOut||this.required||this.notForm?"":this._optional}get _optional(){return this.optionalLabel||this.t("bbva-form-checkbox-optional-label")}get _labelTemplate(){return d`
      <span class="content">
        <span class="main">
          <span
            class=${Q({label:!0,medium:this.labelMedium,"sr-only":this.hideLabel})}
          >
            ${this.label} ${this._checkOptional}
          </span>
          <span class="description">
            ${this.entity&&"small"===this.entitySize?d`
                  <bbva-clip-entities size="${this.entitySize}" entity="${this.entity}">
                    ${this.entityText}
                  </bbva-clip-entities>
                `:H}
            <slot name="description"></slot>
          </span>
          ${ct.renderIf(this.invalid&&this.errorMessage,d`
              <span class="error">
                <bbva-core-icon
                  class="error-icon"
                  .icon="${this.errorIcon}"
                  .size="${this.errorIconSize}"
                ></bbva-core-icon>
                <span class="error-message">${this.errorMessage}</span>
              </span>
            `)}
        </span>
        <span class="clip">
          ${this.entity&&"medium"===this.entitySize?d`
                <bbva-clip-entities size="${this.entitySize}" entity="${this.entity}">
                  ${this.entityText}
                </bbva-clip-entities>
              `:d`
                <slot name="clip"></slot>
              `}
        </span>
      </span>
    `}_toggle(){this.readonly||(this.checked=!this.checked,this._dispatchEvent("input"))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-checkbox-help-click",{bubbles:!0,composed:!0}))}render(){return d`
      ${this._labelOut} ${this._labelledInput} ${this._checkbox}
    `}}customElements.define(ct.is,ct);class dt extends(C(m(Ye(A)))){static get is(){return"bbva-terms-conditions-step-upgrade-account"}static get scopedElements(){const e=[g,_,ct,J];return dt.scopedElementsFromClasses(e)}static get properties(){return{conditionsChecksOptions:{type:Array},reset:{type:Boolean}}}constructor(){super(),this.conditionsChecksOptions=[],this.reset=!1}static get styles(){return[we,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}updated(e){e.has("reset")&&this.reset&&(this.resetProcess(),this.reset=!1)}resetProcess(){this.conditionsChecksOptions.map((e=>e.id)).forEach((e=>{this.shadowRoot.getElementById(e).checked=!1}))}render(){return d`
      ${this._renderStepDescription()}
      ${this._renderModalLink()}
      ${this._renderCheckboxes(this.conditionsChecksOptions)}
      ${this._renderMesagge(this.t("upgrade-account-conditions-info-message"))}
    `}_renderStepDescription(){return d`
      <bbva-text
        id="description"
        class="u-margin-bottom--1"
        size="S"
        text="${this.t("upgrade-account-conditions-description")}"></bbva-text>
    `}_renderModalLink(){return d`
      <bbva-link
        class="u-margin-bottom--1"
        icon="${X()}"
        icon-size="24"
        id="data-treatment-link"
        @click="${this._handleClick}">
          ${this.t("upgrade-account-conditions-data-treatment")}
      </bbva-link>
    `}_renderCheckboxes(e=[]){return d`
      ${e.map((e=>d`
      <bbva-form-checkbox
        id="${e.id}"
        name="${e.option}"
        value="${e.value}"
        required=""
        label="${this.t(e.label)}"
        @change="${this._onStatusChanged}"></bbva-form-checkbox>
    `))}
  `}_renderMesagge(e){return d`
      <bbva-notification-message id="message" class="u-margin-top--2" variant="default">${this.t(e)}</bbva-notification-message>
    `}_handleClick(e){const t=`modal-${e.target.id}-click`;this._dispatchEvent(t,e.target)}_onStatusChanged(){this._dispatchEvent("conditions-status-changed")}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}class Et extends(C(m(Ye(A)))){static get is(){return"bbva-usage-step-upgrade-account"}static get scopedElements(){const e=[U,b,I,g,Z,Se];return Et.scopedElementsFromClasses(e)}static get properties(){return{usageAccountItems:{type:Array},bankRelationshipItems:{type:Array},moneyOriginItems:{type:Array},howPayCreditsItems:{type:Array},payCreditsTimeItems:{type:Array},_formData:{type:Object},showClabeInput:{type:Boolean},_clabeInputConfig:{type:Object},_creditsTermsRadio:{type:Number},_creditsPaymentRadio:{type:Number},_defaultCreditsTermsRadio:{type:Number},_defaultCreditsPaymentRadio:{type:Number},reset:{type:Boolean}}}static get styles(){return[we,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}constructor(){super(),this.usageAccountItems=[],this.bankRelationshipItems=[],this.moneyOriginItems=[],this.howPayCreditsItems=[],this._formData={bankRelationship:"",usageAccount:"",moneyOrigin:"",howPayCredits:"",payCreditsTime:"",clabe:""},this.showClabeInput=!1,this._clabeInputConfig={allowedPattern:"[0-9]",pattern:"\\d{18}",errorMessage:"upgrade-account-multistep-clabe-error-message",autoValidate:"",max:18,label:"upgrade-account-multistep-clabe",icon:`${F()}`},this._creditsTermsRadio=1,this._creditsPaymentRadio=1,this._defaultCreditsTermsRadio=1,this._defaultCreditsPaymentRadio=1,this.reset=!1}updated(e){e.has("_formData")&&this._sendFormData(this._formData),e.has("reset")&&this.reset&&(this.resetProcess(),this.reset=!1)}resetProcess(){const e=this._getDefaultIndex(this.bankRelationshipItems),t=this._getDefaultIndex(this.usageAccountItems),i=this._getDefaultIndex(this.moneyOriginItems);this.shadowRoot.getElementById("usageAccount").selectedIndex=t,this.shadowRoot.getElementById("bankRelationship").selectedIndex=e,this.shadowRoot.getElementById("moneyOrigin").selectedIndex=i,this.shadowRoot.getElementById("creditsTerms").selected=this._defaultCreditsTermsRadio,this.shadowRoot.getElementById("creditsPayment").selected=this._defaultCreditsPaymentRadio,this.showClabeInput&&(this.shadowRoot.getElementById("clabe").clearInput(),this.showClabeInput=!1)}_getDefaultIndex(e){return e.indexOf(e.find((e=>e.selected)))}_renderClabeInput(){return this.showClabeInput?d`
      <bbva-form-field
        id="clabe"
        optional-label=""
        .value="${this._formData.clabe}"
        class="u-margin-bottom--1"
        allowed-pattern="${this._clabeInputConfig.allowedPattern}"
        pattern="${this._clabeInputConfig.pattern}"
        error-message="${this._clabeInputConfig.errorMessage}"
        maxlength="${this._clabeInputConfig.max}"
        auto-validate="${this._clabeInputConfig.autoValidate}"
        label="${this.t(this._clabeInputConfig.label)}"
        clear-icon="${this._clabeInputConfig.icon}"
        @form-field-input-blur="${this._onBlurClabe}">
      </bbva-form-field>
    `:""}_renderFormOptions(e){return(e||[]).map((e=>d`
      <bbva-form-option ?selected="${e.selected}" value="${e.value}">${this.t(e.label)}</bbva-form-option>
    `))}render(){return this.howPayCreditsItems=[{text:this.t("upgrade-account-multistep-usage-efective"),value:"efective"},{text:this.t("upgrade-account-multistep-usage-charge-on-my-account"),value:"account",checked:!0}],this.payCreditsTimeItems=[{text:this.t("upgrade-account-multistep-usage-yes"),value:"yes"},{text:this.t("upgrade-account-multistep-usage-no"),value:"no",checked:!0}],d`
      <bbva-text text="${this.t("upgrade-account-multistep-usage-user-info-integrate")}" size="S" class="u-margin-bottom--1-5" unset></bbva-text>
      <bbva-text text="${this.t("upgrade-account-multistep-usage-bank-relationship-question")}" size="S" class="u-margin-bottom--0-5" unset></bbva-text>
      <bbva-form-select
        id="bankRelationship"
        class="u-margin-bottom--1 "
        required
        label="${this.t("upgrade-account-multistep-usage-bank-relationship-question-label")}"
        @option-change="${this._onBankRelationshipChange}">
        ${this._renderFormOptions(this.bankRelationshipItems)}
      </bbva-form-select>

      <!-- review margins -->
      ${this._renderClabeInput()}

      <bbva-text text="${this.t("upgrade-account-multistep-usage-use-account-question")}" size="S" class="u-margin-bottom--0-5" unset></bbva-text>
      <bbva-form-select
        id="usageAccount"
        label="${this.t("upgrade-account-multistep-usage-use-account-question-label")}"
        class="u-margin-bottom--2"
        required
        @option-change="${this._onUsageAccountChange}">
        ${this._renderFormOptions(this.usageAccountItems)}
      </bbva-form-select>

      <bbva-text text="${this.t("upgrade-account-multistep-usage-money-origin-question")}" size="S" class="u-margin-bottom--0-5 u-margin-top--2" unset></bbva-text>
      <bbva-form-select
        id="moneyOrigin"
        label="${this.t("upgrade-account-multistep-usage-money-origin-question-label")}"
        class="u-margin-bottom--1"
        required
        @option-change="${this._onMoneyOriginChange}">
        ${this._renderFormOptions(this.moneyOriginItems)}
      </bbva-form-select>

      <bbva-header-category text="${this.t("upgrade-account-multistep-usage-credits")}" class="u-margin-bottom--0-5 u-margin-top--1-5 u-padding-right--0 u-padding-left--0"></bbva-header-category>
      <bbva-text text="${this.t("upgrade-account-multistep-usage-credits-question")}" size="S" class="u-margin-bottom--1" unset></bbva-text>
      <bbva-text text="${this.t("upgrade-account-multistep-usage-credits-how-pay-question")}" size="S" font-weight="500" class="u-margin-bottom--0-5" unset></bbva-text>
      <bbva-form-radio-group
        class="u-margin-bottom--2"
        id="creditsPayment"
        name="howPayCredits"
        .items="${this.howPayCreditsItems}"
        .selected="${this._creditsPaymentRadio}"
        @form-radio-group-item-change="${this._changeHowPayCreditsItems}">
      </bbva-form-radio-group>
      <bbva-text text="${this.t("upgrade-account-multistep-usage-credits-pay-time-question")}" size="S" font-weight="500" class="u-margin-bottom--0-5" unset></bbva-text>
      <bbva-form-radio-group
        class="u-margin-bottom--1-5"
        id="creditsTerms"
        name="payCreditsTime"
        .items="${this.payCreditsTimeItems}"
        .selected="${this._creditsTermsRadio}"
        @form-radio-group-item-change="${this._changePayCreditsTimeItems}">
      </bbva-form-radio-group>
    `}completeStep(){this._completeStep()}_onBankRelationshipChange(e){const{selected:t,value:i}=e.detail;if(t){const e=this._getValueFromArray(this.bankRelationshipItems,i);this.showClabeInput="EXCLUSIVE"!==i,this._updateFormData({bankRelationship:e})}}_onUsageAccountChange(e){const{selected:t,value:i}=e.detail;if(t){const e=this._getValueFromArray(this.usageAccountItems,i);this._updateFormData({usageAccount:e})}}_onMoneyOriginChange(e){const{selected:t,value:i}=e.detail;if(t){const e=this._getValueFromArray(this.moneyOriginItems,i);this._updateFormData({moneyOrigin:e})}}_onBlurClabe(e){const t=e.target.value;this._updateFormData({clabe:t})}_changeHowPayCreditsItems(e){const{value:t}=e.detail,i={value:t,...this._getValueFromArray(this.howPayCreditsItems,t)};this._updateFormData({howPayCredits:i})}_changePayCreditsTimeItems(e){const{value:t}=e.detail,i={value:t,...this._getValueFromArray(this.payCreditsTimeItems,t)};this._updateFormData({payCreditsTime:i})}_getValueFromArray(e,t,i=""){return""!==i?e.find((e=>e.value===t))[i]:e.find((e=>e.value===t))}_updateFormData(e){this._formData={...this._formData,...e}}_sendFormData(e){this.dispatchEvent(new CustomEvent("usage-data-form-changed",{bubbles:!0,composed:!0,detail:e}))}}var Ot=e`:host {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-content-color: var(--colorsSecondary600, #121212);
  --_help-modal-ios-header-bg-color: transparent;
  --bbva-help-modal-ios-header-bg-color: transparent;
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

.cta-container {
  text-align: center;
  padding: 1.5rem 0;
}

.item-desc {
  font-size: var(--typographyTypeSmall, 0.9375rem);
  line-height: var(--lineHeightTypeSmall, 1.6);
  font-weight: var(--fontFacePrimaryMediumFontWeight, 500);
}

.consent-modal__micro {
  width: 5rem;
  margin: auto;
}

.consent-modal__agreement {
  text-align: left;
}

.retry-modal__micro {
  width: 5rem;
  margin: auto;
  margin-bottom: 1rem;
}

.spinner-veil {
  height: 100vh;
  width: 100vw;
  position: fixed;
  top: 0;
  bottom: 0;
  right: 0;
  left: 0;
  z-index: 10;
}

.spinner-veil__container {
  height: 100%;
  background-color: rgba(255, 255, 255, 0.9);
  display: flex;
  flex-direction: column;
  justify-content: center;
}

.bbva-widget-scanner--full-height[visible] {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  z-index: 999;
}

.u-margin--grid {
  margin-left: 1rem;
  margin-right: 1rem;
}

.u-margin-bottom--0-5 {
  margin-bottom: 0.5rem;
}

.u-margin-bottom--1 {
  margin-bottom: 1rem;
}

.u-margin-bottom--1-5 {
  margin-bottom: 1.5rem;
}

.u-margin-top--0-5 {
  margin-top: 0.5rem;
}

.u-margin-top--1 {
  margin-top: 1rem;
}

.u-padding-right--0 {
  padding-right: 0;
}

.u-padding-left--0 {
  padding-left: 0;
}
`;class ht extends(C(m(A))){static get is(){return"bbva-widget-scanner-verifications-biometrics-ui"}static get properties(){return{documentConfig:{type:Object,attribute:"document-config"},selfieConfig:{type:Object,attribute:"selfie-config"},videoConfig:{type:Object,attribute:"video-config"},linkLabel:{type:String,attribute:"link-label"},ctaLabel:{type:String,attribute:"cta-label"},ctaDisabled:{type:Boolean,attribute:"cta-disabled"},widgetTitleLabel:{type:String,attribute:"widget-title-label"}}}static get scopedElements(){const e=[Ee,q,_,g,j];return ht.scopedElementsFromClasses(e)}constructor(){super(),this.documentConfig={},this.selfieConfig={},this.videoConfig={},this.ctaLabel="",this.ctaDisabled=!0,this.widgetTitleLabel="bbva-widget-scanner-verifications-biometrics-title"}static get styles(){return[Ot,l("bbva-widget-scanner-verifications-biometrics-shared-styles")]}render(){return d`
      <div class="content">
        <div class="u-margin-bottom--1-5">
          <bbva-text
            text="${this.t(this.widgetTitleLabel)}"
            size="S"
            unset
            class="u-margin-bottom--1">
          </bbva-text>
          ${this._getLink(this.linkLabel)}
        </div>

        ${this.documentConfig.id?this._createOption(this.documentConfig):""}
        ${this.selfieConfig.id?this._createOption(this.selfieConfig):""}
        ${this.videoConfig.id?this._createOption(this.videoConfig):""}

        <div class="cta-container u-margin-top--0-5">
          <bbva-button-default
            ?disabled="${this.ctaDisabled}"
            class="action"
            text="${this.t(this.ctaLabel)}"
            variant="primary"
            @click="${this._onClickCta}">
          </bbva-button-default>
        </div>
      </div>
    `}_createOption(e){return d`
      ${e.divider?d`<bbva-divider size="full"></bbva-divider>`:""}
      <div class="u-margin-top--1">
        <span class="item-desc">${this.t(e.description)}</span>
        <bbva-list-action
          class="u-padding-right--0 u-padding-left--0"
          id="${e.id}"
          icon="${e.icon}"
          main-title="${this.t(e.mainTitle)}"
          ?disabled="${e.disabled}"
          ?no-link="${e.noLink}"
          ?spinner-loading="${e.spinnerLoading}"
          description-badge-text="${e.descriptionBadgeText}"
          badge-type="${e.badgeType}"
          action-icon-right="${e.actionIconRight}"
          @list-action-title-click="${this._onClickListActionTitle}"
          @list-action-right-icon-click="${this._onClickListActionRightIcon}">
        </bbva-list-action>
      </div>
    `}_getLink(e){return e?d`<bbva-link @click="${this._onClickLink}">${this.t(e)}</bbva-link>`:""}_onClickListActionTitle(e){const{id:t}=e.currentTarget,{noLink:i}=e.currentTarget;this._fireEvent(`${t}-${i?"tap":"clicked"}`)}_onClickListActionRightIcon(e){const{id:t}=e.currentTarget,i=e.currentTarget.actionIconRight.split(":").join("-");this._fireEvent(`${t}-${i}-clicked`)}_onClickLink(){this._fireEvent("link-clicked")}_onClickCta(){this._fireEvent("cta-clicked")}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}class St extends(z(A)){}class Rt extends St{static get is(){return"bbva-global-verifications-api-dm"}constructor(){super()}postVerifications(e){this._generateGetService(this._getService("post",e),{customEvent:"verifications-api-dm-create",errorFireEventHandler:"verifications-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}Verifications`,this._getBgadp(a))}_getBgadp(e){return{postVerificationsV1:()=>new Re(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(Rt.is,Rt);class pt extends St{static get is(){return"bbva-global-verification-api-dm"}static get properties(){return{verification:{type:Object,attribute:!1}}}constructor(){super(),this.verification={}}resetVerification(){this.verification={}}getVerification(e,t={}){if(Object.keys(this.verification).length)return;t={"verification-id":e,...t},this._generateGetService(this._getService("get",{},t),{customEvent:"verification-api-dm-fetch",errorFireEventHandler:"verification-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}Verification`,this._getBgadp(a))}_getBgadp(e){return{getVerificationV1:()=>new pe(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(pt.is,pt);class ut extends St{static get is(){return"bbva-global-verification-attachment-api-dm"}constructor(){super()}putVerificationAttachment(e,t,i){const a={"verification-id":e,"attachment-id":t};this._generateGetService(this._getService("put",i,a),{customEvent:"verification-attachment-api-dm-update",errorFireEventHandler:"verification-attachment-api-dm-update-error"},this._responseMapping)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}VerificationAttachment`,this._getBgadp(a))}_getBgadp(e){return{putVerificationAttachmentV1:()=>new ue(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(ut.is,ut);class Tt extends St{static get is(){return"bbva-global-verification-execute-api-dm"}constructor(){super()}postVerificationExecute(e){const t={"verification-id":e};this._generateGetService(this._getService("post",{},t),{customEvent:"verification-execute-api-dm-create",errorFireEventHandler:"verification-execute-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}VerificationExecute`,this._getBgadp(a))}_getBgadp(e){return{postVerificationExecuteV1:()=>new Te(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(Tt.is,Tt);class Ct extends A{static get is(){return"bbva-widget-scanner-verifications-biometrics-manager"}static get properties(){return{host:{type:String},apiVersion:{type:String,attribute:"api-version"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},resizePercentage:{type:Number,attribute:"resize-percentage"},agreementsConfirmed:{type:Boolean,attribute:"agreements-confirmed"},documentConfig:{type:Object,attribute:"document-config"},selfieConfig:{type:Object,attribute:"selfie-config"},videoConfig:{type:Object,attribute:"video-config"},useFlash:{type:Boolean,attribute:"use-flash"},livePhoto:{type:Boolean,attribute:"live-photo"},liveVideo:{type:Boolean,attribute:"live-video"},processMaxRetries:{type:Number,attribute:"process-max-retries"},poolingValidationsDelay:{type:Number,attribute:"pooling-validations-delay"},firstPoolingValidationsDelay:{type:Number,attribute:"first-pooling-validations-delay"},poolingValidationsMaxCalls:{type:Number,attribute:"pooling-validations-max-calls"},poolingGetVerificationDelay:{type:Number,attribute:"pooling-get-verification-delay"},poolingGetVerificationMaxCalls:{type:Number,attribute:"pooling-get-verification-max-calls"},operationId:{type:String,attribute:"operation-id"},documentsPrefix:{type:String,attribute:"documents-prefix"},appId:{type:String,attribute:"app-id"},headers:{type:Object,attribute:"headers"},documentType:{type:String,attribute:"document-type"},flowId:{type:String,attribute:"flow-id"},_processRetries:{type:Number},_dataDocuments:{type:Object},_filesStatus:{type:Object},_verificationId:{type:String}}}constructor(){super(),this.resizePercentage=100,this.processMaxRetries=2,this.firstPoolingValidationsDelay=2500,this.poolingValidationsDelay=5e3,this.poolingValidationsMaxCalls=20,this.poolingGetVerificationDelay=3e3,this.poolingGetVerificationMaxCalls=5,this.headers={},this.attachmentIds={obverseImage:"obverse-image",obverseFlashImage:"obverse-flash-image",reverseImage:"reverse-image",selfieImage:"selfie-image",selfieAliveImage:"selfie-alive-image",selfieVideo:"selfie-video"},this._processRetries=0,this._filesStatus={},this.resetProcess()}render(){return d`

      <bbva-global-verifications-api-dm
        id="verificationsDm"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getHeaders(this.appId)}"
        @verifications-api-dm-create="${this._onCreateVerificationIdSuccess}"
        @verifications-api-dm-create-error="${this._onCreateVerificationIdError}"
        @api-dm-error="${this._onCreateVerificationIdError}">
      </bbva-global-verifications-api-dm>

      <bbva-global-verification-api-dm
        id="verificationDm"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getHeaders(this.appId)}"
        @verification-api-dm-fetch="${this._onGetVerificationStatusSuccess}"
        @verification-api-dm-fetch-error="${this._onGetVerificationStatusError}"
        @api-dm-error="${this._onGetVerificationStatusError}">
      </bbva-global-verification-api-dm>

      <bbva-global-verification-attachment-api-dm
        id="obverseImage"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getAttachmentHeaders(this.appId)}"
        @verification-attachment-api-dm-update="${this._onAttachObverseImageSuccess}"
        @verification-attachment-api-dm-update-error="${this._onAttachObverseImageError}"
        @api-dm-error="${this._onAttachObverseImageError}">
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-attachment-api-dm
        id="obverseFlashImage"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getAttachmentHeaders(this.appId)}"
        @verification-attachment-api-dm-update="${this._onAttachObverseFlashImageSuccess}"
        @verification-attachment-api-dm-update-error="${this._onAttachObverseFlashImageError}"
        @api-dm-error="${this._onAttachObverseFlashImageError}">
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-attachment-api-dm
        id="reverseImage"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getAttachmentHeaders(this.appId)}"
        @verification-attachment-api-dm-update="${this._onAttachReverseImageSuccess}"
        @verification-attachment-api-dm-update-error="${this._onAttachReverseImageError}"
        @api-dm-error="${this._onAttachReverseImageError}">
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-attachment-api-dm
        id="selfieImage"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getAttachmentHeaders(this.appId)}"
        @verification-attachment-api-dm-update="${this._onAttachSelfieImageSuccess}"
        @verification-attachment-api-dm-update-error="${this._onAttachSelfieImageError}"
        @api-dm-error="${this._onAttachSelfieImageError}">
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-attachment-api-dm
        id="selfieAliveImage"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getAttachmentHeaders(this.appId)}"
        @verification-attachment-api-dm-update="${this._onAttachSelfieAliveImageSuccess}"
        @verification-attachment-api-dm-update-error="${this._onAttachSelfieAliveImageError}"
        @api-dm-error="${this._onAttachSelfieAliveImageError}">
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-attachment-api-dm
        id="selfieVideo"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getAttachmentHeaders(this.appId)}"
        timeout="120"
        @verification-attachment-api-dm-update="${this._onAttachSelfieVideoSuccess}"
        @verification-attachment-api-dm-update-error="${this._onAttachSelfieVideoError}"
        @api-dm-error="${this._onAttachSelfieVideoError}">
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-execute-api-dm
        id="verificationExecuteDm"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getExecuteHeaders(this.appId)}"
        timeout="60"
        @verification-execute-api-dm-create="${this._onExecuteSuccess}"
        @verification-execute-api-dm-create-error="${this._onExecuteError}"
        @api-dm-error="${this._onExecuteError}">
      </bbva-global-verification-execute-api-dm>
    `}updated(e){super.updated(e),this._documentConfigChanged(e),this._selfieConfigChanged(e),this._videoConfigChanged(e),this._filesStatusChanged(e),this._documentTypeChanged(e)}get documentBaseConfig(){return{id:"document",description:"bbva-widget-scanner-verifications-biometrics-document-desc",mainTitle:"bbva-widget-scanner-verifications-biometrics-document-label",icon:p(),divider:!1}}get selfieBaseConfig(){return{id:"selfie",description:"bbva-widget-scanner-verifications-biometrics-selfie-desc",mainTitle:"bbva-widget-scanner-verifications-biometrics-selfie-label",icon:K(),divider:!0}}get videoBaseConfig(){return{id:"video",description:"bbva-widget-scanner-verifications-biometrics-video-desc",mainTitle:"bbva-widget-scanner-verifications-biometrics-video-label",icon:W(),divider:!0}}resetProcess(){this._verificationId=void 0,this._resetProcessDocument(),this._resetProcessSelfie(),this._resetProcessVideo(),this.documentConfig=this._getOptionEnabledConfig(this.documentBaseConfig),this.selfieConfig=this._getOptionDisabledConfig(this.selfieBaseConfig),this.videoConfig=this._getOptionDisabledConfig(this.videoBaseConfig)}_resetProcessDocument(){this._dataDocuments={},this._filesStatus={...this._filesStatus,obverseImage:"",obverseFlashImage:"",reverseImage:""}}_resetProcessSelfie(){this._filesStatus={...this._filesStatus,selfieImage:"",selfieAliveImage:""}}_resetProcessVideo(){this._filesStatus={...this._filesStatus,selfieVideo:""}}verifyAgreements(){this.agreementsConfirmed?this._fireEvent("launch-document-capture"):this._fireEvent("agreements-not-confirmed")}confirmAgreements(){this.agreementsConfirmed=!0,this.verifyAgreements()}async documentCaptureSuccess(e){this.documentType=this.documentType||this._getDocumentType(e),this._dataDocuments=e,this.documentConfig=this._getOptionProcessingConfig(this.documentBaseConfig),await this.requestUpdate(),this._verificationId?this._uploadDocumentsCaptured(this._verificationId,this._dataDocuments):this._createVerificationId(this.useFlash,this.flowId)}documentCaptureError(){this.documentConfig=this._getOptionRetryConfig(this.documentBaseConfig)}resetDocumentCapture(){this._resetProcessDocument(),this.documentConfig=this._getOptionEnabledConfig(this.documentBaseConfig)}retryDocumentCapture(){this._resetProcessDocument(),this.documentConfig=this._getOptionEnabledConfig(this.documentBaseConfig),this._fireEvent("launch-document-capture")}async selfieCaptureSuccess(e){this.selfieConfig=this._getOptionProcessingConfig(this.selfieBaseConfig),await this.requestUpdate(),this._uploadSelfiesCaptured(this._verificationId,e,this.livePhoto),this.liveVideo&&this.videoConfig.disabled&&(this.videoConfig=this._getOptionEnabledConfig(this.videoBaseConfig),await this.requestUpdate())}selfieCaptureError(){this.selfieConfig=this._getOptionRetryConfig(this.selfieBaseConfig)}resetSelfieCapture(){this._resetProcessSelfie(),this.selfieConfig=this._getOptionEnabledConfig(this.selfieBaseConfig)}retrySelfieCapture(){this._resetProcessSelfie(),this.selfieConfig=this._getOptionEnabledConfig(this.selfieBaseConfig),this._fireEvent("launch-selfie-capture")}async videoSelfieSuccess(e){this.videoConfig=this._getOptionProcessingConfig(this.videoBaseConfig),await this.requestUpdate(),this._uploadVideoSelfieCaptured(this._verificationId,e)}videoSelfieCaptureError(){this.videoConfig=this._getOptionRetryConfig(this.videoBaseConfig)}resetVideoSelfie(){this._resetProcessVideo(),this.videoConfig=this._getOptionEnabledConfig(this.videoBaseConfig)}retryVideoSelfie(){this._resetProcessVideo(),this.videoConfig=this._getOptionEnabledConfig(this.videoBaseConfig),this._fireEvent("launch-video-selfie")}startVerification(){this._poolingGetVerificationCount=0,this._fireEvent("show-spinner-veil"),this._fireEvent("disable-process-cta",!0),this._getVerificationStatus(this._verificationId)}_getDocumentType(e){return e[0].documentIds[0]}async _uploadDocumentsCaptured(e,t){for(const i of t){const t=this._getDocumentCapturedAttachmentId(i);if(t){const a=this._getFileName(t);await this._attachFile(e,t,i.url,`${a}.jpeg`)}}}_getDocumentCapturedAttachmentId(e){let t;return"front"===e.face?t=e.flash?this.attachmentIds.obverseFlashImage:this.attachmentIds.obverseImage:"back"===e.face&&(t=this.attachmentIds.reverseImage),t}async _uploadSelfiesCaptured(e,t,i){for(const a of t){const s=t.length>2?this._getSelfieAliveCapturedAttachmentId(a,i):this._getSelfieCapturedAttachmentId(a);if(s){const t=this._getFileName(s);await this._attachFile(e,s,a.url,`${t}.jpeg`)}}}_getSelfieAliveCapturedAttachmentId(e,t){let i;return"SelfieLiveCapture"===e.id?i=this.attachmentIds.selfieImage:"SelfieCapture"===e.id&&t&&(i=this.attachmentIds.selfieAliveImage),i}_getSelfieCapturedAttachmentId(e){let t;return"SelfieCapture"===e.id&&(t=this.attachmentIds.selfieImage),t}async _uploadVideoSelfieCaptured(e,t){const i=this._getVideoSelfieCapturedAttachmentId();if(i){const a=this._getFileName(i),s=t.length?t.find((e=>e.url)).url:t.url;await this._attachFile(e,i,s,`${a}.mp4`,"video/mp4")}}_getVideoSelfieCapturedAttachmentId(){return this.attachmentIds.selfieVideo}_getFileName(e){const t=new Date,i=`${new Intl.DateTimeFormat("es",{year:"numeric"}).format(t)}${new Intl.DateTimeFormat("es",{month:"2-digit"}).format(t)}${new Intl.DateTimeFormat("es",{day:"2-digit"}).format(t)}`;return`${this.documentsPrefix?`${this.documentsPrefix}_`:""}${i}_${e}${this.operationId?`_${this.operationId}`:""}`}_createVerificationId(e,t){const i=t||"",a={validationType:e?"WITH_FLASH":"WITHOUT_FLASH",...i?{origin:{id:i}}:{}};this.shadowRoot.getElementById("verificationsDm").postVerifications(a)}async _onCreateVerificationIdSuccess(e={}){this._verificationId=(e.detail||{}).id,this._fireEvent("verification-id",this._verificationId),this.selfieConfig.disabled&&(this.selfieConfig=this._getOptionEnabledConfig(this.selfieBaseConfig),await this.requestUpdate()),this._uploadDocumentsCaptured(this._verificationId,this._dataDocuments)}_onCreateVerificationIdError(){this.documentConfig=this._getOptionRetryConfig(this.documentBaseConfig)}async _attachFile(e,t,i,a,s="image/jpeg"){const{documentType:r}=this,o={type:"multipart/form-data",formDataParts:[{name:"file",filename:a,body:{mediaType:s,content:i}},{name:"documentType",body:{mediaType:"text/plain",content:r}}]},n=this._toCamelCase(t),A=this.shadowRoot.getElementById(n);A.forceBoundary=!0,A.multipart=o,A.putVerificationAttachment(e,t)}_toCamelCase(e){return e.replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_onAttachObverseImageSuccess(){this._filesStatus={...this._filesStatus,obverseImage:"ok"}}_onAttachObverseImageError(){this._filesStatus={...this._filesStatus,obverseImage:"ko"}}_onAttachObverseFlashImageSuccess(){this._filesStatus={...this._filesStatus,obverseFlashImage:"ok"}}_onAttachObverseFlashImageError(){this._filesStatus={...this._filesStatus,obverseFlashImage:"ko"}}_onAttachReverseImageSuccess(){this._filesStatus={...this._filesStatus,reverseImage:"ok"}}_onAttachReverseImageError(){this._filesStatus={...this._filesStatus,reverseImage:"ko"}}_onAttachSelfieImageSuccess(){this._filesStatus={...this._filesStatus,selfieImage:"ok"}}_onAttachSelfieImageError(){this._filesStatus={...this._filesStatus,selfieImage:"ko"}}_onAttachSelfieVideoSuccess(){this._filesStatus={...this._filesStatus,selfieVideo:"ok"}}_onAttachSelfieVideoError(){this._filesStatus={...this._filesStatus,selfieVideo:"ko"}}_onAttachSelfieAliveImageSuccess(){this._filesStatus={...this._filesStatus,selfieAliveImage:"ok"}}_onAttachSelfieAliveImageError(){this._filesStatus={...this._filesStatus,selfieAliveImage:"ko"}}_getVerificationStatus(e){this.shadowRoot.getElementById("verificationDm").getVerification(e)}_onGetVerificationStatusSuccess(e){const t=e.detail.status.id;if("OPEN"===t)this._areCapturesUploadedSuccessfully(e,this.attachmentIds,this.useFlash,this.livePhoto,this.liveVideo)?this._executeVerification(this._verificationId):this._poolingGetVerificationCount<this.poolingGetVerificationMaxCalls?(this._poolingGetVerificationCount+=1,setTimeout((()=>{this._getVerificationStatus(this._verificationId)}),this.poolingGetVerificationDelay)):this._processVerificationError();else if("DONE"===t){const t=e.detail.documentExtractedData;this._fireEvent("hide-spinner-veil"),this._fireEvent("verification-success",e.detail),this._fireEvent("documents-ocr-data",t)}else"ERROR"===t?this._processVerificationError():"PROCESSING"===t&&this._callGetVerificationStatus(this._verificationId,this.poolingValidationsDelay,this._poolingCallsCount,this.poolingValidationsMaxCalls)}_onGetVerificationStatusError(){this._processVerificationError()}_executeVerification(e){this.shadowRoot.getElementById("verificationExecuteDm").postVerificationExecute(e)}_onExecuteSuccess(){this._poolingCallsCount=0,this._fireEvent("execute-successfull"),this._callGetVerificationStatus(this._verificationId,this.firstPoolingValidationsDelay,this._poolingCallsCount,this.poolingValidationsMaxCalls)}_onExecuteError(){this._processVerificationError()}_areCapturesUploadedSuccessfully(e,t,i,a,s){const r=[t.obverseImage,t.reverseImage];i&&r.push(t.obverseFlashImage);const o=[t.selfieImage];a&&o.push(t.selfieAliveImage),s&&o.push(t.selfieVideo);const n=this._areAllItemsInVeridas(e.detail.attachments,r),A=this._areAllItemsInVeridas(e.detail.attachments,o);return n&&A}_areAllItemsInVeridas(e,t){return t.every((t=>e.find((e=>e.attachmentType.id===t.replace(/-/g,"_").toUpperCase()))))}_processVerificationError(){this._fireEvent("hide-spinner-veil"),this._processRetries>=this.processMaxRetries?this._fireEvent("process-max-retries-exceeded"):(this._processRetries+=1,this._fireEvent("verification-error"))}_callGetVerificationStatus(e,t,i,a){i>=a?this._fireEvent("get-verifications-max-calls-exceeded"):(this._poolingCallsCount+=1,setTimeout((()=>{this._getVerificationStatus(e)}),t))}_documentConfigChanged(e){e.has("documentConfig")&&this._fireEvent("document-config",this.documentConfig)}_selfieConfigChanged(e){e.has("selfieConfig")&&this._fireEvent("selfie-config",{...this.selfieConfig})}_videoConfigChanged(e){(e.has("videoConfig")||e.has("liveVideo"))&&this.liveVideo&&this._fireEvent("video-config",{...this.videoConfig})}_filesStatusChanged(e){if(e.has("_filesStatus")){const e=this._filesStatus,t=!this.useFlash||!!e.obverseFlashImage,i=!!e.obverseImage&&!!e.reverseImage&&t,a=!this.useFlash||"ok"===e.obverseFlashImage,s="ok"===e.obverseImage&&"ok"===e.reverseImage&&a,r=!this.livePhoto||!!e.selfieAliveImage,o=!!e.selfieImage&&r,n=!this.livePhoto||"ok"===e.selfieAliveImage,A="ok"===e.selfieImage&&n,l=!this.liveVideo||!!e.selfieVideo,c=!this.liveVideo||"ok"===e.selfieVideo;i&&s?this.documentConfig=this._getDocumentOptionCompletedConfig(this.documentBaseConfig):i&&(this.documentConfig=this._getOptionRetryConfig(this.documentBaseConfig)),o&&A?this.selfieConfig=this._getSelfieOptionCompletedConfig(this.selfieBaseConfig,this.livePhoto):o&&(this.selfieConfig=this._getOptionRetryConfig(this.selfieBaseConfig)),this.liveVideo&&(l&&c?this.videoConfig=this._getVideoOptionCompletedConfig(this.videoBaseConfig):l&&(this.videoConfig=this._getOptionRetryConfig(this.videoBaseConfig))),this._fireEvent("disable-process-cta",!(s&&A&&c))}}_documentTypeChanged(e){e.has("documentType")&&this._fireEvent("set-document-type",this.documentType)}_getOptionEnabledConfig(e){return{...e,noLink:!1,spinnerLoading:!1,descriptionBadgeText:"",badgeType:"",disabled:!1,actionIconRight:""}}_getOptionDisabledConfig(e){return{...e,noLink:!1,spinnerLoading:!1,descriptionBadgeText:"",badgeType:"",disabled:!0,actionIconRight:""}}_getOptionProcessingConfig(e){return{...e,descriptionBadgeText:"bbva-widget-scanner-verifications-biometrics-processing",spinnerLoading:!0,noLink:!0,badgeType:"default",disabled:!1,actionIconRight:""}}_getOptionCompletedConfig(e){return{...e,spinnerLoading:!1,noLink:!0,badgeType:"success",disabled:!1,actionIconRight:h()}}_getDocumentOptionCompletedConfig(e){return{...this._getOptionCompletedConfig(e),descriptionBadgeText:"bbva-widget-scanner-verifications-biometrics-images-completed"}}_getSelfieOptionCompletedConfig(e,t){return{...this._getOptionCompletedConfig(e),descriptionBadgeText:`bbva-widget-scanner-verifications-biometrics-${t?"images":"image"}-completed`}}_getVideoOptionCompletedConfig(e){return{...this._getOptionCompletedConfig(e),descriptionBadgeText:"bbva-widget-scanner-verifications-biometrics-video-completed"}}_getOptionRetryConfig(e){return{...e,descriptionBadgeText:"bbva-widget-scanner-verifications-biometrics-images-retry",spinnerLoading:!1,noLink:!0,badgeType:"error",disabled:!1,actionIconRight:T()}}_getHeaders(e){return{...this.headers,...e?{"application-id":e}:{}}}_getAttachmentHeaders(e){return{...this._getHeaders(e),"Content-Type":"multipart/form-data"}}_getExecuteHeaders(e){const t=this._getHeaders(e);return e&&(t["BCS-Device-App-Name"]=e),t}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}class mt extends(C(m(A))){static get is(){return"bbva-widget-scanner-verifications-biometrics"}static get properties(){return{acceptedDocuments:{type:Array,attribute:"accepted-documents"},useFlash:{type:Boolean,attribute:"use-flash"},livePhoto:{type:Boolean,attribute:"live-photo"},simulateLivePhoto:{type:Boolean,attribute:"simulate-live-photo"},liveVideo:{type:Boolean,attribute:"live-video"},documentsPrefix:{type:String,attribute:"documents-prefix"},documentType:{type:String,attribute:"document-type"},operationId:{type:String,attribute:"operation-id"},flowId:{type:String,attribute:"flow-id"},host:{type:String,attribute:"host"},apiVersion:{type:String,attribute:"api-version"},appId:{type:String,attribute:"app-id"},headers:{type:Object,attribute:"headers"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},tutorialLabel:{type:String,attribute:"tutorial-label"},agreementsConfirmed:{type:Boolean,attribute:"agreements-confirmed"},isNativeIos:{type:Boolean,attribute:"is-native-ios"},widgetTitleLabel:{type:String,attribute:"widget-title-label"},poolingValidationsMaxCalls:{type:Number,attribute:"pooling-validations-max-calls"},activateListActionEvents:{type:Boolean,attribute:"activate-list-action-events"}}}static get scopedElements(){const e=[ht,Ct,Ce,me,Ie];return mt.scopedElementsFromClasses(e)}constructor(){super(),this.host="",this.acceptedDocuments=[],this.useFlash=!0,this.livePhoto=!0,this.liveVideo=!1,this.simulateLivePhoto=!1,this.agreementsConfirmed=!1,this.native=!1,this.appId="",this.headers={},this.operationId="",this.flowId="",this.apiVersion="1",this.requiredToken="tsec",this.tutorialLabel="",this.documentsPrefix="",this.documentType="",this.isNativeIos=!1,this.poolingValidationsMaxCalls=20,this.widgetTitleLabel="bbva-widget-scanner-verifications-biometrics-title",this.activateListActionEvents=!1}static get styles(){return[Ot,l("bbva-widget-scanner-verifications-biometrics-shared-styles")]}render(){return d`
      <bbva-nativeconnector-document-capture
        id="documentNativeConnector"
        @launch-document-capture-success="${this._onDocumentCaptureSuccess}"
        @launch-document-capture-error="${this._onDocumentCaptureError}">
      </bbva-nativeconnector-document-capture>

      <bbva-nativeconnector-selfie-capture
        id="selfieNativeConnector"
        @launch-selfie-capture-success="${this._onSelfieCaptureSuccess}"
        @launch-selfie-capture-error="${this._onSelfieCaptureError}">
      </bbva-nativeconnector-selfie-capture>

      <bbva-nativeconnector-video-capture
        id="videoNativeConnector"
        @launch-video-capture-success="${this._onVideoSelfieSuccess}"
        @launch-video-capture-error="${this._onVideoSelfieError}">
      </bbva-nativeconnector-video-capture>

      <bbva-widget-scanner-verifications-biometrics-manager
        id="manager"
        host="${this.host}"
        api-version="${this.apiVersion}"
        required-token="${this.requiredToken}"
        process-max-retries="3"
        pooling-validations-delay="3000"
        first-pooling-validations-delay="1000"
        pooling-validations-max-calls="${this.poolingValidationsMaxCalls}"
        documents-prefix="${this.documentsPrefix}"
        operation-id="${this.operationId}"
        flow-id="${this.flowId}"
        ?native="${this.native}"
        ?use-flash="${this.useFlash}"
        ?live-photo="${this.livePhoto}"
        ?live-video="${this.liveVideo}"
        ?agreements-confirmed="${this.agreementsConfirmed}"
        app-id="${this.appId}"
        .headers="${this.headers}"
        document-type="${this.documentType}"
        @disable-process-cta="${this._onDisableProcessCta}"
        @verification-success="${this._onVerificationSuccess}"
        @verification-error="${this._onVerificationError}"
        @process-max-retries-exceeded="${this._onProcessMaxRetriesExceeded}"
        @documents-ocr-data="${this._onDocumentsOcrData}"
        @launch-document-capture="${this._launchDocumentCapture}"
        @launch-selfie-capture="${this._launchSelfieCapture}"
        @launch-video-selfie="${this._launchVideoSelfieCapture}"
        @document-config="${this._onChangeDocumentConfig}"
        @selfie-config="${this._onChangeSelfieConfig}"
        @video-config="${this._onChangeVideoConfig}"
        @show-spinner-veil="${this._onShowSpinnerVeil}"
        @hide-spinner-veil="${this._onHideSpinnerVeil}"
        @set-document-type="${this._onSetDocumentType}">
      </bbva-widget-scanner-verifications-biometrics-manager>

      <bbva-widget-scanner-verifications-biometrics-ui
        id="ui"
        link-label="${this.tutorialLabel}"
        cta-label="bbva-widget-scanner-verifications-biometrics-cta-label"
        .widgetTitleLabel="${this.widgetTitleLabel}"
        @document-clicked="${this._onDocumentItemClicked}"
        @selfie-clicked="${this._onSelfieItemClicked}"
        @video-clicked="${this._onVideoItemClicked}"
        @document-bbva-update-clicked="${this._onDocumentBbvaUpdateClicked}"
        @selfie-bbva-update-clicked="${this._onSelfieBbvaUpdateClicked}"
        @video-bbva-update-clicked="${this._onVideoBbvaUpdateClicked}"
        @document-bbva-trash-clicked="${this._onDocumentBbvaTrashClicked}"
        @selfie-bbva-trash-clicked="${this._onSelfieBbvaTrashClicked}"
        @video-bbva-trash-clicked="${this._onVideoBbvaTrashClicked}"
        @cta-clicked="${this._onCtaClicked}"
        @link-clicked="${this._onLinkClicked}">
      </bbva-widget-scanner-verifications-biometrics-ui>
    `}reset(){this.shadowRoot.getElementById("manager").resetProcess()}confirmAgreements(){this.shadowRoot.getElementById("manager").confirmAgreements()}_onDocumentCaptureSuccess(e){this.shadowRoot.getElementById("manager").documentCaptureSuccess(e.detail)}_onDocumentCaptureError(e){this.shadowRoot.getElementById("manager").documentCaptureError(e)}_onSelfieCaptureSuccess(e){this.shadowRoot.getElementById("manager").selfieCaptureSuccess(e.detail)}_onSelfieCaptureError(e){this.shadowRoot.getElementById("manager").selfieCaptureError(e)}_onVideoSelfieSuccess(e){this.shadowRoot.getElementById("manager").videoSelfieSuccess(e.detail)}_onVideoSelfieError(e){this.shadowRoot.getElementById("manager").videoSelfieCaptureError(e)}_onChangeDocumentConfig(e){this.shadowRoot.getElementById("ui").documentConfig=e.detail}_onChangeSelfieConfig(e){this.shadowRoot.getElementById("ui").selfieConfig=e.detail}_onChangeVideoConfig(e){this.shadowRoot.getElementById("ui").videoConfig=e.detail}_onDisableProcessCta(e){this.shadowRoot.getElementById("ui").ctaDisabled=e.detail}_onVerificationSuccess(e){this._fireEvent("success",e.detail)}_onVerificationError(){this._fireEvent("error")}_onDocumentsOcrData(e){this._fireEvent("ocr-data",e.detail)}_onProcessMaxRetriesExceeded(){this._fireEvent("max-retries-exceeded")}_onShowSpinnerVeil(){this._fireEvent("show-message-spinner-veil")}_onHideSpinnerVeil(){this._fireEvent("hide-message-spinner-veil")}_onSetDocumentType(e){this.documentType=e.detail}_onDocumentItemClicked(){this.shadowRoot.getElementById("manager").verifyAgreements()}_launchDocumentCapture(){const e=(t=this.t,i=this.acceptedDocuments,a=this.useFlash,s=this.isNativeIos,{documents:i,configuration:{closebutton:"YES",alertstyle:"white",arrows:"YES",arrowcolor5:"#FF1973B8",arrowcolor4:"#FF49A5E6",arrowcolor3:"#FF5BBEFF",arrowcolor2:"#FFD4EDFC",arrowcolor1:"#FFFFFFFF",infoalertshow:"YES",infoalerttitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-info-alert-title"),infoalert:t("bbva-widget-scanner-verifications-biometrics-document-plugin-info-alert",{linebreak:s?"\n":"<br/>"}),shutterbuttonbackgroundcolor:"#FFFFFFFF",shutterbuttonbordercolor:"#FF000000",shutterbuttonmessage:t("bbva-widget-scanner-verifications-biometrics-document-plugin-shutter-button-message"),shutterbuttonmessagebackgroundcolor:"#B3072146",checkdocumenttext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-check-document-text"),continuebuttonbackgroundcolor:"#1973B8",continuebuttontext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-continue-button-text"),continuebuttontextcolor:"#FFFFFF",positivebuttontext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-positive-button-text"),repeatbuttontextcolor:"#5BBEFF",repeatbuttonbackgroundcolor:"#072146",repeatbuttontext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-repeat-button-text"),repeatbuttonicon:"",userinfo:t("bbva-widget-scanner-verifications-biometrics-document-plugin-user-info"),validationbackgroundcolor:"#072146",popupvalidationbackgroundcolor:"#F01E31",popupvalidationtextcolor:"#1EADF0",documentdetectedveryclosecolor:"#B3072146",documentdetectedveryfarcolor:"#B3072146",documentveryclose:t("bbva-widget-scanner-verifications-biometrics-document-plugin-document-very-close"),documentveryfar:t("bbva-widget-scanner-verifications-biometrics-document-plugin-document-very-far"),flashwaitingalert:t("bbva-widget-scanner-verifications-biometrics-document-plugin-flash-waiting-alert"),obversenotfoundtext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-obverse-not-found-error"),reversenotfoundtext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-reverse-not-found-error"),onpicturevibration:"YES",obverseflash:a?"YES":"NO",badqualitypictureinfo:"",cameraerroralert:t("bbva-widget-scanner-verifications-biometrics-document-plugin-camera-error-alert"),cameraerrortitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-camera-error-title"),informativetextcolor:"#FFFFFF",permissionrefused:t("bbva-widget-scanner-verifications-biometrics-document-plugin-permission-refused"),permissionrefusedtitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-permission-refused-title"),repeatnoflashalerttitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-repeat-no-flash-alert-tile"),requirementsalertmessage:t("bbva-widget-scanner-verifications-biometrics-document-plugin-requirements-alert-message"),requirementsalerttitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-requirements-alert-title"),reversedetectiondelay:"",textbackgroundcolor:"#B3072146",tickcirclecolor:"#277A3E",tickcolor:"#FFFFFFFF",showtutorial:"NO"}});var t,i,a,s;this.shadowRoot.getElementById("documentNativeConnector").launchDocumentCapture(e)}_onDocumentBbvaUpdateClicked(){this.shadowRoot.getElementById("manager").retryDocumentCapture()}_onDocumentBbvaTrashClicked(){this.activateListActionEvents?this._fireEvent("document-bbva-trash-clicked-custom"):this.resetDocumentCapture()}resetDocumentCapture(){this.shadowRoot.getElementById("manager").resetDocumentCapture()}_onSelfieItemClicked(){this._launchSelfieCapture()}_onVideoItemClicked(){this._launchVideoSelfieCapture()}_onVideoBbvaUpdateClicked(){this.shadowRoot.getElementById("manager").retryVideoSelfie()}_onVideoBbvaTrashClicked(){this.activateListActionEvents?this._fireEvent("video-bbva-trash-clicked-custom"):this.resetVideoSelfie()}resetVideoSelfie(){this.shadowRoot.getElementById("manager").resetVideoSelfie()}_launchSelfieCapture(){const e=(t=this.t,i=this.livePhoto,a=this.simulateLivePhoto,s=this.isNativeIos,{configuration:{closebutton:"YES",livephoto:i||a?"YES":"NO",alertstyle:"white",veridaslogoshow:"NO",smartselfie:"NO",mobileoval:"NO",searchingfacestepinstruction:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-searching-face-step-instruction"),backgroundcolor:"#072146",showselfie:"NO",validationbackgroundcolor:"#072146",popupvalidationbackgroundcolor:"#F01E31",popupvalidationtextcolor:"#1EADF0",deviceincorrectposition:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-device-incorrect-position"),facedetectednotcenteredcolor:"#DA3851",facedetectedokcolor:"#47FB12",finaltutorialalertshow:"YES",informativetextcolor:"#000000",orientationopacity:"YES",smilerequestmoresmile:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-request-more-smile"),smilerequestserious:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-request-serious"),smilerequestsmile:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-request-smile"),smiletimeout:"YES",smiletimeoutmessage:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-timeout-message"),smiletimeoutseconds:"10",smilewarningseconds:"5",textbackgroundcolor:"#B3072146",tickcirclecolor:"#277A3E",tickcolor:"#FFFFFFFF",tickshow:"YES",selfiengaserroralertdescription:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-description"),selfiengaserroralertstep1:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-step-1"),selfiengaserroralertstep2:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-step-2"),selfiengaserroralertstep3:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-step-3"),selfiengaserroralerttitle:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-title"),selfiengaserroralertbuttontext:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-button-text"),infoalertshow:"YES",infoalerttitle:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-info-alert-title"),infoalert:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-info-alert",{linebreak:s?"\n":"<br/>"}),permissionrefused:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-permission-refused"),permissionrefusedtitle:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-permission-refused-title"),showtutorial:"NO"}});var t,i,a,s;this.shadowRoot.getElementById("selfieNativeConnector").launchSelfieCapture(e)}_launchVideoSelfieCapture(){const e=((e,t,i)=>{const a={configuration:{alertstyle:"white",capturedlabeltext:e("bbva-widget-scanner-verifications-biometrics-video-plugin-captured-labeled-text"),closebutton:"YES",capturedbackgroundalpha:"0.5",capturedlabelposition:"bottom",documentlabeltextbackgroundcolor:"#AA000000",documentmobileoval:"YES",documentmobileovalcolor:"#00CC00",facemobileoval:"YES",facemobileovalcolor:"#00CC00",faceshapeoval:"YES",fixedoval:"YES",fixedrectangle:"YES",fixedrectangleposition:"top",documentobverselabeltext:"PARTE DELANTERA",documentreverselabeltext:"PARTE TRASERA",infoalert:e("bbva-widget-scanner-verifications-biometrics-video-plugin-info-alert",{linebreak:t?"\n":"<br/>"}),infoalertshow:"YES",infoalerttitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-info-alert-title"),obversenotfounderror:e("bbva-widget-scanner-verifications-biometrics-video-plugin-obverse-not-found"),obversenotfounderrortitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-obverse-not-found-title"),permissionrefused:e("bbva-widget-scanner-verifications-biometrics-video-plugin-permission-refused"),permissionrefusedtitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-permission-refused-title"),positivebuttontitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-positive-bt-title"),reversedetection:"YES",reversenotfounderror:e("bbva-widget-scanner-verifications-biometrics-video-plugin-reverse-not-found"),reversenotfounderrortitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-reverse-not-found-title"),facenotfounderror:e("bbva-widget-scanner-verifications-biometrics-video-plugin-face-not-found"),facenotfounderrortitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-face-not-found-title"),finalerror:e("bbva-widget-scanner-verifications-biometrics-video-plugin-final-error"),finalerrortitle:e("bbva-widget-scanner-verifications-biometrics-video-plugin-final-error-title"),showtutorial:"NO",tickcirclecolor:"#277A3E",tickcolor:"#FFFFFFFF",videoflashingcolor:"NO",videoinformativelabel:"YES",videoinformativelabelbackgroundcolor:"#48AE64",videoinformativelabelobversebackgroundcolor:"#48AE64",videoinformativelabelposition:"top",videoinformativelabelreversebackgroundcolor:"#48AE64",videoinformativetext1:e("bbva-widget-scanner-verifications-biometrics-video-plugin-informative-text-1"),videoinformativetext2:e("bbva-widget-scanner-verifications-biometrics-video-plugin-informative-text-2"),videoinformativetext3:e("bbva-widget-scanner-verifications-biometrics-video-plugin-informative-text-3")}};return i&&(a.documentType=i),a})(this.t,this.isNativeIos,this.documentType);this.shadowRoot.getElementById("videoNativeConnector").launchVideoCapture(e)}_onSelfieBbvaUpdateClicked(){this.shadowRoot.getElementById("manager").retrySelfieCapture()}_onSelfieBbvaTrashClicked(){this.activateListActionEvents?this._fireEvent("selfie-bbva-trash-clicked-custom"):this.resetSelfieCapture()}resetSelfieCapture(){this.shadowRoot.getElementById("manager").resetSelfieCapture()}_onCtaClicked(e){e.stopPropagation(),this.shadowRoot.getElementById("manager").startVerification()}_onLinkClicked(){this._fireEvent("tutorial-clicked")}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(mt.is,mt);class It extends(m(Ye(A))){static get is(){return"bbva-verify-identity-step-upgrade-account"}static get properties(){return{veridas:{type:Object},veridasDMConfig:{type:Object},agreements:{type:Array},agreementsConfirmed:{type:Boolean},reset:{type:Boolean},isNativeIos:{type:Boolean},_verificationId:{type:String}}}static get styles(){return[we,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}constructor(){super(),this.reset=!1,this.resetProcess()}updated(e){e.has("reset")&&this.reset&&(this.resetProcess(),this.reset=!1)}resetProcess(){this.reset&&this.resetCaptures(),this.veridas={},this.veridasDMConfig={},this.agreementsConfirmed=!1,this.isNativeIos=!1,this._verificationId=""}render(){return d`
      <bbva-widget-scanner-verifications-biometrics
        id="bbvaWidgetScannerVerificationsBiometrics"
        .acceptedDocuments="${this.veridas.acceptedDocuments}"
        .useFlash="${this.veridas.useFlash}"
        .livePhoto="${this.veridas.livePhoto}"
        .liveVideo="${this.veridas.liveVideo}"
        .simulateLivePhoto="${this.veridas.simulateLivePhoto}"
        .documentsPrefix="${this.veridas.documentsPrefix}"
        .documentType="${this.veridas.documentType}"
        .flowId="${E(this.veridas.flowId)}"
        .agreementsConfirmed="${this.agreementsConfirmed}"
        .host="${this.veridasDMConfig.host}"
        .apiVersion="${this.veridasDMConfig.apiVersion}"
        .requiredToken="${this.veridasDMConfig.requiredToken}"
        ?native="${this.veridasDMConfig.native}"
        .isNativeIos="${this.isNativeIos}"
        pooling-validations-max-calls="0"
        @verification-id="${this._onVerificationId}"
        @show-message-spinner-veil="${this._onShowMessageSpinnerVeil}"
        @hide-message-spinner-veil="${this._onHideMessageSpinnerVeil}"
        @agreements-not-confirmed="${this._onAgreementsNotConfirmed}"
        @verification-error="${this._onVerificationError}"
        @max-retries-exceeded="${this._onVerificationMaxRetriesExceeded}"
        @execute-successfull="${this._onExecuteSuccessfull}">
      </bbva-widget-scanner-verifications-biometrics>
    `}resetCaptures(){this.shadowRoot.getElementById("bbvaWidgetScannerVerificationsBiometrics").reset()}confirmVerificationsAgreements(){this.shadowRoot.getElementById("bbvaWidgetScannerVerificationsBiometrics").confirmAgreements()}_onVerificationId(e){this._verificationId=e.detail}_onShowMessageSpinnerVeil(e){e.stopPropagation(),this._fireEvent("show-message-spinner-veil")}_onHideMessageSpinnerVeil(e){e.stopPropagation(),this._fireEvent("hide-message-spinner-veil")}_onAgreementsNotConfirmed(){this._fireEvent("verifications-agreements-not-confirmed")}_onVerificationError(){this._fireEvent("verifications-error")}_onExecuteSuccessfull(){this._fireEvent("verifications-completed",{id:this._verificationId})}_onVerificationMaxRetriesExceeded(){this._fireEvent("open-confirm-exit-modal")}}class gt extends(m(Ye(C(A)))){static get is(){return"bbva-multistep-upgrade-account"}static get scopedElements(){const e=[de,Fe,j,ee,te,g,et,He,Ke,dt,Et,It];return gt.scopedElementsFromClasses(e)}static get properties(){return{continueEnabled:{type:Boolean},addressesData:{type:Object},personalData:{type:Object},isCompHidden:{type:Boolean},customerDocumentsType:{type:Array},personalSumary:{type:String},usageSumary:{type:Array},usageAccountFormOptions:{type:Array},bankRelationshipFormOptions:{type:Array},moneyOriginFormOptions:{type:Array},depositsAmountFormOptions:{type:Array},depositsOperationsFormOptions:{type:Array},transfersAmountFormOptions:{type:Array},transfersOperationsFormOptions:{type:Array},dollarAmountFormOptions:{type:Array},dollarOperationsFormOptions:{type:Array},collapsedFinancialOperationInfo:{type:Array},showFinancialOperationButton:{type:Boolean},showTermsAndConditionsButton:{type:Boolean},conditionsChecksOptions:{type:Array},showProofAddressSelect:{type:Boolean},veridas:{type:Object},veridasDMConfig:{type:Object},geographicPlacesData:{type:Object},countriesCatalog:{type:Array},showIneInput:{type:Boolean},showCurpInput:{type:Boolean},occupationsList:{type:Array},civilStatusList:{type:Array},showActivitySelect:{type:Boolean},activitiesFormOptions:{type:Array},showUniqueActivity:{type:Boolean},mediaCapture:{type:Object},receiptStatus:{type:String},inputDateValidation:{type:Object},hideUnmaskedAddress:{type:Boolean},showAddressTitle:{type:String},curp:{type:String},updatedRfc:{type:String},invalidRfc:{type:Boolean},invalidIne:{type:Boolean},invalidElectorKey:{type:Boolean},invalidRegisterYear:{type:Boolean},invalidCurp:{type:Boolean},personalDataContinueEnabled:{type:Boolean},addressContinueEnabled:{type:Boolean},_reset:{type:Boolean},usageContinueEnabled:{type:Boolean},datePickerData:{type:Object},loading:{type:Boolean},isNativeIos:{type:Boolean}}}static get styles(){return[we,ce.dark,Me.dark,l("bbva-multistep-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}constructor(){super(),this.addressesData={},this.veridas={},this.veridasDMConfig={},this.customerDocumentsType=[],this.isCompHidden=!1,this.continueEnabled=!1,this.personalSumary="",this.usageSumary=[],this.usageAccountFormOptions=[],this.bankRelationshipFormOptions=[],this.moneyOriginFormOptions=[],this.depositsAmountFormOptions=[],this.depositsOperationsFormOptions=[],this.transfersAmountFormOptions=[],this.transfersOperationsFormOptions=[],this.dollarAmountFormOptions=[],this.dollarOperationsFormOptions=[],this.collapsedFinancialOperationInfo=[],this.conditionsChecksOptions=[],this.showProofAddressSelect=!1,this.geographicPlacesData={},this.countriesCatalog=[],this.occupationsList=[],this.civilStatusList=[],this.showActivitySelect=!1,this.activitiesFormOptions=[],this.receiptStatus="",document.addEventListener("expandable-multistep-all-complete",(e=>{this.dispatchEvent(new CustomEvent("upgrade-account-multistep-all-complete",{bubbles:!0,composed:!0,detail:!e.detail}))})),this.mediaCapture={},this.inputDateValidation={},this.hideUnmaskedAddress=!1,this.showAddressTitle="",this.personalData={},this.invalidRfc=!1,this.invalidIne=!1,this.invalidElectorKey=!1,this.invalidRegisterYear=!1,this.invalidCurp=!1,this.showIneInput=!1,this.showCurpInput=!1,this.inputDateValidation={},this.curp="",this.updatedRfc="",this.personalDataContinueEnabled=!1,this._reset=!1,this.addressContinueEnabled=!1,this.usageContinueEnabled=!1,this.showFinancialOperationButton=!1,this.showTermsAndConditionsButton=!1,this.datePickerData={},this.loading=!1,this.isNativeIos=!1}updated(e){e.has("_reset")&&this._reset&&(this._reset=!1),e.has("receiptStatus")&&"success"!==this.receiptStatus&&(this.receiptStatus="pending")}render(){return d`
      <bbva-expandable-multistep has-animation>

        <bbva-expandable-step id="step-1" class="animation"
          header="${this.t("upgrade-account-multistep-step-verify-identity-header")}" edit-label="">
          <div class="content">
            <bbva-verify-identity-step-upgrade-account
              id="verify"
              .veridas="${this.veridas}"
              .veridasDMConfig="${this.veridasDMConfig}"
              .isNativeIos="${this.isNativeIos}"
              ?reset="${this._reset}">
            </bbva-verify-identity-step-upgrade-account>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            <bbva-badge-check description="${this.t("upgrade-account-multistep-step-verify-identity-summary")}"></bbva-badge-check>
          </div>
        </bbva-expandable-step>

        <bbva-expandable-step id="step-2" class="animation"
          header="${this.t("upgrade-account-multistep-step-personal-data-header")}"
          edit-label="${this.t("upgrade-account-multistep-step-header-edit-label")}"
          @expandable-step-disable-change="${this._onChangeDisableStepPersonal}">
          <div class="content">
            <bbva-personal-data-step-upgrade-account
              id="personal"
              .personalData="${this.personalData}"
              ?invalidRfc="${this.invalidRfc}"
              @invalid-rfc="${this._setInvalidRfc}"
              .showIneInput="${this.showIneInput}"
              .showCurpInput="${this.showCurpInput}"
              .invalidIne="${this.invalidIne}"
              .invalidElectorKey="${this.invalidElectorKey}"
              .invalidRegisterYear="${this.invalidRegisterYear}"
              .invalidCurp="${this.invalidCurp}"
              .occupationsList="${this.occupationsList}"
              .civilStatusList="${this.civilStatusList}"
              .showActivitySelect="${this.showActivitySelect}"
              .activitiesFormOptions="${this.activitiesFormOptions}"
              .updatedRfc="${this.updatedRfc}"
              curp="${this.curp}"
              ?reset="${this._reset}">
            </bbva-personal-data-step-upgrade-account>
            <bbva-button-default id="secondStep"
              class="action u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
              text="${this.t("upgrade-account-multistep-step-continue-button")}" variant="primary"
              ?disabled="${!this.personalDataContinueEnabled}" @click="${this._clickNextStepPersonal}">
            </bbva-button-default>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            ${this.personalSumary}
          </div>
        </bbva-expandable-step>

        <bbva-expandable-step id="step-3" class="animation"
          header="${this.t("upgrade-account-multistep-step-address-header")}"
          edit-label="${this.t("upgrade-account-multistep-step-header-edit-label")}" disabled-target=".action">
          <div class="content">
            <bbva-address-step-upgrade-account
              id="address" .addressesData= "${this.addressesData}"
              .customerDocumentsType="${this.customerDocumentsType}"
              .mediaCapture="${this.mediaCapture}"
              .datePickerData="${this.datePickerData}"
              .@click="${this.onShowModalAddress}"
              .receiptStatus="${this.receiptStatus}"
              .inputDateValidation="${this.inputDateValidation}"
              ?hideUnmaskedAddress="${this.hideUnmaskedAddress}"
              .geographicPlacesData="${this.geographicPlacesData}"
              .showAddressTitle="${this.showAddressTitle}"
              ?reset="${this._reset}"
              ?loading="${this.loading}">
            </bbva-address-step-upgrade-account>
            <bbva-button-default id="thirdStep"
              class="action u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
              text="${this.t("upgrade-account-multistep-step-continue-button")}" variant="primary"
              ?disabled="${!this.addressContinueEnabled}" @click="${this._clickNextStepAddress}">
            </bbva-button-default>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            <bbva-badge-check description="${this.t("upgrade-account-multistep-step-address-step")}"></bbva-badge-check>
          </div>
        </bbva-expandable-step>

        <bbva-expandable-step id="step-4" class="animation"
          header="${this.t("upgrade-account-multistep-step-financial-operations-header")}"
          edit-label="${this.t("upgrade-account-multistep-step-header-edit-label")}">
          <div class="content">
            <bbva-financial-operations-step-upgrade-account id="financial"
              .depositsAmountFormOptions="${this.depositsAmountFormOptions}"
              .depositsOperationsFormOptions="${this.depositsOperationsFormOptions}"
              .transfersAmountFormOptions="${this.transfersAmountFormOptions}"
              .transfersOperationsFormOptions="${this.transfersOperationsFormOptions}"
              .dollarAmountFormOptions="${this.dollarAmountFormOptions}"
              .dollarOperationsFormOptions="${this.dollarOperationsFormOptions}"
              .countriesCatalog="${this.countriesCatalog}"
              @status-changed="${this._validateFinancialOperationStepStatus}"
              ?reset="${this._reset}">
            </bbva-financial-operations-step-upgrade-account>
            <bbva-button-default id="fourthStep"
              class="action u-display--table u-margin--center u-margin-top--2 u-margin-bottom--0-5"
              text="${this.t("upgrade-account-multistep-step-continue-button")}" variant="primary"
              ?disabled="${!this.showFinancialOperationButton}" @click="${this._clickNextStepFinancial}">
            </bbva-button-default>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            ${this._createSummary(this.collapsedFinancialOperationInfo)}
          </div>
        </bbva-expandable-step>

        <bbva-expandable-step id="step-5" class="animation" header="${this.t("upgrade-account-multistep-step-usage-header")}"
          edit-label="${this.t("upgrade-account-multistep-step-header-edit-label")}">
          <div class="content">
            <bbva-usage-step-upgrade-account
              id="usage"
              .usageAccountItems="${this.usageAccountFormOptions}"
              .bankRelationshipItems="${this.bankRelationshipFormOptions}"
              ?reset="${this._reset}"
              .moneyOriginItems="${this.moneyOriginFormOptions}">
            </bbva-usage-step-upgrade-account>
            <bbva-button-default
              id="fifthStep"
              class="action u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
              text="${this.t("upgrade-account-multistep-step-continue-button")}" variant="primary"
              ?disabled="${!this.usageContinueEnabled}" @click="${this._clickNextStepUsage}">
            </bbva-button-default>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            ${this._createSummary(this.usageSumary)}
          </div>
        </bbva-expandable-step>

        <bbva-expandable-step id="step-6" class="animation" header="${this.t("upgrade-account-multistep-step-terms-conditions-header")}" edit-label="${this.t("upgrade-account-multistep-step-header-see-label")}">
          <div class="content">
            <bbva-terms-conditions-step-upgrade-account
              id="terms"
              .conditionsChecksOptions="${this.conditionsChecksOptions}"
              ?reset="${this._reset}"
              @conditions-status-changed="${this._validateTermsAndConditionsStepStatus}"
            ></bbva-terms-conditions-step-upgrade-account>
            <bbva-button-default id="sevenStep" class="action u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
              text="${this.t("upgrade-account-multistep-step-continue-button")}" variant="primary"
              ?disabled="${!this.showTermsAndConditionsButton}" @click="${this._clickNextStepTerms}">
            </bbva-button-default>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            <bbva-badge-check description="${this.t("upgrade-account-multistep-step-terms-conditions-summary")}"></bbva-badge-check>
          </div>
        </bbva-expandable-step>

      </bbva-expandable-multistep>
    `}loadingAddress(e){this.loading=e}_setInvalidRfc(e){this.invalidRfc=e}completeStep(e){this.shadowRoot.querySelector(`#${e.id}`)._completeStep()}completePersonalDataStep(){this.shadowRoot.getElementById("personal").completeStep()}completeUsageStep(){this.shadowRoot.getElementById("usage").completeStep()}resetVerificationsCaptures(){this.shadowRoot.getElementById("verify").resetCaptures()}confirmVerificationsAgreements(){this.shadowRoot.getElementById("verify").confirmVerificationsAgreements()}goNextStepVerify(){this._clickNextStep("verify")}_clickNextStepPersonal(){this.personalSumary=this.shadowRoot.querySelector("#personal")._getSummary(),this.shadowRoot.querySelector("#personal")._onClickContinue()}_clickNextStepAddress(){this._clickNextStep("address")}onProoAddressChanged(e){this.customerDocumentsType=e}onShowModalAddress(e){this.dispatchEvent(new CustomEvent("list-editable-action-click",{bubbles:!0,composed:!0,detail:e}))}setInputPostalCode(e){this.geographicPlacesData=e}_clickNextStepCredits(){this._clickNextStep("credits")}_clickNextStepFinancial(){this._sendFinancialOperationsInfo(),this._clickNextStep("financial")}_sendFinancialOperationsInfo(){this._dispatchEvent("send-financial-operation-info",this._getFinancialOperationStepValues())}_validateFinancialOperationStepStatus(){this._dispatchEvent("validate-financial-operation-info",this._getFinancialOperationStepValues())}_getFinancialOperationStepValues(){const e=this.shadowRoot.querySelector("#financial");return{operationsCountry:e.shadowRoot.querySelector("#operationsCountry").value,depositsAmount:e.shadowRoot.querySelector("#depositsSelect").value,depositsOperations:e.shadowRoot.querySelector("#depositsOperation").value,depositsSelected:e.shadowRoot.querySelector("#depositsSelect").selectedIndex,depositsNumber:e.shadowRoot.querySelector("#depositsFormNumber").value,depositsText:e.shadowRoot.querySelector("#depositsTextArea").value,transfersAmount:e.shadowRoot.querySelector("#transfersSelect").value,transfersOperations:e.shadowRoot.querySelector("#transfersOperation").value,transfersNumber:e.shadowRoot.querySelector("#transfersFormNumber").value,transfersSelected:e.shadowRoot.querySelector("#transfersSelect").selectedIndex,transfersText:e.shadowRoot.querySelector("#transfersTextArea").value,transfersCountry:e.shadowRoot.querySelector("#transferCountry").value,dollarPurchaseSaleAmount:e.shadowRoot.querySelector("#dollarSelect").value,dollarPurchaseSaleOperations:e.shadowRoot.querySelector("#dollarOperation").value,dollarPurchaseSaleNumber:e.shadowRoot.querySelector("#dollarFormNumber").value,dollarPurchaseSelected:e.shadowRoot.querySelector("#dollarSelect").selectedIndex,dollarPurchaseSaleText:e.shadowRoot.querySelector("#dollarTextArea").value}}_clickNextStepTerms(){this._clickNextStep("terms")}_validateTermsAndConditionsStepStatus(){this._dispatchEvent("validate-terms-and-conditions",this._getConditionsStepValues())}_getConditionsStepValues(){const e=this.shadowRoot.querySelector("#terms");return{commitment:e.shadowRoot.querySelector("#commitment").checked,authorization:e.shadowRoot.querySelector("#authorization").checked,confirm:e.shadowRoot.querySelector("#confirm").checked}}_clickNextStepUsage(){this._clickNextStep("usage")}_clickNextStep(e,t){this._dispatchEvent(`next-step-upgrade-account-multistep-${e}`,{payload:e,detail:t})}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_createSummary(e){return d`${e.map((e=>this._createComponent(e)))}`}_createComponent(e={}){const t=e.type?this[`${e.type}Summary`].bind(this):"";return t&&t(e)}textSummary(e){return d`
      <bbva-text text="${this.t(e.value)}" size="S" class="summary__item" unset></bbva-text>
    `}dividerSummary(){return d`
      <bbva-divider size="small" class="summary__divider summary__item"></bbva-divider>
    `}titleSummary(e){return d`
      <bbva-text text="${this.t(e.value)}" size="S" font-weight="500" class="summary__item" unset></bbva-text>
    `}listSummary(e){return d`
      <bbva-list-simple variant="stacked" class="summary__item" label="${this.t(e.label)}" description="${this.t(e.value)}">
      </bbva-list-simple>
    `}_onChangeDisableStepPersonal(e){this._fireEvent("step-personal-disabled",e.detail)}reset(){const e=this.shadowRoot.querySelectorAll("bbva-expandable-step"),t=Array.prototype.slice.call(e);t.forEach((e=>{e.completed=!1})),t.forEach((e=>{e.disabled=!0}));const i=this.shadowRoot.querySelector("#step-1");i.disabled=!1,i.active=!0,this._fireEvent("reset-process"),this._reset=!0}}customElements.define(gt.is,gt),customElements.define(It.is,It),customElements.define(et.is,et),customElements.define(He.is,He),customElements.define(Et.is,Et),customElements.define(Ke.is,Ke),customElements.define(dt.is,dt);const bt=e=>class extends(Be(e)){showRenapoExitModal(){const e={code:"code",selectedConfig:{className:"full-height-info",openMaximized:!0,title:"upgrade-account-multistep-modal-error-branch-title",acceptBtLabel:"upgrade-account-multistep-modal-error-branch-bt",onAcceptEvent:()=>{this._fireEvent("accept-modal-exit-process")},preventCancelFromHeader:!0,onCancelEvent:()=>{this._fireEvent("accept-modal-exit-process")},message:"upgrade-account-renapo-error-title",heroImage:"./images/upgradeAccountN2N4/account-modal-error.svg",template:{type:"paragraphs",values:[{text:this.t("upgrade-account-renapo-error-description","",{curp:this.curp.documentNumber})},{text:"upgrade-account-renapo-error-text"}]}}};this._fireEvent("show-error-exit-modal",e)}showIneExitModalWithDate(){const e=this._setLimitDate(this.dueDate),t={code:"code",selectedConfig:{className:"full-height-info",openMaximized:!0,title:"upgrade-account-multistep-modal-error-branch-title",acceptBtLabel:"upgrade-account-multistep-modal-error-branch-bt",onAcceptEvent:()=>{this._fireEvent("accept-modal-exit-process")},preventCancelFromHeader:!0,onCancelEvent:()=>{this._fireEvent("accept-modal-exit-process")},message:"upgrade-account-ine-modal-error",heroImage:"./images/upgradeAccountN2N4/account-modal-error.svg",template:{type:"paragraphs",values:[{text:"upgrade-account-ine-modal-error-description"},{text:"upgrade-account-ine-modal-error-paragraph"},{text:this.t("upgrade-account-ine-modal-error-paragraph2","",{date:e})}]}}};this._fireEvent("show-error-exit-modal",t)}nonExitModal(e=""){this._fireEvent("show-error-info-modal",{code:"code",selectedConfig:{className:"full-height-info",openMaximized:!0,title:"upgrade-account-multistep-modal-error-branch-title",acceptBtLabel:"upgrade-account-multistep-step-continue-button",message:"upgrade-account-multistep-finish-error-modal-message",heroImage:"./images/upgradeAccountN2N4/account-modal-error.svg",template:{type:"paragraphs",values:[{text:`upgrade-account-multistep-info1-${e}-error-modal-description`},{text:`upgrade-account-multistep-info2-${e}-error-modal-description`}]}}})}nonExitHandleErrorRetry(e,t=""){this._fireEvent("fullmodal-error",{errorId:e,errorType:"operative",retryConfig:{header:"upgrade-account-multistep-modal-error-branch-title",acceptBtLabel:"upgrade-account-multistep-step-continue-button",srcImage:"./images/errors/error.svg",className:"full-height-error",fullModal:!0,hideCloseIcon:!0,template:{type:"paragraphs",values:[{title:"upgrade-account-multistep-finish-error-modal-message"},{text:`upgrade-account-multistep-info1-${t}-error-modal-description`},{text:`upgrade-account-multistep-info2-${t}-error-modal-description`}]}}})}_customErrorRetry(e){this[`_${e.id}ErrorRetry`]<e.max?(this._fireEvent(e.event,!!e.params&&e.params),this[`_${e.id}ErrorRetry`]++):(this._fireEvent("close-open-modal"),this._fireEvent("hide-spinner"),e.exit?this.showExitModalWithDate():this.nonExitModal(e.service))}};class vt extends(bt(_e(A))){static get is(){return"bbva-terms-conditions-step-dm-upgrade-account"}static get properties(){return{termsConditions:{type:Boolean},termsConditionsData:{type:Object},conditionsChecksOptions:{type:Array}}}constructor(){super(),this.resetProcess()}resetProcess(){this.termsConditions=!1,this.termsConditionsData={},this.conditionsChecksOptions=[]}continueStepClicked(){this._fireEvent("update-terms-step",{termsConditions:this.termsConditions,termsConditionsData:this.termsConditionsData,id:"terms"})}sendConditionsOptions(){this.conditionsChecksOptions=[{id:"commitment",option:"0",value:"commitment",label:this.t("upgrade-account-conditions-option-commitment")},{id:"authorization",option:"1",value:"authorization",label:this.t("upgrade-account-conditions-option-authorization")},{id:"confirm",option:"2",value:"confirm",label:this.t("upgrade-account-conditions-option-confirm")}],this._fireEvent("conditions-checks-options-changed",this.conditionsChecksOptions)}validateStepStatus(e=!1){this.termsConditionsData=e;let t=!1;e&&e.commitment&&e.authorization&&e.confirm&&(t=!0),this._fireEvent("status-response-event",t)}openConditionsModal(){const e={code:"code",primaryButtonClass:"primary",selectedConfig:{openMaximized:!0,title:"Tratamiento de datos",heroImage:"./images/bbva-logo.svg",acceptBtLabel:"Entendido",template:{type:"paragraphs",values:[{text:" "},{text:this.t("upgrade-account-conditions-modal-description")}]}}};this._fireEvent("open-upgrade-account-conditions-modal",e)}}customElements.define(vt.is,vt);class ft extends(bt(_e(A))){static get is(){return"bbva-financial-operations-step-dm-upgrade-account"}static get properties(){return{financialOperations:{type:Boolean},depositsAmountFormOptions:{type:Array},depositsOperationsFormOptions:{type:Array},transfersAmountFormOptions:{type:Array},transfersOperationsFormOptions:{type:Array},dollarAmountFormOptions:{type:Array},dollarOperationsFormOptions:{type:Array},collapsedFinancialOperationInfo:{type:Array},countries:{type:Object},stepInfo:{type:Object},depositsSelect:{type:Number},transfersSelect:{type:Number},dollarSelect:{type:Number},_countries:{type:Array}}}constructor(){super(),this.financialOperations=!1,this.depositsAmountFormOptions=[],this.depositsOperationsFormOptions=[],this.transfersAmountFormOptions=[],this.dollarOperationsFormOptions=[],this.transfersOperationsFormOptions=[],this.dollarAmountFormOptions=[],this.collapsedFinancialOperationInfo=[],this.depositsSelect=1,this.transfersSelect=1,this.dollarSelect=1,this.countries=[],this.stepInfo={},this._countries=[]}continueStepClicked(){this._fireEvent("update-financial-step",{financialData:this._generateFinancialOperationsData(this.stepInfo,this.countries),financialOperations:this.financialOperations,id:"financial"})}resetProcess(){this.sendOperationInformation(this._countries),this.financialOperations=!1,this.stepInfo={}}sendOperationInformation(e){this._countries=e,this.depositsAmountFormOptions=[{value:"200000",label:this.t("upgrade-account-financial-operations-no-operation"),selected:!1},{value:"200000",label:"Menor a 200,000.00 MXN",selected:!0},{value:"200001",label:"Mayor a 200,000.00 MXN",selected:!1}],this.depositsOperationsFormOptions=[{value:"5",label:"1 a 5",selected:!1},{value:"10",label:"6 a 10",selected:!1},{value:"15",label:"11 a 15",selected:!1},{value:"20",label:"16 a 20",selected:!1},{value:"25",label:"21 a 25",selected:!1}],this.transfersAmountFormOptions=[{value:"200000",label:this.t("upgrade-account-financial-operations-no-operation"),selected:!1},{value:"200000",label:"Menor a 200,000.00 MXN",selected:!0},{value:"200001",label:"Mayor a 200,000.00 MXN",selected:!1}],this.transfersOperationsFormOptions=[{value:"15",label:"1 a 15",selected:!1},{value:"30",label:"16 a 30",selected:!1},{value:"45",label:"31 a 45",selected:!1},{value:"60",label:"46 a 60",selected:!1},{value:"75",label:"61 a 75",selected:!1}],this.dollarAmountFormOptions=[{value:"2000",label:this.t("upgrade-account-financial-operations-no-operation"),selected:!1},{value:"2000",label:"Menor a 2,000.00 USD",selected:!0},{value:"2001",label:"Mayor a 2,000.00 USD",selected:!1}],this.dollarOperationsFormOptions=[{value:"15",label:"1 a 15",selected:!1},{value:"30",label:"16 a 30",selected:!1},{value:"45",label:"31 a 45",selected:!1},{value:"60",label:"46 a 60",selected:!1},{value:"75",label:"61 a 75",selected:!1}],this._fireEvent("deposits-amount-form-options-changed",this.depositsAmountFormOptions),this._fireEvent("deposits-operations-form-options-changed",this.depositsOperationsFormOptions),this._fireEvent("transfers-amount-form-options-changed",this.transfersAmountFormOptions),this._fireEvent("transfers-operations-form-options-changed",this.transfersOperationsFormOptions),this._fireEvent("dollar-amount-form-options-changed",this.dollarAmountFormOptions),this._fireEvent("dollar-operations-form-options-changed",this.dollarOperationsFormOptions),this._fireEvent("countries-form-options-changed",this._countriesOperationsFormOptions(e))}openOperationsModal(){this._fireEvent("open-upgrade-account-operation-modal",{code:"code",selectedConfig:{className:"paragraphs__list info",openMaximized:!0,title:"Operaciones",acceptBtLabel:"Entendido",template:{type:"paragraphs",values:[{icon:"coronita:help"},{title:"Te compartimos algunos ejemplos que incluye esta opción:",class:"spacing text-center"},{list:["Realizar transferencias o traspasos","Emitir cheques","Pagar un servicio","Comprar un producto","Realizar una recarga telefónica","Pagar tu tarjeta de crédito"]}]}}})}_getLabel(e,t){return e.find((e=>e.value===t)).label}_setElement(e){return{type:"list",label:0!==this[`${e}Select`]?this.t("upgrade-account-financial-operations-collapsed-monthly"):"",value:0===this[`${e}Select`]?this.t("upgrade-account-financial-operations-no-operation"):this._getLabel(this[`${e}OperationsFormOptions`],this.stepInfo[`${"dollar"===e?"dollarPurchaseSale":e}Operations`])}}collapsedInfo(e){this.stepInfo=e,this.collapsedFinancialOperationInfo=[{type:"list",label:this.t("upgrade-account-financial-operations-collapsed-country"),value:this._optionLabelSelected(this.countries,e.operationsCountry)},{type:"title",value:this.t("upgrade-account-deposits-title")},this._setElement("deposits"),{type:"divider"},{type:"title",value:this.t("upgrade-account-transfers-title")},this._setElement("transfers"),{type:"list",label:this.t("upgrade-account-financial-operations-collapsed-country-transfer"),value:this._optionLabelSelected(this.countries,e.transfersCountry)},{type:"divider"},{type:"title",value:this.t("upgrade-account-dollar-title")},this._setElement("dollar")],this._fireEvent("send-collapsed-info",this.collapsedFinancialOperationInfo)}_generateFinancialOperationsData(e,t){const i=t.find((t=>t.value===e.operationsCountry)),a=t.find((t=>t.value===e.transfersCountry));return Object.assign(e,{operationsCountry:i,transfersCountry:a})}_setValidationDepositsValues(e){return{depositOperation:""!==e.depositsOperations,depositNumber:Number.parseInt(e.depositsNumber)>2e5,depositText:""!==e.depositsText}}_setValidationCountriesValues(e){return{operationsCountry:""!==e.operationsCountry,transfersCountry:""!==e.transfersCountry}}_setValidationDollarValues(e){return{dollarOperation:""!==e.dollarPurchaseSaleOperations,dollarNumber:Number.parseInt(e.dollarPurchaseSaleNumber)>2e3,dollarText:""!==e.dollarPurchaseSaleText}}_setValidationTransferValues(e){return{transferOperation:""!==e.transfersOperations,transferNumber:Number.parseInt(e.transfersNumber)>2e5,transferText:""!==e.transfersText}}_getFormStatus(e,t,i,a){let s=!1;return s=2===e?t&&i&&a:1!==e||t,s}validateStepStatus(e={}){let t=!1;if(e&&Object.keys(e).length>0){const{operationsCountry:i,transfersCountry:a}=this._setValidationCountriesValues(e),{depositOperation:s,depositNumber:r,depositText:o}=this._setValidationDepositsValues(e),{transferOperation:n,transferNumber:A,transferText:l}=this._setValidationTransferValues(e),{dollarOperation:c,dollarNumber:d,dollarText:E}=this._setValidationDollarValues(e),O=this._getFormStatus(e.depositsSelected,s,r,o),h=this._getFormStatus(e.transfersSelected,n,A,l),S=this._getFormStatus(e.dollarPurchaseSelected,c,d,E);t=O&&h&&S&&(i&&a)}this._fireEvent("status-response-event",t)}_optionLabelSelected(e,t){return e.find((e=>e.value===t)).label}_countriesOperationsFormOptions(e){for(let t=0;t<e.length;t++){const i=e[t].descriptions[0].value,a=e[t].id;"X1"!==a&&this.countries.push({value:a,label:i.replace(/ {2}.*/,""),selected:""})}return this.countries}}customElements.define(ft.is,ft),customElements.define(ge.is,ge),customElements.define(be.is,be);class Nt extends(bt(_e(A))){static get is(){return"bbva-verify-identity-step-dm-upgrade-account"}static get properties(){return{customerId:{type:String},verifyIdentity:{type:Boolean},account:{type:Array},_referenceNumber:{type:String},agreements:{type:Array},_verificationId:{type:String}}}constructor(){super(),this.resetProcess(),this.poolingValidationsDelay=5e3,this.poolingValidationsMaxCalls=20,this.documentsVerificationsRetries=0,this.documentsVerificationsMaxRetries=3,this.agreementsMaxretries=2}updated(e){e.has("account")&&this.account.length>0&&(this._referenceNumber=this._getReferenceNumber(this.account)),e.has("agreements")&&this._fireEvent("set-agreements",this.agreements)}resetProcess(){this.verifyIdentity=!1,this.referenceNumber="",this.agreements=[],this._verificationId=""}initStep(){this.agreements=[{id:"own-account",label:"bbva-widget-scanner-verifications-biometrics-consent-modal-own-account-label",checked:!1},{id:"data-protection",label:"bbva-widget-scanner-verifications-biometrics-consent-modal-data-protection-label",checked:!1}],this._fireEvent("veridas-config",{acceptedDocuments:["MX_IDCard_2014","MX_IDCard_2008","MX_IDCard_2019"],useFlash:!0,livePhoto:!1,liveVideo:!1,simulateLivePhoto:!1,documentsPrefix:"glomo-mx",documentType:"",flowId:"upgrade-level-no-video"})}continueStepClicked(){this._fireEvent("update-verify-step",{verifyIdentity:!this.verifyIdentity,id:"verify"})}needConfirmAgreements(){this._fireEvent("open-consent-modal")}changeAgreements(e){this.agreements=e;const t=e.some((e=>!e.checked));this._fireEvent("disable-cta",t)}updateAgreements(){this._fireEvent("update-terms-agreements",[{termType:{id:"BD-MX-AA-USODPS-002"},referenceNumber:this._referenceNumber,acceptanceMethod:{id:"TA001"},acceptanceMessages:[{value:"BDUSODPS06"},{value:"BDUSODPS07"}],status:{id:"ACCEPTED"}}])}closeRetryModal(){this._fireEvent("reset-captures")}retryUpdateAgreements(){this._fireEvent("show-message-spinner-veil"),setTimeout((async()=>{this.updateAgreements(),this._fireEvent("hide-message-spinner-veil")}),3e4)}updateAgreementsSuccess(){this._fireEvent("confirm-agreements")}updateAgreementsError(e){const t=e.status;500!==t&&400!==t||(this.agreementsMaxretries>=0&&this.retryUpdateAgreements(),this.agreementsMaxretries-=1),this.handleErrorRetry("error-confirmed-agreements")}verificationsCompleted(e){this._poolingCallsCount=0,this._verificationId=e.id,this._callGetVerificationStatus(this._verificationId,this.customerId,this.poolingValidationsDelay,this._poolingCallsCount,this.poolingValidationsMaxCalls)}fetchDocumentsVerifications(e){const t=e.length&&e[0]||{},i=t.status||{},{description:a}=i,s=new RegExp("(.*)\\|(.*)\\|(.*)"),r=a.match(s)||[];if(this.dataValidation(i.id,t),"PROCESSING"===i.id)this._callGetVerificationStatus(this._verificationId,this.customerId,this.poolingValidationsDelay,this._poolingCallsCount,this.poolingValidationsMaxCalls);else if("DONE"===i.id&&r.length&&"SI"===r[2]){const{documentExtractedData:e}=t;this.documentsVerificationsRetries=0,this._fireEvent("hide-message-spinner-veil"),this._fireEvent("document-extracted-data",e),this._fireEvent("fetch-documents-verifications-success")}else this.errorDocumentsVerifications()}dataValidation(e,t){"PROCESSING"!==e&&"OPEN"!==e||this._fireEvent("error-analitycs-process-verification",t)}errorDocumentsVerifications(){this._fireEvent("hide-message-spinner-veil"),this.documentsVerificationsRetries+=1,this.documentsVerificationsRetries>=this.documentsVerificationsMaxRetries?this.showExitModalWithDate():this._fireEvent("fetch-documents-verifications-error")}_callGetVerificationStatus(e,t,i,a,s){a>=s?this.errorDocumentsVerifications():(a+=1,setTimeout((()=>{this._getVerificationStatus(e,t)}),i))}_getVerificationStatus(e,t){this._fireEvent("get-documents-verifications",{verificationId:e,clientId:t})}}customElements.define(Nt.is,Nt);class Lt extends(bt(ve(C(m(A))))){static get is(){return"bbva-address-step-dm-upgrade-account"}static get properties(){return{showAddressTitle:{type:String},datePickerData:{type:Object},proofAddressDocumentsTypeId:{type:Array},indicatorsFilter:{type:Object},customerDocumentsType:{type:Array},mediaCapture:{type:Object},continueEnabled:{type:Object},pluginName:{type:Object,attribute:"plugin-name"},_customerAddresses:{type:Array},_addressesData:{type:Object},_proofDocument:{type:String},_proofDate:{type:String},_isSelectedProof:{type:Boolean},_state:{type:Object},_municipality:{type:Object},_colonies:{type:Object},_updatedAddress:{type:Boolean},_customerData:{type:Object},_documentExpirationDate:{type:String},_documentNumber:{type:String},_obverse:{type:Boolean},_reverse:{type:Boolean},_proof:{type:Boolean},_documents:{type:Object},_uploadedAddress:{type:Boolean},_documentTypesErrorRetry:{type:Number},_documentTypesMaxRetries:{type:Number},_geographicPlacesErrorRetry:{type:Number},_geographicPlacesMaxRetries:{type:Number},_obverseProof:{type:Boolean},_reverseProof:{type:Boolean},_isAddressUnmasked:{type:Boolean}}}static get scopedElements(){const e=[fe];return Lt.scopedElementsFromClasses(e)}constructor(){super(),this.datePickerData={},this.showAddressTitle="",this.pluginName="MediaCapturePlugin",this.proofAddressDocumentsTypeId=["026","006","007","008","064","005"],this.indicatorsFilter={value:{creationDate:{name:"creationDate",value:"false"},expirationDate:{name:"expirationDate",value:"false"},sideIndicator:{name:"sideIndicator",value:"F"}}},this._proofDocument="026",this._isAddressUnmasked=!1,this.reset()}render(){return d`
      <bbva-manager-photo-converter
        id="photoConverter"
        @obverse-success="${this._onPhotoConverterSuccess}"
        @reverse-success="${this._onPhotoConverterSuccess}">
      </bbva-manager-photo-converter>
    `}updated(e){if(e.has("continueEnabled")&&this._fireEvent("enable-continue-button",this.continueEnabled),this._isSelectedProof&&(e.has("mediaCapture")||e.has("_proofDate")||e.has("_invalidProofDate"))){const e=!this._invalidProofDate&&!!this._proofDate&&Object.keys(this.mediaCapture).length>0;this.continueEnabled=e}(e.has("_reverse")||e.has("_proof"))&&this.checkStatusUploadedDocuments()&&this._continue()}reset(){this.resetUploadDocumentsPropierties(),this.mediaCapture={},this.showAddressTitle="",this.continueEnabled=!1,this.datePickerData={},this.customerDocumentsType=[],this._uploadedAddress=!1,this._addressesData={},this._customerAddresses=[],this._documentNumber="",this._updatedAddress=!1,this._proofDate="",this._isSelectedProof=!1,this._colonies={},this._zipCode="",this._customerData={},this._state={},this._municipality={},this._documents={OBVERSE:"",REVERSE:""},this._geographicPlacesErrorRetry=0,this._documentTypesErrorRetry=0,this._geographicPlacesMaxRetries=2,this._documentTypesMaxRetries=2}get documentExpirationDate(){return this._documentExpirationDate=(new Date).toISOString(),this._documentExpirationDate}resetProcess(){this.reset(),this._fireEvent("hide-spinner"),this._fireEvent("media-capture-right-click-delete-accept",""),this._fireEvent("reset-address-modal"),this._onAllDataRetrieved(),this._onAllData()}resetUploadDocumentsPropierties(){this._proof=!1,this._obverse=!1,this._reverse=!1,this._reverseProof=!1,this._obverseProof=!1}checkStatusUploadedDocuments(){return this._isSelectedProof&&this._proof||!this._isSelectedProof&&this._reverse}continueStepClicked(){this.checkStatusUploadedDocuments()?this._continue():this._updatedAddress?this._putRequestAddresses():(this.resetUploadDocumentsPropierties(),this._uploadDocuments())}_continue(){this._fireEvent("update-address-step",{address:!!this._customerAddresses,addressData:{customerAddresses:this._customerAddresses,updatedAddress:this._updatedAddress,addressesData:this._addressesData},id:"address"})}showOptionMediaCapture(){this._fireEvent("open-upgrade-account-option-media-capture-modal")}initStep(){this.continueEnabled=!0,this.getDocumentTypes(),this.getCustomerAddress(),this._fireEvent("loading-address",!0)}getCustomerAddress(){this._fireEvent("get-customer-addresses")}firstOptionSelected(){this.launchGalleryCapture({source:"gallery",scaleType:"maxWeight",scaleRate:.5,quality:100,showMetadata:!0,base64:!0,grayscale:!0,monochrome:!0})}secondOptionSelected(){this.launchCameraCapture({source:"camera",scaleType:"maxWeight",scaleRate:.5,quality:100,showMetadata:!0,base64:!0,grayscale:!0,monochrome:!0})}onMediaCaptureRightClick(){this._fireEvent("media-capture-right-click-delete",{code:"DELETE-ALERT",selectedConfig:{className:"alert",openMaximized:!1,iconOnlyFullHeight:!0,acceptBtLabel:"upgrade-account-media-capture-modal-button",onAcceptEvent:()=>this._setAcceptEvent(),template:{type:"paragraphs",values:[{icon:"coronita:alert",iconClass:"icon-size-24",class:"info"},{text:"upgrade-account-media-capture-modal-text"}]}}})}onDateChanged(e){const t=moment(e),i=moment().subtract(3,"months"),a=t.diff(i,"days");this._proofDate=e,this._invalidProofDate=a<0,this._fireEvent("input-date-validation",{message:a<0?"upgrade-account-multistep-address-date-input-range-error":"",invalid:a<0})}_setAcceptEvent(){this.mediaCapture={},this._fireEvent("media-capture-right-click-delete-accept","")}onCustomerDataChanged(e){this._customerData=e;const t=((this._customerData||{}).identityDocuments||[]).find((e=>"INE"===e.documentType.id));this._documentExpirationDate=t.expirationDate,this._documentNumber=t.documentNumber,this._onAllDataRetrieved()}onCustomerDetailChanged(e){this._customerAddresses=e,this._isAddressUnmasked=!this._isAddressUnmasked;const t="upgrade-account-multistep-address-data-text-action-link";this.showAddressTitle=this.showAddressTitle===t?"upgrade-account-multistep-address-data-text-hidde-link":t,this._fireEvent("set-show-title-text",this.showAddressTitle),this._onAllDataRetrieved()}getDocumentTypes(){this._fireEvent("get-customer-documents-types-addresses")}onCustomerDocumentsTypeChanged(e){this.customerDocumentsType=e,this._onAllData()}onDocumentTypesError(){this._customErrorRetry({id:"documentTypes",max:this._documentTypesMaxRetries,event:"get-customer-documents-types-addresses",exit:!0})}_onAllDataRetrieved(){const{addressId:e}=(this._customerAddresses||[]).find((e=>e.addressId))||{},t=((this._customerAddresses||[]).find((e=>e.location))||{}).location;t&&(this._addressesData={address:t.addressName,postalCode:t.zipCode,country:t.country.name,state:t.state.name},this._fireEvent("set-addresses-data",this._addressesData),this._fireEvent("loading-address",!1)),this._fireEvent("set-address-id",e)}onToggleMasked(){this._fireEvent("get-customer-unmasked-address",{unmasked:this._isAddressUnmasked})}onGetCustomerAddressesError(){this.nonExitHandleErrorRetry("get-customer-address")}onAcceptContinueModal(){this._uploadDocuments()}_onAllData(){if(this.customerDocumentsType){const e=(this.customerDocumentsType||[]).filter((e=>this.proofAddressDocumentsTypeId.includes(e.id)));this._fireEvent("set-customer-document-types-data",e)}}searchPostalCode(e){this._zipCode=e,this._fireEvent("search-geographic-places",e)}openModal(){this._fireEvent("send-modal-address")}onAddressChanged(e){this._addressesData={address:e.internalNumber?`${e.street}, ${e.externalNumber}, ${e.internalNumber}`:`${e.street}, ${e.externalNumber}`,postalCode:e.postalCode,country:e.country,state:e.state,colonies:e.colonies,street:e.street,externalNumber:e.externalNumber,internalNumber:e.internalNumber||""},this._colonies=e.colonies,this._updatedAddress=!!e,this._fireEvent("change-address",!0),this._fireEvent("set-addresses-data",this._addressesData)}onGeographicPlacesSuccess(e){if(e){const t=e.find((e=>e.geographicPlaceTypes)).geographicPlaceTypes;this._municipality=t.find((e=>"MUNICIPALITY"===e.id));const i=this._municipality.value;this._state=e.find((e=>e.state)).state;const a=this._state.name,s=e.map((e=>({label:e.name,value:e.id})));this._fireEvent("set-geographic-places",{municipality:i,state:a,colonies:s,country:"Mexico"})}else this.onGeographicPlacesError()}onSelectedProof(e){this._fireEvent("media-capture-right-click-delete-accept",""),this._isSelectedProof="026"!==e,this._proofDocument=e,this.continueEnabled=!this._isSelectedProof,this._proof=!this._isSelectedProof}_setUpdatedAddressData(e){return{...e,location:{addressComponents:[{componentTypes:["COUNTRY"],code:"MEX"},{componentTypes:["POSTAL_CODE"],code:this._zipCode},{componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:this._state.id},{componentTypes:["ADMINISTRATIVE_AREA_LEVEL_2"],name:this._municipality.value},{componentTypes:["COLONY"],name:this._colonies.label},{componentTypes:["STREET"],name:this._addressesData.street},{componentTypes:["EXTERIOR_NUMBER"],name:this._addressesData.externalNumber},{componentTypes:["INTERIOR_NUMBER"],name:this._addressesData.internalNumber||""}]}}}_validateExpirationDate(e){const t=Date.now();return Date.parse(e)>t?e:this.documentExpirationDate}_setUpdatedProofData(e){const t=this._validateExpirationDate(this._documentExpirationDate),i=this._isSelectedProof?"issueDate":"expirationDate",a=this._isSelectedProof?this._proofDate:t,s=this._isSelectedProof?"":this._documentNumber;return{...e,addressProofDocuments:[{documentType:{id:this._proofDocument},documentNumber:s,[i]:a}]}}setObverseImage(e){const t=this._calculateImageQuality(e.file.size),i=this.shadowRoot.getElementById("photoConverter");i.quality=t,i.getImageFile({url:e.url,name:e.file.name,id:"obverse"})}setReverseImage(e){const t=this._calculateImageQuality(e.file.size),i=this.shadowRoot.getElementById("photoConverter");i.quality=t,i.getImageFile({url:e.url,name:e.file.name,id:"reverse"})}_onPhotoConverterSuccess(e){const t=e.detail.id.toUpperCase();this._documents[t]=e.detail}_uploadDocuments(e="OBVERSE"){const{file:t,base64:i}=this._documents[e],a={documentType:"O",side:e,pageType:"REVERSE"===e?"LAST_PAGE":"FIRST_PAGE",verificationType:{id:"NAME"},metadata:{documentTypeId:"001",product:"GM",operationType:"saveDocCteTempGM",referenceNumber:"",procedure:"A4"},contentInfo:{contentData:"identificacion INE",contentType:"jpg",documentFamily:"jpg"}};this._fireEvent("show-spinner"),this._fireEvent("upload-proof-document",this._generateArchivingRequest(a,t,i,`${e}.jpeg`,"image/jpeg"))}_uploadDocumentsProof(e="OBVERSE"){const{file:t,base64:i}=this._documents[e],a={documentType:"O",side:e,pageType:"REVERSE"===e?"LAST_PAGE":"FIRST_PAGE",verificationType:{id:"ADDRESS"},metadata:{documentTypeId:this._proofDocument,product:"GM",operationType:"saveDocCteTempGM",referenceNumber:"",procedure:"A4"},contentInfo:{contentData:"Comprobante",contentType:"jpg",documentFamily:"jpg"}};this._fireEvent("show-spinner"),this._fireEvent("upload-proof-document",this._generateArchivingRequest(a,t,i,`${e}.jpeg`,"image/jpeg"))}_uploadProof(){const e={documentType:"O",side:"OBVERSE",verificationType:{id:"ADDRESS"},metadata:{documentTypeId:this._proofDocument,product:"GM",operationType:"saveDocCteTempGM",referenceNumber:"",procedure:"A4"},contentInfo:{contentData:"Comprobante",contentType:"jpg",documentFamily:"jpg"}},{name:t}=this.mediaCapture,i=new File([{size:this.mediaCapture.size,type:"image/jpeg"}],t,{type:"image/jpeg"}),a=this.mediaCapture.fileBase64;this._fireEvent("show-spinner"),this._fireEvent("upload-proof-document",this._generateArchivingRequest(e,i,a,t,"image/jpeg"))}onUploadDocumentsSuccess(){this._fireEvent("hide-spinner"),this._obverse?this._reverse?"026"!==this._proofDocument?this._proof=!0:this._obverseProof?this._reverseProof||(this._reverseProof=!0,this._proof=!0):(this._obverseProof=!0,this._uploadDocumentsProof("REVERSE")):(this._reverse=!0,this._isSelectedProof?this._uploadProof():this._uploadDocumentsProof()):(this._obverse=!0,this._uploadDocuments("REVERSE"))}onUploadDocumentsError(){this.handleErrorRetry("error-upload-documents"),this._fireEvent("hide-spinner")}retryUploadDocuments(){const e={OBVERSE:this._obverse,REVERSE:this._reverse,PROOF:this._proof},t=Object.keys(e).find((t=>!e[t]));"PROOF"===t?"026"!==this._proofDocument?this._uploadProof():this._uploadDocumentsProof():this._uploadDocuments(t)}retryPutAddresses(){this._putRequestAddresses()}onPutAddressError(){this.handleErrorRetry("error-put-addresses")}onPutAddressSuccess(){this._uploadedAddress=!0,this._fireEvent("hide-spinner"),this._uploadDocuments()}_putRequestAddresses(){let e={addressType:{id:(this._customerAddresses.find((e=>e.addressType))||{}).addressType.id||""}};e=this._setUpdatedProofData(e),this._updatedAddress&&(e=this._setUpdatedAddressData(e)),this._request=e,this._fireEvent("show-spinner"),this._fireEvent("put-address-data",e)}validateModalFields(e){var t;const i=!!e.data.street&&!!e.data.externalNumber&&!!e.data.colonies&&Object.keys(null===(t=e.data)||void 0===t?void 0:t.colonies).length>0&&!!e.data.postalCode&&5===e.data.postalCode.length;this._fireEvent("set-modal-validation-status",i)}onGeographicPlacesError(e){this._fireEvent("set-geographic-places-error",!0);const t=e&&((e||{}).messages||[]).find((e=>e.code)).code;t&&"functionalError"===t?this._customErrorRetry({id:"geographicPlaces",max:this._geographicPlacesMaxRetries,event:"search-geographic-places",params:this._zipCode,exit:!1}):this._fireEvent("hide-spinner")}launchCameraCapture(e){const t="launch-camera-capture";this.__generateErrorEvent(this._genericCall(this.pluginName,"getpicture",`${t}-success`,e),t)}launchGalleryCapture(e){const t="launch-gallery-capture";this.__generateErrorEvent(this._genericCall(this.pluginName,"getpicture",`${t}-success`,e),t)}__generateErrorEvent(e,t){e.catch((e=>this.__fire(`${t}-error`,e)))}openDatePicker(){const e=moment().format("YYYY-MM-DD"),t={dateFormat:"yyyy-MM-dd",defaultDate:e,minDate:moment().subtract(3,"months").format("YYYY-MM-DD"),maxDate:e};this._fireEvent("launch-date-picker",t)}onDatePickerSuccess(e){this._fireEvent("date-picker-data",e)}onDatePickerError(e){this._fireEvent("date-picker-data",e)}}customElements.define(Lt.is,Lt);class Pt extends(bt(A)){static get is(){return"bbva-usage-step-dm-upgrade-account"}static get properties(){return{usage:{type:Boolean},formData:{type:Object},usageAccount:{type:Array},signatureValue:{type:String}}}constructor(){super(),this.reset(),this.signatureValue=""}updated(e){e.has("usageAccount")&&this._usageAccountChanged(this.usageAccount)}reset(){this.usage=!1,this.formData={},this.usageAccount=[]}resetProcess(){this.sendUsageSelectorData(),this.reset()}sendUsageSelectorData(){this.bankRelationshipFormOptions=[{value:"EXCLUSIVE",label:"upgrade-account-bank-relationships-exclusive",selected:!0},{value:"MAIN",label:"upgrade-account-bank-relationships-main",selected:!1},{value:"OCCASIONAL",label:"upgrade-account-bank-relationships-occasional",selected:!1}],this.moneyOriginFormOptions=[{value:"SAVINGS",label:"AHORROS",selected:!1},{value:"HEREDITY",label:"HERENCIA",selected:!1},{value:"SALE_OF_GOODS_AND_SERVICES",label:"VENTA DE BIENES Y SERVICIOS",selected:!0},{value:"REWARDS_RAFFLE_AND_LOTTERY",label:"PREMIOS, RIFAS Y SORTEOS",selected:!1},{value:"PAYROLL_OR_PENSION",label:"NÓMINA Y/O PENSIÓN",selected:!1},{value:"BANK_LOAN",label:"PRÉSTAMO BANCARIO",selected:!1},{value:"OTHER",label:"OTROS",selected:!1}],this._fireEvent("bank-relationship-form-options-changed",this.bankRelationshipFormOptions),this._fireEvent("money-origin-form-options-changed",this.moneyOriginFormOptions)}continueStepClicked(){this.additionalInformationValidation(this.formData),this._fireEvent("usage-summary",this._generateSummary(this.formData)),this._fireEvent("complete-step"),this._fireEvent("update-usage-step",{usage:this.usage,usageData:this.formData,id:"usage"})}additionalInformationValidation(e){const t=!/^[0]*$/.test(e.clabe)&&18===Object.keys(e.clabe||{}).length;t&&this.signatureValue&&this.requestAdditionalInformation(this.signatureValue,e.clabe),this.signatureValue&&!t&&this.requestAdditionalInformation(this.signatureValue,""),t&&!this.signatureValue&&this.requestAdditionalInformation("",e.clabe)}requestAdditionalInformation(e,t){const i={body:{eSignatureSerialNumber:e,mainExternalInterbankClabe:t}};this._fireEvent("upgrade-account-request-additional-information",i)}_usageAccountChanged(e){const t=e.map(((e,t)=>{const{value:i}=e.descriptions.find((e=>"SPA"===e.language));return{value:e.id,label:i.substring(0,i.length-6).trim(),selected:!t}}));this._fireEvent("usage-account-form-options-changed",t)}_generateSummary(e){return[{type:"list",label:"upgrade-account-multistep-usage-info-bank-relationship",value:e.bankRelationship?e.bankRelationship.label:""},{type:"list",label:"upgrade-account-multistep-usage-info-usage-account",value:e.usageAccount?e.usageAccount.label:""},{type:"list",label:"upgrade-account-multistep-usage-info-money-origin",value:e.moneyOrigin?e.moneyOrigin.label:""},{type:"divider"},{type:"list",label:"upgrade-account-multistep-usage-info-how-pay-credits",value:e.howPayCredits?e.howPayCredits.text:""},{type:"list",label:"upgrade-account-multistep-usage-info-pay-credits-time",value:e.payCreditsTime?e.payCreditsTime.text:""}]}}customElements.define(Pt.is,Pt);var Ft=e`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-increase-color: initial;
  --bbva-list-simple-decrease-color: initial;
  --bbva-list-simple-nochange-color: initial;
  --bbva-list-simple-skeleton-color: initial;
}
${(new r).mediaRules()}`;const Mt=new r;var Vt=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: transparent;
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${t(o.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-increase-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-decrease-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-nochange-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${t(o.primaryMedium)});
}
${Mt.mediaRules()}`;const Dt={dark:e`
    ${c.dark}
    ${ie.dark}
    ${Vt}
  `,light:e`
    ${c.light}
    ${ie.light}
    ${Ft}
  `},_t=new r;var yt=e`:host {
  --_text-color: var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_mask-color: var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_label-color: var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_description-color: var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${t(o.secondary600)}));
  --_icon-color: var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${t(o.primaryMedium)}));
  --skeleton-quote-color: var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${t(o.secondary200)}));
  --_list-simple-active-bg-color: var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${t(o.secondary100)}));
  --_list-simple-label-color: var(--bbva-list-simple-label-color, var(--colorsSecondary500, ${t(o.secondary500)}));
  --_list-simple-increase-color: var(--bbva-list-simple-increase-color, var(--colorsTertiaryType6Dark, ${t(o.tertiaryType6Dark)}));
  --_list-simple-decrease-color: var(--bbva-list-simple-decrease-color, var(--colorsTertiaryType1Dark, ${t(o.tertiaryType1Dark)}));
  --_list-simple-nochange-color: var(--bbva-list-simple-nochange-color, var(--colorsTertiaryType2, ${t(o.tertiaryType2)}));
  display: block;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  color: var(--_text-color);
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

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}
:host([disabled]) bbva-link[disabled] {
  opacity: 1;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
  --bbva-link-active-color: var(--bbva-list-simple-active-link-color, var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)}));
}

.description-link:not(.link),
.label-link:not(.link) {
  --bbva-link-color: var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${t(o.primaryMedium)}));
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

dl, dt, dd {
  margin: 0;
}

dt {
  overflow: hidden;
}
.content:not(.stacked):not(.stacked-center) dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

bbva-link:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

.link {
  text-align: right;
}

.action-button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_icon-color);
}

.list-content {
  display: flex;
  justify-content: space-between;
  overflow: hidden;
}

.content {
  position: relative;
}
.content.stacked-center {
  display: flex;
  align-items: center;
  justify-content: center;
}
.content.stacked-center .action-button {
  position: absolute;
  right: 0;
  z-index: 2;
}
.content.stacked-center .description-wrapper,
.content.stacked-center .label-wrapper {
  display: flex;
  justify-content: center;
}
.content.stacked-center .list-content {
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.content.stacked {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.content.stacked .list-content {
  display: block;
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
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${t(o.secondary200)})) 50%), linear-gradient(-60deg, var(--skeleton-quote-color, var(--colorsSecondary200, ${t(o.secondary200)})) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 0 4px, 100% 4px;
}
.skeleton.stacked {
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${t(o.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${t(o.secondary200)})) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 0 4px, 0 26px;
}
.skeleton.stacked-center {
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${t(o.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${t(o.secondary200)})) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 92% 4px, 168% 26px;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) .content > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .content .skeleton {
  opacity: 1;
}

.mask {
  color: var(--_mask-color);
}

.label {
  color: var(--_label-color);
}
.stacked .label .label, .stacked-center .label .label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_description-color);
}

.label-link {
  text-align: left;
}

.label-wrapper {
  display: flex;
  flex: 0 1 auto;
}

.description,
.description-link {
  text-align: right;
}
.description.align,
.description-link.align {
  text-align: left;
}

.description-wrapper {
  display: flex;
  flex: 0 1 auto;
  overflow: hidden;
}
.description-wrapper.amount {
  overflow: initial;
}
.content:not(.stacked):not(.stacked-center) .description-wrapper {
  justify-content: flex-end;
}
.description-wrapper .status-icon {
  min-height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.center {
  text-align: center;
}

.medium {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(i.medium.fontStyle)});
}

.content-link {
  display: flex;
  margin-left: auto;
  text-align: right;
  padding-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}

.increase {
  color: var(--_list-simple-increase-color);
}

.decrease {
  color: var(--_list-simple-decrease-color);
}

.nochange {
  color: var(--_list-simple-nochange-color);
}
${_t.mediaRules()}`;class Bt extends($(ae(A))){static get is(){return"bbva-list-simple"}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium"},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium"},descriptionDate:{type:Boolean,attribute:"description-date"},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon"},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},statusIcon:{type:Object,attribute:"status-icon"},statusAccessibilityText:{type:String,attribute:"status-accessibility-text"},mask:{type:String},loading:{type:Boolean,reflect:!0},disabled:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disabled=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.statusIcon={increase:`${se()}`,decrease:`${re()}`,nochange:`${oe()}`},this.maskChars="••••",this.visibleChars=0}static get styles(){return[yt,Dt.light,Dt.dark,G("button:focus"),l("bbva-list-simple-shared-styles")]}get _icon(){return d`
      ${this.actionIcon?d`
            <button class="action-button" @click="${this._iconClick}">
              <span class="sr-only">${this.actionAccessibilityText}</span>
              <bbva-core-icon
                icon="${this.actionIcon}"
                .size="${this.actionIconSize}"
                aria-hidden="true"
              ></bbva-core-icon>
            </button>
          `:""}
    `}get _statusIcon(){return d`
      <span class="sr-only">${this.statusAccessibilityText}</span>
      <bbva-core-icon
        class="status-icon ${E(this.status)}"
        icon="${this.statusIcon[this.status]}"
        size="16"
        aria-hidden="true"
      >
      </bbva-core-icon>
    `}static _getMaskElement(e,t,i,a){if(e){const s=ne(e,t,i,a);return d`
        <div class="wrapper">
          <span class="mask">${t}</span>
          <span class="number">${s.substr(t.length)}</span>
        </div>
      `}return d``}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return d`
      <bbva-amount
        ?decimals-hidden="${this.decimalsHidden}"
        class="amount ${Q({medium:this.descriptionMedium})}"
        variant="s"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _label(){return d`
      <bbva-text
        class="label ${this.labelEllipsis?"ellipsis":""}"
        unset
        size="S"
        font-weight="${this.labelMedium?"500":""}"
        text="${this.label}"
      >
      </bbva-text>
    `}get _description(){return d`
      <bbva-text
        class="description ${this.status||"stacked"===this.variant?"align":""}
          ${this.descriptionEllipsis?"ellipsis":""}"
        unset
        size="S"
        alignment="${"stacked"===this.variant?"left":"right"}"
        font-style="${this.descriptionDate||this.descriptionItalic?"italic":""}"
        font-weight="${this.descriptionMedium||this.descriptionDate?"500":""}"
        text="${this.description}"
      >
      </bbva-text>
    `}get _descriptionLink(){return d`
      <bbva-link
        ?disabled=${this.disabled||this.disableLink}
        class=${Q({"description-link":!0,align:this.status,ellipsis:this.descriptionEllipsis})}
        @click="${this._linkClick}"
      >
        ${this.description}
      </bbva-link>
    `}get _labelLink(){return d`
      <bbva-link
        ?disabled=${this.disabled||this.disableLink}
        class=${Q({"label-link":!0,ellipsis:this.labelEllipsis})}
        @click="${this._linkClick}"
      >
        ${this.label}
      </bbva-link>
    `}get _link(){return d`
      <bbva-link
        class=${Q({link:!0,ellipsis:this.actionLinkEllipsis})}
        ?disabled=${this.disabled||this.disableLink}
        @click="${this._linkClick}"
      >
        ${this.actionLink}
      </bbva-link>
    `}get _main(){return this.label||this.labelLink?this.description||this.descriptionLink||this.mask||this._isValidAmount?d`
      <dl class="list-content">
        <dt class="label-wrapper">
          ${this.labelLink&&"stacked"!==this.variant&&"stacked-center"!==this.variant?this._labelLink:this._label}
          ${"stacked"!==this.variant&&"stacked-center"!==this.variant?this._icon:""}
        </dt>
        <dd class="description-wrapper ${Q({amount:this._isValidAmount})}">
          ${this.status?this._statusIcon:""}
          ${!this._isValidAmount||this.mask||this.description||this.descriptionLink?"":this._amount}
          ${!this.descriptionLink||this.mask||this._isValidAmount?"":this._descriptionLink}
          ${!this.mask||this.descriptionLink||this.description||this._isValidAmount?"":Bt._getMaskElement(this.mask,this.maskChars,!0,this.visibleChars)}
          ${!this.description||this._isValidAmount||this.descriptionLink||this.mask?"":this._description}
        </dd>
      </dl>
    `:d`
        <div class="label-wrapper">${this.labelLink?this._labelLink:this._label}</div>
      `:d`
        <div class="description-wrapper">
          ${this.descriptionLink?this._descriptionLink:this._description}
        </div>
      `}get _swapAction(){return this.actionIcon?this._icon:this.actionLink?d` <div class="content-link">${this._link}</div> `:null}render(){return d`
      <div
        class="content

          ${"stacked-center"===this.variant?"stacked-center":""}
          ${"stacked"===this.variant?"stacked":""}"
      >
        ${this._main}
        ${"stacked"===this.variant||"stacked-center"===this.variant?this._swapAction:""}
        <div
          class="skeleton
            ${"stacked-center"===this.variant?"stacked-center":""}
            ${"stacked"===this.variant?"stacked":""}"
        ></div>
      </div>
    `}_iconClick(){this.dispatchEvent(new CustomEvent("list-simple-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("list-simple-link-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(Bt.is,Bt);class Ut extends(C(m(A))){static get is(){return"bbva-modal-input-address-upgrade-account"}static get scopedElements(){const e=[Le,U,j,I,b,Bt];return Ut.scopedElementsFromClasses(e)}static get properties(){return{modalTitle:{type:String},postalCode:{type:String},colonies:{type:Object},inputsConfig:{type:Object},singleColony:{type:Array},postalCodeInvalid:{type:Boolean},externalNumberInvalid:{type:Boolean},streetInvalid:{type:Boolean},_showPlaces:{type:Boolean},_formData:{type:Object},_formFields:{type:Array},_open:{type:Boolean,reflect:!0,attribute:"open"},_isValidForm:{type:Boolean}}}constructor(){super(),this.modalTitle="",this.buttonText="",this._formData={internalNumber:"",externalNumber:"",postalCode:"",country:"",state:"",municipality:"",street:"",colonies:{}},this.colonies=[],this.singleColony=[],this.postalCodeInvalid=!1,this.externalNumberInvalid=!1,this.streetInvalid=!1,this._isValidForm=!1,this.inputsConfig={clearIcon:`${F()}`,errorMessageIcon:`${D()}`,street:{label:"upgrade-account-address-modal-street-label",allowedPattern:"[0-9a-zA-ZñÑ áéíóúÁÉÍÓÚüÜ]",maxlength:50,errorMessage:"upgrade-account-address-modal-street-error"},externalNumber:{label:"upgrade-account-address-modal-extnum-label",allowedPattern:"[0-9a-zA-Z,◦ .,:;?()/,-,&+%*=<>]",maxlength:8,errorMessage:"upgrade-account-address-modal-extnum-error"},internalNumber:{label:"upgrade-account-address-modal-intnum-label",allowedPattern:"[0-9a-zA-Z,◦ .,:;?()/,-,&+%*=<>]",maxlength:8},postalCode:{label:"upgrade-account-address-modal-postalcode-label",allowedPattern:"[0-9]",maxlength:5,errorMessage:"upgrade-account-address-modal-postalcode-error"}},this._showPlaces=!1,this._open=!1}static get styles(){return[Ne,l("bbva-modal-upgrade-account-shared-styles"),l("bbva-shared-style-component-utilities")]}render(){return d`
    <bbva-help-modal
      id="addressModal"
      title="${this.t(this.modalTitle)}"
      accessibility-text-icon-right-primary="${this.t("upgrade-account-modal-accessibility-close")}"
      full-height
      fixed-footer
      hide-content-padding-top
      header-text="${this.t(this.modalTitle)}"
      ?visible="${this._open}">
    <div class="u-text-align--left flex-column-container" slot="slot-content">
      <div class="flex-grow--2">
        <bbva-form-field
          id="street"
          class="u-margin-bottom--1"
          required
          @form-field-input-clear="${this.resetStreet}"
          .value="${this._formData.street}"
          allowed-pattern="${this.inputsConfig.street.allowedPattern}"
          label="${this.t(this.inputsConfig.street.label)}"
          error-message-icon="${this.inputsConfig.errorMessageIcon}"
          @form-field-input-blur="${this._onBlurFields}"
          error-message="${this.t(this.inputsConfig.street.errorMessage)}"
          maxlength="${this.inputsConfig.street.maxlength}"
          clear-icon="${this.inputsConfig.clearIcon}">
        </bbva-form-field>
        <bbva-form-field
          id="externalNumber"
          class="u-margin-bottom--1"
          required
          @form-field-input-clear="${this.resetExternalNumber}"
          .value="${this._formData.externalNumber}"
          @form-field-input-blur="${this._onBlurFields}"
          allowed-pattern="${this.inputsConfig.externalNumber.allowedPattern}"
          label="${this.t(this.inputsConfig.externalNumber.label)}"
          error-message-icon="${this.inputsConfig.errorMessageIcon}"
          error-message="${this.t(this.inputsConfig.externalNumber.errorMessage)}"
          maxlength="${this.inputsConfig.externalNumber.maxlength}"
          clear-icon="${this.inputsConfig.clearIcon}"></bbva-form-field>
        <bbva-form-field
          id="internalNumber"
          class="u-margin-bottom--1"
          .value="${this._formData.internalNumber}"
          @form-field-input-blur="${this._onBlurFields}"
          allowed-pattern="${this.inputsConfig.internalNumber.allowedPattern}"
          maxlength="${this.inputsConfig.internalNumber.maxlength}"
          label="${this.t(this.inputsConfig.internalNumber.label)}"
          clear-icon="${this.inputsConfig.clearIcon}"></bbva-form-field>
        <bbva-form-field
          id="postalCode"
          class="u-margin-bottom--1"
          required
          @form-field-input-clear="${this.resetPostalCode}"
          .value="${this._formData.postalCode}"
          ?invalid="${this.postalCodeInvalid}"
          allowed-pattern="${this.inputsConfig.postalCode.allowedPattern}"
          label="${this.t(this.inputsConfig.postalCode.label)}"
          error-message-icon="${this.inputsConfig.errorMessageIcon}"
          maxlength="${this.inputsConfig.postalCode.maxlength}"
          error-message="${this.t(this.inputsConfig.postalCode.errorMessage)}"
          clear-icon="${this.inputsConfig.clearIcon}"
          @input="${this._validatePostalCode}"
          @form-field-input-blur="${this._onBlurPostalCode}">
        </bbva-form-field>
        ${this._renderPlaces()}
      </div>
      <bbva-button-default
        id="confirmButton"
        class="footer-button-default align--flex-end "
        ?disabled="${!this._isValidForm}"
        @click="${this._sendDataToManager}"
        >${this.t("upgrade-account-address-modal-button")}
      </bbva-button-default>
    </div>
  </bbva-help-modal>
  `}resetPostalCode(){this._formData.postalCode="",this.resetPlaces(),this._validateFields()}resetPlaces(){this._formData.state="",this._formData.municipality="",this._formData.town="",this._formData.country="",this._formData.colonies={},this._showPlaces=!1,this.colonies={},this._validateFields()}resetExternalNumber(){this._formData.externalNumber="",this._validateFields()}resetStreet(){this._formData.street="",this._validateFields()}_onBlurFields(e){this._formData[e.currentTarget.id]=e.currentTarget.value,this._validateFields()}_validateFields(){this._fireEvent("validate-modal-fields",{data:this._formData,invalid:this.postalCodeInvalid})}_validatePostalCode(e){var t,i;(null===(t=e.currentTarget)||void 0===t||null===(i=t.value)||void 0===i?void 0:i.length)<5&&this.resetPlaces()}onFieldsValidation(e){this._isValidForm=e}_sendDataToManager(){this._fireEvent("send-address-change-to-manager",this._formData),this.close()}_onBlurPostalCode(e){this._fireEvent("show-spinner"),this.resetPlaces(),this.postalCodeInvalid=5!==e.currentTarget.value.length,this.postalCodeInvalid?(this._formData.postalCode=null,this._validateFields(),this._fireEvent("hide-spinner")):(this._formData.postalCode=e.currentTarget.value,this._fireEvent("send-postal-code-to-manager",e.currentTarget.value))}setGeographicPlaces(e){if(this._fireEvent("hide-spinner"),this._showPlaces=!0,this._formData.state=e.state,this._formData.municipality=e.municipality,this._formData.town=e.town,this._formData.country=e.country,this.colonies=e.colonies,1===e.colonies.length){const t=e.colonies.shift();this._formData.colonies=t,this._validateFields()}}onGeographicPlacesError(){this.postalCodeInvalid=!0}_renderPlaces(){return this._showPlaces?d`
      ${this._renderColoniesSelect()}
      <bbva-list-simple id="municipality" class="u-padding-right--0 u-padding-left--0" variant="stacked" label="${this.t("upgrade-account-address-modal-municipality")}" .description="${this._formData.municipality}"></bbva-list-simple>
      <bbva-list-simple id="state" class="u-padding-right--0 u-padding-left--0" variant="stacked" label="${this.t("upgrade-account-address-modal-state")}" .description="${this._formData.state}"></bbva-list-simple>
      <bbva-list-simple id="country" class="u-padding-right--0 u-padding-left--0" variant="stacked" label="${this.t("upgrade-account-address-modal-country")}" .description="${this._formData.country}"></bbva-list-simple>
    `:""}_renderColoniesSelect(){return this.colonies.length>1?d`
      <bbva-form-select
        @change="${this._onChangeColonies}"
        class="u-margin-bottom--1"
        required
        label="${this.t("upgrade-account-address-modal-colony")}">
          ${this.colonies.map((e=>d`
            <bbva-form-option value="${e.value}">${this.t(e.label)}</bbva-form-option>
          `))}
      </bbva-form-select>
    `:this.colonies.map((e=>d`
      <bbva-form-field class="u-margin-bottom--1"
        optional-label=""
        readonly
        @form-field-input-blur="${this._onBlurFields}"
        value="${e.label}" label="${this.t("upgrade-account-address-modal-colony")}">
      </bbva-form-field>
    `))}_onChangeColonies(e){const t=this.colonies.find((t=>t.value===e.currentTarget.value));this._formData.colonies=t,this._validateFields()}setData(e){Object.entries(e).forEach((t=>{const i=t.find((e=>!!e));this._formData[i]=e[i]}))}open(){this._open=!0}close(){this._open=!1}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(Ut.is,Ut);const $t={0:0,1:1,2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9,A:10,B:11,C:12,D:13,E:14,F:15,G:16,H:17,I:18,J:19,K:20,L:21,M:22,N:23,"&":24,O:25,P:26,Q:27,R:28,S:29,T:30,U:31,V:32,W:33,X:34,Y:35,Z:36," ":37,"Ñ":38},xt={" ":"00",0:"00",1:"01",2:"02",3:"03",4:"04",5:"05",6:"06",7:"07",8:"08",9:"09","&":"10",A:"11",B:"12",C:"13",D:"14",E:"15",F:"16",G:"17",H:"18",I:"19",J:"21",K:"22",L:"23",M:"24",N:"25",O:"26",P:"27",Q:"28",R:"29",S:"32",T:"33",U:"34",V:"35",W:"36",X:"37",Y:"38",Z:"39","Ñ":"40"};class kt extends A{static get is(){return"bbva-upgrade-account-rfc-calculator"}static get properties(){return{data:{type:Object},_rfc:{type:String},_assignmentDigits:{type:Object},_nameToRfcKeys:{type:Object},_alphanumeric:{type:Object}}}constructor(){super(),this.data={},this._rfc="",this._assignmentDigits=$t,this._nameToRfcKeys=xt,this._alphanumeric="123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"}async getRfc(e){if(e.name){const t=await kt._alphaKey(e.name,e.firstSurname,e.secondSurname),i=await kt._inconvenientWord(t),a=await kt._dateKey(e.birthDate),s=await this._homoclaveRfc(e.name,e.firstSurname,e.secondSurname),r=i+a+s+await this._checkDigitRfc(i+a+s);this._rfc=r,this.dispatchEvent(new CustomEvent("set-rfc-from-customer-data",{bubbles:!0,composed:!0,detail:{rfc:r}}))}else this.dispatchEvent(new CustomEvent("error-setting-rfc",{bubbles:!0,composed:!0}))}static _dateKey(e){return new Promise(((t,i)=>{const[a,s,r]=e.split(/[/-]/gi);a&&s&&r||i(new Error("Wrong birth date format")),a.length>2?t(a.slice(-2)+s+r):t(r.slice(-2)+s+a)}))}static _alphaKey(e,t,i){return new Promise(((a,s)=>{e&&(t||i)||s(new Error("Wrong or missing data"));const r=kt._parseString(e),o=kt._parseString(t),n=kt._parseString(i),A=kt._missingName(o),l=kt._missingName(n),c=kt._isShortSurname(o);a(A?n.substring(0,2)+kt._replaceCommonNames(r).substring(0,2):l?o.substring(0,2)+kt._replaceCommonNames(r).substring(0,2):c?o.charAt(0)+n.charAt(0)+kt._replaceCommonNames(r).substring(0,2):o.charAt(0)+kt._firstVowel(o)+n.charAt(0)+kt._replaceCommonNames(r).charAt(0))}))}static _missingName(e){return!(e.length>0&&!!e)||!("string"==typeof e)}static _replaceCommonNames(e){return e.split(" ").length>1?e.replace(/^(JOSE|J|J\.|MARIA|MA|MA\.)\s+/i,""):e}static _isShortSurname(e){return kt._parseString(e).length<=2}static _firstVowel(e){const t=/[aeiou]/i.exec(e.slice(1));return t?t[0]:""}static _inconvenientWord(e){return new Promise(((t,i)=>{""===e&&i(new Error("Name is empty"));t(e.match(/(BUE[IY]|CAC[AO]|CAGA|KOGE|KAKA|MAME|KOJO|[KQ]ULO|CAGO|CO[GJ]E|COJO|FETO|JOTO|KA[CG]O)/)||e.match(/(MAMO|MEAR|M[EI]ON|MOCO|MULA|PED[AO]|PENE|PUT[AO]|RATA|RUIN)/)?`${e.substring(0,3)}X`:e)}))}static _parseString(e){const t=/\s+/g;return kt._removeAccents(e).toUpperCase().replace(t,"  ").replace(kt._unusedWordsRegex(),"").replace(t," ").trim()}static _unusedWordsRegex(){const e=["DE","LA","LAS","MC","VON","DEL","LOS","Y","MAC","VAN","MI"].map((e=>`^${e} | ${e} | ${e}$`)).join("|");return new RegExp(`(?:${e})`,"g")}static _removeAccents(e){return e.normalize("NFD").replace(/[\u0300-\u036f]/g,"")}static _removeAccentsFromFullName(e){return e.toUpperCase().normalize("NFD").replace(/[\u0300-\u0302]/g,"").replace(/[\u0304-\u036f]/g,"").replace(/N\u0303/g,"Ñ").replace(/[-.',]/g,"")}_characterToDigits(e){return this._nameToRfcKeys[e]}static _sumOfAdjacentPairs(e){return e.split("").reduce(((e,t,i,a)=>{const s=a[i+1];if(!s)return e;return e+parseInt(`${t+s}`,10)*parseInt(s,10)}),0)}_homoclaveRfc(e,t,i){return new Promise(((a,s)=>{e&&(t||i)||s(new Error("Wrong or missing data"));const r=`${e} ${t} ${i}`,o=0+kt._removeAccentsFromFullName(r).split("").map((e=>this._characterToDigits(e))).join(""),n=kt._sumOfAdjacentPairs(o),A=n%1e3/34,l=n%1e3%34;a(this._alphanumeric.charAt(A)+this._alphanumeric.charAt(l))}))}static _valueAddition(e){return e.reduce(((e,t,i)=>e+t*(13-i)),0)}_rfcToDigits(e){return e.map((e=>this._assignmentDigits[e.toUpperCase()]||0))}_checkDigitRfc(e){return new Promise(((t,i)=>{e||i(new Error("Wrong or missing data"));const a=this._rfcToDigits(e.split("")),s=kt._valueAddition(a)%11;t(0!==s?(11-s).toString(16).toUpperCase():"0")}))}}const Yt={61310231700:{ABT:"TIENDA ABARROTES Y MISCELANEA",VTA:"TIENDA ABARROTES Y MISCEL NEA"},"01110130100":{AGP:"CULTIVO ALPISTE"},"01110210100":{AGP:"CULTIVO ARROZ"},"01110390100":{AGP:"CULTIVO AVENA"},"01110470100":{AGP:"CULTIVO CEBADA"},"01110550100":{AGP:"CULTIVO LINAZA"},"01110630100":{AGP:"CULTIVO MAIZ"},"01110710100":{AGP:"CULTIVO MIJO"},"01110890100":{AGP:"CULTIVO SORGO"},"01110970100":{AGP:"CULTIVO SOYA"},"01111040100":{AGP:"CULTIVO TRIGO"},"01120110100":{AGP:"CULTIVO AJO"},"01120290100":{AGP:"CULTIVO CALABAZA"},"01120370100":{AGP:"CULTIVO CAMOTE"},"01120450100":{AGP:"CULTIVO CEBOLLA"},"01120530100":{AGP:"CULTIVO CHILE"},"01120610100":{AGP:"CULTIVO ESPARRAGO"},"01120790100":{AGP:"CULTIVO FRIJOL"},"01120870100":{AGP:"CULTIVO GARBANZO"},"01120950100":{AGP:"CULTIVO JITOMATE"},"01121020100":{AGP:"CULTIVO LENTEJA"},"01121100100":{AGP:"CULTIVO NOPAL"},"01121280100":{AGP:"CULTIVO OTRAS HORTALIZAS"},"01121360100":{AGP:"CULTIVO PAPA"},"01121440100":{AGP:"CULTIVO REMOLACHA"},"01121520100":{AGP:"CULTIVO TOMATE"},"01121600100":{AGP:"CULTIVO YUCA"},"01130190100":{AGP:"CULTIVO ALFALFA"},"01190170100":{AGP:"CULTIVO FRESA"},"01190250100":{AGP:"CULTIVO MELON"},"01190330100":{AGP:"CULTIVO PIÑA"},"01190410100":{AGP:"CULTIVO SANDIA"},"01210120100":{AGP:"CULTIVO ALGODON"},"01220100100":{AGP:"CULTIVO CAÑA AZUCAR"},"01230180100":{AGP:"CULTIVO TABACO"},"01240160100":{AGP:"CULTIVO AJONJOLI"},"01240240100":{AGP:"CULTIVO CACAHUATE"},"01240320100":{AGP:"CULTIVO CARTAMO"},"01240400100":{AGP:"CULTIVO NUEZ"},"01240580100":{AGP:"CULTIVO OLIVO"},"01290160100":{AGP:"CULTIVO ESPECIAS"},"01290240100":{AGP:"CULTIVO OTRAS SEMILLAS"},"01290320100":{AGP:"CULTIVO SEMILLAS MEJORADAS"},"01290400100":{AGP:"CULTIVO VAINILLA"},"01310110100":{AGP:"CULTIVO FLORES Y PLANTAS ORNATO"},"01410100100":{AGP:"CULTIVO CAFE"},"01420180100":{AGP:"CULTIVO AGUACATE"},"01420260100":{AGP:"CULTIVO DURAZNO"},"01420340100":{AGP:"CULTIVO GUAYABA"},"01420420100":{AGP:"CULTIVO LIMON"},"01420500100":{AGP:"CULTIVO MANGO"},"01420680100":{AGP:"CULTIVO MANZANA"},"01420760100":{AGP:"CULTIVO NARANJA"},"01420840100":{AGP:"CULTIVO OTROS ARBOLES FRUTALES"},"01420920100":{AGP:"CULTIVO PAPAYA"},"01421090100":{AGP:"CULTIVO PLATANO"},"01421170100":{AGP:"CULTIVO TAMARINDO"},"01421250100":{AGP:"CULTIVO TORONJA"},"01430160100":{AGP:"CULTIVO VID"},"01440140100":{AGP:"CULTIVO HENEQUEN"},"01440220100":{AGP:"CULTIVO LINO"},"01440300100":{AGP:"CULTIVO OTRAS FIBRAS DURAS"},"01450120100":{AGP:"CULTIVO AGAVE O MEZCAL"},"01450200100":{AGP:"CULTIVO MAGUEY"},"01460100100":{AGP:"CULTIVO COPRA"},"01470180100":{AGP:"CULTIVO CACAO"},"01490140100":{AGP:"OTROS CULTIVOS PERMANENTES"},"01499070100":{AGP:"USUARIOS MENORES AGRICULTURA"},"01910150100":{AGP:"IRRIGACIÓN TIERRAS"},"01910230100":{AGP:"PREP TIERRA"},"02110110100":{AGP:"CRÍA GANADO CARNE"},"02120190100":{AGP:"CRÍA GANADO LECHE"},"02130170100":{AGP:"CRÍA GANADO LIDIA"},"02140150100":{AGP:"CRÍA GANADO CABALLAR"},"02190150100":{AGP:"CRÍA GANADO TRABAJO"},"02199080100":{AGP:"USUARIOS MENORES GANADERIA"},"02210100100":{AGP:"CRÍA Y EXPLOTACIÓN GANADO PORCINO"},"02220180100":{AGP:"CRÍA Y EXPLOTACIÓN GANADO OVINO"},"02230160100":{AGP:"CRÍA Y EXPLOTACIÓN GANADO CAPRINO"},"02310190100":{AGP:"CRÍA GALLINAS HUEVO"},"02320170100":{AGP:"CRÍA Y EXPLOTACIÓN POLLOS"},"02330150100":{AGP:"CRÍA AVES CONSUMO"},"02410180100":{AGP:"CRÍA Y EXPLOTACIÓN ABEJAS"},"02510170100":{AGP:"CRÍA Y EXPLOTACIÓN CONEJOS Y LIEBRES"},"02590110100":{AGP:"CRÍA ANIMALES LABORATORIO"},"02590290100":{AGP:"CRÍA Y EXPLOTACION GUSANO SEDA"},"02910130100":{AGP:"PRADERAS Y POTREROS ARTIFICIALES"},"02910210100":{AGP:"INSEMINACIÓN Y OTROS SERV GANADERÍA"},"03110190300":{AGP:"PLANTACIÓN Y REFORESTACIÓN"},"03290120300":{AGP:"CULTIVO PALMA Y LECHUGUILLA"},"03290200300":{AGP:"BARBASCO ARBORESCENTES Y ARBUSTOS"},"03299050300":{AGP:"PRESERVACIÓN ANIMALES SALVAJES"},"03910110300":{AGP:"MADERAS, PROTECCIÓN BOSQUES"},"04110170300":{AGP:"CAPTURA ATÚN Y SIMILARES"},"04120150300":{AGP:"CAPTURA SARDINA Y SIMILARES"},"04130130300":{AGP:"CAPTURA TIBURÓN Y SIMILARES"},"04190110300":{AGP:"CAPTURA OTROS PECES EN ALTAMAR"},"04210160300":{AGP:"CAPTURA CAMARÓN"},"04220140300":{AGP:"CAPTURA OSTIÓN"},"04290100300":{AGP:"CAPTURA CRUSTÁCEOS Y MOLUSCOS"},"04310150300":{AGP:"CAPTURA TORTUGA"},"04390190300":{AGP:"MAMÍFEROS E INVERTEBRADOS MAR"},"04410140300":{AGP:"CONCHAS, CORALES, ESPONJAS Y PERLAS"},"04420120300":{AGP:"ALGAS Y PLANTAS ACUÁTICAS"},"04510130300":{AGP:"PECES EN RÍOS, LAGOS Y ESTUARIOS"},"04520110300":{AGP:"FAUNA AGUA DULCE"},"04590170300":{AGP:"CRIA Y EXPLOTACION OSTRAS"},"04590250300":{AGP:"OTRAS ESPECIES ACUÁTICAS"},"04910190300":{AGP:"PESQUERÍAS POR CONTRATO"},"05110150300":{AGP:"PRESERVACIÓN ANIMALES SALVAJES"},20410100600:{AGP:"RASTRO",VAL:"RASTRO"},23110170600:{AGP:"DESFIBRACION ALGODON",TEX:"DESFIBRACIÓN ALGODÓN"},23110250600:{AGP:"DESPEPITE ALGODON",TEX:"DESPEPITE ALGODÓN"},20110130600:{ALI:"DESHIDRATACION FRUTAS",VPA:"DESHIDRATACIÓN FRUTAS"},20120110600:{ALI:"EMPACADORA CONSERVAS ALIMENTICIAS",VPA:"EMPACADORA CONSERVAS ALIMENTICIAS"},20120290600:{ALI:"EMPACADORA FRUTAS Y LEGUMBRES",VPA:"EMPACADORA FRUTAS Y LEGUMBRES"},20120370600:{ALI:"CONCENTRADOS FRUTAS",VPA:"FAB CONCENTRADOS FRUTAS"},20120450600:{ALI:"FAB ENCURTIDOS",VPA:"FAB ENCURTIDOS"},20130190600:{ALI:"FAB ATES",VPA:"FAB ATES"},20130270600:{ALI:"FAB QUESO Y MIEL TUNA",VPA:"FAB QUESO Y MIEL TUNA"},20140170600:{ALI:"FAB SALSAS",VPA:"FAB SALSAS"},20210120600:{ALI:"MOLINO TRIGO"},20220100600:{ALI:"MOLINO MAIZ"},20230180600:{ALI:"MOLINO NIXTAMAL"},20240160600:{ALI:"MOLINO ARROZ",VTA:"MOLINO ARROZ"},20250140600:{ALI:"BENEFICIO CAFÉ"},20260120600:{ALI:"MOLINO Y TOSTADOR CAFE"},20270100600:{ALI:"EMPACADORA TE"},20280180600:{ALI:"BENEFICIO ARROZ EXCEPTO MOLIENDA"},20280260600:{ALI:"CACAHUATE Y NUEZ (PROCESO)",VTA:"DESCASCARADO Y TOSTADO CACAHUATE Y NUEZ"},20280340600:{ALI:"SEMILLA CALABAZA (PROCESO)",VTA:"DESCASCARADORA Y TOSTAD SEMILL CALABAZA"},20280420600:{ALI:"MOLINO OTROS GRANOS NO CEREALES",VTA:"MOLINO OTROS GRANOS EXCEPTO CEREALES"},20290160600:{ALI:"MOLINO AVENA",VTA:"MOLINO AVENA"},20290240600:{ALI:"MOLINO CEBADA",VTA:"MOLINO CEBADA"},20290320600:{ALI:"MOLINO OTROS CEREALES",VTA:"MOLINO OTROS CEREALES"},20310110600:{ALI:"MARQUETAS Y ESTUCHADOS AZUCAR"},20310290600:{ALI:"INGENIO AZUCARERO"},20320190600:{ALI:"FAB PILONCILLO"},20330170600:{ALI:"DESTILACION ALCOHOL ETILICO"},20490140600:{ALI:"EMPACADORA CARNE",VAL:"EMPACADORA CARNE"},20490220600:{ALI:"CARNES FRIAS Y EMBUTIDOS",VAL:"FAB CARNES FRÍAS Y EMBUTIDOS"},20490300600:{ALI:"REFRIGERACION CARNES",VAL:"REFRIGERACIÓN CARNES"},20510190600:{ALI:"FAB Y PREHIDRATACION LECHE",VAL:"FAB Y PREHIDRATACIÓN LECHE"},20510270600:{ALI:"PASTEURIZACION HOMOGENEIZACION LECHE"},20520170600:{ALI:"CREMA MANTEQUILLA Y QUESO"},20530150600:{ALI:"LECHE CONDENSADA EVAPORADA",VAL:"FAB LECHE CONDENSADA EVAPORADA"},20540130600:{ALI:"FAB GELATINAS",VAL:"FAB GELATINAS"},20540210600:{ALI:"FAB GRENETINA",VAL:"FAB GRENETINA"},20590130600:{ALI:"PROD A BASE LECHE",VAL:"FAB CAJETAS YOGURTS Y OTROS PROD LECHE"},20610180600:{ALI:"CONGELADORA PROD MARINOS",VTA:"CONGELADORA PROD MARINOS"},20610260600:{ALI:"EMPACADORA OTROS MARISCOS",VTA:"EMPACADORA OTROS MARISCOS"},20610340600:{ALI:"EMPACADORA PESCADO",VTA:"EMPACADORA PESCADO"},20710170600:{ALI:"FAB PAN Y PASTELES"},20720150600:{ALI:"FAB CONOS NIEVE"},20720230600:{ALI:"FAB GALLETAS"},20720310600:{ALI:"FAB PASTAS ALIMENTICIAS"},20810160600:{ALI:"FAB CHOCOLATES",VTA:"FAB CHOCOLATES"},20820140600:{ALI:"DULCES BOMBONES Y CONFITES",VTA:"FAB DULCES BOMBONES Y CONFITES"},20830120600:{ALI:"FAB GOMA MASCAR",VTA:"FAB GOMA MASCAR"},20840100600:{ALI:"TRATAMIENTO Y ENVASE MIEL ABEJA",VTA:"TRATAMIENTO Y ENVASE MIEL ABEJA"},20890100600:{ALI:"FAB JARABES",VTA:"FAB JARABES"},20910150600:{ALI:"ACEITES VEGETALES COMESTIBLES",VPA:"FAB ACEITES VEGETALES COMESTIBLES"},20910230600:{ALI:"MANTECAS VEGETALES COMESTIBLES",VPA:"FAB MANTECAS VEGETALES COMESTIBLES"},20920130600:{ALI:"FAB ALMIDON",VTA:"FAB ALMIDÓN"},20920210600:{ALI:"FAB LEVADURAS",VTA:"FAB LEVADURAS"},20930110600:{ALI:"TORTILLERIA"},20940190600:{ALI:"FAB FRITURAS",VTA:"FAB FRITURAS"},20940270600:{ALI:"ALIM DERIVADOS CEREALES",VTA:"FAB OTROS PREPARADOS DERIVADOS CEREALES"},20950170600:{ALI:"FAB VINAGRE",VPA:"FAB VINAGRE"},20950250600:{ALI:"REFINACION SAL",VTA:"REFINACIÓN SAL"},20960150600:{ALI:"FAB HIELO",VTA:"FAB HIELO"},20970130600:{ALI:"HELADOS NIEVES Y PALETAS",VTA:"FAB HELADOS NIEVES Y PALETAS"},20980110600:{ALI:"DESHIDRATACION PLANTAS P/FORRAJES",VAL:"DESHIDRATACIÓN PLANTAS FORRAJES"},20980290600:{ALI:"ALIMENTO GANADO Y ANIMALES",VAL:"FAB ALIMENTO GANADO Y OTROS ANIMALES"},20980370600:{ALI:"FAB ALIM AVES",VAL:"FAB ALIM AVES"},20990190600:{ALI:"EMPACADORA ESPECIAS",VPA:"EMPACADORA ESPECIAS"},20990270600:{ALI:"ACEITES Y MANTECAS ANIMALES",VPA:"FAB ACEITES Y MANTECAS ANIMALES COMEST"},20990350600:{ALI:"FAB HARINA PESCADO",VTA:"FAB HARINA PESCADO"},20990430600:{ALI:"OTROS PROD ALIM",VTA:"FAB OTROS PROD ALIM"},20990510600:{ALI:"FAB PASTAS GUISOS",VTA:"FAB PASTAS GUISOS"},21110110600:{ALI:"FAB TEQUILA Y MEZCAL",VBD:"FAB TEQUILA Y MEZCAL"},21120190600:{ALI:"AGUARDIENTE CAÑA",VBD:"FAB AGUARDIENTE CA A"},21130170600:{ALI:"FAB SOTOL",VBD:"FAB SOTOL"},21140150600:{ALI:"OTROS AGUARDIENTES NO CAÑA",VBD:"FAB OTROS AGUARDIENTES NO CA A"},21140230600:{ALI:"FAB VINOS Y OTROS LICORES",VBD:"FAB VINOS Y OTROS LICORES"},21150130600:{ALI:"ELABORACION PULQUE",VBD:"ELABORACIÓN PULQUE"},21190150600:{ALI:"SIDRA, CHAMPAÑA Y OTRAS FERMENTADAS",VBD:"FAB SIDRA CHAMPAÑA Y BEBIDAS FERMENTADAS"},21210100600:{ALI:"FAB MALTA",VBD:"FAB MALTA"},21220180600:{ALI:"FAB CERVEZA",VBD:"FAB CERVEZA"},21310190600:{ALI:"EMBOTELLADO AGUAS MINERALES"},21310270600:{ALI:"FAB BEBIDAS GASEOSAS"},21310350600:{ALI:"REFRESCOS FRUTAS NATURALES"},21310430600:{ALI:"PURIFICACION AGUA"},22110190600:{ALI:"DESECADO TABACO"},22120170600:{ALI:"FAB CIGARROS"},22190130600:{ALI:"FAB PUROS"},22190210600:{ALI:"PICADO TABACO"},75110181300:{ALM:"ALM Y REFRIGERACION",TRA:"SERV ALM Y REFRIGERACIÓN"},84220162500:{APP:"AGENCIA PUBLICIDAD"},84230142500:{APP:"AGENCIA NOTICIOSA",PER:"AGENCIA NOTICIOSA",SER:"AGENCIA NOTICIOSA"},6999146e4:{ARD:"ARREND CAPITALIZABLE",OTR:"CONSUMO ARREND CAPITALIZABLE",SBF:"CONSUMO ARREND CAPITALIZABLE"},83110111600:{ARD:"ALQ TERRENOS, LOC Y EDIF NO RESIDENCIAL",OTR:"ALQ TERRENOS LOC Y EDIF NO RESID"},83120191700:{ARD:"INMUEBLES RESIDENCIALES",REN:"ARREND INMUEBLES RESIDENCIALES"},83130171600:{ARD:"CORREDORES BIENES RAÍCES",BIE:"CORREDORES BIENES RAICES"},83140151200:{ARD:"ADMINISTRACIÓN INMUEBLES",OTR:"ADM INMUEBLES"},85110252200:{ARD:"ARREND FIN NACIONALES",SBF:"ARREND FIN NACIONALES"},33190100600:{ARS:"ARTÍSTICOS ALFARERÍA Y CERÁMICA",OTR:"ELAB OB ARTIST ALFARERIA Y CERAMICA",VTA:"ELAB OBJ ART ALFARERÍA Y CERÁMICA"},8949888e4:{ARS:"USUARIOS MENORES OTRAS ACTIVIDADES",BRA:"USUARIOS MENORES OTRAS ACTIVIDADES",CMB:"USUARIOS MENORES OTRAS ACTIVIDADES",EIF:"USUARIOS MENORES OTRAS ACTIVIDADES",EPL:"USUARIOS MENORES OTRAS ACTIVIDADES",EVE:"USUARIOS MENORES OTRAS ACTIVIDADES",MAN:"USUARIOS MENORES OTRAS ACTIVIDADES",OTR:"USUARIOS MENORES OTRAS ACTIVIDADES",PEN:"USUARIOS MENORES OTRAS ACTIVIDADES"},37220230600:{ART:"GRABACION DISCOS Y CINTAS",ELE:"GRABACIÓN DISCOS Y CINTAS"},84260261200:{ART:"REPRESENTACION ARTISTAS",EVE:"REPRESENTACIÓN ARTISTAS"},88210101500:{ART:"ESTUDIOS CINEMATOGRAFICOS",EVE:"ESTUDIOS CINEMATOGRÁFICOS"},88210281500:{ART:"GRABACION SONIDO EN PELICULAS",EVE:"GRABACIÓN SONIDO EN PELÍCULAS"},88210361500:{ART:"LABORATORIOS CINEMATOGRAFICOS",EVE:"LABORATORIOS CINEMATOGRÁFICOS"},88210441500:{ART:"PRODUCCION PELICULAS",EVE:"PROD PELÍCULAS"},88220181500:{ART:"DIST Y ALQ PELICULAS",EVE:"DIST Y ALQ PELÍCULAS"},88230161500:{ART:"SALA CINE",EVE:"SALA CINE"},88260101500:{ART:"TEATRO",EVE:"TEATRO"},88399061500:{ART:"CINEMATOGRAFIA Y ESPARCIM. POR MENOR",EVE:"USUARIOS MENORES CINEMATOGRAFÍA"},89410162500:{ART:"ESTUDIO FOTOGRAFICO",OTR:"ESTUDIO FOTOGR FICO"},81510112200:{ASG:"CÍA SEGUROS NACIONALES",OTR:"CÍA SEGUROS NACIONALES",PEN:"CÍA SEGUROS NACIONALES",SBF:"CÍA SEGUROS NACIONALES"},81510292300:{ASG:"CÍA SEGUROS PRIVADAS",PEN:"CÍA SEGUROS PRIVADAS",SBF:"CÍA SEGUROS PRIVADAS"},94710121200:{ASS:"SERV PUBLICOS Y SOCIALES",BOM:"SERV PUBLICOS Y SOCIALES",DIP:"SERV PUBLICOS Y SOCIALES",FAR:"PRESTACION SERV PUBLICOS Y SOCIALES",GAS:"PRESTACION SERV PUBLICOS Y SOCIALES",GOB:"PRESTACIÓN SERV PÚBLICOS Y SOCIALES",MIL:"PRESTACIÓN SERV PÚBLICOS Y SOCIALES",PLC:"PRESTACION SERV PUBLICOS Y SOCIALES",SER:"PRESTACION SERV PUBLICOS Y SOCIALES"},8944028e4:{AST:"SERV PROF Y TECNICOS POR MENOR",EMP:"SERV PROF Y TECNICOS",FDV:"USUARIOS MENORES SERV PROF Y TECNICOS",OTR:"USUARIOS MENORES SERV PROF Y TÉCNICOS",PRI:"USUARIOS MENORES SERV PROF Y TECNICOS",PRO:"USUARIOS MENORES SERV PROF Y TECNICOS",PRP:"USUARIOS MENORES SERV PROF Y TECNICOS",PSF:"USUARIOS MENORES SERV PROF Y TECNICOS",PSN:"USUARIOS MENORES SERV PROF Y TECNICOS",SPI:"USUARIOS MENORES SERV PROF Y TECNICOS",TCN:"USUARIOS MENORES SERV PROF Y TECNICOS",TSP:"USUARIOS MENORES SERV PROF Y TECNICOS"},84130152500:{AUD:"CONTADURIA Y AUDITORIA",DCT:"CONTADURIA Y AUDITORIA",SER:"SERV CONTADURÍA Y AUDITORÍA"},64110111700:{AUS:"TIENDA AUTOSERV",VTA:"TIENDA AUTOSERV"},33220130700:{AUT:"FAB CRISTALES AUTOMOVIL",VTA:"FAB CRISTALES AUTOMÓVIL"},35990340800:{AUT:"FAB CIERRES AUTOMATICOS METAL",HER:"FAB CIERRES AUTOM TICOS METAL"},38110160600:{AUT:"FAB AUTOMOVILES Y CAMIONES"},38120140600:{AUT:"FAB CARROCERÍAS METAL",OTR:"FAB CARROCERIAS METAL"},38120220600:{AUT:"FAB FURGONES Y VAGONES",OTR:"FAB FURGONES Y VAGONES"},38120300600:{AUT:"FAB Y ENSAMBLE OTROS VEHÍCULOS",OTR:"FAB Y ENSAMBLE OTROS VEHICULOS"},38130120600:{AUT:"FAB PISTONES, BIELAS, OTROS P/ MOTORES",OTR:"FAB PISTON BIELAS MONOBLOCKS MOTORES"},38140100600:{AUT:"FAB PARTES TRANSMISION VEHICULOS"},38150180800:{AUT:"FAB MUELLES Y RESORTES P/ VEHÍCULOS",OTR:"FAB MUELLES Y RESORTES VEHICULOS"},38160160600:{AUT:"FAB PARTES P/FRENOS VEHICULOS"},38170140900:{AUT:"FAB BUJÍAS",OTR:"FAB BUJIAS"},38190100600:{AUT:"FAB REFACC Y ACC AUTOMOTRICES"},75120162700:{AVI:"AGENCIA TURISMO",TRA:"AGENCIA TURISMO"},84290122500:{AYU:"OTROS SERV TECNICOS",CHO:"PRESTACION OTROS SERV TECNICOS",CTR:"OTROS SERV TÉCNICOS",OBR:"PRESTACION OTROS SERV TECNICOS",OFI:"PRESTACION OTROS SERV TECNICOS",SER:"PRESTACIÓN OTROS SERV TÉCNICOS",TCN:"PRESTACIÓN OTROS SERV TÉCNICOS"},69110111100:{BIE:"VIVIENDA ACREDITADOS MÍNIMOS INGRESOS",FIN:"PREST LA ADQ VIVIENDA ING MIN",SBF:"PREST ADQ VIVIENDA INGRESOS MINIMOS"},69110371100:{BIE:"VIVIENDA INTERÉS SOCIAL",FIN:"PREST ADQ VIVIENDA INTERES SOCIAL",SBF:"PREST ADQ VIVIENDA INTERES SOCIAL"},69110793e3:{BIE:"ADQ VIVIENDA TIPO MEDIO",OTR:"ADQ VIVIENDA TIPO MEDIO"},6911087e4:{BIE:"ADQ VIVIENDA TIPO MEDIO USUARIO MENOR",OTR:"USUARIO MENOR ADQ VIVIENDA TIPO MEDIO"},69110953100:{BIE:"ADQ VIVIENDA RESIDENCIAL",OTR:"ADQ VIVIENDA RESIDENCIAL"},6911102e4:{BIE:"ADQ VIVIENDA RESID USUARIO MENOR",OTR:"USUARIO MENOR ADQ VIVIENDA RESID"},89910111600:{BRA:"QUEHACERES DEL HOGAR",HGR:"QUEHACERES DEL HOGAR",OTR:"QUEHACERES DEL HOGAR"},89420142500:{CAD:"DECORACION EN GENERAL",OTR:"DECORACIÓN EN GENERAL"},91910161200:{CIE:"SERV INVESTIGACION CIENTIFICA",EDU:"SERV INVESTIGACIÓN CIENTÍFICA",INV:"SERV INVESTIGACION CIENTIFICA"},61140111700:{CNF:"COMPRAVTA FORRAJES EDO NATURAL",COF:"COMPRAVTA FORRAJES ESTADO NATURAL",VTA:"COMPRAVTA FORRAJES EN ESTADO NATURAL"},61190111700:{CNF:"COMPRAVTA OTROS ALIM EDO NATURAL",COF:"COMPRAVTA PROD ALIMENT AGRI NATURAL",VTA:"COMPRAVTA PROD ALIM AGRÍCOLA EDO NATURAL"},61210161700:{CNF:"COMPRAVTA AVES EN PIE",COF:"COMPRAVTA AVES EN PIE",VTA:"COMPRAVTA AVES EN PIE"},61210241700:{CNF:"COMPRAVTA GANADO MAYOR EN PIE",COF:"COMPRAVTA GANADO MAYOR EN PIE",VTA:"COMPRAVTA GANADO MAYOR EN PIE"},61210321700:{CNF:"COMPRAVTA GANADO MENOR EN PIE",COF:"COMPRAVTA GANADO MENOR EN PIE",VTA:"COMPRAVTA GANADO MENOR EN PIE"},61220141700:{CNF:"COMPRAVTA CARNE RES",COF:"COMPRAVTA CARNE RES",VTA:"COMPRAVTA CARNE RES Y OTRAS ESPECIES"},61230121700:{CNF:"COMPRAVTA VISCERAS GANADO CRUDAS",COF:"COMPRAVTA VISCERAS GANADO",VTA:"COMPRAVTA VÍSCERAS GANADO CRUDAS"},61240101700:{CNF:"COMPRAVTA CARNE AVES",COF:"COMPRAVTA CARNE AVES",VTA:"COMPRAVTA CARNE AVES"},61260241700:{CNF:"COMPRAVTA MATERIAS PRIMAS ANIMALES",COF:"COMPRAVTA MATERIAS PRIMAS ANIMALES",VTA:"COMPRAVTA MATERIAS PRIMAS ANIMALES"},61320711700:{CNF:"VENTA Y DIST DESPENSAS",COF:"VENTA Y DIST DESPENSAS",VTA:"VENTA Y DIST DESPENSAS FAMILIARES"},61320891700:{CNF:"COMPRAVTA AZUCAR",COF:"COMPRAVTA AZUCAR",VTA:"COMPRAVTA AZÚCAR"},61330111700:{CNF:"COMPRAVTA ALIMENTO GANADO",COF:"COMPRAVTA ALIMENTO GANADO",VTA:"COMPRAVTA ALIMENTO GANADO"},61330291700:{CNF:"COMPRAVTA ALIM AVES",COF:"COMPRAVTA ALIM ANIMALES",VTA:"COMPRAVTA ALIM AVES Y OTROS ANIMALES"},61390191700:{CNF:"COMPRAVTA TABACO",COF:"COMPRAVTA TABACO",VTA:"COMPRAVTA TABACO"},61390271700:{CNF:"COMPRAVTA TABACOS PUROS CIGARROS",COF:"COMPRAVTA TABACOS PUROS Y CIGARROS",VTA:"COMPRAVTA TABACOS PUROS Y CIGARROS"},62110151700:{CNF:"COMPRAVTA ART LENCERIA",COF:"COMPRAVTA ART LENCERIA",VTA:"COMPRAVTA ART LENCERÍA"},62130111700:{CNF:"COMPRAVTA SOMBREROS",COF:"COMPRAVTA SOMBREROS",VTA:"COMPRAVTA SOMBREROS"},62140191700:{CNF:"COMPRAVTA PIELES FINAS CON PELO",COF:"COMPRAVTA PIELES FINAS CON PELO",VTA:"COMPRAVTA PIELES FINAS CON PELO"},62150171700:{CNF:"COMPRAVTA ART MERCERIA Y CEDERIA",COF:"COMPRAVTA MERCERIA Y CEDERIA",VTA:"COMPRAVTA ART MERCERÍA Y CEDERÍA"},62150251700:{CNF:"COMPRAVTA ART BONETERIA",COF:"COMPRAVTA ART BONETERIA",VTA:"COMPRAVTA ART BONETERÍA"},62160151700:{CNF:"COMPRAVTA CASIMIRES",COF:"COMPRAVTA CASIMIRES",VTA:"COMPRAVTA CASIMIRES"},62160231700:{CNF:"COMPRAVTA OTROS PROD TEXTILES",COF:"COMPRAVTA OTROS PROD TEXTILES",VTA:"COMPRAVTA OTROS PROD TEXTILES"},62160311700:{CNF:"COMPRAVTA TELAS",COF:"COMPRAVTA TELAS",VTA:"COMPRAVTA TELAS"},62210141700:{CNF:"COMPRAVTA ART DEPORTE",COF:"COMPRAVTA ART DEPORTE",VTA:"COMPRAVTA ART DEPORTE"},62220121700:{CNF:"COMPRAVTA ART OPTICA",COF:"COMPRAVTA ART OPTICA",VTA:"COMPRAVTA ART ÓPTICA"},62230101700:{CNF:"COMPRAVTA JUGUETES",COF:"COMPRAVTA JUGUETES",VTA:"COMPRAVTA JUGUETES"},62240181700:{CNF:"COMPRAVTA INSTRUM Y ART MUSICALES",COF:"COMPRAVTA INSTRUM ART MUSICALES",VTA:"COMPRAVTA INSTRUMENTOS Y ART MUSICALES"},62250161700:{CNF:"COMPRAVTA ART PLATA",COF:"COMPRAVTA ART PLATA",VTA:"COMPRAVTA ART PLATA"},62250241700:{CNF:"COMPRAVTA OTRAS JOYAS",COF:"COMPRAVTA OTRAS JOYAS",VTA:"COMPRAVTA OTRAS JOYAS"},62250321700:{CNF:"COMPRAVTA RELOJES",COF:"COMPRAVTA RELOJES",VTA:"COMPRAVTA RELOJES"},62260141700:{CNF:"COMPRAVTA ART TALABARTERIA",COF:"COMPRAVTA ART TALABARTERIA",VTA:"COMPRAVTA ART TALABARTERÍA"},62260221700:{CNF:"COMPRAVTA OTROS ART PIEL",COF:"COMPRAVTA OTROS ART PIEL",VTA:"COMPRAVTA OTROS ART PIEL"},62260301700:{CNF:"COMPRAVTA SILLAS MONTAR",COF:"COMPRAVTA SILLAS MONTAR",VTA:"COMPRAVTA SILLAS MONTAR"},62270121700:{CNF:"COMPRAVTA LIBROS",COF:"COMPRAVTA LIBROS",VTA:"COMPRAVTA LIBROS"},62280101700:{CNF:"DIST PERIODICOS Y REVISTAS",COF:"DISTRIB VTA PERIODICOS Y REVISTAS",VTA:"DIST Y COMPRAVTA PERIÓDICOS Y REVISTAS"},62290181700:{CNF:"COMPRAVTA ART FOTOGRAFICOS",COF:"COMPRAVTA ART FOTOGRAF Y CINE",VTA:"COMPRAVTA ART FOTOGRÁFICOS Y CINEMATOG"},62310131700:{CNF:"COMPRAVTA MEDICINAS",COF:"COMPRAVTA MEDICINAS",VTA:"COMPRAVTA MEDICINAS"},62310211700:{CNF:"COMPRAVTA PERFUMES",COF:"COMPRAVTA PERFUMES",VTA:"COMPRAVTA PERFUMES"},62320111700:{CNF:"DIST PROD QUIMICO FARMACEUT",COF:"DIST PROD QUIM FARMACEUTICOS",VTA:"DIST OTROS PROD QUÍMICOS FARMACÉUTICOS"},62390171700:{CNF:"COMPRAVTA ROPA USADA ART PERS",COF:"COMPRAVTA ART USADOS PERSONALES",VTA:"COMPRAVTA ART USADOS PERSONALES"},63110131700:{CNF:"COMPRAVTA LINEA BLANCA",COF:"REFRIGERADORES LAVADORAS Y ESTUFAS",VTA:"COMPRAVTA REFRIGER LAVADORAS Y ESTUFAS"},63110211700:{CNF:"COMPRAVTA TELEVISORES",COF:"TELEVISORES RADIOS Y SIMILARES",VTA:"COMPRAVTA TV RADIOS Y TOCACINTAS"},63110391700:{CNF:"COMPRAVTA APARATOS ELECT Y ELECTRO",COF:"APARATOS ELECT Y ELECTRON USO DOMEST",VTA:"COMPRAVTA OTROS ELEC Y ELECT USO DOMEST"},63120111700:{CNF:"COMPRAVTA MUEBLES",COF:"COMPRAVTA MUEBLES",VTA:"COMPRAVTA MUEBLES"},63130191700:{CNF:"COMPRAVTA MAQ COSER",COF:"MAQ COSER Y TEJEDORAS",VTA:"COMPRAVTA MAQ COSER Y TEJEDORAS"},63140171700:{CNF:"COMPRAVTA REFACC APARATOS HOGAR",COF:"APARATOS E INSTRUMENTOS HOGAR",VTA:"COMPRAVTA REFACC MAQ APARATOS HOGAR"},63210121700:{CNF:"COMPRAVTA CRISTAL LOZA Y PORCELANA",COF:"CRISTAL LOZA Y PORCELANA",VTA:"COMPRAVTA ART CRISTAL LOZA Y PORCELANA"},63220101700:{CNF:"COMPRAVTA ART DECORACION",COF:"ART DECORACION",VTA:"COMPRAVTA ART DECORACIÓN"},63220281700:{CNF:"COMPRAVTA TAPETES Y ALFOMBRAS",COF:"COMPRAVTA TAPETES Y ALFOMBRAS",VTA:"COMPRAVTA TAPETES Y ALFOMBRAS"},63230181700:{CNF:"COMPRAVTA DISCOS Y CASSETTES",COF:"COMPRAVTA DISCOS Y CASSETTES",VTA:"COMPRAVTA DISCOS Y CASSETTES"},63240161700:{CNF:"COMPRAVTA ART RELIGIOSOS",COF:"COMPRAVTA ART RELIGIOSOS",VTA:"COMPRAVTA ART RELIGIOSOS"},63250141700:{CNF:"COMPRAVTA ANTIGÜEDADES",COF:"COMPRAVTA ANTIGÜEDADES",VTA:"COMPRAVTA ANTIG⍙EDADES"},63250221700:{CNF:"COMPRAVTA ART YUTE Y HENEQUEN",COF:"ART YUTE Y HENEQUEN",VTA:"COMPRAVTA ART YUTE Y HENEQUÉN"},63250301700:{CNF:"COMPRAVTA ART REGALO",COF:"COMPRAVTA ART REGALO",VTA:"COMPRAVTA ART REGALO"},63250481700:{CNF:"COMPRAVTA ARTESANIAS",COF:"COMPRAVTA ARTESANIAS",VTA:"COMPRAVTA ARTESANÍAS"},63260121700:{CNF:"COMPRAVTA FLORES ARTIFICIALES",COF:"FLORES Y ADORNOS FLORALES ARTIF",VTA:"COMPRAVTA FLORES Y ADORNOS ARTIFICIALES"},63260201700:{CNF:"COMPRAVTA FLORES NATURALES",COF:"FLORES Y ADORNOS FLORALES NATUR",VTA:"COMPRAVTA FLORES Y ADORNOS NATURALES"},64120191700:{CNF:"TIENDA DEPARTAMENTOS",COF:"TDA DEPARTAMENTAL NO ALIM",VTA:"TIENDAS DEPART ESPECIAL NO COMESTIBLES"},64190151700:{CNF:"COMPRAVTA OTROS APARATOS ELECTRICOS",COF:"OTROS APARATOS ELECTRICOS",VTA:"COMPRAVTA OTROS APARATOS ELÉCTRICOS"},64190231700:{CNF:"COMPRAVTA REFACC APARATOS ELECTRICOS",COF:"REFACC APARATOS ELECTRICOS",VTA:"COMPRAVTA REFACC APARATOS ELÉCTRICOS"},65110191700:{CNF:"COMPRAVTA FLUIDOS Y GASES",COF:"COMPRAVTA FLUIDOS Y GASES",VTA:"COMPRAVTA FLUIDOS Y GASES"},65120171700:{CNF:"COMPRAVTA GAS DOMESTICO O COMERCIAL",COF:"GAS USO DOMESTICO O COMERCIAL",VTA:"COMPRAVTA GAS USO DOMESTICO O COMERCIAL"},65130151700:{CNF:"COMPRAVTA GASOLINA Y DIESEL",COF:"COMPRAVTA GASOLINA Y DIESEL",VTA:"COMPRAVTA GASOLINA Y DIESEL"},65140131700:{CNF:"COMPRAVTA PETROLEO COMBUSTIBLE",COF:"COMPRAVTA PETROLEO COMBUSTIBLE",VTA:"COMPRAVTA PETRÓLEO COMBUSTIBLE"},65150111700:{CNF:"COMPRAVTA LUBRICANTES",COF:"COMPRAVTA LUBRICANTES",VTA:"COMPRAVTA LUBRICANTES"},65190131700:{CNF:"COMPRAVTA CARBON Y OTROS COMBUST",COF:"CARBON Y OTROS COMBUSTIBLES",VTA:"COMPRAVTA CARBÓN Y OTROS COMBUSTIBLES"},66110171700:{CNF:"COMPRAVTA ALGODON",COF:"COMPRAVTA ALGODON",VTA:"COMPRAVTA ALGODÓN"},66120151700:{CNF:"COMPRAVTA SEMILLAS SIEMBRA",COF:"COMPRAVTA SEMILLAS SIEMBRA",VTA:"COMPRAVTA SEMILLAS SIEMBRA"},66130131700:{CNF:"COMPRAVTA CUEROS Y PIELES SIN CURTIR",COF:"CUEROS Y PIELES SIN CURTIR",VTA:"COMPRAVTA CUEROS Y PIELES SIN CURTIR"},66190111700:{CNF:"COMPRAVTA HENEQUEN E IXTLE",COF:"COMPRAVTA HENEQUEN E IXTLE",VTA:"COMPRAVTA HENEQUÉN E IXTLE"},66190291700:{CNF:"COMPRAVTA LANA",COF:"COMPRAVTA LANA",VTA:"COMPRAVTA LANA"},66190371700:{CNF:"COMPRAVTA MAT PRIMAS VEGETALES",COF:"OTRAS MATERIAS PRIMAS VEGETALES",VTA:"COMPRAVTA OTRA MATERIA PRIMA VEGETAL"},66190451700:{CNF:"COMPRAVTAOTRAS FIBRAS COMERCIALES",COF:"OTRAS FIBRAS COMERCIALES",VTA:"COMPRAVTA OTRAS FIBRAS COMERCIALES"},66190531700:{CNF:"COMPRAVTA OTRAS MAT PRIMAS ANIMALES",COF:"OTRAS MATERIAS PRIMAS ORIGEN ANIMAL",VTA:"COMPRAVTA OTRAS MAT PRIMAS ANIMAL"},66210161700:{CNF:"COMPRAVTA CEMENTO CAL YESO Y OTROS",COF:"COMPRAVTA CEMENTO CAL YESO",VTA:"COMPRAVTA CEMENTO CAL YESO"},66220141700:{CNF:"COMPRAVTA FIERRO LAMIN Y LINGOTES",COF:"FIERRO LAMINADO Y EN LINGOTES",VTA:"COMPRAVTA FIERRO LAMINADO Y EN LINGOTES"},66220221700:{CNF:"COMPRAVTA ART FERRETERIA",COF:"ART FERRETERIA",VTA:"COMPRAVTA ART FERRETERÍA"},66230121700:{CNF:"COMPRAVTA COLORANTES IND",COF:"COLORANTES LA IND",VTA:"COMPRAVTA COLORANTES LA IND"},66230201700:{CNF:"COMPRAVTA PINTURAS BARNICES",COF:"PINTURAS BARNICES Y BROCHAS",VTA:"COMPRAVTA PINTURAS BARNICES Y BROCHAS"},66250181700:{CNF:"COMPRAVTA VIDRIOS CRISTALES Y EMPLOM",COF:"VIDRIOS CRISTALES Y EMPLOMADOS",VTA:"COMPRAVTA VIDRIOS CRISTALES Y EMPLOMADOS"},66260161700:{CNF:"COMPRAVTA ANILINAS",COF:"COMPRAVTA ANILINAS",VTA:"COMPRAVTA ANILINAS"},66260241700:{CNF:"COMPRAVTA ART TLAPALERIA",COF:"ART TLAPALERIA",VTA:"COMPRAVTA ART TLAPALERÍA"},66260321700:{CNF:"COMPRAVTA COSTALES Y BOLSAS",COF:"COMPRAVTA COSTALES Y BOLSAS",VTA:"COMPRAVTA COSTALES Y BOLSAS"},66270141700:{CNF:"COMPRA ART SANITARIOS",COF:"COMPRA ART SANITARIOS",VTA:"COMPRA ART SANITARIOS"},66280121700:{CNF:"COMPRAVTA MATERIAL ELECT Y SONIDO",COF:"MATERIAL INSTAL ELECTRICAS Y SONIDO",VTA:"COMPRAVTA MAT INSTAL ELEC Y SONIDO"},66290101700:{CNF:"COMPRAVTA MATERIALES P CONST",COF:"MATERIALES CONST",VTA:"COMPRAVTA MATERIALES CONST"},66290281700:{CNF:"COMPRAVTA TAPICES",COF:"COMPRAVTA TAPICES",VTA:"COMPRAVTA TAPICES"},66910191700:{CNF:"COMPRAVTA FERTILIZANTES Y PLAGUICIDAS",COF:"FERTILIZANTES Y PLAGUICIDAS",VTA:"COMPRAVTA FERTILIZANTES Y PLAGUICIDAS"},66920171700:{CNF:"COMPRAVTA ART PELETERIA",COF:"COMPRAVTA ART PELETERIA",VTA:"COMPRAVTA ART PELETERÍA"},66930151700:{CNF:"COMPRAVTA DESPERDICIOS PAPEL",COF:"COMPRAVTA DESPERDICIOS PAPEL",VTA:"COMPRAVTA DESPERDICIOS PAPEL"},66940131700:{CNF:"COMPRAVTA FIERRO USADO",COF:"COMPRAVTA FIERRO USADO",VTA:"COMPRAVTA FIERRO USADO"},66950111700:{CNF:"COMPRAVTA SUBSTANCIAS QUIMICAS",COF:"SUBSTANCIAS QUIMICAS LA IND",VTA:"COMPRAVTA SUBSTANCIAS QUÍMICAS LA IND"},66990131700:{CNF:"COMPRAVTA CERAS Y PARAFINAS",COF:"COMPRAVTA CERAS Y PARAFINAS",VTA:"COMPRAVTA CERAS Y PARAFINAS"},66990211700:{CNF:"COMPRAVTA DESPERDICIOS IND",COF:"DESPERDICIOS IND",VTA:"COMPRAVTA DESPERDICIOS IND"},66990391700:{CNF:"COMPRAVTA MAT PRIMAS ORIGEN MINERAL",COF:"MATERIAS PRIMAS ORIGEN MINERAL",VTA:"COMPRAVTA MATERIAS PRIMAS ORIGEN MINERAL"},66990471700:{CNF:"COMPRAVTA OTROS METALES Y MINERALES",COF:"OTROS METALES Y MINERALES LAM LINGOTE",VTA:"COMPRAVTA OTROS METALES Y MINERAL"},67110151700:{CNF:"COMPRAVTA MAQ EQ AGRICUL Y GANADERIA",COF:"MAQ Y EQ AGRICULTURA Y GANADERIA",VTA:"COMPRAVTA MAQ EQ AGRIC Y GANAD"},67120131700:{CNF:"COMPRAVTA ART EXPLOTACION MINAS",COF:"ART EXPLOTACION MINAS",VTA:"COMPRAVTA ART LA EXPLOTACIÓN MINAS"},67140191700:{CNF:"COMPRAVTA MAQ NUEVA",COF:"COMPRAVTA MAQ NUEVA",VTA:"COMPRAVTA MAQ NUEVA"},67140271700:{CNF:"COMPRAVTA MAQ USADA",COF:"COMPRAVTA MAQ USADA",VTA:"COMPRAVTA MAQ USADA"},67140351700:{CNF:"COMPRAVTA EQ TRABAJO Y PROTECCION",COF:"EQ TRABAJO Y PROTECCION IND",VTA:"COMPRAVTA EQ TRABAJO Y PROTECCIÓN IND"},67190191700:{CNF:"COMPRAVTA REFACC MAQ",COF:"REFACC MAQ",VTA:"COMPRAVTA REFACC MAQ"},67210141700:{CNF:"COMPRAVTA MAQ ESCRIBIR",COF:"COMPRAVTA MAQ ESCRIBIR",VTA:"COMPRAVTA MAQ ESCRIBIR"},67210221700:{CNF:"COMPRAVTA MUEB Y ART OFICINA",COF:"MUEBLES Y ART OFICINA",VTA:"COMPRAVTA MUEBLES Y ART OFICINA"},6721036e4:{CNF:"COMPRAVTA EQ PROCES ELEC DATOS",COF:"EQ PROCES ELECTRONICO DATOS",VTA:"COMPRAVTA EQ PROCES ELECT DATOS"},67220121700:{CNF:"COMPRAVTA EQ Y MOB HOT REST OTROS",COF:"EQ Y MOB HOT REST Y OTROS ESTABL",VTA:"COMPRAVTA EQ Y MOB HOTELES REST OTROS"},67290181700:{CNF:"COMPRAVTA EQ REFRIGERACION COMERCIAL",COF:"EQS REFRIGERACION COMERCIAL",VTA:"COMPRAVTA EQS REFRIGERACIÓN COMERCIAL"},67290261700:{CNF:"COMPRAVTA ACCS MUEBLES",COF:"ACCS MUEBLES",VTA:"COMPRAVTA ACCS MUEBLES"},67290341700:{CNF:"COMPRAVTA EQ CONTRA INCENDIO",COF:"EQ CONTRA INCENDIO",VTA:"COMPRAVTA EQ CONTRA INCENDIO"},67310131700:{CNF:"COMPRAVTA BASCULAS Y SIMIL EQ PESADO",COF:"BÁSCULAS Y SIMILARES EQ PESADO",VTA:"MPRAVTA BASCULAS Y SIMIL EQ PESADO"},67320111700:{CNF:"COMPRAVTA ART MEDICOS",COF:"COMPRAVTA ART MEDICOS",VTA:"COMPRAVTA ART MÉDICOS"},67320291700:{CNF:"COMPRAVTA APARATOS ORTOPEDICOS",COF:"ART Y APARATOS ORTOPEDICOS",VTA:"COMPRAVTA ART Y APARATOS ORTOPÉDICOS"},67320371700:{CNF:"COMPRAVTA MUEB CONSULT Y SANATORIOS",COF:"MUEBLES CONSULTORIOS Y SANATORIOS",VTA:"COMPRAVTA MUEB CONSULTORIOS Y SANATORIOS"},67320451700:{CNF:"COMPRAVTA EQ QUIMICOS Y LABORATORIO",COF:"EQS QUIMICOS Y LABORATORIO",VTA:"COMPRAVTA EQS QUÍMICOS Y LABORATORIO"},67390171700:{CNF:"COMPRAVTA APARAT CIENTIF Y PRECISION",COF:"APARATOS CIENTIFICOS Y PRECISION",VTA:"COMPRAVTA APARATOS CIENT Y PRECISIÓN"},68110131700:{CNF:"COMPRAVTA AUTOMOVILES Y AUTOB NVOS",COF:"AUTOMOVILES Y CAMIONES NVOS",VTA:"COMPRAVTA AUTOMÓVILES Y CAMIONES NVOS"},68120111700:{CNF:"COMPRAVTA AUTOS Y AUTOB USADOS",COF:"AUTOMOVILES Y CAMIONES USADOS",VTA:"COMPRAVTA AUTOMÓVILES Y CAMIONES USADOS"},68130191700:{CNF:"COMPRAVTA BICICLETAS Y ACCS",COF:"BICICLETAS Y SUS ACCS",VTA:"COMPRAVTA BICICLETAS Y SUS ACCS"},68130271700:{CNF:"COMPRAVTA MOTOS Y ACCS",COF:"MOTOCICLETAS Y SUS ACCS",VTA:"COMPRAVTA MOTOCICLETAS Y SUS ACCS"},68140171700:{CNF:"COMPRAVTA LLANTAS",COF:"COMPRAVTA LLANTAS",VTA:"COMPRAVTA LLANTAS"},68150151700:{CNF:"COMPRAVTA REFACC Y ACC NVOS P AUTO",COF:"REFACC Y ACC NVOS AUTOS Y CAMIONES",VTA:"COMPRAVTA REFACC NVOS AUTOS Y CAMION"},68160131700:{CNF:"COMPRAVTA REFACC Y ACC USADOS AUTOS",COF:"REFACC Y ACC USADOS AUTOS Y CAMIONES",VTA:"COMPRAVTA REFACC USADOS AUTOS Y CAMION"},68190171700:{CNF:"COMPRAVTA REFACC VEHICULOS AEREOS",COF:"REFACC VEHICULOS AEREOS",VTA:"COMPRAVTA REFACC VEHÍCULOS AÉREOS"},68190251700:{CNF:"COMPRAVTA REFAC VEHICULOS ACUATICOS",COF:"VEHICULOS ACUATICOS Y SUS REFACC",VTA:"COMPRAVTA VEHÍCULOS ACUÁTICOS Y REFACC"},68190331700:{CNF:"COMPRAVTA VEHICULOS AEREOS",COF:"COMPRAVTA VEHICULOS AEREOS",VTA:"COMPRAVTA VEHÍCULOS AÉREOS"},69110451700:{CNF:"COMPRAVTA CASAS E INMUEBLES",COF:"COMPRAVTA CASAS Y OTROS INMUEBLES",VTA:"COMPRAVTA CASAS Y OTROS INMUEBLES"},69110531700:{CNF:"COMPRAVTA TERRENOS",COF:"COMPRAVTA TERRENOS",OTR:"COMPRAVTA TERRENOS",VTA:"COMPRAVTA TERRENOS"},69910131700:{CNF:"COMPRAVTA ARMAS FUEGO",COF:"COMPRAVTA ARMAS FUEGO",VTA:"COMPRAVTA ARMAS FUEGO"},69930191700:{CNF:"COMPRAVTA PROD VETERINARIOS Y OTROS",COF:"PROD VETERINARIOS Y OTROS ART",VTA:"COMPRAVTA PROD VETERINARIOS"},69990171700:{CNF:"COMPRAVTA DIAMANTES",COF:"COMPRAVTA DIAMANTES",VTA:"COMPRAVTA DIAMANTES"},69990251700:{CNF:"COMPRAVTA EQ AIRE ACONDICIONADO",COF:"EQ Y APARATOS AIRE ACONDICIONADO",VTA:"COMPRAVTA EQ AIRE ACONDICIONADO"},69990331700:{CNF:"COMPRAVTA JARCIERIA Y ART FIBRA",COF:"JARCIERIA ART TEJIDOS FIBRA",VTA:"COMPRAVTA JARCIERIA CANASTAS"},69990411700:{CNF:"COMPRAVTA OTROS ART PLASTICO",COF:"OTROS ART PLASTICO",VTA:"COMPRAVTA OTROS ART PL STICO"},69990671700:{CNF:"COMPRAVTA OTROS PROD HULE",COF:"OTROS PROD HULE",VTA:"COMPRAVTA OTROS PROD HULE"},69990751700:{CNF:"COMPRAVTA VELAS Y VELADORAS",COF:"COMPRAVTA VELAS Y VELADORAS",VTA:"COMPRAVTA VELAS Y VELADORAS"},26320330700:{CNT:"FAB ASBESTOS Y CORCHOS AISLANTES",MAD:"FAB ASBESTOS Y CORCHOS AISLANTES"},31220170700:{CNT:"FAB MAT ASFALTO PAVIMENTO Y TECHO",PET:"FAB MAT PAVIMENTACIÓN Y TECHADO"},33310140700:{CNT:"FAB ADOBE",VTA:"FAB ADOBE"},33310220700:{CNT:"FAB LADRILLOS",VTA:"FAB LADRILLOS"},33320120700:{CNT:"FAB MATERIALES MUROS",VTA:"FAB MATERIALES MUROS"},33410130700:{CNT:"FAB CEMENTO"},33410390700:{CNT:"FAB CONCRETO CONST",VTA:"FAB CONCRETO CONST"},33420110700:{CNT:"FAB BLOQUES CEMENTO",VTA:"FAB BLOQUES CEMENTO"},33510120700:{CNT:"FAB TINACOS ASBESTO",VTA:"FAB TINACOS ASBESTO"},33540160700:{CNT:"FAB MOSAICOS TERRAZOS Y GRANITO",VTA:"FAB MOSAICOS TERRAZOS Y GRANITO"},33540240700:{CNT:"FAB POSTES Y DURMIENTES CONCRETO",VTA:"FAB POSTES Y DURMIENTES CONCRETO"},33540320700:{CNT:"FAB TUBOS CONCRETO",VTA:"FAB TUBOS CONCRETO"},41110191e3:{CNT:"CONST CASAS Y TECHOS DESARMABLES"},41110271e3:{CNT:"CONST INMUEBLES"},41110351100:{CNT:"PREST CONST VIVIENDA INT SOCIAL",FIN:"PREST CONST VIVIENDA INTERES SOCIAL",SBF:"PREST CONST VIVIENDA INTERES SOCIAL"},41110431100:{CNT:"PREST CONST BAJOS INGRESOS",FIN:"PREST LA CONST VIVIENDA ING MIN",SBF:"PREST CONST VIVIENDA INGRESOS MINIMOS"},4111051e4:{CNT:"DESARROLLADORES VIVIENDA",CTR:"DESARROLLADORES VIVIENDA"},41119282800:{CNT:"CONST VIVIENDA TIPO MEDIO"},4111936e4:{CNT:"USUARIO MENOR CONST VIVIENDA TP MEDIO"},41119442900:{CNT:"CONST VIVIENDA RESIDENCIAL"},4111952e4:{CNT:"MENORES CONST VIVIENDA RESIDENCIAL"},41120171e3:{CNT:"CONST EDIF OFIC ESC HOSP Y OTROS"},41130151e3:{CNT:"CONST EDIF IND"},41210181e3:{CNT:"CONST VIAS COMUNICACION"},41210261e3:{CNT:"PAVIMENTACION"},41210341e3:{CNT:"URBANIZACIÓN",OTR:"URBANIZACION"},41220161e3:{CNT:"CONST PUERTOS"},41230141e3:{CNT:"CONST E INST TORRES EMISORAS"},41290121e3:{CNT:"CONST PISTAS DUCTOS Y SIMILARES"},41910111e3:{CNT:"CONST PRESAS"},41920191e3:{CNT:"PERFORACION POZOS AGUA"},41930171e3:{CNT:"CONST PLANTAS GENERADORAS ENERGIA"},41940151e3:{CNT:"PERFORACIÓN POZOS PETROLEROS GAS",OTR:"PERFORACION POZOS PETROLEROS Y GAS"},41990151e3:{CNT:"CONST ESTADIOS MONUMENTOS Y OTRAS"},4199908e4:{CNT:"USUARIOS MENORES CONST DIFA VIVIENDA"},42110171e3:{CNT:"PREMEZCLADO Y COLADO CONCRETO"},42120151e3:{CNT:"DEMOLICION INMUEBLES"},42190111e3:{CNT:"IMPERMEABILIZACION INMUEBLES"},42210161e3:{CNT:"TALLER PLOMERÍA",RYM:"TALLER PLOMERIA"},42220141e3:{CNT:"INSTAL SIST ELÉCTRICO SIST INTERCOM",OTR:"INSTAL SIST ELECT INCLUYE INTERC"},42290101e3:{CNT:"INSTAL SIST AIRE ACOND CALEF SIMILIARES",OTR:"INSTAL SIST AIRE ACOND Y CALEF"},42910191e3:{CNT:"SERV PINTADO Y TAPIZADO",RYM:"SERV PINTADO Y TAPIZADO INMUEBLES"},42920171e3:{CNT:"LABRADO Y COLOCACIÓN PIEDRA",OTR:"LABRADO Y COLOCACION PIEDRA"},42930151e3:{CNT:"COLOC DUELAS PARQUET LAMBRINES",OTR:"COLOC DUELAS PARQUET LAMBRINES"},42990131e3:{CNT:"OTROS SERV ACABADOS SUBCONT"},76110161400:{COM:"EMPRESA TELÉFONOS",OTR:"EMPRESA TELEFONOS"},76120141400:{COM:"EMPRESA TELÉGRAFOS",OTR:"EMPRESA TELEGRAFOS"},7613012e4:{COM:"TELECOMUNICACIONES (NO RADIO, NI TV)",OTR:"OTROS SERV TELECOM (NO RADIODIF Y TV)"},76139051400:{COM:"MENORES COMUNICACIONES"},76140101400:{COM:"SERV POSTALES",OTR:"SERV POSTALES"},84260181200:{CTR:"COMISIONISTA",OTR:"COMISIONISTA",SER:"COMISIONISTA"},88330151500:{DEP:"ASOC DEPORT Y CON FINES RECREATIVOS",EVE:"ASOCIACIONES DEPORTIVAS"},84260341200:{DIP:"REPRES CASAS EXTRANJERAS",GOB:"REPRES CASAS EXTRANJERAS",OTR:"REPRES CASAS EXTRANJERAS",SER:"REPRES CASAS EXTRANJERAS"},84260421200:{DIP:"REPRES CASAS NACIONALES",GOB:"REPRES CASAS NACIONALES",OTR:"REPRES CASAS NACIONALES"},99120161600:{DIP:"CONSULADO",GOB:"CONSULADO"},29110150600:{EDI:"EDICIÓN PERIÓDICOS Y REVISTAS",OTR:"EDICION PERIODICOS Y REVISTAS"},29120130600:{EDI:"EDICION LIBROS"},29210140600:{EDI:"ENCUADERNACIÓN",OTR:"ENCUADERNACION"},29210220600:{EDI:"FORMULARIOS Y FORMAS CONTINUAS",OTR:"FAB FORMULARIOS Y FORMAS CONTINUAS"},29210300600:{EDI:"LIBRETAS CUADERNOS Y ENCUADERNACIÓN",OTR:"FAB LIBRETAS CUADERNOS"},29210480600:{EDI:"FOTOCOPIADO",OTR:"FOTOCOPIADO"},29210560600:{EDI:"IMPRENTA ( TIPOGRAFÍA)",OTR:"IMPRENTA ( TIPOGRAFIA)"},29210640600:{EDI:"IMPRESIÓN CON CILINDROS CAUCHO",OTR:"IMPRESION MEDIANTE CILINDROS CAUCHO"},29210720600:{EDI:"IMPRESIÓN CON CILINDROS (ROTOGRABADO)",OTR:"IMPRESION MEDIANTE ROTOGRABADO"},29290180600:{EDI:"FAB CALCOMANÍAS",OTR:"FAB CALCOMANIAS"},29290260800:{EDI:"FAB TIPOS IMPRENTA",OTR:"FAB TIPOS IMPRENTA"},29290340600:{EDI:"GRABADOS PIEDRA VIDRIO LITOGRAFÍAS",OTR:"GRABADO E IMPRESION LITOGRAFIA"},29290420600:{EDI:"HELIOGRABADO",OTR:"HELIOGRABADO"},29290500600:{EDI:"GRABADO EN METAL",OTR:"GRABADO EN METAL"},91120121200:{EDU:"ENSEÑANZA PRE PRIMARIA Y PRIMARIA"},91130101200:{EDU:"SERV ENSEÑANZA SECUNDARIA"},91150161200:{EDU:"EDUC PÚBLICA CULTURA E INVESTIGAC",EST:"EDUCACIÓN PUBLICA CULTURA E INVESTIG"},91190181200:{EDU:"EDUC PRIVADA CULTURA E INVESTIGACION",EST:"EDUCACIÓN PRIVADA CULTURA E INVESTIG"},91210131200:{EDU:"SERV ENSEÑANZA COMERCIAL Y IDIOMA"},91220111200:{EDU:"SERV CAPAC TEC OFICIOS Y ARTESANIAS"},91290171200:{EDU:"MUSICA DANZA ARTES MANEJO Y OTROS"},91990101200:{EDU:"MUSEOS JARDINES BOTÁNICOS Y OTROS",OTR:"BIBLIOTECAS MUSEOS JDNES BOTAN Y CULT"},89499032500:{EIN:"USUARIOS MENORES SERV",MQD:"USUARIOS MENORES SERV",OFC:"USUARIOS MENORES SERV",OTR:"USUARIOS MENORES SERV"},37110180900:{ELE:"TRANSFORMADORES Y MAQ GENERAC",RYM:"FAB REP MOTORES Y MAQ Y EQ GENERACION"},37210170900:{ELE:"FAB RADIOS GRABADORAS Y TV",OTR:"FAB RADIOS GRABADORAS Y TELEVISORES"},37220150600:{ELE:"FAB DISCOS Y CINTAS GRABACIONES",OTR:"FAB DISCOS Y CINTAS GRABACIONES"},37230130900:{ELE:"APARATOS INTERCOMUNICACIÓN",OTR:"FAB APARATOS INTERCOMUNICACION"},37290110900:{ELE:"PARTES Y ACC RADIO TV Y COMUNIC",OTR:"ACCS EQ RADIO TELEVISION Y COMUNIC"},37310160900:{ELE:"FAB OTROS APARATOS ELECTRICOS HOGAR",OTR:"FAB OTROS APARATOS ELECT HOGAR"},37310240900:{ELE:"FAB REFRIG Y CALEFACC DOMÉSTICO",OTR:"FAB REFRIG Y EQ CALEF DOMESTICA"},37910100900:{ELE:"FAB ACUMULADORES",OTR:"FAB ACUMULADORES"},37910280900:{ELE:"FAB PILAS SECAS",OTR:"FAB PILAS SECAS"},37920180900:{ELE:"FAB FOCOS",OTR:"FAB FOCOS"},37930160800:{ELE:"FAB CABLES METAL",OTR:"FAB CABLES METAL"},37930240900:{ELE:"MAT INSTALACIONES ELÉCTRICAS",OTR:"FAB MATERIAL INSTAL ELECTRICAS"},37930320900:{ELE:"FAB REFACC APARATOS ELÉCTRICOS",OTR:"FAB REFACC APARATOS ELECTRICOS"},37990140900:{ELE:"FAB ANUNCIOS LUMINOSOS",OTR:"FAB ANUNCIOS LUMINOSOS"},37990220900:{ELE:"FAB CANDILES Y ARBOTANTES",OTR:"FAB CANDILES Y ARBOTANTES"},37990300900:{ELE:"FAB LÁMPARAS ELÉCTRICAS",OTR:"FAB LAMPARAS ELECTRICAS"},89220160900:{ELE:"TALLER ELEC Y ELECTRON INDUST Y COMER",OTR:"TALLER REP ELE Y ELECTRÓN IND Y COMER"},89220240900:{ELE:"TALLER ELEC Y ELECTRON HOGAR",OTR:"TALLER REP ART ELEC Y ELECTRÓN HOGAR"},89330132500:{ETC:"SALON BELLEZA",OTR:"SALÓN BELLEZA"},69920111700:{EVE:"AGENCIAS RIFAS Y SORTEOS",OTR:"AGENC RIFAS Y SORTEOS LOTERIA"},88110111500:{EVE:"SERV EN BALNEARIOS Y ALBERCAS",OTR:"SERV EN BALNEARIOS Y ALBERCAS"},88120191500:{EVE:"SALÓN BILLAR",OTR:"SALON BILLAR"},88120271500:{EVE:"SALÓN BOLICHE",OTR:"SALON BOLICHE"},88130171500:{EVE:"CLUB SOCIAL",OTR:"CLUB SOCIAL"},88140151500:{EVE:"CENTRO DEPORTIVO",OTR:"CENTRO DEPORTIVO"},88190151500:{EVE:"PARQUES CLUBES PLAYA",OTR:"PARQUES LUGRES DE ESPACIMIENTO SIMIL"},88240141500:{EVE:"RADIODIFUSORA",OTR:"RADIODIFUSORA"},88250121500:{EVE:"TELEDIFUSORA",OTR:"TELEDIFUSORA"},88270181500:{EVE:"CLUBES DEPORTIVOS PROF"},88290141500:{EVE:"ESTADIOS Y ARENAS",OTR:"ESTADIOS Y ARENAS"},88290221500:{EVE:"HIPÓDROMO",OTR:"HIPODROMO"},88290301500:{EVE:"PLAZA TOROS",OTR:"PLAZA TOROS"},88290481500:{EVE:"PROM ESPECTÁCULOS DEPORTIVOS"},88290561500:{EVE:"PROM ESPECTÁCULOS TAURINOS",OTR:"PROMOCION ESPECTACULOS TAURINOS"},88310191500:{EVE:"CENTRO NOCTURNO",OTR:"CENTRO NOCTURNO"},88320171500:{EVE:"GALERÍAS ARTE Y MUSEOS",OTR:"GALERIAS ARTES GRAFICAS Y MUSEOS"},88390131500:{EVE:"JUEGOS FERIA",OTR:"JUEGOS FERIA"},30510180600:{FAR:"FAB ALGODÓN GASAS Y VENDAS",OTR:"FAB ALGODON GASAS Y VENDAS"},30510260600:{FAR:"FAB OTROS PROD FARMACÉUTICOS",OTR:"FAB OTROS PROD FARMACEUTICOS"},30510340600:{FAR:"FAB OXÍGENO MEDICINAL",OTR:"FAB OXIGENO MEDICINAL"},69990591600:{FIN:"USUARIOS MENORES POR OPER REPORTO",SBF:"USUARIOS MENORES POR OPER REPORTO"},69991243300:{FIN:"CRED ADQ BIENES CONSUMO DURADERO",SBF:"CRED ADQ BIENES CONSUMO DURADERO"},6999132e4:{FIN:"CONSUMO PERSONALES",SBF:"CONSUMO PERSONALES"},6999158e4:{FIN:"OTROS CRED AL CONSUMO",SBF:"OTROS CRED AL CONSUMO"},81130112100:{FIN:"SERV LA BANCA NACIONAL",SBF:"SERV LA BANCA NACIONAL"},81130292100:{FIN:"SERV BCA NAL POR OPER CALL MONEY",SBF:"SERV LA BANCA NACIONAL OPER CALL MONEY"},8113128e4:{FIN:"MENORES BANCA DESARROLLO",SBF:"MENORES BANCA DESARROLLO"},81140192200:{FIN:"SERV FONDOS Y FID FOMENTO ECONOMICO",SBF:"SERV FDOS Y FIDEICOMISOS FOMENTO ECON"},81230102e3:{FIN:"SERV LA BANCA PRIVADA Y MIXTA MULTIPLE",SBF:"SERV LA BANCA PRIVADA Y MIXTA MULTIPLE"},81230282400:{FIN:"SERV LA BANCA PRIVADA ESPECIALIZADA",SBF:"SERV LA BANCA PRIVADA ESPECIALIZADA"},81230362e3:{FIN:"SERV BCA PRIV Y MIXTA OPER CALL MONEY",SBF:"SERV BCA PRIV Y MIXTA OPER CALL MONEY"},81230442400:{FIN:"SERV BCA PRIV ESPEC POR OPER CALL MONEY",SBF:"SERV BCA PRIVADA ESPEC OPER CALL MONEY"},8123052e4:{FIN:"SOC AHORRO Y PRESTAMO",SBF:"SOC AHORRO Y PRESTAMO"},812306e5:{FIN:"SOC AHORRO Y CREDITO POPULAR",SBF:"SOC AHORRO Y CREDITO POPULAR"},8123078e4:{FIN:"SOC FIN OBJETO LIMITADO",SBF:"SOC FIN OBJETO LIMITADO"},8123086e4:{FIN:"SOC FIN OBJETO MULTIPLE REGULADAS",SBF:"SOC FIN OBJETO MULTIPLE REGULADAS"},8123094e4:{FIN:"SOC FIN OBJETO MULTIPLE NO REGULADAS",SBF:"SOC FIN OBJETO MULTIPLE NO REGULADAS"},8123143e4:{FIN:"USUARIOS MENORES BANCA COMERCIAL",SBF:"USUARIOS MENORES BANCA COMERCIAL"},81239032e3:{FIN:"USUARIOS MENORES SERV BANCARIOS",SBF:"USUARIOS MENORES SERV BANCARIOS"},81320112200:{FIN:"UNIONES CREDITO NACIONALES",SBF:"UNIONES CREDITO NACIONALES"},81320292300:{FIN:"UNIONES CREDITO PRIVADAS",SBF:"UNIONES CREDITO PRIVADAS"},81330192200:{FIN:"CÍA FIANZAS NACIONALES",SBF:"CÍA FIANZAS NACIONALES"},81330272300:{FIN:"CÍA FIANZAS PRIVADAS",SBF:"CÍA FIANZAS PRIVADAS"},81410122300:{FIN:"BOLSA VALORES",SBF:"BOLSA VALORES"},81420102300:{FIN:"SOC INVERSION",SBF:"SOC INVERSION"},82110212500:{FIN:"AGENTE BOLSA",SBF:"AGENTE BOLSA"},82110392200:{FIN:"CASAS BOLSA NACIONALES",SBF:"CASAS BOLSA NACIONALES"},82110472300:{FIN:"CASAS BOLSA PRIVADAS",SBF:"CASAS BOLSA PRIVADAS"},82190252300:{FIN:"CASA CAMBIO",SBF:"CASA CAMBIO"},82190331200:{FIN:"CORRESPONSAL BANCARIO",SBF:"CORRESPONSAL BANCARIO"},82190412300:{FIN:"CAJA AHORROS",SBF:"CAJA AHORROS"},82190591600:{FIN:"MONTEPIO",SBF:"MONTEPIO"},82190671600:{FIN:"PRESTAMISTA",SBF:"PRESTAMISTA"},82190752300:{FIN:"FACTORING",SBF:"FACTORING"},82190832300:{FIN:"EMPRESAS CONTROLADORAS FIN",SBF:"EMPRESAS CONTROLADORAS FIN"},8219091e4:{FIN:"USUAR MENOR OTROS INTERM FINAN PUBL",SBF:"USUAR MENOR OTROS INTERM FINAN PUB"},8219108e4:{FIN:"USUAR MENOR OTROS INTERM FINAN PRIV",SBF:"USUAR MENOR OTROS INTERM FINAN PRIVADOS"},8219114e4:{FIN:"ADMIN TARJETA CREDITO",SBF:"ADMIN TARJETA CREDITO"},8219122e4:{FIN:"EMPRESAS AUTOFIN AUTOMOTRIZ",SBF:"EMPRESAS AUTOFIN AUTOMOTRIZ"},821913e5:{FIN:"EMPRESAS AUTOFIN RESIDENCIAL",SBF:"EMPRESAS AUTOFIN RESIDENCIAL"},8221013e4:{FIN:"FOBAPROA-IPAB",SBF:"FOBAPROA-IPAB"},99110181200:{FIN:"INSTITUCIONES FIN DEL EXTRANJERO",SBF:"INSTITUCIONES FIN DEL EXTRANJERO"},50110100500:{GAS:"GENERACIÓN Y SUMINIS ENERGÍA ELÉCTRICA",OTR:"GENERACION Y SUMIN ENERGIA ELECT"},50119030500:{GAS:"USUARIOS MENORES ENERGÍA ELÉCTRICA",OTR:"USUARIOS MENORES ENERGIA ELECTRICA"},50120180500:{GAS:"DIST ENERGÍA ELÉCTRICA",OTR:"DIST ENERGIA ELECTRICA"},5021019e4:{GAS:"PIDIREGAS ENRERGÍA ELÉCTRICA",OTR:"PIDIREGAS ENRERGIA ELECTRICA"},51110181200:{GAS:"CAPT, TRATRAMIENTO AGUA POTABLE",OTR:"CAPTACION, TRATAM, Y DIST AGUA POTAB"},94110181800:{GOB:"GOBIERNO FEDERAL"},94110261900:{GOB:"GOBIERNO ESTATAL"},94110341900:{GOB:"GOBIERNO MUNICIPAL"},94110421800:{GOB:"DEPARTAMENTO DEL DF"},94118861800:{GOB:"USUARIOS MENORES GOBIERNO FEDERAL",MIL:"USUARIOS MENORES GOBIERNO FEDERAL"},94119011900:{GOB:"USUARIOS MENORES GOB EST Y MUN"},99120241600:{GOB:"GOBIERNO EXTRANJERO"},99190121600:{GOB:"SERV OF Y REPRES OTROS PAISES"},34110140800:{HER:"FAB FIERRO ESPONJA",OTR:"FAB FIERRO ESPONJA"},34110220800:{HER:"FUNDICIÓN FIERRO Y ACERO",OTR:"FUNDICION FIERRO Y ACERO"},34110300800:{HER:"PLANTA METALÚRGICA",OTR:"PLANTA METALURGICA"},34119070800:{HER:"USUAR MENORES IND SIDER Y PROD MET",OTR:"USUARIOS MENORES PROD METALICOS"},34120120800:{HER:"FAB LAMINAS HIERRO Y ACERO",OTR:"FAB LAMINAS HIERRO Y ACERO"},34120200800:{HER:"FAB OTROS ART L MINA",OTR:"FAB OTROS ART LAMINA"},34130100800:{HER:"FAB TUBOS HIERRO Y ACERO",OTR:"FAB TUBOS HIERRO Y ACERO"},34210130800:{HER:"FUND REFIN LAMIN COBRE Y ALEACIONES",OTR:"FUND LAMIN COBRE Y ALEACIONES"},34220110800:{HER:"FUND LAMIN ALUMINIO SOLDADURAS",OTR:"ALUMINIO Y FAB SOLD ALUMINOTERM"},34230190800:{HER:"FAB TUBOS ESTA O",OTR:"FAB TUBOS ESTA O"},34230270900:{HER:"FAB EQS SOLDAR Y SOLDADURAS",OTR:"FAB EQS SOLDAR Y SOLDADURAS"},34290170800:{HER:"FUNDICIÓN METALES NO FERRUGINOSOS",OTR:"FUNDICION METALES NO FERRUGINOSOS"},35110120800:{HER:"FAB CUBIERTOS Y CUCHILLERÍA",OTR:"FAB CUBIERTOS Y CUCHILLERIA"},35120100800:{HER:"FAB UTENS AGR Y HERRAM MANO",OTR:"FAB UTENS AGRIC Y HERRAMIENTAS MANO"},35130180800:{HER:"FAB REMACHES",OTR:"FAB REMACHES"},35130260800:{HER:"FAB TORNILLOS TUERCAS Y PIJAS",OTR:"FAB TORNILLOS TUERCAS Y PIJAS"},35140160800:{HER:"FAB CLAVOS CAD GRAPAS Y TACHUELAS",OTR:"FAB CLAVOS CADENAS GRAPAS Y SIMILARES"},35150140800:{HER:"FAB CANDADOS",OTR:"FAB CANDADOS"},35150220800:{HER:"FAB CERRADURAS",OTR:"FAB CERRADURAS"},35160120800:{HER:"FAB CORTINAS METAL",OTR:"FAB CORTINAS METAL"},35160200800:{HER:"FAB JAULAS METAL",OTR:"FAB JAULAS METAL"},35160380800:{HER:"FAB OTROS ART ALUMINIO",OTR:"FAB OTROS ART ALUMINIO"},35160460800:{HER:"FAB PERFILES PUERTAS Y VENTANAS METAL",OTR:"FAB PERFILES PUERTAS Y VENTANAS METAL"},35160540800:{HER:"TALLER HERRERIA"},35310100800:{HER:"FAB ESTRUCTURAS METAL",OTR:"FAB ESTRUCTURAS METAL"},35310280800:{HER:"FAB TANQUES ENVASADO GASES O LÍQ",OTR:"FAB TANQUES ENVASADO GASES O LIQ"},35910140800:{HER:"FAB ENVASES L MINA",OTR:"FAB ENVASES LAMINA"},35910220800:{HER:"TALLER HOJALATERÍA",RYM:"TALLER HOJALATERIA"},35920120800:{HER:"FAB CORCHOLATAS",OTR:"FAB CORCHOLATAS"},35930100800:{HER:"FAB ALAMBRADOS Y TELAS METAL",OTR:"FAB ALAMBRADOS Y TELAS METAL"},35930280800:{HER:"FAB ALAMBRE",OTR:"FAB ALAMBRE"},35930360800:{HER:"FAB OTROS ART ALAMBRE",OTR:"FAB OTROS ART ALAMBRE"},35940180800:{HER:"FAB ART PELTRE",OTR:"FAB ART PELTRE"},35950160800:{HER:"GALVANIZACIÓN L MINA",OTR:"GALVANIZACION LAMINA"},35950240800:{HER:"GALVANIZACIÓN TUBERÍA",OTR:"GALVANIZACION TUBERIA"},35950320800:{HER:"TALLER COBRIZADO",OTR:"TALLER COBRIZADO"},35950400800:{HER:"TALLER CROMADO Y NIQUELADO",OTR:"TALLER CROMADO Y NIQUELADO"},35950580800:{HER:"TALLER ESMALTADO",OTR:"TALLER ESMALTADO"},35960140800:{HER:"FAB PIEZAS METÁLICAS POR FUNDICIÓN",OTR:"FAB PIEZAS METALICAS POR FUNDICION"},35960220800:{HER:"FAB TUBOS COBREPLOMO Y ALUMINIO",OTR:"FAB TUBOS COBREPLOMO Y ALUMINIO"},35990180800:{HER:"FAB ALFILERES AGUJAS Y BROCHES",OTR:"FAB ALFILERES AGUJAS Y BROCHES"},35990260800:{HER:"FAB CAJAS FUERTES",OTR:"FAB CAJAS FUERTES"},35990420800:{HER:"FAB ESPUELAS FRENOS Y ARNESES METAL",OTR:"FAB ESPUELAS FRENOS Y ARNESES METAL"},35990500800:{HER:"FAB HEBILLAS METAL",OTR:"FAB HEBILLAS METAL"},35990680800:{HER:"FAB HOJAS RASURAR",OTR:"FAB HOJAS RASURAR"},35990760800:{HER:"FAB OJILLOS METAL",OTR:"FAB OJILLOS METAL"},35990840800:{HER:"FAB OTROS ART LATÓN",OTR:"FAB OTROS ART LATON"},35990920800:{HER:"FAB OTROS ART METAL NO CLASIFICADOS",OTR:"FAB OTROS ART METAL NO CLASIFICADOS"},35991090800:{HER:"FAB PASADORES Y HORQUILLAS",OTR:"FAB PASADORES Y HORQUILLAS"},35991170800:{HER:"FAB PLANCHAS IND",OTR:"FAB PLANCHAS IND"},35991250800:{HER:"FAB TAPONES METAL",OTR:"FAB TAPONES METAL"},35991330800:{HER:"FAB TROQUELES",OTR:"FAB TROQUELES"},39970140800:{HER:"FAB ARMAS",OTR:"FAB ARMAS"},39970220800:{HER:"FAB CARTUCHOS",OTR:"FAB CARTUCHOS"},39970300800:{HER:"FAB CASQUILLOS",OTR:"FAB CASQUILLOS"},39970480800:{HER:"FAB MUNICIONES CAZA",OTR:"FAB MUNICIONES CAZA"},86110152700:{HOT:"HOTEL"},86120132700:{HOT:"SERV ALOJAMIENTO EN MOTELES",OTR:"SERV ALOJAMIENTO EN MOTELES"},86130112700:{HOT:"CAMPOS TURISMO",OTR:"CAMPOS TURISMO",TUR:"CAMPOS TURISMO"},86190192700:{HOT:"CASA HUÉSPEDES",OTR:"CASA HUESPEDES"},87110132700:{HOT:"CAFETERÍA",RBC:"CAFETERIA"},87110212700:{HOT:"RESTAURANTE",RBC:"RESTAURANTE"},87120112700:{HOT:"SERV ALIM TAQUERÍAS Y TORTERÍAS",VAL:"SERV ALIM LONCHERIAS TAQUERIAS"},87130192700:{HOT:"MARISCOS Y PESCADOS",VAL:"SERV MARISCOS Y PESCADOS"},87140172700:{HOT:"NEVERÍA Y REFRESQUERÍA",RBC:"NEVERIA Y REFRESQUERIA"},87190172700:{HOT:"MERENDEROS CENADURÍAS Y ANTOJITOS",RYM:"SERV MEREND CENAS Y ANTOJITOS REGIONALES"},87210122700:{HOT:"BARES Y CANTINAS",RBC:"BARES Y CANTINAS"},87220102700:{HOT:"CERVECERÍA",RBC:"CERVECERIA"},87230182700:{HOT:"SERV EN PULQUERÍAS",OTR:"SERV EN PULQUERIAS"},8723026e4:{HOT:"USUARIOS MENORES TURISMO",TUR:"USUARIOS MENORES TURISMO"},84210182500:{INF:"SERV PROCESAMIENTO ELECTRONICO DATOS",SER:"SERV ANÁLISIS SIST Y PROCES ELECT DATOS",TSP:"SERV SIST PROCES ELECT DATOS"},84290202500:{JUR:"EMPRESAS CONTROLADORAS NO FIN",SBF:"EMPRESAS CONTROLADORAS NO FIN",SER:"EMPRESAS CONTROLADORAS NO FIN"},26110110600:{MAD:"ASERRADERO",OTR:"ASERRADERO"},26110290600:{MAD:"BENEFICIO MADERAS"},26120190600:{MAD:"FAB TRIPLAY Y OTROS AGLOMERADOS"},26210100600:{MAD:"FAB CAJAS Y EMPAQUES MADERA"},26210280600:{MAD:"FAB TONELES Y BARRICAS MADERA"},26220180600:{MAD:"FAB ART PALMA CARRIZO MIMBRE Y SIM",OTR:"FAB ART PALMA CARRIZO MIMBRE Y SIMIL"},26310190600:{MAD:"FAB ATAUDES MADERA"},26320170600:{MAD:"FAB JUNTAS Y EMPAQUES CORCHO",OTR:"FAB JUNTAS Y EMPAQUES CORCHO"},26320250600:{MAD:"FAB OTROS ART CORCHO",OTR:"FAB OTROS ART CORCHO"},26330150600:{MAD:"FAB DUELAS Y OTROS MAT MADERA PISOS"},26330230600:{MAD:"FAB PUERTAS Y VENTANAS MADERA"},26390130600:{MAD:"FAB CARROCERIAS Y REDILAS MADERA"},26390210600:{MAD:"FAB MANGOS MADERA"},26390390600:{MAD:"FAB OTROS ART MADERA"},27110190600:{MAD:"FAB MUEBLES MADERA"},27110270600:{MAD:"FAB MUEBLES MATERIAL SINTÉTICO",OTR:"FAB MUEBLES MATERIAL SINTETICO"},27120170600:{MAD:"FAB PERSIANAS MADERA"},27130150600:{MAD:"FAB ALMOHADAS Y COJINES",OTR:"FAB ALMOHADAS Y COJINES"},27130230600:{MAD:"FAB COLCHONES Y COLCHONETAS",OTR:"FAB COLCHONES Y COLCHONETAS"},27190130600:{MAD:"FAB MARCOS Y MOLDURAS MADERA"},28110170600:{MAD:"FAB PAPEL",VTA:"FAB PAPEL"},28110250600:{MAD:"FAB PAPEL CIGARROS",VTA:"FAB PAPEL CIGARROS"},28110330600:{MAD:"FAB PASTA CELULOSA",VTA:"FAB PASTA CELULOSA"},28110410600:{MAD:"FAB PASTA O PULPA PAPEL",VTA:"FAB PASTA O PULPA PAPEL"},28120150600:{MAD:"FAB CARTON",VTA:"FAB CARTÓN"},28210160600:{MAD:"FAB SACOS Y BOLSAS PAPEL ENVASE",VTA:"FAB SACOS Y BOLSAS PAPEL ENVASE"},28220140600:{MAD:"FAB ENVASES CARTON",VTA:"FAB ENVASES CARTÓN"},28290100600:{MAD:"FAB OTROS ART CARTON",VTA:"FAB OTROS ART CARTÓN"},28290280600:{MAD:"FAB OTROS ART PAPEL",VTA:"FAB OTROS ART PAPEL"},66240101700:{MAD:"COMPRAVTA MADERA",VTA:"COMPRAVTA MADERA"},67130111700:{MAD:"COMPRAVTA MAQ, EQ, P TRAB MAD, METAL",VTA:"COMPRAVTA MAQ, EQ, P MADERA, METALES"},84250102500:{MAN:"SERV COPIAS FOTOSTÁTICAS Y SIMILARES",OTR:"SERV COPIAS FOTOSTATICAS XEROGRAF",SER:"SERV COPIAS FOTOST TICAS Y SIMILARES"},35320180800:{MAQ:"FAB CALDERAS TANQUES Y TINACOS METAL",OTR:"FAB CALDERAS TANQUES Y TINACOS METAL"},35320260800:{MAQ:"FAB CALENTADORES BA O",OTR:"FAB CALENTADORES BA O"},36110100900:{MAQ:"FAB Y REP VEHÍCULOS USO AGROPECUARIO",RYM:"FAB Y REP VEHICULOS USO AGROPECUARIO"},36110280900:{MAQ:"FAB MAQ E IMPLEMENTOS AGRICOLAS"},36210190800:{MAQ:"FAB HERRAMIENTAS METAL",OTR:"FAB HERRAMIENTAS METAL"},36210270900:{MAQ:"FAB REFACC Y MAQ IND"},36310180900:{MAQ:"FAB Y REP MAQ Y EQ P IND ALIM Y BEBIDAS",RYM:"FAB Y REP MAQ Y EQ IND ALIM Y BEBIDAS"},36320160900:{MAQ:"FAB Y REP MAQ EQ Y TRACTORES P IND EXTR",RYM:"FAB REP MAQ EQ Y TRACTORES IND EXTRAC"},36390120900:{MAQ:"FAB MOLINOS GRANOS"},36399050900:{MAQ:"USUARIOS MEN FAB MAQ Y ART ELECTRICOS"},36410170900:{MAQ:"FAB MAQ CALC REGIST Y ESCRIBIR",OTR:"FAB MAQ CALC REGIST Y ESCRIBIR"},3641025e4:{MAQ:"FAB EQ PROCES ELECTRÓNICO DATOS",OTR:"FAB EQ PROCES ELECTRONICO DATOS"},36910120900:{MAQ:"FAB MAQ COSER",OTR:"FAB MAQ COSER"},36920100900:{MAQ:"FAB Y REP GRÚAS MONTACARGAS Y OTRAS",RYM:"FAB REP GRUAS MONTACARGAS Y OTRAS"},36930180900:{MAQ:"FAB Y REP MOTORES NO ELECT NO AUTOS",RYM:"FAB REP MOTORES NO ELEC NO AUTOS"},36940160800:{MAQ:"FAB EXTINGUIDORES",OTR:"FAB EXTINGUIDORES"},36940240900:{MAQ:"FAB BOMBAS AGUA",OTR:"FAB BOMBAS AGUA"},36950140900:{MAQ:"FAB V LVULAS METAL",OTR:"FAB VALVULAS METAL"},36960120800:{MAQ:"FAB FILTROS METAL",OTR:"FAB FILTROS METAL"},36970100900:{MAQ:"FAB E INST AIRE ACOND CALEF Y REFRIG",OTR:"FAB E INST EQ AIRE ACOND CALEF Y REFRIG"},36990160800:{MAQ:"FAB ENGRANES METAL",OTR:"FAB ENGRANES METAL"},36990240800:{MAQ:"TALLER MECÁNICO FAB Y REP PARTES IND",RYM:"TALLER MECANICO FAB Y REP PARTES IND"},84270162500:{MAQ:"SERV INST Y MANT MAQ Y EQ EMP ESPEC",SER:"SERV INST Y MANTTO MAQ Y EQ EMPR ESPEC"},39940100600:{MED:"FAB ART DENTISTA",VTA:"FAB ART DENTISTA"},92110122600:{MED:"HOSP SANAT CLIN Y MATERNIDADES"},92120102600:{MED:"SERV MED GRAL Y ESPEC EN CONSULTORIOS"},92130182600:{MED:"SERV CONSULTORIOS Y CLINICAS DENTALES"},92140162600:{MED:"LABORATORIOS ANALISIS CLINICOS"},92150142600:{MED:"SERV LAB RADIOL Y RADIOSCOPIA"},92190162600:{MED:"OTROS SERV MEDICOS, BANCOS DE SANGRE"},92210112600:{MED:"CENTRO BENEFICENCIA",OTR:"CENTRO BENEFICENCIA"},92310102600:{MED:"SERV VETERINARIOS",OTR:"SERV VETERINARIOS"},9231028e4:{MED:"USUARIOS MENORES SERV MEDICOS"},93120181600:{MED:"ASOCIACIONES PROFESIONALES",SER:"ASOCIACIONES PROFESIONALES"},"03120170300":{MIN:"ASERRADEROS"},"03130150300":{MIN:"EXT CARBON VEGETAL"},"03210180300":{MIN:"EXT CHICLE"},"03220160300":{MIN:"EXPLOTACION CANDELILLA"},"03220240300":{MIN:"EXPLOTACION HULE"},"03220320300":{MIN:"EXT COLOFONIA"},"03220400300":{MIN:"EXT OTRAS RESINAS"},"03230140300":{MIN:"EXPLOTACION RAICES"},"03230220300":{MIN:"EXT ALQUITRAN VEGETAL"},"03230300300":{MIN:"EXT TREMENTINA"},11110120200:{MIN:"EXT Y BENEFICIO CARBON MINERAL"},12110100400:{MIN:"EXPLORACION PETROLEO POR CÍA"},12110280400:{MIN:"EXT PETROLEO CRUDO Y GAS NATURAL"},12119030400:{MIN:"USUARIOS MENORES PETROLEO"},1221019e4:{MIN:"PIDIREGAS PETROLEO"},13110180200:{MIN:"EXT Y BENEFICIO MINERAL HIERRO"},13210170200:{MIN:"EXT Y BENEFICIO ORO PLATA Y OTROS"},13220150200:{MIN:"EXT Y BENEFICIO MERCURIO Y ANTIMONIO"},13290110200:{MIN:"EXT COBRE PLOMO ZINC Y OTROS"},13299040200:{MIN:"USUARIOS MENORES MINERIA"},14110160200:{MIN:"EXT Y BENEFICIO PIEDRA"},14120140200:{MIN:"EXT YESO"},14130120200:{MIN:"EXT Y BENEFICIO ARENA Y GRAVA"},14190100200:{MIN:"EXT Y BENEFICIO OTROS MATERIALES CONST"},14210150200:{MIN:"EXT Y BENEFICIO ARCILLAS REFRACTARIAS"},14310140200:{MIN:"EXT Y BENEFICIO BARITA Y ROCA FOSFORICA"},14320120200:{MIN:"EXT Y BENEFICIO FLUORITA"},14330100200:{MIN:"EXT Y BENEFICIO SILICE"},14390180200:{MIN:"EXT Y BENEFICIO OTROS MINERALES"},15110140200:{MIN:"EXPLOTACION SAL MARINA Y YACIMIENTOS"},25110130600:{OTR:"FAB CALZADO DEPORTE NO PLASTICO",VRZ:"FAB CALZADO DEPORTE NO PLÁSTICO Y HULE"},25120110600:{OTR:"FAB ALPARGATAS BABUCHAS Y PANTUFLAS",VRZ:"FAB ALPARGATAS BABUCHAS Y PANTUFLAS"},25120290600:{OTR:"FAB GUARACHES Y SANDALIAS",VRZ:"FAB GUARACHES Y SANDALIAS"},25190170600:{OTR:"FAB CALZADO CUERO O PIEL",VRZ:"FAB CALZADO CUERO O PIEL"},25210200600:{OTR:"P REP VISCERAS IND NO ALIM",VRZ:"PREP VÍSCERAS INDS NO ALIMENTICIAS"},25290160600:{OTR:"FAB CEPILLOS Y PLUMEROS",VRZ:"FAB CEPILLOS Y PLUMEROS"},25290240600:{OTR:"FAB ART CUERO VIAJE",VRZ:"FAB ART CUERO VIAJE"},25290320600:{OTR:"FAB ART CUERO Y HUESO",VRZ:"FAB ART CUERO Y HUESO"},25290400600:{OTR:"FAB ART CUERO Y PIEL ZAPATERO",VRZ:"FAB ART CUERO Y PIEL ZAPATERO"},25290580600:{OTR:"FAB ART TEJIDOS CUERO",VRZ:"FAB ART TEJIDOS CUERO"},25290660600:{OTR:"FAB BANDAS Y CORREAS CUERO",VRZ:"FAB BANDAS Y CORREAS CUERO"},25290740600:{OTR:"FAB BOLSAS Y CARTERAS CUERO",VRZ:"FAB BOLSAS Y CARTERAS CUERO"},25290820600:{OTR:"FAB BROCHAS Y PINCELES",VRZ:"FAB BROCHAS Y PINCELES"},25290900600:{OTR:"FAB FORNITURAS MILITARES CUERO",VRZ:"FAB FORNITURAS MILITARES CUERO"},25291070600:{OTR:"FAB OTROS ART CUERO",VRZ:"FAB OTROS ART CUERO"},25291150600:{OTR:"TALABARTERIA",VRZ:"TALABARTERÍA"},30110120600:{OTR:"FAB ANIL",VTA:"FAB ANIL"},30110200600:{OTR:"FAB ANILINAS",VTA:"FAB ANILINAS"},30110380600:{OTR:"FAB OTRAS MATERIAS COLORANTES",VTA:"FAB OTRAS MATERIAS COLORANTES"},30120100600:{OTR:"FAB GAS ACETILENO",VTA:"FAB GAS ACETILENO"},30130180600:{OTR:"FAB ACIDOS IND",VTA:"FAB CIDOS IND"},30130260600:{OTR:"FAB OTRAS SUBSTANCIAS QUIM BASICAS",VTA:"FAB OTRAS SUBSTANCIAS QUÍMICAS B SICAS"},30130340600:{OTR:"FAB PROD AMONIACALES",VTA:"FAB PROD AMONIACALES"},30130420600:{OTR:"FAB SOSA",VTA:"FAB SOSA"},30210110600:{OTR:"FAB ABONOS Y FERTILIZANTES QUIMICOS",VPA:"FAB ABONOS Y FERTILIZANTES QUÍMICOS"},30220190600:{OTR:"FAB INSECTICIDAS Y PLAGUICIDAS",VTA:"FAB INSECTICIDAS Y PLAGUICIDAS"},30310100600:{OTR:"FAB HULE ESPUMA",VPP:"FAB HULE ESPUMA"},30320180600:{OTR:"FAB FIBRAS SINTETICAS",VPP:"FAB FIBRAS SINTÉTICAS"},30410190600:{OTR:"FAB PINTURASBARNICES Y LACAS",VTA:"FAB PINTURASBARNICES Y LACAS"},30610170600:{OTR:"FAB DENTIFRICO",VCC:"FAB DENTÍFRICO"},30610250600:{OTR:"FAB JABON Y DETERGENTE",VCC:"FAB JABÓN Y DETERGENTE"},30620150600:{OTR:"FAB PERFUMES Y COSMETICOS",VCC:"FAB PERFUMES Y COSMÉTICOS"},30710160600:{OTR:"FAB ESENCIAS",VTA:"FAB ESENCIAS"},30720140600:{OTR:"FAB GRASAS Y ACEITES ANIMALES USO IND",VTA:"FAB GRASAS Y ACEITES ANIMALES USO IND"},30720220600:{OTR:"FUNDICION SEBO",VTA:"FUNDICIÓN SEBO"},30720300600:{OTR:"HIDROGENADORA PROD DIVERSOS",VCC:"HIDROGENADORA PROD DIVERSOS"},30910140600:{OTR:"FAB COLAS Y PEGAMENTOS",VTA:"FAB COLAS Y PEGAMENTOS"},30910220600:{OTR:"FAB IMPERMEABILIZANTES",VTA:"FAB IMPERMEABILIZANTES"},30920120600:{OTR:"FAB CERA Y ABRILLANTADORES",VTA:"FAB CERA PULIMENTOS Y ABRILLANTADORES"},30920200600:{OTR:"FAB DESINFECTANTES Y DESODORIZANTES",VTA:"FAB DESINFECTANTES Y DESODORIZANTES"},30920380600:{OTR:"FAB GRASAS Y CREMAS LUSTRADORAS",VTA:"FAB GRASAS Y CREMAS LUSTRADORAS"},30920460600:{OTR:"FAB LANOLINA",VTA:"FAB LANOLINA"},30930100600:{OTR:"FAB AGUARRAS",VTA:"FAB AGUARR S"},30940180600:{OTR:"FAB CERILLOS Y FOSFOROS",VTA:"FAB CERILLOS Y FÓSFOROS"},30950160600:{OTR:"FAB OTROS ART CERA",VTA:"FAB OTROS ART CERA"},30950240600:{OTR:"FAB VELAS VELADORAS Y CIRIOS",VTA:"FAB VELAS VELADORAS Y CIRIOS"},30960140600:{OTR:"FAB TINTAS IMPRESION",VTA:"FAB TINTAS IMPRESIÓN"},30970120600:{OTR:"FAB DINAMITA",VTA:"FAB DINAMITA"},30970200600:{OTR:"FAB MECHAS MINAS",VTA:"FAB MECHAS MINAS"},30970380600:{OTR:"FAB OTROS EXPLOSIVOS",VTA:"FAB OTROS EXPLOSIVOS"},30970460600:{OTR:"FAB POLVORA",VTA:"FAB PÓLVORA"},30970540600:{OTR:"FAB PROD PIROTECNICOS",VTA:"FAB PROD PIROTÉCNICOS"},30990180600:{OTR:"FAB ART BAQUELITA",VTA:"FAB ART BAQUELITA"},30990260600:{OTR:"FAB DESINCRUSTANTES",VTA:"FAB DESINCRUSTANTES"},30990340600:{OTR:"FAB HIELO SECO",VTA:"FAB HIELO SECO"},30990420600:{OTR:"INDIZACION BASURA",VTA:"INDIZACIÓN BASURA"},31110100400:{OTR:"FAB GASOLINA REFINACION PETROLEO",PET:"FAB GASOLINA Y OTROS PROD"},31130160600:{OTR:"FAB ACEITES Y LUBRICANTES",PET:"FAB ACEITES Y LUBRICANTES"},31210190700:{OTR:"FAB COQUE Y OTROS DERIVADOS",PET:"FAB COQUE Y OTROS DE CARBÓN MINERAL"},32110180600:{OTR:"FAB LLANTAS Y CAMARAS VEHICULOS",VPP:"FAB LLANTAS Y CÁMARAS VEHÍCULOS"},32120160600:{OTR:"REGENERACION HULE",VPP:"REGENERACIÓN HULE"},32120240600:{OTR:"VULCANIZACION LLANTAS Y CAMARAS",VPP:"VULCANIZACIÓN LLANTAS Y CÁMARAS"},32190120600:{OTR:"FAB ART CON HULE USADO",VPP:"FAB ART CON HULE USADO"},32190200600:{OTR:"FAB LINOLEO",VPP:"FAB LINÓLEO"},32190380600:{OTR:"FAB OTROS ART HULE",VPP:"FAB OTROS ART HULE"},32210170600:{OTR:"FAB LAM TUBOS Y OTROS MAT PLASTICO",VPP:"FAB LAMIN TUBOS Y SIMILARES PLÁSTICO"},32220150600:{OTR:"FAB ART POLIETILENO",VPP:"FAB ART POLIETILENO"},32220230600:{OTR:"FAB CELULOIDE Y POLIETILENO",VPP:"FAB CELULOIDE Y POLIETILENO"},32230130600:{OTR:"FAB CALZADO PLASTICO",VPP:"FAB CALZADO PL STICO"},32230210600:{OTR:"FAB OTROS JUGUETES PLASTICO",VPP:"FAB OTROS JUGUETES PL STICO"},32290110600:{OTR:"FAB ART CELULOIDE",VPP:"FAB ART CELULOIDE"},32290290600:{OTR:"FAB BALONES GLOBOS Y PELOTAS",VPP:"FAB BALONES GLOBOS Y PELOTAS"},32290370600:{OTR:"FAB BOTONES PLASTICO",VPP:"FAB BOTONES PL STICO"},32290450600:{OTR:"FAB OTROS ART PLASTICO",VPP:"FAB OTROS ART PL STICO"},32290530600:{OTR:"FAB OTROS MATERIALES PLASTICO",VPP:"FAB OTROS MATERIALES PL STICO"},32290610600:{OTR:"FAB PEINES Y CEPILLOS USO PERSONAL",VPP:"FAB PEINES Y CEPILLOS USO PERSONAL"},32290790600:{OTR:"FAB PIELES ARTIFICIALES",VPP:"FAB PIELES ARTIFICIALES"},33110160600:{OTR:"FAB VAJILLAS CERAMICA EL HOGAR",VTA:"FAB VAJILLAS ALFARERÍA Y CERÁMICA HOGAR"},33190280700:{OTR:"FAB AZULEJOS",VTA:"FAB AZULEJOS"},33190360700:{OTR:"FAB LOZA Y PORCELANA",VTA:"FAB LOZA Y PORCELANA"},33190440700:{OTR:"FAB MUEBLES Y ART SANITARIOS",VTA:"FAB MUEBLES Y ART SANITARIOS"},33210150700:{OTR:"FAB VIDRIO",VTA:"FAB VIDRIO"},33220210700:{OTR:"FAB FIBRA VIDRIO",VTA:"FAB FIBRA VIDRIO"},33230110700:{OTR:"FAB AMPOLLETAS",VTA:"FAB AMPOLLETAS"},33230290700:{OTR:"FAB BOTELLAS",VTA:"FAB BOTELLAS"},33230370700:{OTR:"FAB CRISOLES",VTA:"FAB CRISOLES"},33230450700:{OTR:"FAB OTROS ENVASES VIDRIO",VTA:"FAB OTROS ENVASES VIDRIO"},33240190700:{OTR:"FAB EMPLOMADOS",VTA:"FAB EMPLOMADOS"},33240270700:{OTR:"FAB ESPEJOS Y LUNAS",VTA:"FAB ESPEJOS Y LUNAS"},33290190700:{OTR:"FAB ESFERAS VIDRIO",VTA:"FAB ESFERAS VIDRIO"},33290270700:{OTR:"FAB OBJETOS ARTISTICOS VIDRIO Y CRISTAL",VTA:"FAB OBJETOS ARTÍSTICOS VIDRIO Y CRISTAL"},33290350700:{OTR:"FAB OTROS OBJETOS CRISTAL",VTA:"FAB OTROS OBJETOS CRISTAL"},33310300700:{OTR:"FAB TEJA Y TUBO ARCILLA",VTA:"FAB TEJA Y TUBO ARCILLA"},33320200700:{OTR:"FAB PROD REFRACTARIOS",VTA:"FAB PROD REFRACTARIOS"},33410210700:{OTR:"FAB CONCRETO CIENTIFICO",VTA:"FAB CONCRETO CIENTÍFICO"},33420290700:{OTR:"FAB YESO",VTA:"FAB YESO"},33430190700:{OTR:"HORNO CAL",VTA:"HORNO CAL"},33520100600:{OTR:"FAB ABRASIVOS",VTA:"FAB ABRASIVOS"},33520280700:{OTR:"FAB ESMERILES",VTA:"FAB ESMERILES"},33520360600:{OTR:"FAB LIJA",VTA:"FAB LIJA"},33530180700:{OTR:"TALLER MARMOLERIA",VTA:"TALLER MARMOLERÍA"},3354909e4:{OTR:"USU MENOR IND PROD MINER NO METALICOS",VTA:"USUAR MENOR IND PROD MINERAL NO METAL"},35210110800:{OTR:"FAB BUTACAS METAL",VAH:"FAB BUTACAS METAL"},35210290800:{OTR:"FAB ESTUFAS",VAH:"FAB ESTUFAS"},35210370800:{OTR:"FAB OTROS MUEBLES METAL",VAH:"FAB OTROS MUEBLES METAL"},36990320900:{OTR:"FAB ACCS LA IND TEXTIL",TEX:"FAB ACCS LA IND TEXTIL"},38910180600:{OTR:"FAB MOTOS BICICLETAS",TRA:"FAB MOTOS BICICLETAS Y VEHÍCULOS PEDAL"},38920160600:{OTR:"FAB REFACC Y ACCS MOTOS BICICLETAS",TRA:"FAB REFACC Y ACCS MOTOS BICICLETAS"},38990120600:{OTR:"FAB CARREOLAS Y ANDADERAS",TRA:"FAB CARREOLAS Y ANDADERAS"},39120120600:{OTR:"FAB CAMARAS FOTOGRAFICAS CINE",VTA:"FAB CÁMARAS FOTOGRÁFICAS CINE Y PROYECT"},39120200600:{OTR:"FAB MATERIAL FOTOGRAFICO",VTA:"FAB MATERIAL FOTOGR FICO"},39210130600:{OTR:"FAB RELOJES",VTA:"FAB RELOJES"},39310120600:{OTR:"FAB MEDALLAS INSIGNIAS Y PLACAS",VTA:"FAB MEDALLAS INSIGNIAS Y PLACAS"},39320100600:{OTR:"FAB ART JOYERIA",VTA:"FAB ART JOYERÍA"},39320280600:{OTR:"OORFEBRERIA",VTA:"ORFEBRERÍA"},39320360600:{OTR:"TALLADO PIEDRAS PRECIOSAS",VTA:"TALLADO PIEDRAS PRECIOSAS"},39330180600:{OTR:"FAB ART QUINCALLERIA Y BISUTERIA",VTA:"FAB ART QUINCALLERÍA Y BISUTERÍA"},39410110600:{OTR:"FAB CUERDAS GUITARRA",VTA:"FAB CUERDAS GUITARRA"},39510100600:{OTR:"FAB APARATOS GIMNASIA",VTA:"FAB APARATOS GIMNASIA"},39510280600:{OTR:"FAB MESAS BILLAR",VTA:"FAB MESAS BILLAR"},39510360600:{OTR:"FAB OTROS ART DEPORTES",VTA:"FAB OTROS ART DEPORTES"},39610190600:{OTR:"FAB OTROS INSTRUMENTOS MEDICION",VTA:"FAB OTROS INSTRUMENTOS MEDICIÓN"},39610510900:{OTR:"FAB APARATOS OZONIZADORES",VTA:"FAB APARATOS OZONIZADORES"},39610690900:{OTR:"FAB TAXIMETROS",VTA:"FAB TAXÍMETROS"},39910160600:{OTR:"FAB JUGUETES NO HULE Y PLASTICO",VTA:"FAB JUGUETES NO HULE Y PLÁSTICO MOLDEADO"},39920140600:{OTR:"FAB ART ESCRITORIO",VTA:"FAB ART ESCRITORIO"},39920220600:{OTR:"FAB CANUTEROS",VTA:"FAB CANUTEROS"},39920300600:{OTR:"FAB CINTAS MAQ CALC REGIST Y ESCRIBIR",VTA:"FAB CINTAS MAQ CALC REGIST Y ESCRIBIR"},39920480600:{OTR:"FAB LAPICES",VTA:"FAB L PICES"},39920560600:{OTR:"FAB PIZARRONES",VTA:"FAB PIZARRONES"},39930120600:{OTR:"FAB SELLOS GOMA",VTA:"FAB SELLOS GOMA"},39930200800:{OTR:"FAB SELLOS CARROS FERROCARRIL",VTA:"FAB SELLOS CARROS FERROCARRIL"},39950180600:{OTR:"FAB CERCOS CALZADO",VTA:"FAB CERCOS CALZADO"},39950260600:{OTR:"FAB HORMAS CALZADO Y TACONES",VTA:"FAB HORMAS CALZADO Y TACONES"},39960160600:{OTR:"FAB ESCOBAS",VTA:"FAB ESCOBAS"},39990100600:{OTR:"FAB ABANICOS",VTA:"FAB ABANICOS"},39990280600:{OTR:"FAB ART CAREY",VTA:"FAB ART CAREY"},39990360600:{OTR:"FAB ART CONCHA",VTA:"FAB ART CONCHA"},39990440600:{OTR:"FAB BASTONES PARAGUAS Y SOMBRILLAS",VTA:"FAB BASTONES PARAGUAS Y SOMBRILLAS"},39990520600:{OTR:"FAB FLORES ARTIFICIALES",VTA:"FAB FLORES ARTIFICIALES"},39990600600:{OTR:"FAB OTROS ART PLUMA AVE",VTA:"FAB OTROS ART PLUMA AVE"},39990780600:{OTR:"FAB ROTULOS",VTA:"FAB RÓTULOS"},39990860700:{OTR:"FAB TALCO IND",VTA:"FAB TALCO IND"},39990940600:{OTR:"FAB TRAGALUCES Y MARQUESINAS",VTA:"FAB TRAGALUCES Y MARQUESINAS"},39991010600:{OTR:"FAB PROD MANUF NO CLASIF",VTA:"FAB PROD MANUFAC NO CLASIFICADOS"},39991193100:{OTR:"AJUSTE PROG VTA CART A FOBAPROA",SBF:"AJUSTE PROGRAMA VENTA CARTERA A FOBAPROA"},39991273200:{OTR:"AJUSTE ESTAD DERIVADO PROG APOYO",SBF:"AJUSTE ESTAD DERIVADO PROG APOYO"},39999030600:{OTR:"USUARIOS MENORES IND MANUFACTURERA",VTA:"USUARIOS MENORES IND MANUFACTURERA"},61310151700:{OTR:"SALCHICHONERIA",VTA:"SALCHICHONERÍA"},69110611e3:{OTR:"ACTUALIZ MENSUAL DEL SALDO OPER CRED",SBF:"ACTUALIZACIÓN MENSUAL SALDO OPER CRED"},69990911600:{OTR:"PREST AL PERSONAL LA INSTITUCION",SBF:"PREST AL PERSONAL LA INSTITUCIÓN"},69991163200:{OTR:"TARJETA CREDITO",SBF:"TARJETA CRÉDITO"},75130141300:{OTR:"AGENCIA ADUANAL",TRA:"AGENCIA ADUANAL"},75140121300:{OTR:"SERV BASCULA Y GRUA VEHICULOS",TRA:"SERV BASCULA Y GRÚA VEHÍCULOS"},81310132200:{OTR:"ALM DEPOSITO NACIONALES",TRA:"ALM DEPOSITO NACIONALES"},81310212300:{OTR:"ALM DEPOSITO PRIVADOS",TRA:"ALM DEPOSITO PRIVADOS"},82190172500:{OTR:"AGENTE SEGUROS",SBF:"AGENTE SEGUROS"},84110192500:{OTR:"SERV NOTARIAS PUBLICAS",PRO:"SERV NOTARÍAS PÚBLICAS",SER:"SERV NOTARÍAS PÚBLICAS"},84120172500:{OTR:"SERV BUFETES JURIDICOS",PRO:"SERV BUFETES JURÍDICOS",SER:"SERV BUFETES JURÍDICOS"},84140132500:{OTR:"SERV TEC ARQUIT E ING INCLUYE DISEÑO",PRO:"SERV TÉCNICOS ARQ E ING INCLUYE DISEÑO",SER:"SERV TEC ARQ E ING INCLUSO DISEÑO"},84150112500:{OTR:"DESPACHO OTROS PROFESIONISTAS",PRO:"DESPACHO OTROS PROFESIONISTAS",SER:"DESPACHO OTROS PROFESIONISTAS"},84190132500:{OTR:"SERV INVEST MERCAD SOLVENCIA FINANC",PRO:"SERV INVEST MERC SOLVENCIA FINANCIERA",SER:"SERV INVEST MERCAD SOLVENCIA FINANCIERA"},84240122500:{OTR:"SERV ADM TRAMITE Y COBRANZA",SER:"SERV ADM TRAMITE Y COBRANZA",TSP:"SERV ADM TRAMITE Y COBRANZA"},84280142500:{OTR:"SERV AGENC COLOC Y SELEC PERSONAL",SER:"SERV AGEN COLOC Y SELEC PERSONAL",TSP:"SERV AGEN COLOCACIÓN Y SELEC PERSONAL"},85110171200:{OTR:"ARREND MAQ"},85110332300:{OTR:"ARREND FIN PRIVADAS",SBF:"ARREND FIN PRIVADAS"},85120151200:{OTR:"ARREND EQ PROCES ELECT DATOS"},85190111200:{OTR:"ALQ MOB Y EQ COMERCIOS SERV Y OFIC"},85210161500:{OTR:"SALON FIESTAS"},85220141500:{OTR:"ALQ SILLAS Y VAJILLAS BANQUETES"},85230121500:{OTR:"ALQ EQS ELECTRONICOS"},85290101200:{OTR:"ALQ ROPA"},89110190600:{OTR:"TALLER REP GRAL AUTOS Y CAMIONES",RYM:"TALLER REP GRAL AUTOMOVILES Y CAMIONES"},89120170600:{OTR:"SERV REP MOTOCICLETAS Y BICICLETAS",RYM:"SERV REP MOTOCICLETAS Y BICICLETAS"},89130150600:{OTR:"SERV REP ESPEC PARTES AUTOS NO MOTOR",RYM:"SERV REP ESPEC PARTES AUTOS NO MOTOR"},89140130600:{OTR:"SERV PINTURA HOJALATERÍA CRISTALES",RYM:"SERV PINTURA TAPIZ Y CRISTALES AUTOS"},89150110600:{OTR:"SERV LAVADO Y LUBRICACIÓN AUTOMÓVILES",RYM:"SERV LAVADO Y LUBRICACION AUTOMOVILES"},89160192500:{OTR:"ESTACIONAM PRIV VEHICULOS"},89160272500:{OTR:"ESTACIONAM PUB VEHICULOS"},89190130600:{OTR:"SERV REP VEHÍCULOS TRACCIÓN ANIMAL",RYM:"SERV REP VEHICULOS TRACCION ANIMAL"},89210180600:{OTR:"TALLER REP CALZADO",RYM:"TALLER REP CALZADO"},89230140600:{OTR:"SERV REP RELOJES Y JOYAS",RYM:"SERV REP RELOJES Y JOYAS"},89240120600:{OTR:"TALLER TAPICERÍA",RYM:"TALLER TAPICERIA"},89290120600:{OTR:"TALLER REP PARAGUAS Y SOMBRILLAS",RYM:"TALLER REP PARAGUAS Y SOMBRILLAS"},89290200600:{OTR:"TALLER REP ROPA Y MEDIAS",RYM:"TALLER REP ROPA Y MEDIAS"},89290380600:{OTR:"TALLER REP SOMBREROS",RYM:"TALLER REP SOMBREROS"},89310172500:{OTR:"BAÑOS"},89320152500:{OTR:"BARBERIA Y PELUQUERIA"},89340112500:{OTR:"LAVANDERIA"},89340292500:{OTR:"TINTORERIA Y PLANCHADURIA"},89350192500:{OTR:"EMPRESA SERV LIMPIEZA"},89360172500:{OTR:"SERV FUMIG DESINFEC Y CONTROL PLAGAS"},89390112500:{OTR:"SERV MASAJE, SANIT PUB Y SERV ASEO"},89430122500:{OTR:"AGENCIA INHUMACIONES"},89440102500:{OTR:"PANTEON"},89490101200:{OTR:"TAXIDERMISTA"},93110101600:{OTR:"ASOCIACIONES Y CONFEDERACIONES",SER:"ASOCIACIONES Y CONFEDERACIONES"},93110281600:{OTR:"CAMARAS COMERCIO",SER:"CÁMARAS COMERCIO"},93110361600:{OTR:"CAMARAS IND",SER:"CÁMARAS IND"},93110441600:{OTR:"SOC COOPERATIVAS",SER:"SOC COOPERATIVAS"},93190141600:{OTR:"ORG CIVICAS",SER:"ORG CÍVICAS"},93210191600:{OTR:"ORG LABORALES Y SINDICALES",SER:"ORG LABORALES Y SINDICALES"},93220171600:{OTR:"ORG POLITICAS",SER:"ORG POLÍTICAS"},31120180600:{PET:"FAB PROD PETROQUIMICOS BASICOS"},62330191700:{PPE:"COMPRAVTA PAPELERIA Y ART ESCRITORIO",VTA:"COMPRAVTA PAPELERÍA Y ART ESCRITORIO"},93310181600:{REL:"ORG RELIGIOSAS",SER:"ORG RELIGIOSAS"},38210150600:{RYM:"FAB CARROS FERROCARRIL Y EQ",TRA:"FAB REP CARROS FERROCARRIL Y EQ"},38310140600:{RYM:"FAB Y REP BUQUES Y BARCOS",TRA:"FAB Y REP BUQUES Y BARCOS"},38310220600:{RYM:"FAB Y REP OTROS VEHICULOS ACUATICOS",TRA:"FAB Y REP OTROS VEHÍCULOS ACU TICOS"},38320120600:{RYM:"FAB ENSAMBLE Y REP AERONAVES",TRA:"FAB ENSAMBLE Y REP AERONAVES"},39110140600:{RYM:"FAB Y REP ART OPTICA",VTA:"FAB Y REP ART ÓPTICA"},39410290600:{RYM:"FAB Y REP INSTRUMENTOS MUSICALES",VTA:"FAB Y REP INSTRUMENTOS MUSICALES"},39610270600:{RYM:"FAB Y REP BASCULAS Y BALANZAS",VTA:"FAB Y REP BASCULAS Y BALANZAS"},39610350600:{RYM:"FAB Y REP INSTRUMENTOS FISICA Y QUIMICA",VTA:"FAB Y REP INSTRUMENTOS FÍSICA Y QUÍMICA"},39610430600:{RYM:"FAB Y REP INSTRUMENTOS INGENIERIA",VTA:"FAB Y REP INSTRUMENTOS INGENIERÍA"},39620170600:{RYM:"FAB Y REP APARATOS ORTOPEDICOS",VTA:"FAB Y REP APARATOS ORTOPÉDICOS"},39620250600:{RYM:"FAB Y REP INSTRUMENTOS CIRUGIA",VTA:"FAB Y REP INSTRUMENTOS CIRUGÍA"},8429038e4:{SPV:"EMPRESAS SEGURIDAD PRIVADA"},23110330600:{TEX:"COMPRESORA ALGODON"},23120150600:{TEX:"BENEFICIO LANAS"},23120230600:{TEX:"BENEFICIO OTRAS FIBRAS TEXTILES"},23120310600:{TEX:"FAB HILADOS Y TEJIDOS ALGODON"},23120490600:{TEX:"FAB HILADOS Y TEJIDOS LANA"},23130130600:{TEX:"FAB HILOS COSER"},23130210600:{TEX:"ACABADO HILOS"},23130390600:{TEX:"FAB OTROS HILADOS Y TEJIDOS NO SINTETICO"},23140110600:{TEX:"FAB ESTAMBRES"},23150190600:{TEX:"FAB SARAPES Y COBIJAS"},23150270600:{TEX:"FAB CASIMIRES Y PA OS"},23160170600:{TEX:"FAB TOALLAS"},23160250600:{TEX:"FAB COLCHAS"},23170150600:{TEX:"FAB HILADOS Y TEJIDOS SEDA"},23170230600:{TEX:"FAB OTROS ART LANA"},23170310600:{TEX:"FAB OTRAS TELAS MIXTAS FIBRAS BLANDAS"},23180130600:{TEX:"FAB CINTAS AGUJETAS Y LISTONES"},23180210600:{TEX:"FAB ENCAJES"},23180390600:{TEX:"FAB TELAS ELASTICAS"},23190110600:{TEX:"ACABADO TELAS"},23210160600:{TEX:"FAB CALCETINES",VRP:"FAB CALCETINES"},23210240600:{TEX:"FAB MEDIAS",VRP:"FAB MEDIAS"},23220140600:{TEX:"FAB SUETERES",VRP:"FAB SUÉTERES"},23290100600:{TEX:"FAB HILADOS Y TEJIDOS OTRAS FIBRAS SINT"},23310150600:{TEX:"DESFIBRACION HENEQUEN"},23320130600:{TEX:"FAB HILADOS Y TEJIDOS HENEQUEN"},23330110600:{TEX:"FAB ART PALMA Y TULE"},23330290600:{TEX:"FAB TEJIDOS Y TORCIDOS PALMA"},23330370600:{TEX:"FAB TEJIDOS Y TORCIDOS IXTLE"},23390190600:{TEX:"FAB HILADOS Y TEJIDOS YUTE"},23390270600:{TEX:"FAB HILADOS Y TEJIDOS FIBRA COCO"},23910190600:{TEX:"FAB ART LONA"},23910270600:{TEX:"FAB LONA"},23910350600:{TEX:"FAB TELAS IMPERMEABLES"},23920170600:{TEX:"FAB TAPETES Y ALFOMBRAS"},23920250600:{TEX:"FAB TELAS TAPICERIA"},23930150600:{TEX:"FAB ENTRETELAS Y FIELTROS"},23940130600:{TEX:"BENEFICIO PELO Y CERDA LA IND TEXTIL"},23940210600:{TEX:"FAB BORRAS Y ESTOPAS"},23940390600:{TEX:"FAB OTROS ART ALGODON"},24110150600:{TEX:"FAB VESTIDOS Y OTRAS PRENDAS EXT DAMA",VRP:"FAB VESTIDOS Y OTRAS PRENDAS EXT DAMA"},24110230600:{TEX:"TALLER CONFECCION VESTIDOS",VRP:"TALLER CONFECCIÓN VESTIDOS"},24120130600:{TEX:"FAB OTRAS PRENDAS EXT CABALLERO",VRP:"FAB OTRAS PRENDAS EXT VESTIR CABALLERO"},24120210600:{TEX:"FAB TRAJES CABALLERO",VRP:"FAB TRAJES CABALLERO"},24120390600:{TEX:"TALLER SASTRERIA",VRP:"TALLER SASTRERÍA"},24130110600:{TEX:"FAB UNIFORMES",VRP:"FAB UNIFORMES"},24140190600:{TEX:"FAB CAMISAS",VRP:"FAB CAMISAS"},24150170600:{TEX:"FAB OTRAS PRENDAS EXT NIÑO",VRP:"FAB OTRAS PRENDAS EXT VESTIR NIÑO"},24160150600:{TEX:"FAB CORBATAS",VRP:"FAB CORBATAS"},24160230600:{TEX:"FAB GUANTES",VRP:"FAB GUANTES"},24160310600:{TEX:"FAB PA UELOS PA OLETAS Y MASCADAS",VRP:"FAB PA UELOS PA OLETAS Y MASCADAS"},24170130600:{TEX:"FAB CACHUCHAS Y GORRAS",VRP:"FAB CACHUCHAS Y GORRAS"},24170210600:{TEX:"FAB SOMBREROS EXCEPTO PALMA",VRP:"FAB SOMBREROS EXCEPTO PALMA"},24180110600:{TEX:"FAB SOMBREROS PALMA",VRP:"FAB SOMBREROS PALMA"},24190190600:{TEX:"FAB CHAMARRAS Y ABRIGOS",VRP:"FAB CHAMARRAS Y ABRIGOS"},24190270600:{TEX:"FAB IMPERMEABLES",VRP:"FAB IMPERMEABLES"},24190350600:{TEX:"FAB TIRANTES",VRP:"FAB TIRANTES"},24190430600:{TEX:"FAB MANTONES Y CHALINAS",VRP:"FAB MANTONES Y CHALINAS"},24190510600:{TEX:"FAB REBOZOS Y CINTURONES TEJIDOS HILO",VRP:"FAB REBOZOS Y CINTURONES TEJIDOS HILO"},24190690600:{TEX:"FAB ROPA CON PIEL",VRP:"FAB ROPA CON PIEL"},24210140600:{TEX:"FAB CORSETERIA Y ROPA INTERIOR DAMA",VRP:"FAB CORSETERÍA Y ROPA INTERIOR DAMA"},24290180600:{TEX:"FAB ROPA INTERIOR CABALLERO",VRP:"FAB ROPA INTERIOR CABALLERO"},24310130600:{TEX:"FAB SABANAS"},24310210600:{TEX:"FAB CORTINAS TELA Y MANTELERIA"},24320110600:{TEX:"FAB CUBRE ASIENTOS VEHICULOS"},24320290600:{TEX:"FAB TAPICES PLASTICOS"},24330190600:{TEX:"FAB ALGODON VENDAS TELA ADHESIVA Y SIMIL"},24340170600:{TEX:"FAB ART BORDADOS Y DESHILADOS"},24340250600:{TEX:"FORRADO BOTONES Y HEBILLAS"},24390170600:{TEX:"FAB BANDERAS Y ADORNOS TELA"},24390250600:{TEX:"FAB COSTALES"},25210120600:{TEX:"CURTIDURIA",VRZ:"CURTIDURÍA"},71110161300:{TRA:"TRANS AUTOBUS URBANO Y SUBURBANO PASAJ"},71120141300:{TRA:"TRANS EN AUTOBUS FORANEO PASAJEROS"},71130121300:{TRA:"TRANS EN AUTOMÓVIL RULETEO",TXS:"TRANS EN AUTOMOVIL RULETEO"},71140101300:{TRA:"TRANS EN AUTOMOVILES SITIO Y TURISMO"},71150181300:{TRA:"TRANS EN AUTOMOVIL RUTA FIJA"},71190101300:{TRA:"AUTOTRANS ESCOLAR TURISTICO EN AUTOBUS"},71210151300:{TRA:"AUTOTRANS MATERIALES CONST"},71220131300:{TRA:"AGENCIA MUDANZAS"},71230111300:{TRA:"AUTOTRANS CARGA PROD ESPECIFICOS"},71290191300:{TRA:"TRANS CARGA FORANEA"},71299021300:{TRA:"USUARIOS MENORES TRANS"},71310141300:{TRA:"FERROCARRILES"},71320121300:{TRA:"TRANVIAS Y TROLEBUSES"},71330101300:{TRA:"TRANS EN FERROCARRIL URBANO (METRO)"},71910181300:{TRA:"TRANS POR DUCTOS"},72110141300:{TRA:"AGENCIA VAPORES Y BUQUES"},72120121300:{TRA:"TRANS MARITIMOS CABOTAJE"},72910161300:{TRA:"TRANS FLUVIAL Y LACUSTRE"},72990101300:{TRA:"CARGA Y ESTIBA PORTUARIA"},73110121300:{TRA:"TRANSPORTACION AEREA PASAJEROS"},73120101300:{TRA:"SERV TRANS AERONAVES MATRICULA EXTRAN"},74110101300:{TRA:"ADM CAMINOS PUENTES Y SERV AUXILIARES"},74120181300:{TRA:"AEROPUERTO CIVIL"},74130161300:{TRA:"ADM PUERTOS MARITIMOS Y FLUVIALES"},74140141300:{TRA:"ADM CTRALES CAMIONERAS Y SERV AUXILIARES"},75190121300:{TRA:"AGENCIA FERROCARRIL"},75190201300:{TRA:"ALQ LANCHAS Y VELEROS"},75190381300:{TRA:"RENTA VEHICULOS AEREOS"},8429046e4:{TRA:"EMPRESAS TRANS VALORES"},85240101200:{TRA:"ALQ O RENTA AUTOMOVILES SIN CHOFER"},63290161700:{VAH:"COMPRAVTA OTROS ART EL HOGAR",VTA:"COMPRAVTA OTROS ART EL HOGAR"},61110171700:{VAL:"COMPRAVTA SEMILLAS Y GRANOS",VTA:"COMPRAVTA SEMILLAS Y GRANOS"},61120151700:{VAL:"COMPRAVTA FRUTAS",VTA:"COMPRAVTA FRUTAS"},61120231700:{VAL:"COMPRAVTA LEGUMBRES Y HORTALIZAS",VTA:"COMPRAVTA LEGUMBRES Y HORTALIZAS"},61130131700:{VAL:"COMPRAVTA CHILE SECO Y ESPECIAS",VTA:"COMPRAVTA CHILE SECO Y ESPECIAS"},61250181700:{VAL:"COMPRAVTA HUEVO",VTA:"COMPRAVTA HUEVO"},61260161700:{VAL:"COMPRAVTA MANTECA",VTA:"COMPRAVTA MANTECA"},61260321700:{VAL:"COMPRAVTA PESCADOS Y MARISCOS",VTA:"COMPRAVTA PESCADOS Y MARISCOS"},61320131700:{VAL:"COMPRAVTA DULCES",VTA:"COMPRAVTA DULCES"},61320211700:{VAL:"COMPRAVTA ESPECIAS Y ART ALIM DESHIDRAT",VTA:"COMPRAVTA ESPECIAS Y ART ALIM DESHIDRAT"},61320391700:{VAL:"COMPRAVTA LECHE",VTA:"COMPRAVTA LECHE"},61320471700:{VAL:"COMPRAVTA OTROS PROD LACTEOS",VTA:"COMPRAVTA OTROS PROD L CTEOS"},61320551700:{VAL:"COMPRAVTA PAN Y PASTELES",VTA:"COMPRAVTA PAN Y PASTELES"},61320631700:{VAL:"COMPRAVTA SAL",VTA:"COMPRAVTA SAL"},69999001700:{VAM:"USUARIOS MENORES COMERCIO",VTA:"USUARIOS MENORES COMERCIO"},61340191700:{VBD:"COMPRAVTA REFRESCOS AGUAS PURIFICADAS",VTA:"COMPRAVTA REFRESCOS AGUAS PURIFICADAS"},61350171700:{VBD:"COMPRAVTA CERVEZA",VTA:"COMPRAVTA CERVEZA"},61360151700:{VBD:"COMPRAVTA PULQUE",VTA:"COMPRAVTA PULQUE"},61360231700:{VBD:"COMPRAVTA VINOS Y LICORES",VTA:"COMPRAVTA VINOS Y LICORES"},69991081700:{VCC:"COMPRAVTA ART NO CLASIFICADOS",VOC:"COMPRAVTA ART NO CLASIFICADOS",VPA:"COMPRAVTA ART NO CLASIFICADOS",VPP:"COMPRAVTA ART NO CLASIFICADOS",VTA:"COMPRAVTA ART NO CLASIFICADOS"},62110231700:{VRP:"COMPRAVTA ROPA",VTA:"COMPRAVTA ROPA"},62120131700:{VRZ:"COMPRAVTA CALZADO",VTA:"COMPRAVTA CALZADO",VZC:"COMPRAVTA CALZADO"}};class wt extends(bt(C(_e(A)))){static get is(){return"bbva-personal-data-step-dm-upgrade-account"}static get properties(){return{customerData:{type:Object},customerDetail:{type:Object},activities:{type:Array},curp:{type:String},cic:{type:String},invalidCurp:{type:Boolean},invalidIne:{type:Boolean},invalidCic:{type:Boolean},cicValidated:{type:Boolean},ineValidated:{type:Boolean},curpValidated:{type:Boolean},economicDataValidated:{type:Boolean},modifyCustomerValidated:{type:Boolean},formData:{type:Object},ocr:{type:Object},occupations:{type:Array},showCurpInput:{type:Boolean},showIneInput:{type:Boolean},civilStatusValues:{type:Array},ctaClicked:{type:Boolean},countries:{type:Array},enabledStep:{type:Boolean},occupationsId:{type:String}}}static get scopedElements(){const e=[kt,fe];return wt.scopedElementsFromClasses(e)}constructor(){super(),this.countries=[],this.customerData=void 0,this.customerDetail=void 0,this.occupations=[],this.activities=[],this.civilStatusValues=[],this.civilRegistriesMaxRetries=4,this.resetProcess()}render(){return d`
      <bbva-manager-photo-converter
        id="photoConverter"
        @selfie-success="${this._onSelfieConverterSuccess}">
      </bbva-manager-photo-converter>
      <bbva-upgrade-account-rfc-calculator
        id="rfcCalculator"
        @set-rfc-from-customer-data="${this._handleRfc}"
      >
      </bbva-upgrade-account-rfc-calculator>
    `}updated(e){if(e.has("occupations")&&this.occupations.length&&this._onChangeOccupations(this.occupations,Yt),(e.has("customerData")||e.has("customerDetail")||e.has("countries")||e.has("civilStatusValues")||e.has("activities"))&&this.customerData&&this.customerDetail&&this.countries.length&&this.civilStatusValues.length&&this.activities&&this._onAllDataRetrieved(this.customerData,this.customerDetail,this.countries,this.civilStatusValues,this.activities),(e.has("curp")||e.has("ocr"))&&this.curp&&this.ocr){const e=(this.ocr.optionalData||{}).curp,t=this.curp.documentNumber;this.invalidCurp=!e||!t||e!==t}e.has("invalidCic")&&this.invalidCic&&(this.showIneInput=this.invalidCic,this._fireEvent("show-ine-input",this.showIneInput)),e.has("invalidCurp")&&this.invalidCurp&&(this.showCurpInput=this.invalidCurp,this._fireEvent("show-curp-input",this.showCurpInput)),(e.has("showIneInput")||e.has("showCurpInput")||e.has("invalidCic")||e.has("invalidIne")||e.has("invalidCurp")||e.has("cicValidated")||e.has("ineValidated")||e.has("curpValidated")||e.has("ctaClicked")||e.has("economicDataValidated")||e.has("modifyCustomerValidated"))&&this._isComplete()&&this._completeStep(this.formData),e.has("formData")&&this._validateForm(),e.has("services")&&this._checkServicesStatus(this.services)}reset(){this.invalidIne=!1,this.ineValidated=!1,this.curpValidated=!1,this.cicValidated=!1,this.invalidCic=!1,this.modifyCustomerValidated=!1,this.economicDataValidated=!1,this.ctaClicked=!1,this._servicesRetry=1,this.servicesMaxRetry=3,this.civilRegistriesRetries=1,this.services=[{call:"getCustomerData",status:""},{call:"getMaritalStatus",status:""},{call:"getCustomerDetail",status:""}]}resetProcess(){this.reset(),this.cic="",this.curp=void 0,this.ocr=void 0,this.invalidCurp=!1,this.showIneInput=!1,this.showCurpInput=!1,this.formData={civilStatus:[],job:"",activity:"",rfc:"",ine:"",electorKey:"",registerYear:"",curp:""},this.enabledStep=!1,this.occupationsId="",this._fireEvent("ocr-curp",""),this._fireEvent("show-ine-input",this.showIneInput),this._fireEvent("show-curp-input",this.showCurpInput)}initStep(){this.getCustomerData(),this.getCustomerDetail(),this.getMaritalStatus()}getCustomerData(){this._fireEvent("get-customer-data")}getCustomerDetail(){this._fireEvent("get-customer-detail")}getMaritalStatus(){this._fireEvent("get-maritalStatus")}_calcRfc(e){var t;const i={name:null==e?void 0:e.firstName,firstSurname:null==e?void 0:e.lastName,secondSurname:null==e?void 0:e.secondLastName,birthDate:null==e||null===(t=e.birthData)||void 0===t?void 0:t.birthDate};this.shadowRoot.getElementById("rfcCalculator").getRfc(i)}_handleRfc(e){this.formData.rfc=e.detail.rfc,this._fireEvent("update-rfc",e.detail.rfc)}onCustomerDataChanged(e){this.customerData=e,this.services=this._updateServicesStatus(this.services,"getCustomerData","OK"),this.formData.rfc||this._calcRfc(e),this._fireEvent("notify-customer-data",e)}onErrorCustomerDataRequestResponse(){this.services=this._updateServicesStatus(this.services,"getCustomerData","KO")}onCustomerDetailChanged(e){this.services=this._updateServicesStatus(this.services,"getCustomerDetail","OK"),this.customerDetail=e}disabledStepPersonal(e){this.enabledStep=!e}ocrData(e={}){this.ocr=e,this.cic=(e.optionalData||{}).codeIdentificationCredential,this.invalidCic=!this.cic,this._fireEvent("ocr-curp",(e.optionalData||{}).curp)}clickContinue(){this.ctaClicked=!0,this._validateFields()}_validateFields(){this._verifyCurp(this.customerData,this.formData,this.ocr,this.showCurpInput)}_validateCredentialsDataFields(){this._needValidateCic(this.showIneInput,this.invalidCic,this.cicValidated)?this._validateCic(this.cic):this._needValidateIne(this.showIneInput,this.formData,this.invalidIne)&&this._verifyIne(this.formData)}retryValidateCredentialsData(){this._validateCredentialsData(this._validateCredentialsDataParams,this._selfie,this.native)}retryVerifyCurp(){this._verifyCurp(this.customerData,this.formData,this.ocr,this.showCurpInput)}retryModifyCustomerRequest(){this._modifyCustomerRequest()}retryEconomicData(){this.onPatchCustomerSuccess()}_isComplete(){const e=!this.showIneInput&&!this.invalidCic&&this.cicValidated,t=this.showIneInput&&!this.invalidIne&&this.ineValidated,i=!this.showCurpInput||!this.invalidCurp&&this.curpValidated;return(e||t)&&i&&this.ctaClicked&&this.economicDataValidated&&this.modifyCustomerValidated}_completeStep(e){this.reset(),this._fireEvent("hide-spinner"),this._fireEvent("complete-step"),this._fireEvent("update-personal-step",{personalData:e,id:"personal"})}_needValidateCic(e,t,i){return!e&&!t&&!i}_needValidateIne(e,t,i){return e&&!!t.ine&&!!t.electorKey&&!!t.registerYear&&!i}_validateCic(e){this._validateCredentialsDataParams={auditLog:{branch:{id:"3307"},operationType:{id:"GI"}},customer:{identityDocuments:[{documentType:{id:"INE"},documentNumber:e}]}},this._validateCredentialsData(this._validateCredentialsDataParams,this._selfie,this.native)}_verifyIne(e){this._validateCredentialsDataParams={auditLog:{branch:{id:"3307"},operationType:{id:"GI"}},customer:{identityDocuments:[{documentType:{id:"INE"},code:e.ine,key:e.electorKey,registerYear:e.emissionYear,folio:e.emissionNumber}]}},this._validateCredentialsData(this._validateCredentialsDataParams,this._selfie,this.native)}_modifyCustomerRequest(){this._fireEvent("show-spinner"),this._fireEvent("request-customer-patch",{patchTypeId:{id:"MARITAL-STATUS"},maritalStatus:{id:this._getCivilStatusValue(this.formData.civilStatus.value)},identityDocuments:[{documentNumber:this.formData.rfc,documentType:{id:"RFC"}}]})}_validateCredentialsData(e,t,i){let a,s={};i?a={type:"multipart/form-data",formDataParts:[{name:"metadata",body:{mediaType:"text/plain",content:JSON.stringify(e)}},{name:"file2",body:{mediaType:"text/plain",content:t.base64.split(",").pop()}}]}:(a=!0,s=new FormData,s.append("metadata",JSON.stringify(e))),this._fireEvent("show-spinner"),this._fireEvent("post-validate-credentials-data",{body:s,multipart:a})}onValidateCredentialsDataSuccess(e){let t=!1;const i=e.auditLog.validationResults;if(this._needValidateIne(this.showIneInput,this.formData,this.invalidIne)){const e=i.find((e=>"YEAR_REGISTRY"===e.validationResultType)),a=i.find((e=>"NUMBER_EMISION"===e.validationResultType)),s=i.find((e=>"ELECTORAL_ID"===e.validationResultType));t=!(s&&a&&e)||("REJECTED"===s.result||"REJECTED"===a.result||"REJECTED"===e.result);const r=i.find((e=>e.validationResultType===this.validateRejectedMessages(e.validationResultType)));r&&(t="REJECTED"===r.result,this.showIneExitModalWithDate()),this.invalidIne=t,this.ineValidated=!t}else if(this._needValidateCic(this.showIneInput,this.invalidCic,this.cicValidated)){const e=i.find((e=>"VISIT_INE REGISTRO EN PADRON ELECTORAL NO VIGENTE"===e.validationResultType));this.invalidCic=void 0!==e&&"REJECTED"===e.result,this.cicValidated=!e}(this.ineValidated||this.cicValidated)&&this._modifyCustomerRequest(),this._fireEvent("hide-spinner")}onValidateCredentialsDataError(){this._fireEvent("hide-spinner"),this.handleErrorRetry("error-validate-credentials-data")}validateRejectedMessages(e){let t;switch(e){case"VISIT_INE VALIDACION NO EXITOSA":case"VISIT_INE PASE A GESTION A CORREGIR SUS DATOS":case"VISIT_INE REGISTRO EN PADRON ELECTORAL NO VIGENTE":case"VISIT_INE CREDENCIAL CON SITUACION DE ROBO O EXTRAVIO":case"VISIT_INE VERIFICAR: OCR":case"VISIT_INE VERIFICAR: CLAVE DE ELECTOR":case"VISIT_INE VERIFICAR: NUMERO DE EMISION":t=e;break;default:t="DEFAULT"}return t}_verifyCurp(e,t,i,a){const s=a?t.curp:(i.optionalData||{}).curp,r={secondLastName:e.secondLastName,lastName:e.lastName,birthDate:e.birthData.birthDate,name:e.firstName,documentNumber:s,birthPlace:"",gender:{id:e.gender.id}};this._fireEvent("show-spinner"),this._fireEvent("invalid-curp",!1),this._fireEvent("post-civil-registries-search",r)}onCivilRegistriesSuccess(e){const{customerData:t}=this,i=(e||[]).length?e[0]:{},a=(i.identityDocuments||[]).length?i.identityDocuments[0]:{},s=(t.nationalities||[]).length?t.nationalities[0]:{};"MEX"===((a||{}).country||{}).id||s.id?(this.invalidCurp=!1,this.curpValidated=!0,this._fireEvent("hide-spinner"),this._fireEvent("invalid-curp",this.invalidCurp),this._validateCredentialsDataFields()):this._getErrorAction("default")}onCivilRegistriesError(e={}){this._fireEvent("hide-spinner");const t=(e.messages||[]).length?e.messages[0]:{};if("functionalError"===t.code){const e=(t.message||"").substring(0,8);this._getErrorAction(e)}else this.handleErrorRetry("error-verify-curp")}_getErrorAction(e){const t={"01519015":"showRenapoExitModal","00915290":"showRenapoExitModal","00915309":"civilRegistriesRetry","01519021":"civilRegistriesRetry",default:"showExitModalWithDate"};this[t[e]||t.default]()}civilRegistriesRetry(){this.civilRegistriesRetries++,this.civilRegistriesRetries>this.civilRegistriesMaxRetries?this._getErrorAction("default"):(this.invalidCurp=!0,this._fireEvent("invalid-curp",this.invalidCurp))}validateOccupation(e){const t=this.occupations.filter((t=>this._getObjectDesciption(t)===e));if(t.length>0){this._fireEvent("send-occupation-id",t[0].id),this.occupationsId=t[0].id;const e=this.activities.occupations.filter((e=>e.id===t[0].id))[0].activities.map((e=>({value:e.id,label:e.name,selected:""})));this._fireEvent("send-activities-form",e)}this._fireEvent("show-activity",t.length>0)}onPatchCustomerSuccess(){this.modifyCustomerValidated=!0,this._fireEvent("request-patch-economic-data",{reason:"UPGRADE_ACCOUNT",economicActivity:{id:this.formData.activity.value},occupationType:{id:this.occupationsId}})}onPatchCustomerError(){this._fireEvent("hide-spinner"),this.handleErrorRetry("error-modify-customer")}onPatchEconomicDataSuccess(){this.economicDataValidated=!0,this._fireEvent("hide-spinner")}onPatchEconomicDataError(){this._fireEvent("hide-spinner"),this.handleErrorRetry("error-economic-data")}onErrorCustomerDetailRequestResponse(){this.services=this._updateServicesStatus(this.services,"getCustomerDetail","KO")}_validateForm(){const e=this.formData.civilStatus&&Object.keys(this.formData.civilStatus).length>0,t=!!this.formData.job,i=this.formData.activity&&Object.keys(this.formData.activity).length>0,a=this._validateRfc(this.formData.rfc),s=!this.showIneInput||this._validateIne(this.formData.ine),r=!this.showIneInput||this._validateElectorKey(this.formData.electorKey),o=!this.showIneInput||this._validateRegisterYear(this.formData.registerYear),n=!this.showCurpInput||this._validateCurp(this.formData.curp),A=e&&t&&i&&a&&s&&r&&o&&n&&!this.invalidIne;this._validateSignature(),this._fireEvent("enable-continue-button",A),this._fireEvent("invalid-rfc",!a&&!!this.formData.rfc),this._fireEvent("invalid-ine",!s&&!!this.formData.ine||this.invalidIne),this._fireEvent("invalid-elector-key",!r&&!!this.formData.electorKey||this.invalidIne),this._fireEvent("invalid-register-year",!o&&!!this.formData.registerYear||this.invalidIne),this._fireEvent("invalid-curp",!n&&!!this.formData.curp)}_validateSignature(){const e=/^[0]*$/;let t;return Object.keys(this.formData.signature||{}).length>=8&&(t=e.test(this.formData.signature)?"":this._fireEvent("bbva-manager-upgrade-account-signature-validated",this.formData.signature)),t}_validateRfc(e){return new RegExp("^(([A-ZÑ&]{4})([0-9]{2})([0][13578]|[1][02])(([0][1-9]|[12][\\d])|[3][01])([A-Z0-9]{3}))|(([A-ZÑ&]{4})([0-9]{2})([0][13456789]|[1][012])(([0][1-9]|[12][\\d])|[3][0])([A-Z0-9]{3}))|(([A-ZÑ&]{4})([02468][048]|[13579][26])[0][2]([0][1-9]|[12][\\d])([A-Z0-9]{3}))|(([A-ZÑ&]{4})([0-9]{2})[0][2]([0][1-9]|[1][0-9]|[2][0-8])([A-Z0-9]{3}))$^(([A-ZÑ&]{4})([0-9]{2})([0][13578]|[1][02])(([0][1-9]|[12][\\d])|[3][01]))|(([A-ZÑ&]{4})([0-9]{2})([0][13456789]|[1][012])(([0][1-9]|[12][\\d])|[3][0]))|(([A-ZÑ&]{4})([02468][048]|[13579][26])[0][2]([0][1-9]|[12][\\d]))|(([A-ZÑ&]{4})([0-9]{2})[0][2]([0][1-9]|[1][0-9]|[2][0-8]))$").test(e)}_validateIne(e){return RegExp("^[0-9]{13}$").test(e)}_validateElectorKey(e){return RegExp("^[A-Za-z0-9]{18}$").test(e)}_validateRegisterYear(e){return RegExp("^[0-9-]{7}$").test(e)}_validateCurp(e){return RegExp("[A-Z]{4}[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[HM]{1}(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[B-DF-HJ-NP-TV-Z]{3}[0-9A-Z]{1}[0-9]{1}$").test(e)}_onAllDataRetrieved(e,t,i,a,s){const r=this._getIdentityDocument(e.identityDocuments,"CURP"),o=this._getIdentityDocument(e.identityDocuments,"RFC"),n={fullName:this._getFullName(e)||"",phone:this._getContactType(t.contactDetails,"MOBILE_NUMBER"),email:this._getContactType(t.contactDetails,"EMAIL"),birthDate:e.birthData.birthDate,gender:this._getGender(e.gender),nationality:this._getNationality(e.nationalities),state:this._getState(i,r.documentNumber),curp:r.documentNumber,rfc:o.documentNumber,civilStatusValues:a,activities:s,rfcNoHomoclave:r.documentNumber.substring(0,10)};this.curp=r,this._fireEvent("set-personal-data",n)}_getContactType(e,t){return(e.find((e=>e.contactType.id===t))||{}).contact||""}_getFullName(e){const t=`${e.firstName} ${e.lastName}`;return e.secondLastName?`${t} ${e.secondLastName}`:t}_getGender(e){const t=(e.id||"").toLowerCase();return t?`upgrade-account-multistep-personal-info-gender-${t}`:""}_getNationality(e){const t=e.find((e=>"MEX"===e.id));return t?t.description:e[0].description}_getIdentityDocument(e,t){const i=t||"RFC",a=(e||[]).find((e=>(e||{}).documentType?e.documentType.id===i:""));return a&&a.documentNumber?a:{}}_getState(e=[],t=""){const i=t?t.slice(11,13).toUpperCase():"",a=e.find((e=>e.id===i)),s=a?this._getObjectDesciption(a):"";return s?s.slice(0,20).trim():s}onMaritalStatusSuccess(e){const t=[];this.services=this._updateServicesStatus(this.services,"getMaritalStatus","OK");for(let i=0;i<e.length;i++){const a=e[i],s=e[i].id,r=this._getObjectDesciption(a);t.push({value:r,id:s})}this.civilStatusValues=this._getCivilStatusValues(t),this._fireEvent("send-civil-status-list",this._getCivilStatusList(t))}onMaritalStatusError(){this.services=this._updateServicesStatus(this.services,"getMaritalStatus","KO")}_getCivilStatusList(e){return e.map((e=>({value:e.id,label:e.value})))}_getCivilStatusValues(e){const t=[{id:"B",value:"MARRIED_WITH_SEPARATED_PROPERTY"},{id:"C",value:"MARRIED_WITHOUT_SEPARATED_PROPERTY"},{id:"D",value:"DIVORCED"},{id:"S",value:"SINGLE"},{id:"U",value:"COHABITANT"},{id:"V",value:"WIDOWED"},{id:"X",value:"SEPARATED"}];return e.map((e=>({value:t.find((t=>e.id===t.id)).value,label:e.value})))}_getCivilStatusValue(e){return[{id:"B",value:"MARRIED_WITH_SEPARATED_PROPERTY"},{id:"C",value:"MARRIED_WITHOUT_SEPARATED_PROPERTY"},{id:"D",value:"DIVORCED"},{id:"S",value:"SINGLE"},{id:"U",value:"COHABITANT"},{id:"V",value:"WIDOWED"},{id:"X",value:"SEPARATED"}].find((t=>e===t.id)).value}_getOccupationsList(e=[]){return e.map((e=>this._getObjectDesciption(e)))}_getObjectDesciption(e){return e.descriptions.find((e=>"SPA"===e.language)).value}manageValidateCredentialsInvalidFields(){this.invalidIne=!1}_onChangeOccupations(e=[],t){this.activities={occupations:e.map((e=>{const i=[];for(const a of Object.keys(t))for(const s of Object.keys(t[a]))s===e.id&&i.push({id:a,name:t[a][s]});return{id:e.id,name:this._getObjectDesciption(e),activities:i}}))},this._fireEvent("send-occupations-list",this._getOccupationsList(e))}setSelfieImage(e){this.shadowRoot.getElementById("photoConverter").getImageFile({url:e.url,name:e.file.name,id:"selfie"})}_onSelfieConverterSuccess(e){this._selfie=e.detail}}customElements.define(wt.is,wt),customElements.define(Pe.is,Pe);class Gt extends(C(m(A))){static get is(){return"bbva-options-media-capture-upgrade-account"}static get properties(){return{headerText:{type:String},paragraph:{type:String},firstOptionLabel:{type:String},secondOptionLabel:{type:String},linkIcon:{type:String,attribute:"link-icon"},modalOpen:{type:Boolean,reflect:!0}}}static get scopedElements(){const e=[le,q,Le,g];return Gt.scopedElementsFromClasses(e)}constructor(){super(),this.headerText="",this.paragraph="",this.firstOptionLabel="",this.secondOptionLabel="",this.linkIcon=Ae(),this.modalOpen=!1,this.addEventListener("help-modal-close",(()=>this.close()),!0)}static get styles(){return[Ne,l("bbva-modal-upgrade-account-shared-styles")]}render(){return d`
    <bbva-help-modal
      id="helpModal"
      full-height
      fixed-footer
      i-o-s-fixed-header
      accessibility-text-icon-right-primary="${this.t("upgrade-account-modal-accessibility-close")}"
      header-text="${this.t(this.headerText)}"
      ?visible="${this.modalOpen}">
      <div class="content" slot="slot-content">
        <bbva-text text="${this.t(this.paragraph)}" size="S"></bbva-text>
        <bbva-list-link header-text="${this.t(this.firstOptionLabel)}" link-icon="${this.linkIcon}" @list-link-click="${this._firstSelected}" aria-label="${this.t(this.firstOptionLabel)}"></bbva-list-link>
        <bbva-divider></bbva-divider>
        <bbva-list-link header-text="${this.t(this.secondOptionLabel)}" link-icon="${this.linkIcon}" @list-link-click="${this._secondSelected}" aria-label="${this.t(this.secondOptionLabel)}"></bbva-list-link>
      </div>
    </bbva-help-modal>
    `}_firstSelected(){this._fireEvent("options-media-capture-first-selected")}_secondSelected(){this._fireEvent("options-media-capture-second-selected")}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}open(){this.modalOpen=!0}close(){this.modalOpen=!1}}customElements.define(Gt.is,Gt);class Ht extends(m(A)){static get is(){return"bbva-custom-modal-info-upgrade-account"}static get properties(){return{modalHeader:{type:String},buttonText:{type:String},_open:{type:Boolean,attribute:"open",reflect:!0},config:{type:Object}}}constructor(){super(),this.modalHeader="",this.buttonText="",this._open=!1,this.imageWithTextModal=!1,this.addEventListener("help-modal-close",(()=>this.close()),!0),this.config={type:"",values:[]}}static get styles(){return[Ne,l("bbva-modal-upgrade-account-shared-styles")]}render(){return d`
    <bbva-help-modal
      id="helpModal"
      title="${this.t(this.modalHeader)}"
      accessibility-text-icon-right-primary="${this.t("upgrade-account-modal-accessibility-close")}"
      full-height
      fixed-footer
      i-o-s-fixed-header
      header-text="${this.t(this.modalHeader)}"
      button-text="${this.t(this.buttonText)}"
      ?visible="${this._open}">
      <div class="content" slot="slot-content" role="document" tabindex="0">
        ${this._renderImageWithText()}
        ${this._renderParagraphs()}
      </div>
    </bbva-help-modal>
    `}_renderImageWithText(){return"composition"===this.config.type?this.config.values.map((e=>d`
      <div class="${e.class}">
        <bbva-text alignment="${e.align}" text="${this.t(e.paragraph)}" size="S"></bbva-text>
        <bbva-panel-info style="${Ht._setImageSizes(e.imageSize)}" image="${e.image}"></bbva-panel-info>
        <bbva-text alignment="${e.align}" text="${e.caption?this.t(e.caption):""}" size="S"></bbva-text>
      </div>
    `)):""}static _setImageSizes(e){return`--bbva-panel-info-image-width: ${e}`}_renderParagraphs(){return"paragraphs"===this.config.type?this.config.values.map((e=>d`
      <bbva-text alignment="${e.align}" text="${this.t(e.paragraph)}" size="S"></bbva-text>
    `)):""}open(){this._open=!0}close(){this._open=!1}}customElements.define(Ht.is,Ht);class Qt extends(Ue(A)){static get is(){return"bbva-analytic-manager-upgrade-account-customer"}static get properties(){return{level3:{type:Object},level4:{type:Object},errorPage:{type:Object}}}constructor(){super(),this.level3=void 0,this.level4=void 0,this.errorPage=void 0}analyticNextPersonalData(){this._fireEvent("analytic_next_personal_data")}analyticErrorPersonalData(e){if(this.level3=e?e["http-status"]:204,this.level4=e?e["error-message"]:"Does not return results",this._level4Substring(),404===this.level3||204===this.level3){const e={level3:`error datos personales ${this.level3}`,level4:this.level4.toLowerCase(),errorPage:this.level4.toLowerCase()};this._fireEvent("error-analytic-step-personal-data",e)}}_level4Substring(){if(this.lavel4&&this.lavel4.search(":")>0){const e=this.errorPage.search(":");this.level4=this.level4.substring(0,e)}}analyticErrorgetCustomer(e){if(this.level3=e["http-status"],this.level4=e["error-message"],this.errorPage=e["error-message"],this._level4Substring(),400===this.level3||404===this.level3){const e={level3:`error datos personales ${this.level3}`,level4:this.level4.toLowerCase(),errorPage:this.level4.toLowerCase()};this._fireEvent("error-analytic-step-personal-data",e)}}getanalitycListVerificationError(e){const t="PROCESSING"===e.status.id?"la solicitud esta siendo procesada":"solicitud creada pero se necesitan datos adicionales";this.level3=e.status?200:400,this.level4=200!==this.level3?"el cliente no ha pasado las validaciones":t,this._level4Substring(),200!==this.level3&&404!==this.level3&&400!==this.level3&&403!==this.level3||this._fireEvent("error-analytic-step-personal-data",{level3:`error validacion identidad ${this.level3}`,level4:this.level4.toLowerCase(),errorPage:this.level4.toLowerCase()})}errorAnalitycsCredentialData(e){this.level3=e.messages[0]&&e.messages[0].code?400:500,this.level4=e.messages[0].message,this._level4Substring(),400!==this.level3&&500!==this.level3||this._fireEvent("error-analytic-step-personal-data",{level3:`error documentos ${this.level3}`,level4:this.level4.toLowerCase(),errorPage:this.level4.toLowerCase()})}}customElements.define(Qt.is,Qt);
