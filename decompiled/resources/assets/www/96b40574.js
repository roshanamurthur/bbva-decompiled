import{z as e,ar as t,a8 as a,a9 as i,b1 as r,a as o,an as l,aJ as n,L as s,ag as d,ak as c,h,aV as b,f as v,g as u,au as g,bd as p,ab as m,ac as y,ad as k,aa as f,aS as $,aw as x,S,af as w,i as _,bl as D,av as T}from"./952f98a9.js";var C=e`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new t).mediaRules()}`;const L=new t;var R=e`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${a(i.primaryCoreDark)});
}
${L.mediaRules()}`;const F={dark:e`
    ${r.dark}
    ${R}
  `,light:e`
    ${r.light}
    ${C}
  `},V=new t;var q=e`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --skeleton-quote-bg: var(--bbva-date-dark-mode-skeleton-bg, var(--bbva-date-skeleton-bg, transparent));
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

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((50px * 2) + (15px/ 2)) 15px;
  background-position: 0 0;
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
.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  white-space: nowrap;
}
${V.mediaRules()}`;class P extends(o(l(n(s)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":d}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,q,c("bbva-date-shared-styles"),F.light,F.dark]}updated(e){var t,a;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=t.day||t.month||t.year;return t.hour&&t.minute&&!a?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),a=new Date(e[1]),i={...this.options};return i.month="long",[t,a].map(((e,t)=>e.toLocaleDateString(this.locale,i).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&h` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||b}get _tplDateRange(){var e;return this.isValidRange&&(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&h`
          <bbva-text
            unset
            text="${this._fromToDateFormat(this.dateRange)}"
            font-weight="500"
            font-style="italic"
            size="S"
            aria-hidden="true"
          >
          </bbva-text>
          <span data-id="sr-only" class="sr-only"
            >${this._fromToDateFormatA11y(this.dateRange)}</span
          >
        `||b}render(){return h` ${this._tplDate} ${this._tplDateRange} `}}var I={...v,bbvaDate:`\n        --bbva-date-dark-mode-color: ${u("colors.primaryCoreLightened")};\n        --bbva-date-dark-mode-skeleton-quote-color: ${u("colors.cool50")};\n    `};const z=new t;var A=e`[ambient^=dark] {
  --bbva-list-default-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-default-bg-color-pressed: var(--colorsPrimaryCoreDark, ${a(i.primaryCoreDark)});
  --bbva-list-default-link-color-pressed: var(--colorsPrimarySubduedLight, ${a(i.primarySubduedLight)});
  --bbva-list-default-icon-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-default-heading-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-default-skeleton-color: var(--colorsPrimaryMedium, ${a(i.primaryMedium)});
  --bbva-list-default-icon-link-color: var(--colorsPrimarySubdued, ${a(i.primarySubdued)});
}
${z.mediaRules()}`;var B=e`[ambient^=light] {
  --bbva-list-default-color: initial;
  --bbva-list-default-bg-color-pressed: initial;
  --bbva-list-default-link-color-pressed: initial;
  --bbva-list-default-icon-color: initial;
  --bbva-list-default-heading-color: initial;
  --bbva-list-default-skeleton-color: initial;
  --bbva-list-default-icon-link-color: initial;
}
${(new t).mediaRules()}`;const E={dark:e`
    ${F.dark}
    ${g.dark}
    ${p.dark}
    ${A}
  `,light:e`
    ${F.light}
    ${g.light}
    ${p.light}
    ${B}
  `},M=new t;var j=e`:host {
  --skeleton-quote-color: var(--bbva-list-default-dark-mode-skeleton-color, var(--bbva-list-default-skeleton-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-default-dark-mode-skeleton-bg, var(--bbva-list-default-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  padding: var(--bbva-list-default-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1em));
  color: var(--_list-default-color);
  --_list-default-heading-color: var(--bbva-list-default-dark-mode-heading-color, var(--bbva-list-default-heading-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_list-default-icon-color: var(--bbva-list-default-dark-mode-icon-color, var(--bbva-list-default-icon-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_list-default-icon-link-color: var(--bbva-list-default-dark-mode-icon-link-color, var(--bbva-list-default-icon-link-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)})));
  --_list-default-bg-color-pressed: var(--bbva-list-default-dark-mode-bg-color-pressed, var(--bbva-list-default-bg-color-pressed, var(--colorsSecondary100, ${a(i.secondary100)})));
  --_list-default-link-color-pressed: var(--bbva-list-default-dark-mode-link-color-pressed, var(--bbva-list-default-link-color-pressed, var(--colorsPrimaryCoreDark, ${a(i.primaryCoreDark)})));
  --_list-default-color: var(--bbva-list-default-dark-mode-color, var(--bbva-list-default-color, var(--colorsSecondary500, ${a(i.secondary500)})));
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

*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

.header-link {
  text-decoration: none;
  overflow: hidden;
  display: block;
}
.header-link::after {
  content: "";
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
}

.heading {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(m.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(m.medium.fontWeight)});
  color: var(--_list-default-heading-color);
}

[data-tag-name=bbva-amount] {
  color: var(--_list-default-heading-color);
}

.text {
  color: var(--_list-default-color);
}

.key-values {
  margin: 0;
  padding: 0;
  list-style: none;
  font-size: var(--typographyTypeSmall, ${a(y.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(k.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(m.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${a(m.book.fontWeight)});
}

.key-value {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
}
.key-value .key,
.key-value .value {
  max-width: 50%;
}
.key-value .key {
  padding-right: var(--bbva-list-default-key-padding-right, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 15) * 1em));
}
.key-value .value {
  display: flex;
  align-items: center;
  text-align: right;
}
.key-value.ellipsis-both .key,
.key-value.ellipsis-both .value .value-text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.key-value.ellipsis-key .key {
  max-width: 40%;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.key-value.ellipsis-key .value {
  max-width: 60%;
}
.key-value.ellipsis-value .key {
  max-width: 60%;
}
.key-value.ellipsis-value .value {
  max-width: 40%;
}
.key-value.ellipsis-value .value .value-text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.key-value.no-ellipsis {
  white-space: inherit;
  text-overflow: inherit;
}

.heading-icon-aligned {
  padding-left: var(--bbva-list-default-heading-icon-aligned-padding-left, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 15) * 1em));
}

.list-header {
  display: flex;
  align-items: center;
  line-height: var(--lineHeightTypeXSmall, ${a(k.typeXSmall)});
}

.right {
  margin-left: auto;
  white-space: nowrap;
  align-self: flex-start;
}

[data-tag-name=bbva-core-icon] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem);
  flex-shrink: 0;
  color: var(--_list-default-icon-color);
  align-self: flex-start;
}

[data-tag-name=bbva-text] {
  overflow: hidden;
}
[data-tag-name=bbva-text]:not(.text) {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) 0 0;
}

.content-description {
  display: flex;
}

:host([link]) {
  position: relative;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: var(--bbva-list-default-skeleton-height, 4.75rem);
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((37% * 2) + (16px/ 2)) 16px, calc((23% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 56px 16px, calc(100% - 16px) 16px, 56px 44px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host([link]:not([link=""])) .header-link .heading {
  color: var(--_list-default-icon-link-color);
}
:host([link]:not([link=""])) .header-link [data-tag-name=bbva-core-icon] {
  color: var(--_list-default-icon-link-color);
}

:host([link]:not([link=""]):active) {
  background: var(--_list-default-bg-color-pressed);
}
:host([link]:not([link=""]):active) .header-link .heading {
  color: var(--_list-default-link-color-pressed);
}
:host([link]:not([link=""]):active) .header-link [data-tag-name=bbva-core-icon] {
  color: var(--_list-default-link-color-pressed);
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
${M.mediaRules()}`;class N extends(o(l($(n(s))))){static get is(){return"bbva-list-default"}static get scopedElements(){return{"bbva-amount":x,"bbva-badge-variability":S,"bbva-core-icon":w,"bbva-date":P,"bbva-text":d}}static get properties(){return{date:{type:String},headingIcon:{type:String,attribute:"heading-icon"},headingIconColor:{type:String,attribute:"heading-icon-color"},heading:{type:String},iconAriaLabel:{type:String,attribute:"icon-aria-label"},headingLevel:{type:Number,attribute:"heading-level"},description:{type:String},link:{type:String,reflect:!0},preventNavigation:{type:Boolean,attribute:"prevent-navigation"},keyValues:{type:Array,attribute:"key-values"},variantAmount:{type:String,attribute:"variant-amount"},decimalDigits:{type:Number,attribute:"decimal-digits"},type:{type:String},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},disabled:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},headerLinkAccessibilityText:{type:String,attribute:"header-link-accessibility-text"},unit:{type:String}}}constructor(){super(),this.headingIcon="",this.headingIconColor="",this.headingLevel=3,this.description="",this.link="",this.preventNavigation=!1,this.keyValues=[],this.variantAmount="xl",this.decimalDigits=2,this.descriptionEllipsis=!1,this.disabled=!1,this.loading=!1,this.iconAriaLabel="",this.unit=""}static get styles(){return[super.styles,j,c("bbva-list-default-shared-styles"),E.dark,E.light]}updated(e){super.updated(e)}iconTemplate(){return h`
      <bbva-core-icon
        data-tag-name="bbva-core-icon"
        role="img"
        aria-label="${_(this.t(this.iconAriaLabel))}"
        .icon="${this.headingIcon}"
        ?hidden="${!this.headingIcon}"
        aria-hidden="${this.headingIcon&&!this.iconAriaLabel}"
        style="${D(this._headingIconColor)}"
      ></bbva-core-icon>
    `}get _headingIconColor(){return{color:this.headingIconColor||""}}textHeaderTemplate(){return h`
      <bbva-text
        class="heading"
        data-tag-name="bbva-text"
        tag="span"
        .text="${this.heading}"
        unset
      ></bbva-text>
    `}rightTemplate(){return h`
      <div class="right">
        <slot name="right">
          <div>${this.amount||0===this.amount?this._amount:this._date}</div>
        </slot>
      </div>
    `}get _date(){return h` <bbva-date data-tag-name="bbva-date" date="${this.date}"></bbva-date> `}get _amount(){return h`
      <bbva-amount
        data-tag-name="bbva-amount"
        .variant="${this.variantAmount}"
        .amount="${this.amount}"
        local-currency="${this.localCurrency}"
        currency-code="${this.currencyCode}"
        .language="${this.language}"
        decimal-digits="${this.decimalDigits}"
        .type="${this.type}"
        unit="${this.unit}"
      >
      </bbva-amount>
    `}titleTemplate(){return h`
      <div class="list-header">
        ${this.iconTemplate()} ${this.textHeaderTemplate()} ${this.rightTemplate()}
      </div>
    `}headerTemplate(){return this.link?h`
          <a
            href="${this.link}"
            class="header-link"
            id="link"
            aria-label="${_(this.t(this.headerLinkAccessibilityText))}"
            @click=${this._onLinkClick}
          >
            ${this.titleTemplate()}
          </a>
        `:h` ${this.titleTemplate()} `}itemsTemplate(){return this.keyValues.map((e=>h`
        <li>
          <dl class="key-value ${e.class||"ellipsis-both"}">
            <dt class="key">${this.t(e.key)}</dt>
            <dd class="value">
              <bbva-badge-variability
                data-tag-name="bbva-badge-variability"
                size="medium"
                ?hidden="${!e.status}"
                .status="${e.status}"
              ></bbva-badge-variability>
              <span class="value-text">${this.t(e.value)}</span>
            </dd>
          </dl>
        </li>
      `))}contentTemplate(){return h`
      <div class="content-description">
        <bbva-text
          data-tag-name="bbva-text"
          unset
          id="description"
          class="text ${T({"heading-icon-aligned":this.headingIcon})}"
          tag="span"
          lines="1"
          size="S"
          .text="${this.description}"
          ?ellipsis="${this.descriptionEllipsis}"
          ?hidden="${!this.description}"
        >
        </bbva-text>
      </div>
      <ul
        class="key-values ${T({"heading-icon-aligned":this.headingIcon})}"
        id="keyValuesList"
        ?hidden="${0===this.keyValues.length}"
      >
        ${this.itemsTemplate()}
      </ul>
    `}_onLinkClick(e){this.preventNavigation&&e.preventDefault()}render(){return h` ${this.headerTemplate()} ${this.contentTemplate()} `}}export{N as B,E as a,I as b};
