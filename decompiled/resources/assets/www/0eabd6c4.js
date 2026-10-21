import{z as e,ar as t,a8 as a,a9 as r,b1 as i,a as o,an as s,aJ as l,L as n,ag as c,ak as d,h as p,aV as b,f as v,g,ab as h,aa as m,bH as u,bc as y,b0 as k,b6 as $,bh as x,bI as f,i as _}from"./952f98a9.js";var S=e`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new t).mediaRules()}`;const T=new t;var D=e`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
}
${T.mediaRules()}`;const w={dark:e`
    ${i.dark}
    ${D}
  `,light:e`
    ${i.light}
    ${S}
  `},C=new t;var R=e`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${a(r.secondary200)})));
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
${C.mediaRules()}`;class z extends(o(s(l(n)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":c}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,R,d("bbva-date-shared-styles"),w.light,w.dark]}updated(e){var t,a;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=t.day||t.month||t.year;return t.hour&&t.minute&&!a?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),a=new Date(e[1]),r={...this.options};return r.month="long",[t,a].map(((e,t)=>e.toLocaleDateString(this.locale,r).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&p` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||b}get _tplDateRange(){var e;return this.isValidRange&&(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&p`
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
        `||b}render(){return p` ${this._tplDate} ${this._tplDateRange} `}}var L={...v,bbvaDate:`\n        --bbva-date-dark-mode-color: ${g("colors.primaryCoreLightened")};\n        --bbva-date-dark-mode-skeleton-quote-color: ${g("colors.cool50")};\n    `};const q=new t;var F=e`:host {
  --_title-color: var(--bbva-progress-vertical-step-title-dark-mode-color, var(--bbva-progress-vertical-step-title-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_text-color: var(--bbva-progress-vertical-step-text-dark-mode-color, var(--bbva-progress-vertical-step-text-color, var(--colorsSecondary500, ${a(r.secondary500)})));
  --_status-pending-color: var(--bbva-progress-vertical-step-pending-dark-mode-color, var(--bbva-progress-vertical-step-pending-color, var(--colorsSecondary300, ${a(r.secondary300)})));
  --_status-pending-line-color: var(--bbva-progress-vertical-step-pending-line-dark-mode-color, var(--bbva-progress-vertical-step-pending-line-color, var(--colorsSecondary300, ${a(r.secondary300)})));
  --_status-completed-color: var(--bbva-progress-vertical-step-completed-dark-mode-color, var(--bbva-progress-vertical-step-completed-color, var(--colorsTertiaryType6Dark, ${a(r.tertiaryType6Dark)})));
  --_status-completed-line-color: var(--bbva-progress-vertical-step-completed-line-dark-mode-color, var(--bbva-progress-vertical-step-completed-line-color, var(--colorsTertiaryType6Dark, ${a(r.tertiaryType6Dark)})));
  --_status-error-color: var(--bbva-progress-vertical-step-error-dark-mode-color, var(--bbva-progress-vertical-step-error-color, var(--colorsTertiaryType1Dark, ${a(r.tertiaryType1Dark)})));
  --_status-error-line-color: var(--bbva-progress-vertical-step-error-line-dark-mode-color, var(--bbva-progress-vertical-step-error-line-color, var(--colorsSecondary300, ${a(r.secondary300)})));
  --_progress-vertical-step-skeleton-quote-color: var(--bbva-progress-vertical-step-dark-mode-skeleton-color, var(--bbva-progress-vertical-step-skeleton-color, var(--colorsSecondary200, ${a(r.secondary200)})));
  --_progress-vertical-step-skeleton-quote-bg: var(--bbva-progress-vertical-step-dark-mode-skeleton-bg, var(--bbva-progress-vertical-step-skeleton-bg, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_progress-vertical-step-skeleton-animated-layer-bg: var(--bbva-progress-vertical-step-dark-mode-skeleton-animated-layer-bg, var(--bbva-progress-vertical-step-skeleton-animated-layer-bg, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
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

.steps {
  padding: var(--bbva-progress-vertical-step-steps-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1em));
  margin: 0;
}

.content {
  --_status-color: var(--_status-pending-color);
  --_status-line-color: var(--_status-pending-line-color);
  display: flex;
  position: relative;
  width: 100%;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1em);
}
.content:before {
  content: "";
  position: absolute;
  left: 0.5rem;
  top: 0.5rem;
  height: 100%;
  width: 0.0625rem;
  background: var(--_status-line-color);
}
.content:last-of-type::before {
  display: none;
}

.completed {
  --_status-color: var(--_status-completed-color);
  --_status-line-color: var(--_status-completed-line-color);
}

.error {
  --_status-color: var(--_status-error-color);
  --_status-line-color: var(--_status-error-line-color);
}

.circle {
  height: 1rem;
  width: 1rem;
  margin-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  border-radius: 50%;
  background-color: var(--_status-color);
  position: relative;
}

.middle {
  height: 0.5rem;
  width: 0.5rem;
  margin: calc(((0.5625 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
}

.main-content {
  flex: 1;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  min-width: 0;
}

.step-heading {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
}

.title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(h.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(h.medium.fontStyle)});
  color: var(--_title-color);
}

[data-tag-name=bbva-link] {
  display: inline-flex;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-text] {
  min-width: 0;
}

.text {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  color: var(--_text-color);
}

.notification, [data-tag-name=bbva-badge-default] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  height: 4.375rem;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  background-image: radial-gradient( 16px 100%, var(--_progress-vertical-step-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_progress-vertical-step-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_progress-vertical-step-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_progress-vertical-step-skeleton-quote-color) 50%);
  background-color: var(--_progress-vertical-step-skeleton-quote-bg);
  background-size: 16px 16px, calc((50% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((10% * 2) + (16px/ 2)) 16px;
  background-position: 16px 4px, 48px 4px, 48px 26px, 48px 48px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

.skeleton {
  contain: strict;
  position: absolute;
  width: 100%;
  inset: 0 0.00625rem;
  background: var(--_progress-vertical-step-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${q.mediaRules()}`;var V=e`[ambient^=light] {
  --bbva-progress-vertical-step-pending-color: initial;
  --bbva-progress-vertical-step-pending-line-color: initial;
  --bbva-progress-vertical-step-text-color: initial;
  --bbva-progress-vertical-step-title-color: initial;
  --bbva-progress-vertical-step-completed-color: initial;
  --bbva-progress-vertical-step-completed-line-color: initial;
  --bbva-progress-vertical-step-error-color: initial;
  --bbva-progress-vertical-step-error-line-color: initial;
  --bbva-form-calendar-skeleton-color: initial;
  --bbva-form-calendar-skeleton-bg: initial;
  --bbva-form-calendar-skeleton-animated-layer-bg: initial;
}
${(new t).mediaRules()}`;const E=new t;var P=e`[ambient^=dark] {
  --bbva-progress-vertical-step-pending-color: var(--colorsSecondary300, ${a(r.secondary300)});
  --bbva-progress-vertical-step-pending-line-color: var(--colorsSecondary300, ${a(r.secondary300)});
  --bbva-progress-vertical-step-text-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-progress-vertical-step-title-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-progress-vertical-step-completed-color: var(--colorsTertiaryType6, ${a(r.tertiaryType6)});
  --bbva-progress-vertical-step-completed-line-color: var(--colorsTertiaryType6, ${a(r.tertiaryType6)});
  --bbva-progress-vertical-step-error-color: var(--colorsTertiaryType1Light, ${a(r.tertiaryType1Light)});
  --bbva-progress-vertical-step-error-line-color: var(--colorsSecondary300, ${a(r.secondary300)});
  --bbva-progress-vertical-step-skeleton-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-progress-vertical-step-skeleton-bg: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-progress-vertical-step-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
}
${E.mediaRules()}`;const I={dark:e`
    ${u.dark}
    ${y.dark}
    ${k.dark}
    ${w.dark}
    ${P}
  `,light:e`
    ${u.light}
    ${y.light}
    ${k.light}
    ${w.light}
    ${V}
  `};class A extends(o(s(l(n)))){static get is(){return"bbva-progress-vertical-step"}static get scopedElements(){return{"bbva-date":z,"bbva-text":c,"bbva-link":$,"bbva-badge-default":x,"bbva-notification-help":f}}static get properties(){return{steps:{type:Array},statusText:{type:Object,attribute:"status-text"},titleEllipsis:{type:Boolean,attribute:"title-ellipsis"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},loading:{type:Boolean,reflect:!0},titleTag:{type:String,reflect:!0},descriptionSize:{type:String,reflect:!0},titleSize:{type:String,reflect:!0}}}static get styles(){return[super.styles,F,I.dark,I.light,d("bbva-progress-vertical-step-shared-styles")]}constructor(){super(),this.steps=[],this.statusText={completed:"bbva-progress-vertical-step-completed",pending:"bbva-progress-vertical-step-pending",error:"bbva-progress-vertical-step-error"},this.loading=!1,this.titleTag="h3",this.descriptionSize="S",this.titleSize="M",this.disabledTabindex=!0}_linkClicked(e){this.dispatchEvent(new CustomEvent("progress-vertical-step-link-click",{bubbles:!0,composed:!0,detail:e}))}_subtitleTemplate(e){return p` ${Array.isArray(e)?e.map((e=>p` <bbva-text
            class="text"
            size="${this.descriptionSize}"
            ellipsis="${_(this.descriptionEllipsis)}"
            text="${e}"
            tag="p"
            unset
          ></bbva-text>`)):p`
          <bbva-text
            class="text"
            size="${this.descriptionSize}"
            ellipsis="${_(this.descriptionEllipsis)}"
            text="${e}"
            tag="p"
            unset
          ></bbva-text>
        `}`}_stepContent(e){return p`
      <div class="step-heading">
        ${e.title?p`
              <bbva-text
                text="${e.title}"
                size="${this.titleSize}"
                ellipsis="${_(this.titleEllipsis)}"
                class="title"
                tag="${this.titleTag}"
                unset
              ></bbva-text>
            `:""}
        ${e.linkText?p`
              <bbva-link
                @click="${()=>this._linkClicked(e)}"
                href="${_(e.link)}"
                target="${_(e.target)}"
                icon="${_(e.linkIcon)}"
                ><span>${e.linkText}<span>
              </bbva-link>
            `:""}
      </div>
      ${e.date?p`<bbva-date date="${e.date}"></bbva-date>`:""}
      ${e.subtitle?p` <bbva-badge-default
            text="${e.subtitle}"
            type="${e.badgeStatus}"
          ></bbva-badge-default>`:""}
      ${e.content?this._subtitleTemplate(e.content):""}
      ${e.notificationText&&e.notificationIcon?p`
            <bbva-notification-help
              disabled-tabindex
              icon="${_(e.notificationIcon)}"
              class="notification ${_(e.notificationType)}"
              text="${_(e.notificationText)}"
              hide-top-padding
              hide-right-padding
              hide-bottom-padding
              hide-left-padding
            ></bbva-notification-help>
          `:""}
    `}_middleTitleContent(e){return p`
      <div class="step-heading">
        ${e.title?p`
              <bbva-text
                text="${e.title}"
                size="${this.titleSize}"
                ellipsis="${_(this.titleEllipsis)}"
                class="title"
                tag="${this.titleTag}"
                unset
              ></bbva-text>
            `:""}
        ${e.linkText?p`
              <bbva-link
                @click="${()=>this._linkClicked(e)}"
                href="${_(e.link)}"
                target="${_(e.target)}"
                icon="${_(e.linkIcon)}"
                ><span>${e.linkText}<span>
              </bbva-link>
            `:""}
      </div>
      ${e.subtitle?p` <bbva-badge-default
            text="${e.subtitle}"
            type="${e.badgeStatus}"
          ></bbva-badge-default>`:""}
    `}_middleInfoContent(e){return p`
      ${e.date?p`<bbva-date date="${e.date}"></bbva-date>`:""}
      ${e.content?this._subtitleTemplate(e.content):""}
    `}render(){return p`${this.loading?p` <div class="skeleton"></div> `:p`
          <div
            role="group"
            aria-label="${this.t("bbva-progress-vertical-label-accessibility-text")}"
          >
            <ol class="steps">
              ${this.steps.map((e=>e.middle?p`
                      <li class="content ${e.status}">
                        <span class="sr-only">${this.t(this.statusText[e.status])}</span>
                        <span class="circle" aria-hidden="true"></span>
                        <div class="main-content">${this._middleTitleContent(e)}</div>
                      </li>
                      <li class="content ${e.status}">
                        <span class="sr-only">${this.t(this.statusText[e.status])}</span>
                        <span class="circle middle" aria-hidden="true"></span>
                        <div class="main-content">${this._middleInfoContent(e)}</div>
                      </li>
                    `:p`
                      <li class="content ${e.status}">
                        <span class="sr-only">${this.t(this.statusText[e.status])}</span>
                        <span class="circle" aria-hidden="true"></span>
                        <div class="main-content">${this._stepContent(e)}</div>
                      </li>
                    `))}
            </ol>
          </div>
        `}`}}export{A as B,L as b};
