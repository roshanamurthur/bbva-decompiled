import{z as e,aX as t,an as a,L as s,ak as i,h as o,aY as r,aV as n,ci as d,dF as l,dG as p,dH as c,cU as m,aN as h,dI as u,cn as b,aU as f,i as g}from"./952f98a9.js";import{bs as _,bf as v,bg as y,aI as C,aH as x,R as S}from"./7f3d7ca9.js";import{L as $,D as T,O as F,aw as P,G as I,P as A,R as E,M as D,T as k,V as w,e as B,h as M,f as O,x as N,N as L,z as R,K as j,H as z,E as U,I as q,ap as Z}from"./216055dc.js";import{B as H}from"./cff03f17.js";import{B as V}from"./c281d121.js";import{B as W}from"./1979ce36.js";import"./f89161ad.js";import{B as Y}from"./7f28d0e7.js";import{b as G,a as X,B as K}from"./e3d898b2.js";import{b as J,B as Q}from"./30ef6f1f.js";import"./7b36b381.js";import"./2dde318b.js";import"./c6217679.js";import"./010d8aa7.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./7d773f57.js";import"./d2484b66.js";import"./4656db6d.js";import"./854beed0.js";import"./84dff06e.js";import"./b40ec134.js";class ee extends H{static get is(){return"bbva-global-catalog-document-types-api-dm"}static get properties(){return{catalogDocumentTypes:{type:Array,attribute:!1}}}constructor(){super(),this.catalogDocumentTypes=[]}resetCatalogDocumentTypes(){this.catalogDocumentTypes=[]}getCatalogDocumentTypes(e={}){if(Object.keys(this.catalogDocumentTypes).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"catalog-document-types-api-dm-fetch",errorFireEventHandler:"catalog-document-types-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CatalogDocumentTypes`,this._getBgadp(s))}_getBgadp(e){return{getCatalogDocumentTypesV0:()=>new _(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var te=e`
.list-simple-margin-s {
  display: flex;
  justify-content: space-between;
  margin-bottom: 0.5rem;
}
.list-simple-margin-s *:last-child {
  text-align: right;
}

.list-simple-margin-l {
  display: flex;
  justify-content: space-between;
  margin-bottom: 1rem;
}
.list-simple-margin-l *:last-child {
  text-align: right;
}
`;class ae extends(t($(a(s)))){static get is(){return"list-simple"}static get scopedElements(){const e=[I,A];return ae.scopedElementsFromClasses(e)}static get styles(){return[te,T.primary,F.primary,F.secondary,i("list-simple-shared-styles")]}static get properties(){return{items:{type:Array},customMargin:{type:String,attribute:"custom-margin"}}}constructor(){super(),this.items=[],this.customMargin="s"}render(){return o`
      ${P(this.items,(e=>o`
          <div id="listSimple" class="list-simple-margin-${this.customMargin??"s"}">
            <bbva-type-text size="S" text="${e.name}" unset> </bbva-type-text>
            <bbva-type-text
              size="S" 
              text="${e.value&&e.value.text||""}"
              font-weight="${r.fontWeight40}"
              unset
            ></bbva-type-text>
          </div>
        `))}
    `}}const se=e=>e?e.toLowerCase().replace(/\b\p{L}+/gu,((e,t)=>0!==t&&/^(de|la|el|y|en|del|los|las|a|of|the|and|in)$/i.test(e)?e:e.charAt(0).toUpperCase()+e.slice(1))):"",ie=(e,t,a)=>{t.stopPropagation(),a._dispatchCustomEvent("bbva-feature-profile-postal-address-management-generic-modal-click",{modalId:a.config.id,button:e})};var oe=e`
:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  z-index: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal].modal-multistep {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-padding-bottom: 0;
  position: relative;
  overflow: unset;
}

.btn-step {
  margin: 1rem 1rem 1.5rem;
}

.btn-default {
  margin: 1rem 0 1.5rem;
}

.default-content {
  padding: 0 !important;
}

.confirmation-area {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding-top: 1.5rem;
  padding-bottom: 1.5rem;
  padding-left: 1rem;
  padding-right: 1rem;
  background-color: var(--_primary-alt-confirm-bg-color);
}

.list-container {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 0;
}

.file-title {
  display: flex;
  justify-content: space-between;
  align-items: center;
  cursor: pointer;
  max-height: 1.375rem;
}

.file-subtitle {
  margin-top: 0.5rem;
}

.file-row {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 2rem 0;
}

.action-container:active {
  background-color: var(--_primary-bg-color);
}

.file-row {
  margin-bottom: 3.5rem;
}

.file-content {
  display: flex;
  flex-direction: column;
  width: 100%;
}

.alternative-color {
  color: var(--_primary-text-color);
}

.form-ocr {
  display: flex;
  flex-direction: column;
  gap: 0.625rem;
  padding-top: 0.625rem;
  padding-bottom: 0.9375rem;
}

[data-tag-name=bbva-expandable-multistep] {
  padding-bottom: 0 !important;
}

[data-tag-name=bbva-type-text] {
  color: inherit !important;
}

[data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: var(--_primary-text-color);
}

.first-step {
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}
`,re=e`
:host {
  --_primary-bg-color: var(
    --proof-address-step--_ambient--_primary-bg-color,
     ${E("colorPrimarySurfaceAmbientDefault",{colorPrimarySurfaceAmbientDefault:"#F4F4F4"})});
  --_primary-text-color: var(
    --proof-address-step--_ambient--_primary-text-color,
    ${E("colorPrimaryLinkMainHover",{colorPrimaryLinkMainHover:"#1464A5"})});
  --_primary-alt-confirm-bg-color: var(
    --bbva-feature-postal-address-management--_ambient--_primary-alt-confirm-background-color,
     ${E("colorPrimarySurfaceAmbientDefault",{colorPrimarySurfaceAmbientDefault:"#F4F4F4"})});
}
`;class ne extends(D($(a(s)))){static get is(){return"address-multistep-modal"}static get styles(){return[oe,re,k.primary,k.secondary,w.primary,w.secondary,G.primary,G.secondary,J.primaryAlt,i("address-multistep-modal-shared-styles")]}static get scopedElements(){const e=[B,M,v,y,O,I,X,K,N,p,Q,ae];return ne.scopedElementsFromClasses(e)}static get properties(){return{entryPoint:{type:String,attribute:"entry-point"},_stepCompleted:{type:Boolean,state:!0},selectOptions:{type:Array},optionSelected:{type:String,attribute:"option-selected"},loading:{type:Boolean,attribute:"is-loading"},fileLoaded:{type:Boolean,attribute:"file-loaded"},fileUploaded:{type:Object},fileChoosen:{type:Boolean,attribute:"file-choosen"},visible:{type:Boolean,attribute:"is-visible"},colonies:{type:Array},objTownState:{type:Object},_scrollToStepIndex:{type:Number,state:!0},_stepsToReset:{type:Array,state:!0},_addressForm:{type:Object,state:!0},_activeStep:{type:String,state:!0},_fillFormOCR:{type:Boolean,state:!0},_firstRequestZipCode:{type:Boolean,state:!0},_invalidZipCodeCollection:{type:Array,state:!0},addressProceedings:{type:Array},_disableBtnContinue:{type:Boolean,state:!0},_firstInteractionDispatched:{type:Boolean,state:!0},interactions:{type:Object},userProcess:{type:String,attribute:"user-process"},zipCodeDoesNotExist:{type:Boolean,attribute:"zip-code-does-not-exist"},_showStepButton:{type:Boolean,state:!0},_summaryDetail:{type:Array,state:!0},deleteFile:{type:Boolean,attribute:"delete-file"},documentTypeLabel:{type:String,attribute:"document-type-label"},rollBackFlag:{type:Boolean,attribute:"roll-back-flag"},resetForm:{type:Boolean,attribute:"reset-form"},_isAddressProceedings:{type:Boolean,state:!0},_isUpdateAddressProceedings:{type:Boolean,state:!0},_isZipCode:{type:Boolean,state:!0},_areColonies:{type:Boolean,state:!0},_isTownAndState:{type:Boolean,state:!0},preLoadedData:{type:Object},proceedingsModifyFlag:{type:Boolean,attribute:"proceedings-modify-flag"},_coloniesFormValue:{type:String,state:!0}}}constructor(){super(),this.entryPoint="",this.visible=!1,this._stepCompleted=!1,this._scrollToStepIndex=-1,this._stepsToReset=[],this._showStepButton=!1,this.deleteFile=!1,this._summaryDetail=[],this.loading=!1,this.fileLoaded=!1,this.fileUploaded={},this._addressForm={street:"",exteriorNumber:"",interiorNumber:"",postalCode:"",colony:"",town:"",state:""},this.rollBackFlag=!1,this.colonies=[],this.objTownState={},this._activeStep="",this._fillFormOCR=!1,this._firstRequestZipCode=!1,this._invalidZipCodeCollection=["00000"],this.addressProceedings=[],this._disableBtnContinue=!1,this.interactions={},this._firstInteractionDispatched=!1,this.userProcess="",this.zipCodeDoesNotExist=!1,this.documentTypeLabel="",this.selectOptions=[],this.resetForm=!1,this._isAddressProceedings=!1,this._isUpdateAddressProceedings=!1,this._isZipCode=!1,this._areColonies=!1,this._isTownAndState=!1,this.proceedingsModifyFlag=!1,this._preLoadedData={},this._coloniesFormValue=""}updated(e){super.updated(e),this._setValidations(e),this._isAddressProceedings&&this._handleOCRData(this.addressProceedings),this._isUpdateAddressProceedings&&(this._fillFormOCR=!0),this._isZipCode&&this._requestPlacesByZipCode(this._addressForm.postalCode),this._areColonies&&this._handleColonies(),this._isTownAndState&&this._handleTownAndState(),this.zipCodeDoesNotExist&&this._showInvalidPostalCode(),this.deleteFile&&this._deleteFileLoaded(),this.rollBackFlag&&this._handleRollBackFlag(),this.resetForm&&this._handleResetForm(),this.proceedingsModifyFlag&&(this.proceedingsModifyFlag=!1,this._buildProofSummaryData(this.preLoadedData),this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-proceedings-modify-flag")),this._btnDefaultDisabled()}_setValidations(e){this._isAddressProceedings=e.has("addressProceedings")&&this.addressProceedings.length,this._isUpdateAddressProceedings=e.has("entryPoint")&&"updateAddressProceedings"===this.entryPoint,this._isZipCode=this._firstRequestZipCode&&this._fillFormOCR,this._areColonies=0!==this.colonies.length&&e.has("colonies"),this._isTownAndState=e.has("objTownState")&&Object.values(this.objTownState).length}_handleTownAndState(){this._addressForm.colony=this.objTownState&&this.objTownState.name,this._addressForm.town=this.objTownState&&this.objTownState.geographicPlaceTypes&&this.objTownState.geographicPlaceTypes.find((e=>"MUNICIPALITY"===e.id)).value,this._addressForm.state=this.objTownState&&this.objTownState.state&&this.objTownState.state.name}_handleRollBackFlag(){this.rollBackFlag=!1,this.optionSelected="",this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-roll-back-flag")}_handleResetForm(){this._resetForm(),this.resetForm=!1,this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-reset-form-flag")}_handleColonies(){const e=this.colonies.find((e=>e&&e.name===(this._addressForm&&this._addressForm.colony)));this._handleIdColony(e&&e.id)}_showInvalidPostalCode(){this._disableBtnContinue=!0,this._setInvalidZipCodeInputState("errorNotExist"),this._invalidZipCodeCollection.push(this._addressForm.postalCode)}_handleOCRData(e){if(!e||"typeIdentificationProceedings"===this.entryPoint)return;const t=e.map((e=>[this._toCamelCase(e.componentTypes.find(Boolean).toLowerCase()||""),e.code||e.name]));this._addressForm=Object.fromEntries(t),Object.assign(this._addressForm,{town:"",state:""}),this._addressForm.colony=this._normalizeEsAccent(this._addressForm.colony).toUpperCase(),this._coloniesFormValue=this._addressForm.colony,this._firstRequestZipCode=Boolean(5===this._addressForm.postalCode.length&&!this._invalidZipCodeCollection.some((e=>e===this._addressForm.postalCode)));this._invalidZipCodeCollection.some((e=>e===this._addressForm.postalCode))&&(this._setInvalidZipCodeInputState("errorNotExist"),this._disableBtnContinue=!0)}_toCamelCase(e){return e.replace(/_([a-z])/g,((e,t)=>t.toUpperCase()))}_normalizeEsAccent(e){return e.normalize("NFD").replace(/[\u0300-\u036f]/g,"")}_currentStep(e){e&&(this._activeStep=e.id)}_completeStep({target:e}){const t=["typeIdentificationProceedings","updateAddressProceedings"].includes(this.entryPoint),a="proofAddressSelector"===this._activeStep?"bbva-feature-postal-address-management-complete-step-type-receipt":"bbva-feature-postal-address-management-complete-step-form",s=this.shadowRoot.querySelector("currentAddressStep"!==e.id?"#proofAddressSelector":"#addressForm");if(this._showStepButton=!("currentAddressStep"!==e.id),"currentAddressStep"===e.id&&t)return this._firstItemInteraction(this.interactions.CONTINUE_INTERACTION),void this._handleSuccessButton();"proofAddressSelector"===this._activeStep?(this._buildProofSummaryData({optionSelected:this.documentTypeLabel,fileName:this.fileUploaded.name}),this._fillFormOCR=!0,this._dispatchCustomEvent("bbva-feature-postal-address-management-spinner-ocr")):s.dispatchEvent(new CustomEvent("complete",{detail:!0,bubbles:!0,composed:!0}));const i={typology:this.documentTypeLabel.toLowerCase(),process:this.userProcess,step:this.interactions.STEP_1};this._dispatchCustomEvent(a,i)}_getListActionLabel(){return"026"===this.optionSelected?this.t("bbva-feature-postal-address-management-upload-ine"):this.t("bbva-feature-postal-address-management-upload-document")}_validateSelection(e){this.optionSelected=e.detail.value,this._dispatchCustomEvent("bbva-feature-postal-address-management-document-type-selected",{documentId:this.optionSelected,documentTypes:this.selectOptions}),this.shadowRoot.querySelector("#proofSelect").requestUpdate()}_handleListActionClick(){(["typeIdentificationProceedings","updateAddressProceedings"].includes(this.entryPoint)||this.optionSelected&&!this.fileLoaded)&&this._dispatchCustomEvent("bbva-feature-postal-address-management-list-action-click","mediaSourceSelector")}_deleteFileLoaded(){this.fileChoosen=!1,this.fileLoaded=!1,this.fileUploaded={},this.deleteFile=!1,this._dispatchCustomEvent("bbva-feature-postal-address-management-delete-file-flag",!1)}_resetForm(){this._resetFormOnZipCode(),this._addressForm={street:"",exteriorNumber:"",interiorNumber:"",postalCode:"",colony:"",town:"",state:""},this._firstInteractionDispatched=!1}_askDeleteFile(){this.fileLoaded&&this._dispatchCustomEvent("bbva-feature-postal-address-management-delete-file",{modal:"half",config:"deleteWarning"})}_handleZipCode(e){const t=this._invalidZipCodeCollection.some((t=>t===e));if(e.length<5)return this._setInvalidZipCodeInputState("errorLength"),this._resetFormOnZipCode(),void(this.zipCodeDoesNotExist=!1);t?this._invalidZipdCode():this._requestPlacesByZipCode(e)}_invalidZipdCode(){this._setInvalidZipCodeInputState("errorNotExist"),this._resetFormOnZipCode(),this._disableBtnContinue=!0}_requestPlacesByZipCode(e){this._disableBtnContinue=!1,this._firstRequestZipCode=!1,this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-zip-code-send",e)}_validateColoniesFormSelection(e){this._handleIdColony(e.detail.value),this._coloniesFormValue=e.detail.value}async _resetFormOnZipCode(){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-reset-data-form",!0),this.colonies=[],this.objTownState={},this._addressForm.colony="",this._addressForm.town="",this._addressForm.state="",this._coloniesFormValue=""}_handleIdColony(e){e&&this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-id-colony-send",e)}_handleSuccessButton(){this._dispatchCustomEvent("bbva-feature-postal-address-management-set-address",{addressInfo:this._addressForm,documentInfo:this.fileUploaded,optionSelected:this.optionSelected})}_handleCloseButton(e){e.stopPropagation(),this._dispatchCustomEvent("bbva-feature-postal-address-management-operative-close",{modalId:"exitWarning",button:"times"})}_buildProofSummaryData(e){this._summaryDetail=[{name:this.t("bbva-feature-postal-address-management-summary-type-proof-address"),value:{text:e.optionSelected}},{name:this.t("bbva-feature-postal-address-management-summary-attachment-proof-address"),value:{text:e.fileName}}]}_btnDefaultDisabled(){this._disableBtnContinue=!(this._addressForm&&this._addressForm.street&&0!==this._addressForm.street.length&&this._addressForm&&this._addressForm.exteriorNumber&&0!==this._addressForm.exteriorNumber.length&&this._addressForm&&this._addressForm.postalCode&&5===this._addressForm.postalCode.length&&this._addressForm&&this._addressForm.colony&&0!==this._addressForm.colony.length&&this._addressForm&&this._addressForm.town&&0!==this._addressForm.town.length&&this._addressForm&&this._addressForm.state&&0!==this._addressForm.state.length)}_fillInputFormData(e){const{id:t,value:a}=e.target;this._addressForm[{zipCode:"postalCode",street:"street",externalNumber:"exteriorNumber",internalNumber:"interiorNumber"}[t]]=a,this.requestUpdate(),"zipCode"===t&&this._handleZipCode(a)}get _content(){return o`
        <bbva-expandable-multistep
          offset-bottom
          hide-disabled-steps
          scroll-to-step-index="${this._scrollToStepIndex}"
          step-selector="[data-tag-name='bbva-expandable-step']"
          .stepsToReset="${this._stepsToReset}"
          @expandable-multistep-specific-step-scroll="${({detail:e})=>{this._stepCompleted=e&&e.completed}}"
          @expandable-multistep-current-active-step="${({detail:e})=>this._currentStep(e)}"
          @expandable-step-edit-step="${()=>this._firstItemInteraction(this.interactions.MODIFY_RECIPIENT)}">
          <div slot="content">${this._steps}</div>
          <div class="confirmation-area" slot="confirmation">${this._confirmPanel}</div>
        </bbva-expandable-multistep>`}get _confirmPanel(){return o`
      <bbva-button-default
        id="confirmationButton"
        variant="positive"
        text="${this.t("bbva-feature-postal-address-management-continue-button")}"
        @click="${e=>this._handleSuccessButton(e)}"
        fullwidth>
      </bbva-button-default>`}get _steps(){return o`
    ${this._stepProofAddress} ${this._stepCurrentAddress}
    <div ambient="primary-alt" class="btn-step">${this._footerButton}</div>
    `}get _stepProofAddress(){return o`
      <bbva-expandable-step
        show-link
        id="proofAddressSelector"
        edit-label="${this.t("bbva-feature-postal-addrees-management-label-modify")}"
        open-edit-step
        @expandable-step-edit-step-prevent-open="${()=>{this._dispatchCustomEvent("bbva-feature-postal-address-management-edit-step")}}"
        header="${this.t("bbva-feature-postal-address-management-title-step-proof-address")}"
        disabled-target='.action'>
        <div class="content first-step">
          <div>
            <bbva-type-text id="instructions" text="${this.t("bbva-feature-postal-address-management-text-step-proof-address")}"></bbva-type-text>
            <div>${this._formSelect}</div>
            ${this.optionSelected?o`<div>${this._listAction}</div>`:n}
          </div>
        </div>
        <div class="summary" slot="summary">${this._getProofSummary}</div>
      </bbva-expandable-step>
    `}get _formSelect(){return o`
      <bbva-form-select
        id="proofSelect"
        ?disabled="${this.fileLoaded}"
        ambient="primary-alt"
        value="${this.optionSelected}"
        label="${this.t("bbva-feature-postal-addrees-management-label-select")}"
        info-message="${"007"===this.optionSelected?this.t("bbva-feature-postal-address-management-info-message"):""}"
        accessibility-icon-notification="${this.optionSelected&&"02"===this.optionSelected.id?"receipt-type":""}"
        @bbva-form-select-selected-item="${this._validateSelection}"
        @bbva-form-select-options-open="${this._proofAddressInteraction}">
        ${this.selectOptions&&this.selectOptions.map((e=>o`<bbva-form-option value='${e.id}'>${e.name}</bbva-form-option>`))}
      </bbva-form-select>
    `}_proofAddressInteraction({detail:e}){e.opened&&this._dispatchCustomEvent("bbva-feature-postal-address-management-select-receipt")}get _listAction(){return o`
      <div class="file-row action-container">
        <div class="file-content">
          <div class="file-title ${this.loading?"":"alternative-color"}">
            <bbva-type-text
              id="fileUploaded"
              @click="${this._handleListActionClick}"
              font-weight="${r.fontWeight40}"
              size="L"
              text="${this.fileChoosen?this.fileUploaded.name:this._getListActionLabel()}">
            </bbva-type-text>
            ${this._listActionIcon}
          </div>
          <div class="file-subtitle">
            <bbva-type-text
              tag="span"
              size="S"
              ambient="primary"
              text="${this.fileChoosen?this.fileUploaded.size:this.t("bbva-feature-postal-address-management-list-action-"+("026"===this.optionSelected?"comment-ine":"comment"))}"
              alignment="left"
              aria-disabled="false">
            </bbva-type-text>
          </div>
        </div>
      </div>
    `}get _listActionIcon(){return this.loading?o` <bbva-foundations-spinner with-mask="" size="32"> </bbva-foundations-spinner>`:o`
        <bbva-type-icon
          @click="${this._askDeleteFile}"
          icon="${this.fileLoaded?d():l()}"
          size="24">
        </bbva-type-icon>`}get _getProofSummary(){return o` <list-simple custom-margin="l" .items="${this._summaryDetail}"></list-simple> `}get _stepCurrentAddress(){return o`
      <bbva-expandable-step
        show-link
        id="addressForm"
        edit-label="${this.t("bbva-feature-postal-addrees-management-label-modify")}"
        header="${this.t("bbva-feature-postal-addrees-management-header-second-step")}"
        disabled-target=".action"
        @expandable-step-edit-step="${e=>{this._showStepButton=e.target.completed}}">
        <div class="content">
          <bbva-type-text text="${this.t("bbva-feature-postal-addrees-management-text-second-step")}"></bbva-type-text>
          <form class="form-ocr" id="form">
            ${this._streetFormTextTemplate}
            ${this._externalNumberFormTextTemplate}
            ${this._internalNumberFormTextTemplate}
            ${this._zipCodeFormNumberTemplate}
            ${this._coloniesFormSelectTemplate}
            ${this._colonySelectionDetailsTemplate}
          </form>
        </div>
        <div class="summary" slot="summary">
          ${this._getCurrentAddressStepSummary}
        </div>
      </bbva-expandable-step>
    `}get _footerButton(){return this._showStepButton?n:o`
    <div class="btn-default">
      <bbva-button-default
        id="${"proofAddressSelector"===this._activeStep?"proofStep":"currentAddressStep"}"
        fullwidth
        text="${this.t("bbva-feature-postal-address-management-continue-button")}"
        ?disabled="${"proofAddressSelector"===this._activeStep?!this.fileLoaded:this._disableBtnContinue}"
        @click="${this._completeStep}">
      </bbva-button-default>
    </div>
    `}get _streetFormTextTemplate(){return o`
      <bbva-form-input
        id="street"
        ambient="primary-alt"
        type="text"
        label="${this.t("bbva-feature-postal-address-management-street-input-label")}"
        required
        invalid
        value="${this._addressForm.street}"
        custom-update-value
        clear-accessible-text="${this.t("bbva-feature-postal-address-management-street-input-label")}"
        @form-input-value-change="${this._fillInputFormData}"
        @click="${()=>this._firstItemInteraction(this.interactions.STREET_INTERACTION)}">
      </bbva-form-input>
    `}get _externalNumberFormTextTemplate(){return o`
      <bbva-form-input
        id="externalNumber"
        ambient="primary-alt"
        type="text"
        invalid
        label="${this.t("bbva-feature-postal-address-management-external-number-input-label")}"
        value="${this._addressForm.exteriorNumber}"
        clear-accessible-text="${this.t("bbva-feature-postal-address-management-external-number-input-label")}"
        @form-input-value-change="${this._fillInputFormData}"
        @click="${()=>this._firstItemInteraction(this.interactions.EXT_NUMBER_INTERACTION)}"
        custom-update-value
        required>
      </bbva-form-input>`}get _internalNumberFormTextTemplate(){return o`
      <bbva-form-input
        id="internalNumber"
        ambient="primary-alt"
        type="text"
        label="${this.t("bbva-feature-postal-address-management-internal-number-input-label")}"
        value="${this._addressForm.interiorNumber}"
        clear-accessible-text="${this.t("bbva-feature-postal-address-management-internal-number-input-label")}"
        @form-input-value-change="${this._fillInputFormData}"
        @click="${()=>this._firstItemInteraction(this.interactions.INT_NUMBER_INTERACTION)}"
        custom-update-value>
      </bbva-form-input>`}get _zipCodeFormNumberTemplate(){return o`
      <bbva-form-input
        id="zipCode"
        ambient="primary-alt"
        type="text"
        label="${this.t("bbva-feature-postal-address-management-zip-code-input-label")}"
        mode-input="numeric"
        allowed-pattern="[0-9]"
        maxlength="5"
        required
        invalid
        value="${this._addressForm.postalCode}"
        clear-accessible-text="${this.t("bbva-feature-postal-address-management-zip-code-input-label")}"
        @form-input-value-change="${this._fillInputFormData}"
        @click="${()=>this._firstItemInteraction(this.interactions.ZIP_CODE_INTERACTION)}">
      </bbva-form-input>`}get _coloniesFormSelectTemplate(){const e=0===this.colonies.length;return o`
        <bbva-form-select
          id="colonyForm"
          value="${this._coloniesFormValue}"
          label="${this.t("bbva-feature-postal-address-management-colony-input-label")}"
          ?disabled="${e}"
          ambient="primary-alt"
          @click="${()=>this._firstItemInteraction(this.interactions.COLONY_INTERACTION)}"
          @bbva-form-select-selected-item="${this._validateColoniesFormSelection}">
          ${e?n:this.colonies.map((e=>o`
              <bbva-form-option value='${e.id}'
                ?selected="${e.name===this._coloniesFormValue??!1}">
                ${e.name}
              </bbva-form-option>`))}
        </bbva-form-select>`}get _colonySelectionDetailsTemplate(){return o`
      <bbva-form-input
        id="municipalityInput"
        ambient="primary-alt"
        type="text"
        label="${this.t("bbva-feature-postal-address-management-municipality-input-label")}"
        clear-accessible-text="${this.t("bbva-feature-postal-address-management-municipality-input-label")}"
        value="${this.objTownState&&this.objTownState.geographicPlaceTypes&&this.objTownState.geographicPlaceTypes.find((e=>"MUNICIPALITY"===e.id)).value||""}"
        disabled>
      </bbva-form-input>
      <bbva-form-input
        id="stateInput"
        ambient="primary-alt"
        type="text"
        label="${this.t("bbva-feature-postal-address-management-state-input-label")}"
        clear-accessible-text="${this.t("bbva-feature-postal-address-management-state-input-label")}"
        value="${this.objTownState&&this.objTownState.state&&this.objTownState.state.name||""}"
        disabled>
      </bbva-form-input>`}get _postalCodeInputElement(){return this.shadowRoot.querySelector("#zipCode")}async _setInvalidZipCodeInputState(e){const t={errorLength:this.t("bbva-feature-postal-address-management-error-length-zip-code"),errorNotExist:this.t("bbva-feature-postal-address-management-error-doesnot-exist-zip-code")};await this._postalCodeInputElement.updateComplete,this._postalCodeInputElement.errorMessage=t[e],this._postalCodeInputElement.invalid=!0,"errorLength"===e&&(this._postalCodeInputElement.autoValidate=!0)}get _getCurrentAddressStepSummary(){const{street:e,exteriorNumber:t,interiorNumber:a,postalCode:s,colony:i,town:r,state:n}=this._addressForm,d=[se(e),se(t),a?`- ${se(a)}`:null,s,se(i),se(r),se(n)].filter((e=>e));return d.length?o`${d.join(", ")}.`:o``}_firstItemInteraction(e){this._firstInteractionDispatched||(this._dispatchCustomEvent("bbva-feature-postal-address-management-first-interaction",e),this._firstInteractionDispatched=!0)}render(){return o`
      <bbva-help-modal
        class="modal-multistep"
        ambient="primary"
        full-height
        header-text="${this.t("bbva-feature-postal-address-management-multistep-header")}"
        ?visible="${this.visible}"
        hide-content-padding-top
        modal-type
        header-close-icon-aria-label="${this.t("bbva-feature-postal-addrees-management-btn-close")}">
        <div slot="slot-header" class="header-slot">
          <bbva-header-main
            id="multistepHeaderMain"
            close-icon-aria-label="${this.t("bbva-feature-postal-addrees-management-btn-close")}"
            variant="${this._stepCompleted?"modal-initial-secondary":"modal-initial"}"
            text="${this.t("bbva-feature-postal-address-management-multistep-header")}"
            @header-main-icon-click="${this._handleCloseButton}">
          </bbva-header-main>
        </div>
        <div slot="slot-content" tabindex="0">${this._content}</div>
      </bbva-help-modal>
    `}}var de=e`
:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  z-index: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal].full-modal {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-padding-bottom: 0;
  overflow: unset;
  --bbva-help-modal-footer-fixed-shadow: 0 !important;
}

ul {
  padding: 0;
}

li {
  list-style: none;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}

[data-tag-name=bbva-button-default] {
  margin-bottom: 1rem;
}

.content-slot {
  padding: 1rem;
}

.privacy {
  float: inline-start;
  margin-right: 0.5rem;
}

.panel-button {
  margin: 0.9375rem;
}

.button-fixed {
  margin: 1rem;
  position: absolute;
  bottom: 0;
  right: 0;
  left: 0;
}
`;class le extends(D($(a(s)))){static get is(){return"address-full-modal"}static get scopedElements(){const e=[B,j,I,N,z,x,O];return le.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,attribute:"is-visible"},config:{type:Object}}}constructor(){super(),this.visible=!1,this.config={}}updated(e){e.has("config")&&this.config&&this.config.headerText&&this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-modal-open",!(this.config&&this.config.headerText))}get _renderPanelPrivacity(){return Object.entries(this.config).length,o`
      <div>
        <div>
          <bbva-type-icon class="privacy" icon="${c()}"> </bbva-type-icon>
          <bbva-type-text
            tag="span"
            text="${this.t(this.config.privacyText||"")}"
            size="2XS"
          >
          </bbva-type-text>
        </div>
        <bbva-type-link id="privacyLink" @click="${e=>ie("link",e,this)}" size="2XS">
          ${this.t(this.config.privacyLink||"")}
        </bbva-type-link>
      </div>
    `}get _renderPanelButton(){return Object.entries(this.config).length,o`
      <div class="${this.config.classFull||""}">
        <bbva-button-default
          id="fullModalButton"
          variant="default"
          text="${this.t(this.config.buttonText||"")}"
          @click="${e=>ie("primary",e,this)}"
          fullwidth
        >
        </bbva-button-default>
        ${this.config.linkText?o`
              <bbva-type-link id="linkText" @click="${e=>ie("secondary",e,this)}" size="S">
                ${this.t(this.config.linkText||"")}
              </bbva-type-link>
            `:n}
        ${this.config.buttonLink?o`
              <bbva-button-default
                variant="link"
                @click="${e=>ie("secondary",e,this)}"
                fullwidth
                text="${this.t(this.config.buttonLink||"")}"
              ></bbva-button-default>
            `:n}
      </div>
    `}static get styles(){return[de,L.primary,R.primary,w.primary,w.secondary,C.primary,C.secondary,T.primary,T.secondary,k.primary,k.secondary,i("address-full-modal-shared-styles")]}get _renderMicroilustration(){var e;return null!==(e=this.config)&&void 0!==e&&e.microillustration?o`
    <bbva-clip-microillustration 
    size="M" 
    microillustration="${this.config.microillustration}">
    </bbva-clip-microillustration>`:n}render(){return Object.entries(this.config).length,o`
      <bbva-help-modal
        modal-type=""
        class="full-modal"
        ambient="primary"
        full-height
        header-text="${this.t(this.config.headerText||"")}"
        ?visible="${this.visible}"
        fixed-footer
        hide-content-padding-top
        header-close-icon-aria-label="${this.t("bbva-feature-postal-addrees-management-btn-close")}"
        @help-modal-transitionend="${({detail:e})=>this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-full-modal-visible-change",e)}"
        @help-modal-header-click="${e=>ie("times",e,this)}"
      >
        <div slot="slot-content" class="content-slot">
        ${this._renderMicroilustration}
          <bbva-type-text id="fullModalTitle" class="${this.t(this.config.class||"")}" text="${this.t(this.config.title||"")}" size="3XL" font-weight="${r.fontWeight50}">
          </bbva-type-text>
          ${this.config.description?o`
                <bbva-type-text
                  text="${this.t(this.config.description||"")}"
                  size="S"
                >
                </bbva-type-text>
              `:n}
          ${this.config.bullets?o`
                <ul id="bulletList" class="${this.config.class||""}" >
                  ${P(this.config.bullets||"",((e,t)=>o`
                      <li id="bullet${t+1}Item">
                        <bbva-list-bullet>${this.t(e)}</bbva-list-bullet>
                      </li>
                    `))}
                </ul>
              `:n}
          ${this.config.fotter?o`
                <bbva-type-text text="${this.t(this.config.fotter||"")}" size="S">
                </bbva-type-text>
              `:n}
          ${this.config.privacyText?o` ${this._renderPanelPrivacity} `:n}
        </div>

        <div slot="slot-footer" class="slot-footer">${this._renderPanelButton}</div>
      </bbva-help-modal>
    `}}var pe=e`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-type-icon] {
  margin-bottom: 1rem;
}
[data-tag-name=bbva-type-icon][mode=warning] {
  --bbva-type-icon--custom--primary-ambient--color: var(--_primary-alt-support-warning-color);
}
[data-tag-name=bbva-type-icon][mode=error] {
  --bbva-type-icon--custom--primary-ambient--color: var(--_primary-alt-support-error-color) ;
}

[data-tag-name=bbva-type-text] {
  margin-bottom: 0.25rem;
}

.instructions {
  margin-top: 1rem;
}
`,ce=e`
:host {
  --_primary-alt-support-warning-color: var(
    --bbva-feature-postal-address-management--_ambient--_primary-alt-support-warning-color,
      ${E("colorPrimaryAltSupportWarningDefault",{colorPrimaryAltSupportWarningDefault:"#685219"})});
  --_primary-alt-support-error-color: var(
    --bbva-feature-postal-address-management--_ambient--_primary-alt-support-error-color,
     ${E("colorPrimaryAltSupportErrorDefault",{colorPrimaryAltSupportErrorDefault:"#B92A45"})});
}
`;class me extends(D($(a(s)))){static get is(){return"address-half-modal"}static get scopedElements(){const e=[B,I,N,z,q];return me.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},config:{type:Object}}}constructor(){super(),this.visible=!1,this.config={}}updated(e){e.has("config")&&this.config&&this.config.headerText&&this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-modal-open",!(this.config&&this.config.headerText))}static get styles(){return[pe,ce,T.secondary,T.primary,k.primary,k.secondary,R.primary,R.secondary,U.primary,U.secondary,i("address-half-modal-shared-styles")]}_handleModalStateChange(e){e.stopPropagation(),this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-half-modal-change",e.detail.visible)}_getIcon(e){return{warning:m(),error:h()}[e]}get _getMediaSourceSelectors(){return o`
      <div class="content" slot="slot-content">
      <bbva-type-text id="mediaSourceInstructions" size="S" text="${this.t("bbva-feature-postal-address-management-upload-file-suggestion")}"></bbva-type-text>
      <bbva-type-link id="linkCamera" icon="${u()}"
        @click="${()=>this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-half-modal-upload-file","camera")}">
        ${this.t("bbva-feature-postal-address-management-upload-file-camera")}
      </bbva-type-link>
      <bbva-divider-default> </bbva-divider-default>
      <bbva-type-link id="linkFile" icon="${b()}"
        @click="${()=>this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-half-modal-upload-file","photo-library")}">
        ${this.t("bbva-feature-postal-address-management-upload-file-gallery")}
      </bbva-type-link>
      <bbva-divider-default> </bbva-divider-default>
      <bbva-type-link id="linkPdf" icon="${f()}"
        @click="${()=>this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-half-modal-upload-file","pdf")}">
        ${this.t("bbva-feature-postal-address-management-upload-file-pdf")}
      </bbva-type-link>
      </div>
    `}get _getHalfModalsGenerals(){return Object.entries(this.config).length,o`
      <div slot="slot-content">
        ${this.config.type?o`<bbva-type-icon
            size="24"
            mode="${this.config.type}"
            icon="${this._getIcon(this.config.type)}"
          ></bbva-type-icon>`:n}
        <bbva-type-text id="messageText" unset size="S" text="${this.config.messageText}"></bbva-type-text>
        ${this.config.instructions?o`<bbva-type-text
            id="privacyInstructions"
            unset
            class="instructions"
            size="S"
            text="${this.config.instructions}"
          ></bbva-type-text>`:n}
      </div>`}render(){return this.config.headerText?o`
      <bbva-help-modal
        id="halfHelpModal"
        ?visible="${this.visible}"
        header-text="${this.config.headerText}"
        title-icon="${this.config.titleIcon||""}"
        modal-type="${this.modalType||""}"
        body-text="${this.t(this.config.bodyText||"")}"
        button-text="${g(this.t(this.config.buttonText||""))}"
        subtitle-text="${this.t(this.config.subtitleText||"")}"
        title-text="${this.t(this.config.titleText||"")}"
        link-text="${g(this.t(this.config.linkText||""))}"
        ?full-height="${this.config.fullHeight||""}"
        hide-content-padding-top
        ambient="primary"
        ?fixed-footer="${this.config.fixedFooter||""}"
        header-close-icon-aria-label="${this.t("bbva-feature-postal-addrees-management-btn-close")}"
        @modal-state-change="${this._handleModalStateChange}"
        @help-modal-transitionend="${({detail:e})=>this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-half-modal-visible-change",e)}"
        @help-modal-footer-button-click="${e=>ie("primary",e,this)}"
        @help-modal-header-click="${e=>ie("header",e,this)}"
        @help-modal-footer-link-click="${e=>ie("secondary",e,this)}">
        ${this.config.selectors?this._getMediaSourceSelectors:this._getHalfModalsGenerals}
      </bbva-help-modal>
    `:n}}var he=e`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.toast-size {
  width: 100%;
  padding: 1rem;
}

.list-container {
  display: flex;
  justify-content: space-between;
}
.list-container *:last-child {
  text-align: right;
}
`;class ue extends(D($(a(s)))){static get scopedElements(){const e=[B,j,I,Z,ae];return ue.scopedElementsFromClasses(e)}static get is(){return"address-success-modal"}static get properties(){return{customerInfo:{type:Array},visible:{type:Boolean,attribute:"is-visible"},userEmail:{type:String,attribute:"user-email"}}}constructor(){super(),this.visible=!1,this.customerInfo=[],this.userEmail=""}updated(e){e.has("customerInfo")&&this.customerInfo.length>0&&this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-modal-open",!this.customerInfo)}static get styles(){return[he,T.primary,T.secondary,L.primary,L.secondary,i("address-success-modal-shared-styles")]}_handleCloseButton(e){e.stopPropagation(),this._dispatchCustomEvent("feature-postal-address-success-modal-close",{modalId:this.config.id})}render(){return this.customerInfo.length,o`
      <bbva-help-modal
        modal-type
        class="full-modal"
        full-height
        ambient="primary"
        header-text="${this.t("bbva-feature-postal-address-management-header-text")}"
        ?visible="${this.visible}"
        @help-modal-transitionend="${({detail:e})=>this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-success-modal-visible-change",e)}"
        @help-modal-header-click="${this._handleCloseButton}"
        hide-content-padding-top
        header-close-icon-aria-label="${this.t("bbva-feature-postal-addrees-management-btn-close")}">
        <div slot="slot-content" class="content-slot content-success" tabindex="0">
        <bbva-clip-microillustration size="M" microillustration="pending">
        </bbva-clip-microillustration>
        <bbva-type-text
          text="${this.t("bbva-feature-postal-address-management-validate-document")}"
          size="3XL"
          font-weight="${r.fontWeight50}">
        </bbva-type-text>
        <list-simple .items=${this.customerInfo}></list-simple>
        <bbva-notification-toast pusher ?show="${this.visible}" class="toast-size">
          <bbva-type-text ambient="primary" size="S"
            text='${this.t("bbva-feature-postal-address-management-get-ticket-on-mail")}'
            unset>
          </bbva-type-text>
          <bbva-type-text ambient="primary" size="S" text="${this.userEmail}" font-weight="${r.fontWeight40}"
            unset>
          </bbva-type-text>
        </bbva-notification-toast>
        <bbva-notification-toast pusher ?show="${this.visible}" class="toast-size">
          <bbva-type-text ambient="primary" size="S"
            text='${this.t("bbva-feature-postal-address-management-info-validate-document")}'
            unset>
          </bbva-type-text>
        </bbva-notification-toast>
      </bbva-help-modal>
    `}}const be={onboardingInfo:{id:"onboardingInfo",class:"onboarding-info",classFull:"panel-button",headerText:"bbva-feature-postal-address-management-header",microillustration:"info",title:"bbva-feature-postal-address-management-onboarding-title",description:"bbva-feature-postal-address-management-onboarding-description",bullets:["bbva-feature-postal-address-management-voucher-1","bbva-feature-postal-address-management-voucher-2","bbva-feature-postal-address-management-voucher-3"],fotter:"bbva-feature-postal-address-management-onboarding-fotter",buttonText:"bbva-feature-postal-address-management-continue-button",linkText:"bbva-feature-postal-address-management-link-button",privacyText:"bbva-feature-postal-address-management-text-privacy",privacyLink:"bbva-feature-postal-address-management-link-privacy"},photoRecommendations:{id:"photoRecommendations",class:"photo-recommendations",classFull:"button-fixed",headerText:"bbva-feature-postal-address-management-recommendations-header",microillustration:"camera",title:"bbva-feature-postal-address-management-recommendations-title",bullets:["bbva-feature-postal-address-management-recommendations-1","bbva-feature-postal-address-management-recommendations-2"],buttonText:"bbva-feature-postal-address-management-continue-button"},incompleteAddress:{id:3,classFull:"button-fixed",headerText:"bbva-feature-postal-address-management-header",microillustration:"verifieddocument",title:"bbva-feature-postal-address-management-incomplete-address-title",description:"bbva-feature-postal-address-management-incomplete-address-description",bullets:["bbva-feature-postal-address-management-incomplete-address-1","bbva-feature-postal-address-management-incomplete-address-2"],buttonText:"bbva-feature-postal-address-management-continue-button"},errorConectivity:{id:12,classFull:"button-fixed",headerText:"bbva-feature-postal-address-management-error-header",microillustration:"errorconnection",title:"bbva-feature-postal-address-management-error-title",description:"bbva-feature-postal-address-management-error-description",buttonText:"bbva-feature-postal-address-management-error-retry",buttonLink:"bbva-feature-postal-address-management-link-button"},errorConectivityEnd:{id:13,classFull:"button-fixed",headerText:"bbva-feature-postal-address-management-error-header",microillustration:"errorconnection",title:"bbva-feature-postal-address-management-error-title",description:"bbva-feature-postal-address-management-error-description",buttonText:"bbva-feature-postal-address-management-link-button"},errorInfoNotAvailable:{id:"errorInfoNotAvailable",classFull:"button-fixed",headerText:"bbva-feature-postal-address-management-header",microillustration:"error",title:"bbva-feature-postal-address-management-error-info-title",description:"bbva-feature-postal-address-management-error-info-description",buttonText:"bbva-feature-postal-address-management-error-retry",buttonLink:"bbva-feature-postal-address-management-error-info-close"},errorInfoNotAvailableEnd:{id:"errorInfoNotAvailableEnd",classFull:"button-fixed",headerText:"bbva-feature-postal-address-management-header",microillustration:"error",title:"bbva-feature-postal-address-management-error-info-title",description:"bbva-feature-postal-address-management-error-info-description",buttonText:"bbva-feature-postal-address-management-error-info-close"},deleteWarning:{id:"deleteWarning",titleText:"",headerText:"bbva-feature-postal-address-management-delete",type:"warning",messageText:"bbva-feature-postal-address-management-delete-warning",buttonText:"bbva-feature-postal-address-management-delete-button",linkText:"bbva-feature-postal-address-management-delete-exit"},editWarning:{id:"editWarning",headerText:"bbva-feature-postal-address-management-edit",type:"warning",titleText:"",messageText:"bbva-feature-postal-address-management-edit-warning",buttonText:"bbva-feature-postal-address-management-edit-warning-accept"},weightError:{id:6,titleText:"",headerText:"bbva-feature-postal-address-management-weigth",type:"error",messageText:"bbva-feature-postal-address-management-weight-error"},exitWarning:{id:"exitWarning",headerText:"bbva-feature-postal-address-management-exit",type:"warning",messageText:"bbva-feature-postal-address-management-exit-warning",buttonText:"bbva-feature-postal-address-management-exit-warning-exit",linkText:"bbva-feature-postal-address-management-exit-warning-continue",fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,modalType:"",headerType:"modal-short",titleText:"",titleIcon:""},permissionsCamWarning:{id:8,titleText:"",headerText:"bbva-feature-postal-address-management-permissions-cam",type:"warning",messageText:"bbva-feature-postal-address-management-permissions-cam-warning"},permissionsDeviceWarning:{id:9,titleText:"",headerText:"bbva-feature-postal-address-management-permissions-device",type:"warning",messageText:"bbva-feature-postal-address-management-permissions-device-warning"},mediaSourceSelector:{id:16,headerText:"bbva-feature-postal-address-management-upload-file-title",selectors:!0,fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,modalType:"",headerType:"modal-short",titleText:"",titleIcon:"",buttonText:"",linkText:"",subTitleText:"",bodyText:"",optionalText:"",complementaryText:""},cantUploadAddressProof:{id:"cantUploadAddressProof",titleText:"",headerText:"bbva-feature-postal-address-management-header",microillustration:"error",title:"bbva-feature-postal-address-management-cant-upload-file",buttonText:"bbva-feature-postal-address-management-upload-another-address-proof"},privacyNoticeModal:{id:10,titleText:"",headerText:"bbva-feature-postal-address-management-privacy-notice",messageText:"bbva-feature-postal-address-management-privacy-notice-modal",instructions:"bbva-feature-postal-address-management-privacy-notice-modal-instructions"}};var fe=e`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ge extends(t(D($(a(s))))){static get is(){return"bbva-feature-profile-postal-address-management"}static get scopedElements(){const e=[le,ne,me,ue,ee,V,W,Y,...ge.configurationScopedElements()];return ge.scopedElementsFromClasses(e)}static get properties(){return{entryPoint:{type:String},proceedingsFileData:{type:Object},_multistepOpenModal:{type:Boolean,state:!0},_modalFullOpen:{type:Boolean,state:!0},_configFullModal:{type:Object,state:!0},_configHalfModal:{type:Object,state:!0},_modalHalfOpen:{type:Boolean,state:!0},_isSuccess:{type:Boolean,state:!0},_filteredZipCodeColonies:{type:Array,state:!0},_lastServiceCalled:{type:String,state:!0},_dataGeographicPlaces:{type:Array,state:!0},_objTownState:{type:Object,state:!0},addressProceedings:{type:Object},customerId:{type:String},_addressId:{type:String,state:!0},userEmail:{type:String},_documentToProcessFile:{type:Object,state:!0},_payloadAddressUpdate:{type:Object,state:!0},_triesDocumentProcess:{type:Number,state:!0},country:{type:String},_headersCustomersIdentifications:{type:Object},_userProcess:{type:String,state:!0},_bindedLiterals:{type:Object,state:!0},_zipCodeDoesNotExist:{type:Boolean,state:!0},_errorTries:{type:Number,state:!0},_updateAddressBody:{type:Object,state:!0},_documentTypes:{type:Array,state:!0},_fileName:{type:String,state:!0},_state:{type:String,state:!0},_zipCodeToRequest:{type:String,state:!0},_modalTypes:{type:Object,state:!0},_modalCallbacks:{type:Object,state:!0},_currentPermissionsService:{type:String,state:!0},_fileUploadSelection:{type:String},_customerInfo:{type:Array,state:!0},_deleteFile:{type:Boolean,state:!0},_loading:{type:Boolean,state:!0},_fileUploaded:{type:Object,state:!0},_fileChoosen:{type:Boolean,state:!0},_fileLoaded:{type:Boolean,state:!0},_documentTypeLabel:{type:String,state:!0},_rollBackFlag:{type:Boolean,state:!0},_resetForm:{type:Boolean,reflect:!0,state:!0},config:{type:Object},_proceedingsModifyFlag:{type:Boolean,state:!0},_optionSelected:{type:String,state:!0},_preLoadedData:{type:Object,state:!0}}}constructor(){super(),this._optionSelected="",this._proceedingsModifyFlag=!1,this._preLoadedData={},this.config={loader:{showspinnerMessageLabel:!1,titleMessage:"bbva-feature-postal-address-management-spinner-title",text:"bbva-feature-postal-address-management-spinner-text",variant:"transparent"}},this._multistepOpenModal=!1,this._modalFullOpen=!1,this._configFullModal={},this._configHalfModal={},this._configSuccessModal={},this._modalHalfOpen=!1,this._isSuccess=!1,this._errorTries=0,this._updateAddressBody={},this._documentTypes=[],this._fileName="",this._state="",this._zipCodeToRequest="",this._filteredZipCodeColonies=[],this._lastServiceCalled="",this._dataGeographicPlaces=[],this._objTownState={},this.proceedingsFileData={},this._payloadAddressUpdate={},this._documentToProcessFile={},this.country="",this._triesDocumentProcess=0,this._userProcess="perfil",this._bindedLiterals={},this._customerInfo=[],this._deleteFile=!1,this._loading=!1,this._fileUploaded={},this._fileChoosen=!1,this._fileLoaded=!1,this._rollBackFlag=!1,this._resetForm=!1,this._modalTypes={full:{value:"_modalFullOpen",config:"_configFullModal"},half:{value:"_modalHalfOpen",config:"_configHalfModal"}},this._modalCallbacks={exitWarning:{times:{callBack:this._handleModalActivity,params:{detail:{modal:"half",config:"exitWarning"}}},primary:{callBack:this._reset}},onboardingInfo:{primary:{callBack:this._addressUpdateOpened},secondary:{callBack:this._closeModal},times:{callBack:this._closeModal},link:{callBack:this._handleModalActivity,params:{detail:{modal:"half",config:"privacyNoticeModal"}}}},photoRecommendations:{times:{callBack:()=>{this._modalFullOpen=!1}},primary:{callBack:this._checkPermissionsState,params:{detail:"camera"}}},deleteWarning:{primary:{callBack:this._handleDeleteFile},secondary:{callBack:this._closeOneModal}},editWarning:{primary:{callBack:this._rollBackProofStep}},errorInfoNotAvailable:{primary:{callBack:this[this._lastServiceCalled]},secondary:{callBack:this._reset},times:{callBack:this._reset}},errorInfoNotAvailableEnd:{primary:{callBack:this._reset},times:{callBack:this._reset}},cantUploadAddressProof:{primary:{callBack:()=>{this._modalFullOpen=!1}},times:{callBack:()=>{this._modalFullOpen=!1}}}},this.addressProceedings={},this.customerId="",this._addressId="",this.userEmail="",this._currentPermissionsService="",this._fileUploadSelection="",this._headersCustomersIdentifications={"Content-Type":"multipart/form-data","Accept-Language":"es"},this.entryPoint="profile",this._zipCodeDoesNotExist=!1,this._documentTypeLabel=""}static get styles(){return[fe,i("bbva-feature-profile-postal-address-management-shared-styles")]}init(){this._toggleInvalidFormAtt("add"),this._toggleInvalidFormAtt(),this._getCatalogDocumentTypes(),this.userEmail=this.userEmail.replace(/^\*+/,"•").toLowerCase()}_requestInit(){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-initialization")}get _catalogDocumentTypesDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-catalog-document-types-api-dm"]')}get _customerAddressDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-local-customer-address-api-dm"]')}get _geographicPlaces(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-places-api-dm"]')}updated(e){e.has("_lastServiceCalled")&&(this._modalCallbacks.errorInfoNotAvailable.primary.callBack=this[this._lastServiceCalled])}handleProfileEntryPoint(e){this._addressId=e&&e.addressId,this._requestInit()}_addressUpdateOpened(){this._multistepOpenModal=!0,this._modalFullOpen=!1}_closeOneModal(){this._modalFullOpen=!1}_closeModal(){this._modalFullOpen=!1,this._multistepOpenModal=!1,this.exit()}_genericHandleModalButton(e){const t=this._modalCallbacks[e.detail.modalId]&&this._modalCallbacks[e.detail.modalId][e.detail.button];t&&t.callBack&&t.callBack.call(this,t.params)}_handleModalActivity(e){this[this._modalTypes[e.detail.modal].config]=be[e.detail.config]}_handleDeleteFile(){this._deleteFile=!0,this._loading=!1,this._fileUploaded={},this._fileChoosen=!1,this._fileLoaded=!1}_handleDeleteFileFlag({detail:e}){this._deleteFile=e}_filterDocuments(e){const t=["006","007","026"],a=this.ineWithoutAddress?t.slice(0,2):t;return e.filter((e=>a&&a.includes(e.id)))}_handleFetch(e){switch(this._errorTries=0,this.clearLoader(),this.documentTypes=this._filterDocuments(e.detail),this.entryPoint){case"typeIdentificationProceedings":this._multistepOpenModal=!0;break;case"updateAddressProceedings":this._handleProceedingsModify();break;default:this._handleModalActivity({detail:{modal:"full",config:"onboardingInfo"}}),this._handleFootprintOnBoarding()}}_handleFootprintOnBoarding(){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-on-boarding-modal")}_handleFetchError(){this._errorTries+=1,this.clearLoader(),this._handleModalActivity({detail:{modal:"full",config:3===this._errorTries?"errorInfoNotAvailableEnd":"errorInfoNotAvailable"}})}_getCatalogDocumentTypes(){this.showLoader("transparent"),this._lastServiceCalled="_getCatalogDocumentTypes",this._catalogDocumentTypesDm.getCatalogDocumentTypes()}_buildSetAddressPayload(e){if(!e||!e.addressInfo)return{};const{street:t,exteriorNumber:a,interiorNumber:s,postalCode:i,colony:o,town:r}=e.addressInfo,n="026"===("profile"!==this.entryPoint?this.proceedingsFileData.id:e&&e.optionSelected)?this._randomDocumentNumber():"",d="profile"===this.entryPoint?{}:{name:this.t("bbva-feature-postal-address-management-payload-mexico")},l="profile"===this.entryPoint?{}:{name:this._objTownState&&this._objTownState.state&&this._objTownState.state.name},p="profile"===this.entryPoint?{}:{label:this._documentTypeLabel},c="updateAddressProceedings"===this.entryPoint?this.proceedingsFileData.id:e&&e.optionSelected,m={addressType:{id:"HOME"},location:{addressComponents:[{componentTypes:["COUNTRY"],code:"MEX",...d},{componentTypes:["POSTAL_CODE"],code:i},{componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:this._objTownState&&this._objTownState.state&&this._objTownState.state.id,...l},{componentTypes:["ADMINISTRATIVE_AREA_LEVEL_2"],name:r},{componentTypes:["COLONY"],name:o},{componentTypes:["STREET"],name:t},{componentTypes:["EXTERIOR_NUMBER"],name:a},{componentTypes:["INTERIOR_NUMBER"],name:s}]},addressProofDocuments:[{documentType:{id:c},documentNumber:n,...p}]};return"026"===e.optionSelected?m.addressProofDocuments.find((e=>e)).expirationDate=moment(new Date).add(1,"y").format("YYYY-MM-DD"):m.addressProofDocuments.find((e=>e)).issueDate=moment(new Date).subtract(1,"M").format("YYYY-MM-DD"),m}_randomDocumentNumber(){return Math.floor(1e13*Math.random()).toString().padStart(13,"0")}_setDmCustomerAddressData(e){if(this._fileName=e.detail&&e.detail.documentInfo&&e.detail.documentInfo.name,this._state=e.detail&&e.detail.addressInfo&&e.detail.addressInfo.state,this._updateAddressBody=this._buildSetAddressPayload(e.detail),0===Object.keys(this._updateAddressBody).length)return;if(["typeIdentificationProceedings","updateAddressProceedings"].includes(this.entryPoint)){const e={updateAddres:this._updateAddressBody,formData:this._generateIdentificationProcessPayload()};return this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-proceedings-update-complete",{detail:e}),void this._reset()}this._updateCustomerAddress()}_updateCustomerAddress(){this.showLoader("transparent"),this._lastServiceCalled="_updateCustomerAddress",this._addressId?this._customerAddressDm.updateCustomerAddress(this.customerId,this._addressId,this._updateAddressBody):this._customerAddressDm.postCustomerAddress(this.customerId,this._updateAddressBody)}_addressHandleUpdate(e){this._payloadAddressUpdate=e&&e.detail||{},this._documentVerificationProcessData()}_documentVerificationProcessData(){this._triesDocumentProcess>0&&this.showLoader("transparent");["typeIdentificationProceedings","updateAddressProceedings"].includes(this.entryPoint)||(this._lastServiceCalled="_documentVerificationProcessData",this._bgadmCustomerIdentificationProcessDocuments.multipart=this._generateIdentificationProcessPayload(),this._bgadmCustomerIdentificationProcessDocuments.postCustomerIdentificationProcessDocuments(this.customerId),this._triesDocumentProcess+=1)}get _bgadmCustomerIdentificationProcessDocuments(){return this.shadowRoot.querySelector(`[data-tag-name="${Y.is}"]`)}_handleGetPlaces({detail:e}){this.clearLoader(),e?(this._dataGeographicPlaces=e,this._filterPlaces()):this._zipCodeDoesNotExist=!0}_filterPlaces(){this._filteredZipCodeColonies=this._dataGeographicPlaces.map((({id:e,name:t})=>({id:e,name:t})))}_setZipCodeDetail({detail:e}){this._zipCodeToRequest=e,this._getZipCodeService()}_getZipCodeService(){this.showLoader("transparent"),this._modalFullOpen=!1,this._lastServiceCalled="_getZipCodeService",this._geographicPlaces.getPlaces({zipCode:this._zipCodeToRequest})}_handleDinamicTwonState({detail:e}){this._objTownState=this._dataGeographicPlaces.find((t=>t.id===e))}_handleProceedingsModify(){this._multistepOpenModal=!0;const e=this.shadowRoot.querySelector("#addressMultistepModal").shadowRoot.querySelector("#proofAddressSelector");this._optionSelected=this.proceedingsFileData.id,this._documentTypeLabel=this._getDocumentTypeLabelById(this.proceedingsFileData.id);const t={optionSelected:this._documentTypeLabel,fileName:this.proceedingsFileData.name};this._preLoadedData=t,this._proceedingsModifyFlag=!0,e.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0})),this._handlePageVisit(t)}_handlePageVisit(e){const t={typology:e.optionSelected.toLowerCase(),process:this._userProcess};this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-update-address-page-visit",t)}_checkPermissionsState(e){this._modalFullOpen=!1,this._currentPermissionsService=e.detail?e.detail:e,this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-check-permissions",this._currentPermissionsService)}handleCheckPermissionsSuccess(e){const t="camera"===this._currentPermissionsService?this._launchMediaCapture:this._launchFileFetcher;"granted"!==e.state?this._requestPermissions(this._currentPermissionsService):t.call(this)}handleRequestPermissionsError(e){if([2,4,5].includes(e.code)){const e="camera"===this._fileUploadSelection?"permissionsCamWarning":"permissionsDeviceWarning";this._handleModalActivity({detail:{modal:"half",config:e}})}}_requestPermissions(e){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-request-permissions",e)}_launchMediaCapture(){this._setMultiStepLoading(!0),this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-launch-media-capture",{source:"camera",quality:50,scaleType:"maxWeight",scaleRate:10,showMetadata:!0})}handleMediaCaptureSuccessResponse(e){this._saveFileUploaded(e)}async _saveFileUploaded(e){let t;this._documentToProcessFile={},this._setMultiStepLoading(!1),"pdf"!==this._fileUploadSelection&&(t=await this._resizeBase64Image(e.fileBase64));(t?t.sizeKB:e.size/1e3)>4e3?this._handleModalActivity({detail:{modal:"half",config:"weightError"}}):(this._documentToProcessFile=e,this._documentToProcessFile.fileBase64=t&&t.base64||e.fileBase64,e.size=`${t&&t.sizeKB||e.size} kb`,this._fileUploaded=e,this._fileChoosen=!0,this._fileLoaded=!0,this._launchOpenDocument())}handleMediaCaptureErrorResponse(){this._setMultiStepLoading(!1),this._handleModalActivity({detail:{modal:"full",config:"cantUploadAddressProof"}}),this._handleFootprintReceiptError()}handleProceedingsData({data:e}){const{entryPoint:t,documentData:a,ineWithoutAddress:s,process:i,address:{addressComponents:{data:{location:{addressComponents:o}}}}}=e;this.entryPoint=t,this.proceedingsFileData=a,this.ineWithoutAddress=s,this.addressProceedings=o,this._userProcess=i,this._requestInit()}_handleIdentificationProcessSuccess(){this.clearLoader(),this._modalFullOpen=!1,this._multistepOpenModal=!1,this._buildSuccessPage()}_buildSuccessPage(){const e=this._payloadAddressUpdate.location&&this._payloadAddressUpdate.location.addressComponents&&this._payloadAddressUpdate.location.addressComponents.map((e=>[e&&e.componentTypes&&e.componentTypes[0],e&&e.code||e&&e.name])),t=Object.fromEntries(e),a=this._payloadAddressUpdate&&this._payloadAddressUpdate.operationTracking&&this._payloadAddressUpdate.operationTracking.operationNumber,s=this._payloadAddressUpdate.lastUpdateDate.replace("Z",""),i=moment(s).locale("es").format("D MMMM YYYY, HH:mm"),{STREET:o,EXTERIOR_NUMBER:r,INTERIOR_NUMBER:n,POSTAL_CODE:d,COLONY:l,ADMINISTRATIVE_AREA_LEVEL_2:p}=t,c=[{name:"bbva-feature-postal-address-management-success-folio",value:{text:a}},{name:"bbva-feature-postal-address-management-success-date",value:{text:i}},{name:"bbva-feature-postal-address-management-success-document-type",value:{text:this._documentTypeLabel}},{name:"bbva-feature-postal-address-management-success-file-name",value:{text:this._fileName}},{name:"bbva-feature-postal-address-management-success-address",value:{text:`\n          ${se(o)}\n          ${se(r)}\n          ${n?` - ${se(n)}`:""},\n          ${d},\n          ${se(l)},\n          ${se(p)},\n          ${se(this._state)},\n          ${this.t("bbva-feature-postal-address-management-payload-mexico")}.`}}];this._customerInfo=c,this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-success",{operationNumber:a})}_generateIdentificationProcessPayload(){const e={documentType:"O",verificationType:[{id:"ADDRESS",status:{id:"OK"}}],metadata:[{key:"DOCUMENT_TYPE_ID",value:this._optionSelected},{key:"PRODUCT",value:"GM"},{key:"OPERATION_TYPE",value:"saveDocCteTempGM"},{key:"REFERENCE_NUMBER",value:""},{key:"PROCEDURE",value:"A2"}],contentInfo:{contentData:"proof address",contentType:this._documentToProcessFile.extension||"pdf",documentFamily:this._documentToProcessFile.extension||"pdf"}};return{type:"multipart/form-data",formDataParts:[{name:"documentInfo",body:{mediaType:"application/json",content:JSON.stringify(e)}},{name:"file",filename:this._documentToProcessFile.name,body:{mediaType:"pdf"===this._fileUploadSelection?"application/pdf":"image/jpeg",content:this._documentToProcessFile.fileBase64}}]}}async _rollBackProofStep(){this._rollBackFlag=!0;const e=this.shadowRoot.querySelector("#addressMultistepModal"),t=e.shadowRoot.querySelector("#proofAddressSelector"),a=e.shadowRoot.querySelector("#addressForm");a.edit(),t.openEditStep=!1,t.edit(),t.openEditStep=!0,this._deleteFile=!0,a.completed=!1,this._loading=!1,this._fileUploaded={},this._fileChoosen=!1,this._fileLoaded=!1,this._resetFormInputs(),await a.updateComplete,this._toggleInvalidFormAtt("add"),await a.updateComplete,this._toggleInvalidFormAtt()}_resetFormInputs(){this._resetForm=!0}_reset(){this._handleDeleteFile(),this._resetFormInputs(),this._fileUploadSelection="",this._filteredZipCodeColonies=[],this._dataGeographicPlaces=[],this._objTownState={},this._rollBackProofStep(),this._multistepOpenModal=!1,this._modalFullOpen=!1,this._modalHalfOpen=!1,this._isSuccess=!1,this._customerInfo=[],this._loading=!1,this._fileUploaded={},this._fileChoosen=!1,this._fileLoaded=!1,this._optionSelected="",this._preLoadedData={},this.exit()}_resetFormInput(){this._resetForm=!1}_handleListActionClick({detail:e}){this._handleModalActivity({detail:{modal:"half",config:e}}),this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-sources")}_handleUploadFileSelection({detail:e}){if(this._modalHalfOpen=!1,this._fileUploadSelection=e,this._dispatchCustomEvent(`bbva-feature-profile-postal-address-management-source-${this._fileUploadSelection}-selected`),"camera"===this._fileUploadSelection)return this._handleModalActivity({detail:{modal:"full",config:"photoRecommendations"}}),void this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-photo-recommendations-modal");this._getMobilePlatform()}_getMobilePlatform(){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-mobile-platform")}handleMobileInfoSuccessResponse(e){if(e&&"iOS"===e.platformName&&parseFloat(e&&e.versionName)>15||e&&"ANDROID"===e.platformName&&parseFloat(e&&e.versionName)>12)return void this._launchFileFetcher();const t=this.isNativeiOS?"media-library":"read-storage";this._checkPermissionsState(t)}_launchFileFetcher(){this._setMultiStepLoading(!0);const e={contentType:"photo-library"===this._fileUploadSelection?"image/*":"application/pdf"};this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-launch-file-fetcher",e)}handleFileFetcherSuccessResponse(e){this._saveFileUploaded(e)}handleFileFetcherErrorResponse(){this._setMultiStepLoading(!1),this._handleModalActivity({detail:{modal:"full",config:"cantUploadAddressProof"}}),this._handleFootprintReceiptError()}_handleFootprintReceiptError(){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-photo-receipt-error")}handleRequestPermissionsSuccess(){("camera"===this._currentPermissionsService?this._launchMediaCapture:this._launchFileFetcher).call(this)}_setMultiStepLoading(e){this._loading=e}_launchOpenDocument(){const e={value:this._documentToProcessFile.fileBase64,mimeType:"pdf"===this._fileUploadSelection?"application/pdf":"image/jpeg",method:"get",headers:{"Content-Type":"pdf"===this._fileUploadSelection?"application/pdf":"image/jpeg"},title:this.t("bbva-feature-postal-address-management-open-document-title"),headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!1,titleColor:"FF072146",blackStatusBar:!1};this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-open-file",e)}exit(){this._dispatchCustomEvent("bbva-feature-profile-postal-address-management-exit")}_handleResetDataForm({detail:e}){e&&(this._dataGeographicPlaces=[],this._filteredZipCodeColonies=[],this._objTownState={},this._zipCodeDoesNotExist=!1)}_resizeBase64Image(e){return new Promise((t=>{const a=new Image;a.src="data:image/png;base64,"+e,a.onload=()=>{const e=document.createElement("canvas"),s=e.getContext("2d");e.width=a.width,e.height=a.height,s.drawImage(a,0,0,a.width,a.height),e.toBlob((e=>{const a=(e.size/1024).toFixed(2),s=new FileReader;s.readAsDataURL(e),s.onloadend=()=>{const e=s.result.split(",")[1];t({base64:e,sizeKB:a})}}),"image/jpeg",.7)}}))}_toggleInvalidFormAtt(e="remove"){const t=this.shadowRoot.querySelector("#addressMultistepModal");["street","externalNumber","zipCode"].forEach((a=>{const s=t.shadowRoot.querySelector(`#${a}`);"add"!==e?s.removeAttribute("invalid"):s.setAttribute("invalid","")}))}_handleDocumentTypeSelection({detail:e}){this._documentTypeLabel=this._getDocumentTypeLabelById(e.documentId),this._optionSelected=e.documentId}_getDocumentTypeLabelById(e){return this.documentTypes.find((t=>t.id===e)).name}_handleRollBackFlag(){this._rollBackFlag=!1}_handleSpinnerOcr(){this.showLoader("full",!0),setTimeout((()=>{this.clearLoader(),this.config.loader.showspinnerMessageLabel=!1;this.shadowRoot.querySelector("#addressMultistepModal").shadowRoot.querySelector("#proofAddressSelector").dispatchEvent(new CustomEvent("complete",{detail:!0,bubbles:!0,composed:!0}))}),3e3)}_handleProceedingsModifyFlag(){this.proceedingsModifyFlag=!1}_cleanModalConfiguration({detail:e},t,a=!0){e.visible||["transform","background-color"].includes(e.propertyName)||(a||e.visible?this[`_config${t}Modal`]={}:this._customerInfo=[])}get _tplApis(){return o`
      <bbva-global-catalog-document-types-api-dm
        version="${this.docuementTypeVersion0}"
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        @catalog-document-types-api-dm-fetch="${this._handleFetch}"
        @catalog-document-types-api-dm-fetch-error="${this._handleFetchError}">
      </bbva-global-catalog-document-types-api-dm>
      <bbva-local-customer-address-api-dm
        version="${this.customersApiVersionV1}"
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        requiredOTP
        @customer-address-api-dm-update="${this._addressHandleUpdate}"
        @customer-address-api-dm-update-error="${this._handleFetchError}"
        @customer-address-api-dm-create="${this._addressHandleUpdate}"
        @customer-address-api-dm-create-error="${this._handleFetchError}">
      </bbva-local-customer-address-api-dm>
      <bbva-global-places-api-dm
        version="${this.geographicPlacesV0}"
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        @places-api-dm-fetch="${this._handleGetPlaces}"
        @places-api-dm-fetch-error="${this._handleFetchError}">
      </bbva-global-places-api-dm>
      <bbva-global-customer-identification-process-documents-api-dm
        version="${this.customersApiVersionV1}"
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        requiredOTP
        .headers="${this._headersCustomersIdentifications}"
        forceBoundary
        @customer-identification-process-documents-api-dm-create="${this._handleIdentificationProcessSuccess}"
        @customer-identification-process-documents-api-dm-create-error="${this._handleFetchError}"
        @api-dm-error="${this._handleFetchError}">
      </bbva-global-customer-identification-process-documents-api-dm>
    `}render(){return o`
      ${super.render()}
      ${this._tplApis}
      <address-multistep-modal
        id="addressMultistepModal"
        ?is-visible="${this._multistepOpenModal}"
        entry-point="${this.entryPoint}"
        .addressProceedings="${this.addressProceedings}"
        .colonies="${this._filteredZipCodeColonies}"
        .setDmCustomerAddress="${this._setDmCustomerAddress}"
        .objTownState="${this._objTownState}"
        .interactions="${this._bindedLiterals}"
        user-process="${this._userProcess}"
        document-type-label="${this._documentTypeLabel}"
        .selectOptions="${this.documentTypes}"
        ?zip-code-does-not-exist="${this._zipCodeDoesNotExist}"
        ?delete-file="${this._deleteFile}"
        ?is-loading="${this._loading}"
        .fileUploaded="${this._fileUploaded}"
        ?file-choosen="${this._fileChoosen}"
        ?file-loaded="${this._fileLoaded}"
        ?roll-back-flag="${this._rollBackFlag}"
        ?reset-form="${this._resetForm}"
        option-selected="${this._optionSelected}"
        .preLoadedData="${this._preLoadedData}"
        ?proceedings-modify-flag="${this._proceedingsModifyFlag}"
        @bbva-feature-postal-address-management-spinner-ocr="${this._handleSpinnerOcr}"
        @bbva-feature-profile-postal-address-management-reset-form-flag="${this._resetFormInput}"
        @bbva-feature-postal-address-management-operative-close="${this._genericHandleModalButton}"
        @bbva-feature-postal-address-management-delete-file="${this._handleModalActivity}"
        @bbva-feature-profile-postal-address-management-zip-code-send="${this._setZipCodeDetail}"
        @bbva-feature-postal-address-management-set-address="${this._setDmCustomerAddressData}"
        @bbva-feature-profile-postal-address-management-id-colony-send="${this._handleDinamicTwonState}"
        @bbva-feature-postal-address-management-list-action-click="${this._handleListActionClick}"
        @bbva-feature-postal-address-management-edit-step="${()=>{this._handleModalActivity({detail:{modal:"half",config:"editWarning"}})}}"
        @bbva-feature-profile-postal-address-management-reset-data-form="${this._handleResetDataForm}"
        @bbva-feature-postal-address-management-delete-file-flag="${this._handleDeleteFileFlag}"
        @bbva-feature-postal-address-management-document-type-selected="${this._handleDocumentTypeSelection}"
        @bbva-feature-profile-postal-address-management-roll-back-flag="${this._handleRollBackFlag}"
        @bbva-feature-profile-postal-address-management-proceedings-modify-flag="${this._handleProceedingsModifyFlag}">
      </address-multistep-modal>
      <address-half-modal
        id="addressHalfModal"
        .config="${this._configHalfModal}"
        ?visible="${this._modalHalfOpen}"
        @bbva-feature-profile-postal-address-management-half-modal-visible-change="${e=>{this._cleanModalConfiguration(e,"Half")}}"
        @bbva-feature-profile-postal-address-management-half-modal-change="${e=>{this._modalHalfOpen=e.detail}}"
        @bbva-feature-profile-postal-address-management-generic-modal-click="${this._genericHandleModalButton}"
        @bbva-feature-profile-postal-address-management-modal-open="${e=>{this._modalHalfOpen=!e.detail}}"
        @bbva-feature-profile-postal-address-management-half-modal-upload-file="${this._handleUploadFileSelection}">
        ${this._helpMediaSource}
      </address-half-modal>
      <address-full-modal
        id="addressFullModal"
        ?is-visible="${this._modalFullOpen}"
        .config="${this._configFullModal}"
        @bbva-feature-profile-postal-address-management-modal-open="${e=>{this._modalFullOpen=!e.detail}}"
        @bbva-feature-profile-postal-address-management-full-modal-visible-change="${e=>this._cleanModalConfiguration(e,"Full")}"
        @bbva-feature-profile-postal-address-management-generic-modal-click="${this._genericHandleModalButton}">
      </address-full-modal>
      <address-success-modal
        id="addressSuccessModal"
        .customerInfo="${this._customerInfo}"
        user-email="${this.userEmail}"
        @bbva-feature-profile-postal-address-management-modal-open="${e=>{this._isSuccess=!e.detail}}"
        @bbva-feature-profile-postal-address-management-success-modal-visible-change="${e=>this._cleanModalConfiguration(e,"success",!1)}"
        @help-modal-close="${this._reset}"
        ?is-visible="${this._isSuccess}"
        visibleChars="12">
      </address-success-modal>
    `}}customElements.define(ge.is,ge);class _e extends(S(s)){static get is(){return"bbva-analyticmanager-profile-address-management-mx"}static get properties(){return{customFields:{type:String}}}constructor(){super(),this.customFields=""}static get entryPointsCodes(){return{profile:"perfil",typeIdentificationProceedings:"modificar domicilio",updateAddressProceedings:"modificar dirección actual"}}manageAppOnClickStart({entryPoint:e="profile",completedModules:t,segmentProfile:a="perfil"}){const s={step:_e.entryPointsCodes[e],segmentProfile:a};"profile"!==e&&(this.customFields=`modulos completados:${t}`,s.customFields=this.customFields,s.primaryCategory="cuentas",s.productName="cuenta nomina basica"),this.persistData(s),this.fireAppOnClickStart()}manageAppPageVisit({typology:e,process:t,step:a}){this.persistData({typology:e,process:t,step:a}),this.firePageVisit()}manageOtpStep(){const e={customFields:0===this.customFields.length?"firma:token":`firma:token, ${this.customFields}`};this.persistData(e),this._dispatch("bbva-feature-profile-postal-address-management-analytics-custom-otp",this.data)}manageAppCompleted(e){this.persistData(e),this.fireAppCompleted()}}customElements.define(_e.is,_e);
