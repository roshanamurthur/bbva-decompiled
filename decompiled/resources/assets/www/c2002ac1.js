import{z as e,a8 as t,a9 as i,cQ as s,h as a,aW as r,aZ as o,J as n,L as l,a7 as d,aX as c,an as h,aN as p,ak as u,av as g,dR as m}from"./952f98a9.js";import{L as b,ax as _,i as f,M as v,f as y,G as k,Q as S,H as F,e as P,x,a6 as T,ap as $,D as E,V as I,z as C,T as O,a5 as w}from"./216055dc.js";import{B as R,b as D}from"./30ef6f1f.js";import{B as A,d as B}from"./ff7f0130.js";import{a as N,B as H,b as q,c as M}from"./e3d898b2.js";import{B as V,b as L}from"./d335c75d.js";import{bf as G,bg as j,bP as U,bQ as z}from"./7f3d7ca9.js";import{B as K,b as W}from"./dd13577a.js";import{B as J,b as X}from"./f9d0fbbe.js";var Q=e`
:host {
  display: block;
  box-sizing: border-box;
  --_feedback-client-voice-connect-form-padding: var(--bbva-feedback-client-voice-connect-form-padding,1rem);
  --bbva-expandable-step-default-content-max-height: 72.5rem;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.feedback-client-voice-connect-container {
  z-index: 101;
  position: relative;
}

[data-tag-name=bbva-progress-content] {
  z-index: 101;
}

.modal-error {
  z-index: 102;
}

.success-toast {
  position: relative;
  z-index: 102;
}

[data-tag-name=bbva-expandable-step][completed] {
  --bbva-type-text--custom--primary-alt-ambient-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-type-icon--custom--primary-alt-ambient--color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
}

[data-tag-name=bbva-expandable-multistep] {
  text-align: left;
}

.margin-top-32 {
  margin-top: 2rem;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.box-flex {
  display: flex;
}

.flex-columns {
  flex-direction: column;
}

.summary-left-space {
  padding-left: 1rem;
}

.button-margin-space {
  width: calc(100% - 16px);
  margin: 1rem 0 0 0.5rem;
}

.box-width-full {
  width: 100%;
}

.margin-head-left {
  margin-left: 0.9375rem;
}

.head-justify-center {
  justify-content: center;
}

.micro-medium {
  width: 5rem;
  height: 5rem;
}

[data-tag-name=bbva-help-modal] {
  --_help-modal-padding-bottom: 0 ;
}

.no-padding-left {
  --bbva-help-modal-padding: 0;
}

.container-field {
  padding: var(--_feedback-client-voice-connect-form-padding) var(--_feedback-client-voice-connect-form-padding) 0 var(--_feedback-client-voice-connect-form-padding);
}

.text-answ-icon {
  width: 100%;
  height: 4rem;
}

.text-answ {
  width: 100%;
}

.size-answer {
  display: flex;
  height: 4rem;
  margin-left: 1rem;
}

.icons {
  padding-top: 0.9375rem;
}

.footer {
  position: fixed;
  bottom: 0;
  width: 100%;
  padding-bottom: 1rem;
}

.select-option {
  display: flex;
  padding-bottom: 0.5rem;
  height: 3rem;
}

.enlarge-step {
  max-height: --bbva-expandable-step-default-content-max-height;
}

.element-hidden {
  display: none;
}

.container-text {
  display: flex;
  align-items: center;
}
.container-text .icon-summary {
  margin-right: 0.5rem;
}

.confirm-step {
  background: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  width: 100%;
  padding: 1.5rem 1rem;
}

.radio-without-icon {
  text-align: left;
  width: 100%;
}

.two-lines {
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
  overflow: hidden;
}

.container-check {
  padding-right: 1.3rem;
  padding-left: 1rem;
}

.top-feedback {
  display: flex;
  flex-wrap: wrap;
  padding-bottom: 1rem;
  justify-content: center;
}

.container-pad {
  padding-bottom: 1.875rem;
}

.responsive-padding {
  padding-inline: 1rem;
  padding-top: 0.5rem;
}

.responsive-padding-2 {
  padding-inline: 1rem;
}

.responsive-margin {
  margin-inline: 1rem;
  margin-top: 0.5rem;
}

.button-width-responsive-margin {
  width: calc(100% - 2rem);
}

.micro-small {
  width: 2.5rem;
  height: 2.5rem;
  padding-right: 0;
  display: flex;
  align-items: end;
}

.color-transparent {
  color: transparent;
}

.container-response-resume {
  display: flex;
  flex-direction: column;
  margin-block: 1rem;
}

.title-response-resume {
  font-weight: 700;
}

.container-answer-response-resume {
  display: flex;
  flex-direction: column;
}

.space-between-ans {
  padding-bottom: 0.5rem;
}

.are-you-sure-icon-color {
  --_help-modal-title-icon-color: var(--colorsTertiaryType4Darkened, ${t(i.tertiaryType4Darkened)});
}

.margin-p-toast {
  margin: 0;
}
`;const Y=e=>class extends e{getProperty(e,t){if(e){const i=e.find((e=>e.key===this.keys[t]));return i&&i.values.length>1?null==i?void 0:i.values:(null==i?void 0:i.values[0])||""}return""}getIcon(e){if(e){return s[e]()}return""}getBbvaFormInput(e){return a`<bbva-form-input
        id="${e.id}"
        class="${this.getProperty(e.options,"class")}"
        name="${e.name}"
        type="${this.getProperty(e.options,"type")}"
        label="${this.translate(this.getProperty,e.options,"label_",this.language)}"
        label-out="${this.getProperty(e.options,"labelOut")}"
        character-counter-label="${this.translate(this.getProperty,e.options,"labelCounter_",this.language)}"
        ?required="${this.getProperty(e.options,"required")}"
        maxlength="${this.getProperty(e.options,"maxlength")}"
        ?hidden="${this.getProperty(e.options,"hidden")}"
        style="${this.getProperty(e.options,"style")}"
        value="${this._chargueValues(e)}"
        validated="${this.validateField(e,this._formData)}"
        ambient="${this.getProperty(e.options,"ambient")}"
        @click=${function(){this._onClickItem(e)}}
        @form-input-value-change=${function(t){this._onChangeHandler(t,e)}}
        @form-textarea-input-clear=${function(){this._onChangeHandler({detail:{value:""}},e)}}
      >
      </bbva-form-input>`}getBbvaButtonDefault(e){return a`<bbva-button-default
        id="${e.id}"
        name="${e.name}"
        class="${this.getProperty(e.options,"class")}"
        text="${this.translate(this.getProperty,e.options,"text_",this.language)}"
        style="${this.getProperty(e.options,"style")}"
        ?disabled="${this.getProperty(e.options,"disabled")}"
        variant="${this.getProperty(e.options,"variant")}"
        aria-label="${this.getProperty(e.options,"arialabel")}"
        @click=${function(){this._onClickItem(e)}}
      ></bbva-button-default>`}getBbvaTypeLink(e){return a`<bbva-type-link
        id="${e.id}"
        name="${e.name}"
        style="${this.getProperty(e.options,"style")}"
        class="${this.getProperty(e.options,"class")}"
        @click=${function(){this._onClickItem(e)}}
        >${this.translate(this.getProperty,e.options,"content_",this.language)}
      </bbva-type-link>`}getBbvaTypeText(e){return a` <div
        class="${this.getProperty(e.options,"class")} container-text"
        role=${this.getProperty(e.options,"role")}
        aria-label="${this.getProperty(e.options,"relationfieldid")?this.getters().getValueByPosition(this.getters().getValueByIdFromFormData(this.getters().getFieldByName(this.core,this.getProperty(e.options,"relationfieldid")).id,this._formData)||0,this.getProperty(e.options,`textaria_${this.language}`)):this.translate(this.getProperty,e.options,"textaria_",this.language)}"
      >
        <div class=${this.getProperty(e.options,"icon")?"":"element-hidden"}>
          <bbva-type-icon
            class="icon-summary"
            icon="${this.getProperty(e.options,"icon")}"
            size="16"
          ></bbva-type-icon>
        </div>
        <bbva-type-text
          id="${e.id}"
          name="${e.name}"
          class="${this.getProperty(e.options,"max_two_lines")?"two-lines":""}"
          text="${this.getProperty(e.options,"relationfieldid")?this.getters().getValueByPosition(this.getters().getValueByIdFromFormData(this.getters().getFieldByName(this.core,this.getProperty(e.options,"relationfieldid")).id,this._formData)||0,this.getProperty(e.options,`text_${this.language}`)):this.translate(this.getProperty,e.options,"text_",this.language)}"
          size="${this.getProperty(e.options,"size")}"
          aria-hidden="${this.getProperty(e.options,"ariahidden")}"
          ?unset="${this.getProperty(e.options,"unset")}"
          style="${this.getProperty(e.options,"style")}"
          font-weight="${this.getProperty(e.options,"font_weight")}"
          ambient-color="${this.getProperty(e.options," ambient_color")}"
          alignment="${this.getProperty(e.options,"alignment")||"left"}"
          @click=${function(){this._onClickItem(e)}}
        ></bbva-type-text>
      </div>`}getBbvaNotification(e){return a` <div
        role=${this.getProperty(e.options,"role")}
        aria-label="${this.translate(this.getProperty,e.options,"textaria_",this.language)}"
      >
        <bbva-notification-message
          id="${e.id}"
          name="${e.name}"
          class="${this.getProperty(e.options,"class")}"
          aria-hidden="${this.getProperty(e.options,"ariahidden")}"
          message-title="${this.translate(this.getProperty,e.options,"message_title_",this.language)}"
          message="${this.translate(this.getProperty,e.options,"message_",this.language)}"
          variant="${this.getProperty(e.options,"variant")}"
          style="${this.getProperty(e.options,"style")}"
          ?book-title="${this.getProperty(e.options,"book_title")}"
          @click=${function(){this._onClickItem(e)}}
        ></bbva-notification-message>
      </div>`}getBbvaHelpModal(e){return a`<bbva-help-modal
        ?hide-content-padding-top="${!!this.getProperty(e.options,"hide_content_padding_top")}"
        aria-label="${e.name}"
        id="${e.id}"
        class="${this.getProperty(e.options,"class")}"
        name="${e.name}"
        header-type="${this.getProperty(e.options,"header_type")}"
        header-text="${this.translate(this.getProperty,e.options,"title_",this.language)}"
        ?visible="${this.isModalVisible(e.name,this._visibleModals)}"
        header-close-icon-aria-label="${this.getProperty(e.options,"headercloseiconarialabel")}"
        ?full-height="${!!this.getProperty(e.options,"full_height")}"
        title-icon="${this.getProperty(e.options,"title_icon")}"
        style="${this.getProperty(e.options,"style")}"
        .fixedFooter="${!!this.getProperty(e.options,"fixed_footer")}"
        button-text="${this.translate(this.getProperty,e.options,"button_text_",this.language)}"
        link-text="${this.translate(this.getProperty,e.options,"link_text_",this.language)}"
        footer-button-aria-label="${this.getProperty(e.options,"footerbuttonarialabel")}"
        .disabledButton=${!this._submitAllowed&&!!this.getProperty(e.options,"isSubmit")}
        @help-modal-header-click=${function(){var t;this.onClickItemModal(e,(null===(t=e.options.find((e=>"headerClickOptions"===e.key)))||void 0===t?void 0:t.values)||[])}}
        @help-modal-footer-button-click=${function(){var t;this.onClickItemModal(e,(null===(t=e.options.find((e=>"buttonClickOptions"===e.key)))||void 0===t?void 0:t.values)||[])}}
        @help-modal-footer-link-click=${function(){var t;this.onClickItemModal(e,(null===(t=e.options.find((e=>"linkClickOptions"===e.key)))||void 0===t?void 0:t.values)||[])}}
        @help-modal-veil-click=${function(){var t;this.onClickItemModal(e,(null===(t=e.options.find((e=>"veilClickOptions"===e.key)))||void 0===t?void 0:t.values)||[])}}
        @help-modal-open=${()=>this._analyticsModalOpened(e)}
        @help-modal-swipe-close="${function(){var t;this.onClickItemModal(e,(null===(t=e.options.find((e=>"scrollOptions"===e.key)))||void 0===t?void 0:t.values)||[])}}"
      >
        <div slot="slot-content">
          <div class="${this.getProperty(e.options,"class")}">
            <slot name="head-image"
              >${r[this.getProperty(e.options,"header_image")]}</slot
            >
          </div>
          ${this.isHeaderTitle(e)} ${this.isHeaderText(e)} ${this.getSlottedFields(e)}
        </div>
      </bbva-help-modal>`}getBbvaFormSelect(e){return a`<bbva-form-select
        id="${e.id}"
        name="${e.name}"
        class="space-between-ans"
        style="${this.getProperty(e.options,"style")}"
        label="${this.translate(this.getProperty,e.options,"label_select_",this.language)}"
        ?disabled="${this.getters().getIndexPageByFiledId(this.core,e.id)!==this.currentPage||this.getters().getStepByFieldName(this.core,this.getters().getIndexPageByFiledName(this.core,e.name),e.name)!==this.currentStep}"
        accessibility-help-text="${this.translate(this.getProperty,e.options,"accessibilityHelpText_",this.language)}"
        optional-label="${this.translate(this.getProperty,e.options,"optionalLabel_",this.language)}"
        required="${this.getProperty(e.options,"required")}"
        value="${this._chargueValues(e)}"
        info-title="${this.translate(this.getProperty,e.options,"text_",this.language)}"
        @click=${function(){this._onClickItem(e)}}
        @bbva-form-select-selected-item=${function(t){this._onChangeHandler(t,e)}}
      >
        ${this.getProperty(e.options,"value").map(((t,i)=>a` <bbva-form-option value=${t}>
              ${this.translate(this.getProperty,e.options,"label_",this.language)[i]}
            </bbva-form-option>`))}
      </bbva-form-select>`}getBbvaTypeMultiRadio(e){return a`<bbva-form-container
        id="${e.id}"
        name="${e.name}"
        style="${this.getProperty(e.options,"style_container")}"
        class="space-between-ans"
        label-out="${this.translate(this.getProperty,e.options,"text_",this.language)}"
        @form-container-radio-input=${function(){this._onClickItem(e)}}
        @form-container-radio-change=${function(t){this._onChangeHandler(t,e)}}
      >
        <div slot="_option" class=${this.getProperty(e.options,"class")}>
          ${this.getProperty(e.options,"value").map(((t,i)=>a` <div
                class="size-answer"
                style="${this.getProperty(e.options,"style_answer")}"
              >
                <div
                  class="${this.getProperty(e.options,"icon")[i]?"icons":"element-hidden"}"
                >
                  <bbva-type-icon
                    icon="${this.getIcon(this.getProperty(e.options,"icon")[i])}"
                    size="16"
                  ></bbva-type-icon>
                </div>
                <div
                  class="${this.getProperty(e.options,"microillustration")[i]?"micro-small":"element-hidden"}"
                >
                  <slot name="micro-small"
                    >${r[this.getProperty(e.options,"microillustration")[i]]}</slot
                  >
                </div>
                <bbva-form-radio-button
                  class="${this.getProperty(e.options,"class_radio")||"text-answ"}"
                  style="${this.getProperty(e.options,"style_input")}"
                  ?checked="${t===this._chargueValues(e)}"
                  ?disabled="${this.getters().getIndexPageByFiledName(this.core,e.name)!==this.currentPage||this.getters().getStepByFieldName(this.core,this.getters().getIndexPageByFiledName(this.core,e.name),e.name)!==this.currentStep}"
                  variant="${this.getProperty(e.options,"variant")||"right"}"
                  name="${e.name}"
                  value="${t}"
                  label="${this.translate(this.getProperty,e.options,"label_",this.language)[i]}"
                  required="${this.getProperty(e.options,"required")}"
                  divider="${this.dividerParse(e.options,"divider")[i]}"
                ></bbva-form-radio-button>
              </div>`))}
        </div>
      </bbva-form-container>`}getMultistepComponent(e){return a`
        <bbva-expandable-multistep
          step-selector='[data-tag-name="bbva-expandable-step"]'
          class="${this.getProperty(e.options,"class")}"
          style="${this.getProperty(e.options,"style")}"
          id="${e.id}"
          @expandable-multistep-specific-step-scroll="${e=>{var t;this._changeHeaderAmbient(null==e||null===(t=e.detail)||void 0===t?void 0:t.completed)}}"
        >
          <div slot="content">${this.getSlottedFields(e)}</div>
          <div class="confirm-step" slot="confirmation" ambient="primary-alt">
            <bbva-button-default
              fullwidth
              variant="positive"
              text="${this.translate(this.getProperty,e.options,"submit_literal_",this.language)}"
              @click=${function(){this._onClickItem(e)}}
            >
            </bbva-button-default>
          </div>
        </bbva-expandable-multistep>
      `}getBbvaTypeMultiCheck(e){return a`<bbva-form-container
        id="${e.id}"
        name="${e.name}"
        label-out="${this.translate(this.getProperty,e.options,"text_",this.language)}"
        style="${this.getProperty(e.options,"style_container")}"
        class="space-between-ans"
        @bbva-form-checkbox-input=${function(){this._onClickItem(e)}}
        @bbva-form-checkbox-input-change=${function(t){this._onChangeHandler(t,e)}}
      >
        <div slot="_option" class="${this.getProperty(e.options,"class")}">
          ${this.getProperty(e.options,"value").map(((t,i)=>a`${this.validationsTypes().shoudHide.call(this,this.core,this.getProperty(e.options,"relationfieldid")[i],this._formData,this.getProperty(e.options,"hiddenbyfielvalue")[i])?"":a`<div
                    class="size-answer"
                    style="${this.getProperty(e.options,"style_container_option")}"
                  >
                    <div
                      class="${this.getProperty(e.options,"icon")[i]?"":"element-hidden"} icons"
                    >
                      <bbva-type-icon
                        icon="${this.getIcon(this.getProperty(e.options,"icon")[i])}"
                        size="16"
                      ></bbva-type-icon>
                    </div>
                    <div
                      class="${this.getProperty(e.options,"microillustration")[i]?"micro-small":"element-hidden"}"
                    >
                      <slot name="micro-small"
                        >${r[this.getProperty(e.options,"microillustration")[i]]}</slot
                      >
                    </div>
                    <bbva-form-checkbox
                      id="id_checkbox_${e.id}-${i}"
                      class="${this.getProperty(e.options,"icon")[i]?"text-answ-icon":"text-answ"}"
                      style="${this.getProperty(e.options,"style_input")}"
                      ?checked="${this._chargueValues(e,t)}"
                      name="${e.name}"
                      value="${t}"
                      label="${this.translate(this.getProperty,e.options,"label_",this.language)[i]}"
                      alignment="${this.getProperty(e.options,"alignment")||"right"}"
                      divider-size="${this.dividerParse(e.options,"dividerSize")[i]}"
                      required="${this.getProperty(e.options,"required")}"
                      ?disabled="${this.isMaxCheck(e,t)}"
                    ></bbva-form-checkbox>
                  </div>`} `))}
        </div>
      </bbva-form-container>`}getBbvaFormRating(e){return a` <div class=${this.getProperty(e.options,"class")}>
        <bbva-form-rating
          id="${e.id}"
          name="${e.name}"
          value="${this._chargueValues(e)}"
          style="${this.getProperty(e.options,"style")}"
          text="${this.translate(this.getProperty,e.options,"rating_value_text_status_",this.language)[this._chargueValues(e)-1]||""}"
          .statusType=${this.getters().getValueByIdFromFormData(e.id,this._formData)<4?"warning":"success"}
          accessibility-text="${this.translate(this.getProperty,e.options,"accessText_",this.language)}"
          @click=${function(){this._onClickItem(e)}}
          @form-rating-value-change=${function(t){this._onChangeHandler({detail:{value:t.detail}},e)}}
        ></bbva-form-rating>
      </div>`}getBbvaButtonGroup(e){return a`<bbva-button-group
        id="${e.id}"
        name="${e.name}"
        class="${this.getProperty(e.options,"class")}"
        selected="${this.getters().getValueByIdFromFormData(e.id,this._formData)}"
        style="${this.getProperty(e.options,"style")}"
        ?disabled="${this.getProperty(e.options,"disabled")}"
        ?stacked="${!!this.getProperty(e.options,"stacked")}"
        ?center="${!!this.getProperty(e.options,"center")}"
        variant="${this.getProperty(e.options,"variant")}"
        ambient="primary-alt"
        ?hasEllipsis="${this.getProperty(e.options,"ellipsis")}"
        .items=${"0"===this.getters().getValueByIdFromFormData(e.id,this._formData)?this.getProperty(e.options,"items").map((e=>({text:e,value:e}))):this.getProperty(e.options,"items").map(((t,i)=>this.getters().getValueByIdFromFormData(e.id,this._formData)>=i?{text:t,value:t,checked:"1"}:{text:t,value:t}))}
        @click=${function(){this._onClickItem(e)}}
        @button-group-item-change=${function(t){const{detail:i}=t;i.checked||(i.value>0?i.value:i.value="0"),this._onChangeHandler(t,e)}}
      ></bbva-button-group>`}getBbvaBadgeDefault(e){return a` <div
        role=${this.getProperty(e.options,"role")}
        aria-label="${this.getProperty(e.options,"relationfieldid")?this.getters().getValueByPosition(this.getters().getValueByIdFromFormData(this.getters().getFieldByName(this.core,this.getProperty(e.options,"relationfieldid")).id,this._formData)||0,this.getProperty(e.options,`textaria_${this.language}`)):this.translate(this.getProperty,e.options,"textaria_",this.language)}"
      >
        <bbva-badge-default
          id="${e.id}"
          name="${e.name}"
          class="${this.getProperty(e.options,"class")}"
          selected="${this.getProperty(e.options,"selected")}"
          style="${this.getProperty(e.options,"style")}"
          aria-hidden="${this.getProperty(e.options,"ariahidden")}"
          text="${this.getProperty(e.options,"relationfieldid")?this.getters().getValueByPosition(this.getters().getValueByIdFromFormData(this.getters().getFieldByName(this.core,this.getProperty(e.options,"relationfieldid")).id,this._formData)||0,this.getProperty(e.options,`text_${this.language}`)):this.translate(this.getProperty(e.options,`text_${this.language}`))}"
          type="${this.getProperty(e.options,"relationfieldid")?this.getters().getValueByPosition(this.getters().getValueByIdFromFormData(this.getters().getFieldByName(this.core,this.getProperty(e.options,"relationfieldid")).id,this._formData)||0,this.getProperty(e.options,"type")):this.getProperty(e.options,"type")}"
          @click=${function(){this._onClickItem(e)}}
        ></bbva-badge-default>
        <div></div>
      </div>`}getStepComponent(e){return a`
        <bbva-expandable-step
          show-link
          hide-padding-left
          hide-padding-right
          hide-divider
          class="animation enlarge-step"
          id="${e.name}"
          name="${e.name}"
          header="${this.translate(this.getProperty,e.options,"title_",this.language)}"
          disabled-target=".action"
          edit-label="${this.t("feedback-client-voice-connect-step-edit")||"bbva-expandable-step-edit"}"
          current-step-label="${this.currentStepLabel||"feedback-client-voice-connect-step-heading"}"
          @expandable-step-edit-step="${t=>this._stateColapseMultiStep(t,e,this.getters().getFieldByName(this.core,e.name).id,"edit",this.getters().getIndexStepSlottedByName(this.core,this.getters().getIndexPageByFiledName(this.core,e.name),e.name))}"
        >
          <div class="content">
            ${this.getSlottedFields(e)}

            <bbva-button-default
              fullwidth
              class="button-margin-space"
              text="${this.translate(this.getProperty,e.options,"continue_literal_",this.language)}"
              ?disabled="${!this.validateStepById(this.core,this._formData,this.currentPage,this.currentStep)}"
              @click=${t=>{this._stateColapseMultiStep(t,e,e.name,"confirm",this.currentStep)}}
            >
            </bbva-button-default>
          </div>
          <div class="summary summary-left-space" slot="summary">
            ${this.getProperty(e.options,"response_resume")?this.responseResume(this.getProperty(e.options,"stepNumber")):""}
          </div>
        </bbva-expandable-step>
      `}getFields(e){const t=[{fieldName:"bbvaFormInput",method:"getBbvaFormInput"},{fieldName:"bbvaButtonDefault",method:"getBbvaButtonDefault"},{fieldName:"bbvaTypeLink",method:"getBbvaTypeLink"},{fieldName:"bbvaTypeText",method:"getBbvaTypeText"},{fieldName:"bbvaNotification",method:"getBbvaNotification"},{fieldName:"bbvaHelpModal",method:"getBbvaHelpModal"},{fieldName:"bbvaFormSelect",method:"getBbvaFormSelect"},{fieldName:"bbvaTypeMultiRadio",method:"getBbvaTypeMultiRadio"},{fieldName:"multistepComponent",method:"getMultistepComponent"},{fieldName:"bbvaTypeMultiCheck",method:"getBbvaTypeMultiCheck"},{fieldName:"bbvaFormRating",method:"getBbvaFormRating"},{fieldName:"bbvaButtonGroup",method:"getBbvaButtonGroup"},{fieldName:"bbvaBadgeDefault",method:"getBbvaBadgeDefault"},{fieldName:"stepComponent",method:"getStepComponent"}].find((t=>t.fieldName===e.fieldType)),{method:i}=t;return this[i](e)}getSlottedFields(e){return a`${this.getProperty(e.options,"fieldslotted")&&Array.isArray(this.getProperty(e.options,"fieldslotted"))?this.getProperty(e.options,"fieldslotted").map((e=>this.getFields(this.getters().getFieldByName(this.core,e)))):""}
      ${this.getProperty(e.options,"fieldslotted")&&!Array.isArray(this.getProperty(e.options,"fieldslotted"))?this.getFields(this.getters().getFieldByName(this.core,this.getProperty(e.options,"fieldslotted"))):""}`}isHeaderTitle(e){return a`${this.translate(this.getProperty,e.options,"header_title_",this.language)?a` <bbva-type-text
            class="${this.getProperty(e.options,"class_header_title")}"
            text="${this.translate(this.getProperty,e.options,"header_title_",this.language)}"
            size="${this.getProperty(e.options,"header_title_size")}"
            font-weight="${this.getProperty(e.options,"header_title_weight")}"
            alignment="${this.getProperty(e.options,"header_title_alignment")}"
            @click=${function(){this._onClickItem(e)}}
          ></bbva-type-text>`:""}`}isHeaderText(e){return a`${this.translate(this.getProperty,e.options,"header_text_",this.language)?a`<bbva-type-text
            class="${this.getProperty(e.options,"class_header_text")}"
            text="${this.translate(this.getProperty,e.options,"header_text_",this.language)}"
            size="${this.getProperty(e.options,"header_text_size")}"
            alignment="${this.getProperty(e.options,"header_text_alignment")}"
            @click=${function(){this._onClickItem(e)}}
          ></bbva-type-text>`:""}`}isMaxCheck(e,t){return(this.getProperty(e.options,"maxcheck")?!this.validationsTypes().maxcheck(e.id,this.getProperty(e.options,"maxcheck"),this._formData)||this.getters().getIndexPageByFiledName(this.core,e.name)!==this.currentPage||this.getters().getStepByFieldName(this.core,this.getters().getIndexPageByFiledName(this.core,e.name),e.name)!==this.currentStep:this.getters().getIndexPageByFiledName(this.core,e.name)!==this.currentPage)&&!this._chargueValues(e,t)}};class Z{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((o=i[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class ee extends Z{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const te=0,ie=1,se="jwt",ae="tsec",re="none";class oe extends Z{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=te,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ee,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ae:this.requiredToken=re,this.requiresJWT=!1):this.requiredToken===ae?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===se?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===re?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ae)}_setJwtHandler(){this._setTokenHandler(se)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=o),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===ie?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ae,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(se,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===se?"JWT ":"",a=e===se?"Authorization":ae;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(r);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:o,state:n,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(c),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,c,r,o,n,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,r,o,n,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,o)}}class ne extends oe{constructor(e=null){super(Object.assign(e||{},{method:"DELETE"}))}toString(e=""){return super.toString(e||"BGADPRequestDELETE")}}class le extends oe{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class de extends oe{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class ce extends oe{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class he extends ce{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-form-data`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormDataPostV1")}}class pe extends le{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormGetV1")}}class ue extends ne{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormDeleteV1")}}class ge extends de{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormPatchV1")}}class me extends de{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}/fields/{field-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormFieldsFieldPatchV1")}}class be extends le{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}/fields/{field-id}/options`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormFieldsFieldOptionsGetV1")}}class _e extends ce{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}/fields/{field-id}/options`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormFieldsFieldOptionsPostV1")}}class fe extends de{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}/fields/{field-id}/options/{option-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormFieldsFieldOptionsOptionPatchV1")}}class ve extends ne{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}/fields/{field-id}/options/{option-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormFieldsFieldOptionsOptionDeleteV1")}}class ye extends ne{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/feedback-forms/{feedback-form-id}/saturation-rules/{saturation-rule-id}`)}toString(){return super.toString("BGADPCustomerFeedbackFeedbackFormsFeedbackFormSaturationRulesSaturationRuleDeleteV1")}}class ke extends ce{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/field-categories`)}toString(){return super.toString("BGADPCustomerFeedbackFieldCategoriesPostV1")}}class Se extends le{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/field-categories`)}toString(){return super.toString("BGADPCustomerFeedbackFieldCategoriesGetV1")}}class Fe extends le{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-feedback/v${this.version}/saturated-feedback-form`)}toString(){return super.toString("BGADPCustomerFeedbackSaturatedFeedbackFormGetV1")}}class Pe extends(n(l)){_renameAppResponse(e){const t=Array.isArray(e)?e:[e];if("0"==this.version&&Object.keys(t).length)for(let e=0;e<t.length;e++)this._renameProperty(t[e],"application","app")}_renameAppRequest(e){"0"==this.version&&this._renameProperty(e,"app","application")}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}}class xe extends Pe{static get is(){return"bbva-global-feedback-form-data-api-dm"}constructor(){super()}postFeedbackFormData(e){this._generateGetService(this._getService("post",e),{customEvent:"feedback-form-data-api-dm-create",errorFireEventHandler:"feedback-form-data-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FeedbackFormData`,this._getBgadp(s))}_getBgadp(e){return{postFeedbackFormDataV1:()=>new he(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}class Te extends Pe{static get is(){return"bbva-global-feedback-form-api-dm"}static get properties(){return{feedbackForm:{type:Object,attribute:!1}}}constructor(){super(),this.feedbackForm={}}resetFeedbackForm(){this.feedbackForm={}}getFeedbackForm(e,t={}){if(Object.keys(this.feedbackForm).length)return;t=Object.assign({"feedback-form-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"feedback-form-api-dm-fetch",errorFireEventHandler:"feedback-form-api-dm-fetch-error"},this._responseMapping,t.fields)}patchFeedbackForm(e,t){const i={"feedback-form-id":e};this._generateGetService(this._getService("patch",t,i),{customEvent:"feedback-form-api-dm-update",errorFireEventHandler:"feedback-form-api-dm-update-error"},this._responseMapping),this.resetFeedbackForm()}deleteFeedbackForm(e,t={}){t=Object.assign({"feedback-form-id":e},t),this._generateGetService(this._getService("delete",{},t),{customEvent:"feedback-form-api-dm-delete",errorFireEventHandler:"feedback-form-api-dm-delete-error"},this._responseMapping),this.resetFeedbackForm()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FeedbackForm`,this._getBgadp(s))}_getBgadp(e){return{deleteFeedbackFormV1:()=>new ue(e),getFeedbackFormV1:()=>new pe(e),patchFeedbackFormV1:()=>new ge(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class $e extends Pe{static get is(){return"bbva-global-saturated-feedback-form-api-dm"}static get properties(){return{saturatedFeedbackForm:{type:Object,attribute:!1}}}constructor(){super(),this.saturatedFeedbackForm={}}resetSaturatedFeedbackForm(){this.saturatedFeedbackForm={}}getSaturatedFeedbackForm(e={}){if(Object.keys(this.saturatedFeedbackForm).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"saturated-feedback-form-api-dm-fetch",errorFireEventHandler:"saturated-feedback-form-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}SaturatedFeedbackForm`,this._getBgadp(s))}_getBgadp(e){return{getSaturatedFeedbackFormV1:()=>new Fe(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ee extends Pe{static get is(){return"bbva-global-customer-feedback-field-categories-base-api-dm"}getFieldCategories(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}postFieldCategories(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FieldCategories`,this._getBgadp(s))}_getBgadp(e){return{getFieldCategoriesV1:()=>new Se(e),postFieldCategoriesV1:()=>new ke(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}d(Ee,"GET_EVENTS",{customEvent:"field-categories-api-dm-fetch",errorFireEventHandler:"field-categories-api-dm-fetch-error"}),d(Ee,"POST_EVENTS",{customEvent:"field-categories-api-dm-create",errorFireEventHandler:"field-categories-api-dm-create-error"}),customElements.define(Ee.is,Ee);class Ie extends Pe{static get is(){return"bbva-global-customer-feedback-feedback-form-saturation-rule-base-api-dm"}deleteFeedbackFormSaturationRule(e,t,i){i=Object.assign({"feedback-form-id":e,"saturation-rule-id":t},i),this._generateGetService(this._getService("delete",{},i),this.constructor.DELETE_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FeedbackFormSaturationRule`,this._getBgadp(s))}_getBgadp(e){return{deleteFeedbackFormSaturationRuleV1:()=>new ye(e),default:()=>"BGADP does not exist."}}}d(Ie,"DELETE_EVENTS",{customEvent:"feedback-form-saturation-rule-api-dm-delete",errorFireEventHandler:"feedback-form-saturation-rule-api-dm-delete-error"}),customElements.define(Ie.is,Ie);class Ce extends Pe{static get is(){return"bbva-global-customer-feedback-feedback-form-field-base-api-dm"}patchFeedbackFormField(e,t,i){const s={"feedback-form-id":e,"field-id":t};this._generateGetService(this._getService("patch",i,s),this.constructor.PATCH_EVENTS)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FeedbackFormField`,this._getBgadp(s))}_getBgadp(e){return{patchFeedbackFormFieldV1:()=>new me(e),default:()=>"BGADP does not exist."}}}d(Ce,"PATCH_EVENTS",{customEvent:"feedback-form-field-api-dm-update",errorFireEventHandler:"feedback-form-field-api-dm-update-error"}),customElements.define(Ce.is,Ce);class Oe extends Pe{static get is(){return"bbva-global-customer-feedback-feedback-form-field-options-base-api-dm"}getFeedbackFormFieldOptions(e,t,i){i=Object.assign({"feedback-form-id":e,"field-id":t},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,this._responseMapping,i.fields)}postFeedbackFormFieldOptions(e,t,i){const s={"feedback-form-id":e,"field-id":t};this._generateGetService(this._getService("post",i,s),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FeedbackFormFieldOptions`,this._getBgadp(s))}_getBgadp(e){return{getFeedbackFormFieldOptionsV1:()=>new be(e),postFeedbackFormFieldOptionsV1:()=>new _e(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}d(Oe,"GET_EVENTS",{customEvent:"feedback-form-field-options-api-dm-fetch",errorFireEventHandler:"feedback-form-field-options-api-dm-fetch-error"}),d(Oe,"POST_EVENTS",{customEvent:"feedback-form-field-options-api-dm-create",errorFireEventHandler:"feedback-form-field-options-api-dm-create-error"}),customElements.define(Oe.is,Oe);class we extends Pe{static get is(){return"bbva-global-customer-feedback-feedback-form-field-option-base-api-dm"}patchFeedbackFormFieldOption(e,t,i,s){const a={"feedback-form-id":e,"field-id":t,"option-id":i};this._generateGetService(this._getService("patch",s,a),this.constructor.PATCH_EVENTS)}deleteFeedbackFormFieldOption(e,t,i,s){s=Object.assign({"feedback-form-id":e,"field-id":t,"option-id":i},s),this._generateGetService(this._getService("delete",{},s),this.constructor.DELETE_EVENTS)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}FeedbackFormFieldOption`,this._getBgadp(s))}_getBgadp(e){return{deleteFeedbackFormFieldOptionV1:()=>new ve(e),patchFeedbackFormFieldOptionV1:()=>new fe(e),default:()=>"BGADP does not exist."}}}d(we,"PATCH_EVENTS",{customEvent:"feedback-form-field-option-api-dm-update",errorFireEventHandler:"feedback-form-field-option-api-dm-update-error"}),d(we,"DELETE_EVENTS",{customEvent:"feedback-form-field-option-api-dm-delete",errorFireEventHandler:"feedback-form-field-option-api-dm-delete-error"}),customElements.define(we.is,we);const Re=e=>class extends e{responseTracking(){return{itemsWhitValueStep:(e,t)=>{const i=[];return null==e||e.fields.forEach((e=>{t.some((t=>t.field.id===e.id))&&!i.some((t=>t.id===e.id))&&e.options.some((e=>e.key===this.keys.is_input))&&i.push(e)})),i.length},inputsNumberStep:e=>(null==e?void 0:e.fields.filter((e=>e.options.some((e=>e.key===this.keys.is_input)))).length)||0}}getters(){return{getStepByFieldId:(e,t,i)=>(null==e?void 0:e.pages[t].body.steps.filter((e=>e.fields))).map((e=>e.fields.filter((e=>e.id===i)))).findIndex((e=>e.length)),getStepsSlottedByPage(e,t){var i,s,a;const r=null==e||null===(i=e.pages[t])||void 0===i||null===(s=i.body)||void 0===s||null===(a=s.steps[0])||void 0===a?void 0:a.fields,o=[];return r&&r.filter((e=>"stepComponent"===e.fieldType)).forEach(((t,i)=>{var s;o.push({fields:[]});(null===(s=t.options)||void 0===s?void 0:s.filter((e=>"fieldslotted"===e.key))[0].values).forEach((t=>{o[i].fields.push(this.getFieldByName(e,t))}))})),!!o.length&&o},getIndexStepSlottedByName(e,t,i){var s,a,r;return(null==e||null===(s=e.pages[t])||void 0===s||null===(a=s.body)||void 0===a||null===(r=a.steps[0])||void 0===r?void 0:r.fields).filter((e=>"stepComponent"===e.fieldType)).findIndex((e=>e.name===i))},getStepByFieldName:(e,t,i)=>{var s,a,r,o;let n=[];var l,d,c,h,p,u;(null==e||null===(s=e.pages[t])||void 0===s||null===(a=s.body)||void 0===a||null===(r=a.steps)||void 0===r?void 0:r.length)>1?n=null==e||null===(l=e.pages[t])||void 0===l||null===(d=l.body)||void 0===d||null===(c=d.steps)||void 0===c?void 0:c.filter((e=>e.fields)):n=this.getters().getStepsSlottedByPage(e,t)?this.getters().getStepsSlottedByPage(e,t):null==e||null===(h=e.pages[t])||void 0===h||null===(p=h.body)||void 0===p||null===(u=p.steps)||void 0===u?void 0:u.filter((e=>e.fields));return!(null===(o=n)||void 0===o||!o.length)&&n.map((e=>e.fields.filter((e=>e.name===i)))).findIndex((e=>e.length))},getIndexPageByFiledId:(e,t)=>(null==e?void 0:e.pages.map((e=>e.body.steps.map((e=>e.fields)).flat()))).map((e=>e.filter((e=>e.id===t)))).findIndex((e=>e.length)),getIndexPageByFiledName:(e,t)=>(null==e?void 0:e.pages.map((e=>e.body.steps.map((e=>e.fields)).flat()))).map((e=>e.filter((e=>(null==e?void 0:e.name)===t)))).findIndex((e=>e.length)),getAllFields:e=>{let t=[];const i=null==e?void 0:e.pages.map((e=>{var t;return null==e||null===(t=e.body)||void 0===t?void 0:t.steps.map((e=>null==e?void 0:e.fields)).flat()}));return i&&(t=i.reduce(((e,t)=>[...e,t])).flat()),t},getStepByIndexAndPage:(e,t,i)=>{var s,a;const r=null==e||null===(s=e.pages[t])||void 0===s?void 0:s.body;if((null==r||null===(a=r.steps)||void 0===a?void 0:a.length)>1){var o;return(null===(o=r.steps)||void 0===o?void 0:o.map((e=>e)))[i]}return this.getters().getStepsSlottedByPage(e,t)[i]},getStepPageIndexByName:(e,t,i)=>{var s,a;return(null==e||null===(s=e.pages[t])||void 0===s||null===(a=s.body)||void 0===a?void 0:a.steps).map((e=>null==e?void 0:e.fields.filter((e=>(null==e?void 0:e.name)===i)))).findIndex((e=>-1!==e))},getValueByIdFromFormData:(e,t)=>{var i;return!(!e||!t)&&(null===(i=t.find((t=>t.field.id===e)))||void 0===i?void 0:i.value)},getAllDataByIdFromFormData:(e,t)=>!(!e||!t)&&(t.filter((t=>t.field.id===e))||""),getFieldByName:(e,t)=>{let i=[];const s=null==e?void 0:e.pages.map((e=>{var t;return null==e||null===(t=e.body)||void 0===t?void 0:t.steps.map((e=>null==e?void 0:e.fields)).flat()}));return s&&(i=s.reduce(((e,t)=>[...e,t])).flat()),i.find((e=>e.name===t))},getFieldById:(e,t)=>{let i=[];const s=null==e?void 0:e.pages.map((e=>{var t;return null==e||null===(t=e.body)||void 0===t?void 0:t.steps.map((e=>null==e?void 0:e.fields)).flat()}));return s&&(i=s.reduce(((e,t)=>[...e,t])).flat()),i.find((e=>e.id===t))},getValuesOptions:(e,t)=>{var i;return null===(i=e.options.find((e=>e.key===t)))||void 0===i?void 0:i.values},getIdByName:(e,t)=>{var i;let s=[],a="";const r=null==e?void 0:e.pages.map((e=>{var t;return null==e||null===(t=e.body)||void 0===t?void 0:t.steps.map((e=>null==e?void 0:e.fields)).flat()}));return r&&(s=r.reduce(((e,t)=>[...e,t])).flat()),a=null===(i=s.find((e=>e.name===t)))||void 0===i?void 0:i.id,a||""},getObjValueByPath:(e,t)=>e.split(".").reduce(((e,t)=>e&&e[t]?e[t]:void 0),t),getOptionValuePositionFromField:(e,t)=>{var i;return null===(i=t.options.find((e=>e.key===this.keys.value)))||void 0===i?void 0:i.values.indexOf(this.getters().getValueByIdFromFormData(t.id,e))},getOptionValueFromFieldAndIndex:(e,t,i)=>{const s=e.options.find((e=>e.key===this.keys[`label_${i}`]))||e.options.find((e=>e.key===this.keys["label_es-ES"]));return null==s?void 0:s.values[t]},getAllFieldsByOptionFromStep:(e,t)=>e.fields.filter((e=>e.options.some((e=>e.key===t)))),getValueByPosition:(e,t)=>t[e],getFieldsFilledByUSer:(e,t)=>{const i=e.map((e=>({field:{id:this.getters().getIdByName(this.core,e.field.name)},value:e.value}))),s=[];return t.forEach((e=>{i.some((t=>{var i,s;return(null==t||null===(i=t.field)||void 0===i?void 0:i.id)===(null==e||null===(s=e.field)||void 0===s?void 0:s.id)}))||s.push(e)})),s},getVisibleModalsFromCore:e=>this.getters().getAllFields(e).filter((e=>"bbvaHelpModal"===e.fieldType)).filter((e=>e.options.some((e=>"visible"===e.key&&"true"===e.values[0]))))}}noRepeatId(e){let t=!1;const i=[];return e.pages.forEach((e=>e.body.steps.forEach((e=>e.fields.forEach((e=>{if(i.some((t=>t===e.id)))throw t=!0,new Error(`There is a repeated id !!!!!!! ${e.id}`);i.push(e.id)})))))),t}parseOptions(e,t){return t.filter((t=>t.key.startsWith(e)))}dividerParse(e,t){return this.getProperty(e,t).map((e=>"false"===e?"":"full"))}translate(e,t,i,s){const a=e.call(this,t,`${i}${s}`);return 0===a.length?e.call(this,t,`${i}es-ES`):a}};class De extends(c(Re(h(b(l))))){static get scopedElements(){const e=[$e,xe,_,Te,f];return De.scopedElementsFromClasses(e)}static get is(){return"feedback-client-voice-connect-dm"}static get properties(){return{appId:{type:String},countryId:{type:String},channelId:{type:String},segmentId:{type:String},userId:{type:String},feedbackOrigin:{type:Object},aapTarget:{type:String},targetIdUniqueKey:{type:String},hostGlobal:{type:String},hostSSO:{type:String},pathGlobal:{type:String},isNative:{type:Boolean},requiredTokenLocal:{type:String},requiredTokenGlobal:{type:String},requiredTokenLoginGlobal:{type:String,attribute:"required-token-login-global"},_serviceErrorTries:{type:Object},tokenHandler:{type:Object},useSessionTkEnviroment:{type:Boolean},singleSignOnApiVersion:{type:String},customerFeedbackApiVersion:{type:String},tkGlobalSufix:{type:String},_pkcs7:{type:String},_formId:{type:String},_data:{type:Array},_serviceList:{type:Array},_serviceCalled:{type:String},externalHandlingErrors:{type:Array,attribute:"external-handling-errors"},maxAllowedRetries:{type:Number,attribute:"max-allowed-retries"},errorTries:{type:Object},authenticationData:{type:String},authenticationType:{type:String}}}constructor(){super(),this._serviceCalled="",this.errorTries={},this._pkcs7="",this._formId="";const e=this;this.tkGlobalSufix="TGlobal",this.tokenHandler={getItem(t){return e.useSessionTkEnviroment&&window.sessionStorage&&e.requiredTokenGlobal?sessionStorage.getItem(`${t}${e.tkGlobalSufix}`):this[t]},setItem(t,i){e.useSessionTkEnviroment&&window.sessionStorage&&e.requiredTokenGlobal&&sessionStorage.setItem(`${t}${e.tkGlobalSufix}`,i),this[t]=i},removeItem(t){e.useSessionTkEnviroment&&window.sessionStorage&&e.requiredTokenGlobal?sessionStorage.removeItem(`${t}${e.tkGlobalSufix}`):delete this[t]}},this._data=[],this.maxAllowedRetries=3}firstUpdated(){super.firstUpdated(),this._ssoDM=this.shadowRoot.getElementById("ssoDM"),this._genericDM=this.shadowRoot.getElementById("genericDm"),this._saturatedFormDM=this.shadowRoot.getElementById("saturatedformdm"),this._dataFormDM=this.shadowRoot.getElementById("dataformdm"),this._feedbackFormDM=this.shadowRoot.getElementById("feedbackformdm"),this._saturatedFormDM[`${this.requiredTokenGlobal}Handler`]=this.tokenHandler,this._feedbackFormDM[`${this.requiredTokenGlobal}Handler`]=this.tokenHandler,this._dataFormDM[`${this.requiredTokenGlobal}Handler`]=this.tokenHandler,this._genericDM.token={storage:this.tokenHandler},this.errorTries={"data-sent":0,"load-form":0},this._formId="",this._serviceList=[{service:"saturatedform",method:"getSaturatedForm"},{service:"feedbackform",method:"getFeedbackForm"},{service:"feedbackformdata",method:"sendData"}]}reset(){this.tokenHandler.removeItem(this.requiredTokenGlobal),this.errorTries={"data-sent":0,"load-form":0},this._data=[]}loginSSO(){if((this.tokenHandler.getItem(`${this.requiredTokenGlobal}`)||"").length)this._serviceCalled&&this._callService();else{const e={aapTarget:this.aapTarget,targetIdUniqueKey:this.targetIdUniqueKey};this._ssoDM.postSingleSignOn(e)}}_callService(){if(this._serviceCalled){this[this._serviceList.find((e=>e.service===this._serviceCalled)).method](),this._serviceCalled=""}}_loginTenantGlobal(e){var t;this._pkcs7||(this._pkcs7=null==e||null===(t=e.detail)||void 0===t?void 0:t.pkcs7);const i={authentication:{authenticationData:[{idAuthenticationData:"firma-pkcs7",authenticationData:[this._pkcs7]}],authenticationType:"53",userID:this.userId,consumerID:this.aapTarget}};window.sessionStorage&&this.requiredTokenGlobal&&this.tokenHandler.setItem(this.requiredTokenGlobal,window.sessionStorage.getItem(this.requiredTokenGlobal)),this._genericDM.postData(i)}setService(e){this._serviceCalled=e}setSaturatedId(e){this._formId=e}getSaturatedForm(){const e={feedbackOrigin:this.feedbackOrigin.origin,"app.id":this.appId,"country.id":this.countryId,"channel.id":this.channelId,"segment.id":this.segmentId};this.feedbackOrigin.step&&(e.feedbackOriginStep=this.feedbackOrigin.step),this._saturatedFormDM.getSaturatedFeedbackForm(e)}getFeedbackForm(){this._formId&&this._feedbackFormDM.getFeedbackForm(this._formId)}_errorFeedbackForm(e){const t=this._checkExternalError(e);t?this._dispatch(`external-error-handle-${t.name}`,e):(this._dispatch("feedback-client-voice-connect-feedback-form-error",e.detail),this._manageRetriesCheckingType("load-form"))}_errorSaturatedForm(e){const t=this._checkExternalError(e);t?this._dispatch(`external-error-handle-${t.name}`,e):(this._dispatch("feedback-client-voice-connect-saturated-form-error",e.detail),this._manageRetriesCheckingType("load-form"))}_errorFormData(e){const t=this._checkExternalError(e);t?this._dispatch(`external-error-handle-${t.name}`,e):this._manageRetries("data-sent")}_errorGenericDM(e){this.tokenHandler.setItem(this.requiredTokenGlobal,"");const t=this._checkExternalError(e);t?this._dispatch(`external-error-handle-${t.name}`,e):(this._dispatch("feedback-client-voice-connect-generic-dm-error",e.detail),this._manageRetriesCheckingType("load-form"))}_errorSSO(e){const t=this._checkExternalError(e);t?this._dispatch(`external-error-handle-${t.name}`,e):(this._dispatch("feedback-client-voice-connect-sso-error",e.detail),this._manageRetriesCheckingType("load-form"))}_manageRetriesCheckingType(e){this.feedbackOrigin.isPullForm&&this._manageRetries(e)}_manageRetries(e){this.errorTries[e]+=1,this.errorTries[e]<=this.maxAllowedRetries?(this._setErrorTries(e),this._dispatch(`feedback-client-voice-connect-${e}-retry`,!0)):(this._dispatch(`feedback-client-voice-connect-${e}-error`,!0),this.errorTries[e]=0)}_fetchGlobalLogin(e){const t=this.isNative?e.detail.headers[this.requiredTokenGlobal]:e.detail.responseHeaders[this.requiredTokenGlobal];this.tokenHandler.setItem(this.requiredTokenGlobal,""),this.tokenHandler.setItem(this.requiredTokenGlobal,t),this._callService(),this._dispatch("feedback-client-voice-fetch-login-success",this._formId)}_fetchSaturatedForm(e){const{detail:t}=e;this.setSaturatedId(t.id),this.setService(""),this._dispatch("feedback-client-voice-fetch-saturated-form",this._formId)}_fetchFeedbackForm(e){this.setService(""),this._dispatch("feedback-client-voice-connect-feedback-form-fetched",e.detail)}_setErrorTries(e){this.errorTries[e]+=1}_resetErrorTries(e){this.errorTries[e]=0}_checkExternalError(e){return this.externalHandlingErrors.find((t=>{const i=this.getters().getObjValueByPath.call(this,t.path,e);return t.code===i}))}_fetchFormData(){this._resetErrorTries("feedbackform"),this._data=[],this.setService(""),this._dispatch("feedback-client-voice-connect-data-sent",!0)}setData(e){this._data=e}sendData(){this._dataFormDM.postFeedbackFormData(this._data)}getHeadersSSO(){let e={Accept:"application/json, text/plain, */*","Content-Type":"application/json"};return this.authenticationData&&this.authenticationType&&(e={...e,authenticationdata:this.authenticationData,authenticationtype:this.authenticationType}),e}render(){return a`<bbva-global-generic-dm
        id="genericDm"
        host=${this.hostGlobal}
        path=${this.pathGlobal}
        method="POST"
        .headers="{
          Accept: 'application/json, text/plain, */*',
          'Content-Type': 'application/json'
        }"
        ?native=${this.isNative}
        ?requiresToken=${this.requiredTokenLoginGlobal}
        .crossDomain=${!0}
        @generic-dm-create="${this._fetchGlobalLogin}"
        @generic-dm-fetch-error=${this._errorGenericDM}
        @generic-dm-create-error=${this._errorGenericDM}
        @generic-dm-remove-error=${this._errorGenericDM}
        @generic-dm-update-error=${this._errorGenericDM}
      >
      </bbva-global-generic-dm>
      <bbva-global-single-sign-on-api-dm
        id="ssoDM"
        host=${this.hostSSO}
        version="${this.singleSignOnApiVersion}"
        .headers=${this.getHeadersSSO()}
        ?native="${this.isNative}"
        requiredToken=${this.requiredTokenLocal}
        @single-sign-on-api-dm-create="${this._loginTenantGlobal}"
        @single-sign-on-api-dm-create-error=${this._errorSSO}
        @api-dm-error=${this._errorSSO}
      >
      </bbva-global-single-sign-on-api-dm>
      <bbva-global-saturated-feedback-form-api-dm
        id="saturatedformdm"
        host=${this.hostGlobal}
        version="${this.customerFeedbackApiVersion}"
        ?native=${this.isNative}
        requiredToken=${this.requiredTokenGlobal}
        @saturated-feedback-form-api-dm-fetch=${this._fetchSaturatedForm}
        @saturated-feedback-form-api-dm-fetch-error=${this._errorSaturatedForm}
        @api-dm-error=${this._errorSaturatedForm}
        };
      ></bbva-global-saturated-feedback-form-api-dm>
      <bbva-global-feedback-form-api-dm
        id="feedbackformdm"
        host=${this.hostGlobal}
        version="${this.customerFeedbackApiVersion}"
        ?native=${this.isNative}
        requiredToken=${this.requiredTokenGlobal}
        @feedback-form-api-dm-fetch=${this._fetchFeedbackForm}
        @feedback-form-api-dm-fetch-error=${this._errorFeedbackForm}
        @api-dm-error=${this._errorSaturatedForm}
      ></bbva-global-feedback-form-api-dm
      ><bbva-global-feedback-form-data-api-dm
        id="dataformdm"
        host=${this.hostGlobal}
        version="${this.customerFeedbackApiVersion}"
        ?native=${this.isNative}
        requiredToken=${this.requiredTokenGlobal}
        @feedback-form-data-api-dm-create=${this._fetchFormData}
        @feedback-form-data-api-dm-create-error=${this._errorFormData}
        @api-dm-error=${this._errorFormData}
      >
      </bbva-global-feedback-form-data-api-dm> `}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}const Ae={bbvaFormInput:"bbva_form_input",bbvaButtonDefault:"bbva_button_default",bbvaTypeLink:"bbva_type_link",bbvaTypeText:"bbva_type_text",bbvaNotification:"bbva_notification_message",bbvaHelpModal:"bbva_help_modal",bbvaFormSelect:"bbva_form_select",bbvaTypeMultiRadio:"bbva_type_multi_radio",multistepComponent:"multistep_component",bbvaTypeMultiCheck:"bbva_type_multi_checkbox",bbvaFormRating:"bbva_form_rating",bbvaButtonGroup:"bbva-button-group",bbvaBadgeDefault:"bbva_badge_default",stepComponent:"step_component"};function Be(e){return(["es-ES","en-EN"].includes(window.IntlMsg._lang)?["es-ES","en-EN"]:["es-ES","en-EN",window.IntlMsg._lang]).reduce(((t,i)=>({...t,[`${e}${i}`]:`${e}${i}`})),{})}const Ne={title:"title",...Be("title_"),header_image:"header_image",header_microilustration:"header_microilustration",hideReturnIcon:"hideReturnIcon",iconRight:"iconRight",header_type:"header_type",text:"text",...Be("text_"),ambient_color:"ambient_color",size:"size",font_weight:"font_weight",type:"type",label:"label",...Be("label_"),...Be("label_option_"),maxlength:"maxlength",characterCounterLabel:"characterCounterLabel",message:"message",...Be("message_"),variant:"variant",nopadding:"nopadding",content:"content",...Be("content_"),navigateTo:"navigateTo",openModal:"openModal",openModalButton:"openModalButton",isSubmit:"isSubmit",style:"style",disabled:"disabled",value:"value",name:"name",required:"required",readonly:"readonly",autocomplete:"autocomplete",modeInput:"modeInput",pattern:"pattern",allowedPattern:"allowedPattern",max:"max",min:"min",minlength:"minlength",placeholder:"placeholder",step:"step",accessibleDescription:"accessibleDescription",autoValidate:"autoValidate",form:"form",actionType:"actionType",actionIcon:"actionIcon",actionIconSize:"actionIconSize",actionIconSecondary:"actionIconSecondary",actionIconSecondarySize:"actionIconSecondarySize",helpIconSize:"helpIconSize",actionAccessibleText:"actionAccessibleText",actionVariant:"actionVariant",actionIntoForm:"actionIntoForm",validateOnBlur:"validateOnBlur",clearIcon:"clearIcon",clearIconSize:"clearIconSize",clearAccessibleText:"clearAccessibleText",errorIcon:"errorIcon",errorMessage:"errorMessage",helpIcon:"helpIcon",linkHref:"linkHref",infoMessage:"infoMessage",labelOut:"labelOut",...Be("labelOut_"),optionalLabel:"optionalLabel",...Be("optionalLabel_"),currencyCode:"currencyCode",localCurrency:"localCurrency",symbol:"symbol",symbolLeft:"symbolLeft",symbolRight:"symbolRight",amount:"amount",language:"language",abbr:"abbr",abbreviations:"abbreviations",decimalDigits:"decimalDigits",decimalsHidden:"decimalsHidden",zeroDecimalsHidden:"zeroDecimalsHidden",trailingZeroDecimalsHidden:"trailingZeroDecimalsHidden",separatorChar:"separatorChar",groupChar:"groupChar",_intlLanguage:"_intlLanguage",_intlAmountLanguage:"_intlAmountLanguage",flag:"flag",flagLabel:"flagLabel",items:"items",minChars:"minChars",maxResults:"maxResults",filterValueKey:"filterValueKey",autoselect:"autoselect",selectOnBlur:"selectOnBlur",keepOnBlur:"keepOnBlur",keepOnSelect:"keepOnSelect",preventValueUpdateOnSelect:"preventValueUpdateOnSelect",overlay:"overlay",search:"search",toggleIcon:"toggleIcon",toggleVisibleIcon:"toggleVisibleIcon",toggleIconSize:"toggleIconSize",toggleAccessibleText:"toggleAccessibleText",toggleVisibleAccessibleText:"toggleVisibleAccessibleText",visible:"visible",disabledButton:"disabledButton",iconVariant:"iconVariant",showCard:"showCard",invalid:"invalid",autoFocus:"autoFocus",logo:"logo",cardType:"cardType",cardImage:"cardImage",partner:"partner",partnerLogo:"partnerLogo",cardVariant:"cardVariant",inlineAutocomplete:"inlineAutocomplete",cardStatus:"cardStatus",payCompatibility:"payCompatibility",hideBottomPaddingInfoMessage:"hideBottomPaddingInfoMessage",icon:"icon",buttonTranscriptLabel:"buttonTranscriptLabel",interaction:"interaction",keepTalkingAnimation:"keepTalkingAnimation",iconTalkingAnimation:"iconTalkingAnimation",fullwidth:"fullwidth",hasEllipsis:"hasEllipsis",iconSize:"iconSize",loading:"loading",referrerpolicy:"referrerpolicy",ellipsis:"ellipsis",lines:"lines",tag:"tag",alignment:"alignment",fontWeight:"fontWeight",fontStyle:"fontStyle",fontFamily:"fontFamily",textColor:"textColor",inherit:"inherit",ambientColor:"ambientColor",enableInteractivity:"enableInteractivity",_desktop:"_desktop",messageTitle:"messageTitle",description:"description",linkTitle:"linkTitle",linkIcon:"linkIcon",buttonText:"buttonText",href:"href",iconClose:"iconClose",descriptionTextItalic:"descriptionTextItalic",accessibilityLinkLabel:"accessibilityLinkLabel",bookTitle:"bookTitle",closeModalElements:"closeModalElements",closeModalIndex:"closeModalIndex",avoidIconCloseModal:"avoidIconCloseModal",headerText:"headerText",headerType:"headerType",headerButtons:"headerButtons",headerShowLeftIcon:"headerShowLeftIcon",headerLeftIconLabel:"headerLeftIconLabel",headerLeftIconAriaLabel:"headerLeftIconAriaLabel",headerCloseIconLabel:"headerCloseIconLabel",headerCloseIconAriaLabel:"headerCloseIconAriaLabel",headerPosition:"headerPosition",headerLogo:"headerLogo",headerLeftIcon:"headerLeftIcon",titleIcon:"titleIcon",titleText:"titleText",descriptionText:"descriptionText",bodyText:"bodyText",linkText:"linkText",fixedFooter:"fixedFooter",stickyFooter:"stickyFooter",iOSFixedHeader:"iOSFixedHeader",iOSDevices:"iOSDevices",userAgentRegex:"userAgentRegex",hideContentPaddingTop:"hideContentPaddingTop",modalType:"modalType",idModal:"idModal",fullHeight:"fullHeight",disabledLink:"disabledLink",titleLines:"titleLines",_translate:"_translate",openIcon:"openIcon",foldIcon:"foldIcon",closeIcon:"closeIcon",showValue:"showValue",errorIconSize:"errorIconSize",infoIcon:"infoIcon",infoIconSize:"infoIconSize",infoTitle:"infoTitle",defaultClip:"defaultClip",nativeSelector:"nativeSelector",allNative:"allNative",accessibilityHelpText:"accessibilityHelpText",...Be("accessibilityHelpText_"),accessibilityIconNotification:"accessibilityIconNotification",nativeSelectAccessibilityText:"nativeSelectAccessibilityText",optionLabel:"optionLabel",showOptionValue:"showOptionValue",showHelpIcon:"showHelpIcon",linkAccessibilityText:"linkAccessibilityText",dividerSize:"dividerSize",_slotContent:"_slotContent",errorText:"errorText",errorAccessibilityText:"errorAccessibilityText",textOptional:"textOptional",labelMedium:"labelMedium",accessibilityIconAlertNotification:"accessibilityIconAlertNotification",accessibilityIconInfoNotification:"accessibilityIconInfoNotification",divider:"divider",stepSelector:"stepSelector",buttonSelector:"buttonSelector",headingSelector:"headingSelector",scrollingDelay:"scrollingDelay",hideStepNumbers:"hideStepNumbers",scrollAnimation:"scrollAnimation",scrollAnimationCompleted:"scrollAnimationCompleted",startAnimationStep:"startAnimationStep",finishAnimationStep:"finishAnimationStep",stepHeight:"stepHeight",scrollToStepIndex:"scrollToStepIndex",minStepHeight:"minStepHeight",hideAnimation:"hideAnimation",_allCompleted:"_allCompleted",stepsToReset:"stepsToReset",hideDisabledSteps:"hideDisabledSteps",_confirmationInitialHeight:"_confirmationInitialHeight",_paddingBottom:"_paddingBottom",_longTimer:"_longTimer",_shortTimer:"_shortTimer",offsetBottom:"offsetBottom",totalSteps:"totalSteps",completed:"completed",completeOnEvent:"completeOnEvent",disabledTarget:"disabledTarget",disabledTargetAttr:"disabledTargetAttr",active:"active",prefilled:"prefilled",header:"header",headingLevel:"headingLevel",currentStepLabel:"currentStepLabel",editLabel:"editLabel",viewLabel:"viewLabel",hideStepNumber:"hideStepNumber",disableOnPreviousStepEdit:"disableOnPreviousStepEdit",hideDivider:"hideDivider",hidePaddingTop:"hidePaddingTop",hidePaddingBottom:"hidePaddingBottom",hidePaddingLeft:"fohidePaddingLeftrm",hidePaddingRight:"hidePaddingRight",showLink:"showLink",button_text:"button_text",...Be("button_text_"),header_text:"header_text",...Be("header_text_"),fixed_footer:"fixed_footer",header_title:"header_title",...Be("header_title_"),header_title_size:"header_title_size",header_title_weight:"header_title_weight",header_text_size:"header_text_size",head_image:"header_microilustration",slot:"slot",submit_text_literal:"submit_text_literal",...Be("submit_text_literal_"),submit_literal:"submit_literal",...Be("submit_literal_"),onConfirmOptions:"onConfirmOptions",continue_literal:"continue_literal",...Be("continue_literal_"),isFixed:"isFixed",class:"class",message_title:"message_title",...Be("message_title_"),...Be("labelCounter_"),close_button:"close_button",close_button_action:"close_button_action",header_left_icon_aria_label:"header_left_icon_aria_label",id:"id",exit_feedback_client_voice_connect_component:"exit_feedback_client_voice_connect_component",checkbox_max_checked:"checkbox_max_checked",checkbox_min_checked:"checkbox_min_checked",id_button_submit:"id_button_submit",id_required_checkbox:"id_required_checkbox",validations:"validations",mincheck:"mincheck",maxcheck:"maxcheck",class_radio:"class_radio",response_tracking:"response_tracking",is_input:"is_input",title_icon:"title_icon",full_height:"full_height",max_two_lines:"max_two_lines",link_text:"link_text",...Be("link_text_"),range:"range",accessibilityText:"accessibilityText",numStars:"numStars",contentTitle:"contentTitle",statusType:"statusType",thumbs:"thumbs",hideText:"hideText",inline:"inline",hasNotEllipsis:"hasNotEllipsis",relationfieldid:"relationfieldid",hiddenbyfielvalue:"hiddenbyfielvalue",closeModal:"closeModal",accessText:"accessText",...Be("accessText_"),notransition:"notransition",headercloseiconarialabel:"headercloseiconarialabel",book_title:"book_title",fieldstoresetonchange:"fieldstoresetonchange",header_text_alignment:"header_text_alignment",header_title_alignment:"header_title_alignment",ambient:"ambient",style_container_option:"style_container_option",hide_content_padding_top:"hide_content_padding_top",with_validation:"with_validation",class_header_text:"class_header_text",class_header_title:"class_header_title",hidden:"hidden",isDataExternalAllowed:"isDataExternalAllowed",isSubmitExternalAllowed:"isSubmitExternalAllowed",isSubmitOnExit:"isSubmitOnExit",microillustration:"microillustration",...Be("rating_value_text_status_"),isslotted:"isslotted",fieldslotted:"fieldslotted",positionsslotted:"positionsslotted",filter_options_slotted:"filter_options_slotted",closeOtherModals:"closeOtherModals",headerClickOptions:"headerClickOptions",buttonClickOptions:"buttonClickOptions",linkClickOptions:"linkClickOptions",response_resume:"response_resume",questionName:"questionName",...Be("label_select_"),style_answer:"style_answer",stacked:"stacked",center:"center",veilClickOptions:"veilClickOptions",unset:"unset",isStep:"isStep",stepNumber:"stepNumber",scrollOptions:"scrollOptions",confirmModal:"confirmModal",style_container:"style_container",style_input:"style_input",useToast:"useToast",arialabel:"arialabel",footerbuttonarialabel:"footerbuttonarialabel",...Be("textaria_"),ariahidden:"ariahidden",role:"role"};function He(){return{[this.keys.exit_feedback_client_voice_connect_component]:{action:"exitComponent",params:e=>{var t,i;return null===(t=e.options)||void 0===t||null===(i=t[this.keys.exit_feedback_client_voice_connect_component])||void 0===i?void 0:i.values[0]}},[this.keys.isSubmit]:{action:"_onSubmit",params:()=>""},[this.keys.navigateTo]:{action:"_onNavigate",params:e=>e.options},[this.keys.closeModal]:{action:"_closeModal",params:e=>e.options.find((e=>e.key===this.keys.closeModal)).values[0]},[this.keys.openModal]:{action:"_openModal",params:e=>e.options.find((e=>e.key===this.keys.openModal)).values[0]},[this.keys.openModalButton]:{action:"_openModalButton",params:e=>e.options.find((e=>e.key===this.keys.openModalButton)).values[0]}}}const qe=e=>class extends e{validationsTypes(){return{required:(e,t,i)=>{var s;return!(null===(s=i.find((t=>{var i;return(null==t||null===(i=t.field)||void 0===i?void 0:i.id)===e})))||void 0===s||!s.value.toString().length)==!!t[0]},minlength:(e,t,i)=>{var s;return(null===(s=i.find((t=>{var i;return(null==t||null===(i=t.field)||void 0===i?void 0:i.id)===e})))||void 0===s?void 0:s.value.length)>=t[0]},maxcheck:(e,t,i)=>i.filter((t=>t.field.id===e)).length<t,range:(e,t,i)=>{const s=i.filter((t=>t.field.id===e));return s.length>=t[0]&&s.length<=t[1]},isInRange:(e,t,i)=>!!(e&&t&&i)&&(Number(e)>=Number(t)&&Number(e)<=Number(i)),shoudHide(e,t,i,s){if(null!=s&&s.split("-")[1])return this.isInRange(this.getters().getValueByIdFromFormData(this.getters().getIdByName(e,t),i),null==s?void 0:s.split("-")[0],null==s?void 0:s.split("-")[1]);if(null!=s&&s.split(",")[1]){return s.split(",").some((s=>Number(s)===Number(this.getters().getValueByIdFromFormData(this.getters().getIdByName(e,t),i))))}return!1}}}validateField(e,t,i,s){let a=!0;return s&&s.forEach((s=>{const r=t.options.find((e=>e.key===s));a=this.validationsTypes()[s](this.getters().getIdByName(e,t.name),r.values,i)&&a})),a}validateStepById(e,t,i,s){var a;const r=null===(a=this.getters().getStepByIndexAndPage(e,i,s))||void 0===a?void 0:a.fields;let o=!0;return r&&r.forEach((i=>{var s;const a=null==i||null===(s=i.options.find((e=>"validationsKeys"===e.key)))||void 0===s?void 0:s.values;o=this.validateField(e,i,t,a||[])&&o})),o}validateMultistepById(e,t,i){let s=!0;return e.pages[i].body.steps.forEach(((a,r)=>{var o;const n=null===(o=this.getters().getStepByIndexAndPage(e,i,r))||void 0===o?void 0:o.fields;n&&n.forEach((i=>{var a;const r=null==i||null===(a=i.options.find((e=>"validationsKeys"===e.key)))||void 0===a?void 0:a.values;s=this.validateField(e,i,t,r||[])&&s}))})),s&&this._submitAllowed}validateForm(e,t){const i=this.getters().getAllFields(e);let s=!0;return i.forEach((i=>{var a;const r=null==i||null===(a=i.options.find((e=>"validationsKeys"===e.key)))||void 0===a?void 0:a.values;s=this.validateField(e,i,t,r||[])&&s})),s}validateObjectWithValues(e){return!!e}validateFormActive(e,t){var i;return"ACTIVE"===(null==e||null===(i=e.status)||void 0===i?void 0:i.id)||!!t}isModalVisible(e,t){return t.some((t=>t===e))}},Me=e=>class extends e{_analyticsInitForm(){const e={analytic:"initForm",core:this.core,feedbackOrigin:this.feedbackOrigin,currentPage:this.currentPage};this._dispatch("feedback-client-voice-connect-flow-analytic-init",e)}_analyticsModalOpened(e,t={}){const i={analytic:"modalOpened",field:e,currentPage:this.currentPage,currentStep:this.currentStep,currentTitle:null==e?void 0:e.name,answered:t,feedbackOrigin:this.feedbackOrigin,nameStep:"feedback-help-modal-questionary"===(null==e?void 0:e.name)?this._getTitleStep(!1,null==e?void 0:e.name):"",pageStep:""!==e?this.getters().getStepPageIndexByName(this.core,this.currentPage,null==e?void 0:e.name):0};this._dispatch("feedback-client-voice-connect-modal-analytic-open",i)}_analyticsToastOpen(){const e={analytic:"toastOpened",currentPage:this.currentPage,currentStep:this.currentStep,feedbackOrigin:this.feedbackOrigin};this._dispatch("feedback-client-voice-connect-toast-analytic-open",e)}_titleCurrent(e){return e?`${this.translate(this.getProperty,e,"title_",this.language)||""}`:""}_getTitleStep(e,t){var i,s,a,r,o,n,l;const d=this.getters().getStepPageIndexByName(this.core,this.currentPage,t);return this._titleCurrent(null===(i=this.core)||void 0===i||null===(s=i.pages)||void 0===s||null===(a=s[this.currentPage])||void 0===a||null===(r=a.body)||void 0===r||null===(o=r.steps)||void 0===o||null===(n=o[d])||void 0===n||null===(l=n.fields.find((t=>t.name===`step-feedback-${e?"":this.currentStep+1}`)))||void 0===l?void 0:l.options)}_analyticsChangePage(e){var t,i,s,a;const r={analytic:"changePage",currentPage:this.currentPage,currentStep:this.currentStep,currentTitle:this._titleCurrent(null==e||null===(t=e[this.currentPage])||void 0===t||null===(i=t.body)||void 0===i||null===(s=i.steps)||void 0===s||null===(a=s[this.currentStep])||void 0===a?void 0:a.options),feedbackOrigin:this.feedbackOrigin};this._dispatch("feedback-client-voice-connect-page-analytic-change",r)}_analyticsChangeStep(e,t){var i,s,a,r,o;const n=this.getters().getStepPageIndexByName(this.core,this.currentPage,null==e?void 0:e.name),l={analytic:"changeStep",currentPage:this.currentPage,currentStep:t?null===(i=this.core)||void 0===i||null===(s=i.pages[this.currentPage])||void 0===s||null===(a=s.body)||void 0===a||null===(r=a.steps)||void 0===r||null===(o=r[n])||void 0===o?void 0:o.fields.filter((e=>"stepComponent"===(null==e?void 0:e.fieldType))).length:this.currentStep,currentTitle:this._getTitleStep(t,null==e?void 0:e.name),feedbackOrigin:this.feedbackOrigin,pageStep:n};this._dispatch("feedback-client-voice-connect-step-analytic-change",l)}};p();class Ve extends(c(Me(Y(Re(qe(h(v(b(l))))))))){static get is(){return"feedback-client-voice-connect"}static get scopedElements(){const e=[R,y,k,S,F,P,A,N,V,H,x,G,j,K,De,U,J,T,$,...Ve.configurationScopedElements()];return Ve.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},core:{type:Object},_fieldsHeader:{type:Array},_fieldsBody:{type:Array},_fieldsFooter:{type:Array},currentPage:{type:Number,attribute:"current-page"},currentStep:{type:Number,attribute:"current-step"},_formData:{type:Array},appId:{type:String,attribute:"app-id"},countryId:{type:String,attribute:"country-id"},channelId:{type:String,attribute:"channel-id"},segmentId:{type:String,attribute:"segment-id"},userId:{type:String,attribute:"user-id"},feedbackOrigin:{type:Object,attribute:"feedback-origin"},saturatedForm:{type:String},aapTarget:{type:String,attribute:"aap-target"},targetIdUniqueKey:{type:String,attribute:"target-id-unique-key"},isNative:{type:Boolean,attribute:"is-native"},history:{type:Object},singleSignOnApiVersion:{type:String,attribute:"sso-version"},customerFeedbackApiVersion:{type:String,attribute:"saturated-version"},hostLocal:{type:String,attribute:"host-local"},hostGlobal:{type:String,attribute:"host-global"},pathGlobal:{type:String,attribute:"path-global"},requiredTokenLocal:{type:String,attribute:"required-token-local"},requiredTokenGlobal:{type:String,attribute:"required-token-global"},requiredTokenLoginGlobal:{type:String,attribute:"required-token-login-global"},useSessionTkEnviroment:{type:Boolean,attribute:"use-session-tk-enviroment"},language:{type:String},_isError:{type:Object},userData:{type:Object},_externalData:{type:Array},externalHandlingErrors:{type:Array,attribute:"external-handling-errors"},maxAllowedRetries:{type:Number,attribute:"max-allowed-retries"},keys:{type:Object},types:{type:Object},authenticationData:{type:String,attribute:"authentication-data"},authenticationType:{type:String,attribute:"authentication-type"},allowedInactive:{type:Boolean,attribute:"allowed-inactive"},isHidden:{type:Boolean,attribute:"is-hidden"},_answeredForm:{type:Object},_visibleModals:{type:Array},_showToast:{type:Boolean},_durationToast:{type:Number},_toastForm:{type:Object},useToast:{type:String},_submitAllowed:{type:Boolean}}}constructor(){super(),this._fieldsBody=[],this._fieldsHeader=[],this._fieldsFooter=[],this.currentPage=0,this.currentStep=0,this._requiredFields=[],this._formData=[],this.visible=!1,this.isNative=!1,this.feedbackOrigin={},this.history={},this.feedbackClientVoiceConnectDm="",this.singleSignOnApiVersion=null,this.customerFeedbackApiVersion=null,this.hostLocal="",this.hostGlobal="",this.pathGlobal="",this.requiredTokenLocal="",this.requiredTokenGlobal="",this.requiredTokenLoginGlobal="",this.useSessionTkEnviroment=!1,this.language="es-ES",this.config={loader:!0},this._isError={visible:!1},this._externalData=[],this.userData={},this.saturatedForm="",this.externalHandlingErrors=[],this.maxAllowedRetries=3,this.backupFormDataResume=[],this.keys={},this.types={},this.authenticationData="",this.authenticationType="",this.allowedInactive=!1,this._answeredForm={},this.isHidden=!1,this._visibleModals=[],this.userId="",this._skipHistoryProperties=["history","keys","types","_intlResources","_intlFormats","_fieldsBody","_fieldsFooter","_fieldsHeader","core"],this._showToast=!1,this._durationToast=6e3,this._toastForm={},this.useToast="useToast",this._submitAllowed=!1,this._setKeysAndTypes()}static get styles(){return[Q,E.primaryAlt,I.primaryAlt,D.primaryAlt,C.primaryAlt,B.primaryAlt,q.primaryAlt,L.primaryAlt,z.primaryAlt,O.primaryAlt,W.primaryAlt,w.primaryAlt,X.primaryAlt,M.primaryAlt,u("feedback-client-voice-shared-styles")]}firstUpdated(){super.firstUpdated(),this.feedbackClientVoiceConnectDm=this.shadowRoot.querySelector('[data-tag-name="feedback-client-voice-connect-dm"]'),this.isHidden=!1}_setKeysAndTypes(){Object.entries(this.keys).length||(this.keys=Ne),Object.entries(this.types).length||(this.types=Ae)}async setFeedbackOrigin(e){this.feedbackOrigin=e,await this.requestUpdate(),this.getSaturatedForm()}setExternalData(e){let t=[];this.setFeedbackOrigin(e.feedbackOrigin),t=Object.keys(e.data).map((t=>({field:{name:t},value:e.data[t]}))),t.forEach((e=>{this.getters().getValueByIdFromFormData(e.field.name,this._externalData)||(this._externalData=[...this._externalData,e])})),this._dispatch("feedback-client-voice-connect-external-data-charged",this._formData)}setUserData(e){this.userData=e}_addExternalDataToForm(){var e;const t=this._externalData.map((e=>({field:{id:this.getters().getIdByName(this.core,e.field.name)},value:e.value})));t.length&&this.getProperty(null===(e=this.core)||void 0===e?void 0:e.options,"isDataExternalAllowed")&&(this._formData=[...this._formData,t].flat(),this._dispatch("feedback-client-voice-connect-external-data-added",this._formData))}getSaturatedForm(){this._isWithServices(this.customerFeedbackApiVersion)&&(this.feedbackOrigin.isPullForm&&this._showSpinner(),this.feedbackClientVoiceConnectDm.setService("saturatedform"),this.feedbackClientVoiceConnectDm.loginSSO())}setSaturatedForm(e){var t;null!=e&&e.detail?(this.saturatedForm=null==e?void 0:e.detail,this._dispatch("feedback-client-voice-connect-saturated-form-setted",this.saturatedForm),null!==(t=this.feedbackOrigin)&&void 0!==t&&t.runAll&&this.getFeedbackForm()):this._dispatch("feedback-client-voice-connect-saturated-form-empty",this.feedbackOrigin);this._closeSpinner()}getFeedbackForm(e){this._showSpinner(),this._isWithServices(this.customerFeedbackApiVersion)&&(e?this.feedbackClientVoiceConnectDm.setSaturatedId(e):this.feedbackClientVoiceConnectDm.setSaturatedId(this.saturatedForm),this.feedbackClientVoiceConnectDm.setService("feedbackform"),this.feedbackClientVoiceConnectDm.loginSSO())}_setHistory(e,t){this.history={...this.history,[e]:t}}updated(e){var t,i;this.language=(null===(t=window)||void 0===t||null===(i=t.IntlMsg)||void 0===i?void 0:i._lang)||"es-ES",super.updated(e),e.forEach(((e,t)=>{var i,s;(this._skipHistoryProperties.some((e=>e===t))||(this._setHistory(t,this[t]),this._dispatch("feedback-client-voice-connect-property-change",{propertyName:t,propertyValue:this[t],state:this.history})),["visible"].includes(t)&&this.visible&&this._closeSpinner(),"_answeredForm"===t&&!0===(null===(i=this._answeredForm)||void 0===i?void 0:i.visible))&&this._analyticsModalOpened("",null===(s=this._answeredForm)||void 0===s?void 0:s.answered)}))}reset(){var e;this.visible=!1,this.core={},this._fieldsHeader=[],this._fieldsBody=[],this._fieldsFooter=[],this.currentPage=0,this.currentStep=0,this._formData=[],this.feedbackOrigin={},this._isError={...this._isError,visible:!1},this._externalData=[],null===(e=this.feedbackClientVoiceConnectDm)||void 0===e||e.reset(),this.userData={},this.saturatedForm="",this.allowedInactive=!1,this.isHidden=!1,this._visibleModals=[],this._submitAllowed=!1,this._closeSpinner()}async setCore(e){e&&Object.entries(e).length&&this.validateFormActive(e,this.allowedInactive)?(this.core=e,await this._setFields(),await this._setVisibleModals(),this._addExternalDataToForm(),this._analyticsInitForm()):this.reset()}setIsHidden(e){this.isHidden=e,this._dispatch("feedback-client-voice-connect-form-hidden-change",e)}_setVisibleModals(){const e=this.getters().getVisibleModalsFromCore(this.core).map((e=>e.name));this._visibleModals=[...this._visibleModals,e].flat()}async _closeSpinner(){await this.updateComplete,this.clearLoader()}async _showSpinner(){await this.showLoader("transparent")}_getPagesPathByNumber(e){var t;return null===(t=this.core)||void 0===t?void 0:t.pages[e]}async _setFields(){if(this._showSpinner(),this.core){const{pages:e}=this.core;e.forEach(((e,t)=>{var i,s,a,r,o;this._fieldsHeader=[...this._fieldsHeader,null===(i=this._getPagesPathByNumber(t).header)||void 0===i?void 0:i.fields],this._fieldsBody=[...this._fieldsBody,null===(s=this._getPagesPathByNumber(t).body)||void 0===s||null===(a=s.steps[0])||void 0===a?void 0:a.fields],this._fieldsFooter=[...this._fieldsFooter,null===(r=this._getPagesPathByNumber(t))||void 0===r||null===(o=r.footer)||void 0===o?void 0:o.fields]})),this._validateForm(),this._dispatch("feedback-client-voice-connect-form-is-ready",{idForm:this.core.id,feedbackOrigin:this.feedbackOrigin}),this.visible=!this.isHidden,this._submitAllowed=!0}this._closeSpinner()}async _validateForm(){await this.updateComplete,this._disableFields(this.validateForm(this.core,this._formData))}async _disableFields(e){await this.updateComplete;[...this._fieldsFooter,...this._fieldsHeader,...this._fieldsBody].flat().filter((e=>this.getProperty(null==e?void 0:e.options,"isSubmit"))).forEach((t=>{const i=this.shadowRoot.querySelector(`[name="${t.name}"]`);i&&(i.disabled=!e)}))}changePage(e){const{pages:t}=this.core;if(this._isNavigationSuccess(e)){const i=t.findIndex((t=>t.name===e));this.currentPage=i,this._setFields(),this._closeSpinner(),this._analyticsChangePage(t)}}_openModal(e){this._visibleModals.includes(e)||(this._visibleModals=[...this._visibleModals,e]),this._closeSpinner(),this.currentPage=this.getters().getIndexPageByFiledName(this.core,e),this._dispatch("feedback-client-voice-connect-modal-open",e)}_openModalButton(e){this._visibleModals.includes(e)||(this._visibleModals=[...this._visibleModals,e]),this._closeSpinner(),this.currentPage=this.getters().getIndexPageByFiledName(this.core,e),this._dispatch("feedback-client-voice-connect-modal-open",e)}_closeModal(e){this._visibleModals=this._visibleModals.filter((t=>t!==e)),this._closeSpinner(),this.currentPage=this.getters().getIndexPageByFiledName(this.core,e),this._dispatch("feedback-client-voice-connect-modal-close",e)}_getFieldsByPage(e,t){return this._getCustomFields(this[e][t])}_getCustomFields(e=[]){return a`
      ${e.map((e=>a`
          <div
            class=${g({"container-field":!this.getProperty(e.options,"nopadding")})}
          >
            ${this.getProperty(e.options,"isslotted")?"":this.getFields(e)}
          </div>
        `))}
    `}_chargueValues(e,t){var i;return"bbvaTypeMultiCheck"===e.fieldType?this._formData.filter((t=>t.field.id===this.getters().getIdByName(this.core,e.name))).some((e=>e.value===t)):(null===(i=this._formData.find((t=>{var i;return(null==t||null===(i=t.field)||void 0===i?void 0:i.id)===this.getters().getIdByName(this.core,e.name)})))||void 0===i?void 0:i.value)||""}_stateColapseMultiStep(e,t,i,s,a){if("confirm"===s){e.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0})),this.currentStep=a+1;const i=this.shadowRoot.querySelector("#step-feedback-2");this._analyticsChangeStep(t,null==i?void 0:i.completed)}else"edit"===s&&(this.currentStep=a,this._analyticsChangeStep(t,!1))}_changeHeaderAmbient(e){var t,i,s,a,r,o,n,l,d,c,h;const p=e?"modal-initial-secondary":"modal-initial",u=null===(t=this.core)||void 0===t||null===(i=t.pages[this.currentPage])||void 0===i||null===(s=i.body)||void 0===s||null===(a=s.steps[this.currentPage])||void 0===a||null===(r=a.fields[0])||void 0===r||null===(o=r.options)||void 0===o?void 0:o.findIndex((e=>"header_type"===e.key));null!==(n=this.core)&&void 0!==n&&null!==(l=n.pages[this.currentPage])&&void 0!==l&&null!==(d=l.body)&&void 0!==d&&null!==(c=d.steps[this.currentPage])&&void 0!==c&&null!==(h=c.fields[0])&&void 0!==h&&h.options&&(this.core.pages[this.currentPage].body.steps[this.currentPage].fields[0].options[u].values=[p],this.requestUpdate())}responseTrackingStep(e){return this.getFields({id:`${e.name}-response_tracking`,fieldType:"bbva_type_text",name:"text-response_tracking",options:[{key:"size",values:["S"]},{key:"slot",values:["step-summary"]},{key:`text_${this.language}`,values:[`${this.t("feedback-client-voice-connect-tracking-init-title")} ${this.responseTracking().itemsWhitValueStep(e,this._formData)} de ${this.responseTracking().inputsNumberStep(e)}`]},{key:"icon",values:["bbva:right"]}]})}responseResume(e){const t=this.getters().getAllFieldsByOptionFromStep(this.getters().getStepByIndexAndPage(this.core,this.currentPage,e),this.keys.is_input);return this.backupFormDataResume=this._formData,a`
      ${t.map((e=>{const t=this.getters().getFieldByName(this.core,this.getProperty(e.options,"questionName")),i=this.getters().getAllDataByIdFromFormData(e.id,this._formData);return a`
          <div class="container-response-resume">
            <span class="title-response-resume"
              >${this.translate(this.getProperty,t.options,"text_",this.language)}</span
            >
            <div class="container-answer-response-resume">
              ${i.length?i.map((e=>a` <span>${this.getValueResponseResume(e)}</span> `)):a` <span>${this.t("feedback-client-voice-connect-unanswered")}</span> `}
            </div>
          </div>
        `}))}
    `}getValueResponseResume(e){const t=this.getters().getFieldById(this.core,e.field.id),i=this.getters().getOptionValuePositionFromField(this.backupFormData,t);this.backupFormDataResume=this.backupFormDataResume.filter((t=>t.field.id!==e.field.id));return this.getters().getOptionValueFromFieldAndIndex(t,i,this.language)||e.value}exitComponent(e){var t,i;this._dispatch("feedback-client-voice-connect-exit",{visible:this.visible,idForm:(null===(t=this.core)||void 0===t?void 0:t.id)||"",feedbackOrigin:this.feedbackOrigin,...e}),this.getProperty(null===(i=this.core)||void 0===i?void 0:i.options,"isSubmitOnExit")&&this._onSubmit(),this._dispatch("navigation-go-back",!0),this.reset()}_onNavigate(e){this.getProperty(e,"navigateTo")&&this._isNavigationSuccess(this.getProperty(e,"navigateTo"))&&this.changePage(this.getProperty(e,"navigateTo"))}callMethod(e,t){if(this.getProperty(e.options,t)&&He.call(this)[t]){const i=He.call(this)[t];this[i.action].call(this,i.params.call(this,e))}}_onClickItem(e){e.options.forEach((t=>{this.callMethod(e,t.key)})),this._dispatch("feedback-client-voice-connect-item-clicked",{name:e.name})}onClickItemModal(e,t){t.forEach((t=>{this.callMethod(e,t)})),this._dispatch("feedback-client-voice-connect-modal-item-click",{name:e.name})}_isNavigationSuccess(e){const{pages:t}=this.core;return t.findIndex((t=>t.name===e))>-1}_onChangeHandler(e,t){const i=e.detail.value;let s=this._formData;"bbvaTypeMultiCheck"===t.fieldType?e.detail.checked?s.push({field:{id:this.getters().getIdByName(this.core,t.name)},value:i}):s=this._formData.filter((e=>e.field.id!==this.getters().getIdByName(this.core,t.name)||e.value!==i)):(s=this._formData.filter((e=>e.field.id!==this.getters().getIdByName(this.core,t.name))),(i.length||i.toString().length)&&s.push({field:{id:this.getters().getIdByName(this.core,t.name)},value:i})),this._formData=s,this._validateForm(),this.getProperty(t.options,"fieldstoresetonchange")&&this._resetFields([this.getProperty(t.options,"fieldstoresetonchange")]),this.requestUpdate()}_getHead(e){var t;const{options:i}=(null===(t=this._getPagesPathByNumber(e))||void 0===t?void 0:t.header)||{};return a`
      <div
        class=${g({"box-flex":!0,"flex-columns":!0,"box-width-full":!0,"head-justify-center":!0,"container-header":!0})}
      >
        ${this.getProperty(i,"header_image")||this.getProperty(i,"header_microilustration")?this._getHeadImage(e):""}
        ${this._fieldsHeader[e]?this._getFieldsByPage("_fieldsHeader",e):""}
      </div>
    `}_getHeadImage(e){var t;const{options:i}=(null===(t=this._getPagesPathByNumber(e))||void 0===t?void 0:t.header)||{};return a`
      <slot name="head-image">
        ${this.getProperty(i,"header_microilustration")?a`
              <div class="micro-medium margin-head-left margin-top-32 ">
                ${r[this.getProperty(i,"header_microilustration")]}
              </div>
            `:""}
        ${this.getProperty(i,"header_image")?a`
              <div>
                <bbva-banner-image
                  fullwidth=""
                  variant="medium"
                  image-src="images/${this.getProperty(i,"header_image")}"
                ></bbva-banner-image>
              </div>
            `:""}
      </slot>
    `}_getBody(e){var t;const{options:i}=(null===(t=this._getPagesPathByNumber(e))||void 0===t?void 0:t.body)||{};return a`
      <div class="container-body ${this.getProperty(i,"class")}">
        ${this._fieldsBody[e]?this._getFieldsByPage("_fieldsBody",e):""}
      </div>
    `}_getFooter(e){var t;const{options:i}=(null===(t=this._getPagesPathByNumber(e))||void 0===t?void 0:t.footer)||{};return a`
      <div class=${this.getProperty(i,"class")}>
        ${this._fieldsFooter[e]?this._getFieldsByPage("_fieldsFooter",e):""}
      </div>
    `}_resetFields(e){e.forEach((e=>{this._formData=this._formData.filter((t=>t.field.name!==e))}))}submitExternal(){var e;this.getProperty(null===(e=this.core)||void 0===e?void 0:e.options,"isSubmitExternalAllowed")&&this._onSubmit()}_onSubmit(){var e;if(this._showSpinner(),(this.validateMultistepById(this.core,this._formData,this.currentPage)||this.getProperty(null===(e=this.core)||void 0===e?void 0:e.options,"isSubmitOnExit"))&&this._formData.length){this._submitAllowed=!1,this._addLanguageToFormData();const e={form:{id:this.core.id},feedbackData:this._formData};Object.entries(this.userData).length&&(e.userData=this.userData),this._dispatch("feedback-client-voice-connect-feedback-form-submit",e),this._isWithServices(this.hostGlobal)?(this.feedbackClientVoiceConnectDm.setData(e),this.feedbackClientVoiceConnectDm.setService("feedbackformdata"),this.feedbackClientVoiceConnectDm.loginSSO()):this._dispatch("feedback-client-voice-connect-feedback-servicesConfig-error",this.servicesConfig)}}_addLanguageToFormData(){const e={field:{id:this.getters().getIdByName(this.core,this.t("feedback-client-voice-connect-language"))},value:this.language};this._formData=[...this._formData,e]}_isWithServices(e){return this.validateObjectWithValues(e)}onConfirmSubmit(){var e;this._formData.length&&(this._onNavigate(this.core.options),this._openModal(this.getProperty(null===(e=this.core)||void 0===e?void 0:e.options,"confirmModal")),this._handleToast(),this._formData=[],this._closeSpinner(),this._dispatch("feedback-client-voice-connect-success-submit",{formData:this._formData,idForm:this.core.id,dataSentByUser:this.getters().getFieldsFilledByUSer(this._externalData,this._formData)}),this._submitAllowed=!1)}_handleToast(){var e;this.getProperty(null===(e=this.core)||void 0===e?void 0:e.options,this.useToast)&&(this._showToast=!0,this._toastForm={descText:this.t("feedback-client-voice-connect-succes-toast")})}_onConfirmSubmitError(){this._dispatch("feedback-client-voice-connect-error-submit",this._formData)}_onError(e){this._isError={visible:!0,errorTitle:this.t("feedback-client-voice-connect-error-default-title"),errorMessage:this.t("feedback-client-voice-connect-error-default-text"),buttonText:this.t("feedback-client-voice-connect-error-close-button-text"),headerTitle:this.t("feedback-client-voice-connect-error-header-title"),...e},this._closeSpinner()}errorOnServiceLoad(){this._onError({headerActionClose:"exitComponent",footerActionClose:"exitComponent"}),this._closeSpinner()}errorOnServiceLoadRetry(){this._onError({buttonText:this.t("feedback-client-voice-connect-error-retry-button-text"),headerActionClose:"exitComponent",footerActionClose:"getSaturatedForm"}),this._closeSpinner()}errorOnServiceSend(){this._onError({errorTitle:this.t("feedback-client-voice-connect-error-operative-title"),errorMessage:this.t("feedback-client-voice-connect-error-operative-text"),headerActionClose:"exitComponent",footerActionClose:"exitComponent"}),this._closeSpinner()}errorOnServiceSendRetry(){this._onError({errorTitle:this.t("feedback-client-voice-connect-error-operative-title"),errorMessage:this.t("feedback-client-voice-connect-retry-error-operative-text"),buttonText:this.t("feedback-client-voice-connect-error-retry-button-text"),headerActionClose:"exitComponent",footerActionClose:"_onSubmit"}),this._submitAllowed=!0,this._closeSpinner()}_onLoadError(e){this._dispatch("feedback-client-voice-connect-onload-error",e),this._closeSpinner()}get _getPage(){const{pages:e}=this.core;return e?a`
        ${e.map(((e,t)=>a`<div class="feedback-client-voice-connect-container">
                ${this._getHead(t)}${this._getBody(t)}${this._getFooter(t)}
              </div>
            </div>
            <p class="color-transparent">Not Found</p>`))}
      `:a` <div class="color-transparent">Not Found</div> `}get getDataManager(){return a`
      <feedback-client-voice-connect-dm
        id="dm"
        appId=${this.appId}
        countryId=${this.countryId}
        channelId=${this.channelId}
        segmentId=${this.segmentId}
        .feedbackOrigin=${this.feedbackOrigin}
        aapTarget=${this.aapTarget}
        targetIdUniqueKey=${this.targetIdUniqueKey}
        userId=${this.userId}
        ?isNative=${this.isNative}
        hostGlobal=${this.hostGlobal}
        hostSSO=${this.hostLocal}
        pathGlobal=${this.pathGlobal}
        requiredTokenLocal=${this.requiredTokenLocal}
        requiredTokenGlobal=${this.requiredTokenGlobal}
        requiredTokenLoginGlobal=${this.requiredTokenLoginGlobal}
        authenticationData=${this.authenticationData}
        authenticationType=${this.authenticationType}
        singleSignOnApiVersion=${this.singleSignOnApiVersion}
        customerFeedbackApiVersion=${this.customerFeedbackApiVersion}
        ?useSessionTkEnviroment=${this.useSessionTkEnviroment}
        .externalHandlingErrors=${this.externalHandlingErrors}
        max-allowed-retries=${this.maxAllowedRetries}
        @feedback-client-voice-connect-feedback-form-fetched=${e=>this.setCore(e.detail)}
        @feedback-client-voice-fetch-saturated-form=${this.setSaturatedForm}
        @feedback-client-voice-connect-saturated-form-error=${this._onLoadError}
        @feedback-client-voice-connect-generic-dm-error=${this._onLoadError}
        @feedback-client-voice-connect-sso-error=${this._onLoadError}
        @feedback-client-voice-connect-feedback-form-error=${this._onLoadError}
        @feedback-client-voice-connect-load-form-error=${this.errorOnServiceLoad}
        @feedback-client-voice-connect-load-form-retry=${this.errorOnServiceLoadRetry}
        @feedback-client-voice-connect-data-sent=${this.onConfirmSubmit}
        @feedback-client-voice-connect-data-sent-error=${this.errorOnServiceSend}
        @feedback-client-voice-connect-data-sent-retry=${this.errorOnServiceSendRetry}
      ></feedback-client-voice-connect-dm>
    `}resetRetries(){this.feedbackClientVoiceConnectDm.errorTries.data=0}sendData(){this.feedbackClientVoiceConnectDm.sendData()}setAnsweredForm(e){this._answeredForm={visible:!0,...e}}get _getModalError(){var e,t,i,s,r;return a`
      <bbva-help-modal
        i-o-s-fixed-header
        ?full-height=${!0}
        modal-type="error"
        body-text=${null===(e=this._isError)||void 0===e?void 0:e.errorMessage}
        button-text=${null===(t=this._isError)||void 0===t?void 0:t.buttonText}
        ?visible=${this._isError.visible||!1}
        @help-modal-footer-button-click=${()=>{this._isError.footerActionClose&&this[this._isError.footerActionClose]()}}
        @help-modal-header-click=${()=>{this._isError.headerActionClose&&this[this._isError.headerActionClose]()}}
        @help-modal-close=${()=>{this._isError={...this._isError,visible:!1}}}
        .fixedFooter=${!0}
        class="modal-error margin-left-8"
        ?hide-content-padding-top="false"
        header-text=${null===(i=this._isError)||void 0===i?void 0:i.headerTitle}
        header-close-icon-aria-label=""
        link-text=""
      >
        <div slot="slot-content">
          <div class="micro-medium margin-left-8">
            <slot name="head-image">${m}</slot>
          </div>
          <bbva-type-text
            class=""
            text=${null===(s=this._isError)||void 0===s?void 0:s.errorTitle}
            size="3XL"
            font-weight="700"
            alignment=""
          ></bbva-type-text>
          <bbva-type-text
            class=""
            text=${null===(r=this._isError)||void 0===r?void 0:r.errorMessage}
            size="S"
            alignment=""
          ></bbva-type-text>
        </div>
      </bbva-help-modal>
    `}get _getModalInfo(){var e,t;return a`
      <bbva-help-modal
        id="answered-form"
        modal-type="success"
        body-text="${this.t(null===(e=this._answeredForm)||void 0===e?void 0:e.bodyText)}"
        ?visible="${this._answeredForm.visible||!1}"
        @help-modal-header-click=${()=>{this.exitComponent()}}
        @help-modal-veil-click=${()=>{this.exitComponent()}}
        @help-modal-close=${()=>{this._answeredForm={...this._answeredForm,visible:!1}}}
        class="modal-error margin-left-8"
        header-text="${null===(t=this._answeredForm)||void 0===t?void 0:t.headerTitle}"
        header-close-icon-aria-label=""
        link-text=""
        title-icon="bbva:info"
      >
      </bbva-help-modal>
    `}get _getToastNotification(){return a`
      <bbva-notification-toast
        class="success-toast"
        id="notification-success"
        name="notification-success"
        ?show=${this._showToast}
        type="success"
        fixed-bottom
        auto-hide
        duration=${this._durationToast}
        @notification-toast-close=${()=>{this.exitComponent()}}
        @notification-toast-open=${()=>{this._analyticsToastOpen()}}
      >
        <p class="margin-p-toast">${this._toastForm.descText}</p>
      </bbva-notification-toast>
    `}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}render(){return a`
      ${super.render()}
      <div id="base-element-feedback-client-voice-connect" ambient="primary-alt">
        ${this.core&&this.visible?this._getPage:""} ${this.getDataManager}
        ${this._getModalError}${this._getModalInfo}
        ${this._showToast?this._getToastNotification:""}
      </div>
    `}}export{Ve as F};
