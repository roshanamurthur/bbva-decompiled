import"./216055dc.js";import"./fdaf13ec.js";import{z as e,a8 as t,ar as r,a9 as i,cs as a,ac as o,ad as n,ab as s,aa as c,a as l,an as d,ct as b,aH as p,ag as u,af as m,bF as h,aN as v,ah as f,h as g,ak as y,as as $,at as S,L as _,av as q,i as x,g as C,ap as k,bx as R,aW as w,b5 as I,bU as E,aG as T}from"./952f98a9.js";import{ao as L}from"./7f3d7ca9.js";import"./4d1e2af0.js";import"./b24c6aae.js";import"./3990b0e0.js";import{b as z}from"./055a082b.js";import"./cbdb76eb.js";import"./7639f5bb.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./ca32b966.js";import"./4adf0da4.js";const P=new r;var A=e`[ambient^=light] {
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
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
}
${P.mediaRules()}`;const B=new r;var M=e`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${t(i.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${t(i.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${t(i.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${t(i.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${t(i.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${t(i.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${t(i.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${t(i.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${t(i.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${t(i.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${t(i.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
}
${B.mediaRules()}`;const N={dark:e`
    ${M}
    ${a.dark}
  `,light:e`
    ${A}
    ${a.light}
  `};var V=e`:host {
  --_field-bg-color: var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${t(i.secondary100)}));
  --_field-input-color: var(--bbva-form-field-input-color,var(--colorsSecondary600, ${t(i.secondary600)}));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-label-out-color: var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${t(i.secondary600)}));
  --_field-label-color: var(--bbva-form-field-label-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-border-color: var(--bbva-form-field-border-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${t(i.secondary600)}));
  --_message-color: var(--bbva-form-field-message-color,var(--colorsSecondary600, ${t(i.secondary600)}));
  --_message-icon-color: var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)}));
  --_info-message-color: var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${t(i.secondary500)}));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${t(i.primaryCoreDark)}));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${t(i.tertiaryType5Lightened)}));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${t(i.secondary600)}));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${t(i.tertiaryType5Medium)}));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)}));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)}));
  --_help-icon-color: var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
  --_action-icon-color: var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)}));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${t(i.primaryCore)}));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
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
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
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
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${t(o.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus))::placeholder {
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
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${t(o.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${t(n.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${t(s.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${t(o.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${t(n.typeSmall)}));
  color: var(--_field-label-out-color);
}

.help-icon {
  color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
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
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
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
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${t(o.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${t(n.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
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
`;class D extends(l(d(b))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":p,"bbva-text":u,"bbva-core-icon":m}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=h(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=v(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=f(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?g`
          <bbva-core-icon @click="${this._helpClicked}" class="help-icon" .icon="${this.helpIcon}">
          </bbva-core-icon>
        `:""}get _labelOut(){return this.labelOut?g`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,V,N.light,N.dark,y("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return g`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return g`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.readonly&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return g`
      <bbva-button-icon
        tabindex="-1"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return g` <bbva-button-icon
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      .variant="${this.actionVariant}"
    >
    </bbva-button-icon>`}get rightIcon(){return this.actionIcon?g`
          <div class="wrapper-action">
            <bbva-core-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?g`
          <div class="message error" role="alert">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?g`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return g`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}customElements.define(D.is,D);const O=new r;var F=e`@charset "UTF-8";
:host {
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

.slot-input ::slotted(input) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${t(o.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em);
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
${O.mediaRules()}`;const j={dark:e`
    ${N.dark}
  `,light:e`
    ${N.light}
  `};class H extends($(S(l(D)))){static get is(){return"bbva-form-amount"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("blur",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("blur",this._checkTrailingDecimal)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(e){super.updated&&super.updated(e),e.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),e.has("value")&&this.formatValue(this.value),(e.has("localCurrency")||e.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,F,j.dark,j.light,y("bbva-form-amount-shared-styles")]}get amount(){return this.value?Number(this.value.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0}set amount(e){Number.isFinite(e)&&(this.value=String(e).replace(/\./g,this._separator))}get _isRightAligned(){return this._alignRight}get labelBlock(){return g`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.label}</span>
    `}get inputLabel(){return`${this.label} (${this._currency})`}get field(){return g`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.backAmount} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get backAmount(){return g`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${this._isRightAligned?"right":""} ${this.placeholder&&!this.value?"hide-currency":""}"
          >${this._currency}</span
        >
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const t=this._isRightAligned?0:this._currencyBlock.offsetWidth,r=e`
      ${t/16}rem
    `;this._formElement.style.setProperty("margin-left",r)}_formatNumber(e,t){return t?e.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):e.replace(/\D/g,"")}_formatCurrency(e,t){let r;if(e.indexOf(t)>=0){const i=e.indexOf(t);let a=e.substring(0,i),o=e.substring(i);a=this._formatNumber(a,!0),o=this._formatNumber(o,!1),o=o.substring(0,this.decimalDigits),r=this.decimalDigits?a+t+o:a}else r=this._formatNumber(e,!0);return r}formatValue(e){if(""===e||null==e)return void this._fireChange(e,this.amount);const t=String(e),r=this._formElement,i=t.length;let a=r.selectionStart;const o=this._formatCurrency(t,this._separator);r.value=o,t===o&&this._fireChange(o,this.amount),this.value=r.value;a=o.length-i+a,r.setSelectionRange(a,a)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(e,t){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:e,amount:t},bubbles:!0,composed:!0}))}}customElements.define(H.is,H);var X=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
* bbva-expandable-multistep, *:before bbva-expandable-multistep, *:after bbva-expandable-multistep {
  height: auto;
}

.centerButton {
  margin: 1rem auto;
  display: flex;
  max-width: 8.5rem;
  padding: 0.75rem 1rem;
}

.paddingLeftAmount {
  padding-left: 1rem;
}

.align-left {
  padding-left: 0;
}

.colorIconModal {
  --_help-modal-title-icon-color: var(--bbva-dark-red, #B92A45) ;
}

.colorHeaderCategory {
  --_header-category-heading-color: var(--bbva-500, #666666);
}

.margin-up-form-text {
  margin-top: 1rem;
}

.confirm {
  display: flex;
  flex-direction: column;
  justify-content: center;
  position: fixed;
  z-index: 1;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: var(--colorsPrimaryCoreLightened, #ffffff);
}

bbva-text.dark {
  color: #000;
}

bbva-expandable-multistep {
  height: auto !important;
}

bbva-expandable-step {
  height: auto !important;
}

.summary {
  overflow-wrap: anywhere;
}
`;const U=new r;var W=e`:host {
  display: inline-block;
  box-sizing: border-box;
  font-size: var(--bbva-badge-notification-font-size, var(--typographyType3XSmall, ${t(o.type3XSmall)}));
  font-weight: var(--bbva-badge-notification-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(s.medium.fontWeight)}));
  --_default-bg-color: var(--bbva-badge-notification-dark-mode-bg-color, var(--bbva-badge-notification-bg-color,var(--colorsPrimaryCoreLight, ${t(i.primaryCoreLight)})));
  --_default-color: var(--bbva-badge-notification-dark-mode-color, var(--bbva-badge-notification-color, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)})));
  --_bg-color-alert: var(--bbva-badge-notification-dark-mode-alert-bg-color, var(--bbva-badge-notification-alert-bg-color,var(--colorsTertiaryType1Dark, ${t(i.tertiaryType1Dark)})));
  --_color-alert: var(--bbva-badge-notification-dark-mode-alert-color, var(--bbva-badge-notification-alert-color,var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)})));
}

:host([border-1]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-1, var(--bbva-border-badge-notification-color-1, none));
}

:host([border-2]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-2, var(--bbva-border-badge-notification-color-2, none));
}

:host([border-3]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-3, var(--bbva-border-badge-notification-color-3, none));
}

:host([border-4]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-4, var(--bbva-border-badge-notification-color-4, none));
}

:host([border-5]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-5, var(--bbva-border-badge-notification-color-5, none));
}

:host([border-6]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-6, var(--bbva-border-badge-notification-color-6, none));
}

:host([border-7]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-7, var(--bbva-border-badge-notification-color-7, none));
}

:host([border-8]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-8, var(--bbva-border-badge-notification-color-8, none));
}

:host([border-9]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: none;
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

.badge-notification {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  min-width: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  max-width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  border-radius: 0.75rem;
  background-color: var(--_default-bg-color);
  color: var(--_default-color);
  z-index: 1;
}

:host([position=right]) {
  position: relative;
}
:host([position=right]) .badge-notification {
  position: absolute;
  right: -0.8125rem;
  top: -0.625rem;
}
:host([position=right]) .badge-notification.maximum {
  right: -1.75rem;
  width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}
:host([position=right]) ::slotted(*) {
  -webkit-mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="-100 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  -webkit-mask-composite: xor;
  mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="-100 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  mask-composite: exclude;
}

:host([position=left]) {
  position: relative;
  margin-left: var(--_margin-left, calc(((1.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem));
}
:host([position=left]) .badge-notification {
  position: absolute;
  left: -0.8125rem;
  top: -0.625rem;
}
:host([position=left]) .badge-notification.maximum {
  left: -1.75rem;
  width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  --_margin-left: 28px;
}
:host :host([position=left]) .badge-notification.maximum {
  margin-right: gridSpacer8(13px);
}
:host([position=left]) ::slotted(*) {
  -webkit-mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  -webkit-mask-composite: xor;
  mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  mask-composite: exclude;
}

:host([variant=alert]) .badge-notification {
  background-color: var(--_bg-color-alert);
  color: var(--_color-alert);
}
${U.mediaRules()}`;const G=new r;var Q=e`[ambient^=light] {
  --bbva-badge-notification-dark-bg-color: initial;
  --bbva-badge-notification-dark-color: initial;
  --bbva-badge-notification-alert-bg-color: initial;
  --bbva-badge-notification-alert-color: initial;
  --bbva-badge-notification-border-width: 1px;
  --bbva-badge-notification-border-style: solid;
  --bbva-badge-notification-border-radius: 24px;
  --bbva-border-light-badge-notification-color-1: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-border-light-badge-notification-color-2: var(--colorsSecondary100, ${t(i.secondary100)});
}
${G.mediaRules()}`;const Y=new r;var Z=e`[ambient^=dark] {
  --bbva-badge-notification-dark-bg-color: var(--colorsPrimarySubduedLight, ${t(i.primarySubduedLight)});
  --bbva-badge-notification-dark-color: var(--colorsSecondary600, ${t(i.secondary600)});
  --bbva-badge-notification-alert-bg-color: var(--colorsPrimarySubduedLight, ${t(i.primarySubduedLight)});
  --bbva-badge-notification-alert-color: var(--colorsSecondary600, ${t(i.secondary600)});
  --bbva-badge-notification-border-width: 1px;
  --bbva-badge-notification-border-style: solid;
  --bbva-badge-notification-border-radius: 24px;
  --bbva-border-badge-notification-color-1: var(--colorsPrimaryCore, ${t(i.primaryCore)});
  --bbva-border-badge-notification-color-2: var(--colorsPrimaryCoreDark, ${t(i.primaryCoreDark)});
  --bbva-border-badge-notification-color-3: var(--colorsPrimaryCoreLight, ${t(i.primaryCoreLight)});
  --bbva-border-badge-notification-color-4: var(--colorsPrimaryMedium, ${t(i.primaryMedium)});
  --bbva-border-badge-notification-color-5: var(--colorsPrimaryCoreDarkened, ${t(i.primaryCoreDarkened)});
  --bbva-border-badge-notification-color-6: var(--colorsTertiaryType4Dark, ${t(i.tertiaryType4Dark)});
  --bbva-border-badge-notification-color-7: var(--colorsTertiaryType6Dark, ${t(i.tertiaryType6Dark)});
}
${Y.mediaRules()}`;const J={dark:e`
    ${Z}
  `,light:e`
    ${Q}
  `};class K extends(l(_)){static get is(){return"bbva-badge-notification"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},text:{type:Number},variant:{type:String,reflect:!0},position:{type:String,reflect:!0}}}static get styles(){return[W,J.light,J.dark,y("bbva-badge-notification-shared-styles")]}get truncate(){return this.text>999?"+99":this.text}render(){return g`
      <span
        class="badge-notification ${q({maximum:this.text>99})}"
        aria-label=${x(this.accessibilityText)}
        >${this.truncate}</span
      >
      <slot></slot>
    `}}C("colors.primarySubduedLight"),C("colors.cool100"),C("colors.tertiaryType1Light"),C("colors.cool100"),C("colors.cool100"),C("colors.cool90"),C("colors.cool80"),C("colors.cool70"),C("colors.cool60"),C("colors.cool50"),C("colors.tertiaryType6Darkened"),C("colors.tertiaryType4Darkened");const ee=new r;var te=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(i.primaryCoreDarkened)}));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(i.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --_color-modal-three-level: var(--colorsSecondary600, ${t(i.secondary600)});
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(i.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(i.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)}));
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
  margin-left: auto;
  margin-right: auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: block;
  position: relative;
  border: none;
  background: none;
  width: var(--bbva-header-main-min-height, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.left-group {
  order: 0;
}
.header-main .header-icons.right-group {
  order: 2;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(o.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  order: 1;
  min-width: 0;
}
.header-main .heading-wrapper.half-space ~ .header-icons {
  min-width: 2.875rem;
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
  color: var(--_text-color);
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
}
.header-main .heading-wrapper.full-space ~ .header-icons {
  min-width: 5.75rem;
}

:host([variant*=modal]) {
  background-color: var(--_bg-color-modal);
}

:host([variant*=modal-three-level]) {
  background-color: var(--_bg-color-modal-three-level);
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--_bg-color-process);
}

:host([variant*=sign]) {
  background-color: var(--_bg-color-sign);
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${ee.mediaRules()}`;class re extends(l(k(d(_)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":u,"bbva-core-icon":m,"bbva-badge-notification":K}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,r=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(t,r);return i in e?e[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24}static get styles(){return[te,y("bbva-header-main-shared-styles"),R("button:focus")]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return g`<bbva-core-icon
      icon="${x(this[e])}"
      size="${this.iconSize}"
    ></bbva-core-icon>`}_badgeNotification(e){return g`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,r){const i=re.toCamelCase(e),a=`icon${i}`,o=`accessibilityTextIcon${i}`;return g`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${x(this.t(this[o]))}"
      aria-expanded=${x(r)}
      ?hidden="${!this[a]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(a):this._icon(a)}
    </button>`}_tplHeading(e){return g`
      <bbva-text
        unset
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        aria-label="${this.t(e)}"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:r,image:i,_hasMicroillustration:a,microillustration:o}=this;return g`
      <header class="header-main">
        <h1
          class="heading-wrapper ${e} ${t}"
          id="heading"
          aria-label=${x(r&&" "!==r?void 0:"presentation")}
        >
          ${r&&" "!==r&&this._tplHeading(r)||""}
          <img src="${x(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

          <span class="${a}" ?hidden="${!o}" aria-hidden="true">
            ${this.microillustration&&w[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons left-group">
          ${this._tplButton("left-primary","icon primary")}
          ${this._tplButton("left-secondary","icon secondary")}
        </div>

        <div class="header-icons right-group">
          ${this._tplButton("right-secondary","icon secondary")}
          ${this._tplButton("right-primary","icon primary",this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(re.is,re);class ie extends(d(_)){static get is(){return"bbva-multistep-codi-qr-payments-p2m-request"}static get properties(){return{currentStepLabel:{type:String,attribute:!1},_totalSteps:{type:Number,attribute:!1},_headerStepOne:{type:String},_headerStepTwo:{type:String},_headerStepThree:{type:String},accountSelect:{type:Object},dataContracts:{type:Array},amountLimitRequest:{type:Number},language:{type:String,attribute:"language"},currencyCode:{type:String,attribute:"local-currency"},localCurrency:{type:String,attribute:"currency-code"},referenceRequest:{type:String},conceptRequest:{type:String},amountRequest:{type:Number},helpIcon:{type:String},invalidAmountRequest:{type:Boolean},conceptAmount:{type:Number},_alertAmount:{type:Boolean},dataQrRequest:{type:Object},showPanelButton:{type:Boolean}}}constructor(){super(),this.currentStepLabel="codi-qr-payments-p2p-request-heading-step-label",this._headerStepOne="codi-qr-payments-p2p-request-expandable-step-header-one",this._headerStepTwo="codi-qr-payments-p2p-request-expandable-step-header-two",this._headerStepThree="codi-qr-payments-p2p-request-expandable-step-header-three",this._totalSteps=3,this.amountRequest=0,this.conceptRequest="Sin concepto",this.currencyCode="MXN",this.localCurrency="MXN",this.language="es-MX",this.helpIcon="bbva:help",this.accountSelect={},this.dataContracts=[],this.showPanelButton=!1,this.amountLimitRequest=1e5}static get styles(){return[X,j.dark,y("bbva-multistep-codi-qr-payments-p2m-request-shared-styles")]}_fireEvent(e,t,r=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:r,composed:i}))}setAmountLimitRequest({maximumRequestAmountCodi:e}){this.amountLimitRequest=e.value}resetMultistep(){this.accountSelect={},this.amountRequest="",this.conceptRequest="",this.shadowRoot.getElementById("stepOne").completed=!1,this.shadowRoot.getElementById("stepTwo").completed=!1,this.shadowRoot.getElementById("stepThree").completed=!1,this.shadowRoot.getElementById("stepTwo").disabled=!0,this.shadowRoot.getElementById("stepThree").disabled=!0,this.showPanelButton=!1,this.closeButtonFixed()}_allStepsCompleted(e){this.showPanelButton=e.detail}_onClickButtonPanelMultistep(){this._fireEvent("panel-button-fixed-item-click")}closeButtonFixed(){this._fireEvent("close-button-fixed-end-flow",!1)}_openModalAlerteChangeAccount(){this._fireEvent("codi-qr-payments-p2m-create-full-modal-warning"),this.shadowRoot.getElementById("stepOne").completed=!0}bindAccountSelectSummaryProperty(e){this.accountSelect=e.detail.value,this.shadowRoot.getElementById("stepOne").completed=!0}_onClickHeaderButtonMain(){this._fireEvent("close-header-main",!1)}_renderMultiStepHeader(){return g` 
    <bbva-header-main
      id="header"
      variant="modal"
      icon-size="20"
      position="fixed"
      accessibility-text-icon-right-primary="Close"
      .iconRightPrimary="${h()}"
      .text="${this.t("codi-qr-payments-p2p-request-bbva-header")}"
      @header-main-icon-right-primary-click="${this._onClickHeaderButtonMain}"
      >
      </bbva-header-main>`}_stepAccountSelector(){return g`
    <bbva-expandable-step 
        id="stepOne"
        header="${this.t(this._headerStepOne)}"
        current-step-label="${this.t(this.currentStepLabel,{step:1,total:this._totalSteps})}"
        edit-label="codi-qr-payments-p2p-request-expandable-step-edit"
        disabled-target=".action"
        @expandable-step-edit-step="${this._openModalAlerteChangeAccount}"
        @multistep-bind-summary-property="${this.bindAccountSelectSummaryProperty}"
      >
          <div class="content">
            <bbva-step-select-account-payments-p2m-request
              .dataContracts=${this.dataContracts}
            >
            </bbva-step-select-account-payments-p2m-request>
          </div>
          <div class="summary" slot="summary"  ambient="dark">
              <bbva-multistep-codi-qr-payments-p2m-request-summary    step="summary-step-0"
                .accountSelect="${this.accountSelect}"
              >
              </bbva-multistep-codi-qr-payments-p2m-request-summary>
          </div>
      </bbva-expandable-step>
    `}bindAmountProperty(e){const t=e.detail.value;this.amountRequest=Number.isNaN(t)?0:t}async openAmountStep(){await this.closeButtonFixed(),this.shadowRoot.getElementById("stepThree").completed=await!1,this.shadowRoot.getElementById("stepThree").disabled=await!0}_stepAmountInput(){return g`
      <bbva-expandable-step
        id="stepTwo"
        header="${this.t(this._headerStepTwo)}"
        disabled-target=".action"
        current-step-label="${this.t(this.currentStepLabel,{step:2,total:this._totalSteps})}"
        edit-label="codi-qr-payments-p2p-request-expandable-step-edit"
        @expandable-step-edit-step="${this.openAmountStep}"
        @multistep-bind-summary-property="${this.bindAmountProperty}"
      >
        <div class="content">
          <bbva-step-amount-payments-p2m-request
            .currencyCode="${this.currencyCode}"
            .localCurrency="${this.localCurrency}"
            .language="${this.language}"
            .amountRequest="${this.amountRequest}"
            .amountLimitRequest="${this.amountLimitRequest}"
          >
          </bbva-step-amount-payments-p2m-request>
        </div>
        <div class="summary" slot="summary" ambient="dark">
          <bbva-multistep-codi-qr-payments-p2m-request-summary        
            step="summary-step-1"
            .amountRequest="${this.amountRequest}"
            ambient="dark"
            >
          </bbva-multistep-codi-qr-payments-p2m-request-summary>
        </div>
      </bbva-expandable-step>
    `}bindReferenceAndConceptProperty(e){const t=e.detail;"conceptRequest"===t.property?this.conceptRequest=""===t.value?"Sin concepto":t.value:"referenceRequest"===t.property&&(this.referenceRequest=t.value)}_stepConceptInput(){return g`
    <bbva-expandable-step 
      id="stepThree"
      header="${this.t(this._headerStepThree)}" 
      current-step-label="${this.t(this.currentStepLabel,{step:3,total:this._totalSteps})}"
      edit-label="codi-qr-payments-p2p-request-expandable-step-edit"
      disabled-target=".action"
      @expandable-step-edit-step="${this.closeButtonFixed}"
      @multistep-bind-summary-property="${this.bindReferenceAndConceptProperty}"
      >
        <div class="content">
          <bbva-step-concept-and-reference-payments-p2m-request
            amountRequest="${this.amountRequest}"
            .conceptRequest="${this.conceptRequest}"
            .referenceRequest="${this.referenceRequest}"
          >
          </bbva-step-concept-and-reference-payments-p2m-request>
        </div>
        <div class="summary" slot="summary"  ambient="dark">
            <bbva-multistep-codi-qr-payments-p2m-request-summary    step="summary-step-2"
              .conceptRequest="${this.conceptRequest}"
              .referenceRequest="${this.referenceRequest}"
              ambient="dark"
            >
            </bbva-multistep-codi-qr-payments-p2m-request-summary>
        </div>
      </bbva-expandable-step>
    `}_renderListDefAmount(){return g`
      <div
        class="confirm"
        ?hidden=${!this.showPanelButton}
        ?show=${this.showPanelButton}>
        <bbva-list-definition-amount
          id="defAmount"
          center
          amount="${this.amountRequest}"
          variant-amount="4xl"
          decimal-digits="2"
          currency-code="${this.localCurrency}" 
          local-currency="${this.localCurrency}" 
          language="${this.language}"
          ?show="${this.amountRequest>0}"
          ?hidden="${this.amountRequest<=0}"
          title="${this.t("codi-request-qr-panel-button-label")}"
          description="${this.t("codi-request-qr-panel-button-description-extra")}">
        </bbva-list-definition-amount>
        <bbva-button-default
            id="paymentRequestBtn"
            text="${this.t("codi-request-qr-button-create-qr")}"
            @click="${this._onClickButtonPanelMultistep}"
            class="centerButton"
          >
        </bbva-button-default>
      </div>
      `}render(){return g`
    ${this._renderMultiStepHeader()}
    <bbva-expandable-multistep
      step-selector='[data-tag-name="bbva-expandable-step"]'
      @expandable-multistep-all-complete="${this._allStepsCompleted}">
      <!-- AMOUNT STEP1 -->
      ${this._stepAccountSelector()}
      <!-- AMOUNT STEP2 -->
      ${this._stepAmountInput()}
      <!-- AMOUNT STEP3 -->
      ${this._stepConceptInput()}
      <!-- Panel Button -->
      ${this._renderListDefAmount()}
    </bbva-expandable-multistep>
    `}}class ae extends(d(_)){static get is(){return"bbva-multistep-codi-qr-payments-p2m-request-summary"}static get properties(){return{accountSelect:{type:Object},amountRequest:{type:Number},conceptRequest:{type:String},referenceRequest:{type:String},step:{type:String},ambient:{type:String}}}constructor(){super(),this.amountRequest=0,this.accountSelect={},this.step="",this.conceptRequest="codi-qr-payments-p2p-request-bbva-list-simple-description-concept"}static get styles(){return[X,z.dark,j.dark,y("bbva-multistep-codi-qr-payments-p2m-request-summary")]}step0Summary(){return g`
        <bbva-list-multistep-account
            .name="${this.accountSelect.productTitle?this.accountSelect.productTitle:""}"
            .amount="${this.accountSelect.specificAmount?this.accountSelect.specificAmount:""}"
            .number="${this.accountSelect.numProduct}"
            .description="${this.accountSelect.specificAmountName?this.accountSelect.specificAmountName:""}"
            visible-chars="4"
            currency-code="MXN" 
            language="es-MX" 
            local-currency="MXN"
            >
        </bbva-list-multistep-account>
      `}step1Summary(){return 0===this.amountRequest||""===this.amountRequest?g`
    <bbva-list-simple
      label= "${this.t("codi-qr-payments-p2p-request-bbva-list-simple-label-import")}"
      label-medium=""
      ambient="${this.ambient}"
    >
    </bbva-list-simple>
    `:g`
    <bbva-amount
        .amount="${this.t(this.amountRequest)||"QR sin importe"}"
        variant="4xl"
        currency-code="MXN" 
        language="es-MX" 
        local-currency="MXN"
        ambient="${this.ambient}"
        class="paddingLeftAmount"
        >
    </bbva-amount>
    `}step2Summary(){return g`
    <bbva-list-simple
        label= "${this.t("codi-qr-payments-p2p-request-bbva-list-simple-label-reference")}"
        label-medium=""
        .description="${this.referenceRequest}"
        ambient="${this.ambient}"
        >
    </bbva-list-simple>
    <bbva-list-simple
        label= "${this.t("codi-qr-payments-p2p-request-bbva-list-simple-label-concept")}"
        label-medium=""
        .description="${this.t(this.conceptRequest)||"Sin concepto"}"
        ambient="${this.ambient}"
        >
    </bbva-list-simple>
  `}render(){switch(this.step){case"summary-step-0":return g`${this.step0Summary()}`;case"summary-step-1":return g`${this.step1Summary()}`;case"summary-step-2":return g`${this.step2Summary()}`;default:return g``}}}class oe extends(d(_)){static get is(){return"bbva-step-amount-payments-p2m-request"}static get properties(){return{amountRequest:{type:Number},amountLimitRequest:{type:Number},currencyCode:{type:String},localCurrency:{type:String},helpIcon:{type:String},language:{type:String},_invalidAmountRequest:{type:Boolean},_amountRequestConfig:{type:Object}}}constructor(){super(),this._invalidAmountRequest=!1,this.helpIcon="bbva:help",this.amountLimitRequest=1e5,this.amount=0,this._amountRequestConfig={errorMessage:"codi-qr-payments-p2p-request-bbva-form-amount-error-message",errorIconSize:"16",infoIconSize:"16",infoIcon:"coronita:info",errorIcon:"coronita:alert",labelOut:"codi-qr-payments-p2p-request-bbva-form-amount-label-out",label:"codi-qr-payments-p2p-request-bbva-form-amount-label",helpIcon:"coronita:help",autoValidate:"true",bubbleEvent:"true",maxlength:9}}_fireEvent(e,t,r=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:r,composed:i}))}moneyFormat(e){return`$${e.toLocaleString("en-US")}.00`}fireCompleteEvent(){this._fireEvent("complete"),this._fireEvent("amount-step-finished",{amount:this.amountRequest,currency:this.localCurrency})}static get styles(){return[X,y("bbva-multistep-codi-qr-payments-p2m-request-shared-styles")]}openModalInfoCodi(){this._fireEvent("open-modal-info-codi")}validAmountRequest(e){return e>this.amountLimitRequest}validAmount(e){const t=e.detail.amount;this._fireEvent("multistep-bind-summary-property",{property:"amountRequest",value:t}),this._invalidAmountRequest=this.validAmountRequest(t),this.shadowRoot.querySelector("#amountRequest").invalid=this._invalidAmountRequest}render(){return g`
        <bbva-form-amount
            id="amountRequest"
            currency-code="${this.currencyCode}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            decimal-digits="2"
            value="${0===this.amountRequest?"":this.amountRequest}"
            label="${this.t(this._amountRequestConfig.label)}"
            label-out="${this.t(this._amountRequestConfig.labelOut)}"
            error-message="${this.t(this._amountRequestConfig.errorMessage,{amountLimit:this.moneyFormat(this.amountLimitRequest)})}"
            info-icon-size="${Number(this._amountRequestConfig.infoIconSize)}"
            error-icon-size="${Number(this._amountRequestConfig.errorIconSize)}"
            help-icon="${this._amountRequestConfig.helpIcon}"
            error-icon="${this._amountRequestConfig.errorIcon}"
            info-icon="${this._amountRequestConfig.infoIcon}"
            auto-validate
            @form-field-help-click="${this.openModalInfoCodi}"
            @form-amount-input-change="${this.validAmount}"
            allowed-pattern="[0-7]"
            maxlength="${this.moneyFormat(this.amountLimitRequest).length}"
            .invalid="true"
            max=${this.amountLimitRequest}
            optional-label=""
        >
        </bbva-form-amount>

        <bbva-button-default
        class="centerButton"
        id="btnAmountStep"
        text="${this.t("codi-qr-payments-p2p-request-bbva-button-text")}"
        .disabled="${this._invalidAmountRequest}"
        @click="${this.fireCompleteEvent}">
        </bbva-button-default>
        `}}class ne extends(l(d(_))){static get is(){return"bbva-step-select-account-payments-p2m-request"}static get scopedElements(){const e=[I,L,u,E];return ne.scopedElementsFromClasses(e)}static get properties(){return{dataContracts:{type:Array},linkOptions:{type:String},accountSelect:{type:Object}}}constructor(){super(),this.linkOptions="codi-qr-payments-p2p-request-header-category-option-link",this.dataContracts=[]}_fireEvent(e,t,r=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:r,composed:i}))}fireCompleteEvent(){this._fireEvent("complete"),this._fireEvent("account-step-finished",{productTitle:this.accountSelect.productTitle,numProduct:this.accountSelect.numProduct,idAccount:this.accountSelect.id})}static get styles(){return[X,y("bbva-multistep-codi-qr-payments-p2m-request-shared-styles")]}selectFirstAccount(){const[e]=this.dataContracts;this.accountSelect=e,this._fireEvent("multistep-bind-summary-property",{property:"accountSelect",value:this.accountSelect}),this._fireEvent("multistep-select-an-account",!0),this.fireCompleteEvent()}_renderListCard(){return g`
      ${this.dataContracts.map(((e,t)=>t<=2?g`
            <bbva-list-card
              card-title="${e.productTitle}"
              num-product="${e.numProduct}"
              content-text="${e.specificAmountName}"
              amount="${e.specificAmount}"
              idAccount="${e.id}"
              currency-code="MXN"
              local-currency="MXN"
              language="es-MX"
              visible-chars="4"
              @list-card-item-click="${this._selectAccount}">
            </bbva-list-card>
          `:""))}
    `}_renderContinueButton(){return g`
      <bbva-button-default
        id="continueButton"
        text="Continuar"
        @click="${this.selectFirstAccount}"
        class="centerButton"
      ></bbva-button-default>
    `}_selectAccount({target:e}){this.accountSelect=this.dataContracts.find((t=>t.numProduct===e.numProduct)),this._fireEvent("multistep-bind-summary-property",{property:"accountSelect",value:this.accountSelect}),this._fireEvent("multistep-select-an-account",!0),this.fireCompleteEvent()}_openModalAccounts(){this._fireEvent("codi-qr-payments-p2m-full-modal-accounts")}_renderHeaderCategory(){return this.dataContracts.length>3?g`
      <bbva-header-category
        option-link="${this.t(this.linkOptions)}"
        text="${this.t("codi-request-qr-modal-accounts-title")}"
        @header-category-link-click="${this._openModalAccounts}"
      ></bbva-header-category>`:g`
      <bbva-header-category
        class="colorHeaderCategory align-left"
        text="${this.t("codi-request-qr-modal-accounts-title")}"
      ></bbva-header-category>`}render(){return g`
    <bbva-text
      text="${this.t("codi-qr-payments-p2p-request-bbva-text")}"
      size="S"
      id="pharagraphHeader"
      class="description"
      tag="p"
    >
    </bbva-text>
      ${this._renderHeaderCategory()}
      ${this._renderListCard()}
      ${1===this.dataContracts.length?this._renderContinueButton():""}
    `}}const se=new r;var ce=e`:host {
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}
${se.mediaRules()}`;const le={dark:e`
    ${N.dark}
  `,light:e`
    ${N.light}
  `};class de extends(l(D)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":T,"bbva-button-icon":p,"bbva-core-icon":m,"bbva-text":u}}static get properties(){return{flagSize:{type:String,attribute:"flag-size"},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text",this.flagSize="small",this.flagText=""}static get styles(){return[super.styles,ce,le.light,le.dark,y("bbva-form-text-shared-styles")]}get field(){return g`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return g`
      ${this.flag?g`
            <span class="flag">
              <bbva-clip-flag
                icon="${x(this.flag)}"
                .size="${this.flagSize}"
                iconset="${x(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get labelBlock(){return g`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.inputLabel}</span>
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}customElements.define(de.is,de);class be extends(d(_)){static get is(){return"bbva-step-concept-and-reference-payments-p2m-request"}static get properties(){return{amountRequest:{type:Number},conceptRequest:{type:String},referenceRequest:{type:String},accountSelect:{type:Object},_invalidConceptRequest:{type:Boolean},_invalidReferenceRequest:{type:Boolean},_conceptRequestConfig:{type:Object},continueEnabled:{type:Boolean},specialCharacter:{type:String}}}constructor(){super(),this._invalidConceptRequest=!1,this._invalidReferenceRequest=!1,this.continueEnabled=!1,this.specialCharacter="",this.conceptRequest="",this._conceptRequestConfig={labelOut:"codi-qr-payments-p2p-request-bbva-form-amount-label-out",label:"codi-qr-payments-p2p-request-bbva-form-amount-label",errorMessage:"codi-qr-payments-p2p-request-bbva-form-text-error-message",infoMessage:"codi-qr-payments-p2p-request-bbva-form-text-info-message",errorIconSize:"16",infoIconSize:"16",infoIcon:"coronita:info",errorIcon:"coronita:alert",clearIcon:"coronita:close",helpIcon:"bbva:help",autoValidate:"true",bubbleEvent:"true"},this._referenceRequestConfig={errorMessage:"codi-qr-payments-p2p-request-bbva-form-number-error-message",infoMessage:"codi-qr-payments-p2p-request-bbva-form-number-info-message",label:"codi-qr-payments-p2p-request-bbva-list-simple-label-reference",errorIconSize:"16",infoIconSize:"16",infoIcon:"coronita:info",errorIcon:"coronita:alert",clearIcon:"coronita:close",helpIcon:"bbva:help",autoValidate:"true",bubbleEvent:"true",maxlength:7}}updated(e){super.updated&&super.updated(e),e.forEach(((e,t)=>{"conceptRequest"===t&&this.validateSpecialCharacter()}))}_fireEvent(e,t,r=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:r,composed:i}))}fireCompleteEvent(){this._fireEvent("complete"),this._fireEvent("concept-step-finished",{reference:this.referenceRequest,concept:this.conceptRequest}),this._fireEvent("multistep-bind-summary-property",{property:"completedConcept",value:!0}),this._fireEvent("multistep-request-qr-data-complete",this.amountRequest)}static get styles(){return[X,y("bbva-multistep-codi-qr-payments-p2m-request-shared-styles")]}updateReferenceRequest(e){const t=e.target.value;this._invalidReferenceRequest=this.shadowRoot.querySelector("#reference").invalid,this.continueEnabled=!(!this.invalidConceptRequest&&!this.invalidReferenceRequest),this.continueEnabled=!(!this._invalidConceptRequest&&!this._invalidReferenceRequest),this._fireEvent("multistep-bind-summary-property",{property:"referenceRequest",value:t})}updateConceptRequest(e){this.conceptRequest=e.target.value,this._invalidConceptRequest=this.shadowRoot.querySelector("#conceptPattern").invalid,this.continueEnabled=!(!this._invalidConceptRequest&&!this._invalidReferenceRequest),this._fireEvent("multistep-bind-summary-property",{property:"conceptRequest",value:this.conceptRequest})}validateSpecialCharacter(){const e=this.shadowRoot.querySelector("#conceptPattern"),t=/[0-9a-z A-Zá-úÑ'"´_#$%&@+!¡?¿.,:;/*+-\\()]/g;let r=!0;for(let e=0;e<this.conceptRequest.length;e+=1)if(r=this.conceptRequest[e].match(t),!r){this.specialCharacter=this.conceptRequest[e];break}e.invalid=!r,this.continueEnabled=e.invalid||this._invalidReferenceRequest}render(){return g`
            <bbva-form-field
                id="reference"
                label="${this.t("codi-qr-payments-p2p-request-bbva-list-simple-label-reference")}"
                minlength="7"
                maxlength="7"
                value="${this.referenceRequest}"
                info-message="${this._invalidReferenceRequest?"":this.t(this._referenceRequestConfig.infoMessage)}"
                error-message="${this._referenceRequestConfig.errorMessage}"
                info-icon-size="${Number(this._referenceRequestConfig.infoIconSize)}"
                error-icon-size="${Number(this._referenceRequestConfig.errorIconSize)}"
                error-icon="${this._referenceRequestConfig.errorIcon}"
                info-icon="${this._referenceRequestConfig.infoIcon}"
                pattern="&#92;d{7}"
                allowed-pattern="[0-9]"
                required
                auto-validate
                @bbva-core-input-validate="${this.updateReferenceRequest}"
            >
            </bbva-form-field>

            <bbva-form-field 
                id="conceptPattern"
                class="margin-up-form-text"
                label="${this.t("codi-qr-payments-p2p-request-bbva-form-text-label")}"
                minlength="1"
                maxlength="40"
                value="${"Sin concepto"===this.conceptRequest?"":this.conceptRequest}"
                info-message="${this._invalidConceptRequest?"":this.t(this._conceptRequestConfig.infoMessage)}"
                error-message="${this.t(this._conceptRequestConfig.errorMessage,{specialCharacter:this.specialCharacter})}"
                info-icon-size="${Number(this._conceptRequestConfig.infoIconSize)}"
                error-icon-size="${Number(this._conceptRequestConfig.errorIconSize)}"
                error-icon="${this._conceptRequestConfig.errorIcon}"
                info-icon="${this._conceptRequestConfig.infoIcon}"
                auto-validate
                optional-label=""
                ?invalid="true"
                @bbva-core-input-validate="${this.updateConceptRequest}"
            >
            </bbva-form-field>
            <bbva-button-default 
                class="centerButton" 
                text="${this.t("codi-qr-payments-p2p-request-bbva-button-text")}" 
                .disabled="${this.continueEnabled}"
                @click="${this.fireCompleteEvent}"
            >
            </bbva-button-default>
        `}}customElements.define(ie.is,ie),customElements.define(ae.is,ae),customElements.define(oe.is,oe),customElements.define(ne.is,ne),customElements.define(be.is,be);
