import{z as e,a8 as t,bf as a,ac as i,ab as o,ad as n,be as r,an as s,L as c,ah as l,ak as m,h as p,i as d,av as b,ci as u,aV as v,cZ as y,c_ as h,c$ as g}from"./952f98a9.js";import{R as _,S as f,u as S,D as k,V as $,Y as x,a3 as w,v as P,W as T,G as A,f as C,Z as L,a4 as M,_ as I,a0 as D}from"./216055dc.js";import{b as O,B as E}from"./30ef6f1f.js";var B=e`
:host {
  position: relative;
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

[data-tag-name=bbva-header-category] {
  padding: 1rem 1rem 0.5rem;
  text-transform: uppercase;
}

.options {
  max-height: 18.125rem;
  border-radius: var(--borderRadiusSmall, ${t(r.small)});
  margin-top: 0.625rem;
  background-color: var(--_form-predictive-list-bg-color);
  box-shadow: var(--boxShadowType1, ${t(a.type1)});
  overflow-y: auto;
}

.options .gradient {
  position: absolute;
  width: 100%;
  pointer-events: none;
}
.options .gradient.top {
  top: 2.875rem;
  left: 0;
  height: 2.5rem;
  background: linear-gradient(var(--_form-predictive-gradient-color), transparent);
}
.options .gradient.bottom {
  bottom: 0;
  left: 0;
  height: 2.5rem;
  background: linear-gradient(transparent, var(--_form-predictive-gradient-color));
}

.list {
  width: 100%;
  padding: 0;
  margin: 0;
  background-color: var(--_form-predictive-list-bg-color);
  list-style: none;
}
:host([overlay]) .list {
  position: absolute;
  z-index: 1;
  top: 3rem;
}
.list.empty {
  padding: 1rem;
}

.option-link {
  min-width: 0;
}

.option-text {
  display: flex;
  overflow: hidden;
  width: 100%;
  min-width: 0;
  padding: 1rem 1rem;
  font-size: var(--typographyTypeSmall, ${t(i.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(o.medium.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${t(n.typeSmall)});
}
.option-text[aria-selected=true] .item {
  color: var(--_form-predictive-auto-select-option-text-color);
}
.option-text:focus-visible {
  border-radius: none;
  outline: 0.125rem solid var(--_form-predictive-text-option-focus);
  outline-offset: -0.25rem;
}

.list-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin: 0;
  cursor: pointer;
  outline: none;
}
.list-item [data-tag-name=bbva-button-default] {
  align-self: flex-start;
  margin-top: 0.5rem;
  margin-right: 0.75rem;
}
.list-item:hover, .list-item:active {
  background-color: var(--_form-predictive-list-bg-color-active);
}

.item {
  min-width: 0;
  align-self: center;
}

[data-tag-name=bbva-clip-box] {
  margin-right: 0.5rem;
}
`,q=e`
:host {
  --_form-predictive-list-bg-color:
      var(--bbva-form-predictive--_ambient--list-bg-color,
          var(--bbva-form-predictive--custom--primary-ambient--list-bg-color,
              ${_("colorPrimarySurfaceAlternativeDefault",f)}));
  --_form-predictive-auto-select-option-text-color:
      var(--bbva-form-predictive--_ambient--auto-select-option-text-color,
          var(--bbva-form-predictive--custom--primary-ambient--auto-select-option-text-color,
              ${_("colorPrimaryLinkMainPressed",f)}));
  --_form-predictive-list-bg-color-active:
      var(--bbva-form-predictive--_ambient--list-bg-color-active,
          var(--bbva-form-predictive--custom--primary-ambient--list-bg-color-active,
              ${_("colorPrimaryAltSurfaceAlternativeDefault",f)}));
  --_form-predictive-text-option-focus:
      var(--bbva-form-predictive--_ambient--text-option-focus,
          var(--bbva-form-predictive--custom--primary-ambient--text-option-focus,
              ${_("colorPrimarySurfaceAmbientFocus",f)}));
  --_form-predictive-gradient-color:
      var(--bbva-form-predictive--_ambient--gradient-color,
          var(--bbva-form-predictive--custom--primary-ambient--gradient-color,
              ${_("colorPrimarySurfaceAmbientDefault",f)}));
}
`;const F=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-predictive--_ambient--list-bg-color: initial;
    --bbva-form-predictive--_ambient--auto-select-option-text-color: initial;
    --bbva-form-predictive--_ambient--list-bg-color-active: initial;
    --bbva-form-predictive--_ambient--text-option-focus: initial;
    --bbva-form-predictive--_ambient--gradient-color: initial;
  }
`,R=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-predictive--_ambient--list-bg-color: var(
      --bbva-form-predictive--custom--primary-alt-ambient--list-bg-color,
      ${_("colorPrimaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-form-predictive--_ambient--auto-select-option-text-color: var(
      --bbva-form-predictive--custom--primary-alt-ambient--lauto-select-option-text-color,
      ${_("colorPrimaryAltLinkMainPressed",f)}
    );

    --bbva-form-predictive--_ambient--list-bg-color-active: var(
      --bbva-form-predictive--custom--primary-alt-ambient--list-bg-color-active,
      ${_("colorPrimarySurfaceAlternativeDefault",f)}
    );

    --bbva-form-predictive--_ambient--text-option-focus: var(
      --bbva-form-predictive--custom--primary-alt-ambient--text-option-focus,
      ${_("colorPrimaryAltSurfaceAmbientFocus",f)}
    );

    --bbva-form-predictive--_ambient--gradient-color: var(
      --bbva-form-predictive--custom--primary-alt-ambient--gradient-color,
      ${_("colorPrimaryAltSurfaceAmbientDefault",f)}
    );
  }
`,z=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-predictive--_ambient--list-bg-color: var(
      --bbva-form-predictive--custom--secondary-ambient--list-bg-color,
      ${_("colorSecondarySurfaceAlternativeDefault",f)}
    );

    --bbva-form-predictive--_ambient--auto-select-option-text-color: var(
      --bbva-form-predictive--custom--secondary-ambient--lauto-select-option-text-color,
      ${_("colorSecondaryLinkMainPressed",f)}
    );

    --bbva-form-predictive--_ambient--list-bg-color-active: var(
      --bbva-form-predictive--custom--secondary-ambient--list-bg-color-active,
      ${_("colorSecondaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-form-predictive--_ambient--text-option-focus: var(
      --bbva-form-predictive--custom--secondary-ambient--text-option-focus,
      ${_("colorSecondarySurfaceAmbientFocus",f)}
    );

    --bbva-form-predictive--_ambient--gradient-color: var(
      --bbva-form-predictive--custom--secondary-ambient--gradient-color,
      ${_("colorSecondarySurfaceAmbientDefault",f)}
    );
  }
`,j=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-predictive--_ambient--list-bg-color: var(
      --bbva-form-predictive--custom--secondary-alt-ambient--list-bg-color,
      ${_("colorSecondaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-form-predictive--_ambient--auto-select-option-text-color: var(
      --bbva-form-predictive--custom--secondary-alt-ambient--lauto-select-option-text-color,
      ${_("colorSecondaryAltLinkMainPressed",f)}
    );

    --bbva-form-predictive--_ambient--list-bg-color-active: var(
      --bbva-form-predictive--custom--secondary-alt-ambient--list-bg-color-active,
      ${_("colorSecondarySurfaceAlternativeDefault",f)}
    );

    --bbva-form-predictive--_ambient--text-option-focus: var(
      --bbva-form-predictive--custom--secondary-alt-ambient--text-option-focus,
      ${_("colorSecondaryAltSurfaceAmbientFocus",f)}
    );

    --bbva-form-predictive--_ambient--gradient-color: var(
      --bbva-form-predictive--custom--secondary-alt-ambient--gradient-color,
      ${_("colorSecondaryAltSurfaceAmbientDefault",f)}
    );
  }
`;const N=S([Object.freeze({__proto__:null,primary:F,primaryAlt:R,secondary:z,secondaryAlt:j}),k,$,x,O,w]),V=Object.values(N);class H extends(P(s(T(c)))){static get is(){return"bbva-form-predictive"}static get scopedElements(){return{"bbva-form-input":E,"bbva-type-text":A,"bbva-button-default":C,"bbva-clip-box":L,"bbva-header-category":M}}static get properties(){return{items:{type:Array},otherResults:{type:Array,attribute:"other-results"},historicalItems:{type:Array,attribute:"historical-items"},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},label:{type:String},value:{type:String},trash:{type:Boolean},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},allowedPattern:{type:String,attribute:"allowed-pattern"},labelOut:{type:String,attribute:"label-out"},required:{type:Boolean,attribute:"required"},invalid:{type:Boolean},errorMessage:{type:String,attribute:"error-message"},noResultsMessage:{type:String,attribute:"no-results-message"},_optionsFiltered:{type:Array,state:!0},_activeOption:{type:Object,state:!0},_isFocusedInput:{type:Boolean,state:!0},_showEmptySection:{type:Boolean,state:!0},_desktop:{type:Boolean},_gradientTop:{type:Boolean},_gradientBottom:{type:Boolean},_optionSelected:{type:Boolean},useCustomEmptySection:{type:Boolean,attribute:"use-custom-empty-section"}}}constructor(){super(),this.items=[],this.otherResults=[],this.historicalItems=[],this.minChars=1,this.maxResults=5,this.filterValueKey=null,this.autoselect=!1,this.selectOnBlur=!1,this.inlineAutocomplete=!1,this.keepOnBlur=!1,this.preventValueUpdateOnSelect=!1,this.overlay=!1,this.required=!1,this.label="",this.value="",this.trash=!1,this.invalid=!1,this.errorMessage="",this.infoIcon=l(),this.infoIconSize=16,this.infoMessage="",this.noResultsMessage="bbva-form-predictive-no-results",this._optionsFiltered=[],this._activeOption={},this._uniqueId=`${Math.random().toString(36).substr(2,10)}`,this._isFocusedInput=!1,this._showEmptySection=!1,this._desktop=!1,this._gradientTop=!1,this._gradientBottom=!1,this._optionSelected=!1,this.labelOut="",this.useCustomEmptySection=!1}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}get items(){return this._items}set items(e){const t=this._items;this._items=e.map(((e,t)=>({detail:e,_uniqueId:`option-${this._uniqueId}-${t}`}))),this.requestUpdate("items",t)}get historicalItems(){return this._historicalItems}set historicalItems(e=[]){const t=this._historicalItems;this._historicalItems=e.map(((e,t)=>({detail:e,_uniqueId:`option-${this._uniqueId}-${t}`}))),this.requestUpdate("historicalItems",t)}set otherResults(e){const t=this._otherResults;this._otherResults=e.map(((e,t)=>({detail:e,_uniqueId:`option-${this._uniqueId}-${t}`}))),this.requestUpdate("otherResults",t)}get otherResults(){return this._showEmptySection=!1,this._otherResults}firstUpdated(){super.firstUpdated(),this._rootNode=this.getRootNode?this.getRootNode():document}updated(e){super.updated(e);const t=t=>e.has(t)&&void 0!==e.get(t);t("value")&&(t("items")||t("minChars")||t("maxResults"))&&this._updateValue(this.value),this.updateComplete.then((()=>{e.has("search")&&(this._input=this.shadowRoot.querySelector(".input").form)})),e.has("_optionsFiltered")&&(this._gradientBottom=this._optionsFiltered.length>5),e.has("value")&&this.value.length>0&&document.addEventListener("form-predictive-value-change",(e=>{const t=e.detail&&!e.detail.match(this.allowedPattern);this.invalid=t,this.invalid&&(this._showEmptySection=!1,this._clearOptionsList())}))}static get styles(){return[B,q,V,m("bbva-form-predictive-shared-styles")]}get _optional(){return this.t("bbva-form-predictive-optional-label")}get _formattedLabel(){return this.labelOut||this.required?`${this.t(this.label)}`:`${this.t(this.label)} ${this._optional}`}get _labelOut(){return this.labelOut?p`
        <bbva-type-text
          text="${this.required?`${this.t(this.labelOut)}`:`${this.t(this.labelOut)} ${this.t(this._optional)}`}"
          size="S"
          font-weight="500"
          ellipsis
        >
        </bbva-type-text>
      `:""}get _renderInput(){return p`
      <div
        class="input-container"
        role="combobox"
        aria-haspopup="true"
        aria-owns="listbox-${this._uniqueId}"
        aria-expanded="${0!==this._optionsFiltered.length}"
        aria-controls="listbox-${this._uniqueId}"
      >
        ${this._inputText}
      </div>
    `}get _inputText(){return p`
      <bbva-form-input
        class="input"
        type="text"
        ?inline-autocomplete="${this.inlineAutocomplete}"
        aria-activedescendant="${d(this._activeOption._uniqueId)}"
        aria-controls="listbox-${this._uniqueId}"
        optional-label=""
        value="${d(this.value)}"
        .label="${this._formattedLabel}"
        clear-icon="${d(this.clearIcon)}"
        clear-icon-size="${d(this.clearIconSize)}"
        clear-accessible-text="${d(this.clearAccessibleText)}"
        info-icon="${d(this.infoIcon)}"
        info-icon-size="${d(this.infoIconSize)}"
        info-message="${!this.value.length||this._optionSelected?this.infoMessage:""}"
        error-message="${d(this.errorMessage)}"
        ?invalid="${this.invalid}"
        @form-input-value-change="${this._onInput}"
        @form-field-input-clear="${this._onClearInput}"
        @keydown="${this._onKeydown}"
        @focusout="${this._onFocusout}"
        @focusin="${this._onFocusIn}"
        tabindex="0"
        auto-validate
        pattern="${d(this.allowedPattern)}"
      >
      </bbva-form-input>
    `}get _renderContent(){return p`
      <div tabindex="0" id="listbox-${this._uniqueId}" class="options" @scroll="${this._onScroll}">
        <div class="gradient ${b({top:this._gradientTop})}"></div>
        ${this.otherResults.length>0&&!this.value?p`
              <ul role="listbox" aria-labelledby="other" class="list" aria-label="${this.label}">
                <li
                  role="option"
                  id="other"
                  aria-selected="${this._activeOption._uniqueId===this._uniqueId}"
                >
                  <bbva-header-category
                    text="${this.t("bbva-form-predictive-other-results-label")}"
                  ></bbva-header-category>
                </li>
                ${this.otherResults.map((e=>p`
                      <li
                        role="option"
                        class="list-item other"
                        aria-selected="${this._activeOption._uniqueId===e._uniqueId}"
                      >
                        ${this.itemTemplate(e)}
                      </li>
                    `))}
              </ul>
            `:""}
        <ul class="list" ?hidden="${!this._optionsFiltered.length}">
          ${this._optionsFiltered.map((e=>p`
                <li
                  class="list-item"
                  aria-selected="${this._activeOption._uniqueId===e._uniqueId}"
                >
                  ${this.itemTemplate(e,this.trash)}
                </li>
              `))}
        </ul>
        <div class="gradient ${b({bottom:this._gradientBottom})}"></div>
      </div>
    `}_iconTpl(e){const t=document.createElement(this.getScopedTagName("bbva-clip-box"));return t.group=[{icon:e,size:"xs"}],t.mode=this.mode,t.ambient=this.ambient,t}itemTemplate(e,t=!1){var a,i,o,n;return p`<div
        class="option-text"
        id="${e._uniqueId}"
        tabindex="0"
        @keydown=${t=>this._selectOptionKeydown(e,t)}
        @click=${()=>this._selectOptionClick(e)}
      >
        ${(null===(a=e.detail)||void 0===a?void 0:a.code)&&p`${this._iconTpl(null===(i=e.detail)||void 0===i?void 0:i.code)}`}

        <div class="option-link">
          <bbva-type-text
            variant="spotlight"
            unset
            class="item"
            size="S"
            text=${this._optionKey(e)}
            ellipsis
          ></bbva-type-text>
          <div class="option-description">
            ${this._desktop&&null!==(o=e.detail)&&void 0!==o&&o.text?p`<bbva-type-text
                  text=${e.detail.text}
                  size="S"
                  unset
                  ellipsis
                ></bbva-type-text>`:""}
            ${this._desktop&&null!==(n=e.detail)&&void 0!==n&&n.secondaryText?p`<bbva-type-text
                  text=${e.detail.secondaryText}
                  size="S"
                  unset
                  ellipsis
                ></bbva-type-text>`:""}
          </div>
        </div>
      </div>
      ${t?p`<bbva-button-default
            variant="icon no-background"
            .icon="${u()}"
            @click="${t=>this._fireDeleteEvent(t,e)}"
            aria-label="${this.t("bbva-form-predictive-trash-label")}"
          ></bbva-button-default>`:""} `}cleanString(e=""){return e.toLowerCase().normalize("NFD").replace(/[\u0300-\u036f]/g,"")}get renderEmpty(){return p`<div class="list empty">
      <bbva-type-text
        tag="span"
        text="${this.t(this.noResultsMessage)}"
        size="S"
        ellipsis
      ></bbva-type-text>
    </div>`}filterCriteria(e,t){const a=this.cleanString(e);return 0===this.cleanString(this._optionKey(t)).indexOf(a)}get value(){return this._value}set value(e){e!==this._value&&this._updateValue(e)}async _updateValue(e){this._value=e,this._preserveOptionsList||this._updateOptionsList(e),this._optionSelected=!1;const t=this._optionKey(this._activeOption),a=this.cleanString(t),i=this.cleanString(e);if(this.inlineAutocomplete&&!this._preventInlineAutocomplete&&e&&a!==i&&0===a.indexOf(i))return this._preserveOptionsList=!0,this._autocompletedPreviousValue=e,void(this.value=t);if(this._preserveOptionsList=!1,this._preventInlineAutocomplete=!1,await this.requestUpdate("value"),this._fireValueEvent(),this._autocompletedPreviousValue){const e=this._autocompletedPreviousValue.length,t=this._value.length;this.updateComplete.then((()=>{this._input.setSelectionRange(e,t)}))}this._autocompletedPreviousValue=null}_updateOptionsList(e){var t;if(""===e&&this._isFocusedInput&&null!==(t=this._historicalItems)&&void 0!==t&&t.length)this._optionsFiltered=this._historicalItems,this._activeOption={};else if(!this._optionSelected&&e.length>=this.minChars){let t=this.items.filter((t=>this.filterCriteria(e,t))).sort();this._showEmptySection=!t.length,this.maxResults&&(t=t.slice(0,this.maxResults)),this._optionsFiltered=t;const[a]=this._optionsFiltered;a&&(this.autoselect||this.inlineAutocomplete)?this._activeOption=a:this._activeOption={}}else this._clearOptionsList()}_selectOptionClick(e){const{_uniqueId:t,...a}=e;this._showEmptySection=!1,this.preventValueUpdateOnSelect||(this.value=this._optionKey(e)),this._clearOptionsList(),this.updateComplete.then((()=>{this._optionSelected=!0})),this.dispatchEvent(new CustomEvent("form-predictive-item-select",{detail:a.detail,bubbles:!0,composed:!0}))}_selectOptionKeydown(e,t){const{_uniqueId:a,...i}=e,{code:o}=t;this._showEmptySection=!1,this._optionSelected=!1,"Escape"!==o?"Enter"!==o&&"Space"!==o||(t.preventDefault(),this.value=this._optionKey(e),this._clearOptionsList(),this.dispatchEvent(new CustomEvent("form-predictive-item-select",{detail:i.detail,bubbles:!0,composed:!0}))):this._clearOptionsList()}_optionKey(e){return this.filterValueKey&&e.detail?e.detail[this.filterValueKey]:e.detail}_onInput(e){this.value=e&&e.target&&e.target.value||""}_onClearInput(){this._showEmptySection=!1}_onKeydown(e){const{code:t}=e;if(this._optionSelected=!1,this._preventInlineAutocomplete=!1,"Backspace"===t&&this.inlineAutocomplete)return void(this._preventInlineAutocomplete=!0);if(!this._optionsFiltered.length)return;if("Escape"===t)return void this._clearOptionsList();const a=this._optionsFiltered.indexOf(this._activeOption);if("Enter"===t&&a>-1)return e.preventDefault(),void this._selectOptionClick(this._activeOption);const i="ArrowDown"===t;if(i||"ArrowUp"===t){e.preventDefault();const t=i?this._optionsFiltered[a+1]||this._optionsFiltered[0]:this._optionsFiltered[a-1]||this._optionsFiltered[this._optionsFiltered.length-1];this._activeOption=t,this.inlineAutocomplete&&(this._value=this._optionKey(this._activeOption),this._fireValueEvent())}}_onScroll(e){const t=(null==e?void 0:e.target)||this.shadowRoot.querySelector(".options");if(t){t.clientHeight<t.scrollHeight&&(this._gradientTop=t.scrollTop>0,this._gradientBottom=t.scrollTop+1+t.clientHeight<t.scrollHeight)}}_onFocusIn(){this._isFocusedInput=!0,this._updateOptionsList(this.value),this.invalid&&(this._showEmptySection=!1)}_onFocusout(){this._isFocusedInput=!1,setTimeout((()=>{this._showEmptySection=!1;const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;(e!==this||t===this._input&&!this._input.hasAttribute("focused"))&&this._blurField()}),1)}_blurField(){this.selectOnBlur&&this._optionsFiltered.length&&this._activeOption._uniqueId&&(this._selectOptionClick(this._activeOption),this._clearOptionsList()),this.keepOnBlur||this._clearOptionsList()}_fireValueEvent(){this.dispatchEvent(new CustomEvent("form-predictive-value-change",{detail:this.value,bubbles:!0,composed:!0}))}_fireDeleteEvent(e,t){this.dispatchEvent(new CustomEvent("form-predictive-value-delete",{detail:t,bubbles:!0,composed:!0}))}_clearOptionsList(){this._optionsFiltered=[],this._activeOption={}}get _isEmpty(){return!this.useCustomEmptySection&&this._showEmptySection?this.renderEmpty:v}render(){return p` ${this._labelOut} ${this._renderInput} ${this._isEmpty} ${this._renderContent} `}}const K=p` <path
  d="M 20 0 C 8.9542 0 0 8.596 0 19.2 C 0 19.3896 0.0036 19.5784 0.0092 19.7665 C 0.4034 36.7211 18.3292 47.551 18.3292 47.551 C 19.2404 48.1452 20.7328 48.1464 21.6366 47.5738 C 21.6366 47.5738 39.5952 36.722 39.9906 19.7673 C 39.9964 19.579 40 19.3898 40 19.2 C 40 8.596 31.0456 0 20 0"
/>`,Z=p`<svg
  viewBox="0 0 256.838 296.314"
  fill="%23D44B50"
  xmlns="http://www.w3.org/2000/svg"
>
  <g transform="matrix(1, 0, 0, 1, -142.33551, -61.229153)">
    <ellipse
      style="fill: rgb(102, 102, 102); fill-opacity: 0.2;"
      cx="273.721"
      cy="321.492"
      rx="114.511"
      ry="27.002"
    />
    <path
      class="b3ff8878-6a29-4f39-9df9-293c61801d2a"
      d="M 271.579 65.283 C 216.331 65.255 171.529 110.035 171.529 165.283 L 171.529 168.283 C 173.529 256.573 263.179 312.963 263.179 312.963 C 267.779 316.063 275.179 316.063 279.679 313.063 C 279.679 313.063 369.529 256.573 371.529 168.283 L 371.529 165.283 C 371.618 110.037 326.825 65.222 271.579 65.283 Z M 271.579 215.283 C 233.089 215.283 209.033 173.616 228.278 140.283 C 247.523 106.949 295.635 106.949 314.88 140.283 C 319.269 147.884 321.579 156.506 321.579 165.283 C 321.579 192.897 299.193 215.283 271.579 215.283 Z"
      style="fill: rgb(212, 75, 80);"
    />
  </g>
</svg>`,G=p`<svg
  viewBox="0 0 256.838 296.314"
  fill="%23D44B50"
  xmlns="http://www.w3.org/2000/svg"
>
  <g transform="matrix(1, 0, 0, 1, -142.33551, -61.229153)">
    <ellipse
      style="fill: rgb(102, 102, 102); fill-opacity: 0.7;"
      cx="273.721"
      cy="321.492"
      rx="114.511"
      ry="27.002"
    />
    <path
      class="b3ff8878-6a29-4f39-9df9-293c61801d2a"
      d="M 271.579 65.283 C 216.331 65.255 171.529 110.035 171.529 165.283 L 171.529 168.283 C 173.529 256.573 263.179 312.963 263.179 312.963 C 267.779 316.063 275.179 316.063 279.679 313.063 C 279.679 313.063 369.529 256.573 371.529 168.283 L 371.529 165.283 C 371.618 110.037 326.825 65.222 271.579 65.283 Z M 271.579 215.283 C 233.089 215.283 209.033 173.616 228.278 140.283 C 247.523 106.949 295.635 106.949 314.88 140.283 C 319.269 147.884 321.579 156.506 321.579 165.283 C 321.579 192.897 299.193 215.283 271.579 215.283 Z"
      style="fill: rgb(243, 94, 97);"
    />
  </g>
</svg>`,W=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"geometry.stroke",stylers:[{color:"#1973b8"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"administrative.locality",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"administrative.neighborhood",elementType:"labels.text.fill",stylers:[{color:"#f4f4f4"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"},{color:"#072146"}]},{featureType:"landscape",elementType:"labels",stylers:[{color:"#ffffff"},{visibility:"on"}]},{featureType:"landscape",elementType:"labels.text.fill",stylers:[{visibility:"on"},{color:"#ffffff"}]},{featureType:"landscape",elementType:"labels.text.stroke",stylers:[{color:"#ffffff"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.man_made",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"landscape.man_made",elementType:"geometry.stroke",stylers:[{color:"#043263"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.landcover",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.attraction",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"poi.park",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"road",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"road",elementType:"labels.icon",stylers:[{color:"#a4aab3"}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.highway.controlled_access",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"road.highway.controlled_access",elementType:"labels",stylers:[{visibility:"off"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.fill",stylers:[{color:"#ffffff"},{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.stroke",stylers:[{color:"#004481"},{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"geometry.fill",stylers:[{color:"#1973b8"}]}],U=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"all",stylers:[{color:"#2dcccd"},{visibility:"on"},{saturation:"26"}]}];class Y{constructor(e,t,a,i,o,n,r,s){this.position=t,this.icon=a||"bbvaInfo",this.color=i||null,this.warning=o||!1,this.label=e,this.axisPopupX=n||0,this.axisPopupY=r||0,this.containerDiv=Y._createContainer(s);const c=this._createPinIcon(),l=Y._createContentIcon(this.icon);this.warning&&Y._appendWarningIcon(this.containerDiv),this.containerDiv.appendChild(c),this.containerDiv.appendChild(l)}static _createContainer(){const e=document.createElement("div");return e.classList.add("map-icon-container"),e.addEventListener("mousedown",(()=>{e.classList.add("active")})),e.addEventListener("mouseup",(()=>{e.classList.remove("active")})),e}static _createContentIcon(e){const t=document.createElementNS("http://www.w3.org/2000/svg","svg");return t.setAttributeNS(null,"viewBox","0 0 260 260"),t.setAttribute("width","16"),t.setAttribute("height","16"),t.setAttributeNS(null,"preserveAspectRatio","xMidYMid meet"),t.innerHTML=y[e],t.classList.add("map-icon"),t}_createPinIcon(){const e=document.createElementNS("http://www.w3.org/2000/svg","svg");return e.setAttributeNS(null,"viewBox","0 0 40 48"),e.setAttribute("width","40"),e.setAttribute("height","48"),e.setAttributeNS(null,"preserveAspectRatio","xMidYMid meet"),e.classList.add("map-pin"),null!==this.color&&e.classList.add(this.color),e.innerHTML=K.getHTML(),e}static _appendWarningIcon(e){const t=document.createElementNS("http://www.w3.org/2000/svg","svg");t.setAttributeNS(null,"viewBox","0 0 260 260"),t.setAttribute("width","8"),t.setAttribute("height","8"),t.setAttributeNS(null,"preserveAspectRatio","xMidYMid meet"),t.classList.add("map-warning"),t.innerHTML=h;const a=document.createElement("div");a.classList.add("map-warning-bg"),e.appendChild(t),e.appendChild(a)}onAdd(){this.getPanes().floatPane.appendChild(this.containerDiv)}onRemove(){this.containerDiv.parentElement&&this.containerDiv.parentElement.removeChild(this.containerDiv)}draw(){const e=this.getProjection().fromLatLngToDivPixel(this.position),t=Math.abs(e.x)<4e3&&Math.abs(e.y)<4e3?"block":"none";"block"===t&&(this.containerDiv.style.left=e.x-this.axisPopupX+"px",this.containerDiv.style.top=e.y-this.axisPopupY+"px"),this.containerDiv.style.display!==t&&(this.containerDiv.style.display=t)}}var X=e`
:host {
  position: relative;
  display: block;
  height: 100%;
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

.container {
  display: flex;
  width: 100%;
  height: 100%;
  flex-direction: column;
}
.container .suggestions {
  position: absolute;
  z-index: 1;
  top: var(--map-dinamic-suggestions-top, 3.5rem);
  width: calc(100% - 16px);
  margin: 0.625rem 0.5rem 0;
  background-color: var(--_map-dynamic-suggestions-bg-color);
  box-shadow: var(--boxShadowType1, ${t(a.type1)});
}
.container .suggestions ul {
  list-style: none;
  margin: 0;
  padding: 0;
}
.container .suggestions ul li {
  cursor: pointer;
}
.container .suggestions ul li:hover, .container .suggestions ul li:active {
  background-color: var(--_map-dynamic-suggestions-active-bg-color);
}
.container .suggestions.empty {
  padding: 1rem;
  cursor: default;
}
.container .suggestions-text {
  padding: 1rem;
}
.container .suggestions-text:focus-visible {
  border-radius: none;
  background-color: var(--_map-dynamic-suggestions-active-bg-color);
  outline: 0.125rem solid var(--_map-dynamic-suggestions-active-focus);
  outline-offset: -0.25rem;
}

.bbva-map-dynamic-header {
  padding: 0.5rem 1rem;
  background-color: var(--_map-dynamic-header-bg-color);
}
.bbva-map-dynamic-header [data-tag-name=bbva-form-search] {
  margin: 0 1rem;
}
.bbva-map-dynamic-header.predictive {
  padding: 0.5rem 0.5rem 0;
  background-color: transparent;
}

:host([variant=icon]:not([href])) .action {
  background-color: var(--button-default-icon-background);
}

:host([hide-map-info-footer]) .gm-style a div img {
  display: none;
}
:host([hide-map-info-footer]) div.gmnoprint,
:host([hide-map-info-footer]) div .gm-style-cc {
  display: none;
}

.map-container {
  position: relative;
  height: 100%;
}

.bbva-map-dynamic-section {
  position: relative;
  display: flex;
  height: 100%;
  align-items: center;
  justify-content: center;
}

.bbva-map-dynamic-text {
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0.5rem 0;
  background-color: var(--_map-dynamic-text-bg-color);
  color: var(--_map-dynamic-text-color);
  font-size: var(--typographyTypeSmall, ${t(i.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(o.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(o.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${t(n.typeSmall)});
  text-align: center;
}

.bbva-map-dynamic-section-large-button {
  position: absolute;
  z-index: 0;
  top: 1rem;
  left: 50%;
  display: flex;
  width: 100%;
  align-items: center;
  justify-content: center;
  padding-right: 1rem;
  padding-left: 1rem;
  border-radius: var(--bbva-map-dynamic-section-large-link-border-radius, var(--borderRadiusSmall, ${t(r.small)}));
  transform: translate(-50%);
}
.bbva-map-dynamic-section-large-button [data-tag-name=bbva-button-default] {
  width: 100%;
}

.bbva-map-dynamic-section-large-action {
  position: absolute;
  bottom: 1rem;
  left: calc(100% - 48px - 16px);
}
.bbva-map-dynamic-section-large-action [data-tag-name=bbva-button-action] {
  position: relative;
  width: 2.5rem;
  height: 2.5rem;
  padding: 0.46875rem;
  border-radius: 50%;
  background-color: var(--_map-dynamic-section-large-bg-color);
  -webkit-transition: all 0.4s ease;
  transition: all 0.4s ease;
}
.bbva-map-dynamic-section-large-action [data-tag-name=bbva-button-action][active] {
  background-color: var(--_map-dynamic-section-large-action-button-action);
}

.map-icon-container {
  position: absolute;
  width: 2.5rem;
  height: 3rem;
  margin: 0.25rem;
}
.map-icon-container:hover {
  cursor: pointer;
}
.map-icon-container.active .map-pin {
  fill: var(--_map-dynamic-map-pin-active-bg-color);
}
.map-icon-container.active .map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-icon-container.active .map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-icon-container.active .map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-icon-container.active .map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}
.map-icon-container.active .map-icon {
  fill: var(--_map-dynamic-map-icon-active-color);
}
.map-icon-container.active .map-pin.aqua ~ .map-icon,
.map-icon-container.active .map-pin.sand ~ .map-icon,
.map-icon-container.active .map-pin.pink ~ .map-icon,
.map-icon-container.active .map-pin.purple ~ .map-icon {
  fill: var(--_map-dynamic-map-pin-color-fill);
}
.map-icon-container.selected .map-pin {
  fill: var(--_map-dynamic-map-pin-selected-bg-color);
}
.map-icon-container.selected .map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-icon-container.selected .map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-icon-container.selected .map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-icon-container.selected .map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}
.map-icon-container.selected .map-icon {
  fill: var(--_map-dynamic-map-icon-selected-color);
}
.map-icon-container.selected .map-pin.aqua ~ .map-icon,
.map-icon-container.selected .map-pin.sand ~ .map-icon,
.map-icon-container.selected .map-pin.pink ~ .map-icon,
.map-icon-container.selected .map-pin.purple ~ .map-icon {
  fill: var(--_map-dynamic-map-pin-color-fill);
}
.map-icon-container.active.selected .map-icon {
  fill: var(--_map-dynamic-map-icon-selected-active-color);
}
.map-icon-container.active.selected .map-pin {
  fill: var(--_map-dynamic-map-icon-selected-active-bg-color);
}
.map-icon-container.active.selected .map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-icon-container.active.selected .map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-icon-container.active.selected .map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-icon-container.active.selected .map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}
.map-icon-container .map-icon {
  position: absolute;
  top: calc(50% - 16px);
  left: calc(50% - 12px);
  display: block;
  overflow: hidden;
  width: 1.5rem;
  height: 1.5rem;
  fill: var(--_map-dynamic-map-icon-color);
}
.map-icon-container .map-pin {
  width: 2.5rem;
  height: 3rem;
  fill: var(--_map-dynamic-map-pin-bg-color);
}
.map-icon-container .map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-icon-container .map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-icon-container .map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-icon-container .map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}
.map-icon-container .map-warning {
  position: absolute;
  z-index: 2;
  bottom: 0;
  left: 0.1875rem;
  display: block;
  width: 1rem;
  height: 1rem;
  fill: var(--_map-dynamic-map-warning-color);
  stroke: var(--_map-dynamic-map-warning-stroke-color);
  stroke-width: 6;
}
.map-icon-container .map-warning-bg {
  position: absolute;
  z-index: 1;
  bottom: 0.1875rem;
  left: 0.5625rem;
  display: block;
  width: 0.1875rem;
  height: 0.5625rem;
  background-color: var(--_map-dynamic-map-warning-bg-color);
}
`,Q=e`
:host {
  --_map-dynamic-section-large-bg-color:
      var(--bbva-map-dynamic--_ambient--section-large-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--section-large-bg-color,
              ${_("colorPrimarySurfaceAlternativeDefault",f)}));
  --_map-dynamic-section-large-action-button-action:
      var(--bbva-map-dynamic--_ambient--section-large-action-button-action,
          var(--bbva-map-dynamic--custom--primary-ambient--section-large-action-button-action,
              ${_("colorPrimarySurfaceAlternativePressed",f)}));
  --_map-dynamic-text-color:
      var(--bbva-map-dynamic--_ambient--text-color,
          var(--bbva-map-dynamic--custom--primary-ambient--text-color,
              ${_("colorPrimaryLocationsPinsTextDefault",f)}));
  --_map-dynamic-text-bg-color:
      var(--bbva-map-dynamic--_ambient--text-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--text-bg-color,
              ${_("colorPrimaryLocationsPinsBackgroundDefault",f)}));
  --_map-dynamic-map-pin-bg-color:
      var(--bbva-map-dynamic--_ambient--map-pin-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-bg-color,
              ${_("colorPrimaryLocationsPinsBackgroundDefault",f)}));
  --_map-dynamic-map-pin-color-fill:
      var(--bbva-map-dynamic--_ambient--map-pin-color-fill,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-color-fill,
              ${_("colorPrimaryLocationsPinsTextDefault",f)}));
  --_map-dynamic-map-pin-active-bg-color:
      var(--bbva-map-dynamic--_ambient--map-pin-active-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-active-bg-color,
              ${_("colorPrimaryLocationsPinsBackgroundPressed",f)}));
  --_map-dynamic-map-pin-selected-bg-color:
      var(--bbva-map-dynamic--_ambient--map-pin-selected-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-selected-bg-color,
              ${_("colorPrimaryLocationsPinsBackgroundSelected",f)}));
  --_map-dynamic-map-icon-color:
  var(--bbva-map-dynamic--_ambient--map-icon-color,
      var(--bbva-map-dynamic--custom--primary-ambient--map-icon-color,
          ${_("colorPrimaryLocationsPinsTextDefault",f)}));
  --_map-dynamic-map-icon-active-color:
      var(--bbva-map-dynamic--_ambient--map-icon-active-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-icon-active-color,
              ${_("colorPrimaryLocationsPinsTextPressed",f)}));
  --_map-dynamic-map-icon-selected-color:
      var(--bbva-map-dynamic--_ambient--map-icon-selected-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-icon-selected-color,
              ${_("colorPrimaryLocationsPinsTextSelectedPressed",f)}));
  --_map-dynamic-map-icon-selected-active-bg-color:
      var(--bbva-map-dynamic--_ambient--map-icon-selected-active-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-icon-selected-active-bg-color,
              ${_("colorPrimaryLocationsPinsBackgroundSelectedPressed",f)}));
  --_map-dynamic-map-icon-selected-active-color:
      var(--bbva-map-dynamic--_ambient--map-icon-selected-active-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-icon-selected-active-color,
              ${_("colorPrimaryLocationsPinsTextSelectedPressed",f)}));
  --_map-dynamic-map-warning-color:
      var(--bbva-map-dynamic--_ambient--map-warning-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-warning-color,
              ${_("colorPrimarySupportErrorDefault",f)}));
  --_map-dynamic-map-pin-bg-color-aqua:
      var(--bbva-map-dynamic--_ambient--map-pin-bg-color-aqua,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-bg-color-aqua,
              ${_("colorPrimaryCategoriesPoints",f)}));
  --_map-dynamic-map-pin-bg-color-pink:
      var(--bbva-map-dynamic--_ambient--map-pin-bg-color-pink,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-bg-color-pink,
              ${_("colorPrimaryCategoriesOfferDiscountRefound",f)}));
  --_map-dynamic-map-pin-bg-color-sand:
      var(--bbva-map-dynamic--_ambient--map-pin-bg-color-sand,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-bg-color-sand,
              ${_("colorPrimaryCategoriesFinancingSkipPayments",f)}));
  --_map-dynamic-map-pin-bg-color-purple:
      var(--bbva-map-dynamic--_ambient--map-pin-bg-color-purple,
          var(--bbva-map-dynamic--custom--primary-ambient--map-pin-bg-color-purple,
              ${_("colorPrimaryCategoriesCombinedPromotions",f)}));
  --_map-dynamic-map-warning-bg-color:
      var(--bbva-map-dynamic--_ambient--map-warning-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-warning-bg-color,
              ${_("colorPrimarySupportErrorDefault",f)}));
  --_map-dynamic-map-warning-stroke-color:
      var(--bbva-map-dynamic--_ambient--map-warning-stroke-color,
          var(--bbva-map-dynamic--custom--primary-ambient--map-warning-stroke-color,
              ${_("colorPrimarySurfaceAmbientDefault",f)}));
  --_map-dynamic-header-bg-color:
          var(--bbva-map-dynamic--custom--primary-ambient--header-bg-color,
              ${_("colorPrimarySurfaceContrastDefault",f)});
  --_map-dynamic-suggestions-bg-color:
      var(--bbva-map-dynamic--_ambient--suggestions-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--suggestions-bg-color,
              ${_("colorPrimarySurfaceAlternativeDefault",f)}));
  --_map-dynamic-suggestions-active-bg-color:
      var(--bbva-map-dynamic--_ambient--suggestions-active-bg-color,
          var(--bbva-map-dynamic--custom--primary-ambient--suggestions-active-bg-color,
              ${_("colorPrimaryAltSurfaceAlternativeDefault",f)}));
  --_map-dynamic-suggestions-active-focus:
      var(--bbva-map-dynamic--_ambient--suggestions-active-focus,
          var(--bbva-map-dynamic--custom--primary-ambient--suggestions-active-focus,
              ${_("colorPrimarySurfaceAmbientFocus",f)}));
}
`;const J=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-map-dynamic--_ambient--section-large-bg-color: initial;
    --bbva-map-dynamic--_ambient--section-large-action-button-action: initial;
    --bbva-map-dynamic--_ambient--text-color: initial;
    --bbva-map-dynamic--_ambient--text-bg-color: initial;
    --bbva-map-dynamic--_ambient--map-pin-bg-color: initial;
    --bbva-map-dynamic--_ambient--map-pin-active-bg-color: initial;
    --bbva-map-dynamic--_ambient--map-pin-color-fill: initial;
    --bbva-map-dynamic--_ambient--map-pin-selected-bg-color: initial;
    --bbva-map-dynamic--_ambient--map-icon-color: initial;
    --bbva-map-dynamic--_ambient--map-icon-active-color: initial;
    --bbva-map-dynamic--_ambient--map-icon-selected-color: initial;
    --bbva-map-dynamic--_ambient--map-icon-selected-active-color: initial;
    --bbva-map-dynamic--_ambient--map-icon-selected-active-bg-color: initial;
    --bbva-map-dynamic--_ambient--map-warning-color: initial;
    --bbva-map-dynamic--_ambient--map-pin-bg-color-aqua: initial;
    --bbva-map-dynamic--_ambient--map-pin-bg-color-pink: initial;
    --bbva-map-dynamic--_ambient--map-pin-bg-color-sand: initial;
    --bbva-map-dynamic--_ambient--map-pin-bg-color-purple: initial;
    --bbva-map-dynamic--_ambient--map-warning-bg-color: initial;
    --bbva-map-dynamic--_ambient--map-warning-stroke-color: initial;
    --bbva-map-dynamic--_ambient--suggestions-bg-color: initial;
    --bbva-map-dynamic--_ambient--suggestions-active-bg-color: initial;
    --bbva-map-dynamic--_ambient--suggestions-active-focus: initial;
  }
`,ee=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-map-dynamic--_ambient--section-large-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--section-large-bg-color,
      ${_("colorPrimaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--section-large-action-button-action: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--section-large-action-button-action,
      ${_("colorPrimaryAltSurfaceAlternativePressed",f)}
    );

    --bbva-map-dynamic--_ambient--text-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--text-color,
      ${_("colorPrimaryAltLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--text-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--text-bg-color,
      ${_("colorPrimaryAltLocationsPinsBackgroundDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-bg-color,
      ${_("colorPrimaryAltLocationsPinsBackgroundDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-active-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-icon-active-color,
      ${_("colorPrimaryAltLocationsPinsTextPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-active-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-active-bg-color,
      ${_("colorPrimaryAltLocationsPinsBackgroundPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-active-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-icon-selected-active-color,
      ${_("colorPrimaryAltLocationsPinsTextSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-active-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-icon-selected-active-bg-color,
      ${_("colorPrimaryAltLocationsPinsBackgroundSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-color-fill: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-color-fill,
      ${_("colorPrimaryAltLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-selected-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-selected-bg-color,
      ${_("colorPrimaryAltLocationsPinsBackgroundSelected",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-icon-color,
      ${_("colorPrimaryAltLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-icon-selected-color,
      ${_("colorPrimaryAltLocationsPinsTextSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-warning-color,
      ${_("colorPrimaryAltSupportErrorDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-aqua: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-bg-color-aqua,
      ${_("colorPrimaryAltCategoriesPoints",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-pink: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-bg-color-pink,
      ${_("colorPrimaryAltCategoriesOfferDiscountRefound",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-sand: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-bg-color-sand,
      ${_("colorPrimaryAltCategoriesFinancingSkipPayments",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-purple: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-pin-bg-color-purple,
      ${_("colorPrimaryAltCategoriesCombinedPromotions",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-warning-bg-color,
      ${_("colorPrimaryAltSupportErrorDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-stroke-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--map-warning-stroke-color,
      ${_("colorPrimaryAltSurfaceAmbientDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--suggestions-bg-color,
      ${_("colorPrimaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-active-bg-color: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--suggestions-active-bg-color,
      ${_("colorPrimarySurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-active-focus: var(
      --bbva-map-dynamic--custom--primary-alt-ambient--suggestions-active-focus,
      ${_("colorPrimaryAltSurfaceAmbientFocus",f)}
    );

  }
`,te=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-map-dynamic--_ambient--section-large-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--section-large-bg-color,
      ${_("colorSecondarySurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--section-large-action-button-action: var(
      --bbva-map-dynamic--custom--secondary-ambient--section-large-action-button-action,
      ${_("colorSecondarySurfaceAlternativePressed",f)}
    );

    --bbva-map-dynamic--_ambient--text-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--text-color,
      ${_("colorSecondaryLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--text-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--text-bg-color,
      ${_("colorSecondaryLocationsPinsBackgroundDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-bg-color,
      ${_("colorSecondaryLocationsPinsBackgroundDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-active-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-active-bg-color,
      ${_("colorSecondaryLocationsPinsBackgroundPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-color-fill: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-color-fill,
      ${_("colorSecondaryLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-selected-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-selected-bg-color,
      ${_("colorSecondaryLocationsPinsBackgroundSelected",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-icon-color,
      ${_("colorSecondaryLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-active-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-icon-active-color,
      ${_("colorSecondaryLocationsPinsTextPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-active-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-icon-selected-active-color,
      ${_("colorSecondaryLocationsPinsTextSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-active-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-icon-selected-active-bg-color,
      ${_("colorSecondaryLocationsPinsBackgroundSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-icon-selected-color,
      ${_("colorSecondaryLocationsPinsTextSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-warning-color,
      ${_("colorSecondarySupportErrorDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-aqua: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-bg-color-aqua,
      ${_("colorSecondaryCategoriesPoints",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-pink: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-bg-color-pink,
      ${_("colorSecondaryCategoriesOfferDiscountRefound",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-sand: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-bg-color-sand,
      ${_("colorSecondaryCategoriesFinancingSkipPayments",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-purple: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-bg-color-purple,
      ${_("colorSecondaryCategoriesCombinedPromotions",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-warning-bg-color,
      ${_("colorSecondarySupportErrorDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-stroke-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-warning-stroke-color,
      ${_("colorSecondarySurfaceAmbientDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--suggestions-bg-color,
      ${_("colorSecondarySurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-active-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--suggestions-active-bg-color,
      ${_("colorSecondaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-active-focus: var(
      --bbva-map-dynamic--custom--secondary-ambient--suggestions-active-focus,
      ${_("colorSecondarySurfaceAmbientFocus",f)}
    );
  }
`,ae=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-map-dynamic--_ambient--section-large-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--section-large-bg-color,
      ${_("colorSecondaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--section-large-action-button-action: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--section-large-action-button-action,
      ${_("colorSecondaryAltSurfaceAlternativePressed",f)}
    );

    --bbva-map-dynamic--_ambient--text-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--text-color,
      ${_("colorSecondaryAltLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--text-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--text-bg-color,
      ${_("colorSecondaryAltLocationsPinsBackgroundDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-bg-color,
      ${_("colorSecondaryAltLocationsPinsBackgroundDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-color-fill: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-color-fill,
      ${_("colorSecondaryAltLocationsPinsTextDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-selected-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-selected-bg-color,
      ${_("colorSecondaryAltLocationsPinsBackgroundSelected",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-active-bg-color: var(
      --bbva-map-dynamic--custom--secondary-ambient--map-pin-active-bg-color,
      ${_("colorSecondaryAltLocationsPinsBackgroundPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-icon-color,
      ${_("colorSecondaryAltLocationsPinsTextDefault",f)}
    );
    --bbva-map-dynamic--_ambient--map-icon-active-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-icon-active-color,
      ${_("colorSecondaryAltLocationsPinsTextPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-active-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-icon-selected-active-color,
      ${_("colorSecondaryAltLocationsPinsTextSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-active-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-icon-selected-active-bg-color,
      ${_("colorSecondaryAltLocationsPinsBackgroundSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-icon-selected-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-icon-selected-color,
      ${_("colorSecondaryAltLocationsPinsTextSelectedPressed",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-warning-color,
      ${_("colorSecondaryAltSupportErrorDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-aqua: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-bg-color-aqua,
      ${_("colorSecondaryAltCategoriesPoints",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-pink: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-bg-color-pink,
      ${_("colorSecondaryAltCategoriesOfferDiscountRefound",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-sand: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-bg-color-sand,
      ${_("colorSecondaryAltCategoriesFinancingSkipPayments",f)}
    );

    --bbva-map-dynamic--_ambient--map-pin-bg-color-purple: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-pin-bg-color-purple,
      ${_("colorSecondaryAltCategoriesCombinedPromotions",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-warning-bg-color,
      ${_("colorSecondaryAltSupportErrorDefault",f)}
    );

    --bbva-map-dynamic--_ambient--map-warning-stroke-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--map-warning-stroke-color,
      ${_("colorSecondaryAltSurfaceAmbientDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--suggestions-bg-color,
      ${_("colorSecondaryAltSurfaceAlternativeDefault",f)}
    );

    --bbva-map-dynamic--_ambient--suggestions-active-bg-color: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--suggestions-active-bg-color,
      ${_("colorSecondarySurfaceAlternativeDefault",f)}
    );


    --bbva-map-dynamic--_ambient--suggestions-active-focus: var(
      --bbva-map-dynamic--custom--secondary-alt-ambient--suggestions-active-focus,
      ${_("colorSecondaryAltSurfaceAmbientFocus",f)}
    );
  }
`;const ie=S([Object.freeze({__proto__:null,primary:J,primaryAlt:ee,secondary:te,secondaryAlt:ae}),I,O,$,N]),oe=Object.values(ie);class ne extends(s(P(c))){static get is(){return"bbva-map-dynamic"}static get scopedElements(){return{"bbva-button-action":D,"bbva-button-default":C,"bbva-form-input":E,"bbva-form-predictive":H,"bbva-type-text":A}}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},initialGeoLocation:{type:Object,attribute:"initial-geo-location"},availableCenter:{type:Object,attribute:"available-center"},zoom:{type:Number},maxZoom:{type:Number,attribute:"max-zoom"},minZoom:{type:Number,attribute:"min-zoom"},variant:{type:String},poiRadius:{type:Number,attribute:"poi-radius"},pois:{type:Array},iconMyLocation:{type:String,attribute:"icon-my-location"},hideMeMarker:{type:Boolean,attribute:"hide-me-marker"},iconSearch:{type:String,attribute:"icon-search"},_map:{type:Object,state:!0},_mapStyles:{type:Array},_markers:{type:Array},_meMarker:{type:Object},_geocoder:{type:Object},_openButtonSearch:{type:Boolean},_lastGeoLocation:{type:Object},_placeSearch:{type:Object},ambient:{type:String},_inputValidation:{type:Boolean},clearPois:{type:Boolean,attribute:"clear-pois"},clearSelected:{type:Boolean,attribute:"clear-selected"},searchHeader:{type:Boolean,attribute:"search-header"},buttonText:{type:String,attribute:"button-text"},showPredictive:{type:Boolean,attribute:"show-predictive"},noResultsMessage:{type:String,attribute:"no-results-message"},predictiveInfoMessage:{type:String,attribute:"predictive-info-message"},suggestions:{type:Array},avoidClickableIcons:{type:Boolean,attribute:"avoid-clickable-icons",reflect:!0},isDraggablePin:{type:Boolean,attribute:"is-draggable-pin",reflect:!0},address:{type:Array},isRequiredInput:{type:Boolean,attribute:"is-required-input"},popupMarkers:{type:Array,attribute:"popup-markers"},hideMapInfoFooter:{type:Boolean,attribute:"hide-map-info-footer",reflect:!0},optionalInputLabel:{type:String,attribute:"optional-input-label"},mobileMarkerPopup:{type:Object,attribute:"mobile-marker-popup"},currentAddress:{type:String,attribute:"current-address"},popupAxis:{type:Object},withCluster:{type:Boolean,attribute:"with-cluster"},markerSelected:{type:Object,attribute:"marker-selected"},minChars:{type:Number,attribute:"min-chars"},clusterSelected:{type:Object,attribute:"cluster-selected"},clusterColor:{type:String,attribute:"cluster-color"},clusterSelectedColor:{type:String,attribute:"cluster-selected-color"},accessibilityButtonAction:{type:String,attribute:"accessibility-button-action"},_markerCluster:{type:Object},_showEmptySection:{type:Boolean}}}constructor(){super(),this.apiKey="",this.label=this.t("bbva-map-dynamic-label"),this.message=this.t("bbva-map-dynamic-message"),this.zoom=15,this.maxZoom=17,this.minZoom=7,this.poiRadius=2500,this.hideMeMarker=!1,this.iconMyLocation=g(),this.searchHeader=!1,this._mapStyles=U,this._openButtonSearch=!1,this._placeSearch={},this.ambient="light",this.selectedPopup=null,this.isDraggablePin=!1,this.noResultsMessage="",this.predictiveInfoMessage="",this.avoidClickableIcons=!1,this._meIcon=Z,this.address=[],this.isRequiredInput=!1,this.currentAddress="",this.popupMarkers=[],this.hideMeMarkers=!1,this.hideMapInfoFooter=!1,this.optionalInputLabel=this.t("bbva-map-dynamic-optinal-label"),this.mobileMarkerPopup={},this.popupAxis={},this._inputValidation=!1,this.clearPois=!1,this.clearSelected=!1,this.withCluster=!1,this.availableCenter={},this.markerSelected={},this.minChars=1,this.clusterSelected={},this.clusterColor="#1973B8",this.clusterSelectedColor="#004481",this._markerCluster={},this.accessibilityButtonAction="bbva-map-dynamic-message-action-accessibility",this._markers=[],this._showEmptySection=!1,window.initMap=()=>{window.dispatchEvent(new CustomEvent("map-dynamic-item-ready"))}}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._mapScriptTag(),this._handleEventMap()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeEventMap()}async updated(e){super.updated(e),e.has("geoLocation")&&0!==Object.keys(this.geoLocation||{}).length&&this._meMap(),e.has("pois")&&this._putMarkersOnMap(),e.has("ambient")&&this._refreshMapStyles(),e.has("clearPois")&&this.clearPois&&this._clearPois(),e.has("clearSelected")&&this.clearSelected&&this._resetSelectedItems(),e.has("availableCenter")&&Object.keys(this.availableCenter).length&&this._setCenter(this.availableCenter);const t=document.querySelector(".pac-container");var a;(t&&t.remove(),e.has("mobileMarkerPopup")&&0!==Object.keys(this.mobileMarkerPopup).length&&this._changePopupLocation(),e.has("isDraggablePin"))&&(await this.updateComplete,null===(a=this._meMarker)||void 0===a||a.setDraggable(this.isDraggablePin));e.has("address")&&this.address&&this._sendAddress(this.address),e.has("_placeSearch")&&0!==Object.keys(this._placeSearch).length&&this._sendGeoLocation(this._placeSearch)}_handleEventMap(){window.addEventListener("map-dynamic-item-ready",this._eventMap.bind(this),!0)}_removeEventMap(){window.removeEventListener("map-dynamic-item-ready",this._eventMap.bind(this),!0)}_eventMap(){Object.setPrototypeOf(Y.prototype,new google.maps.OverlayView);const e={zoom:this.zoom,streetViewControl:!1,disableDefaultUI:!0,maxZoom:this.maxZoom,minZoom:this.minZoom,styles:this._mapStyles,mapTypeId:"roadmap",clickableIcons:!this.avoidClickableIcons};void 0!==this.geoLocation&&Object.assign(e,{center:this.geoLocation}),this._map=new google.maps.Map(this.shadowRoot.querySelector("#map"),e);const t=`data:image/svg+xml;charset=utf-8,${this._meIcon.getHTML()}`;this._meMarker=new google.maps.Marker({map:this._map,draggable:this.isDraggablePin,icon:{url:t,scaledSize:{width:40,height:40}}}),this._geocoder=new google.maps.Geocoder;const a=[{showPredictive:this.showPredictive,dataTagName:"bbva-form-predictive"},{searchHeader:this.searchHeader,dataTagName:"bbva-form-input"}];for(const e of a)(e.showPredictive||e.searchHeader)&&(this._mapSearchInput=this.shadowRoot.querySelector(`[data-tag-name="${e.dataTagName}"]`),ne._autocomplete(this._mapSearchInput));this._map.addListener("idle",(()=>{this._dispatch("map-dynamic-idle"),this.geoLocation&&0!==Object.keys(this.geoLocation).length||this._requestGeoLocation()})),this._map.addListener("bounds_changed",(()=>{var e,t,a,i,o,n;const r=null==this||null===(e=this._map)||void 0===e||null===(t=e.getBounds)||void 0===t?void 0:t.call(e),s=null==r?void 0:r.getNorthEast(),c=null==r?void 0:r.getSouthWest();this._dispatch("map-dynamic-bounds-changed",{ne:{latitude:null==s||null===(a=s.lat)||void 0===a?void 0:a.call(s),longitude:null==s||null===(i=s.lng)||void 0===i?void 0:i.call(s)},sw:{latitude:null==c||null===(o=c.lat)||void 0===o?void 0:o.call(c),longitude:null==c||null===(n=c.lng)||void 0===n?void 0:n.call(c)}})})),this._map.addListener("center_changed",(()=>{var e,t,a,i;const o=null===(e=this._map)||void 0===e||null===(t=e.getCenter)||void 0===t?void 0:t.call(e);this._dispatch("map-dynamic-center-changed",{latitude:null==o||null===(a=o.lat)||void 0===a?void 0:a.call(o),longitude:null==o||null===(i=o.lng)||void 0===i?void 0:i.call(o)})})),this._map.addListener("zoom_changed",(()=>{var e,t;this._dispatch("map-dynamic-zoom-changed",null===(e=this._map)||void 0===e||null===(t=e.getZoom)||void 0===t?void 0:t.call(e))})),this._meMarker.addListener("dragend",(e=>{this.geoLocation={lat:e.latLng.lat(),lng:e.latLng.lng()},this._centerMap(this.geoLocation),this._sendGeoLocation(this.geoLocation)})),this._dispatch("map-dynamic-map-ready",!0)}_dispatch(e,t=null,a=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:a,composed:i}))}_sendGeoLocation(e){this.dispatchEvent(new CustomEvent("map-dynamic-geolocation-changed",{detail:{geoLocation:e},bubbles:!0,composed:!0}))}_sendAddress(e){this.dispatchEvent(new CustomEvent("map-dynamic-address-changed",{detail:{address:e},bubbles:!0,composed:!0}))}static _autocomplete(e){new google.maps.places.Autocomplete(e).setFields(["address_components","geometry","icon","name"])}async _refreshMapStyles(){var e,t;"dark"!==this.ambient?(this._mapStyles=U,this._meIcon=Z):(this._mapStyles=W,this._meIcon=G),await this.updateComplete;const a=`data:image/svg+xml;charset=utf-8,${this._meIcon.getHTML()}`;null===(e=this._map)||void 0===e||e.setOptions({styles:this._mapStyles}),null===(t=this._meMarker)||void 0===t||t.setOptions({icon:{url:a,scaledSize:{width:40,height:40}}})}_requestGeoLocation(){this.dispatchEvent(new CustomEvent("map-dynamic-geolocation-request",{detail:!0,bubbles:!0,composed:!0}))}_geocodeLatLng(e){this._geocoder.geocode({location:e},((e,t)=>{if("OK"===t)if(e[0]){const[t]=e;this.message=`${this.t("map-dynamic-message")} ${e[0].formatted_address}`,this.address=t,this.currentAddress=e[0].formatted_address}else this.message=this.t("bbva-map-dynamic-no-result");else this.message=`${this.t("bbva-map-dynamic-geocoder-fails")}: ${t}`}))}_requestPOIs(){this._lastGeoLocation&&this.dispatchEvent(new CustomEvent("map-dynamic-pois-request",{detail:{geoLocation:this._lastGeoLocation,radius:this.poiRadius},bubbles:!0,composed:!0}))}async _meMap(){await this.updateComplete;const e=this.initialGeoLocation||this.geoLocation;this._map.me=e,this.hideMeMarker||this._meMarker.setPosition(e),this._centerMap(e),this._requestPOIs()}_centerMap(e){e&&(this._setCenter(e),this._geocodeLatLng(this._lastGeoLocation))}_setCenter(e){this._lastGeoLocation={...e},this._map.setCenter(this._lastGeoLocation)}_handleCenterMap(){this._dispatch("map-dynamic-center-map-button"),this._requestGeoLocation()}static _computeDistanceBetween(e,t){const a=e=>e*Math.PI/180,i=a(t.lat-e.lat),o=a(t.lng-e.lng),n=Math.sin(i/2)*Math.sin(i/2)+Math.cos(a(e.lat))*Math.cos(a(t.lat))*Math.sin(o/2)*Math.sin(o/2);return(6378.137*(2*Math.atan2(Math.sqrt(n),Math.sqrt(1-n)))).toFixed(3)}_mapScriptTag(){if(this.apiKey){const e=`https://maps.googleapis.com/maps/api/js?key=${this.apiKey}&libraries=places,marker&callback=initMap`,t=this.shadowRoot.querySelector("#api-map");t&&t.remove();const a=document.createElement("script");a.setAttribute("id","api-map"),a.setAttribute("src",e),a.setAttribute("async",!0),a.setAttribute("defer",!0),this.shadowRoot.appendChild(a)}}_clusterRenderer(e){let t=this.clusterColor;const a=e.position.lat(),i=e.position.lng();a===this.clusterSelected.lat&&i===this.clusterSelected.lng&&(t=this.clusterSelectedColor);const o=window.btoa(`\n    <svg fill="${t}" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 40 48">\n        ${K.strings[0]}\n    </svg>`);return new google.maps.Marker({position:e.position,icon:{url:`data:image/svg+xml;base64,${o}`,scaledSize:new google.maps.Size(40,48)},label:{text:String(e.count),color:"rgba(255,255,255,0.8)",fontSize:"16px"},zIndex:Number(google.maps.Marker.MAX_ZINDEX)+e.count})}_putMarkersOnMap(){var e;this._markers=[],this._map&&null!==(e=this.pois)&&void 0!==e&&e.length&&(this.withCluster?this._putMarkersWithClusters():this._putMarkersWithoutClusters())}_putMarkersWithClusters(){this.pois.forEach((e=>{if(e.address.geolocation){var t,a;const i={lat:e.address.geolocation.latitude,lng:e.address.geolocation.longitude},o=new google.maps.Marker({position:i,label:e.name,icon:{url:`data:image/svg+xml;base64,${ne._configureMarker(y[e.icon],K.getHTML(),null===(t=e.iconColor)||void 0===t?void 0:t.default,null===(a=e.backgroundColor)||void 0===a?void 0:a.default)}`},customInfo:e,optimized:!1});o.addListener("click",(()=>{this._dispatch("map-dynamic-popup-click",e)})),o.addListener("tap",(()=>{this._dispatch("map-dynamic-popup-tap",e)})),o.addListener("mouseup",(()=>{this.markerSelected!==o&&this._resetSelectedMarker(),o.setIcon({url:`data:image/svg+xml;base64,${ne._configureMarker(y[o.customInfo.icon],K.getHTML(),o.customInfo.iconColor.selected,o.customInfo.backgroundColor.selected)}`}),this._resetSelectedCluster(),this.markerSelected=o})),this._markers.push(o)}}));const e={render:this._clusterRenderer.bind(this)};this._markerCluster=new markerClusterer.MarkerClusterer({map:this._map,markers:this._markers,renderer:e,algorithm:new markerClusterer.GridAlgorithm({maxZoom:19}),onClusterClick:this._onClusterClickHandler.bind(this)}),this._map.addListener("click",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()})),this._map.addListener("tap",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()}))}_putMarkersWithoutClusters(){this.pois.forEach((e=>{if(e.address.geolocation){var t,a;const i={lat:e.address.geolocation.latitude,lng:e.address.geolocation.longitude},o=new Y(e.description||e.name,i,e.icon,e.color,e.warning,null===(t=this.popupAxis)||void 0===t?void 0:t.axisX,null===(a=this.popupAxis)||void 0===a?void 0:a.axisY);o.containerDiv.addEventListener("click",(t=>{t.stopPropagation(),this._dispatch("map-dynamic-popup-click",e)})),o.containerDiv.addEventListener("tap",(t=>{t.stopPropagation(),this._dispatch("map-dynamic-popup-tap",e)})),o.containerDiv.addEventListener("mouseup",(()=>{this.selectedPopup&&this.selectedPopup.containerDiv.classList.remove("selected"),this.selectedPopup=o,this.selectedPopup.containerDiv.classList.add("selected")})),o.setMap(this._map),this.popupMarkers.push(o)}})),this._map.addListener("click",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()})),this._map.addListener("tap",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()}))}_onClusterClickHandler(e,t,a){const{markers:i}=t,o=i.every(((e,t,a)=>e.position.equals(a[0].position))),n=a.getZoom()===a.maxZoom;if(o||n){const t={lat:e.latLng.lat(),lng:e.latLng.lng()};this.clusterSelected!==t&&(this.clusterSelected=t,this._resetSelectedMarker(),this._showLastChanges()),this._dispatch("map-dynamic-cluster-click",i)}else markerClusterer.defaultOnClusterClickHandler(e,t,a)}_resetSelectedMarker(){var e;Object.keys(this.markerSelected).length&&(null===(e=this.markerSelected)||void 0===e||e.setIcon({url:`data:image/svg+xml;base64,${ne._configureMarker(y[this.markerSelected.customInfo.icon],K.getHTML(),this.markerSelected.customInfo.iconColor.default,this.markerSelected.customInfo.backgroundColor.default)}`}),this.markerSelected={})}_resetSelectedCluster(){Object.keys(this.clusterSelected).length&&(this.clusterSelected={},this._showLastChanges())}_showLastChanges(){this._map.setZoom(this._map.getZoom())}static _configureMarker(e,t,a,i){let o=e;a&&(o=ne._addColorToPath(e,a));let n=t;i&&(n=ne._addColorToPath(t,i));const r=`<svg width="48px" height="48px" version="1.1" xmlns="http://www.w3.org/2000/svg">\n          ${n}\n          <g transform="matrix(0.1, 0, 0, 0.1, 7, 10)">\n          ${o}\n          </g>\n        </svg>`;return window.btoa(r)}static _addColorToPath(e,t){const a=` fill="${t}"`;return(e.match(/<path\s+d="[^"]+"\s*\/?>/g)||[]).map((e=>`${e.replace("/>",a)}/>`)).join("")}_clearPois(){var e,t;this.popupMarkers.forEach((e=>{e.setMap(null)})),null===(e=this._markerCluster)||void 0===e||null===(t=e.clearMarkers)||void 0===t||t.call(e),this.popupMarkers=[],this.pois=[],this._markers=[]}_resetSelectedItems(){this._resetSelectedMarker(),this._resetSelectedCluster()}_changePopupLocation(){var e,t,a,i,o,n,r,s,c,l;null===(e=this.popupMarkers[0])||void 0===e||e.onRemove();const m={address:{geolocation:{latitude:null===(t=this.mobileMarkerPopup)||void 0===t?void 0:t.lat,longitude:null===(a=this.mobileMarkerPopup)||void 0===a?void 0:a.lng}},description:null===(i=this.popupMarkers[0])||void 0===i?void 0:i.description,icon:null===(o=this.popupMarkers[0])||void 0===o?void 0:o.icon,color:null===(n=this.popupMarkers[0])||void 0===n?void 0:n.color,warning:null===(r=this.popupMarkers[0])||void 0===r?void 0:r.warning};null===(s=this.popupMarkers)||void 0===s||s.shift(),null===(c=this.pois)||void 0===c||c.shift(),null===(l=this.pois)||void 0===l||l.push(m),this._putMarkersOnMap()}_handlePlaceSearch(){this._centerMap(this._placeSearch),this._requestPOIs(),this._mapSearchInput.setAttribute("value","")}_setSuggestions(e){const{value:t}=e.target;this._inputValidation=""===t;(new google.maps.places.AutocompleteService).getPlacePredictions({input:t},(e=>{this.suggestions=e,this._showEmptySection=!this.suggestions}))}_setLocationOnMap(e,t){this._mapSearchInput.value=e;new google.maps.places.PlacesService(this._mapSearchInput).getDetails({placeId:t},(e=>{this._placeSearch={...this._placeSearch,lat:e.geometry.location.lat(),lng:e.geometry.location.lng()},this._handlePlaceSearch(),this._meMarker.setPosition(this._placeSearch)})),this.suggestions=[]}_handleLocationClick(e){const{description:t,place_id:a}=e;this._setLocationOnMap(t,a)}_handleLocationKeydown(e,t){const{description:a,place_id:i}=e,{code:o}=t;"Escape"!==o?"Enter"!==o&&"Space"!==o||(t.preventDefault(),this._setLocationOnMap(a,i)):this.suggestions=[]}_handleClickButtonDefault(){this.dispatchEvent(new CustomEvent("map-dynamic-button-click",{bubbles:!0,composed:!0,detail:!0}))}static get styles(){return[X,Q,oe,m("bbva-map-dynamic-shared-styles")]}get buttonDefault(){return this.buttonText?p` <div class="bbva-map-dynamic-section-large-button">
        <bbva-button-default
          .text=${this.buttonText}
          .ambient=${this.ambient}
          @click="${this._handleClickButtonDefault}"
        ></bbva-button-default>
      </div>`:""}get _searchInput(){return p`<section class="bbva-map-dynamic-header">
      <bbva-form-input
        type="search"
        class="primary"
        label="${this.t(this.label)}"
        placeholder=""
        icon=${d(this.iconSearch)}
        optional-label="${this.optionalInputLabel}"
        ?required="${this.isRequiredInput}"
        value="${this.currentAddress}"
        @input=${this._setSuggestions}
        @form-search-button-submit="${this._handlePlaceSearch}"
      ></bbva-form-input>
    </section>`}get _predictiveInput(){return p`<section class="bbva-map-dynamic-header predictive">
      <bbva-form-predictive
        type="text"
        class="primary"
        use-custom-empty-section
        label="${this.t(this.label)}"
        placeholder=""
        avoid-show-empty-section
        min-chars="${this.minChars}"
        icon=${d(this.iconSearch)}
        info-message="${this.predictiveInfoMessage}"
        ?required="${this.isRequiredInput}"
        value="${this.currentAddress}"
        clear-accessible-text="${this.t("bbva-map-dynamic-clear-accessible-text")}"
        @input=${this._setSuggestions}
      ></bbva-form-predictive>
    </section>`}get _suggestionSection(){return p` <section class="suggestions">
      <ul>
        ${this.suggestions.map((e=>p`<li>
              <div
                class="suggestions-text"
                data-id="${e.place_id}"
                tabindex="0"
                @click="${()=>this._handleLocationClick(e)}"
                @keydown=${t=>this._handleLocationKeydown(e,t)}
              >
                <bbva-type-text
                  variant="spotlight"
                  unset
                  size="S"
                  text="${e.description}"
                ></bbva-type-text>
              </div>
            </li>`))}
      </ul>
    </section>`}get _renderEmptySection(){return p` <div class="suggestions empty">
      <bbva-type-text
        tag="span"
        text="${this.t(this.noResultsMessage)}"
        size="S"
        ellipsis
      ></bbva-type-text>
    </div>`}render(){var e;return p`
      <div class="container">
        ${this.searchHeader?this._searchInput:""}
        ${this.showPredictive?this._predictiveInput:""}
        ${null!==(e=this.suggestions)&&void 0!==e&&e.length&&!this._inputValidation?this._suggestionSection:""}
        ${this._showEmptySection?this._renderEmptySection:""}
        <div class="map-container">
          <section id="map" class="bbva-map-dynamic-section"></section>
          ${this.buttonDefault}
          <div class="bbva-map-dynamic-section-large-action">
            <bbva-button-action
              aria-label="${this.t(this.accessibilityButtonAction)}"
              icon="${this.iconMyLocation}"
              @click="${this._handleCenterMap}"
            >
            </bbva-button-action>
          </div>
        </div>
      </div>
    `}}export{ne as B,ie as b};
