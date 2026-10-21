import{z as e,an as t,L as a,ak as r,h as s,i,aN as o,dz as n}from"./952f98a9.js";import{M as d,v as l,L as m,f as p,Q as b,G as c,a4 as h,a9 as u,V as g,a3 as f,D as v,e as _,K as y,N as $,au as E,av as C,H as x,I as A,z as S,E as M,R as I,S as R,ah as w}from"./216055dc.js";import{bf as P,bg as F}from"./7f3d7ca9.js";import{a as D,B as k}from"./14c2fefc.js";import{B as O,b as T}from"./30ef6f1f.js";import{a as N,b as L}from"./e3d898b2.js";import{B as z}from"./c281d121.js";import{B,b as j}from"./eee1b8f7.js";import{B as U}from"./c6d24711.js";import"./ff2cdeea.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./2b04e291.js";import"./854beed0.js";import"./84dff06e.js";var q=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.cta {
  margin: 1rem 0 0;
}

.form-input-container {
  margin-bottom: 1rem;
}

.notification-message-container {
  margin-bottom: 1.5rem;
  margin-top: 1.5rem;
}
`;class V extends(d(l(m(t(a))))){static get is(){return"member-get-member-personal"}static get scopedElements(){const e=[O,p,b,c,h,...V.configurationScopedElements()];return V.scopedElementsFromClasses(e)}static get properties(){return{personalInformation:{type:Object},_ctaDisabled:{type:Boolean},titleStep:{type:String},descriptionStep:{type:String},calendarData:{type:Object},referredUsers:{type:Number,attribute:"referred-users"},pageViewLoad:{type:Boolean}}}constructor(){super(),this.titleStep="",this.descriptionStep="",this.referredUsers=0,this.pageViewLoad=!1,this.reset()}static get styles(){return[q,u.primary,u.primaryAlt,g.primary,g.primaryAlt,T.primary,T.primaryAlt,f.primary,f.primaryAlt,v.primary,v.primaryAlt,r("member-get-member-personal-shared-styles")]}reset(){this.personalInformation={},this._ctaDisabled=!0,this._resetFields(),this.calendarData={}}_resetFields(){[...this.shadowRoot.querySelectorAll('[data-tag-name^="bbva-form"]')].reverse().forEach((e=>{e.value=""}))}firstUpdated(e){super.firstUpdated(e),this._birthdayField=this.shadowRoot.querySelector('[name="birthdate"]')}async updated(e){super.updated(e),e.has("calendarData")&&Object.keys(this.calendarData).length&&(this._birthdayField.value=this.calendarData.selectedDate,await this.requestUpdate(),this._saveBirthDay({target:{name:"birthdate",value:this.calendarData.selectedDate}}),this._validatePersonalInformation()),e.has("personalInformation")&&0===Object.keys(this.personalInformation).length&&!this.pageViewLoad&&this.dispatchEvent(new CustomEvent("member-get-member-tdc-personal-form-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers}))}get _titleStep(){return""!==this.titleStep?s`
      <bbva-header-category
        text="${this.titleStep}"
        ambient="${this.ambient}"
        heading-level="1"
        >
      </bbva-header-category>
    `:""}get _descriptionStep(){return""!==this.descriptionStep?s`
      <bbva-type-text
        text="${this.descriptionStep}"
        ambient="${this.ambient}"
        >
      </bbva-type-text>
    `:""}render(){return s`
      ${this._titleStep}
      ${this._descriptionStep}
      <bbva-form-input class="form-input-container"
        clear-accessible-text="input-name"
        name="name"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-name-label")}"
        pattern="^[a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\- ]{2,100}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-text-error-message")}"
        auto-validate>
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        clear-accessible-text="input-firstLastName"
        name="firstLastName"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-first-name-label")}"
        pattern="^[a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\- ]{2,100}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-text-error-message")}"
        auto-validate>
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        clear-accessible-text="input-secondLastName"
        name="secondLastName"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-last-name-label")}"
        pattern="^[a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\- ]{2,100}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-text-error-message")}"
        auto-validate>
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        clear-accessible-text="input-email"
        name="email"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-email-address-label")}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-email-error-message")}"
        pattern="^(?=.{1,50}$)(?![.%+\\-])[a-zA-Z0-9][a-zA-Z0-9.%+\\-]{2,}[a-zA-Z0-9]@[a-zA-Z0-9\\-]{2,}\.[a-zA-Z]{2,6}(\.[a-zA-Z]{2,6}){0,2}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        auto-validate
        >
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        clear-accessible-text="input-birthdate"
        name="birthdate"
        type="date"
        ambient="${this.ambient}"
        min="${this._calculateMinDate}"
        max="${this._calculateMaxDate}"
        label="${this.t("bbva-feature-member-get-member-personal-field-birth-date-label")}"
        @form-input-value-change="${this._saveBirthDay}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        pattern="d{2}-d{2}-d{4}"
        @click=${this._launchCalendar}
        error-message="${this.t("bbva-feature-member-get-member-personal-field-date-error-message")}"
        auto-validate
        >
      </bbva-form-input>

      <bbva-notification-message class="notification-message-container">
        ${this.t("bbva-feature-member-get-member-personal-notification-message")}
      </bbva-notification-message>

      ${this.cta(this.t("bbva-feature-member-get-member-personal-step-cta"),this._onClickCta.bind(this,this.personalInformation))}
    `}get _currentDate(){const e=new Date,t=e.getDate().toString().padStart(2,"0"),a=(e.getMonth()+1).toString().padStart(2,"0");return{year:e.getFullYear(),month:a,day:t}}get _calculateMinDate(){return`${this._currentDate.year-99}-01-01`}get _calculateMaxDate(){return`${this._currentDate.year}-${this._currentDate.month}-${this._currentDate.day}`}async _validatePersonalInformation(){await this.requestUpdate();const{personalInformation:e}=this,t=[...this.shadowRoot.querySelectorAll('[data-tag-name^="bbva-form"]')];this._ctaDisabled=this._hasInvalidInputs(t)||this._hasEmptyValues(e,t)}_hasInvalidInputs(e){return e.some((e=>e.invalid))}_hasEmptyValues(e,t){const a=Object.values(e);return!a.length||a.length<t.length||a.some((e=>""===e))}_savePersonalInformation(e){const{name:t,value:a}=e.target,{personalInformation:r}=this;this.personalInformation={...r,[t]:a}}async _saveBirthDay(e){const{value:t}=e.target;if(t){const e=new Date(t),a=new Date;a.setFullYear(a.getFullYear()-18),a<=e&&(await this.requestUpdate(),this._birthdayField.invalid=!0)}this._savePersonalInformation(e)}cta(e,t){return s`
      <bbva-button-default
        class="cta"
        ambient="${this.ambient}"
        fullwidth
        text="${e}"
        ?disabled="${this._ctaDisabled}"
        @click=${t}>
      </bbva-button-default>`}_onClickCta(e){this.dispatchEvent(new CustomEvent("cta-clicked",{bubbles:!0,composed:!0,detail:e}))}_launchCalendar(){const e={dateFormat:"yyyy-MM-dd",defaultDate:this._calculateMaxDate,minDate:this._calculateMinDate,maxDate:this._calculateMaxDate};this.dispatchEvent(new CustomEvent("launch-date-picker",{bubbles:!0,composed:!0,detail:e}))}}customElements.define(V.is,V);var H=e`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.summary-item-container:nth-last-child(n+2) {
  margin-bottom: 1rem;
}
`;class K extends(d(l(m(t(a))))){static get is(){return"member-get-member-personal-summary"}static get scopedElements(){const e=[c,...K.configurationScopedElements()];return K.scopedElementsFromClasses(e)}static get properties(){return{personalInformation:{type:Object}}}constructor(){super(),this.reset()}static get styles(){return[H,v.primary,v.primaryAlt,r("member-get-member-personal-summary-shared-styles")]}reset(){this.personalInformation={}}get _personalDataSummary(){return s`
      ${Object.keys(this._formatPersonalData).map((e=>s`
        <div class="summary-item-container">
          <bbva-type-text
            ambient="${this.ambient}"
            size="S"
            inherit
            text="${e}">
          </bbva-type-text>
          <bbva-type-text
            name="${e}"
            ambient="${this.ambient}"
            size="S"
            inherit
            text="${this._formatPersonalData[e]}">
          </bbva-type-text>
        </div>
      `))}
    `}get _formatPersonalData(){const e={};let t="";for(const a of Object.keys(this.personalInformation))if(Object.prototype.hasOwnProperty.call(this.getFormattedPersonalPropertiesLabels,a)){const r=this.getFormattedPersonalPropertiesLabels[a];this.personalFullNameProperties.includes(a)?(t+=`${this.personalInformation[a]} `,e["Nombre completo"]=t):e[r.label]="birthdate"===a?this._updateBirthdayFormat():this.personalInformation[a]}return e}get personalFullNameProperties(){return["name","firstLastName","secondLastName"]}_updateBirthdayFormat(){const{birthdate:e}=this.personalInformation;let t="";if(e){t=e.split("-").reverse().join("/")}return t}get getFormattedPersonalPropertiesLabels(){return{name:{label:"Nombre"},firstLastName:{label:"Primer apellido"},secondLastName:{label:"Segundo apellido"},birthdate:{label:"Fecha de nacimiento"},email:{label:"Correo electrónico"}}}render(){return s`
      ${this._personalDataSummary}
    `}}customElements.define(K.is,K);var G=e`:host {
  display: block;
  --member-get-member-address-finder-header-height: 3.5rem;
  --member-get-member-address-finder-footer-heigth: 5rem;
}

[data-modal-id=mapModal] {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-footer-last-button-margin-top: 0;
}

.slotted-map {
  height: calc(100% - (var(--member-get-member-address-finder-header-height) - var( --member-get-member-address-finder-footer-heigth)));
}

#map-component {
  position: relative;
}

#popup {
  position: absolute;
  bottom: 0;
  margin: auto 1rem 1.5rem;
}
`;class W extends(d(l(m(t(a))))){static get is(){return"bbva-feature-member-get-member-credit-card-help-modal"}static get scopedElements(){const e=[_,y,$,c,...W.configurationScopedElements()];return W.scopedElementsFromClasses(e)}static get properties(){return{_modalSettings:{type:Object},typeModal:{type:String}}}constructor(){super(),this.typeModal="",this._modalSettings={mapSearchAddressNotFound:{fullHeight:!0,fixedFooter:!0,headerText:"bbva-feature-member-get-member-map-search-address-not-found-modal-header-text",buttonText:"bbva-feature-member-get-member-map-search-address-not-found-modal-button-text",slotContent:{microillustration:"error",titleText:"bbva-feature-member-get-member-map-search-address-not-found-modal-slot-title",bodyText:"bbva-feature-member-get-member-map-search-address-not-found-modal-slot-body"}}}}static get styles(){return[$.primary,$.primaryAlt,v.primary,v.primaryAlt]}setModal(e){const t=this.shadowRoot.getElementById("modal"),a=this._modalSettings[e]||{},r=Object.keys(a);this._clearModal(t),this.typeModal=e,0!==r.length&&r.forEach((e=>{t[e]=this.t(a[e])})),t.open()}openModal(e){const t=this.shadowRoot.getElementById(e);this.typeModal=e,t.open()}_clearModal(e){const t=e,a=this._modalSettings[this.typeModal]||{};Object.keys(a).forEach((e=>{t[e]=""}))}_closeModal(e){this.shadowRoot.getElementById(e).close()}_modalCloseEvents(e){const t=e.type,a=e.target.id,r={"help-modal-footer-button-click":()=>{this._modalFooterButtonClick(a)},"help-modal-veil-click":()=>{this._modalVeilClick(a)},"help-modal-header-click":()=>{this._modalHeaderClick(a)}};r[t]&&r[t]()}_modalFooterButtonClick(e){const t="mapSearchInfo",a="mapSearchAddressNotFound";this.typeModal===t&&this.dispatchEvent(new CustomEvent("help-modal-show-address-finder",{bubbles:!0,composed:!0})),this.typeModal===a&&this.dispatchEvent(new CustomEvent("help-modal-map-search-address-not-found",{bubbles:!0,composed:!0})),this._closeModal(e)}_modalVeilClick(e){this._closeModal(e)}_modalHeaderClick(e){this.dispatchEvent(new CustomEvent("close-modal",{bubbles:!0,composed:!0})),this._closeModal(e)}_slotContent(){var e;const t=null===(e=this._modalSettings[this.typeModal])||void 0===e?void 0:e.slotContent;return t?s`
      <span slot="slot-content">
        <bbva-clip-microillustration microillustration="${i(t.microillustration)}"></bbva-clip-microillustration>
        <bbva-type-text size="3XL" font-weight="700" text="${i(t.titleText)}"></bbva-type-text>
        <bbva-type-text size="S" text="${i(t.bodyText)}"></bbva-type-text>
      </span>
    `:""}get _getModalTemplate(){return s`
      <bbva-help-modal
        id="mapSearchAddressNotFound"
        full-height
        fixed-footer
        header-text="${this.t("bbva-feature-member-get-member-map-search-address-not-found-modal-header-text")}"
        button-text="${this.t("bbva-feature-member-get-member-map-search-address-not-found-modal-button-text")}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-veil-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
        ${this._slotContent()}
      </bbva-help-modal>
    `}get _halfModalInformative(){return s`
      <bbva-help-modal
        id="mapSearchInfo"
        hide-content-padding-top
        header-text="${this.t("bbva-feature-member-get-member-map-search-info-modal-header-text")}"
        body-text="${this.t("bbva-feature-member-get-member-map-search-info-modal-body-text")}"
        button-text="${this.t("bbva-feature-member-get-member-map-search-info-modal-button-text")}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-veil-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
      </bbva-help-modal>
    `}get _halfModalPostalCodeError(){return s`
      <bbva-help-modal
        id="postalCodeRegistrationErrorRetry"
        header-text="${this.t("bbva-feature-member-get-member-postal-code-registration-error-retry-modal-header-text")}"
        title-icon="${o()}"
        modal-type= 'warning'
        hide-content-padding-top
        body-text="${this.t("bbva-feature-member-get-member-postal-code-registration-error-retry-modal-body-text")}"
        button-text="${this.t("bbva-feature-member-get-member-postal-code-registration-error-retry-modal-button-text")}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-veil-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
      </bbva-help-modal>
    `}get _postalCodeErrorFullModal(){return s`
      <bbva-help-modal
        id="postalCodeRegistrationError"
        fixed-footer
        full-height
        header-text="${this.t("bbva-feature-member-get-member-postal-code-registration-error-modal-header-text")}"
        button-text="${this.t("bbva-feature-member-get-member-postal-code-registration-error-modal-button-text")}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-veil-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
        <span slot="slot-content">
          <bbva-clip-microillustration microillustration="error"></bbva-clip-microillustration>
          <bbva-type-text size="3XL" font-weight="700" text="bbva-feature-member-get-member-postal-code-registration-error-modal-slot-title"></bbva-type-text>
          <bbva-type-text size="S" text="bbva-feature-member-get-member-postal-code-registration-error-modal-slot-body"></bbva-type-text>
        </span>
      </bbva-help-modal>
    `}get _halfModalRegistrationError(){return s`
      <bbva-help-modal
        id="referredRegistrationErrorRetry"
        header-text="${this.t("bbva-feature-member-get-member-referred-registration-error-retry-modal-header-text")}"
        title-icon="${o()}"
        modal-type= 'warning'
        hide-content-padding-top
        body-text="${this.t("bbva-feature-member-get-member-referred-registration-error-retry-modal-body-text")}"
        button-text="${this.t("bbva-feature-member-get-member-referred-registration-error-retry-modal-button-text")}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-veil-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
      </bbva-help-modal>
    `}get _registrationErrorFullModal(){return s`
      <bbva-help-modal
        id="registrationErrorFullModal"
        fixed-footer
        full-height
        header-text="${this.t("bbva-feature-member-get-member-referred-registration-error-modal-header-text")}"
        button-text="${this.t("bbva-feature-member-get-member-referred-registration-error-modal-button-text")}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-veil-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
        <span slot="slot-content">
          <bbva-clip-microillustration microillustration="error"></bbva-clip-microillustration>
          <bbva-type-text size="3XL" font-weight="700" text="bbva-feature-member-get-member-referred-registration-error-modal-slot-title"></bbva-type-text>
          <bbva-type-text size="S" text="bbva-feature-member-get-member-referred-registration-error-modal-slot-body"></bbva-type-text>
        </span>
      </bbva-help-modal>
    `}render(){return s`
      ${super.render()}
      ${this._halfModalInformative}
      ${this._halfModalPostalCodeError}
      ${this._postalCodeErrorFullModal}
      ${this._halfModalRegistrationError}
      ${this._registrationErrorFullModal}
      ${this._getModalTemplate}
    `}}class Z extends(d(l(m(t(a))))){static get is(){return"member-get-member-address-finder-modal"}static get scopedElements(){return{"bbva-help-modal":_,"bbva-notification-contextual":E,"bbva-map-dynamic":B,"bbva-feature-member-get-member-credit-card-help-modal":W}}static get properties(){return{isMapModalOpen:{type:Boolean},apiKey:{type:String,attribute:"api-key"},initialGeoLocation:{type:Object},_parsedAddress:{type:Object},_formattedAddress:{type:Object},_isContinueButtonEnabled:{type:Boolean},loadedMapFirstTime:{type:Boolean},_map:{type:Object}}}constructor(){super(),this.apiKey="",this.initialGeoLocation={lat:19.42873,lng:-99.17337},this.isMapModalOpen=!1,this._formattedAddress={},this._parsedAddress={},this.loadedMapFirstTime=!1,this._map={},this._resetProperties()}static get styles(){return[j.primary,j.primaryAlt,C.primary,C.primaryAlt,G,r("member-get-member-address-finder-modal-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this._map=this.shadowRoot.getElementById("map-component"),this._modalHelp=this.shadowRoot.querySelector('[data-tag-name="bbva-feature-member-get-member-credit-card-help-modal"]')}reset(){this._resetProperties()}_resetProperties(){this.isMapModalOpen=!1,this._formattedAddress={},this._parsedAddress={},this._isContinueButtonEnabled=!1,this.loadedMapFirstTime=!1}_resetMapDynamicState(){this._map.geoLocation={},Object.assign(this._map.geoLocation,this.initialGeoLocation),this._map.currentAddress=""}_cleanPredicitiveInputWhenMapLoadTheFirstTime(e){(this.loadedMapFirstTime||e)&&(Object.assign(this._map.geoLocation,{}),this._map.currentAddress="")}disableButtonWithEmptyInput(e){""===e.detail&&(this._isContinueButtonEnabled=!1)}_hasRequiredAddressProperties(e){const t=Object.prototype.hasOwnProperty;return["cp","street","externalNumber","colony","state"].every((a=>t.call(e,a)))}_openMapErrorModal(){this._isContinueButtonEnabled=!1,this._resetMapDynamicState(),this.dispatchEvent(new CustomEvent("member-get-member-address-finder-modal-address-not-found",{detail:"mapSearchAddressNotFound",bubbles:!0,composed:!0}))}_validateTheVisibilityOfModalError(e){this._hasRequiredAddressProperties(e)||this.loadedMapFirstTime?this._isContinueButtonEnabled=!this.loadedMapFirstTime:(this._openMapErrorModal(),this.dispatchEvent(new CustomEvent("member-get-member-address-not-found",{bubbles:!0,composed:!0})),this._isContinueButtonEnabled=!1)}_getLocation({detail:e}){if(this._cleanPredicitiveInputWhenMapLoadTheFirstTime(),0===e.address.length)return;const{address:t}=e;this._parsedAddress={...this._parseGeoLocation(t.address_components)},this._formattedAddress=this.loadedMapFirstTime?{}:t.formatted_address,this._validateTheVisibilityOfModalError(this._parsedAddress),this.loadedMapFirstTime=!1}get addressPropertiesRequired(){return{street_number:{label:"externalNumber",uses:"long_name"},postal_code:{label:"cp",uses:"long_name"},route:{label:"street",uses:"long_name"},sublocality_level_1:{label:"colony",uses:"long_name"},neighborhood:{label:"colony",uses:"long_name"},administrative_area_level_1:{label:"state",uses:"short_name"}}}_parseGeoLocation(e){return null==e?void 0:e.reduce(((e,t)=>{const a=e,r=this.addressPropertiesRequired,s=t.types.find((e=>r[e]));return s&&(a[r[s].label]=t[r[s].uses]),a}),{})}get _checkIfAddressIsNotEmpty(){return Object.keys(this._formattedAddress).length>0&&!this.loadedMapFirstTime}get _notificationContextual(){return s`
      <bbva-notification-contextual
        id="popup"
        icon-close=""
        ambient="${this.ambient}"
        head-title="${this.t("bbva-feature-member-get-member-map-modal-notification-contextual-title")}"
        body-text="${this._formattedAddress}"
        icon-type="${n()}">
      </bbva-notification-contextual>
    `}_shareAddressResult(){this.dispatchEvent(new CustomEvent("map-address-result",{detail:this._parsedAddress,bubbles:!0,composed:!0})),this._resetProperties()}_isReadyMap(){this.loadedMapFirstTime=!0,this._map.geoLocation=this.initialGeoLocation}_clearAddressOnPredictiveInputChange(){this._formattedAddress={}}_renderMap(){return s`
      <bbva-map-dynamic
        id="map-component"
        label=""
        ambient="${this.ambient}"
        api-key="${this.apiKey}"
        show-predictive
        is-draggable-pin
        optional-input-label=""
        no-results-message=""
        @input="${this._clearAddressOnPredictiveInputChange}"
        @map-dynamic-geolocation-request="${this._isReadyMap}"
        @map-dynamic-address-changed="${this._getLocation}"
        @form-predictive-value-change="${this.disableButtonWithEmptyInput}">
      </bbva-map-dynamic>
    `}_onCloseMapModal(e){e.stopPropagation();const t="help-modal-close"===e.type;this._cleanPredicitiveInputWhenMapLoadTheFirstTime(t),this.dispatchEvent(new CustomEvent("close-map-modal",{bubbles:!1,composed:!0})),this._resetProperties()}get _getMapModal(){return s`
      <bbva-help-modal
        data-modal-id="mapModal"
        button-text="${this.t("bbva-feature-member-get-member-map-modal-continue-button-text")}"
        ?visible=${this.isMapModalOpen}
        ?disabled-button="${!this._isContinueButtonEnabled}"
        hide-content-padding-top
        full-height
        fixed-footer
        header-text="${this.t("bbva-feature-member-get-member-map-modal-header-text")}"
        @help-modal-footer-button-click="${this._shareAddressResult}"
        @help-modal-close="${this._onCloseMapModal}"
        @header-main-icon-click="${e=>e.stopPropagation()}">
        <div slot="slot-content" class="slotted-map">
          ${this._renderMap()}
          ${this._checkIfAddressIsNotEmpty?this._notificationContextual:""}
        </div>
      </bbva-help-modal>
    `}render(){return s`
      ${this._getMapModal}
    `}}customElements.define(Z.is,Z);var Y=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.cta {
  margin: 1rem 0 0;
}

.form-input-container {
  margin-bottom: 1rem;
}

.divider {
  margin: 0.5rem 0;
}
`;class X extends(d(l(m(t(a))))){static get is(){return"member-get-member-address"}static get scopedElements(){const e=[p,x,c,O,N,A,Z,z,W,...X.configurationScopedElements()];return X.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},placesApiVersion:{type:String,attribute:"places-api-version"},addressInformation:{type:Object},isMapModalOpen:{type:Boolean},isInformativeMapModalOpen:{type:Boolean},_neighborhoods:{type:Array},_postalCodeInvalid:{type:Boolean},_ctaDisabled:{type:Boolean},_isAddressRequested:{type:Boolean},modalRetryCounters:{type:Object},maxRetries:{type:Number}}}constructor(){super(),this.config={header:!1,loader:{ambient:this.ambient},notify:!1,back:!1},this.apiKey="",this._resetProperties(),this.modalRetryCounters={postalCodeErrorRetry:0},this.maxRetries=3}static get styles(){return[Y,u.primary,g.primary,T.primary,T.primaryAlt,S.primary,v.primary,v.primaryAlt,L.primary,L.primaryAlt,M.primary,r("member-get-member-address-shared-styles")]}reset(){this._resetProperties(),this._addressFinderModal.reset(),this._resetFields()}_resetProperties(){this.isMapModalOpen=!1,this.isInformativeMapModalOpen=!1,this.addressInformation={},this._neighborhoods=[],this._postalCodeInvalid=!1,this._ctaDisabled=!0,this._isAddressRequested=!1}_resetFields(){[...this.shadowRoot.querySelectorAll('[data-tag-name^="bbva-form"]')].reverse().forEach((e=>{e.value=""}))}async updated(e){super.updated(e),e.has("_neighborhoods")&&this._colonyField&&(this._colonyField.items=this._neighborhoods,this._colonyField.disabled=0===this._neighborhoods.length,await this.requestUpdate(),this._validateAddressInformation({target:this._colonyField})),this._postalCodeField&&this.addressInformation.postalCode&&!this._isAddressRequested&&this._searchPostalCode({target:this._postalCodeField})}firstUpdated(e){super.firstUpdated(e),this._addressFinderModal=this.shadowRoot.querySelector('[data-tag-name="member-get-member-address-finder-modal"]'),this._placesApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-places-api-dm"]'),this._postalCodeField=this.shadowRoot.querySelector("#postalCode"),this._colonyField=this.shadowRoot.querySelector("#colony"),this._modalHelp=this.shadowRoot.querySelector('[data-tag-name="bbva-feature-member-get-member-credit-card-help-modal"]')}_saveAddressInformation(e){const{name:t,value:a}=e.target,{addressInformation:r}=this;this.addressInformation={...r,[t]:a}}get _displayAddressInputs(){return s`
      <bbva-form-input
        name="street"
        type="text" 
        label="${this.t("bbva-feature-member-get-member-address-step-street")}"
        class="form-input-container"
        pattern="^[0-9a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\-. ]{1,100}$"
        @form-field-input-validate="${this._validateAddressInformation}"
        @form-input-value-change="${this._saveAddressInformation}"
        maxlength="100"
        ambient="${this.ambient}"
        auto-validate
        value="${this.addressInformation&&this.addressInformation.street?this.addressInformation.street:""}">
      </bbva-form-input>

      <bbva-form-input
        name="externalNumber"
        type="text"
        label="${this.t("bbva-feature-member-get-member-address-step-street-address")}"
        @form-field-input-validate="${this._validateAddressInformation}"
        @form-input-value-change="${this._saveAddressInformation}"
        class="form-input-container"
        pattern="^[0-9a-zA-Z\\-]{1,5}$"
        maxlength="5"
        ambient="${this.ambient}"
        auto-validate
        value="${this.addressInformation&&this.addressInformation.externalNumber?this.addressInformation.externalNumber:""}">
      </bbva-form-input>

      <bbva-form-input
        name="internalNumber"
        type="text"
        optional-label="${this.t("bbva-feature-member-get-member-address-step-apartment-number-optional")}"
        label="${this.t("bbva-feature-member-get-member-address-step-apartment-number")}"
        @form-field-input-validate="${this._validateAddressInformation}"
        @form-input-value-change="${this._saveAddressInformation}"
        class="form-input-container"
        pattern="^[0-9a-zA-Z\\-]{1,5}$"
        maxlength="5"
        ambient="${this.ambient}"
        value="${this.addressInformation&&this.addressInformation.internalNumber?this.addressInformation.internalNumber:""}">
      </bbva-form-input>

      <bbva-form-input
        name="postalCode"
        id="postalCode"
        class="form-input-container"
        @form-field-input-validate="${this._validateAddressInformation}"
        type="text"
        mode-input="numeric"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-address-step-postal-code")}"
        allowed-pattern="[0-9]"
        pattern="\\d{5}"
        maxlength="5"
        auto-validate
        @form-input-value-change="${this._searchPostalCode}"
        error-message="${this._getPostalCodeErrorMessage(this._postalCodeInvalid)}"
        value="${this.addressInformation&&this.addressInformation.postalCode?this.addressInformation.postalCode:""}">
      </bbva-form-input>

      <bbva-form-select
        name="neighborhood"
        id="colony"
        label="${this.t("bbva-feature-member-get-member-address-step-colony")}" 
        @bbva-form-select-selected-item="${this._saveAddressInformation}"
        @change="${this._validateAddressInformation}"
        ambient="${this.ambient}"
        optional-label=""
        disabled
        auto-validate>
      </bbva-form-select>
    `}get _municipalityState(){const{municipality:e,state:t}=this.addressInformation;return e&&t?s`
      <bbva-type-text
        size="S"
        inherit
        ambient="${this.ambient}"
        text="${this.t("bbva-feature-member-get-member-address-step-municipaly-label")}">
      </bbva-type-text>

      <bbva-type-text
        size="S"
        inherit
        ambient="${this.ambient}"
        text="${e}">
      </bbva-type-text>

      <div class="divider">
        <bbva-divider-default size="full" ambient="${this.ambient}"></bbva-divider-default>
      </div>

      <bbva-type-text
        size="S"
        inherit
        ambient="${this.ambient}"
        text="${this.t("bbva-feature-member-get-member-address-step-state-label")}">
      </bbva-type-text>

      <bbva-type-text
        size="S"
        inherit
        ambient="${this.ambient}"
        text="${t}">
      </bbva-type-text>
    `:""}_showMapModalError(e){this._modalHelp.openModal(e.detail)}_onCloseMapModal(e){e.stopPropagation(),this._hideAddressFinder()}render(){return s`
      ${super.render()}

      <bbva-global-places-api-dm
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        version="${this.placesApiVersion}"
        cachetype="NONE"
        @places-api-dm-fetch="${this._onFetchPlacesApiDm}"
        @places-api-dm-fetch-error="${this._onFetchErrorPlacesApiDm}"
        @api-dm-error="${this._onFetchErrorPlacesApiDm}">
      </bbva-global-places-api-dm>

      <member-get-member-address-finder-modal
        api-key="${this.apiKey}"
        ambient="${this.ambient}"
        ?isMapModalOpen="${this.isMapModalOpen}"
        @close-map-modal="${this._hideAddressFinder}"
        @member-get-member-address-finder-modal-address-not-found="${this._showMapModalError}"
        @map-address-result="${this._onFetchMapAddressResult}">
      </member-get-member-address-finder-modal>

      <bbva-type-link
        ambient="${this.ambient}"
        class="form-input-container"
        text="${this.t("bbva-feature-member-get-member-map-modal-header-text")}"
        @click="${this._showInformativeMapModal}"></bbva-type-link>

      ${this._displayAddressInputs}

      ${this._municipalityState}

      ${this.cta(this.t("bbva-feature-member-get-member-address-step-cta"),this._onClickCta.bind(this,this.addressInformation))}

      <bbva-feature-member-get-member-credit-card-help-modal
        @close-modal="${this._onCloseMapModal}"
        @help-modal-map-search-address-not-found="${this._onCloseMapModal}"
        @help-modal-show-address-finder="${this._showAddressFinder}">
      </bbva-feature-member-get-member-credit-card-help-modal>
    `}_validateAddressInformation(e){const{name:t}=e.target,{invalid:a}=e.detail||{},{internalNumber:r,...s}=this.addressInformation,i=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-input"]'),o=this.shadowRoot.querySelector('[data-tag-name="bbva-form-select"]'),n=[...i].filter((e=>e.name!==t));this._ctaDisabled=a||this._hasInvalidInputs(n)||this._hasEmptyValues(s,i)||!this._hasItemSelected(o)}_hasEmptyValues(e,t){const a=Object.values(e);return!a.length||a.length<t.length||a.some((e=>""===e))}_hasInvalidInputs(e){return e.some((e=>e.invalid))}_hasItemSelected(e){return!!e.selectedOption}cta(e,t){return s`
      <bbva-button-default
        class="cta"
        fullwidth
        ambient="${this.ambient}"
        ?disabled="${this._ctaDisabled}"
        text="${e}"
        @click=${t}>
      </bbva-button-default>
    `}_getPostalCodeErrorMessage(e){return e?this.t("bbva-feature-member-get-member-address-field-postalcode-error-message-invalid"):this.t("bbva-feature-member-get-member-address-field-postalcode-error-message")}_searchPostalCode(e){const{value:t}=e.target;t&&5===t.length?(this.showLoader("transparent"),this._placesApiDm.getPlaces({zipCode:t}),this._isAddressRequested=!0):this._saveFormData({postalCode:"",state:"",municipality:"",neighborhood:""}),this._neighborhoods=[],this._postalCodeInvalid=!1}_saveFormData(e){const{addressInformation:t}=this;this.addressInformation={...t,...e}}async _onFetchPlacesApiDm(e){const t=e.detail,a=this._getAddressFromGeographicPlaces(t),r=this._getNeighborhoodsList(t,this.addressInformation.neighborhood);if(a&&r.length){const{postalCode:e,state:t,municipality:s}=a;this._saveFormData({postalCode:e,state:t,municipality:s}),this._neighborhoods=r}else this._showInvalidPostalCode();this.clearLoader(),await this.requestUpdate()}_getAddressFromGeographicPlaces(e){let t;if(e&&e.length){var a,r,s,i,o;const n=null===(a=e[0])||void 0===a?void 0:a.zipCode,d=null===(r=e[0])||void 0===r||null===(s=r.state)||void 0===s?void 0:s.id,l=null===(i=e[0])||void 0===i||null===(o=i.geographicPlaceTypes.find((e=>"MUNICIPALITY"===e.id)))||void 0===o?void 0:o.value;n&&d&&l&&(t={postalCode:n,state:d,municipality:l})}return t}_getNeighborhoodsList(e,t){return e&&e.length?e.map((e=>{const{name:a}=e;return{value:a,text:a,selected:a===t}})):[]}_showInvalidPostalCode(){this._postalCodeField.invalid=!0,this._postalCodeInvalid=!0}_onFetchErrorPlacesApiDm(e){this.clearLoader(),this.modalRetryCounters.postalCodeErrorRetry+=1,this.modalRetryCounters.postalCodeErrorRetry<=this.maxRetries?this._modalHelp.openModal("postalCodeRegistrationErrorRetry"):(this._modalHelp.openModal("postalCodeRegistrationError"),this.dispatchEvent(new CustomEvent("member-get-member-tdc-error-postal-code",{bubbles:!0,composed:!0})))}_showInformativeMapModal(){this._modalHelp.openModal("mapSearchInfo")}_showAddressFinder(){this.isMapModalOpen=!0,this.dispatchEvent(new CustomEvent("member-get-member-tdc-address-finder-modal",{bubbles:!0,composed:!0}))}_hideAddressFinder(){this.isMapModalOpen=!1,this.isInformativeMapModalOpen=!1}_onFetchMapAddressResult(e){this._resetProperties(),this._saveFormData(this._parseMapAddressResult(e.detail))}_parseMapAddressResult(e){return{street:e.street,externalNumber:e.externalNumber,internalNumber:"",postalCode:e.cp,neighborhood:e.colony,state:e.state}}_onClickCta(e){this.dispatchEvent(new CustomEvent("cta-clicked",{bubbles:!0,composed:!0,detail:e}))}}customElements.define(X.is,X);var J=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}
`;class Q extends(d(l(m(t(a))))){static get is(){return"member-get-member-address-summary"}static get scopedElements(){const e=[c,...Q.configurationScopedElements()];return Q.scopedElementsFromClasses(e)}static get properties(){return{addressInformation:{type:Object}}}constructor(){super(),this.addressInformation={},this.reset()}static get styles(){return[J,v.primary,v.primaryAlt,r("member-get-member-address-summary-shared-styles")]}reset(){this.addressInformation={}}updated(e){super.updated(e)}get _getAddress(){const{street:e="",externalNumber:t="",internalNumber:a="",neighborhood:r="",postalCode:s="",municipality:i="",state:o=""}=this.addressInformation;return`${e} ${t}, ${""!==a?`${a},`:""} ${r}, ${s}, ${i}, ${o}`}get _summaryAddress(){return s`
      <div class="summary-container">
        <bbva-type-text
          size="S"
          inherit
          text="${this.t("bbva-feature-member-get-member-address-summary-title")}"
          ambient="${this.ambient}">
        </bbva-type-text>
        <bbva-type-text
          size="S"
          inherit
          text="${this._getAddress}"
          ambient="${this.ambient}">
        </bbva-type-text>
      </div>
    `}render(){return s`
      ${this._summaryAddress}
    `}}customElements.define(Q.is,Q);var ee=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container--custom--primary-ambient--content-bg-color: ${I("colorPrimaryAltSurfaceAmbientDefault",R)};
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.confirm-step {
  background-color: ${I("colorPrimaryAltSurfaceAmbientDefault",R)};
  width: 100%;
  padding: 1rem;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
  --bbva-transition-container-text-align: normal;
}
`;class te extends(d(l(m(t(a))))){static get is(){return"bbva-feature-member-get-member-credit-card"}static get scopedElements(){const e=[p,P,F,V,K,X,Q,w,D,c,W,k,...te.configurationScopedElements()];return te.scopedElementsFromClasses(e)}static get properties(){return{offerId:{type:String,attribute:"offer-id"},originId:{type:String,attribute:"origin-id"},apiKey:{type:String,attribute:"api-key"},placesApiVersion:{type:String,attribute:"places-api-version"},loyaltyApiVersion:{type:String,attribute:"loyalty-api-version"},personalInformation:{type:Object},addressInformation:{type:Object},receiptData:{type:Object},_receiptVisible:{type:Boolean},_personalStepCompleted:{type:Boolean},_addressStepCompleted:{type:Boolean},_specificPersonalStepScroll:{type:Boolean},rfc:{type:String},preEvaluatorFlagEnabled:{type:Boolean},modalRetryCounters:{type:Object},maxRetries:{type:Number},calendarData:{type:Object},customerId:{type:String},referredUsers:{type:Number},pageViewLoad:{type:Boolean},requiredToken:{type:String},initPageOnce:{type:Boolean}}}constructor(){super(),this.config={header:{variant:this._getHeaderType(),text:this.t("bbva-feature-member-get-member-credit-card-header-title"),buttons:[{id:"btn-close",icon:"bbva:close",name:"Close",accessibilityText:this.t("bbva-feature-member-get-member-credit-card-header-button-close-accessibility-text")}],showLeftICon:!1,"@header-main-icon-click":this._onClickHeaderMainIcon.bind(this)},loader:!0,notify:!1,back:!1,fixedHeader:!0},this.pageViewLoad=!1,this.apiKey="",this.headerShowLeftIcon=!1,this.ambient="primary-alt",this.offerId="",this.originId="",this.placesApiVersion="1",this.loyaltyApiVersion="0",this.preEvaluatorFlagEnabled=!1,this._headerType="",this.receiptData={},this.customerId="",this._resetProperties(),this.modalRetryCounters={referredRegistrationErrorRetry:0},this.maxRetries=3,this.requiredToken="",this.referredUsers=0,this.initPageOnce=!1}static get styles(){return[ee,g.primary,g.primaryAlt,u.primary,u.primaryAlt,$.primary,$.primaryAlt,v.primary,v.primaryAlt,r("bbva-feature-member-get-member-credit-card-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this._resetSteps(),this._showForm(),this.pageViewLoad=!0,this._referralMembersApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-referral-members-api-dm"]'),this._modalHelp=this.shadowRoot.querySelector('[data-tag-name="bbva-feature-member-get-member-credit-card-help-modal"]')}updated(e){super.updated(e),e.has("_specificPersonalStepScroll")&&(this._header.variant=this._getHeaderType(this._specificPersonalStepScroll))}loadPersonalStep(){this.initPageOnce||this.dispatchEvent(new CustomEvent("member-get-member-tdc-personal-form-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers})),this.initPageOnce=!0}getFeatureFlags(e){e["glomo.dynamicsAndRewards.preEvaluator"]&&(this.preEvaluatorFlagEnabled=e["glomo.dynamicsAndRewards.preEvaluator"].value)}getClientId(e){this.customerId=(null==e?void 0:e.grantingTicketUserId)||""}reset(){this._resetProperties(),this._resetSteps(),this._resetPages(),this._showForm()}_resetProperties(){this.receiptData={},this.personalInformation={},this.addressInformation={},this._personalStepCompleted=!1,this._addressStepCompleted=!1,this._specificPersonalStepScroll=!1,this.rfc="",this.calendarData={},this.initPageOnce=!1,this.modalRetryCounters={referredRegistrationErrorRetry:0}}_resetSteps(){const e=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]'),t=Array.prototype.slice.call(e);t.forEach(((e,a)=>{const r=e;r.completed=!1,r.disabled=!!a,r.active=!a,r.step=a,r.totalSteps=t.length,r.currentStepLabel=this.t("bbva-feature-member-get-member-current-step-heading",{step:e.step+1,total:e.totalSteps})}))}_resetPages(){const e=this.shadowRoot.querySelectorAll('[data-tag-name^="member-get-member-"]');Array.prototype.slice.call(e).forEach((e=>e.reset()))}get _header(){return this.shadowRoot.querySelector('[data-tag-name="bbva-header-main"]')}_showForm(){this._receiptVisible=!1}_showReceipt(){this._receiptVisible=!0,this.referredUsers+=1,this.dispatchEvent(new CustomEvent("member-get-member-receipt-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers}))}async _onClickHeaderMainIcon(e){this.dispatchEvent(new CustomEvent("member-get-member-credit-card-exit-clicked",{bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("member-get-member-credit-card-navigation-external",{detail:{id:e.type},bubbles:!0,composed:!0})),await this.reset()}_onSpecificStepScroll(e){var t;const a=null===(t=e.detail)||void 0===t?void 0:t.completed;this._header.variant=a?"modal-initial-secondary":"modal-initial",this._header.requestUpdate()}_getHeaderType(e){return e?"modal-initial-secondary":"modal-initial"}_onClickCtaPersonalStep(e){if(this.preEvaluatorFlagEnabled){const t={name:e.detail.name,firstSurname:e.detail.firstLastName,secondSurname:e.detail.secondLastName,birthDate:e.detail.birthdate};this.dispatchEvent(new CustomEvent("bbva-member-get-member-credit-card-personal-information",{detail:t,bubbles:!0,composed:!0}))}this.personalInformation=e.detail,this._personalStepCompleted=!0,requestAnimationFrame((()=>{this._header.variant="modal-initial-secondary",this._header.requestUpdate()})),this.dispatchEvent(new CustomEvent("member-get-member-tdc-address-form-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers}))}_onChangeCompletePersonalStep(e){this._personalStepCompleted=e.detail}_getHeaderPersonalStep(e){return this.t(e?"bbva-feature-member-get-member-personal-step-header-completed":"bbva-feature-member-get-member-personal-step-header")}_onClickCtaAddressStep(e){this.addressInformation=e.detail,this._addressStepCompleted=!0}_onChangeCompleteAddressStep(e){this._addressStepCompleted=e.detail}_getHeaderAddressStep(e){return this.t(e?"bbva-feature-member-get-member-address-step-header-completed":"bbva-feature-member-get-member-address-step-header")}_onClickCta(){this.showLoader("transparent");const e=this._createReferralMemderBody(this.offerId,this.personalInformation,this.addressInformation);this._referralMembersApiDm.postReferralMembers(e)}_onCreateReferralMembersApiDm(e){this.receiptData=this._createReceiptData(e.detail),this.clearLoader(),this._showReceipt()}_onCreateErrorReferralMembersApiDm(){this.clearLoader(),this.modalRetryCounters.referredRegistrationErrorRetry+=1,this.modalRetryCounters.referredRegistrationErrorRetry<=this.maxRetries?this._modalHelp.openModal("referredRegistrationErrorRetry"):(this._modalHelp.openModal("registrationErrorFullModal"),this.dispatchEvent(new CustomEvent("member-get-member-referred-error",{bubbles:!0,composed:!0})))}_createReferralMemderBody(e,t,a){const r=a.internalNumber?`${a.internalNumber}, `:"",s=`${a.street} ${a.externalNumber}, ${r} ${a.neighborhood}, ${a.municipality}, ${a.postalCode}, ${a.state}`,{rfc:i=""}=this.rfc||{};return{firstName:t.name,lastName:t.firstLastName,secondLastName:t.secondLastName,identityDocuments:[{documentType:{id:"RFC"},documentNumber:""!==i?i:"RFC"}],contactDetails:[{contact:{contactDetailType:"EMAIL",address:t.email}}],relatedParticipant:{customerId:this.customerId},birthData:{birthDate:t.birthdate},addresses:[{addressType:{id:"LEGAL"},locationTypes:["HOME"],location:{formattedAddress:s,addressComponents:[{name:a.street,componentTypes:["STREET"]},{code:a.externalNumber,componentTypes:["EXTERIOR_NUMBER"]},{code:a.internalNumber?a.internalNumber:"",componentTypes:["INTERIOR_NUMBER"]},{name:a.state,componentTypes:["STATE"]},{name:a.municipality,componentTypes:["MUNICIPALITY"]},{name:a.municipality,componentTypes:["CITY"]},{code:a.postalCode,componentTypes:["POSTAL_CODE"]},{name:a.neighborhood,componentTypes:["NEIGHBORHOOD"]}]}}],origin:{id:this.originId},offer:{id:e}}}get addressProperties(){return{STREET:{label:"street"},EXTERIOR_NUMBER:{label:"exterior_number"},INTERIOR_NUMBER:{label:"interior_number"},NEIGHBORHOOD:{label:"colony"},MUNICIPALITY:{label:"municipality"},POSTAL_CODE:{label:"postal_code"},STATE:{label:"state"}}}_parseFormattedAddress(e){return e.reduce(((e,t)=>{let a=e;const r=t.componentTypes.find((e=>this.addressProperties[e]));return r&&(a+=`${["STREET","EXTERIOR_NUMBER","INTERIOR_NUMBER"].includes(r)?"":","} ${t.name||t.code}`),a}),"")}_createReceiptData(e){const{firstName:t,lastName:a,secondLastName:r,contactDetails:s,birthData:i,addresses:o}=e,n=(new Date).toLocaleDateString(this.language,{year:"numeric",month:"long",day:"2-digit",hour:"2-digit",minute:"2-digit",hour12:!1}),d=s.find((e=>{var t;return"EMAIL"===(null==e||null===(t=e.contact)||void 0===t?void 0:t.contactDetailType)})).contact.address,l=new Date(`${i.birthDate}T00:00:00`).toLocaleDateString(this.language,{year:"numeric",month:"2-digit",day:"2-digit"}),m=(o.find((e=>e.location)).location||{}).addressComponents||[];return{headerContent:{microillustration:{name:"success",size:"M"},textContent:[{text:"bbva-feature-member-get-member-credit-card-receipt-success-title",size:"3XL",fontWeight:"700"},{text:`${n}h`,size:"S",fontStyle:"italic",inherit:!0},{text:"bbva-feature-member-get-member-credit-card-receipt-success-info",size:"S"}]},summaryHeader:{text:"bbva-feature-member-get-member-credit-card-receipt-summary-title",fontWeight:"500"},summaryContent:[[{text:"bbva-feature-member-get-member-credit-card-receipt-success-user-data-name",size:"S",inherit:!0},{text:`${t} ${a} ${r}`,size:"S",inherit:!0}],[{text:"bbva-feature-member-get-member-credit-card-receipt-success-user-data-mail",size:"S",inherit:!0},{text:d,size:"S",inherit:!0,obfuscate:!0}],[{text:"bbva-feature-member-get-member-credit-card-receipt-success-user-data-date",size:"S",inherit:!0},{text:l,size:"S",inherit:!0}],[{text:"bbva-feature-member-get-member-credit-card-receipt-success-user-data-address",size:"S",inherit:!0},{text:this._parseFormattedAddress(m),size:"S",inherit:!0}]],buttonDefault:{id:"button-default-credit-card",text:"bbva-feature-member-get-member-credit-card-receipt-button",fullwidth:!0},typeLink:{id:"type-link-credit-card",text:"bbva-feature-member-get-member-credit-card-receipt-secondary-button"}}}_onClickCtaReceipt(){this.pageViewLoad=!1,this.requestUpdate(),this.dispatchEvent(new CustomEvent("bbva-feature-member-get-member-credit-card-add-other-referral",{bubbles:!0,composed:!0,detail:this.referredUsers})),this.reset()}_onClickLinkReceipt(e){this.dispatchEvent(new CustomEvent("member-get-member-credit-card-exit-clicked",{bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("member-get-member-credit-card-navigation-external",{detail:{id:e.type},bubbles:!0,composed:!0})),this.reset()}_onFiredCalendar(e){this.dispatchEvent(new CustomEvent("launch-date-picker",e.detail))}_allStepsCompleted(e){const t=e.detail;t&&(this._header.variant=this._getHeaderType(t),this.dispatchEvent(new CustomEvent("member-get-member-summary-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers})))}get _getFormTemplate(){return s`
      <bbva-expandable-multistep
        ambient="${this.ambient}"
        ?edition-enabled="${this._personalStepCompleted||this._addressStepCompleted}"
        @expandable-multistep-specific-step-scroll="${this._onSpecificStepScroll}"
        @expandable-multistep-all-complete="${this._allStepsCompleted}">

        <div slot="content">

          <bbva-expandable-step
            id="personal"
            class="animation"
            ambient="${this.ambient}"
            header="${this._getHeaderPersonalStep(this._personalStepCompleted)}"
            edit-label="${this.t("bbva-feature-member-get-member-personal-step-edit")}"
            disabled-target=".action"
            show-link
            ?completed="${this._personalStepCompleted}"
            @expandable-step-complete-change="${this._onChangeCompletePersonalStep}">

            <div class="content">
              <member-get-member-personal
                .descriptionStep="${this.t("bbva-feature-member-get-member-personal-description-step")}"
                .calendarData="${this.calendarData}"
                ?pageViewLoad="${this.pageViewLoad}"
                ambient="${this.ambient}"
                referred-users="${this.referredUsers}"
                @cta-clicked="${this._onClickCtaPersonalStep}">
              </member-get-member-personal>
            </div>

            <div class="summary" slot="summary">
              <member-get-member-personal-summary
                ambient="secondary"
                .personalInformation="${this.personalInformation}">
              </member-get-member-personal-summary>
            </div>

          </bbva-expandable-step>

          <bbva-expandable-step
            id="address"
            class="animation"
            ambient="${this.ambient}"
            header="${this._getHeaderAddressStep(this._addressStepCompleted)}"
            edit-label="${this.t("bbva-feature-member-get-member-address-step-edit")}"
            disabled-target=".action"
            show-link
            ?completed="${this._addressStepCompleted}"
            @expandable-step-complete-change="${this._onChangeCompleteAddressStep}">

            <div class="content">
              <member-get-member-address
                api-key="${this.apiKey}"
                host="${this.host}"
                ?native="${this.native}"
                required-token="${this.requiredToken}"
                places-api-version="${this.placesApiVersion}"
                ambient="${this.ambient}"
                @cta-clicked="${this._onClickCtaAddressStep}">
              </member-get-member-address>
            </div>

            <div class="summary" slot="summary">
              <member-get-member-address-summary
                ambient="secondary"
                .addressInformation="${this.addressInformation}">
              </member-get-member-address-summary>
            </div>

          </bbva-expandable-step>

        </div>

        <div class="confirm-step" slot="confirmation">
          <bbva-button-default
            ambient="${this.ambient}"
            fullwidth
            variant="positive"
            @click=${this._onClickCta}
            text="${this.t("bbva-feature-member-get-member-form-cta")}">
          </bbva-button-default>
        </div>
      </bbva-expandable-multistep>
    `}get _getReceiptTemplate(){return s`
      <bbva-transition-container
        header-type="modal-initial"
        header-text="${this.t("bbva-feature-member-get-member-credit-card-header-title")}"
        ?visible="${this._receiptVisible}"
        ambient="${this.ambient}"
        @header-main-icon-click="${this._onClickHeaderMainIcon}">
        <div slot="slot-content" class="slot-content">
          <bbva-widget-member-get-member-receipt
            .receiptData="${this.receiptData}"
            data-acoustic-obfuscate
            ambient="${this.ambient}"
            @cta-clicked-type-link-credit-card="${this._onClickLinkReceipt}"
            @cta-clicked-button-default-credit-card="${this._onClickCtaReceipt}">
          </bbva-widget-member-get-member-receipt>
        </div>
      </bbva-transition-container>
    `}render(){return s`
      ${super.render()}

      <bbva-global-referral-members-api-dm
        id="referralMembers"
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        version="${this.loyaltyApiVersion}"
        cachetype="NONE"
        @referral-members-api-dm-create="${this._onCreateReferralMembersApiDm}"
        @referral-members-api-dm-create-error="${this._onCreateErrorReferralMembersApiDm}"
        @api-dm-error="${this._onCreateErrorReferralMembersApiDm}">
      </bbva-global-referral-members-api-dm>

      ${this._getFormTemplate}

      ${this._getReceiptTemplate}

      <bbva-feature-member-get-member-credit-card-help-modal>
      </bbva-feature-member-get-member-credit-card-help-modal>
    `}}customElements.define(te.is,te),customElements.define(W.is,W);class ae extends(U(a)){static get is(){return"bbva-analyticmanager-member-get-member-tdc"}static get properties(){return{}}fireAppPersonalFormStepPage(e){const t={customFields:`usuario agregado:${e}`};this._dispatch("analytics-app-personal-form-step",t)}fireAppAddressFormStepPage(e){const t={customFields:`usuario agregado:${e}`};this._dispatch("analytics-app-address-form-step",t)}fireAppSummaryStepPage(e){const t={customFields:`usuario agregado:${e}`};this._dispatch("analytics-app-summary-step",t)}fireAppCompleted(e){const t={customFields:`usuario agregado:${e}`};this._dispatch("analytics-app-completed-step",t)}firePageFinderModal(){this._dispatch("analytics-app-finder-modal-step")}fireFinderModalErrorPageView(){this._dispatch("analytics-finder-modal-error-page-view")}firePostalCodeErrorPageView(){this._dispatch("analytics-postal-code-error-page-view")}fireReferredErrorPageView(){this._dispatch("analytics-referred-error-page-view")}fireInviteOtherReferral(e){const t={customFields:`usuario agregado:${e}`};this._dispatch("analytics-on-click-start-invite-other-referral",t)}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(ae.is,ae);var re=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const se={0:0,1:1,2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9,A:10,B:11,C:12,D:13,E:14,F:15,G:16,H:17,I:18,J:19,K:20,L:21,M:22,N:23,"&":24,O:25,P:26,Q:27,R:28,S:29,T:30,U:31,V:32,W:33,X:34,Y:35,Z:36," ":37,"Ñ":38},ie={" ":"00",0:"00",1:"01",2:"02",3:"03",4:"04",5:"05",6:"06",7:"07",8:"08",9:"09","&":"10",A:"11",B:"12",C:"13",D:"14",E:"15",F:"16",G:"17",H:"18",I:"19",J:"21",K:"22",L:"23",M:"24",N:"25",O:"26",P:"27",Q:"28",R:"29",S:"32",T:"33",U:"34",V:"35",W:"36",X:"37",Y:"38",Z:"39","Ñ":"40"};class oe extends a{static get is(){return"bbva-technicalcore-mx-rfc-calculator"}static get properties(){return{data:{type:Object},_rfc:{type:String},_assignmentDigits:{type:Object},_nameToRfcKeys:{type:Object},_alphanumeric:{type:Object}}}constructor(){super(),this.data={},this._rfc="",this._assignmentDigits=se,this._nameToRfcKeys=ie,this._alphanumeric="123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"}static get styles(){return[re,r("bbva-technicalcore-mx-rfc-calculator-shared-styles")]}async getRfc(e){if(e.name){const t=await oe._alphaKey(e.name,e.firstSurname,e.secondSurname),a=await oe._inconvenientWord(t),r=await oe._dateKey(e.birthDate),s=await this._homoclaveRfc(e.name,e.firstSurname,e.secondSurname),i=a+r+s+await this._checkDigitRfc(a+r+s);this._rfc=i,this.dispatchEvent(new CustomEvent("bbva-technical-core-rfc-data",{bubbles:!0,composed:!0,detail:{rfc:i}}))}else this.dispatchEvent(new CustomEvent("error-setting-rfc",{bubbles:!0,composed:!0}))}static _dateKey(e){return new Promise(((t,a)=>{const[r,s,i]=e.split(/[/-]/gi);r&&s&&i||a(new Error("Wrong birth date format")),r.length>2?t(r.slice(-2)+s+i):t(i.slice(-2)+s+r)}))}static _alphaKey(e,t,a){return new Promise(((r,s)=>{e&&(t||a)||s(new Error("Wrong or missing data"));const i=oe._parseString(e),o=oe._parseString(t),n=oe._parseString(a),d=oe._missingName(o),l=oe._missingName(n),m=oe._isShortSurname(o),p=oe._replaceCommonNames(i);r(d?n.substring(0,2)+p.substring(0,2):l?o.substring(0,2)+p.substring(0,2):m?o.charAt(0)+n.charAt(0)+p.substring(0,2):o.charAt(0)+oe._firstVowel(o)+n.charAt(0)+oe._replaceCommonNames(i).charAt(0))}))}static _missingName(e){return!(e.length>0&&!!e)||!("string"==typeof e)}static _replaceCommonNames(e){return e.split(" ").length>1?e.replace(/^(JOSE|J|J\.|MARIA|MA|MA\.)\s+/i,""):e}static _isShortSurname(e){return oe._parseString(e).length<=2}static _firstVowel(e){const t=/[aeiou]/i.exec(e.slice(1));return t?t[0]:""}static _inconvenientWord(e){return new Promise(((t,a)=>{""===e&&a(new Error("Name is empty"));t(e.match(/(BUE[IY]|CAC[AO]|CAGA|KOGE|KAKA|MAME|KOJO|[KQ]ULO|CAGO|CO[GJ]E|COJO|FETO|JOTO|KA[CG]O)/)||e.match(/(MAMO|MEAR|M[EI]ON|MOCO|MULA|PED[AO]|PENE|PUT[AO]|RATA|RUIN)/)?`${e.substring(0,3)}X`:e)}))}static _parseString(e){const t=/\s+/g;return oe._removeAccents(e).toUpperCase().replace(t,"  ").replace(oe._unusedWordsRegex(),"").replace(t," ").trim()}static _unusedWordsRegex(){const e=["DE","LA","LAS","MC","VON","DEL","LOS","Y","MAC","VAN","MI"].map((e=>`^${e} | ${e} | ${e}$`)).join("|");return new RegExp(`(?:${e})`,"g")}static _removeAccents(e){return e.normalize("NFD").replace(/[\u0300-\u036f]/g,"")}static _removeAccentsFromFullName(e){return e.toUpperCase().normalize("NFD").replace(/[\u0300-\u0302]/g,"").replace(/[\u0304-\u036f]/g,"").replace(/N\u0303/g,"Ñ").replace(/[-.',]/g,"")}_characterToDigits(e){return this._nameToRfcKeys[e]}static _sumOfAdjacentPairs(e){return e.split("").reduce(((e,t,a,r)=>{const s=r[a+1];if(!s)return e;return e+parseInt(`${t+s}`,10)*parseInt(s,10)}),0)}_homoclaveRfc(e,t,a){return new Promise(((r,s)=>{e&&(t||a)||s(new Error("Wrong or missing data"));const i=`${e} ${t} ${a}`,o=0+oe._removeAccentsFromFullName(i).split("").map((e=>this._characterToDigits(e))).join(""),n=oe._sumOfAdjacentPairs(o),d=n%1e3/34,l=n%1e3%34;r(this._alphanumeric.charAt(d)+this._alphanumeric.charAt(l))}))}static _valueAddition(e){return e.reduce(((e,t,a)=>e+t*(13-a)),0)}_rfcToDigits(e){return e.map((e=>this._assignmentDigits[e.toUpperCase()]||0))}_checkDigitRfc(e){return new Promise(((t,a)=>{e||a(new Error("Wrong or missing data"));const r=this._rfcToDigits(e.split("")),s=oe._valueAddition(r)%11;t(0!==s?(11-s).toString(16).toUpperCase():"0")}))}}customElements.define(oe.is,oe);
