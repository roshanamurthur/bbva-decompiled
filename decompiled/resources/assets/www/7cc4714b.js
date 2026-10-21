import{z as e,ar as t,a8 as a,a9 as i,b1 as r,a as o,an as n,aJ as s,L as l,ag as c,ak as d,h,aV as b,f as p,g,au as u,ac as m,ad as v,ab as y,aa as $,aS as x,i as f,bl as S,af as _,bj as k,aw as C,aK as L,cQ as w}from"./952f98a9.js";import"./9cadd5ad.js";var D=e`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new t).mediaRules()}`;const T=new t;var z=e`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${a(i.primaryCoreDark)});
}
${T.mediaRules()}`;const B={dark:e`
    ${r.dark}
    ${z}
  `,light:e`
    ${r.light}
    ${D}
  `},R=new t;var M=e`:host {
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
${R.mediaRules()}`;class P extends(o(n(s(l)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":c}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,M,d("bbva-date-shared-styles"),B.light,B.dark]}updated(e){var t,a;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=t.day||t.month||t.year;return t.hour&&t.minute&&!a?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),a=new Date(e[1]),i={...this.options};return i.month="long",[t,a].map(((e,t)=>e.toLocaleDateString(this.locale,i).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&h` <bbva-text
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
        `||b}render(){return h` ${this._tplDate} ${this._tplDateRange} `}}g("colors.primaryCoreLightened"),g("colors.cool50");const A=new t;var F=e`[ambient^=dark] {
  --bbva-list-header-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-header-heading-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-header-right-content-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-header-icon-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
}
[ambient^=dark] [link-style] {
  --bbva-list-header-heading-color: var(--colorsPrimarySubdued, ${a(i.primarySubdued)});
  --bbva-list-header-icon-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
}
${A.mediaRules()}`;const E=new t;var I=e`[ambient^=light] {
  --bbva-list-header-color: initial;
  --bbva-list-header-heading-color: initial;
  --bbva-list-header-right-content-color: initial;
  --bbva-list-header-icon-color: initial;
}
[ambient^=light] [link-style] {
  --bbva-list-header-heading-color: var(--colorsPrimaryMedium, ${a(i.primaryMedium)});
  --bbva-list-header-icon-color: var(--colorsPrimaryMedium, ${a(i.primaryMedium)});
}
${E.mediaRules()}`;const V={dark:e`
    ${F}
    ${u.dark}
  `,light:e`
    ${I}
    ${u.light}
  `},O=new t;var j=e`*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

:host {
  display: flex;
  align-items: center;
  line-height: calc(var(--bbva-global-spacer, 0.5rem) * 3);
  color: var(--bbva-list-header-color, var(--colorsSecondary600, ${a(i.secondary600)}));
  --_list-header-icon-color: var(--bbva-list-header-icon-color, initial);
  --_list-header-right-content-color: var(--bbva-list-header-right-content-color, var(--colorsSecondary500, ${a(i.secondary500)}));
  --_list-header-heading-color: var(--bbva-list-header-heading-color, var(--colorsSecondary600, ${a(i.secondary600)}));
  --_list-header-heading-context-color: var(--bbva-list-header-heading-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)}));
  --_list-header-icon-context-color: var(--bbva-list-header-icon-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)}));
  --_list-header-heading-link-color: var(--bbva-list-header-heading-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)}));
  --_list-header-icon-link-color: var(--bbva-list-header-icon-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([heading-class=line-break]) {
  align-items: flex-start;
}

.line-break {
  white-space: normal;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  flex-shrink: 0;
  color: var(--_list-header-icon-color);
}

.right {
  margin-left: auto;
  white-space: nowrap;
}

.right ::slotted([slot=right]:not([icon])) {
  font-size: var(--typographyTypeSmall, ${a(m.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(v.typeSmall)});
  color: var(--_list-header-right-content-color);
}

.heading {
  color: var(--_list-header-heading-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(y.medium.fontWeight)});
  font-size: var(--typographyTypeMedium, ${a(m.typeMedium)});
  margin: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem) 0 0;
}

[data-tag-name=bbva-date] {
  font-size: var(--typographyTypeSmall, ${a(m.typeSmall)});
  font-weight: var(--bbva-badge-default-font-weight, var(--fontFacePrimaryBookItalicFontWeight, ${a(y.bookItalic.fontWeight)}));
  font-style: var(--bbva-badge-default-font-style, var(--fontFacePrimaryBookItalicFontStyle, ${a(y.bookItalic.fontStyle)}));
  color: inherit;
}

.clipbox {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

:host-context(button) .icon,
:host-context(button) .heading,
:host-context(a) .icon,
:host-context(a) .heading {
  text-decoration: none;
  text-decoration-color: transparent;
}
:host-context(button) .heading,
:host-context(a) .heading {
  color: var(--_list-header-heading-context-color);
}
:host-context(button) .icon,
:host-context(a) .icon {
  color: var(--_list-header-icon-context-color);
}

:host([link-style]) .heading {
  color: var(--_list-header-heading-link-color);
}
:host([link-style]) .icon {
  color: var(--_list-header-icon-link-color);
}
${O.mediaRules()}`;class q extends(o(n(x(l)))){static get is(){return"bbva-list-header"}static get scopedElements(){const e=[_,k,C,L,P];return q.scopedElementsFromClasses(e)}static get properties(){return{icon:{type:String,reflect:!0},src:{type:String,reflect:!0},iconSize:{type:Number,attribute:"icon-size"},iconAriaLabel:{type:String,attribute:"icon-aria-label"},heading:{type:String},headingLevel:{type:Number,attribute:"heading-level"},date:{type:String},dateOptions:{type:Object,attribute:"date-options"},variantAmount:{type:String,attribute:"variant-amount"},decimalDigits:{type:Number,attribute:"decimal-digits"},type:{type:String},clipBoxText:{type:String,attribute:"clip-box-text"},clipBoxSize:{type:String,attribute:"clip-box-size"},headingClass:{type:String,attribute:"heading-class",reflect:!0},iconColor:{type:String,attribute:"icon-color"},linkStyle:{type:Boolean,attribute:"link-style"}}}get _iconAriaHidden(){return Boolean((this.icon||this.src)&&!this.iconAriaLabel)}get _iconHidden(){return Boolean(!this.icon&&!this.src)}get _iconColor(){return{color:this.iconColor||""}}constructor(){super(),this.icon="",this.iconSize=24,this.iconColor="",this.headingLevel=3,this.variantAmount="3xl",this.decimalDigits="2",this.headingClass="ellipsis",this.linkStyle=!1,this.dateOptions={day:"2-digit",month:"2-digit",year:"2-digit"}}static get styles(){return[j,d("bbva-list-header-shared-styles"),V.dark,V.light]}clipBoxTemplate(){return this.clipBoxText?h`
          <bbva-clip-box
            class="bitone clipbox"
            text="${this.clipBoxText}"
            size="${this.clipBoxSize}"
          ></bbva-clip-box>
        `:""}iconTemplate(){return h`
      <bbva-core-icon
        id="icon"
        class="icon"
        size="${this.iconSize}"
        role="img"
        ?hidden="${this._iconHidden}"
        aria-label="${f(this.t(this.iconAriaLabel))}"
        aria-hidden="${this._iconAriaHidden}"
        .icon="${this.icon}"
        .src="${this.src}"
        style="${S(this._iconColor)}"
      ></bbva-core-icon>
    `}headerTemplate(){return h`
      <bbva-core-heading
        level="${this.headingLevel}"
        class="heading ${this.headingClass}"
        id="heading"
        >${this.t(this.heading)}</bbva-core-heading
      >
    `}rightTemplate(){return h`
      <div class="right">
        <slot name="right">
          <div>
            ${this.amount||0===this.amount?h`
                  <bbva-amount
                    id="amount"
                    variant="${this.variantAmount}"
                    amount="${this.amount}"
                    local-currency="${this.localCurrency}"
                    currency-code="${this.currencyCode}"
                    language="${this.language}"
                    decimal-digits="${this.decimalDigits}"
                    .type="${this.type}"
                  >
                  </bbva-amount>
                `:""}
            ${this.date?h`
                  <bbva-date
                    date=${this.date}
                    language="${this.language}"
                    .options=${this.dateOptions}
                  ></bbva-date>
                `:""}
          </div>
        </slot>
      </div>
    `}render(){return h`
      ${this.clipBoxTemplate()} ${this.iconTemplate()} ${this.headerTemplate()}
      ${this.rightTemplate()}
    `}}customElements.define(q.is,q);var G=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-list-header {
  position: sticky;
  top: 0;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 15) * 1em);
  min-height: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  background-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  @apply --bbva-expandable-accordion-list--header;
}

bbva-expandable-accordion {
  font-size: var(--typographyTypeSmall, ${a(m.typeSmall)});
  color: var(--colorsSecondary500, ${a(i.secondary500)});
  border-bottom: 1px solid var(--bbva-300, #D3D3D3);
  @apply --bbva-expandable-accordion-list--expandable;
}
bbva-expandable-accordion + bbva-list-header {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  @apply --bbva-expandable-accordion-list--header-after-expandable;
}

bbva-expandable-accordion p {
  margin: 1rem;
  @apply --bbva-expandable-accordion-list--p;
}

/* CUSTOM STYLE CLASSES */
:host(.description-highlight) p, .description-highlight {
  color: var(--colorsSecondary600, ${a(i.secondary600)});
  @apply --bbva-expandable-accordion-list-description-highlight;
}
`;class H extends l{static get is(){return"bbva-expandable-accordion-list"}static get properties(){return{list:{type:Array},sorted:{type:Boolean},isGrouped:{type:Boolean,attribute:"is-grouped"},groupLabelLength:{type:Number,attribute:"group-label-length"},_list:{type:Array},titleMedium:{type:Boolean,attribute:"title-medium"}}}constructor(){super(),this.list=[],this.sorted=!1,this.isGrouped=!1,this.groupLabelLength=1,this._list=[],this.titleMedium=!1}updated(e){const t=["list","isGrouped","sorted","groupLabelLength"];for(const[a,i]of e)if(-1!==t.indexOf(a)&&void 0!==i){this._parseList();break}e.has("list")&&this._parseList()}reset(){this.list=[],this._list=[]}_setProperties(e){const t=e||{};Object.keys(t).map((e=>(this[e]=t[e],e)))}_parseList(){this.list||(this.list=[]);let e=[...this.list],t=[],a=[];this.sorted&&e.sort(((e,t)=>e.title>t.title?1:-1)),e=this._groupList(e),t=Object.keys(e).map((t=>({header:t,body:e[t]}))),a=t.sort(((e,t)=>e.header>t.header?1:-1)),this._list=this.sorted?a:t}_groupList(e){return e.reduce(((e,t)=>{const a=this.isGrouped?t.category||t.title.substr(0,this.groupLabelLength).toUpperCase():"",i=e;return i[a]||(i[a]=[]),i[a].push(t),i}),{})}_closeAccordions(e){const t=this.list.length,a=e.currentTarget.rowTitle;this.shadowRoot.querySelectorAll("bbva-expandable-accordion").forEach((i=>{const r=i;e?r.opened&&r!==e.currentTarget&&e.detail.value?r.opened=!1:r.opened&&r===e.currentTarget&&e.detail.value&&this.dispatchEvent(new CustomEvent("bbva-expandable-accordion-list-tagging-glossary-list",{bubbles:!0,composed:!0,detail:{relatedSearchesNumber:t,title:a}})):r.opened=!1}))}_getIcon(e,t=""){let a=e||t;return w[a]&&this._list&&(a=w[a]()),a}_setExpandableItem(e){const t=e.params||{};return h`
      <bbva-expandable-accordion
        header-role="button"
        class=${f(t.accordionClass)}
        ?clip-box=${t.clipBox}
        bg-clip-box=${f(t.bgClipBox)}
        bg-clip-box-open=${f(t.bgClipBoxOpen)}
        bg-clip-box-close=${f(t.bgClipBoxClose)}
        icon=${f(this._getIcon(t.icon))}
        icon-size=${f(t.iconSize)}
        state-icon-size=${f(t.stateIconSize)}
        open-icon=${f(this._getIcon(t.openIcon,"bbvaExpand"))}
        close-icon=${f(this._getIcon(t.closeIcon,"bbvaCollapse"))}
        notification-badge-text=${f(t.notificationBadgeText)}
        notification-badge-accessibility-text=${f(t.notificationBadgeAccessibilityText)}
        amount=${f(t.amount)}
        amount-badge=${f(t.amountBadge)}
        amount-badge-class=${f(t.amountBadgeClass)}
        currency-code=${f(t.currencyCode)}
        local-currency=${f(t.localCurrency)}
        language=${f(t.language)}
        row-title=${e.title}
        ?title-medium=${this.titleMedium}
        @opened-changed=${this._closeAccordions}>
        <div>
          ${e.content?e.content.map((e=>h`<p>${e}</p>`)):""}
        </div>
      </bbva-expandable-accordion>
    `}static get styles(){return[G,d("bbva-expandable-accordion-list-shared-styles")]}render(){return h`
      <style>${this.constructor.shadyStyles}</style>
      ${this._list.map((e=>h`
        ${e.header?h`<bbva-list-header heading="${e.header}"></bbva-list-header>`:""}
        ${e.body?e.body.map((e=>h`${this._setExpandableItem(e)}`)):""}
      `))}
    `}}customElements.define(H.is,H);
